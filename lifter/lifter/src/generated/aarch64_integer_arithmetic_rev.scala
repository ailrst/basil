/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_integer_arithmetic_rev[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2)))) then {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000110000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000010000000000", 2)))) then {
      val v_X_read5__2 : RTSym = v_st.f_decl_bv("X.read5__2", BigInt(64)) 
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
        v_st.f_gen_store (v_X_read5__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
      } else {
        v_st.f_gen_store (v_X_read5__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
      }
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(8), BigInt(56), v_st.f_gen_slice(v_st.f_gen_load(v_X_read5__2), BigInt(48), BigInt(8)), v_st.f_gen_append_bits(BigInt(8), BigInt(48), v_st.f_gen_slice(v_st.f_gen_load(v_X_read5__2), BigInt(56), BigInt(8)), v_st.f_gen_append_bits(BigInt(8), BigInt(40), v_st.f_gen_slice(v_st.f_gen_load(v_X_read5__2), BigInt(32), BigInt(8)), v_st.f_gen_append_bits(BigInt(8), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_X_read5__2), BigInt(40), BigInt(8)), v_st.f_gen_append_bits(BigInt(8), BigInt(24), v_st.f_gen_slice(v_st.f_gen_load(v_X_read5__2), BigInt(16), BigInt(8)), v_st.f_gen_append_bits(BigInt(8), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_X_read5__2), BigInt(24), BigInt(8)), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_X_read5__2), BigInt(0), BigInt(8)), v_st.f_gen_slice(v_st.f_gen_load(v_X_read5__2), BigInt(8), BigInt(8))))))))))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000110000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))) then {
        val v_X_read14__2 : RTSym = v_st.f_decl_bv("X.read14__2", BigInt(64)) 
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
          v_st.f_gen_store (v_X_read14__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        } else {
          v_st.f_gen_store (v_X_read14__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
        }
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
          v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(24), BigInt(40), v_st.f_gen_append_bits(BigInt(16), BigInt(8), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_X_read14__2), BigInt(32), BigInt(8)), v_st.f_gen_slice(v_st.f_gen_load(v_X_read14__2), BigInt(40), BigInt(8))), v_st.f_gen_slice(v_st.f_gen_load(v_X_read14__2), BigInt(48), BigInt(8))), v_st.f_gen_append_bits(BigInt(8), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_X_read14__2), BigInt(56), BigInt(8)), v_st.f_gen_append_bits(BigInt(24), BigInt(8), v_st.f_gen_append_bits(BigInt(16), BigInt(8), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_X_read14__2), BigInt(0), BigInt(8)), v_st.f_gen_slice(v_st.f_gen_load(v_X_read14__2), BigInt(8), BigInt(8))), v_st.f_gen_slice(v_st.f_gen_load(v_X_read14__2), BigInt(16), BigInt(8))), v_st.f_gen_slice(v_st.f_gen_load(v_X_read14__2), BigInt(24), BigInt(8))))))
        }
      } else {
        val v_X_read23__2 : RTSym = v_st.f_decl_bv("X.read23__2", BigInt(64)) 
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
          v_st.f_gen_store (v_X_read23__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        } else {
          v_st.f_gen_store (v_X_read23__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
        }
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
          v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(56), BigInt(8), v_st.f_gen_append_bits(BigInt(48), BigInt(8), v_st.f_gen_append_bits(BigInt(40), BigInt(8), v_st.f_gen_append_bits(BigInt(32), BigInt(8), v_st.f_gen_append_bits(BigInt(24), BigInt(8), v_st.f_gen_append_bits(BigInt(16), BigInt(8), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_X_read23__2), BigInt(0), BigInt(8)), v_st.f_gen_slice(v_st.f_gen_load(v_X_read23__2), BigInt(8), BigInt(8))), v_st.f_gen_slice(v_st.f_gen_load(v_X_read23__2), BigInt(16), BigInt(8))), v_st.f_gen_slice(v_st.f_gen_load(v_X_read23__2), BigInt(24), BigInt(8))), v_st.f_gen_slice(v_st.f_gen_load(v_X_read23__2), BigInt(32), BigInt(8))), v_st.f_gen_slice(v_st.f_gen_load(v_X_read23__2), BigInt(40), BigInt(8))), v_st.f_gen_slice(v_st.f_gen_load(v_X_read23__2), BigInt(48), BigInt(8))), v_st.f_gen_slice(v_st.f_gen_load(v_X_read23__2), BigInt(56), BigInt(8))))
        }
      }
    }
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000110000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000010000000000", 2)))) then {
      val v_X_read33__2 : RTSym = v_st.f_decl_bv("X.read33__2", BigInt(32)) 
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
        v_st.f_gen_store (v_X_read33__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
      } else {
        v_st.f_gen_store (v_X_read33__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
      }
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_append_bits(BigInt(8), BigInt(24), v_st.f_gen_slice(v_st.f_gen_load(v_X_read33__2), BigInt(16), BigInt(8)), v_st.f_gen_append_bits(BigInt(8), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_X_read33__2), BigInt(24), BigInt(8)), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_X_read33__2), BigInt(0), BigInt(8)), v_st.f_gen_slice(v_st.f_gen_load(v_X_read33__2), BigInt(8), BigInt(8))))), v_st.f_gen_int_lit(BigInt(64))))
      }
    } else {
      val v_X_read42__2 : RTSym = v_st.f_decl_bv("X.read42__2", BigInt(32)) 
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
        v_st.f_gen_store (v_X_read42__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
      } else {
        v_st.f_gen_store (v_X_read42__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
      }
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_append_bits(BigInt(24), BigInt(8), v_st.f_gen_append_bits(BigInt(16), BigInt(8), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_X_read42__2), BigInt(0), BigInt(8)), v_st.f_gen_slice(v_st.f_gen_load(v_X_read42__2), BigInt(8), BigInt(8))), v_st.f_gen_slice(v_st.f_gen_load(v_X_read42__2), BigInt(16), BigInt(8))), v_st.f_gen_slice(v_st.f_gen_load(v_X_read42__2), BigInt(24), BigInt(8))), v_st.f_gen_int_lit(BigInt(64))))
      }
    }
  }
}
