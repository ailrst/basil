package translating

import Parsers.SpecificationsNeueParser._

import boogie._
import specification._
import ir._

import scala.collection.mutable.ArrayBuffer
import scala.jdk.CollectionConverters._

// take symbol table entries as input
// parse all global defs and check sizes
// use these new nameToGlobals going forward when parsing the rest of the spec

//case class SpecificationInfo(variables: Set[Variable]) 


case class NewSpecificationLoader(symbols: Set[Variable], program: Program) {

  def visitSpecification(ctx: SpecTopLevelContext): Specification = {

    Specification(Set.empty, Map.empty, List.empty, List.empty, List.empty, Set.empty)

  }

  def visitSpecTopLevel(ctx: SpecTopLevelContext) = {

  }

  def visitLPreds(ctx: LPredsContext) : Map[String, Expr] = {
    ctx.lPred.asScala.map((lp: LPredContext) => (lp.id.getText -> visitExpr(lp.expr))).toMap
  }

  /**
   * Convert a comma separated list that represents a conjunction of expressions, 
   * to a single expression. 
   */
  def visitConjunctExprList(ctx:Conjunct_expr_listContext) : Expr = {
    val el = ctx.expr.asScala.map(visitExpr(_, Map.empty)).toList

    el match {
      case Nil => FalseLiteral
      case x :: Nil => x
      case x :: xs =>  xs.foldLeft(x)((a: Expr, b: Expr) => BinaryExpr(BoolAND, a, b))
    }

  }

  def visitRequires(ctx: ParsedRequiresContext) : Expr = {
    visitConjunctExprList(ctx.conjunct_expr_list)
  }

  def visitRelies(ctx: ReliesContext) : Expr = {
    visitConjunctExprList(ctx.conjunct_expr_list)
  }

  def visitGuarantees(ctx: GuaranteesContext) : TwoStateExpr = {
    TwoStateExpr(visitConjunctExprList(ctx.conjunct_expr_list))
  }

  def visitProcedure(ctx: ProcedureContext) = {

  }


  private val idToSymbol = symbols.map(g => (g.name, g)).toMap
  val nameToGlobals: Map[String, Variable] = symbols.map(s => s.name -> s).toMap

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
  ): Expr = 
    FalseLiteral


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
      case i: IdExprContext          => visitId(i.id, nameToGlobals, params)
      // case a: ArrayAccessExprContext => visitArrayAccess(a) 
      case o: OldExprContext => OldExpr(visitExpr(o.expr))
      case p: ParenExprContext       => ParenExpr(visitExpr(p.expr, params))
      case ite: IfThenElseExprContext => visitIfThenElseExpr(ite) 
      case c: FunExprContext => visitFunExpr(c)
  }

  //def visitArrayAccess(
  //    ctx: ArrayAccessContext,
  //    nameToGlobals: Map[String, Variable],
  //    params: Map[String, Parameter] = Map()
  //): ArrayAccess = {
  //  val global = visitId(ctx.id, nameToGlobals, params) match {
  //    case g: Variable => g
  //    case _ => throw new Exception("invalid array access '" + ctx.getText + "' to non-global in specification")
  //  }
  //  ArrayAccess(global, Integer.parseInt(ctx.nat.getText))
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
      val body = visitExpr(ctx.body)

      ctx.q.getText() match 
        case "forall" => ForAll(bound.toList, body)
        case "exists" => Exists(bound.toList, body)
        case _ => ???
  }

  def visitId(ctx: IdContext, nameToGlobals: Map[String, Variable], params: Map[String, Parameter] = Map()): Expr = {
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
    //if (id.startsWith("Gamma_")) {
    //  val gamma_id = id.stripPrefix("Gamma_")
    //  params.get(gamma_id) match {
    //    case Some(p: Parameter) => p.value.toGamma
    //    case None =>
    //      nameToGlobals.get(gamma_id) match {
    //        case Some(g: Variable) => SpecGamma(g)
    //        case None                => throw new Exception(s"unresolvable reference to 'Gamma_$id' in specification")
    //      }
    //  }
    //} else {
    {  params.get(id) match {
        case Some(p: Parameter) =>
          val registerSize = p.value.size
          val paramSize = p.size
          if (paramSize == registerSize) {
            p.value
          } else if (registerSize > paramSize) {
            Extract(registerSize - p.size, 0, p.value)
          } else {
            throw Exception(s"parameter $p doesn't fit in register ${p.value} for ID $id")
          }
        case None =>
          nameToGlobals.get(ctx.getText) match {
            case Some(g: Variable) => g
            case None                => throw new Exception(s"unresolvable reference to '$id' in specification")
          }
      }
    }
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
