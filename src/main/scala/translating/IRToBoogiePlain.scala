package translating
import ir.{BoolOR, *}
import boogie.*
import specification.*
import util.{BoogieGeneratorConfig, BoogieMemoryAccessMode, ProcRelyVersion}

import scala.collection.mutable.ArrayBuffer


/**
 *
 * Plain translation of BASIL IR to Boogie program, without any VC generation.
 *
 * This defines the translation externally to the IR nodes.
 *
 */


trait Translator[TYP, EXP, PROC, BLOCK, STMT, JMP, VAR, MEM, PA, BA] {
  def translateType(e: IRType) : TYP

  def translateVar(e: Variable) : VAR
  def translateMem(e: Memory) : MEM


  def translateExpr(e: Expr) : EXP

  def translateStatement(s: Statement) : STMT
  def translateJump(j: Jump) : JMP

  def translateBlock(b: Block, attrs: BA) : BLOCK

  def translateProc(e: Procedure, attrs: PA) : PROC


}


case class ProcAttrs(modifies: List[Variable], requires: List[Expr], ensures: List[Expr], freeRequires: List[Expr], freeEnsures: List[Expr])

class BoogieTranslator extends Translator[BType, BExpr, BProcedure, BBlock, BCmd, BCmd, BVar, BMapVar, ProcAttrs, Unit]{


  def translateType(e: IRType) : BType = e match {
    case BoolType => BoolBType
    case IntType => IntBType
    case BitVecType(s) => BitVecBType(s)
    case MapType(p, r) => MapBType(translateType(p), translateType(r))
  }

  def translateVar(e: Variable) : BVar = e match  {
    case Register(n, s) => BVariable(n, translateType(e.irType), Scope.Global)
    case LocalVar(name, typ) => BVariable(name, translateType(typ), Scope.Local)
  }

  def translateMem(e: Memory) : BMapVar = BMapVar(e.name, MapBType(BitVecBType(e.addressSize), BitVecBType(e.valueSize)), Scope.Global)

  def translateExpr(e: Expr) : BExpr = e match {
    case TrueLiteral => TrueBLiteral
    case FalseLiteral => FalseBLiteral
    case IntLiteral(c) => IntBLiteral(c)
    case BitVecLiteral(s, c) => BitVecBLiteral(s, c)
    case Extract(e, start, body) => BVExtract(e, start, translateExpr(body))
    case Repeat(repeats, body) => BVRepeat(repeats, translateExpr(body))
    case ZeroExtend(ext, body) => BVZeroExtend(ext, translateExpr(body))
    case SignExtend(ext, body) => BVSignExtend(ext, translateExpr(body))
    case UnaryExpr(op, arg) => UnaryBExpr(op, translateExpr(arg))
    case BinaryExpr(op, arg1, arg2) => BinaryBExpr(op, translateExpr(arg1), translateExpr(arg2))
    case MemoryLoad(mem, index, endian, size) => BMemoryLoad(translateMem(mem), translateExpr(index), endian, size)
    // TODO: uninterpreted flag; we want to give ir functions an interpretation in the backend
    case UninterpretedFunction(name, params, returnType) => BFunctionCall(name, params.map(translateExpr).toList, translateType(returnType), true)
    case r: Variable => translateVar(r)
  }

  def slToBoogie(e: List[Statement]) = e.map(translateStatement)

  def captureStateStatement(stateName: String): BAssume = {
    BAssume(TrueBLiteral, None, List(BAttribute("captureState", Some(s"\"$stateName\""))))
  }

  def translateStatement(s: Statement) : BCmd = s match {
    case m: NOP => BAssume(TrueBLiteral, Some("NOP"))
    case m: MemoryAssign =>
      val lhs = translateMem(m.mem)
      val rhs = BMemoryStore(translateMem(m.mem), translateExpr(m.index), translateExpr(m.value), m.endian, m.size)
      val store = AssignCmd(List(lhs), List(rhs))
      store
    case l: Assign =>
      val lhs : BVar = translateVar(l.lhs)
      val rhs = translateExpr(l.rhs)
      AssignCmd(List(lhs), List(rhs))
    case a: Assert =>
      val body = translateExpr(a.body)
      BAssert(body, a.comment)
    case a: Assume =>
      val body = translateExpr(a.body)
      BAssume(body, a.comment)
  }

  def translateJump(j: Jump) : BCmd =  {
    j match {
      case d: DirectCall => BProcedureCall(d.target.name)
      case g: GoTo => GoToCmd(g.targets.map(_.label).toSeq)
      case f: IndirectCall => BAssert(FalseBLiteral, Some("IndirectCall" + f.target.toString))
    }

  }

  def translateBlock(b: Block, unused: Unit = ()) : BBlock = translateBlock(b)
  def translateBlock(b: Block) : BBlock = {
    BBlock(b.label, slToBoogie(b.statements.toList) ++ List(translateJump(b.jump)) ++ b.fallthrough.map(translateJump).toList)
  }

  def translateProc(e: Procedure, pa: ProcAttrs) : BProcedure = 
  {

    val body = (e.entryBlock.view ++ e.blocks.filterNot(x => e.entryBlock.contains(x))).map(x => translateBlock(x)).toList
    BProcedure(e.name, List(), List(), pa.requires.map(translateExpr), pa.ensures.map(translateExpr), List(), List(), pa.freeRequires.map(translateExpr), pa.freeEnsures.map(translateExpr), pa.modifies.map(translateVar).toSet, body)

  }

}
