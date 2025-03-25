/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_integer_flags_rmif[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_X_read5__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
    v_X_read5__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
  } else {
    v_X_read5__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
  }
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000001000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000001000", 2)))) then {
    v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(3), BigInt(1)))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000100", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000100", 2)))) then {
      v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(2), BigInt(1)))
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2)))) then {
        v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(1), BigInt(1)))
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))) then {
          v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))) then {
          v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2)))) then {
        v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(1), BigInt(1)))
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))) then {
          v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))) then {
          v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      }
    }
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000100", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000100", 2)))) then {
      v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(2), BigInt(1)))
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2)))) then {
        v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(1), BigInt(1)))
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))) then {
          v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))) then {
          v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2)))) then {
        v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(4)), BigInt(0), BigInt(4)), BigInt(1), BigInt(1)))
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))) then {
          v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))) then {
          v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(12), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read5__2_copyprop.v, v_X_read5__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.bvextract(v_enc,BigInt(15),BigInt(6)), BigInt(12)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)))
        }
      }
    }
  }
}
