/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_float_arithmetic_round_frint_32_64 (v_st: LiftState,v_enc: BV) : Unit = {
  val v_Exp5__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2))) 
  if (v_Exp5__1) then {
    val v_If6__1 = Mutable[BV](mkBits(v_st, BigInt(7), BigInt(0)))
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
      v_If6__1.v = mkBits(v_st, 7, BigInt("0100000", 2))
    } else {
      v_If6__1.v = mkBits(v_st, 7, BigInt("1000000", 2))
    }
    val v_If7__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(15),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
      v_If7__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2)))
    } else {
      val v_FPDecodeRounding10__3 = Mutable[Expr](rTExprDefault)
      v_FPDecodeRounding10__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
      v_If7__1.v = v_FPDecodeRounding10__3.v
    }
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_Exp16__2 = Mutable[Expr](rTExprDefault)
    v_Exp16__2.v = f_gen_FPRoundIntN(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_If7__1.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If6__1.v)))
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_Exp16__2.v, f_gen_int_lit(v_st, BigInt(128))))
  } else {
    val v_Exp22__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2))) 
    if (v_Exp22__1) then {
      val v_If23__1 = Mutable[BV](mkBits(v_st, BigInt(7), BigInt(0)))
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
        v_If23__1.v = mkBits(v_st, 7, BigInt("0100000", 2))
      } else {
        v_If23__1.v = mkBits(v_st, 7, BigInt("1000000", 2))
      }
      val v_If24__1 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(15),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
        v_If24__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2)))
      } else {
        val v_FPDecodeRounding27__3 = Mutable[Expr](rTExprDefault)
        v_FPDecodeRounding27__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
        v_If24__1.v = v_FPDecodeRounding27__3.v
      }
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      val v_Exp33__2 = Mutable[Expr](rTExprDefault)
      v_Exp33__2.v = f_gen_FPRoundIntN(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_If24__1.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If23__1.v)))
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_Exp33__2.v, f_gen_int_lit(v_st, BigInt(128))))
    } else {
      throw Exception("not supported")
    }
  }
}
