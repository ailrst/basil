/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_cmp_float_lessthan_sisd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_Exp12__2 = Mutable[Expr](rTExprDefault)
    v_Exp12__2.v = f_gen_FPCompareGT(v_st, BigInt(32), f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
    val v_If14__1 : RTSym = f_decl_bv(v_st, "If14__1", BigInt(32)) 
    val v_temp0 : RTLabel = f_gen_branch(v_st, v_Exp12__2.v) 
    f_switch_context (v_st,f_true_branch(v_st, v_temp0))
    f_gen_store (v_st,v_If14__1,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
    f_switch_context (v_st,f_false_branch(v_st, v_temp0))
    f_gen_store (v_st,v_If14__1,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))
    f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_If14__1), f_gen_int_lit(v_st, BigInt(128))))
  } else {
    val v_Exp32__2 = Mutable[Expr](rTExprDefault)
    v_Exp32__2.v = f_gen_FPCompareGT(v_st, BigInt(64), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
    val v_If34__1 : RTSym = f_decl_bv(v_st, "If34__1", BigInt(64)) 
    val v_temp1 : RTLabel = f_gen_branch(v_st, v_Exp32__2.v) 
    f_switch_context (v_st,f_true_branch(v_st, v_temp1))
    f_gen_store (v_st,v_If34__1,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2))))
    f_switch_context (v_st,f_false_branch(v_st, v_temp1))
    f_gen_store (v_st,v_If34__1,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    f_switch_context (v_st,f_merge_branch(v_st, v_temp1))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_If34__1), f_gen_int_lit(v_st, BigInt(128))))
  }
}
