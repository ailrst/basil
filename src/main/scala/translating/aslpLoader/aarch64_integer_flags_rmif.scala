/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_flags_rmif (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  val v_X_read5__2 = Mutable[Expr](rTExprDefault)
  if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
    v_X_read5__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
  } else {
    v_X_read5__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
  }
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000001000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000001000", 2)))) then {
    f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(3), BigInt(1)))
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000100", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000100", 2)))) then {
      f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(2), BigInt(1)))
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000010", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000010", 2)))) then {
        f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(1), BigInt(1)))
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2)))) then {
          f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2)))) then {
          f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      }
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000010", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000010", 2)))) then {
        f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(1), BigInt(1)))
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2)))) then {
          f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2)))) then {
          f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      }
    }
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000100", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000100", 2)))) then {
      f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(2), BigInt(1)))
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000010", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000010", 2)))) then {
        f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(1), BigInt(1)))
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2)))) then {
          f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2)))) then {
          f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      }
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000010", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000010", 2)))) then {
        f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(1), BigInt(1)))
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2)))) then {
          f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2)))) then {
          f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      }
    }
  }
}
