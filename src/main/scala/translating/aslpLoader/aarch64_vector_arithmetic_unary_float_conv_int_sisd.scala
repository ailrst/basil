/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_float_conv_int_sisd (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_Exp6__2 = Mutable[Expr](rTExprDefault)
    v_Exp6__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_FPDecodeRounding9__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding9__3", BigInt(3)) 
    val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
    f_switch_context (v_st,f_true_branch(v_st, v_temp0))
    f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
    f_switch_context (v_st,f_false_branch(v_st, v_temp0))
    val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))) 
    f_switch_context (v_st,f_true_branch(v_st, v_temp1))
    f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
    f_switch_context (v_st,f_false_branch(v_st, v_temp1))
    val v_temp2 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))) 
    f_switch_context (v_st,f_true_branch(v_st, v_temp2))
    f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
    f_switch_context (v_st,f_false_branch(v_st, v_temp2))
    val v_temp3 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2))))) 
    f_switch_context (v_st,f_true_branch(v_st, v_temp3))
    f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
    f_switch_context (v_st,f_false_branch(v_st, v_temp3))
    f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
    f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
    val v_Exp13__2 = Mutable[Expr](rTExprDefault)
    v_Exp13__2.v = f_gen_FixedToFP(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, v_Exp6__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3)))
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_Exp13__2.v, f_gen_int_lit(v_st, BigInt(128))))
  } else {
    if (f_eq_bits(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      val v_Exp23__2 = Mutable[Expr](rTExprDefault)
      v_Exp23__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_FPDecodeRounding26__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding26__3", BigInt(3)) 
      val v_temp4 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp4))
      f_gen_store (v_st,v_FPDecodeRounding26__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp4))
      val v_temp5 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp5))
      f_gen_store (v_st,v_FPDecodeRounding26__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp5))
      val v_temp6 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp6))
      f_gen_store (v_st,v_FPDecodeRounding26__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp6))
      val v_temp7 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp7))
      f_gen_store (v_st,v_FPDecodeRounding26__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp7))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp4))
      val v_Exp30__2 = Mutable[Expr](rTExprDefault)
      v_Exp30__2.v = f_gen_FixedToFP(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, v_Exp23__2.v, BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding26__3)))
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_Exp30__2.v, f_gen_int_lit(v_st, BigInt(128))))
    } else {
      throw Exception("not supported")
    }
  }
}
