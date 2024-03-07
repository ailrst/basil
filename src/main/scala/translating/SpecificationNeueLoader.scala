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
import analysis.evaluateExpression

// take symbol table entries as input
// parse all global defs and check sizes
// use these new nameToGlobals going forward when parsing the rest of the spec

//case class SpecificationInfo(variables: Set[Variable]) 

sealed trait SExpr:
  def satisfies(o: SExpr) : Boolean = ???

enum SType:
  case Symbol
  case Val
  case SList
  case SStruct
  case Fun(args: SSExpr.SList, ret: SType)

enum SSExpr(typ: SType) extends SExpr:
  case Symbol(e: String) extends SSExpr(SType.Symbol)
  case Val(e: Expr) extends SSExpr(SType.Val)
  case SList(e: List[SExpr]) extends SSExpr(SType.SList)
  case SStruct(e: Map[String, SExpr]) extends SSExpr(SType.SStruct)

  /**
   * this :< o
   */
  override def satisfies(o: SExpr) : Boolean = {
    (this, o) match 
      case (Symbol(a), Symbol(b)) => true
      case (Val(a), Val(b)) => a.getType == b.getType
      case (SList(a), SList(b)) => {
        (a.length == b.length) &&
        a.indices.forall(i => a(i).satisfies(b(i)))
      }
      case (SStruct(a), SStruct(b)) => {
        (a.keySet == b.keySet) && {
          a.keySet.forall(k => a(k).satisfies(b(k)))
        }
      }
      case _ => false
  }

import SSExpr._

case class Function(args: List[SType], ret: SType, body: SExpr) extends SExpr {


}


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
  ++ globals.map(g => g.name -> SSExpr.SStruct(Map("region" -> Val(mem) , "base" -> Val(LocalVar("$" + g.name  + "_addr", BitVecType(64))), "size" -> Val(BitVecLiteral(g.size,64)))))

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

    val relies = ctx.relies.asScala.map(visitRelies)
    val guarantees = ctx.guarantees.asScala.map(visitGuarantees)
    val procedures = ctx.procedure.asScala.map(visitProcedure)
    val blocks = ctx.block.asScala.map(visitBlock)
    val lpreds = ctx.lPreds.asScala.flatMap(visitLPreds)

    variableBindings.pop()
    variableBindings.pop()
    Specification(globals, lpreds.map((k,v) => nameToSpecGlobal(k) -> v.toBoogie).toMap, relies.map(_.toBoogie).toList, guarantees.map(_.toBoogie).toList, procedures.map(_.toProcSpec).toList, Set.empty)
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

  def visitRequires(ctx: RequiresContext) : Expr = {
    visitConjunctExprList(ctx.conjunct_expr_list)
  }

  def visitEnsures(ctx: EnsuresContext) : Expr = {
    visitConjunctExprList(ctx.conjunct_expr_list)
  }

  def visitRelies(ctx: ReliesContext) : Expr = {
    visitConjunctExprList(ctx.conjunct_expr_list)
  }

  def visitGuarantees(ctx: GuaranteesContext) : Expr = {
    visitConjunctExprList(ctx.conjunct_expr_list)
  }

  def visitDeclaration(ctx: DeclarationContext) : Expr = {
    val name = ctx.ident.getText
    val typ = visitTypeName(ctx.boogieTypeName)

    typ match 
      case MapType(p, r) => LocalVar(name, typ)
      case _ => LocalVar(name, typ)

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

  def sVisitProcedure(ctx:ProcedureContext) = {
    val name = ctx.ident.getText
    val relies: Expr = andAll(ctx.relies.asScala.map(visitRelies))
    val guarantees: Expr = andAll(ctx.guarantees.asScala.map(visitGuarantees))
    val mods = (ctx.modifies.asScala.flatMap(c => c.ident.asScala.map(_.getText)))
    val requries: Expr = andAll(ctx.requires.asScala.map(visitRequires))
    val ensures: Expr = andAll(ctx.ensures.asScala.map(visitEnsures))

    SList(
      List(Symbol("procedure"),
      Symbol(name), (SStruct(Map(
        "relies" -> Val(relies),
        "guarantees" -> Val(guarantees),
        "modifies" -> SList(mods.map(Symbol(_)).toList),
        "requires" -> Val(requries),
        "ensures" -> Val(ensures)
      )))))
  }

  def visitProcedure(ctx: ProcedureContext) : SubroutineSpecinfo = {
    val name = ctx.ident.getText
    val relies: Expr = andAll(ctx.relies.asScala.map(visitRelies))
    val guarantees: Expr = andAll(ctx.guarantees.asScala.map(visitGuarantees))
    val mods = (ctx.modifies.asScala.flatMap(c => c.ident.asScala.map(_.getText)))
    val requries: Expr = andAll(ctx.requires.asScala.map(visitRequires))
    val ensures: Expr = andAll(ctx.ensures.asScala.map(visitEnsures))
    SubroutineSpecinfo(name, relies, guarantees, mods, requries, ensures)
  }

  def visitBlock(ctx: BlockContext) = {

  }


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
    val exprs = ctx.impliesExpr.asScala.map(e => visitImpliesExpr(e, nameToGlobals, params))
    if (exprs.size > 1) {
      exprs.tail.foldLeft(exprs.head)((opExpr: Expr, next: Expr) => BinaryExpr(BoolEQUIV, opExpr, next))
    } else {
      exprs.head
    }
  }

  def visitImpliesExpr(
      ctx: ImpliesExprContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): Expr = Option(ctx.arg2) match {
    case Some(_) =>
      BinaryExpr(
        BoolIMPLIES,
        visitLogicalExpr(ctx.arg1, nameToGlobals, params),
        visitImpliesExpr(ctx.arg2, nameToGlobals, params)
      )
    case None => visitLogicalExpr(ctx.arg1, nameToGlobals, params)
  }

  def visitLogicalExpr(
      ctx: LogicalExprContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): Expr = {
    val rels = ctx.relExpr.asScala.map(r => visitRelExpr(r, nameToGlobals, params))
    if (rels.size > 1) {
      val op = if (ctx.AND_OP.size > 0) {
        BoolAND
      } else {
        BoolOR
      }
      rels.tail.foldLeft(rels.head)((opExpr: Expr, next: Expr) => BinaryExpr(op, opExpr, next))
    } else {
      rels.head
    }
  }

  def visitRelExpr(
      ctx: RelExprContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): Expr = Option(ctx.arg2) match {
    case Some(_) =>
      BinaryExpr(
        visitRelOp(ctx.op),
        visitTerm(ctx.arg1, nameToGlobals, params),
        visitTerm(ctx.arg2, nameToGlobals, params)
      )
    case None => visitTerm(ctx.arg1, nameToGlobals, params)
  }

  def visitTerm(
      ctx: TermContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): Expr = Option(ctx.arg2) match {
    case Some(_) =>
      BinaryExpr(
        visitAddSubOp(ctx.op),
        visitFactor(ctx.arg1, nameToGlobals, params),
        visitFactor(ctx.arg2, nameToGlobals, params)
      )
    case None => visitFactor(ctx.arg1, nameToGlobals, params)
  }


  def visitFactor(
      ctx: FactorContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): Expr = Option(ctx.arg2) match {
    case Some(_) =>
      BinaryExpr(
        visitMulDivModOp(ctx.op),
        visitUnaryExpr(ctx.arg1, nameToGlobals, params),
        visitUnaryExpr(ctx.arg2, nameToGlobals, params)
      )
    case None => visitUnaryExpr(ctx.arg1, nameToGlobals, params)
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
      case a : LoadSliceExprContext => visitLoadSlice(a.loadSlice)
      case o: OldExprContext => OldExpr(visitExpr(o.expr))
      case p: ParenExprContext       => ParenExpr(visitExpr(p.expr, params))
      case ite: IfThenElseExprContext => visitIfThenElseExpr(ite) 
      case c: FunExprContext => visitFunExpr(c)
      case c: PredicateExprContext => visitPredicateExpr(c.predicate)
  }

  def visitLoadSlice(
      ctx: LoadSliceContext,
  ): MemoryLoad = {

    val global = if ctx.region != null then (visitId(ctx.region) match {
      case g: Memory => g
      case _ => mem
    }) else mem

    val ptr = visitExpr(ctx.pointer)

    val size = (ctx.endslice, ctx.beginslice) match 
        case (begin, end) if begin != null && end != null=> 
          // slice array access returns bitvec of subarray
          evaluateExpression(BinaryExpr(BVSUB, visitExpr(begin), visitExpr(end)), Map.empty) match
            case Some(b) => b.value.toInt * mem.valueSize
            case None => throw IllegalArgumentException("Unable to evaluate expression, load size must be known statically")
        case (begin, null) if begin != null => mem.valueSize // scalar access of one array cell
        case (_, _) => ptr.match // infer size from global regions size
          case v: Variable if globals.exists(_.name == v.name.stripSuffix("_addr").stripPrefix("$")) =>
            globals.find(_.name == v.name.stripSuffix("_addr").stripPrefix("$")).get.size
          case _ => throw IllegalArgumentException("Unable to evaluate expression, load size must be known statically")


    MemoryLoad(global, ptr, Endian.LittleEndian, size)
  }


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
