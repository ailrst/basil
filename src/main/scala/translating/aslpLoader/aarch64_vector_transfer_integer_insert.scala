/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_transfer_integer_insert (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000010000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000010000000000000000", 2)))) then {
    val v_X_read7__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_X_read7__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8))
    } else {
      v_X_read7__2.v = f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))
    }
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_or_bits(v_st, BigInt(128), f_gen_and_bits(v_st, BigInt(128), f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), f_gen_bit_lit(v_st, BigInt(128), f_not_bits(v_st, BigInt(128), f_lsl_bits(v_st, BigInt(128), BigInt(8), mkBits(v_st, 128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111", 2)), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(4), BigInt(7), bvextract(v_st,v_enc,BigInt(17),BigInt(4)), BigInt(7)), mkBits(v_st, 7, BigInt("0001000", 2))), BigInt(8)))))), f_gen_lsl_bits(v_st, BigInt(128), BigInt(8), f_gen_ZeroExtend(v_st, BigInt(8), BigInt(128), v_X_read7__2.v, f_gen_int_lit(v_st, BigInt(128))), f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(4), BigInt(7), bvextract(v_st,v_enc,BigInt(17),BigInt(4)), BigInt(7)), mkBits(v_st, 7, BigInt("0001000", 2))), BigInt(8))))))
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000100000000000000000", 2)))) then {
      val v_X_read26__2 = Mutable[Expr](rTExprDefault)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
        v_X_read26__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16))
      } else {
        v_X_read26__2.v = f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2)))
      }
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_or_bits(v_st, BigInt(128), f_gen_and_bits(v_st, BigInt(128), f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), f_gen_bit_lit(v_st, BigInt(128), f_not_bits(v_st, BigInt(128), f_lsl_bits(v_st, BigInt(128), BigInt(8), mkBits(v_st, 128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111", 2)), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(3), BigInt(7), bvextract(v_st,v_enc,BigInt(18),BigInt(3)), BigInt(7)), mkBits(v_st, 7, BigInt("0010000", 2))), BigInt(8)))))), f_gen_lsl_bits(v_st, BigInt(128), BigInt(8), f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_X_read26__2.v, f_gen_int_lit(v_st, BigInt(128))), f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(3), BigInt(7), bvextract(v_st,v_enc,BigInt(18),BigInt(3)), BigInt(7)), mkBits(v_st, 7, BigInt("0010000", 2))), BigInt(8))))))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000001000000000000000000", 2)))) then {
        val v_X_read45__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
          v_X_read45__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
        } else {
          v_X_read45__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_or_bits(v_st, BigInt(128), f_gen_and_bits(v_st, BigInt(128), f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), f_gen_bit_lit(v_st, BigInt(128), f_not_bits(v_st, BigInt(128), f_lsl_bits(v_st, BigInt(128), BigInt(8), mkBits(v_st, 128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111111111111111111111111", 2)), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(2), BigInt(7), bvextract(v_st,v_enc,BigInt(19),BigInt(2)), BigInt(7)), mkBits(v_st, 7, BigInt("0100000", 2))), BigInt(8)))))), f_gen_lsl_bits(v_st, BigInt(128), BigInt(8), f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_X_read45__2.v, f_gen_int_lit(v_st, BigInt(128))), f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(2), BigInt(7), bvextract(v_st,v_enc,BigInt(19),BigInt(2)), BigInt(7)), mkBits(v_st, 7, BigInt("0100000", 2))), BigInt(8))))))
      } else {
        val v_X_read64__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
          v_X_read64__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        } else {
          v_X_read64__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_or_bits(v_st, BigInt(128), f_gen_and_bits(v_st, BigInt(128), f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), f_gen_bit_lit(v_st, BigInt(128), f_not_bits(v_st, BigInt(128), f_lsl_bits(v_st, BigInt(128), BigInt(8), mkBits(v_st, 128, BigInt("00000000000000000000000000000000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111", 2)), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(1), BigInt(7), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), BigInt(7)), mkBits(v_st, 7, BigInt("1000000", 2))), BigInt(8)))))), f_gen_lsl_bits(v_st, BigInt(128), BigInt(8), f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_X_read64__2.v, f_gen_int_lit(v_st, BigInt(128))), f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(1), BigInt(7), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), BigInt(7)), mkBits(v_st, 7, BigInt("1000000", 2))), BigInt(8))))))
      }
    }
  }
}
