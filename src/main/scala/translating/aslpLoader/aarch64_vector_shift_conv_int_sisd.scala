/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_shift_conv_int_sisd (v_st: LiftState,v_enc: BV) : Unit = {
  val v_Exp3__1 : Boolean = f_eq_bits(v_st, BigInt(4), f_and_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), mkBits(v_st, 4, BigInt("1110", 2))), mkBits(v_st, 4, BigInt("0000", 2))) 
  val v_If4__1 = Mutable[Boolean](true)
  if (v_Exp3__1) then {
    v_If4__1.v = true
  } else {
    val v_Exp5__1 : Boolean = f_eq_bits(v_st, BigInt(4), f_and_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), mkBits(v_st, 4, BigInt("1110", 2))), mkBits(v_st, 4, BigInt("0010", 2))) 
    val v_If6__1 = Mutable[Boolean](true)
    if (v_Exp5__1) then {
      v_If6__1.v = false
    } else {
      v_If6__1.v = false
    }
    v_If4__1.v = v_If6__1.v
  }
  if (v_If4__1.v) then {
    throw Exception("not supported")
  } else {
    val v_Exp8__1 : Boolean = f_eq_bits(v_st, BigInt(4), f_and_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), mkBits(v_st, 4, BigInt("1000", 2))), mkBits(v_st, 4, BigInt("1000", 2))) 
    if (v_Exp8__1) then {
      val v_FPDecodeRounding12__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding12__3", BigInt(3)) 
      val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp0))
      f_gen_store (v_st,v_FPDecodeRounding12__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp0))
      val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp1))
      f_gen_store (v_st,v_FPDecodeRounding12__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp1))
      val v_temp2 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp2))
      f_gen_store (v_st,v_FPDecodeRounding12__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp2))
      val v_temp3 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp3))
      f_gen_store (v_st,v_FPDecodeRounding12__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp3))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      val v_Exp19__2 = Mutable[Expr](rTExprDefault)
      v_Exp19__2.v = f_gen_FixedToFP(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, ((BigInt(128)) - (f_cvt_bits_uint(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))))))), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding12__3)))
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_Exp19__2.v, f_gen_int_lit(v_st, BigInt(128))))
    } else {
      val v_Exp26__1 : Boolean = f_eq_bits(v_st, BigInt(4), f_and_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), mkBits(v_st, 4, BigInt("1100", 2))), mkBits(v_st, 4, BigInt("0100", 2))) 
      if (v_Exp26__1) then {
        val v_FPDecodeRounding30__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding30__3", BigInt(3)) 
        val v_temp4 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp4))
        f_gen_store (v_st,v_FPDecodeRounding30__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
        f_switch_context (v_st,f_false_branch(v_st, v_temp4))
        val v_temp5 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp5))
        f_gen_store (v_st,v_FPDecodeRounding30__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
        f_switch_context (v_st,f_false_branch(v_st, v_temp5))
        val v_temp6 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp6))
        f_gen_store (v_st,v_FPDecodeRounding30__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
        f_switch_context (v_st,f_false_branch(v_st, v_temp6))
        val v_temp7 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp7))
        f_gen_store (v_st,v_FPDecodeRounding30__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
        f_switch_context (v_st,f_false_branch(v_st, v_temp7))
        f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp4))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        val v_Exp37__2 = Mutable[Expr](rTExprDefault)
        v_Exp37__2.v = f_gen_FixedToFP(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))))))), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding30__3)))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_Exp37__2.v, f_gen_int_lit(v_st, BigInt(128))))
      } else {
        val v_FPDecodeRounding47__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding47__3", BigInt(3)) 
        val v_temp8 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp8))
        f_gen_store (v_st,v_FPDecodeRounding47__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
        f_switch_context (v_st,f_false_branch(v_st, v_temp8))
        val v_temp9 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp9))
        f_gen_store (v_st,v_FPDecodeRounding47__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
        f_switch_context (v_st,f_false_branch(v_st, v_temp9))
        val v_temp10 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp10))
        f_gen_store (v_st,v_FPDecodeRounding47__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
        f_switch_context (v_st,f_false_branch(v_st, v_temp10))
        val v_temp11 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp11))
        f_gen_store (v_st,v_FPDecodeRounding47__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
        f_switch_context (v_st,f_false_branch(v_st, v_temp11))
        f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp8))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        val v_Exp54__2 = Mutable[Expr](rTExprDefault)
        v_Exp54__2.v = f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, ((BigInt(32)) - (f_cvt_bits_uint(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))))))), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding47__3)))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_Exp54__2.v, f_gen_int_lit(v_st, BigInt(128))))
      }
    }
  }
}
