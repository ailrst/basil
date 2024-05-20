/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_float_arithmetic_round_frint (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_exact__1 = Mutable[Boolean](false)
    val v_rounding__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_FPDecodeRounding4__2 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
      v_FPDecodeRounding4__2.v = f_ZeroExtend(v_st, BigInt(2), BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), BigInt(3))
      v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), v_FPDecodeRounding4__2.v)
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000111000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000100000000000000000", 2)))) then {
        v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("100", 2)))
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000111000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000110000000000000000", 2)))) then {
          val v_FPDecodeRounding8__3 = Mutable[Expr](rTExprDefault)
          v_FPDecodeRounding8__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
          v_rounding__1.v = v_FPDecodeRounding8__3.v
          v_exact__1.v = true
        } else {
          val v_FPDecodeRounding12__3 = Mutable[Expr](rTExprDefault)
          v_FPDecodeRounding12__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
          v_rounding__1.v = v_FPDecodeRounding12__3.v
        }
      }
    }
    val v_Exp20__2 = Mutable[Expr](rTExprDefault)
    v_Exp20__2.v = f_gen_FPRoundInt(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_Exp20__2.v, f_gen_int_lit(v_st, BigInt(128))))
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
      val v_exact__1 = Mutable[Boolean](false)
      val v_rounding__1 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_FPDecodeRounding27__2 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
        v_FPDecodeRounding27__2.v = f_ZeroExtend(v_st, BigInt(2), BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), BigInt(3))
        v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), v_FPDecodeRounding27__2.v)
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000111000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000100000000000000000", 2)))) then {
          v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("100", 2)))
        } else {
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000111000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000110000000000000000", 2)))) then {
            val v_FPDecodeRounding31__3 = Mutable[Expr](rTExprDefault)
            v_FPDecodeRounding31__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
            v_rounding__1.v = v_FPDecodeRounding31__3.v
            v_exact__1.v = true
          } else {
            val v_FPDecodeRounding35__3 = Mutable[Expr](rTExprDefault)
            v_FPDecodeRounding35__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
            v_rounding__1.v = v_FPDecodeRounding35__3.v
          }
        }
      }
      val v_Exp43__2 = Mutable[Expr](rTExprDefault)
      v_Exp43__2.v = f_gen_FPRoundInt(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_Exp43__2.v, f_gen_int_lit(v_st, BigInt(128))))
    } else {
      val v_exact__1 = Mutable[Boolean](false)
      val v_rounding__1 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_FPDecodeRounding52__2 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
        v_FPDecodeRounding52__2.v = f_ZeroExtend(v_st, BigInt(2), BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), BigInt(3))
        v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), v_FPDecodeRounding52__2.v)
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000111000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000100000000000000000", 2)))) then {
          v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("100", 2)))
        } else {
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000111000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000110000000000000000", 2)))) then {
            val v_FPDecodeRounding56__3 = Mutable[Expr](rTExprDefault)
            v_FPDecodeRounding56__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
            v_rounding__1.v = v_FPDecodeRounding56__3.v
            v_exact__1.v = true
          } else {
            val v_FPDecodeRounding60__3 = Mutable[Expr](rTExprDefault)
            v_FPDecodeRounding60__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
            v_rounding__1.v = v_FPDecodeRounding60__3.v
          }
        }
      }
      val v_Exp68__2 = Mutable[Expr](rTExprDefault)
      v_Exp68__2.v = f_gen_FPRoundInt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_Exp68__2.v, f_gen_int_lit(v_st, BigInt(128))))
    }
  }
}
