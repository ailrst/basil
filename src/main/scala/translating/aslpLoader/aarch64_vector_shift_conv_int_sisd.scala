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
      val v_FPDecodeRounding12__3 = Mutable[Expr](rTExprDefault)
      v_FPDecodeRounding12__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      val v_Exp19__2 = Mutable[Expr](rTExprDefault)
      v_Exp19__2.v = f_gen_FixedToFP(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, ((BigInt(128)) - (f_cvt_bits_uint(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))))))), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding12__3.v))
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_Exp19__2.v, f_gen_int_lit(v_st, BigInt(128))))
    } else {
      val v_Exp26__1 : Boolean = f_eq_bits(v_st, BigInt(4), f_and_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), mkBits(v_st, 4, BigInt("1100", 2))), mkBits(v_st, 4, BigInt("0100", 2))) 
      if (v_Exp26__1) then {
        val v_FPDecodeRounding30__3 = Mutable[Expr](rTExprDefault)
        v_FPDecodeRounding30__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        val v_Exp37__2 = Mutable[Expr](rTExprDefault)
        v_Exp37__2.v = f_gen_FixedToFP(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))))))), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding30__3.v))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_Exp37__2.v, f_gen_int_lit(v_st, BigInt(128))))
      } else {
        val v_FPDecodeRounding47__3 = Mutable[Expr](rTExprDefault)
        v_FPDecodeRounding47__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        val v_Exp54__2 = Mutable[Expr](rTExprDefault)
        v_Exp54__2.v = f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, ((BigInt(32)) - (f_cvt_bits_uint(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))))))), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding47__3.v))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_Exp54__2.v, f_gen_int_lit(v_st, BigInt(128))))
      }
    }
  }
}
