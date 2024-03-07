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

sealed trait SExpr:
  def satisfies(o: SExpr) : Boolean
  def getType: SType
  def toSList : SSExpr.SList 
  def toExpr: Option[Expr]

enum SType:
  case Top 
  case Bot
  case Symbol
  case Val
  case SList(typs: List[SType])
  case SStruct(fields: List[(String, SType)])
  case Fun(args: SSExpr.SList, ret: SType)

enum SSExpr(typ: SType) extends SExpr:
  case SVariable(name: String, typ: SType) extends SSExpr(typ)
  case Val(e: Expr) extends SSExpr(SType.Val)
  case SList(e: List[SExpr]) extends SSExpr(SType.SList(e.map(_.getType)))
  case SStruct(e: List[(String, SExpr)]) extends SSExpr(SType.SStruct(e.map((k,v) => (k , v.getType))))
  case SFunc(name: String, args: List[(String, SType)], ret: SType, body: Option[SExpr]) extends SSExpr(SType.Top)
  case SApply(fun: SFunc, args: SList) extends SSExpr(fun.ret)
  case SIndirApply(fun: SExpr, args: SList) extends SSExpr(SType.Top)


  override def getType: SType = typ

  /**
   * this :< o
   */
  override def satisfies(o: SExpr) : Boolean = {
    (this, o) match 
      // case (Symbol(a), Symbol(b)) => true
      case (Val(a), Val(b)) => a.getType == b.getType
      case (SList(a), SList(b)) => {
        (a.length == b.length) &&
        a.indices.forall(i => a(i).satisfies(b(i)))
      }
      case (SStruct(a), SStruct(b)) => {
        a.size == b.size
        && a.indices.forall(i => a(i)._1 == b(i)._1 && a(i)._2.satisfies(b(i)._2))
      }
      case _ => false
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
        val replacer = VariableReplacer(bindings.flatMap(_.flatMap((k: String, v: SExpr) => v.toExpr.map(k -> _))).toMap)
        Val(replacer.visitExpr(e))
      } 
      case SVariable(n, v) => lookupBinding(n) match {
        case Some(e) => e
        case None => throw Exception(s"Referenceing unbound variable $n")
      } 
      case SList(e) => SList(e.map(eval))
      case SStruct(e) => {
        val evaled = HashMap[String, SExpr]()
        for ((name, value) <- e) {
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
            val bs = args.e.indices.map(i => (fun.args(i)._1 -> eval(args.e(i)))).toMap
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
          case _ => throw Exception(s"Expression does not evaluate to a function, cannot apply non-function.")
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

    //val relies = ctx.relies.asScala.map(visitRelies)
    //val guarantees = ctx.guarantees.asScala.map(visitGuarantees)
    //val procedures = ctx.procedure.asScala.map(visitProcedure)
    //val blocks = ctx.block.asScala.map(visitBlock)
    //val lpreds = ctx.lPreds.asScala.flatMap(visitLPreds)

    variableBindings.pop()
    variableBindings.pop()
    // Specification(globals, lpreds.map((k,v) => nameToSpecGlobal(k) -> v.toBoogie).toMap, relies.map(_.toBoogie).toList, guarantees.map(_.toBoogie).toList, procedures.map(_.toProcSpec).toList, Set.empty)
    Specification(Set.empty, Map.empty, List.empty, List.empty, List.empty, Set.empty)
  }

  def visitLPreds(ctx: LPredsContext) : Map[String, Expr] = {
    variableBindings.enterPureLocalScope()
    val r = ctx.lPred.asScala.map((lp: LPredContext) => (lp.ident.getText -> visitExpr(lp.expr))).toMap
    variableBindings.leavePureLocalScope()
    r
  }


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
   */
  def visitConjunctExprList(ctx:Conjunct_expr_listContext) : Expr = {
    andAll(ctx.expr.asScala.map(visitExpr(_, Map.empty)).toList)
  }



  case class SubroutineSpecinfo(name: String, relies: Expr, guarantees: Expr, mods: Buffer[String], requires: Expr, ensures: Expr) {
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

  // def sVisitProcedure(ctx: ProcedureContext) = {
  //   val name = ctx.ident.getText
  //   val relies: Expr = andAll(ctx.relies.asScala.map(visitRelies))
  //   val guarantees: Expr = andAll(ctx.guarantees.asScala.map(visitGuarantees))
  //   val mods = (ctx.modifies.asScala.flatMap(c => c.ident.asScala.map(_.getText)))
  //   val requries: Expr = andAll(ctx.requires.asScala.map(visitRequires))
  //   val ensures: Expr = andAll(ctx.ensures.asScala.map(visitEnsures))

  //   SList(
  //     List(Symbol("procedure"),
  //     Symbol(name), (SStruct(Map(
  //       "relies" -> Val(relies),
  //       "guarantees" -> Val(guarantees),
  //       "modifies" -> SList(mods.map(Symbol(_)).toList),
  //       "requires" -> Val(requries),
  //       "ensures" -> Val(ensures)
  //     )))))
  // }

  //def visitProcedure(ctx: ProcedureContext) : SubroutineSpecinfo = {
  //  val name = ctx.ident.getText
  //  val relies: Expr = andAll(ctx.relies.asScala.map(visitRelies))
  //  val guarantees: Expr = andAll(ctx.guarantees.asScala.map(visitGuarantees))
  //  val mods = (ctx.modifies.asScala.flatMap(c => c.ident.asScala.map(_.getText)))
  //  val requries: Expr = andAll(ctx.requires.asScala.map(visitRequires))
  //  val ensures: Expr = andAll(ctx.ensures.asScala.map(visitEnsures))
  //  SubroutineSpecinfo(name, relies, guarantees, mods, requries, ensures)
  //}

  //def visitBlock(ctx: BlockContext) = {

  //}


  def visitTypeName(ctx: BoogieTypeNameContext) : IRType = {
    ctx match {
      case bv: BvBTypeContext => BitVecType(Integer.parseInt(bv.getText.stripPrefix("bv")))
      case i: IntBTypeContext => IntType
      case b: BoolBTypeContext => BoolType
      case mapT: MapBTypeContext => MapType(visitTypeName(mapT.keyT), visitTypeName(mapT.valT))
    }
  }

  def visitExpr(
      ctx: ExprContext,
      params: Map[String, Parameter] = Map()
  ): Expr = {
    ctx match {
      case c : EquivExprContext => visitEquivExpr(c)
      case c : LogicalExprContext => visitLogicalExpr(c)
      case c : RelExprContext => visitRelExpr(c)
      case c : ArithExprContext => visitArithExpr(c)
      case c : MathExprContext => visitMathExpr(c) 
      case c : SliceExprContext => FalseLiteral 
      case c : AccessExprContext => FalseLiteral 
      case c : UnexpContext => visitUnaryExpr(c.unaryExpr, nameToGlobals, params)
    }

    FalseLiteral
  }

  def visitEquivExpr(ctx: EquivExprContext): Expr = {
     ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(BoolEQUIV, l, visitExpr(r)))
  }

  def visitLogicalExpr(ctx: LogicalExprContext) = {
     ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitLogOp(ctx.op), l, visitExpr(r)))
  }

  def visitRelExpr(ctx: RelExprContext) = {
     ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitRelOp(ctx.op), l, visitExpr(r)))
  }

  def visitArithExpr(ctx: ArithExprContext) = {
     ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitAddSubOp(ctx.op), l, visitExpr(r)))
  }

  def visitMathExpr(ctx: MathExprContext) = {
     ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitMulDivModOp(ctx.op), l, visitExpr(r)))
  }

  def visitSliceExpr(ctx: SliceExprContext) = {

  }



  //def visitImpliesExpr(
  //    ctx: ImpliesExprContext,
  //    nameToGlobals: Map[String, Variable],
  //    params: Map[String, Parameter] = Map()
  //): Expr = Option(ctx.arg2) match {
  //  case Some(_) =>
  //    BinaryExpr(
  //      BoolIMPLIES,
  //      visitLogicalExpr(ctx.arg1, nameToGlobals, params),
  //      visitImpliesExpr(ctx.arg2, nameToGlobals, params)
  //    )
  //  case None => visitLogicalExpr(ctx.arg1, nameToGlobals, params)
  //}

  def visitLogicalExpr(
      ctx: LogicalExprContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): Expr = {
    //val rels = ctx.expr.asScala.map(r => visitRelExpr(r, nameToGlobals, params))
    //if (rels.size > 1) {
    //  val op = if (ctx.AND_OP.size > 0) {
    //    BoolAND
    //  } else {
    //    BoolOR
    //  }
    //  rels.tail.foldLeft(rels.head)((opExpr: Expr, next: Expr) => BinaryExpr(op, opExpr, next))
    //} else {
    //  rels.head
    //}
    FalseLiteral
  }

  def visitRelExpr(
      ctx: RelExprContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): Expr = Option(ctx.arg2) match {
    case Some(_) =>
      BinaryExpr(
        visitRelOp(ctx.op),
        visitExpr(ctx.arg1,params),
        visitExpr(ctx.arg2,params)
      )
    case None => visitExpr(ctx.arg1, params)
  }

  //def visitTerm(
  //    ctx: TermContext,
  //    nameToGlobals: Map[String, Variable],
  //    params: Map[String, Parameter] = Map()
  //): Expr = Option(ctx.arg2) match {
  //  case Some(_) =>
  //    BinaryExpr(
  //      visitAddSubOp(ctx.op),
  //      visitFactor(ctx.arg1, nameToGlobals, params),
  //      visitFactor(ctx.arg2, nameToGlobals, params)
  //    )
  //  case None => visitFactor(ctx.arg1, nameToGlobals, params)
  //}


  //def visitFactor(
  //    ctx: FactorContext,
  //    nameToGlobals: Map[String, Variable],
  //    params: Map[String, Parameter] = Map()
  //): Expr = Option(ctx.arg2) match {
  //  case Some(_) =>
  //    BinaryExpr(
  //      visitMulDivModOp(ctx.op),
  //      visitUnaryExpr(ctx.arg1, nameToGlobals, params),
  //      visitUnaryExpr(ctx.arg2, nameToGlobals, params)
  //    )
  //  case None => visitUnaryExpr(ctx.arg1, nameToGlobals, params)
  //}

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

  //def visitLoadSlice(
  //    ctx: LoadSliceContext,
  //): MemoryLoad = {
  //  val global = if ctx.region != null then (visitId(ctx.region) match {
  //    case g: Memory => g
  //    case _ => mem
  //  }) else mem
  //  val ptr = visitExpr(ctx.pointer)
  //  val size = (ctx.endslice, ctx.beginslice) match
  //      case (begin, end) if begin != null && end != null=>
  //        // slice array access returns bitvec of subarray
  //        evaluateExpression(BinaryExpr(BVSUB, visitExpr(begin), visitExpr(end)), Map.empty) match
  //          case Some(b) => b.value.toInt * mem.valueSize
  //          case None => throw IllegalArgumentException("Unable to evaluate expression, load size must be known statically")
  //      case (begin, null) if begin != null => mem.valueSize // scalar access of one array cell
  //      case (_, _) => ptr.match // infer size from global regions size
  //        case v: Variable if globals.exists(_.name == v.name.stripSuffix("_addr").stripPrefix("$")) =>
  //          globals.find(_.name == v.name.stripSuffix("_addr").stripPrefix("$")).get.size
  //        case _ => throw IllegalArgumentException("Unable to evaluate expression, load size must be known statically")
  //  MemoryLoad(global, ptr, Endian.LittleEndian, size)
  //}


  //def visitArrayAccess(
  //    ctx: ArrayAccessContext,
  //): MemoryLoad = {
  //  val global = visitId(ctx.ident) match {
  //    case g: Memory => g
  //    case _ => throw new Exception("invalid array access '" + ctx.getText + "' to non-global in specification")
  //  }
  //  MemoryLoad(global, visitExpr(ctx.expr), Endian.LittleEndian, global.valueSize)
  //}

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
        case Some(x) if id.startsWith("Gamma_") => LocalVar(id, x.getType)
        case Some(x) => x
        case None => throw Exception(s"Unable to resolve reference to $id")
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



}
