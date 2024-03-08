package translating


import Parsers.SpecificationsNeueParser._

import boogie._
import specification._
import util.Logger
import ir._

import scala.collection.mutable.Stack
import scala.collection.mutable.ArrayBuffer
import scala.jdk.CollectionConverters._
import scala.collection.mutable.Buffer
import scala.collection.mutable.HashMap

import analysis.evaluateExpression

// take symbol table entries as input
// parse all global defs and check sizes
// use these new nameToGlobals going forward when parsing the rest of the spec

//case class SpecificationInfo(variables: Set[Variable]) 


class TypeError(msg: String) extends Exception(msg)


sealed trait SExpr:
  def satisfies(o: SExpr) : Boolean
  def getType: SType
  def toSList : SSExpr.SList 
  def toExpr: Option[Expr]

enum SType:
  case Top 
  case Bot
  case Symbol
  case Val(t: IRType)
  case NumberVal
  case MapVal
  case SList(typs: List[SType])
  case SStruct(fields: List[(String, SType)]) // note that any struct satisfies SStruct(List.empty)
  case Fun(args: SSExpr.SList, ret: SType)

  def satisfies(o: SType) : Boolean = {
    // this satisfies o
    // o :>  this
    ((o, this) match {
      case (Bot, _) => false
      case (Top, _) => true
      case (NumberVal, Val(b: BitVecType))  => true
      case (NumberVal, Val(IntType)) => true
      case (MapVal, Val(b: MapType)) => true
      // Any list is compatible with any other list, we dont consider number or type of list elements, for that purpose we have struct.
      case (SList(a), SList(b)) => true
      //case (SList(a), SStruct(b)) => b.size >= a.size && a.indices.forall(i => a(i) == b(i)._2)   // coercible not compatible
      //case (SStruct(a), SList(b)) => b.size >= a.size && a.indices.forall(i => a(i)._2 == b(i))  
      // Structs b <: a if all fields in b are in a, and have compatible types
      case (SStruct(a), SStruct(b)) => b.size >= a.size && a.indices.forall(i => a(i)._1 == b(i)._1 && (b(i)._2.satisfies(a(i)._2)))  
      case (a, b) => a == b
    })
}


enum SSExpr(typ: SType) extends SExpr:
  case SVariable(name: String, typ: SType) extends SSExpr(typ)
  case Val(e: Expr) extends SSExpr(SType.Val(e.getType))
  case SList(e: List[SExpr]) extends SSExpr(SType.SList(e.map(_.getType)))
  case SStruct(e: List[(String, SExpr)]) extends SSExpr(SType.SStruct(e.map((k,v) => (k , v.getType))))
  case SFunc(name: String, args: List[(String, SType)], ret: SType, body: Option[SExpr]) extends SSExpr(SType.Top)
  case SApply(fun: SFunc, args: SList) extends SSExpr(fun.ret)
  case SIndirApply(fun: SExpr, args: SList) extends SSExpr(fun match 
    case f: SFunc => f.ret
    case _ => SType.Top
    )
  case SFieldAccess(struct: SExpr, field: String) extends SSExpr(struct match 
    case s: SStruct => s.e.find(_._1 == field).get._2.getType
    case _ => SType.Top)


  override def getType: SType = typ

  /**
   * this :< o
   */
  override def satisfies(o: SExpr) : Boolean = {
    o.getType.satisfies(typ)
  }


  override def toExpr: Option[Expr] = {
    this match {
      case Val(e) => Some(e)
      case SList(Val(e) :: Nil) => Some(e)
      case SVariable(name, typ) => Some(LocalVar(name, BitVecType(64)))
      case _ => None
    }
  }

  override def toSList : SList = {
    this match {
      case s: SList => s
      case s: SStruct => SList(s.e.map(_._2))
      case o => SList(List(o)) 
    }
  }

  def eval(o: SExpr): SExpr = {
    val bindings = Stack[Map[String, SExpr]]()

    def lookupBinding(n: String) : Option[SExpr]= {
      val it = bindings.reverseIterator
      var term = false
      var res : Option[SExpr] = None
      while (!term && it.hasNext) {
        val next = it.next
        if (next.contains(n)) {
          term = true
          res = next.get(n)
        }
      }
      res
    }


    o match {
      case Val(e) => {
        println(s"val $bindings")
        val replacer = VariableReplacer(bindings.flatMap(_.flatMap((k: String, v: SExpr) => v.toExpr.map(k -> _))).toMap)
        Val(replacer.visitExpr(e))
      } 
      case SVariable(n, v) => lookupBinding(n) match {
        case Some(e) => e
        case None => throw Exception(s"Referenceing unbound variable $n")
      } 
      case SList(e) => SList(e.map(eval))
      case SStruct(e) => {
        // Each successively defined field in the struct gets bound, so can be referred to 
        // in later terms. 
        //
        // This is similar to a regular variable definition in an expression/statement
        // let x = blah in
        // let y = x + 1 in 
        //  ...
        //
        //  These are available only for subexpressions of the struct. 
        val evaled = HashMap[String, SExpr]()
        for ((name, value) <- e) {
          println(s"str $bindings")
          val res = eval(value)
          evaled(name) = res
          bindings.push(Map(name -> res))
        }
        for ((name, value) <- e) {
          bindings.pop()
        }
        SStruct(e.map(i => (i._1, evaled(i._1))))
      }
      case f : SFunc => f
      case SApply(fun, args) => {
        fun.body match {
          case None => SApply(fun, eval(args).toSList)
          case Some(body) => {
            // evaluate arguments, bind them to parameter variables, evaluate body, replace the call with the body
            val bs = args.e.indices.map(i => (fun.args(i)._1 -> eval(args.e(i)))).toMap

            val funparamtypes = SStruct(bs.toList).getType
            val argumetypes = SType.SStruct(fun.args)

            if (!(argumetypes.satisfies(funparamtypes))) {
              throw TypeError(s"Function call type mismatch: $argumetypes does not satisfy $funparamtypes")
            }
            bindings.push(bs)
            val nb = eval(body)
            bindings.pop()
            nb
          }
        }
        Val(FalseLiteral)
      }
      case SIndirApply(f, args) => {
        eval(f) match {
          case s: SFunc => eval(SApply(s, args))
          case _ => throw TypeError(s"Expression does not evaluate to a function, cannot apply non-function.")
        }
      }
      case SFieldAccess(s, field) => {
        eval(s) match {
          case SStruct(e) => e.find(_._1 == field).get._2
          case _ => throw TypeError("Cannot access field of non-struct.")
        }
      }
  }

}

import SSExpr._



class BindingsStack {
  val variableBindings : ArrayBuffer[Map[String, Expr]] = ArrayBuffer.empty

  var globalsDisallowed = 0

  def enterPureLocalScope() : Unit = {
    globalsDisallowed += 1
  }

  def leavePureLocalScope() : Unit = {
   require(globalsDisallowed > 0)
    globalsDisallowed -= 1
  }

  def canReferenceGlobals: Boolean = globalsDisallowed == 0


  def push(x: Map[String, Expr]) = variableBindings.append(x)
  def pop() = variableBindings.remove(variableBindings.length - 1)

  def resolve(name: String) : Option[Expr] = {
    def findres(s: String, pos: Int = 0) = {
      var res: Option[Expr] = None
      var ind = variableBindings.length - 1 
      while (ind >= 0 && res == None) {
        res = variableBindings(ind).get(s) match  {
          case Some(s) if !canReferenceGlobals && s.variables.exists(p => p.scope == Scope.Global) 
            => throw Exception(s"Cannot reference global $name in pure local context.")
          case x => x
        }

        ind -= 1
      }
      res
    }

    findres(name)
  }

}

//case class MacroDef(name: String, params: List[(String, SType)], body: Expr) {
//
//  def toFunction() = {
//
//  }
//
//  def apply(args: List[SElem]) = {
//    assert(SList(args).satisfies(params.map(_._2)))
//
//
//  }
//
//}
//
//object builtinFuns:
//  // these are prelude scope function definitions
//  def load(l: SList) = {
//    assert(l.implements(List(MapType(BitVecType(64), BitVecType(8)), BitVecType(64), BitVecType(64))))
//
//  }
//  def store(l: SList) = {
//    assert(l.implements(List(MapType(BitVecType(64), BitVecType(8)), BitVecType(64), BitVecType(64), SType.Expr)))
//  }

case class NewSpecificationLoader(symbols: Set[Variable], globals: Set[SpecGlobal], program: Program) {

  val mem = Memory("mem", 64, 8)
  //private val idToSymbol = symbols.map(g => (g.name, g)).toMap ++ globals.map(g => g.name -> MemoryLoad(mem, LocalVar("$" + g.name  + "_addr", BitVecType(64)), Endian.LittleEndian, g.size))
  private val idToSymbol = symbols.map(g => (g.name, g)).toMap ++ globals.map(g => g.name -> LocalVar("$" + g.name  + "_addr", BitVecType(64)))

  private val idToSymbolNew = symbols.map(g => (g.name, Val(g))).toMap 
  ++ globals.map(g => g.name -> SSExpr.SStruct(List(("region" , Val(mem) ), ("base" , Val(LocalVar("$" + g.name  + "_addr", BitVecType(64)))), ("size" , Val(BitVecLiteral(g.size,64))))))

  val nameToGlobals: Map[String, Variable] = symbols.map(s => s.name -> s).toMap
  val nameToSpecGlobal: Map[String, SpecGlobal] = globals.map(s => s.name -> s).toMap
  val variableBindings = BindingsStack()



  def visitSpecification(ctx: SpecTopLevelContext): Specification = {
    val spec = visitSpecTopLevel(ctx)
    spec
  }


  def visitSpecTopLevel(ctx: SpecTopLevelContext) = {
    // construct an SStruct 

    variableBindings.push(Map("mem" -> mem))
    variableBindings.push(idToSymbol)

    val spec = visitStructExpr(ctx.sstruct)
    val evaled = spec.eval(spec)

    println(s"$evaled")


    val mapped = evaled match {
      case SStruct(e) => e.toMap
      case _ => throw Exception("Unreachable.")
    }

    def getProcedureSpec(name: String, mapped: Map[String, SExpr]) : SubroutineSpec = {
      // all this should be validated via type-checking first. 
      val relies = mapped.get("relies").map(_.toExpr.get).getOrElse(FalseLiteral)
      val guarantees = mapped.get("guarantees").map(_.toExpr.get).getOrElse(FalseLiteral)
      val requires = mapped.get("requires").map(_.toExpr.get).getOrElse(FalseLiteral)
      val ensures = mapped.get("ensures").map(_.toExpr.get).getOrElse(FalseLiteral)
      val mods = mapped.get("modifies").toList.collect(_ match {
        case SList(e) => e.map(_ match {
          case Val(v : Variable) => v.name
          case _ => throw TypeError("non-variable modifies clause")
        })
        case _ => throw TypeError("Mods must be a slist")
      }).flatten

      SubroutineSpecinfo(name, relies, guarantees, mods, requires, ensures).toProcSpec
    }

    val relies = mapped.get("relies")
    val guarantees = mapped.get("guarantees")
    val lpreds = mapped.get("L")

    val procedures = mapped.get("procedures").map(procdefs => procdefs match {
      case SStruct(e) => e.map((procname, procspec) => procspec match {
        case SStruct(s) => getProcedureSpec(procname, s.toMap)
        case _ => throw TypeError("Procedures should be map.")
      })
      case _ => throw TypeError("Procedures should be map.")
    })




    //val relies = ctx.relies.asScala.map(visitRelies)
    //val guarantees = ctx.guarantees.asScala.map(visitGuarantees)
    //val procedures = ctx.procedure.asScala.map(visitProcedure)
    //val lpreds = ctx.lPreds.asScala.flatMap(visitLPreds)

    variableBindings.pop()
    variableBindings.pop()
    // Specification(globals, lpreds.map((k,v) => nameToSpecGlobal(k) -> v.toBoogie).toMap, relies.map(_.toBoogie).toList, guarantees.map(_.toBoogie).toList, procedures.map(_.toProcSpec).toList, Set.empty)
    Specification(Set.empty, Map.empty, List.empty, List.empty, List.empty, Set.empty)
  }

  //def visitLPreds(ctx: LPredsContext) : Map[String, Expr] = {
  //  variableBindings.enterPureLocalScope()
  //  val r = ctx.lPred.asScala.map((lp: LPredContext) => (lp.ident.getText -> visitExpr(lp.expr))).toMap
  //  variableBindings.leavePureLocalScope()
  //  r
  //}


  def andAll(el: Iterable[Expr]) = {
    el.toList match {
      case Nil => FalseLiteral
      case x :: Nil => x
      case x :: xs =>  xs.foldLeft(x)((a: Expr, b: Expr) => BinaryExpr(BoolAND, a, b))
    }
  }

  /**
   * Convert a comma separated list that represents a conjunction of expressions, 
   * to a single expression. 
  def visitConjunctExprList(ctx:Conjunct_expr_listContext) : Expr = {
    andAll(ctx.expr.asScala.map(visitExpr(_, Map.empty)).toList)
  }
   */



  case class SubroutineSpecinfo(name: String, relies: Expr, guarantees: Expr, mods: List[String], requires: Expr, ensures: Expr) {
    def toProcSpec = SubroutineSpec(
        name,
        List(relies.toBoogie),
        List.empty,
         List(ensures.toBoogie), 
         List.empty,
         mods.toList,
         List(relies.toBoogie),
         List(guarantees.toBoogie)
    )
  }

  def visitTypeName(ctx: BoogieTypeNameContext) : IRType = {
    ctx match {
      case bv: BvBTypeContext => BitVecType(Integer.parseInt(bv.getText.stripPrefix("bv")))
      case i: IntBTypeContext => IntType
      case b: BoolBTypeContext => BoolType
      case mapT: MapBTypeContext => MapType(visitTypeName(mapT.keyT), visitTypeName(mapT.valT))
    }
  }

  /**
   * We do one pass over the ast to load the IR expression language. 
   * For SExpressions, we create a temporary variable and bind the sexpr to that variable, returning the variable. 
   *
   * In the second evaluation pass these sexpressions are resolved into IR expressions, and are substituted 
   * back for the temporary variable. 
   */
  var tempCount = 0
  val temporaries = HashMap[Variable, SExpr]()

  /*
   * Visit an expression and construct an IR expression where possible. 
   */
  def visitExprOpt(
      ctx: ExprContext,
      params: Map[String, Parameter] = Map()
  ): Option[Expr] = {
    ctx match {
      case c : EquivExprContext => Some(visitEquivExpr(c))
      case c : LogicalExprContext => Some(visitLogicalExpr(c))
      case c : RelExprContext => Some(visitRelExpr(c))
      case c : ArithExprContext => Some(visitArithExpr(c))
      case c : MathExprContext => Some(visitMathExpr(c))
      case c : UnexpContext => Some(visitUnaryExpr(c.unaryExpr, nameToGlobals, params))
      case c : SliceExprContext => None 
      case c : AccessRangeExprContext => None 
      case c : FieldAccessExprContext => None 
      case c : SexprApplyContext => None
      case c : StructExprContext => None
      case c : ListExprContext => None
    }
  }


  def visitExpr(
      ctx: ExprContext,
      params: Map[String, Parameter] = Map()
  ): Expr = {
    visitExprOpt(ctx, params) match {
      case Some(s) => s
      case None => {
        // we will come past and re-substitute the evaluated sexp at eval time
        val sr = visitSExpr(ctx)
        sr.toExpr match {
          case Some(e) => e
          case None => {
            val variable = LocalVar(s"temp_$tempCount", BitVecType(-1))
            temporaries(variable) = sr
            println(s"Create temp $variable -> ${temporaries(variable)}")
            tempCount += 1
            variable
          }
        }
      }
    }
  }


  /**
   * Visit an expression and return an S expression; wrapping ir expressions in Val. 
   */
  def visitSExpr(ctx: ExprContext): SExpr = {
      visitExprOpt(ctx) match {
        case Some(s) => Val(s)
        case None => ctx match {
          case c : SliceExprContext => Val(FalseLiteral)
          case c : AccessRangeExprContext => Val(FalseLiteral)
          case c : FieldAccessExprContext => visitFieldAccess(c)
          case c : SexprApplyContext => visitApplyExpr(c)
          case c : StructExprContext => visitStructExpr(c.sstruct)
          case c : ListExprContext => visitListExpr(c.slist)
        }
    }
  }

  val accessRangeFunc = SFunc("arrayslice", List(("base", SType.NumberVal), ("size", SType.NumberVal)), SType.NumberVal, None)
  val accessCellFunc = SFunc("get", List(("base", SType.NumberVal)), SType.NumberVal, None)
  val bitvecSliceFunc = SFunc("slice", List(("begin", SType.NumberVal), ("end", SType.NumberVal)), SType.NumberVal, None)
  val binopfun = SFunc("binop", List(("op", SType.Symbol), ("left", SType.Top), ("right", SType.Top)), SType.Top, None)
  val unopfun = SFunc("unop", List(("op", SType.Symbol), ("arg", SType.Top)), SType.Top, None)
  val predfun = SFunc("forall", List(("binds", SType.SStruct(List.empty)), ("arg", SType.Top)), SType.Top, None)


  def visitEquivExpr(ctx: EquivExprContext): Expr = {
     ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(BoolEQUIV, l, visitExpr(r)))
  }

  def visitLogicalExpr(ctx: LogicalExprContext) = {
     ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitLogOp(ctx.op), l, visitExpr(r)))
  }


  def visitArithExpr(ctx: ArithExprContext) = {
     ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitAddSubOp(ctx.op), l, visitExpr(r)))
  }

  def visitMathExpr(ctx: MathExprContext) = {
     ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitMulDivModOp(ctx.op), l, visitExpr(r)))
  }

  def visitSliceExpr(ctx: SliceExprContext) = {
  }

  def visitFieldAccess(ctx: FieldAccessExprContext) : SFieldAccess = {
    SFieldAccess(visitSExpr(ctx.arg1), ctx.field.getText)
  }

  def visitStructExpr(ctx: SstructContext) : SStruct = {
    SStruct(ctx.sexpdef.asScala.map(d => (d.ident.getText, visitSExpr(d.expr))).toList)
  }

  def visitListExpr(ctx: SlistContext) : SList = {
    SList(ctx.expr.asScala.map(visitSExpr).toList)
  }

  def visitApplyExpr(ctx: SexprApplyContext) : SExpr = {
    SIndirApply(visitSExpr(ctx.expr), visitListExpr(ctx.slist))
  }

  def visitRelExpr(ctx: RelExprContext) = {
     ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => {
      val left = l
      val right = visitExpr(r)

      val op = (left.getType) match {
        case BoolType => visitBoolRelOp(ctx.op)
        case IntType => visitIntRelOp(ctx.op)
        case _: BitVecType => visitRelOp(ctx.op)
        case _ => throw TypeError("Cannot have BinOp for map type")
      }

      BinaryExpr(op, left, right)
     })
  }

  def visitUnaryExpr(
      ctx: UnaryExprContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): Expr = ctx match {
    case n: NegExprContext       => UnaryExpr(BVNEG, visitUnaryExpr(n.unaryExpr, nameToGlobals, params))
    case a: AtomUnaryExprContext => visitAtomExpr(a.atomExpr, nameToGlobals, params)
    case n: NotExprContext       => UnaryExpr(BoolNOT, visitUnaryExpr(n.unaryExpr, nameToGlobals, params))
  }

  def visitIfThenElseExpr(c: IfThenElseExprContext) = {
    val g : Expr = visitExpr(c.guard)
    assert(g.getType == BoolType) // condition guard must be a boolean
    IfThenElse(g, visitExpr(c.thenExpr), visitExpr(c.elseExpr))
  }

  def visitFunExpr(c: FunExprContext) = {
      val body = c.name.getText.stripPrefix("bv")
      val sizeText = body.replaceAll("\\D+","")
      val size = Integer.parseInt(sizeText)
      val op = body.stripSuffix(sizeText)
      val outOp = op match {
        case   "and"  => BVAND 	
        case   "or"   => BVOR 	  
        case   "add"  => BVADD 	
        case   "mul"  => BVMUL 	
        case   "udiv" => BVUDIV 	
        case   "urem" => BVUREM 	
        case   "shl"  => BVSHL 	
        case   "lshr" => BVLSHR 	
        case   "ult"  => BVULT 	
        case   "nand" => BVNAND 	
        case   "nor"  => BVNOR 	
        case   "xor"  => BVXOR 	
        case   "xnor" => BVXNOR 	
        case   "comp" => BVCOMP 	
        case   "sub"  => BVSUB 	
        case   "sdiv" => BVSDIV 	
        case   "srem" => BVSREM 	
        case   "smod" => BVSMOD 	
        case   "ashr" => BVASHR 	
        case   "ule"  => BVULE 	
        case   "ugt"  => BVUGT 	
        case   "uge"  => BVUGE 	
        case   "slt"  => BVSLT 	
        case   "sle"  => BVSLE 	
        case   "sgt"  => BVSGT 	
        case   "sge"  => BVSGE 	
      }

      val args = c.args.expr.asScala.map(visitExpr(_, Map.empty)).toList
      assert(args.length == 2)
      BinaryExpr(outOp, args(0), args(1))
  }

  def visitAtomExpr(
      ctx: AtomExprContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): Expr = ctx match {
      case b: BoolLitExprContext     => visitBoolLit(b.boolLit)
      case b: BvExprContext          => visitBv(b.bv)
      case i: NatExprContext => visitNat(i.nat)
      case i: IdExprContext          => visitId(i.ident)
      //case a: ArrayAccessExprContext => visitArrayAccess(a.arrayAccess) 
      //case a : LoadSliceExprContext => visitLoadSlice(a.loadSlice)
      case o: OldExprContext => OldExpr(visitExpr(o.expr))
      case p: ParenExprContext       => ParenExpr(visitExpr(p.expr, params))
      case ite: IfThenElseExprContext => visitIfThenElseExpr(ite) 
      case c: FunExprContext => visitFunExpr(c)
      case c: PredicateExprContext => visitPredicateExpr(c.predicate)
  }


  def visitBv(ctx: BvContext): BitVecLiteral = {
    BitVecLiteral(BigInt(ctx.value.getText), Integer.parseInt(ctx.BVSIZE.getText.stripPrefix("bv")))
  }

  def visitNat(ctx: NatContext): IntLiteral = IntLiteral(BigInt(ctx.getText))

  def visitBoolLit(ctx: BoolLitContext): BoolLit = ctx.getText match {
    case "true"  => TrueLiteral
    case "false" => FalseLiteral
  }

  def visitPredicateExpr(ctx: PredicateContext) = {
      val bound = ctx.bound.typed_variable.asScala.map(b => LocalVar(b.name.getText, visitTypeName(b.btype)))

      variableBindings.push(bound.map(b => b.name -> b).toMap)
      val body = visitExpr(ctx.body)
      variableBindings.pop()

      ctx.q.getText() match 
        case "forall" => ForAll(bound.toList, body)
        case "exists" => Exists(bound.toList, body)
        case _ => ???
  }

  def visitId(ctx: IdentContext): Expr = {
    /**
     * TODO
     *
     * - Resolve every type of ident using scoping roles
     *   - global variables (from relf)
     *   - registers
     *   - function parameters
     *   - local variables
     */
    val id = ctx.getText

      variableBindings.resolve(id.stripPrefix("Gamma_")) match
        case Some(x) if id.startsWith("Gamma_") => LocalVar(id, BoolType)
        case Some(x) => x
        case None => LocalVar(id, BitVecType(-1))
  }

  def visitMulDivModOp(ctx: MulDivModOpContext): BVBinOp = ctx.getText match {
    case "*"   => BVMUL
    case "div" => BVSDIV
    case "mod" => BVSMOD
  }

  def visitLogOp(ctx: LogOpContext): BoolBinOp = ctx.getText match {
    case "==>"   => BoolIMPLIES 
    case "<==>" =>BoolEQUIV 
    case "||" => BoolOR 
    case "&&" => BoolAND 
  }


  def visitAddSubOp(ctx: AddSubOpContext): BVBinOp = ctx.getText match {
    case "+" => BVADD
    case "-" => BVSUB
  }

  // may need to make this more sophisticated and check for bool == bool
  def visitRelOp(ctx: RelOpContext): BVBinOp = ctx.getText match {
    case "==" => BVEQ
    case "!=" => BVNEQ
    case ">"  => BVSGT
    case ">=" => BVSGE
    case "<"  => BVSLT
    case "<=" => BVSLE
  }

  def visitIntRelOp(ctx: RelOpContext): IntBinOp = ctx.getText match {
    case "==" => IntEQ
    case "!=" => IntNEQ
    case ">"  => IntGT
    case ">=" => IntGE 
    case "<"  => IntLT 
    case "<=" => IntLE
  }


  def visitBoolRelOp(ctx: RelOpContext): BoolBinOp = ctx.getText match {
    case "==" => BoolEQ 
    case "!=" => BoolNEQ
  }


}
