package translating
import ir.*
import boogie.*
import specification.*
import util.{BoogieGeneratorConfig, BoogieMemoryAccessMode, ProcRelyVersion, Logger}

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable

/** Plain translation of BASIL IR to Boogie program, without any VC generation.
  *
  * This defines the translation externally to the IR nodes.
  */

trait Translator[TYP, EXP, PROC, BLOCK, STMT, JMP, VAR, MEM, PA, BA] {
  def translateType(e: IRType): TYP

  def translateVar(e: Variable): VAR
  def translateMem(e: Memory): MEM

  def translateExpr(e: Expr): EXP

  def translateStatement(s: Statement): STMT
  def translateJump(j: Jump): JMP

  def translateBlock(b: Block, attrs: BA): BLOCK

  def translateProc(e: Procedure, attrs: PA): PROC
}

object BoogieTranslator extends Translator[BType, BExpr, BProcedure, BBlock, BCmd, BCmd, BVar, BMapVar, ProcSpec, Unit] {

  def translateType(e: IRType): BType = e match {
    case BoolType      => BoolBType
    case IntType       => IntBType
    case BitVecType(s) => BitVecBType(s)
    case MapType(p, r) => MapBType(translateType(p), translateType(r))
    case RefType(t, s) => translateType(t)
  }

  def translateVar(e: Variable): BVar = e match {
    case Register(n, s)       => BVariable(n, translateType(e.getType), Scope.Global)
    case LocalVar(name, typ)  => BVariable(name, translateType(typ), Scope.Local)
    case GlobalVar(name, typ) => BVariable(name, translateType(typ), Scope.Global)
    case GlobalConst(name, typ) => BVariable(name, translateType(typ), Scope.Const)
    case m: Memory            => translateMem(m)
  }

  def translateMem(e: Memory): BMapVar =
    BMapVar(e.name, MapBType(BitVecBType(e.addressSize), BitVecBType(e.valueSize)), Scope.Global)

  def translateQuant(q: QuantifierExpr) = {
    val b = q.binds.map(_.toBoogie)
    val g = q.guard
      .map(QuantifierGuard.toCond)
      .foldLeft(TrueLiteral: Expr)((l, r) => BinaryExpr(BoolAND, l, r))
    val bdy = if (q.guard.isEmpty) {
      q.body
    } else {
      BinaryExpr(BoolIMPLIES, g, q.body)
    }
    q.kind match {
      case QuantifierSort.forall => ForAll(b, bdy.toBoogie)
      case QuantifierSort.lambda => Lambda(b, bdy.toBoogie)
      case QuantifierSort.exists => Exists(b, bdy.toBoogie)
    }
  }

  def translateExpr(e: Expr): BExpr = e match {
    case TrueLiteral                          => TrueBLiteral
    case FalseLiteral                         => FalseBLiteral
    case IntLiteral(c)                        => IntBLiteral(c)
    case OldExpr(e)                           => Old(translateExpr(e))
    case BitVecLiteral(s, c)                  => BitVecBLiteral(s, c)
    case Extract(e, start, body)              => BVExtract(e, start, translateExpr(body))
    case Repeat(repeats, body)                => BVRepeat(repeats, translateExpr(body))
    case ZeroExtend(ext, body)                => BVZeroExtend(ext, translateExpr(body))
    case SignExtend(ext, body)                => BVSignExtend(ext, translateExpr(body))
    case UnaryExpr(op, arg)                   => UnaryBExpr(op, translateExpr(arg))
    case BinaryExpr(op, arg1, arg2)           => BinaryBExpr(op, translateExpr(arg1), translateExpr(arg2))
    case MemoryLoad(mem, index, endian, size) => BMemoryLoad(translateMem(mem), translateExpr(index), endian, size)
    case FApply(name, params, returnType, uninterpreted) =>
      BFunctionCall(name, params.map(translateExpr).toList, translateType(returnType), uninterpreted)
    case q: QuantifierExpr => translateQuant(q)
    case r: Variable       => translateVar(r)
  }

  def translateFunction(f: PureFunction) = f match {
    case UninterpretedFun(name, formalParams, returnType) =>
      BFunction(name, formalParams.map((n, t) => BParam(n, t.toBoogie)), BParam(returnType.toBoogie), None)
    case BoogieFunction(name, formalParams, returnType, body) =>
      BFunction(name, formalParams.map((n, t) => BParam(n, t.toBoogie)), BParam(returnType.toBoogie), Some(body))
    case IRFunction(name, formalParams, returnType, body) =>
      BFunction(
        name,
        formalParams.map((n, t) => BParam(n, t.toBoogie)),
        BParam(returnType.toBoogie),
        Some(body.toBoogie)
      )
  }

  def slToBoogie(e: List[Statement]) = e.map(translateStatement)

  def captureStateStatement(stateName: String): BAssume = {
    BAssume(TrueBLiteral, None, List(BAttribute("captureState", Some(s"\"$stateName\""))))
  }

  def translateStatement(s: Statement): BCmd = s match {
    case m: NOP => BAssume(TrueBLiteral, Some("NOP"))
    case m: MemoryAssign =>
      val lhs = translateMem(m.mem)
      val rhs = BMemoryStore(translateMem(m.mem), translateExpr(m.index), translateExpr(m.value), m.endian, m.size)
      val store = AssignCmd(List(lhs), List(rhs))
      store
    case l: Assign =>
      val lhs: BVar = translateVar(l.lhs)
      val rhs = translateExpr(l.rhs)
      AssignCmd(List(lhs), List(rhs))
    case a: Assert =>
      val body = translateExpr(a.body)
      BAssert(body, a.comment)
    case a: Assume =>
      val body = translateExpr(a.body)
      BAssume(body, a.comment)
  }

  def translateJump(j: Jump): BCmd = {
    j match {
      case d: DirectCall   => BProcedureCall(d.target.name)
      case g: GoTo         => GoToCmd(g.targets.map(_.label).toSeq)
      case f: IndirectCall => BAssert(FalseBLiteral, Some("IndirectCall" + f.target.toString))
      case r: Return       => ReturnCmd
    }

  }

  def translateBlock(b: Block, unused: Unit = ()): BBlock = translateBlock(b)
  def translateBlock(b: Block): BBlock = {
    val bl = BBlock(
      b.label,
      slToBoogie(b.statements.toList) ++ List(translateJump(b.jump))
    )
    bl
  }

  def translateProc(e: Procedure, pa: ProcSpec): BProcedure = {
    val body: List[BCmdOrBlock] =
      (e.entryBlock.view ++ e.blocks.filterNot(x => e.entryBlock.contains(x))).map(x => translateBlock(x)).toList

    val modifies = e.modifies.map(translateVar).toSet

    BProcedure(
      e.name,
      List(),
      List(),
      pa.ensures.map(m => translateExpr(m.body)),
      pa.requires.map(translateExpr),
      List(),
      List(),
      pa.freeEnsures.map(m => translateExpr(m.body)),
      pa.freeRequires.map(translateExpr),
      modifies,
      body,
      List(BAttribute("extern"))
    )
  }

  def translateProg(p: Program, spec: ProgSpec) = {

    for (p <- p.procedures) {
      p.modifies.addAll(spec.procedures.get(p.name).map(_.modifies).getOrElse(List()))
    }

    val modifies = transforms.ProcModifies.inferModifies(p)

    for (p <- p.procedures) {
      p.modifies.addAll(modifies(p))
    }

    val procs = p.procedures.map(p => translateProc(p, spec.procedures.get(p.name).getOrElse(ProcSpec())))

    def fundef(o: FunctionOp) = {
      o match {
        case l: LOp => LOpDefinition(l, Map.empty)
        case o      => functionOpToDefinition(BoogieGeneratorConfig(), o)
      }
    }

    val memory = transforms.UsedMemory.get(p).map(translateMem).map(m => BVarDecl(m, List(BAttribute("extern")))).toSet
    val globals = transforms.FindVars.globals(p).map(translateVar).map(v => BVarDecl(v, List(BAttribute("extern")))).toSet
    val varsInModifies = procs.flatMap(_.modifies).map(m => BVarDecl(m, List(BAttribute("extern")))).toSet
    val statevars = varsInModifies ++ memory ++ globals

    val specFuncs = spec.functionDeclarations.map(translateFunction)

    val axioms = spec.axioms.map(translateExpr).map(BAxiom(_))

    val defs : List[BDeclaration] =  procs.toList ++ specFuncs ++ axioms
    val variables : List[BDeclaration] = spec.variableDeclarations.map(v => BVarDecl(translateVar(v), List()))

    val funDeps = (defs).flatMap(p => p.functionOps).toSet
    var funDefs = funDeps.map(fundef)
    var nfunDefs = funDefs ++ funDefs.flatMap(p => p.functionOps).map(fundef)

    // fixed point transitive closure of used function ops
    while (nfunDefs.size != funDefs.size) {
      funDefs = nfunDefs
      nfunDefs = funDefs ++ funDefs.flatMap(p => p.functionOps).map(fundef)
    }

    val decls: List[BDeclaration] = statevars.toList ++ variables ++ nfunDefs ++ specFuncs ++ axioms ++ procs
    BProgram(decls, "why do we need filename")
  }
}
