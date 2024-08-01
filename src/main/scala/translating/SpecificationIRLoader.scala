package translating

import Parsers.SpecificationsParser._
import boogie._
import specification._
import ir._
import util.Logger
import scala.collection.mutable

import scala.collection.mutable.ArrayBuffer
import scala.jdk.CollectionConverters._

// take symbol table entries as input
// parse all global defs and check sizes
// use these new nameToGlobals going forward when parsing the rest of the spec

// type BindingsType = Map[Variable, Expr]

case class SpecificationIRLoader(
    symbols: Set[SpecGlobal],
    variables: Set[Variable],
    program: Program,
    forwardDeclaredL: Map[Memory, Expr => FApply]
) {
  private val nameToGlobals: Map[String, Expr] =
    (symbols.map(g => (g.name -> g.toIRLoad())) ++ variables.map(v => v.name -> v)).toMap
  //private val params: BindingsType = symbols.map(g => (g.name, g.toIRLoad())).toMap

  def visitSpecification(ctx: SpecificationContext): ProgSpec = {
    val globals = symbols

    val lPreds = Option(ctx.lPreds) match {
      case Some(_) => visitLPreds(ctx.lPreds, symbols, nameToGlobals)
      case None    => Map()
    }

    val relies = Option(ctx.relies) match {
      case Some(_) => visitRelies(ctx.relies, nameToGlobals)
      case None    => List()
    }

    val guarantees = Option(ctx.guarantees) match {
      case Some(_) => visitGuarantees(ctx.guarantees, nameToGlobals)
      case None    => List()
    }

    def flattenRel(xs: List[Relation], default: Expr = FalseLiteral): Relation = {
      xs match {
        case Nil      => Relation(default)
        case h :: Nil => h
        case h :: tl  => xs.foldLeft(h: Relation)((l, r) => Relation(BinaryExpr(BoolAND, l.body, r.body)))
      }
    }

    val subroutines = ctx.subroutine.asScala.map(s => s.id.getText -> visitSubroutine(s, nameToGlobals))

    //val directFunctions = Option(ctx.directFunctions) match {
    //  case Some(_) => visitDirectFunctions(ctx.directFunctions)
    //  case None    => Set()
    //}

    val rely = Relation(flattenRel(relies, TrueLiteral).body, Some("rely"))
    val guarantee = Relation(flattenRel(guarantees, FalseLiteral).body, Some("guarantee"))
    val lp : Map[Memory, Map[SpecGlobal, Expr]] = Map((SharedMemory("mem", 64, 8), lPreds))

    val missingL : Set[Memory] = lp.toSet.map(_._1).diff(forwardDeclaredL.toSet.map(_._1))

    val allLP : Map[Memory, Map[SpecGlobal, Expr]] = Map((SharedMemory("mem", 64, 8), lPreds)) ++ missingL.map((v: Memory) => v -> Map[SpecGlobal, Expr]()).toMap

    val ls = LFunctionDefsBoogie(allLP).toList

    val constants = symbols.map(s => BinaryExpr(BVEQ, s.toAddrVarIR,  BitVecLiteral(s.address, 64))).toList
    val vardecls = symbols.map(s => s.toAddrVarIR).toList

    ProgSpec(globals.toList, allLP, mutable.Map.from(subroutines), rely, guarantee, ls.map(_._2).map(_._1), ls.map((k,v) => k -> v._2).toMap, vardecls, constants)
  }

  def visitLPred(ctx: LPredContext, symbols: Set[SpecGlobal], nameToGlobals: Map[String, Expr]): (SpecGlobal, Expr) = {
    (symbols.find(_.name == ctx.id.getText).get, visitExpr(ctx.expr, nameToGlobals))
  }

  def visitLPreds(
      ctx: LPredsContext,
      symbols: Set[SpecGlobal],
      nameToGlobals: Map[String, Expr]
  ): Map[SpecGlobal, Expr] = {
    ctx.lPred.asScala.map(l => visitLPred(l, symbols, nameToGlobals)).toMap
  }

  def visitRelies(ctx: ReliesContext, nameToGlobals: Map[String, Expr]): List[Relation] = {
    ctx.expr.asScala.map(e => Relation(visitExpr(e, nameToGlobals))).toList
  }

  def visitGuarantees(ctx: GuaranteesContext, nameToGlobals: Map[String, Expr]): List[Relation] = {
    ctx.expr.asScala.map(e => Relation(visitExpr(e, nameToGlobals))).toList
  }

  def visitSubroutine(ctx: SubroutineContext, nameToGlobals: Map[String, Expr]): ProcSpec = {
    val name = ctx.id.getText
    val irProc = program.procedures.collectFirst { case p if p.name == name => p }

    val requires = ctx.requires.asScala.collect { case r: ParsedRequiresContext =>
      visitExpr(r.expr, nameToGlobals)
    }.toList

    val modifies = Option(ctx.modifies) match {
      case Some(_) => visitModifies(ctx.modifies)
      case None    => List()
    }

    val ensures = ctx.ensures.asScala.collect { case e: ParsedEnsuresContext =>
      Relation(visitExpr(e.expr, nameToGlobals))
    }.toList

    //val requiresDirect = ctx.requires.asScala.collect { case r: DirectRequiresContext =>
    //  r.QUOTESTRING.getText.stripPrefix("\"").stripSuffix("\"")
    //}.toList

    //val ensuresDirect = ctx.ensures.asScala.collect { case r: DirectEnsuresContext =>
    //  r.QUOTESTRING.getText.stripPrefix("\"").stripSuffix("\"")
    //}.toList

    val rely = Option(ctx.relies) match {
      case Some(_) => visitRelies(ctx.relies, nameToGlobals)
      case None    => List()
    }

    val guarantee = Option(ctx.guarantees) match {
      case Some(_) => visitGuarantees(ctx.guarantees, nameToGlobals)
      case None    => List()
    }

    ProcSpec(requires, ensures, List.empty, List.empty, rely, guarantee, modifies)
  }

  def visitModifies(ctx: ModifiesContext): List[Variable] = {
    ctx.id.asScala
      .map(_.getText)
      .map(v =>
        nameToGlobals.get(v) match {
          case Some(v) => {
            v match {
              case m: MemoryLoad => m.mem
              case v: Variable   => v
              case _             => ???
            }
          }
          case None => throw Exception(s"modifies clause mentions undefined variable $v")
        }
      )
      .toList
  }

  def visitExpr(
      ctx: ExprContext,
      params: Map[String, Expr] = Map()
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
      nameToGlobals: Map[String, Expr],
      params: Map[String, Expr] = Map()
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
      nameToGlobals: Map[String, Expr],
      params: Map[String, Expr] = Map()
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
      nameToGlobals: Map[String, Expr],
      params: Map[String, Expr] = Map()
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
      nameToGlobals: Map[String, Expr],
      params: Map[String, Expr] = Map()
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
      nameToGlobals: Map[String, Expr],
      params: Map[String, Expr] = Map()
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
      nameToGlobals: Map[String, Expr],
      params: Map[String, Expr] = Map()
  ): Expr = ctx match {
    case n: NegExprContext       => UnaryExpr(BVNEG, visitUnaryExpr(n.unaryExpr, nameToGlobals, params))
    case a: AtomUnaryExprContext => visitAtomExpr(a.atomExpr, nameToGlobals, params)
    case n: NotExprContext       => UnaryExpr(BoolNOT, visitUnaryExpr(n.unaryExpr, nameToGlobals, params))
  }

  def visitAtomExpr(
      ctx: AtomExprContext,
      nameToGlobals: Map[String, Expr],
      params: Map[String, Expr] = Map()
  ): Expr = {
    ctx match {
      case b: BoolLitExprContext => visitBoolLit(b.boolLit)
      case i: IdExprContext      => visitId(i.id, nameToGlobals)
      case o: OldExprContext     => OldExpr(visitExpr(o.expr, nameToGlobals))
      case p: ParenExprContext   => visitExpr(p.expr, params)
      //case i: IfThenElseExprContext  => visitIfThenElseExpr(i, nameToGlobals, params)
      // case a: ArrayAccessExprContext => visitArrayAccess(a.arrayAccess, nameToGlobals, params)
      case b: BvExprContext => visitBv(b.bv)
    }
  }

  def visitBv(ctx: BvContext): BitVecLiteral = {
    BitVecLiteral(BigInt(ctx.value.getText), Integer.parseInt(ctx.BVSIZE.getText.stripPrefix("bv")))
  }

  //def visitIfThenElseExpr(
  //    ctx: IfThenElseExprContext,
  //    nameToGlobals: Map[String, Variable],
  //    params: Map[String, Expr] = Map()
  //): IfThenElse = {
  //  IfThenElse(
  //    visitExpr(ctx.guard, nameToGlobals, params),
  //    visitExpr(ctx.thenExpr, nameToGlobals, params),
  //    visitExpr(ctx.elseExpr, nameToGlobals, params)
  //  )
  //}

  def visitNat(ctx: NatContext): IntBLiteral = IntBLiteral(BigInt(ctx.getText))

  def visitBoolLit(ctx: BoolLitContext): BoolLit = ctx.getText match {
    case "true"  => TrueLiteral
    case "false" => FalseLiteral
  }

  def visitId(ctx: IdContext, nameToGlobals: Map[String, Expr]): Expr = {
    val id = ctx.getText
    id match {
      case id if id.startsWith("Gamma_R") => {
        GlobalVar(id, BoolType)
      }
      case id if (id.startsWith("Gamma_")) => {
        val gamma_id = id.stripPrefix("Gamma_")
        nameToGlobals.get(gamma_id) match {
          case Some(p: Variable)   => ir.transforms.gamma_v(p)
          case Some(p: MemoryLoad) => ir.transforms.load_to_gamma(p)
          // case Some(p) => ir.transforms.gamma_e(p) // probably shouldn't be reachable
          case _ => ???
        }
      }
      case id if id.startsWith("R") => {
        Register(id, 64)
      }
      case id => {
        nameToGlobals.get(id) match {
          case Some(v) => v
          case None =>
            nameToGlobals.get(ctx.getText) match {
              case Some(g) => g
              case None    => throw new Exception(s"unresolvable reference to '$id' in specification")
            }
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

def LFunctionDefsBoogie(lPreds: Map[Memory, Map[SpecGlobal, Expr]]): Map[Memory, (PureFunction, Expr => FApply)] = {
  lPreds.map((v, defin) => {
    v -> {
      val memoryType = v.getType.toBoogie
      val addressType = BitVecBType(v.addressSize)

      val regionDepends = (defin.toSet.flatMap((v,e) => transforms.sharedAccesses(e)._1) + v).toList

      val indexVar = BParam("index", addressType)
      val params = regionDepends.map((r: RefVariable) => (r.name, r.getType)) ++ List(("index", BitVecType(v.addressSize)))

      val LPreds = defin.map((k, v) => k -> v.toBoogie.resolveSpecL)
      val body: BExpr = LPreds.keys.foldLeft(FalseBLiteral) { (ite: BExpr, next: SpecGlobal) =>
        {
          val guard = next.arraySize match {
            case Some(size: Int) =>
              val initial: BExpr = BinaryBExpr(BoolEQ, indexVar, ArrayAccess(next, 0).toAddrVar)
              val indices = 1 until size
              indices.foldLeft(initial) { (or: BExpr, i: Int) =>
                {
                  BinaryBExpr(BoolOR, BinaryBExpr(BoolEQ, indexVar, ArrayAccess(next, i).toAddrVar), or)
                }
              }
            case None => BinaryBExpr(BoolEQ, indexVar, next.toAddrVar)
          }
          val LPred = LPreds(next)
          /*if (controlled.contains(next)) {
            FunctionCall(s"L_${next.name}", List(l.memory), BoolType)
          } else {
            LPreds(next)
          } */
          IfThenElse(guard, LPred, ite)
        }
      }
      val func = BoogieFunction("L$" + v.name, params, BoolType, body) 
      val fcall = (addr: Expr) => func.call(regionDepends ++ List(addr))
      (func, fcall)
    }
  })
}
