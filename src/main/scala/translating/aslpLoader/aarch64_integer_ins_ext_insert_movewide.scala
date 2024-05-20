/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_ins_ext_insert_movewide (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2)))) then {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
      val v_X_read5__2 = Mutable[Expr](rTExprDefault)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_X_read5__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
      } else {
        v_X_read5__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
      }
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_or_bits(v_st, BigInt(64), f_gen_and_bits(v_st, BigInt(64), v_X_read5__2.v, f_gen_bit_lit(v_st, BigInt(64), f_not_bits(v_st, BigInt(64), f_lsl_bits(v_st, BigInt(64), BigInt(7), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000001111111111111111", 2)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7)))))), f_gen_bit_lit(v_st, BigInt(64), f_lsl_bits(v_st, BigInt(64), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(64), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(64)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7))))))
      }
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), f_not_bits(v_st, BigInt(64), f_lsl_bits(v_st, BigInt(64), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(64), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(64)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7))))))
        }
      } else {
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), f_lsl_bits(v_st, BigInt(64), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(64), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(64)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7)))))
        }
      }
    }
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
      val v_X_read22__2 = Mutable[Expr](rTExprDefault)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_X_read22__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32))
      } else {
        v_X_read22__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
      }
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_or_bits(v_st, BigInt(32), f_gen_and_bits(v_st, BigInt(32), v_X_read22__2.v, f_gen_bit_lit(v_st, BigInt(32), f_not_bits(v_st, BigInt(32), f_lsl_bits(v_st, BigInt(32), BigInt(7), mkBits(v_st, 32, BigInt("00000000000000001111111111111111", 2)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7)))))), f_gen_bit_lit(v_st, BigInt(32), f_lsl_bits(v_st, BigInt(32), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(32), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(32)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7))))), f_gen_int_lit(v_st, BigInt(64))))
      }
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), f_ZeroExtend(v_st, BigInt(32), BigInt(64), f_not_bits(v_st, BigInt(32), f_lsl_bits(v_st, BigInt(32), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(32), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(32)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7)))), BigInt(64))))
        }
      } else {
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), f_ZeroExtend(v_st, BigInt(32), BigInt(64), f_lsl_bits(v_st, BigInt(32), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(32), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(32)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7))), BigInt(64))))
        }
      }
    }
  }
}
