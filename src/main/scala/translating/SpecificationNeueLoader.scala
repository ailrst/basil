package translating


import Parsers.SpecificationsNeueParser._

import boogie._
import specification._
import ir._

import scala.collection.mutable.Stack
import scala.collection.mutable.ArrayBuffer
import scala.jdk.CollectionConverters._
import scala.collection.mutable.Buffer

// take symbol table entries as input
// parse all global defs and check sizes
// use these new nameToGlobals going forward when parsing the rest of the spec

//case class SpecificationInfo(variables: Set[Variable]) 


class BindingsStack {
  val variableBindings : ArrayBuffer[Map[String, Expr]] = ArrayBuffer.empty

  def push(x: Map[String, Expr]) = variableBindings.append(x)
  def pop() = variableBindings.remove(variableBindings.length - 1)

  def resolve(name: String) : Option[Expr] = {
    def findres(s: String, pos: Int = 0) = {
      var res: Option[Expr] = None
      var ind = variableBindings.length - 1 
      while (ind >= 0 && res == None) {
        res = variableBindings(ind).get(s)
        ind -= 1
      }
      res
    }

    findres(name)
  }

}

case class NewSpecificationLoader(symbols: Set[Variable], globals: Set[SpecGlobal], program: Program) {

  private val idToSymbol = symbols.map(g => (g.name, g)).toMap ++ globals.map(g => g.name -> Register(g.name  + "_addr", BitVecType(64)))
  val nameToGlobals: Map[String, Variable] = symbols.map(s => s.name -> s).toMap
  val nameToSpecGlobal: Map[String, SpecGlobal] = globals.map(s => s.name -> s).toMap

  val variableBindings = BindingsStack() 

  val mem = Memory("mem", 64, 8)


  def visitSpecification(ctx: SpecTopLevelContext): Specification = {
    variableBindings.push(Map("mem" -> mem))
    variableBindings.push(idToSymbol)
    val spec = visitSpecTopLevel(ctx)
    variableBindings.pop()
    variableBindings.pop()
    spec
  }


  def visitSpecTopLevel(ctx: SpecTopLevelContext) = {
    val lpreds = ctx.lPreds.asScala.flatMap(visitLPreds)
    val relies = ctx.relies.asScala.map(visitRelies)
    val guarantees = ctx.guarantees.asScala.map(visitGuarantees)
    val procedures = ctx.procedure.asScala.map(visitProcedure)
    val blocks = ctx.block.asScala.map(visitBlock)

    Specification(globals, lpreds.map((k,v) => nameToSpecGlobal(k) -> v.toBoogie).toMap, relies.map(_.toBoogie).toList, guarantees.map(_.toBoogie).toList, procedures.map(_.toProcSpec).toList, Set.empty)
  }

  def visitLPreds(ctx: LPredsContext) : Map[String, Expr] = {
    ctx.lPred.asScala.map((lp: LPredContext) => (lp.ident.getText -> visitExpr(lp.expr))).toMap
  }


  def andAll(el: Iterable[Expr]) = {
    el match {
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
      case a: ArrayAccessExprContext => visitArrayAccess(a.arrayAccess) 
      case o: OldExprContext => OldExpr(visitExpr(o.expr))
      case p: ParenExprContext       => ParenExpr(visitExpr(p.expr, params))
      case ite: IfThenElseExprContext => visitIfThenElseExpr(ite) 
      case c: FunExprContext => visitFunExpr(c)
      case c: PredicateExprContext => visitPredicateExpr(c.predicate)
  }

  def visitArrayAccess(
      ctx: ArrayAccessContext,
  ): MemoryLoad = {
    val global = visitId(ctx.ident) match {
      case g: Memory => g
      case _ => throw new Exception("invalid array access '" + ctx.getText + "' to non-global in specification")
    }
    MemoryLoad(global, visitExpr(ctx.expr), Endian.LittleEndian, global.valueSize)
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

      variableBindings.resolve(id) match
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
