/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_transfer_integer_dup[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000010000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000010000000000000000", 2)))) then {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
      val v_X_read6__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
        v_X_read6__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8))
      } else {
        v_X_read6__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00000000", 2)))
      }
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(8), BigInt(120), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(112), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(104), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(96), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(88), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(80), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(72), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(64), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(56), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(48), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(40), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(32), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(24), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(16), v_X_read6__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_X_read6__2_copyprop.v, v_X_read6__2_copyprop.v))))))))))))))))
    } else {
      val v_X_read33__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
        v_X_read33__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8))
      } else {
        v_X_read33__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00000000", 2)))
      }
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(8), BigInt(56), v_X_read33__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(48), v_X_read33__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(40), v_X_read33__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(32), v_X_read33__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(24), v_X_read33__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(16), v_X_read33__2_copyprop.v, v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_X_read33__2_copyprop.v, v_X_read33__2_copyprop.v))))))), v_st.f_gen_int_lit(BigInt(128))))
    }
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000100000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000100000000000000000", 2)))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_X_read55__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
          v_X_read55__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16))
        } else {
          v_X_read55__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2)))
        }
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(16), BigInt(112), v_X_read55__2_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(96), v_X_read55__2_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(80), v_X_read55__2_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(64), v_X_read55__2_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_X_read55__2_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_X_read55__2_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_X_read55__2_copyprop.v, v_X_read55__2_copyprop.v))))))))
      } else {
        val v_X_read74__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
          v_X_read74__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16))
        } else {
          v_X_read74__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2)))
        }
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_X_read74__2_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_X_read74__2_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_X_read74__2_copyprop.v, v_X_read74__2_copyprop.v))), v_st.f_gen_int_lit(BigInt(128))))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000001000000000000000000", 2)))) then {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
          val v_X_read92__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
            v_X_read92__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
          } else {
            v_X_read92__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
          }
          v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_X_read92__2_copyprop.v, v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_X_read92__2_copyprop.v, v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_X_read92__2_copyprop.v, v_X_read92__2_copyprop.v))))
        } else {
          val v_X_read107__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
            v_X_read107__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
          } else {
            v_X_read107__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
          }
          v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_X_read107__2_copyprop.v, v_X_read107__2_copyprop.v), v_st.f_gen_int_lit(BigInt(128))))
        }
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
          throw Exception("not supported")
        } else {
          val v_X_read123__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
            v_X_read123__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
          } else {
            v_X_read123__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
          }
          v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_X_read123__2_copyprop.v, v_X_read123__2_copyprop.v))
        }
      }
    }
  }
}
