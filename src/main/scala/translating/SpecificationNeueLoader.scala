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
  def satisfies(o: SExpr): Boolean
  def getType: SType
  def toSList: SSExpr.SList
  def toExpr: Option[Expr]

enum SType:
  case Top
  case Bot
  case SSymbol
  case Val(t: IRType)
  case NumberVal
  case MapVal
  case SList(typs: List[SType])
  case SStruct(fields: List[(String, SType)]) // note that any struct satisfies SStruct(List.empty)
  case Fun(args: SSExpr.SList, ret: SType)

  def satisfies(o: SType): Boolean = {
    // this satisfies o
    // o :>  this
    ((o, this) match {
      case (_, Bot)                        => false
      case (_, Top)                        => true
      case (NumberVal, Val(b: BitVecType)) => true
      case (NumberVal, Val(IntType))       => true
      case (MapVal, Val(b: MapType))       => true
      // Any list is compatible with any other list, we dont consider number or type of list elements, for that purpose we have struct.
      case (SList(a), SList(b)) => true
      //case (SList(a), SStruct(b)) => b.size >= a.size && a.indices.forall(i => a(i) == b(i)._2)   // coercible not compatible
      //case (SStruct(a), SList(b)) => b.size >= a.size && a.indices.forall(i => a(i)._2 == b(i))
      // Structs b <: a if all fields in b are in a, and have compatible types
      case (SStruct(a), SStruct(b)) =>
        b.size >= a.size && a.indices.forall(i => a(i)._1 == b(i)._1 && (b(i)._2.satisfies(a(i)._2)))
      case (a, b) => a == b
    })
  }

enum SSExpr(typ: SType) extends SExpr:
  case SSymbol(e: String) extends SSExpr(SType.SSymbol)
  case SVariable(name: String, typ: SType) extends SSExpr(typ)
  case Val(e: Expr) extends SSExpr(SType.Val(e.getType))
  case SList(e: List[SExpr]) extends SSExpr(SType.SList(e.map(_.getType)))
  case SStruct(e: List[(String, SExpr)]) extends SSExpr(SType.SStruct(e.map((k, v) => (k, v.getType))))
  case SFunc(name: String, args: List[(String, SType)], ret: SType, body: Option[SExpr]) extends SSExpr(SType.Top)
  case SApply(fun: SFunc, args: SList) extends SSExpr(fun.ret)
  case SIndirApply(fun: SExpr, args: SList)
      extends SSExpr(fun match
        case f: SFunc => f.ret
        case _        => SType.Top
      )
  case SFieldAccess(struct: SExpr, field: String)
      extends SSExpr(struct match
        case s: SStruct => s.e.find(_._1 == field).get._2.getType
        case _          => SType.Top
      )

  override def getType: SType = typ

  /** this :< o
    */
  override def satisfies(o: SExpr): Boolean = {
    o.getType.satisfies(typ)
  }

  override def toExpr: Option[Expr] = {
    this match {
      case Val(e)               => Some(e)
      case SList(e :: Nil)      => e.toExpr
      case SVariable(name, typ) => Some(LocalVar(name, BitVecType(64)))
      case SSymbol(e)           => None
      case SList(e)             => None
      case SStruct(_)           => None
      case _: SFunc             => None
      case _: SApply            => None
      case _: SIndirApply       => None
      case _: SFieldAccess      => None
    }
  }

  override def toSList: SList = {
    this match {
      case s: SList   => s
      case s: SStruct => SList(s.e.map(_._2))
      case o          => SList(List(o))
    }
  }

  val bindings = Stack[Map[String, SExpr]]()

  def lookupBinding(n: String): Option[SExpr] = {
    val it = bindings.reverseIterator
    var term = false
    var res: Option[SExpr] = None
    while (!term && it.hasNext) {
      val next = it.next
      if (next.contains(n)) {
        term = true
        res = next.get(n)
      }
    }
    res
  }
  //val binopfun: SFunc =
  //  SFunc("binop", List(("op", SType.SSymbol), ("left", SType.Top), ("right", SType.Top)), SType.Top, None)
  //val unopfun: SFunc = SFunc("unop", List(("op", SType.SSymbol), ("arg", SType.Top)), SType.Top, None)
  //val forallfun: SFunc =
  //  SFunc("forall", List(("binds", SType.SList(List.empty)), ("arg", SType.Val(BoolType))), SType.Val(BoolType), None)
  //val existsfun: SFunc =
  //  SFunc("exists", List(("binds", SType.SList(List.empty)), ("arg", SType.Val(BoolType))), SType.Val(BoolType), None)
  //val oldfun: SFunc = SFunc("old", List(("arg", SType.Top)), SType.Top, None)
  //val ifthenelsefun: SFunc =

  def evalBuiltInFunction(a: SApply): SExpr = {
    // assuming a.fun.body == None
    val args = eval(a.args).toSList
    a.fun match {
      //case BuiltinFun.accessRangeFunc =>  Val(FalseLiteral)
      //case BuiltinFun.accessCellFunc =>  Val(FalseLiteral)
      //case BuiltinFun.bitvecSliceFunc =>  Val(FalseLiteral)
      case BuiltinFun.binopfun => {
        val op = args.e(0).asInstanceOf[SSymbol].e
        val arg1 = args.e(1).toExpr.get
        val arg2 = args.e(2).toExpr.get
        assert(arg1.getType == arg2.getType)

        val oper = (arg1.getType) match {
          case b: BitVecType => visitBVOp(op)
          case BoolType      => visitBoolOp(op)
          case IntType       => visitIntOp(op)
          case m: MapType    => throw TypeError("Cannot binop a map type.")
        }

        Val(BinaryExpr(oper, arg1, arg2))
      }
      case BuiltinFun.unopfun => {
        val op = args.e(0).asInstanceOf[SSymbol].e
        val arg = args.e(1).toExpr.get

        val oper = (arg.getType, op) match {
          case (_, "not")             => BVNOT
          case (IntType, "neg")       => IntNEG
          case (b: BitVecType, "neg") => BVNEG
          case (_, _)                 => throw Exception("Bad use of builtin func unop")
        }

        Val(UnaryExpr(oper, arg))
      }
      case BuiltinFun.forallfun     => Val(FalseLiteral)
      case BuiltinFun.existsfun     => Val(FalseLiteral)
      case BuiltinFun.oldfun        => Val(FalseLiteral)
      case BuiltinFun.ifthenelsefun => Val(FalseLiteral)
      case _                        => SApply(a.fun, args)
    }
  }

  def eval(o: SExpr): SExpr = {
    println(o)
    o match {
      case Val(e) => {
        val replacer = VariableReplacer(
          // TODO: this is not correct wrt shadowing
          bindings.flatMap(_.flatMap((k: String, v: SExpr) => v.toExpr.map(k -> _))).toMap
        )
        Val(replacer.visitExpr(e))
      }
      case SVariable(n, v) =>
        lookupBinding(n) match {
          case Some(e) => e
          case None    => SVariable(n, v) // throw Exception(s"Referenceing unbound variable $n")
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
      case f: SFunc => f
      case SApply(fun, args) => {
        val bs = args.e.indices.map(i => (fun.args(i)._1 -> eval(args.e(i)))).toMap
        val funparamtypes = SStruct(bs.toList).getType
        val argumetypes = SType.SStruct(fun.args)
        if (!(argumetypes.satisfies(funparamtypes))) {
          println(SApply(fun,args))
          throw TypeError(s"Function call type mismatch: $argumetypes does not satisfy $funparamtypes")
        }

        fun.body match {
          case None => evalBuiltInFunction(SApply(fun, args))
          case Some(body) => {
            // evaluate arguments, bind them to parameter variables, evaluate body, replace the call with the body

            bindings.push(bs)
            val nb = eval(body)
            bindings.pop()
            nb
          }
        }
      }
      case SIndirApply(f, args) => {
        eval(f) match {
          case s: SFunc => eval(SApply(s, args))
          case _        => throw TypeError(s"Expression does not evaluate to a function, cannot apply non-function.")
        }
      }
      case SFieldAccess(s, field) => {
        eval(s) match {
          case SStruct(e) => e.find(_._1 == field).get._2
          case _          => throw TypeError("Cannot access field of non-struct.")
        }
      }
      case SSymbol(e) => SSymbol(e)
    }

  }

object BuiltinFun:
  import SSExpr._
  val accessRangeFunc: SFunc =
    SFunc("arrayslice", List(("base", SType.NumberVal), ("size", SType.NumberVal)), SType.NumberVal, None)
  val accessCellFunc: SFunc = SFunc("get", List(("base", SType.NumberVal)), SType.NumberVal, None)
  val bitvecSliceFunc: SFunc =
    SFunc("slice", List(("begin", SType.NumberVal), ("end", SType.NumberVal)), SType.NumberVal, None)
  val binopfun: SFunc =
    SFunc("binop", List(("op", SType.SSymbol), ("left", SType.Top), ("right", SType.Top)), SType.Top, None)
  val unopfun: SFunc = SFunc("unop", List(("op", SType.SSymbol), ("arg", SType.Top)), SType.Top, None)
  val forallfun: SFunc =
    SFunc("forall", List(("binds", SType.SList(List.empty)), ("arg", SType.Val(BoolType))), SType.Val(BoolType), None)
  val existsfun: SFunc =
    SFunc("exists", List(("binds", SType.SList(List.empty)), ("arg", SType.Val(BoolType))), SType.Val(BoolType), None)
  val oldfun: SFunc = SFunc("old", List(("arg", SType.Top)), SType.Top, None)
  val ifthenelsefun: SFunc =
    SFunc("ite", List(("if", SType.Top), ("then", SType.Top), ("else", SType.Top)), SType.Top, None)

import SSExpr._
import BuiltinFun._

class BindingsStack {
  val variableBindings: ArrayBuffer[Map[String, Expr]] = ArrayBuffer.empty

  var globalsDisallowed = 0

  def enterPureLocalScope(): Unit = {
    globalsDisallowed += 1
  }

  def leavePureLocalScope(): Unit = {
    require(globalsDisallowed > 0)
    globalsDisallowed -= 1
  }

  def canReferenceGlobals: Boolean = globalsDisallowed == 0

  def push(x: Map[String, Expr]) = variableBindings.append(x)
  def pop() = variableBindings.remove(variableBindings.length - 1)

  def resolve(name: String): Option[Expr] = {
    def findres(s: String, pos: Int = 0) = {
      var res: Option[Expr] = None
      var ind = variableBindings.length - 1
      while (ind >= 0 && res == None) {
        res = variableBindings(ind).get(s) match {
          case Some(s) if !canReferenceGlobals && s.variables.exists(p => p.scope == Scope.Global) =>
            throw Exception(s"Cannot reference global $name in pure local context.")
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
  private val idToSymbol =
    symbols.map(g => (g.name, g)).toMap ++ globals.map(g => g.name -> LocalVar("$" + g.name + "_addr", BitVecType(64)))

  private val idToSymbolNew = symbols.map(g => (g.name, Val(g))).toMap
    ++ globals.map(g =>
      g.name -> SSExpr.SStruct(
        List(
          ("region", Val(mem)),
          ("base", Val(LocalVar("$" + g.name + "_addr", BitVecType(64)))),
          ("size", Val(BitVecLiteral(g.size, 64)))
        )
      )
    )

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
      case _          => throw Exception("Unreachable.")
    }

    def getProcedureSpec(name: String, mapped: Map[String, SExpr]): SubroutineSpec = {
      // all this should be validated via type-checking first.
      val relies = mapped.get("relies").map(_.toExpr.get).getOrElse(FalseLiteral)
      val guarantees = mapped.get("guarantees").map(_.toExpr.get).getOrElse(FalseLiteral)
      val requires = mapped.get("requires").map(_.toExpr.getOrElse(FalseLiteral)).getOrElse(FalseLiteral)
      val ensures = mapped.get("ensures").map(_.toExpr.get).getOrElse(FalseLiteral)
      val mods = mapped
        .get("modifies")
        .toList
        .collect(_ match {
          case SList(e) =>
            e.map(_ match {
              case Val(v: Variable) => v.name
              case _                => throw TypeError("non-variable modifies clause")
            })
          case _ => throw TypeError("Mods must be a slist")
        })
        .flatten

      SubroutineSpecinfo(name, relies, guarantees, mods, requires, ensures).toProcSpec
    }

    val relies = mapped.get("relies")
    val guarantees = mapped.get("guarantees")
    val lpreds = mapped.get("L")

    val procedures = mapped
      .get("procedures")
      .map(procdefs =>
        procdefs match {
          case SStruct(e) =>
            e.map((procname, procspec) =>
              procspec match {
                case SStruct(s) => getProcedureSpec(procname, s.toMap)
                case _          => throw TypeError("Procedures should be map.")
              }
            )
          case _ => throw TypeError("Procedures should be map.")
        }
      )

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
      case Nil      => FalseLiteral
      case x :: Nil => x
      case x :: xs  => xs.foldLeft(x)((a: Expr, b: Expr) => BinaryExpr(BoolAND, a, b))
    }
  }

  /** Convert a comma separated list that represents a conjunction of expressions, to a single expression. def
    * visitConjunctExprList(ctx:Conjunct_expr_listContext) : Expr = { andAll(ctx.expr.asScala.map(visitExpr(_,
    * Map.empty)).toList) }
    */

  case class SubroutineSpecinfo(
      name: String,
      relies: Expr,
      guarantees: Expr,
      mods: List[String],
      requires: Expr,
      ensures: Expr
  ) {
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

  def visitTypeName(ctx: BoogieTypeNameContext): IRType = {
    ctx match {
      case bv: BvBTypeContext    => BitVecType(Integer.parseInt(bv.getText.stripPrefix("bv")))
      case i: IntBTypeContext    => IntType
      case b: BoolBTypeContext   => BoolType
      case mapT: MapBTypeContext => MapType(visitTypeName(mapT.keyT), visitTypeName(mapT.valT))
    }
  }

  /** We do one pass over the ast to load the IR expression language. For SExpressions, we create a temporary variable
    * and bind the sexpr to that variable, returning the variable.
    *
    * In the second evaluation pass these sexpressions are resolved into IR expressions, and are substituted back for
    * the temporary variable.
    */
  var tempCount = 0
  val temporaries = HashMap[Variable, SExpr]()

  def visitSExpr(ctx: ExprContext) = {
    visitExpr(ctx)
  }

  /** Visit an expression and return an S expression; wrapping ir expressions in Val.
    */
  def visitExpr(ctx: ExprContext): SExpr = {
    ctx match {
      case c: EquivExprContext       => visitEquivExpr(c)
      case c: LogicalExprContext     => visitLogicalExpr(c)
      case c: RelExprContext         => visitRelExpr(c)
      case c: ArithExprContext       => visitArithExpr(c)
      case c: MathExprContext        => visitMathExpr(c)
      case c: UnexpContext           => visitUnaryExpr(c.unaryExpr, nameToGlobals, Map.empty)
      case c: SliceExprContext       => Val(FalseLiteral)
      case c: AccessRangeExprContext => Val(FalseLiteral)
      case c: FieldAccessExprContext => visitFieldAccess(c)
      case c: SexprApplyContext      => visitApplyExpr(c)
      case c: StructExprContext      => visitStructExpr(c.sstruct)
      case c: ListExprContext        => visitListExpr(c.slist)
    }
  }

  def visitEquivExpr(ctx: EquivExprContext) = {
    SApply(binopfun, SList(List(SSymbol(BoolEQUIV.toString)) ++ ctx.expr.asScala.map(visitExpr).toList))
  }

  def visitLogicalExpr(ctx: LogicalExprContext) = {
    SApply(binopfun, SList(List(SSymbol(ctx.op.getText)) ++ ctx.expr.asScala.map(visitExpr).toList))
    //ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitLogOp(ctx.op), l, visitExpr(r)))
  }

  def visitArithExpr(ctx: ArithExprContext) = {
    SApply(binopfun, SList(List(SSymbol(ctx.op.getText)) ++ ctx.expr.asScala.map(visitExpr).toList))
    //ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitAddSubOp(ctx.op), l, visitExpr(r)))
  }

  def visitMathExpr(ctx: MathExprContext) = {
    SApply(binopfun, SList(List(SSymbol(ctx.op.getText)) ++ ctx.expr.asScala.map(visitExpr).toList))
    //ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitMulDivModOp(ctx.op), l, visitExpr(r)))
  }

  def visitSliceExpr(ctx: SliceExprContext) = {}

  def visitFieldAccess(ctx: FieldAccessExprContext): SFieldAccess = {
    SFieldAccess(visitSExpr(ctx.arg1), ctx.field.getText)
  }

  def visitStructExpr(ctx: SstructContext): SStruct = {
    SStruct(ctx.sexpdef.asScala.map(d => (d.ident.getText, visitSExpr(d.expr))).toList)
  }

  def visitListExpr(ctx: SlistContext): SList = {
    SList(ctx.expr.asScala.map(visitSExpr).toList)
  }

  def visitApplyExpr(ctx: SexprApplyContext): SExpr = {
    SIndirApply(visitSExpr(ctx.expr), visitListExpr(ctx.slist))
  }

  def visitRelExpr(ctx: RelExprContext) = {
    SApply(binopfun, SList(List(SSymbol(ctx.op.getText)) ++ ctx.expr.asScala.map(visitExpr).toList))
  }

  def visitUnaryExpr(
      ctx: UnaryExprContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): SExpr = ctx match {
    case n: NegExprContext =>
      SApply(
        unopfun,
        SList(List(SSymbol("neg"), visitUnaryExpr(n.unaryExpr, nameToGlobals, params)))
      ) // UnaryExpr(BVNEG, visitUnaryExpr(n.unaryExpr, nameToGlobals, params))
    case a: AtomUnaryExprContext => visitAtomExpr(a.atomExpr, nameToGlobals, params)
    case n: NotExprContext =>
      SApply(
        unopfun,
        SList(List(SSymbol("not"), visitUnaryExpr(n.unaryExpr, nameToGlobals, params)))
      ) // UnaryExpr(BoolNOT, visitUnaryExpr(n.unaryExpr, nameToGlobals, params))
  }

  def visitIfThenElseExpr(c: IfThenElseExprContext) = {
    SApply(ifthenelsefun, SList(List(visitExpr(c.guard), visitExpr(c.thenExpr), visitExpr(c.elseExpr))))
  }

  def visitFunExpr(c: FunExprContext) = {
    //val body = c.name.getText.stripPrefix("bv")
    //val sizeText = body.replaceAll("\\D+","")
    //val size = Integer.parseInt(sizeText)
    //val op = body.stripSuffix(sizeText)
    //val outOp = op match {
    //  case   "and"  => BVAND
    //  case   "or"   => BVOR
    //  case   "add"  => BVADD
    //  case   "mul"  => BVMUL
    //  case   "udiv" => BVUDIV
    //  case   "urem" => BVUREM
    //  case   "shl"  => BVSHL
    //  case   "lshr" => BVLSHR
    //  case   "ult"  => BVULT
    //  case   "nand" => BVNAND
    //  case   "nor"  => BVNOR
    //  case   "xor"  => BVXOR
    //  case   "xnor" => BVXNOR
    //  case   "comp" => BVCOMP
    //  case   "sub"  => BVSUB
    //  case   "sdiv" => BVSDIV
    //  case   "srem" => BVSREM
    //  case   "smod" => BVSMOD
    //  case   "ashr" => BVASHR
    //  case   "ule"  => BVULE
    //  case   "ugt"  => BVUGT
    //  case   "uge"  => BVUGE
    //  case   "slt"  => BVSLT
    //  case   "sle"  => BVSLE
    //  case   "sgt"  => BVSGT
    //  case   "sge"  => BVSGE
    //}

    val args = c.args.expr.asScala.map(visitExpr).toList
    assert(args.length == 2)

    SApply(binopfun, SList(List(SSymbol(c.name.getText)) ++ args))
  }

  def visitAtomExpr(
      ctx: AtomExprContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): SExpr = ctx match {
    case b: BoolLitExprContext => Val(visitBoolLit(b.boolLit))
    case b: BvExprContext      => Val(visitBv(b.bv))
    case i: NatExprContext     => Val(visitNat(i.nat))
    case i: IdExprContext      => visitId(i.ident)
    //case a: ArrayAccessExprContext => visitArrayAccess(a.arrayAccess)
    //case a : LoadSliceExprContext => visitLoadSlice(a.loadSlice)
    case o: OldExprContext          => SApply(oldfun, SList(List(visitExpr(o.expr))))
    case p: ParenExprContext        => visitExpr(p.expr)
    case ite: IfThenElseExprContext => visitIfThenElseExpr(ite)
    case c: FunExprContext          => visitFunExpr(c)
    case c: PredicateExprContext    => visitPredicateExpr(c.predicate)
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

    val fun = ctx.q.getText() match
      case "forall" => forallfun
      case "exists" => existsfun
      case _        => ???

    val bound =
      ctx.bound.typed_variable.asScala.map(b => ((SVariable(b.name.getText, SType.Val(visitTypeName(b.btype)))))).toList
    SApply(fun, SList(List(SList(bound), visitExpr(ctx.body))))
  }

  def visitId(ctx: IdentContext): SExpr = {

    /** TODO
      *
      *   - Resolve every type of ident using scoping roles
      *     - global variables (from relf)
      *     - registers
      *     - function parameters
      *     - local variables
      */
    val id = ctx.getText

    variableBindings.resolve(id.stripPrefix("Gamma_")) match
      case Some(x) if id.startsWith("Gamma_") => SVariable(id, SType.Val(BoolType))
      case Some(x)                            => Val(x)
      case None                               => SVariable(id, SType.Top)
  }

}

def visitBoolOp(s: String): BoolBinOp = s match {
  case "==>"  => BoolIMPLIES
  case "<==>" => BoolEQUIV
  case "||"   => BoolOR
  case "&&"   => BoolAND
  case "=="   => BoolEQ
  case "!="   => BoolNEQ
}

def visitBVOp(s: String) = {
  s match {
    case "=="   => BVEQ
    case "!="   => BVNEQ
    case ">"    => BVSGT
    case ">="   => BVSGE
    case "<"    => BVSLT
    case "<="   => BVSLE
    case "+"    => BVADD
    case "-"    => BVSUB
    case "*"    => BVMUL
    case "div"  => BVSDIV
    case "mod"  => BVSMOD
    case "and"  => BVAND
    case "or"   => BVOR
    case "add"  => BVADD
    case "mul"  => BVMUL
    case "udiv" => BVUDIV
    case "urem" => BVUREM
    case "shl"  => BVSHL
    case "lshr" => BVLSHR
    case "ult"  => BVULT
    case "nand" => BVNAND
    case "nor"  => BVNOR
    case "xor"  => BVXOR
    case "xnor" => BVXNOR
    case "comp" => BVCOMP
    case "sub"  => BVSUB
    case "sdiv" => BVSDIV
    case "srem" => BVSREM
    case "smod" => BVSMOD
    case "ashr" => BVASHR
    case "ule"  => BVULE
    case "ugt"  => BVUGT
    case "uge"  => BVUGE
    case "slt"  => BVSLT
    case "sle"  => BVSLE
    case "sgt"  => BVSGT
    case "sge"  => BVSGE
  }
}

def visitIntOp(s: String): IntBinOp = s match {
  case "==" => IntEQ
  case "!=" => IntNEQ
  case ">"  => IntGT
  case ">=" => IntGE
  case "<"  => IntLT
  case "<=" => IntLE
}
