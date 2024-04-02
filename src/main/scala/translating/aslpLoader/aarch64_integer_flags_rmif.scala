/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_flags_rmif (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_ne_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
    throw Exception("not supported")
  } else {
    val v_X_read5__2 = Mutable[Expr](rTExprDefault)
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
      v_X_read5__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    } else {
      v_X_read5__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(3), BigInt(1)))
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(2),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
        f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(2), BigInt(1)))
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(1),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
          f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(1), BigInt(1)))
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
            f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
          }
        } else {
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
            f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
          }
        }
      } else {
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(1),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
          f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(1), BigInt(1)))
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
            f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
          }
        } else {
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
            f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
          }
        }
      }
    } else {
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(2),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
        f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(2), BigInt(1)))
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(1),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
          f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(1), BigInt(1)))
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
            f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
          }
        } else {
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
            f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
          }
        }
      } else {
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(1),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
          f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(1), BigInt(1)))
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
            f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
          }
        } else {
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
            f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(7), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read5__2.v, v_X_read5__2.v), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(15),BigInt(6)), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
          }
        }
      }
    }
  }
}
