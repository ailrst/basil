/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_cmp_fp16_lessthan_sisd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  val v_Exp12__2 = Mutable[Expr](rTExprDefault)
  v_Exp12__2.v = f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
  val v_If14__1 : RTSym = f_decl_bv(v_st, "If14__1", BigInt(16)) 
  val v_temp0 : RTLabel = f_gen_branch(v_st, v_Exp12__2.v) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp0))
  f_gen_store (v_st,v_If14__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1111111111111111", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp0))
  f_gen_store (v_st,v_If14__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
  f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_If14__1), f_gen_int_lit(v_st, BigInt(128))))
}
