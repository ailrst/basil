package translating

import Parsers.SpecificationsParser._
import boogie._
import specification._
import ir._
import util.Logger
import scala.collection.mutable

import scala.collection.mutable.ArrayBuffer
import scala.jdk.CollectionConverters._
import ir.MemoryLoad

// take symbol table entries as input
// parse all global defs and check sizes
// use these new nameToGlobals going forward when parsing the rest of the spec

// type BindingsType = Map[Variable, Expr]

case class SpecificationIRLoader(
    inSymbols: Set[SpecGlobal],
    variables: Set[Variable],
    program: Program,
    forwardDeclaredL: Map[Memory, Expr => FApply]
) {

  val symbols = mutable.Map.from(inSymbols.map(s => s.name -> s))

  private def nameToGlobals: Map[String, Expr] =
    (symbols.map((n, g) => (n -> g.toIRLoad())) ++ variables.map(v => v.name -> v) + ("main_argc" -> Register("R0", 64))
      ++ program.procedures.flatMap(p => p.bindingsOut.map((n,e) => n.name -> e).toMap ++ p.bindingsIn.map((n, e) => n.name -> e).toMap)).toMap

  Logger.warn(s"$nameToGlobals")

  private def params = nameToGlobals
  //private val params: BindingsType = symbols.map(g => (g.name, g.toIRLoad())).toMap

  def visitSpecification(ctx: SpecificationContext): ProgSpec = {

    val globals = Option(ctx.globals) match {
      case Some(_) => visitGlobals(ctx.globals)
      case None    => Set()
    }

    // val globals = symbols.map((n,s) => s)

    val lPreds = Option(ctx.lPreds) match {
      case Some(_) => visitLPreds(ctx.lPreds)
      case None    => Map()
    }

    val relies = Option(ctx.relies) match {
      case Some(_) => visitRelies(ctx.relies)
      case None    => List()
    }

    val guarantees = Option(ctx.guarantees) match {
      case Some(_) => visitGuarantees(ctx.guarantees)
      case None    => List()
    }

    def flattenRel(xs: List[Relation], default: Expr = FalseLiteral): Relation = {
      xs match {
        case Nil      => Relation(default)
        case h :: Nil => h
        case h :: tl  => xs.foldLeft(h: Relation)((l, r) => Relation(BinaryExpr(BoolAND, l.body, r.body)))
      }
    }

    val subroutines = ctx.subroutine.asScala.map(s => s.id.getText -> visitSubroutine(s))

    //val directFunctions = Option(ctx.directFunctions) match {
    //  case Some(_) => visitDirectFunctions(ctx.directFunctions)
    //  case None    => Set()
    //}


// case class BoogieFunction(override val name: String, override val formalParams: List[(String, IRType)], override val returnType: IRType, body: BExpr) extends PureFunction {
    val mem = SharedMemory("mem", 64, 8)
    val gammamem = SharedMemory("Gamma_mem", 64, 1)
    val i = LocalVar("i", BitVecType(64))
    val defaultRely =  (QuantifierExpr(QuantifierSort.forall, List(i), List(), BinaryExpr(BVEQ, OldExpr(MemoryLoad(mem, i, Endian.LittleEndian, 8)), MemoryLoad(mem, i, Endian.LittleEndian, 8))))
    val extraRely=  (QuantifierExpr(QuantifierSort.forall, List(i), List(), BinaryExpr(BoolIMPLIES, 
      BinaryExpr(BVEQ, OldExpr(MemoryLoad(mem, i, Endian.LittleEndian, 8)), MemoryLoad(mem, i, Endian.LittleEndian, 8)),
      BinaryExpr(BVEQ, OldExpr(MemoryLoad(gammamem, i, Endian.LittleEndian, 1)), MemoryLoad(gammamem, i, Endian.LittleEndian, 1)),
      )))

     // (forall i: bv64 :: (((mem[i] == old(mem[i])) ==> (Gamma_mem[i] == old(Gamma_mem[i])))));


    val rely = Relation(BinaryExpr(BoolAND, extraRely, flattenRel(relies, defaultRely).body), Some("rely"))
    val guarantee = Relation(flattenRel(guarantees, TrueLiteral).body, Some("guarantee"))
    val lp: Map[Memory, Map[SpecGlobal, Expr]] = Map((SharedMemory("mem", 64, 8), lPreds))

    val missingL: Set[Memory] = forwardDeclaredL.toSet.map(_._1).diff(lp.toSet.map(_._1))

    val allLP: Map[Memory, Map[SpecGlobal, Expr]] =
      Map((SharedMemory("mem", 64, 8), lPreds)) ++ missingL.map((v: Memory) => v -> Map[SpecGlobal, Expr]()).toMap

    val ls = LFunctionDefsBoogie(allLP).toList

    val constants = symbols.map((n, s) => BinaryExpr(BVEQ, s.toAddrVarIR, BitVecLiteral(s.address, 64))).toList
    val vardecls = symbols.map((n, s) => s.toAddrVarIR).toList

    ProgSpec(
      globals.toList,
      allLP,
      mutable.Map.from(subroutines),
      rely,
      guarantee,
      ls.map(_._2).map(_._1),
      ls.map((k, v) => k -> v._2).toMap,
      vardecls,
      constants
    )
  }

  def visitLPred(ctx: LPredContext): (SpecGlobal, Expr) = {
    (symbols.get(ctx.id.getText).get, visitExpr(ctx.expr))
  }

  def visitGlobals(ctx: GlobalsContext): Set[SpecGlobal] = {
    ctx.globalDef.asScala.map(g => visitGlobalDef(g)).toSet
  }

  def visitGlobalDef(ctx: GlobalDefContext): SpecGlobal = {
    val id = ctx.id.getText
    val symbol = symbols.get(id) match {
      case Some(g: SpecGlobal) => g
      case None                => throw new Exception(s"unresolvable reference to '$id' in specification")
    }
    val size = ctx.typeName match {
      case b: BvTypeContext    => Integer.parseInt(b.BVSIZE.getText.stripPrefix("bv"))
      case _: LongTypeContext  => 64
      case _: ShortTypeContext => 16
      case _: IntTypeContext   => 32
      case _: CharTypeContext  => 8
    }
    val arraySize = Option(ctx.arraySize) match {
      case Some(a: ArraySizeContext) => Some(Integer.parseInt(a.size.getText))
      case None                      => None
    }
    val bits = size * arraySize.getOrElse(1)
    if (bits != symbol.size) {
      throw new Exception(s"variable $id in specification does not match symbol table")
    }
    val newglobal = SpecGlobal(id, size, arraySize, symbol.address)

    symbols(id) = newglobal
    newglobal
  }

  def visitLPreds(
      ctx: LPredsContext
  ): Map[SpecGlobal, Expr] = {
    ctx.lPred.asScala.map(l => visitLPred(l)).toMap
  }

  def visitRelies(ctx: ReliesContext): List[Relation] = {
    ctx.expr.asScala.map(e => Relation(visitExpr(e))).toList
  }

  def visitGuarantees(ctx: GuaranteesContext): List[Relation] = {
    ctx.expr.asScala.map(e => Relation(visitExpr(e))).toList
  }

  def visitSubroutine(ctx: SubroutineContext): ProcSpec = {
    val name = ctx.id.getText
    val irProc = program.procedures.collectFirst { case p if p.name == name => p }

    val requires = ctx.requires.asScala.collect { case r: ParsedRequiresContext =>
      visitExpr(r.expr)
    }.toList

    val modifies = Option(ctx.modifies) match {
      case Some(_) => visitModifies(ctx.modifies)
      case None    => List()
    }

    val ensures = ctx.ensures.asScala.collect { case e: ParsedEnsuresContext =>
      Relation(visitExpr(e.expr))
    }.toList

    //val requiresDirect = ctx.requires.asScala.collect { case r: DirectRequiresContext =>
    //  r.QUOTESTRING.getText.stripPrefix("\"").stripSuffix("\"")
    //}.toList

    //val ensuresDirect = ctx.ensures.asScala.collect { case r: DirectEnsuresContext =>
    //  r.QUOTESTRING.getText.stripPrefix("\"").stripSuffix("\"")
    //}.toList

    val rely = Option(ctx.relies) match {
      case Some(_) => visitRelies(ctx.relies)
      case None    => List()
    }

    val guarantee = Option(ctx.guarantees) match {
      case Some(_) => visitGuarantees(ctx.guarantees)
      case None    => List()
    }

    ProcSpec(requires, ensures, List.empty, List.empty, rely, guarantee, modifies)
  }

  def visitModifies(ctx: ModifiesContext): List[Variable] = {
    ctx.id.asScala
      .map(_.getText)
      .map(v =>
        nameToGlobals.get(v).orElse(symbols.get(v).map(_.toIRLoad())) match {
          case Some(v) => {
            v match {
              case m: MemoryLoad => m.mem
              case v: Variable   => v
              case _ => {
                Logger.info(s"$v")
                ???
              }
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
    val exprs = ctx.impliesExpr.asScala.map(e => visitImpliesExpr(e))
    if (exprs.size > 1) {
      exprs.tail.foldLeft(exprs.head)((opExpr: Expr, next: Expr) => BinaryExpr(BoolEQUIV, opExpr, next))
    } else {
      exprs.head
    }
  }

  def visitImpliesExpr(
      ctx: ImpliesExprContext
  ): Expr = Option(ctx.arg2) match {
    case Some(_) =>
      BinaryExpr(
        BoolIMPLIES,
        visitLogicalExpr(ctx.arg1),
        visitImpliesExpr(ctx.arg2)
      )
    case None => visitLogicalExpr(ctx.arg1)
  }

  def visitLogicalExpr(
      ctx: LogicalExprContext
  ): Expr = {
    val rels = ctx.relExpr.asScala.map(r => visitRelExpr(r))
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
      ctx: RelExprContext
  ): Expr = Option(ctx.arg2) match {
    case Some(_) =>
      BinaryExpr(
        visitRelOp(ctx.op),
        visitTerm(ctx.arg1),
        visitTerm(ctx.arg2)
      )
    case None => visitTerm(ctx.arg1)
  }

  def visitTerm(
      ctx: TermContext
  ): Expr = Option(ctx.arg2) match {
    case Some(_) =>
      BinaryExpr(
        visitAddSubOp(ctx.op),
        visitFactor(ctx.arg1),
        visitFactor(ctx.arg2)
      )
    case None => visitFactor(ctx.arg1)
  }

  def visitFactor(
      ctx: FactorContext
  ): Expr = Option(ctx.arg2) match {
    case Some(_) =>
      BinaryExpr(
        visitMulDivModOp(ctx.op),
        visitUnaryExpr(ctx.arg1),
        visitUnaryExpr(ctx.arg2)
      )
    case None => visitUnaryExpr(ctx.arg1)
  }

  def visitUnaryExpr(
      ctx: UnaryExprContext
  ): Expr = ctx match {
    case n: NegExprContext       => UnaryExpr(BVNEG, visitUnaryExpr(n.unaryExpr))
    case a: AtomUnaryExprContext => visitAtomExpr(a.atomExpr, params)
    case n: NotExprContext       => UnaryExpr(BoolNOT, visitUnaryExpr(n.unaryExpr))
  }

  def visitAtomExpr(
      ctx: AtomExprContext,
      params: Map[String, Expr] = Map()
  ): Expr = {
    ctx match {
      case b: BoolLitExprContext => visitBoolLit(b.boolLit)
      case i: IdExprContext      => visitId(i.id)
      case o: OldExprContext     => OldExpr(visitExpr(o.expr))
      case p: ParenExprContext   => visitExpr(p.expr, params)
      //case i: IfThenElseExprContext  => visitIfThenElseExpr(i, nameToGlobals, params)
      case a: ArrayAccessExprContext => visitArrayAccess(a.arrayAccess, params)
      case b: BvExprContext          => visitBv(b.bv)
    }
  }

  def visitBv(ctx: BvContext): BitVecLiteral = {
    BitVecLiteral(BigInt(ctx.value.getText), Integer.parseInt(ctx.BVSIZE.getText.stripPrefix("bv")))
  }

  def visitArrayAccess(
      ctx: ArrayAccessContext,
      params: Map[String, Expr] = Map()
  ): Expr = {
    val global = symbols.get(ctx.id.getText) match {
      case Some(g) => g
      case _       => throw new Exception("invalid array access '" + ctx.getText + "' to non-global in specification")
    }
    ArrayAccess(global, Integer.parseInt(ctx.nat.getText)).toIRLoad()
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

  def visitId(ctx: IdContext): Expr = {
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
          case Some(p)             => ir.transforms.gamma_e(p, forwardDeclaredL)
          case None                => ???
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

      val regionDepends = (defin.toSet.flatMap((v, e) => transforms.sharedAccesses(e)._1) + v).toList

      val indexVar = BParam("index", addressType)
      val params =
        regionDepends.map((r: RefVariable) => (r.name, r.getType)) ++ List(("index", BitVecType(v.addressSize)))

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
