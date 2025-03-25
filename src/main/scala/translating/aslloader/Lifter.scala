package translating.aslloader

import util.Logger
import ir.*
import ir.eval.BitVectorEval.*
import collection.mutable.ArrayBuffer
import collection.mutable
import lifter.*
import ir.dsl.*

case class SymLoad(m: Memory, addr: Expr, end: Endian, sz: Int)

type RTSym = Expr | SymLoad
type RTLabel = String
type BV = BitVecLiteral
def rTLabelDefault = "undef"
def rTSymDefault = null
def rTExprDefault = null

given CoerceExpr: Conversion[RTSym, Expr] with
  def apply(x: RTSym): Expr = x match {
    case e: Expr => e
    case _ => ???
  }

case class BranchInfo(val branch: Option[String], val guard: Expr, val branchTaken: Boolean, pcAssigned: Option[Expr])

class BasilLiftState(val entry: String = "block") extends LiftState[RTSym, RTLabel, BV] {

  val endian = Endian.LittleEndian
  val memory = SharedMemory("mem", 64, 8)

  var counter = 0
  var current_pos: String = entry
  val controlFlow: mutable.Map[String, EventuallyJump] = mutable.Map()
  val blocks: mutable.Map[String, ArrayBuffer[Statement]] = mutable.Map((entry -> ArrayBuffer.empty))
  val branches: mutable.Map[String, (String, String, String)] = mutable.Map()

  var current_guard: BranchInfo = BranchInfo(None, TrueLiteral, false, None)

  // maps block ids to guards
  // We push the current guard forward as blocks are appended. We maintain this mapping so we
  // can update the current guard when switch_ctx is called.
  val block_guard: mutable.Map[String, BranchInfo] = mutable.Map()

  def pcAssigns = block_guard.filter { case (k, v) =>
    v.pcAssigned.isDefined
  }

  def new_name(p: Option[String] = None) = entry + "_" + p.map(_ + "_").getOrElse("") + (counter += 1).toString

  def merge_state(other: BasilLiftState) = {
    controlFlow.addAll(other.controlFlow)
    blocks.addAll(other.blocks)
    current_pos = other.current_pos
  }

  def escaping_jumps = controlFlow
    .collect {
      case (_, EventuallyGoto(tgts, _)) => tgts.map((t: DelayNameResolve) => t.ident)
      case (_, EventuallyCall(ft, _, _, _)) => List(ft.ident)
      case (_, EventuallyIndirectCall(ft, _)) => List()
    }
    .flatMap(_.toList)
    .filter((t: String) => !blocks.keySet.contains(t))
    .toSet

  def push_block(p: Option[String] = None): String = {
    val n = new_name(p)
    blocks(n) = ArrayBuffer.empty
    n
  }

  def push_stmt(s: Statement) = {
    s match {
      case LocalAssign(Register("BranchTaken", 1), BitVecLiteral(1, 1), _) =>
        current_guard = BranchInfo(current_guard.branch, current_guard.guard, true, current_guard.pcAssigned)
      case LocalAssign(Register("_PC", BitVecType(64)), addr, _) =>
        current_guard = BranchInfo(current_guard.branch, current_guard.guard, current_guard.branchTaken, Some(addr))
      case _ => ()
    }
  }

  def switch_ctx(c: String) = {
    require(blocks.keySet.contains(c))
    current_pos = c
  }

  def gen_branch(cond: Expr) = {
    val branch_id = new_name(Some("branch"))

    val true_branch = push_block(Some("true"))
    val false_branch = push_block(Some("false"))
    val merge_block = push_block(Some("join"))
    blocks(true_branch).append(Assume(cond))
    blocks(false_branch).append(Assume(UnaryExpr(BoolNOT, cond)))

    block_guard(true_branch) = BranchInfo(Some(branch_id), cond, false, None)
    block_guard(false_branch) = BranchInfo(Some(branch_id), UnaryExpr(BoolNOT, cond), false, None)
    block_guard(merge_block) = BranchInfo(None, TrueLiteral, false, None)
    current_guard =
      BranchInfo(Some(branch_id), current_guard.guard, current_guard.branchTaken, current_guard.pcAssigned)

    controlFlow(current_pos) = goto(true_branch, false_branch)
    controlFlow(true_branch) = goto(merge_block)
    controlFlow(false_branch) = goto(merge_block)
    branches.addOne((branch_id -> (true_branch, false_branch, merge_block)))
    switch_ctx(merge_block)
    (branch_id, true_branch, false_branch, merge_block)
  }

  def add_call(c: EventuallyCall) = {
    controlFlow.get(current_pos) match {
      case None => controlFlow(current_pos) = c
      case Some(l) => throw Exception(s"Existing jump $l")
    }
  }
  def add_call(from: String, c: EventuallyJump) : Unit = {
    controlFlow.get(from) match {
      case None => controlFlow(current_pos) = c
      case Some(EventuallyGoto(List(x))) => {
        c match {
          case EventuallyCall(c, None) => EventuallyCall(c, Some(x))
          case EventuallyCall(_, Some(f)) => add_call(f.ident, c)
          case EventuallyIndirectCall(c, None) => EventuallyIndirectCall(c, Some(x))
          case EventuallyIndirectCall(_, Some(f)) => add_call(f.ident, c)
          case EventuallyGoto(cs) => (EventuallyGoto(cs ++ List(x)))
          case _ => throw Exception(s"Existing jump ${EventuallyGoto(List(x))} adding $c")
        }

      }
      case Some(l) => throw Exception(s"Existing jump $l")
    }
  }


  def add_goto(l: String) = {
    controlFlow.get(current_pos) match {
      case Some(EventuallyGoto(ts, _)) => controlFlow(current_pos) = EventuallyGoto(ts ++ List(DelayNameResolve(l)))
      case None => controlFlow(current_pos) = EventuallyGoto(List(DelayNameResolve(l)))
      case Some(l) => throw Exception(s"Cannot add goto target to call $l")
    }
  }

  def toIR(): List[EventuallyBlock] =
    blocks
      .map((n, stmts) => {
        val st: Seq[NonCallStatement | EventuallyStatement | EventuallyJump] =
          stmts.map {
            case n: NonCallStatement => (IdentityStatement(n))
          }.toSeq ++ Seq(controlFlow.getOrElse(n, goto()))
        block(n, st: _*)
      })
      .toList

  /** beans **/

  given CoerceExpr: Conversion[RTSym, Expr] with
    def apply(x: RTSym): Expr = x match {
      case e: Expr => e
      case _ => ???
    }

  /* Lift-time semantics */
  def mkBits(n: BigInt, y: BigInt): BV = {
    require(n >= 0)
    BitVecLiteral(extract(y, n), n.toInt)
  }
  def bvextract(e: BV, lo: BigInt, width: BigInt): BV = {
    smt_extract((lo + width - 1).toInt, lo.toInt, e)
  }
  def f_eq_bits(t: BigInt, x: BV, y: BV): Boolean = (smt_bveq(x, y))
  def f_ne_bits(t: BigInt, x: BV, y: BV): Boolean = (!smt_bveq(x, y))
  def f_add_bits(t: BigInt, x: BV, y: BV): BV = (smt_bvadd(x, y))
  def f_sub_bits(t: BigInt, x: BV, y: BV): BV = (smt_bvsub(x, y))
  def f_mul_bits(t: BigInt, x: BV, y: BV): BV = (smt_bvmul(x, y))
  def f_and_bits(t: BigInt, x: BV, y: BV): BV = (smt_bvand(x, y))
  def f_or_bits(t: BigInt, x: BV, y: BV): BV = (smt_bvor(x, y))
  def f_eor_bits(t: BigInt, x: BV, y: BV): BV = (smt_bvxor(x, y))
  def f_not_bits(t: BigInt, x: BV): BV = (smt_bvnot(x))
  def f_slt_bits(t: BigInt, x: BV, y: BV): Boolean = smt_bvslt(x, y)
  def f_sle_bits(t: BigInt, x: BV, y: BV): Boolean = smt_bvsle(x, y)
  def f_zeros_bits(w: BigInt): BV = BitVecLiteral(0, w.toInt)
  def f_ones_bits(w: BigInt): BV = BitVecLiteral(BigInt(2).pow(w.toInt) - 1, w.toInt)
  def f_ZeroExtend(t0: BigInt, t1: BigInt, n: BV, x: BigInt): BV = smt_zero_extend(x.toInt - n.size, n)
  def f_SignExtend(t0: BigInt, t1: BigInt, n: BV, x: BigInt): BV = smt_sign_extend(x.toInt - n.size, n)
  def f_asr_bits(targ0: BigInt, targ1: BigInt, arg0: BV, arg1: BV): BV = smt_bvashr(arg0, arg1)
  def f_lsl_bits(targ0: BigInt, targ1: BigInt, arg0: BV, arg1: BV): BV =
    smt_bvshl(arg0, zero_extend_to(arg0.size, arg1))
  def f_lsr_bits(targ0: BigInt, targ1: BigInt, arg0: BV, arg1: BV): BV =
    smt_bvlshr(arg0, zero_extend_to(arg0.size, arg1))

  def f_decl_bool(arg0: String): RTSym = LocalVar(arg0, BoolType)
  def f_decl_bv(arg0: String, arg1: BigInt): RTSym = LocalVar(arg0, BitVecType(arg1.toInt))
  def f_AtomicEnd(): RTSym = LocalVar("ATOMICEND", BoolType)
  def f_AtomicStart(): RTSym = LocalVar("ATOMICSTART", BoolType)

  def f_replicate_bits(targ0: BigInt, targ1: BigInt, arg0: BV, arg1: BigInt): BV = {
    def bv_replicate(value: BitVecLiteral, times: Int): BitVecLiteral = {
      var walk = BitVecLiteral(0, 0)
      for (i <- 1 to times) {
        walk = smt_concat(value, walk)
      }
      walk
    }

    bv_replicate(arg0, arg1.toInt)
  }
  def f_append_bits(targ0: BigInt, targ1: BigInt, a: BV, b: BV): BV =
    BitVecLiteral((a.value << b.size) + b.value, (a.size + b.size))

  /** Run-time IR program generation */

  def f_gen_BFAdd(arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError()
  def f_gen_BFMul(arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPAdd(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPCompare(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym, arg3: RTSym): RTSym =
    throw NotImplementedError()
  def f_gen_FPCompareEQ(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPCompareGE(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPCompareGT(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPConvert(targ0: BigInt, targ1: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
    throw NotImplementedError()
  def f_gen_FPConvertBF(arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPDiv(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPMax(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPMaxNum(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPMin(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPMinNum(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPMul(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPMulAdd(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym, arg3: RTSym): RTSym =
    throw NotImplementedError()
  def f_gen_FPMulAddH(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym, arg3: RTSym): RTSym =
    throw NotImplementedError()
  def f_gen_FPMulX(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPRSqrtStepFused(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPRecipEstimate(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError()
  def f_gen_UnsignedRSqrtEstimate(targ0: BigInt, arg0: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPRSqrtEstimate(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPRecipStepFused(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPRecpX(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPRoundInt(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym, arg3: RTSym): RTSym =
    throw NotImplementedError()
  def f_gen_FPRoundIntN(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym, arg3: RTSym): RTSym =
    throw NotImplementedError()
  def f_gen_FPSqrt(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPSub(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_FPToFixed(
    targ0: BigInt,
    targ1: BigInt,
    arg0: RTSym,
    arg1: RTSym,
    arg2: RTSym,
    arg3: RTSym,
    arg4: RTSym
  ): RTSym = throw NotImplementedError()
  def f_gen_FPToFixedJS_impl(targ0: BigInt, targ1: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
    throw NotImplementedError()
  def f_gen_FixedToFP(
    targ0: BigInt,
    targ1: BigInt,
    arg0: RTSym,
    arg1: RTSym,
    arg2: RTSym,
    arg3: RTSym,
    arg4: RTSym
  ): RTSym = throw NotImplementedError()
  def f_gen_bit_lit(targ0: BigInt, arg0: BV): RTSym = BitVecLiteral(arg0.value, targ0.toInt)
  def f_gen_bool_lit(arg0: Boolean): RTSym = if arg0 then BitVecLiteral(1, 1) else BitVecLiteral(0, 1)
  def f_gen_branch(arg0: RTSym): RTLabel = gen_branch(arg0)._1
  def f_cvt_bits_uint(targ0: BigInt, arg0: BV): BigInt = arg0.value
  def f_gen_cvt_bits_uint(targ0: BigInt, arg0: RTSym): RTSym = arg0
  def f_gen_cvt_bool_bv(arg0: RTSym): RTSym = arg0
  def f_gen_eor_bits(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = BinaryExpr(BVEQ, arg0, arg1)
  def f_gen_eq_bits(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = BinaryExpr(BVEQ, arg0, arg1)
  def f_gen_eq_enum(arg0: RTSym, arg1: RTSym): RTSym = BinaryExpr(BVEQ, arg0, arg1)
  def f_gen_int_lit(arg0: BigInt): BV = BitVecLiteral(arg0, 1123)
  def f_gen_store(lval: RTSym, e: RTSym): Unit = lval match
    case v: Variable => push_stmt(LocalAssign(v, e))
    case m => throw NotImplementedError(s"fail assign $m")
  def f_gen_load(e: RTSym): RTSym = e match
    case m: Memory => throw NotImplementedError()
    case _ => e

  def f_gen_SignExtend(targ0: BigInt, targ1: BigInt, arg0: RTSym, arg1: BV): RTSym = {
    val oldSize = (targ0)
    val newSize = (targ1)
    if (arg1.value != newSize) {
      throw Exception()
    }
    SignExtend((newSize - oldSize).toInt, arg0)
  }
  def f_gen_ZeroExtend(targ0: BigInt, targ1: BigInt, arg0: RTSym, arg1: BV): RTSym = {
    val oldSize = (targ0)
    val newSize = (targ1)
    if (arg1.value != newSize) {
      throw Exception()
    }
    ZeroExtend((newSize - oldSize).toInt, arg0)
  }
  def f_gen_add_bits(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = BinaryExpr(BVADD, arg0, arg1)
  def f_gen_and_bits(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = BinaryExpr(BVAND, arg0, arg1)

  def f_gen_and_bool(arg0: RTSym, arg1: RTSym): RTSym = BinaryExpr(BoolAND, arg0, arg1)
  def f_gen_asr_bits(targ0: BigInt, targ1: BigInt, arg0: RTSym, arg1: RTSym): RTSym =
    BinaryExpr(BVASHR, arg0, gen_zero_extend_to(targ0, arg1))
  def f_gen_lsl_bits(targ0: BigInt, targ1: BigInt, arg0: RTSym, arg1: RTSym): RTSym =
    BinaryExpr(BVSHL, arg0, gen_zero_extend_to(targ0, arg1))
  def f_gen_lsr_bits(targ0: BigInt, targ1: BigInt, arg0: RTSym, arg1: RTSym): RTSym =
    BinaryExpr(BVLSHR, arg0, gen_zero_extend_to(targ0, arg1))
  def f_gen_mul_bits(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = BinaryExpr(BVMUL, arg0, arg1)
  def f_gen_ne_bits(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = UnaryExpr(BoolNOT, BinaryExpr(BVEQ, arg0, arg1))
  def f_gen_not_bits(targ0: BigInt, arg0: RTSym): RTSym = arg0.getType match {
    case BoolType => UnaryExpr(BoolNOT, arg0)
    case BitVecType(_) => UnaryExpr(BVNOT, arg0)
    case _: MapType => throw IllegalArgumentException()
    case IntType => throw IllegalArgumentException()
  }

  def f_gen_not_bool(arg0: RTSym): RTSym = arg0.getType match {
    case BoolType => UnaryExpr(BoolNOT, arg0)
    case BitVecType(sz) => BinaryExpr(BVNEQ, BitVecLiteral(0, sz), arg0)
    case _: MapType => throw IllegalArgumentException()
    case IntType => throw IllegalArgumentException()
  }

  def f_gen_or_bits(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError()
  def f_gen_or_bool(arg0: RTSym, arg1: RTSym): RTSym = BinaryExpr(BVOR, arg0, arg1)
  def f_gen_sdiv_bits(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = BinaryExpr(BoolOR, arg0, arg1)
  def f_gen_sle_bits(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = BinaryExpr(BVSLE, arg0, arg1)
  def f_gen_slt_bits(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = BinaryExpr(BVSLT, arg0, arg1)
  def f_gen_sub_bits(targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = BinaryExpr(BVADD, arg0, UnaryExpr(BVNOT, arg1))
  def f_gen_AArch64_MemTag_set(arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError()
  def f_gen_AArch64_MemTag_read(arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError()
  def f_gen_Mem_read(targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = {
    val s: Int = arg2 match
      case BitVecLiteral(v, s) => v.toInt
      case IntLiteral(v) => v.toInt
      case _ => throw NotImplementedError(s"Cannot convert $arg2 to int")
    SymLoad(memory, arg1, endian, s)
  }
  def f_gen_slice(e: RTSym, lo: BigInt, wd: BigInt): RTSym = Extract((wd + lo).toInt, lo.toInt, e)
  def f_gen_replicate_bits(targ0: BigInt, targ1: BigInt, arg0: RTSym, arg1: BV): RTSym =
    Range.Exclusive(1, arg1.value.toInt, 1).map(v => arg0).foldLeft(arg0)((a, b) => (BinaryExpr(BVCONCAT, a, b)))
  def f_gen_append_bits(targ0: BigInt, targ1: BigInt, arg0: RTSym, arg1: RTSym): RTSym =
    BinaryExpr(BVCONCAT, arg0, arg1)

  def f_gen_array_load(arg0: RTSym, arg1: BigInt): RTSym = arg0 match
    case Register("_R", t) => Register("R" + arg1, 64)
    case _ => {
      Logger.warn(s"Unknown array load $arg0")
      arg0
    }
  def f_gen_array_store(arg0: RTSym, arg1: BigInt, arg2: RTSym): Unit = arg0 match
    case Register(n, t) if n.contains("R") => push_stmt(LocalAssign(Register("R" + arg1, 64), arg2))
    case _ => Logger.warn(s"Unknown array store $arg0")

  def f_gen_Mem_set(sz: BigInt, ptr: RTSym, width: BV, acctype: RTSym, value: RTSym): Unit =
    assert(width.value == sz)
    val stmt = MemoryStore(memory, ptr, value, endian, sz.toInt)
    push_stmt(stmt)

  def f_gen_assert(arg0: RTSym): Unit = {
    push_stmt(Assert(arg0))
  }

  def f_switch_context(arg0: RTLabel): Unit = {
    switch_ctx(arg0)
  }

  def f_true_branch(arg0: RTLabel): RTLabel = (branches(arg0))._1
  def f_false_branch(arg0: RTLabel): RTLabel = (branches(arg0))._2
  def f_merge_branch(arg0: RTLabel): RTLabel = (branches(arg0))._3

  /** Global variable definitions * */

  def rTLabelDefault: RTLabel = "undef"
  def rTSymDefault: RTSym = null
  def rTExprDefault: RTSym = null

  def v_PSTATE_UAO: Mutable[RTSym] = throw NotImplementedError()
  def v_PSTATE_PAN: Mutable[RTSym] = throw NotImplementedError()
  def v_PSTATE_DIT: Mutable[RTSym] = throw NotImplementedError()
  def v_PSTATE_SSBS: Mutable[RTSym] = throw NotImplementedError()
  def v_PSTATE_G: Mutable[RTSym] = throw NotImplementedError()
  def v_PSTATE_A: Mutable[RTSym] = throw NotImplementedError()
  def v_PSTATE_I: Mutable[RTSym] = throw NotImplementedError()
  def v_PSTATE_F: Mutable[RTSym] = throw NotImplementedError()
  def v_PSTATE_D: Mutable[RTSym] = throw NotImplementedError()
  def v_PSTATE_C = Mutable(Register("PSTATE.C", 1)) // Expr_Field(Expr_Var(Ident "PSTATE"), Ident "C")
  def v_PSTATE_Z = Mutable(Register("PSTATE.Z", 1)) // Expr_Field(Expr_Var(Ident "PSTATE"), Ident "Z")
  def v_PSTATE_V = Mutable(Register("PSTATE.V", 1)) // Expr_Field(Expr_Var(Ident "PSTATE"), Ident "V")
  def v_PSTATE_N = Mutable(Register("PSTATE.N", 1)) // Expr_Field(Expr_Var(Ident "PSTATE"), Ident "N")

  def v__PC = Mutable(Register("_PC", 64))
  def v__R = Mutable(Register("_R", 128))
  def v__Z = Mutable(Register("_Z", 1))
  def v_SP_EL0 = Mutable(Register("R31", 64))
  def v_FPSR = Mutable(Register("FPSR", 1))
  def v_FPCR = Mutable(Register("FPCR", (32)))

  def v_PSTATE_BTYPE = Mutable(Register("PSTATE.BTYPE", 1))
  def v_BTypeCompatible = Mutable(Register("BTypeCompatible", 1))
  def v___BranchTaken = Mutable(Register("__BranchTaken", 1))
  def v_BTypeNext = Mutable(Register("BTypeNext", 1))
  def v___ExclusiveLocal = Mutable(Register("__ExclusiveLocal", 1))

}

def extract(x: BigInt, sz: BigInt) = x % (BigInt(2).pow((sz + 1).toInt))

def mkBits(st: BasilLiftState, n: BigInt, y: BigInt): BitVecLiteral = {
  require(n >= 0)
  BitVecLiteral(extract(y, n), n.toInt)
}

def zero_extend_to(s: BigInt, x: BitVecLiteral) = {
  require(s > x.size)
  BitVecLiteral(x.value, s.toInt)
}

def gen_zero_extend_to(s: BigInt, x: Expr) = {
  x.getType match {
    case BitVecType(sz) => ZeroExtend((s - sz).toInt, x)
    case _ => throw Exception("Type mismatch gen_zero_extend_to")
  }
}

def bvextract(st: BasilLiftState, e: BitVecLiteral, lo: BigInt, width: BigInt): BitVecLiteral =
  smt_extract((lo + width - 1).toInt, lo.toInt, e)

def f_eq_bits(st: BasilLiftState, t: BigInt, x: BitVecLiteral, y: BitVecLiteral): Boolean = (smt_bveq(x, y))

def f_ne_bits(st: BasilLiftState, t: BigInt, x: BitVecLiteral, y: BitVecLiteral): Boolean = (!smt_bveq(x, y))

def f_add_bits(st: BasilLiftState, t: BigInt, x: BitVecLiteral, y: BitVecLiteral): BitVecLiteral = (smt_bvadd(x, y))

def f_sub_bits(st: BasilLiftState, t: BigInt, x: BitVecLiteral, y: BitVecLiteral): BitVecLiteral = (smt_bvsub(x, y))

def f_mul_bits(st: BasilLiftState, t: BigInt, x: BitVecLiteral, y: BitVecLiteral): BitVecLiteral = (smt_bvmul(x, y))

def f_and_bits(st: BasilLiftState, t: BigInt, x: BitVecLiteral, y: BitVecLiteral): BitVecLiteral = (smt_bvand(x, y))

def f_or_bits(st: BasilLiftState, t: BigInt, x: BitVecLiteral, y: BitVecLiteral): BitVecLiteral = (smt_bvor(x, y))

def f_eor_bits(st: BasilLiftState, t: BigInt, x: BitVecLiteral, y: BitVecLiteral): BitVecLiteral = (smt_bvxor(x, y))

def f_not_bits(st: BasilLiftState, t: BigInt, x: BitVecLiteral): BitVecLiteral = (smt_bvnot(x))

def f_slt_bits(st: BasilLiftState, t: BigInt, x: BitVecLiteral, y: BitVecLiteral): Boolean =
  smt_bvslt(x, y)

def f_sle_bits(st: BasilLiftState, t: BigInt, x: BitVecLiteral, y: BitVecLiteral): Boolean =
  smt_bvsle(x, y)

def f_zeros_bits(st: BasilLiftState, w: BigInt): BitVecLiteral = BitVecLiteral(0, w.toInt)

def f_ones_bits(st: BasilLiftState, w: BigInt): BitVecLiteral = BitVecLiteral(BigInt(2).pow(w.toInt) - 1, w.toInt)

def f_ZeroExtend(st: BasilLiftState, t0: BigInt, t1: BigInt, n: BitVecLiteral, x: BigInt): BitVecLiteral =
  smt_zero_extend(x.toInt - n.size, n)

def f_SignExtend(st: BasilLiftState, t0: BigInt, t1: BigInt, n: BitVecLiteral, x: BigInt): BitVecLiteral =
  smt_sign_extend(x.toInt - n.size, n)

def f_asr_bits(
  st: BasilLiftState,
  targ0: BigInt,
  targ1: BigInt,
  arg0: BitVecLiteral,
  arg1: BitVecLiteral
): BitVecLiteral =
  smt_bvashr(arg0, arg1)

def f_lsl_bits(
  st: BasilLiftState,
  targ0: BigInt,
  targ1: BigInt,
  arg0: BitVecLiteral,
  arg1: BitVecLiteral
): BitVecLiteral =
  smt_bvshl(arg0, zero_extend_to(arg0.size, arg1))

def f_lsr_bits(
  st: BasilLiftState,
  targ0: BigInt,
  targ1: BigInt,
  arg0: BitVecLiteral,
  arg1: BitVecLiteral
): BitVecLiteral =
  smt_bvlshr(arg0, zero_extend_to(arg0.size, arg1))

def f_decl_bool(st: BasilLiftState, arg0: String): RTSym = LocalVar(arg0, BoolType)
def f_decl_bv(st: BasilLiftState, arg0: String, arg1: BigInt): RTSym = LocalVar(arg0, BitVecType(arg1.toInt))

def f_gen_BFAdd(st: BasilLiftState, arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError("func not implemented")
def f_gen_BFMul(st: BasilLiftState, arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError("func not implemented")

def f_gen_FPAdd(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPCompare(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym, arg3: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPCompareEQ(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPCompareGE(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPCompareGT(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPConvert(st: BasilLiftState, targ0: BigInt, targ1: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPConvertBF(st: BasilLiftState, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym = throw NotImplementedError(
  "func not implemented"
)
def f_gen_FPDiv(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPMax(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPMaxNum(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPMin(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPMinNum(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPMul(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPMulAdd(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym, arg3: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPMulAddH(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym, arg3: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPMulX(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPRSqrtStepFused(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPRecipEstimate(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPRecipStepFused(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPRecpX(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError(
  "func not implemented"
)
def f_gen_FPRoundInt(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym, arg3: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPRoundIntN(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym, arg3: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPSqrt(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym): RTSym = throw NotImplementedError(
  "func not implemented"
)
def f_gen_FPSub(st: BasilLiftState, targ0: BigInt, arg0: RTSym, arg1: RTSym, arg2: RTSym): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FPToFixed(
  st: BasilLiftState,
  targ0: BigInt,
  targ1: BigInt,
  arg0: RTSym,
  arg1: RTSym,
  arg2: RTSym,
  arg3: RTSym,
  arg4: RTSym
): RTSym = throw NotImplementedError("func not implemented")
def f_gen_FPToFixedJS_impl(
  st: BasilLiftState,
  targ0: BigInt,
  targ1: BigInt,
  arg0: RTSym,
  arg1: RTSym,
  arg2: RTSym
): RTSym =
  throw NotImplementedError("func not implemented")
def f_gen_FixedToFP(
  st: BasilLiftState,
  targ0: BigInt,
  targ1: BigInt,
  arg0: RTSym,
  arg1: RTSym,
  arg2: RTSym,
  arg3: RTSym,
  arg4: RTSym
): RTSym = throw NotImplementedError("func not implemented")


object Lifter {

  def liftOpcode(op: BigInt, sp: BigInt, liftState: BasilLiftState = BasilLiftState()) = {
    /* Invoking the lifter */
    val dec =
      f_A64_decoder[Expr | SymLoad, String, BitVecLiteral](liftState, BitVecLiteral(op, 32), BitVecLiteral(sp, 64))
    dec
  }

}
