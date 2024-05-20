/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_arithmetic_rev (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2)))) then {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000010000000000", 2)))) then {
      val v_X_read5__2 = Mutable[Expr](rTExprDefault)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
        v_X_read5__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      } else {
        v_X_read5__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
      }
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(8), BigInt(56), f_gen_slice(v_st, v_X_read5__2.v, BigInt(48), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(48), f_gen_slice(v_st, v_X_read5__2.v, BigInt(56), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(40), f_gen_slice(v_st, v_X_read5__2.v, BigInt(32), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(32), f_gen_slice(v_st, v_X_read5__2.v, BigInt(40), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(24), f_gen_slice(v_st, v_X_read5__2.v, BigInt(16), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(16), f_gen_slice(v_st, v_X_read5__2.v, BigInt(24), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_X_read5__2.v, BigInt(0), BigInt(8)), f_gen_slice(v_st, v_X_read5__2.v, BigInt(8), BigInt(8))))))))))
      }
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2)))) then {
        val v_X_read14__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
          v_X_read14__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        } else {
          v_X_read14__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
        }
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(24), BigInt(40), f_gen_append_bits(v_st, BigInt(16), BigInt(8), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_X_read14__2.v, BigInt(32), BigInt(8)), f_gen_slice(v_st, v_X_read14__2.v, BigInt(40), BigInt(8))), f_gen_slice(v_st, v_X_read14__2.v, BigInt(48), BigInt(8))), f_gen_append_bits(v_st, BigInt(8), BigInt(32), f_gen_slice(v_st, v_X_read14__2.v, BigInt(56), BigInt(8)), f_gen_append_bits(v_st, BigInt(24), BigInt(8), f_gen_append_bits(v_st, BigInt(16), BigInt(8), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_X_read14__2.v, BigInt(0), BigInt(8)), f_gen_slice(v_st, v_X_read14__2.v, BigInt(8), BigInt(8))), f_gen_slice(v_st, v_X_read14__2.v, BigInt(16), BigInt(8))), f_gen_slice(v_st, v_X_read14__2.v, BigInt(24), BigInt(8))))))
        }
      } else {
        val v_X_read23__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
          v_X_read23__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        } else {
          v_X_read23__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
        }
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(56), BigInt(8), f_gen_append_bits(v_st, BigInt(48), BigInt(8), f_gen_append_bits(v_st, BigInt(40), BigInt(8), f_gen_append_bits(v_st, BigInt(32), BigInt(8), f_gen_append_bits(v_st, BigInt(24), BigInt(8), f_gen_append_bits(v_st, BigInt(16), BigInt(8), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_X_read23__2.v, BigInt(0), BigInt(8)), f_gen_slice(v_st, v_X_read23__2.v, BigInt(8), BigInt(8))), f_gen_slice(v_st, v_X_read23__2.v, BigInt(16), BigInt(8))), f_gen_slice(v_st, v_X_read23__2.v, BigInt(24), BigInt(8))), f_gen_slice(v_st, v_X_read23__2.v, BigInt(32), BigInt(8))), f_gen_slice(v_st, v_X_read23__2.v, BigInt(40), BigInt(8))), f_gen_slice(v_st, v_X_read23__2.v, BigInt(48), BigInt(8))), f_gen_slice(v_st, v_X_read23__2.v, BigInt(56), BigInt(8))))
        }
      }
    }
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000010000000000", 2)))) then {
      val v_X_read33__2 = Mutable[Expr](rTExprDefault)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
        v_X_read33__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
      } else {
        v_X_read33__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
      }
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_append_bits(v_st, BigInt(8), BigInt(24), f_gen_slice(v_st, v_X_read33__2.v, BigInt(16), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(16), f_gen_slice(v_st, v_X_read33__2.v, BigInt(24), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_X_read33__2.v, BigInt(0), BigInt(8)), f_gen_slice(v_st, v_X_read33__2.v, BigInt(8), BigInt(8))))), f_gen_int_lit(v_st, BigInt(64))))
      }
    } else {
      val v_X_read42__2 = Mutable[Expr](rTExprDefault)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
        v_X_read42__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
      } else {
        v_X_read42__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
      }
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_append_bits(v_st, BigInt(24), BigInt(8), f_gen_append_bits(v_st, BigInt(16), BigInt(8), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_X_read42__2.v, BigInt(0), BigInt(8)), f_gen_slice(v_st, v_X_read42__2.v, BigInt(8), BigInt(8))), f_gen_slice(v_st, v_X_read42__2.v, BigInt(16), BigInt(8))), f_gen_slice(v_st, v_X_read42__2.v, BigInt(24), BigInt(8))), f_gen_int_lit(v_st, BigInt(64))))
      }
    }
  }
}
