/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_integer_arithmetic_mul_uniform_add_sub[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2)))) then {
    val v_X_read5__2 : RTSym = v_st.f_decl_bv("X.read5__2", BigInt(64)) 
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_st.f_gen_store (v_X_read5__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    } else {
      v_st.f_gen_store (v_X_read5__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    }
    val v_X_read10__2 : RTSym = v_st.f_decl_bv("X.read10__2", BigInt(64)) 
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2)))))) then {
      v_st.f_gen_store (v_X_read10__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
    } else {
      v_st.f_gen_store (v_X_read10__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    }
    val v_X_read15__2 : RTSym = v_st.f_decl_bv("X.read15__2", BigInt(64)) 
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000111110000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000111110000000000", 2)))))) then {
      v_st.f_gen_store (v_X_read15__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(10),BigInt(5)))))
    } else {
      v_st.f_gen_store (v_X_read15__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2)))) then {
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_slice(v_st.f_gen_sub_bits(BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_X_read15__2), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_X_read5__2), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_load(v_X_read10__2), BigInt(0), BigInt(64))), BigInt(0), BigInt(64))), BigInt(0), BigInt(64)))
      }
    } else {
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_load(v_X_read15__2), v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_X_read5__2), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_load(v_X_read10__2), BigInt(0), BigInt(64))), BigInt(0), BigInt(64))))
      }
    }
  } else {
    val v_X_read30__2 : RTSym = v_st.f_decl_bv("X.read30__2", BigInt(32)) 
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_st.f_gen_store (v_X_read30__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
    } else {
      v_st.f_gen_store (v_X_read30__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
    }
    val v_X_read35__2 : RTSym = v_st.f_decl_bv("X.read35__2", BigInt(32)) 
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2)))))) then {
      v_st.f_gen_store (v_X_read35__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))
    } else {
      v_st.f_gen_store (v_X_read35__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
    }
    val v_X_read40__2 : RTSym = v_st.f_decl_bv("X.read40__2", BigInt(32)) 
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000111110000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000111110000000000", 2)))))) then {
      v_st.f_gen_store (v_X_read40__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(10),BigInt(5)))), BigInt(0), BigInt(32)))
    } else {
      v_st.f_gen_store (v_X_read40__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2)))) then {
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_sub_bits(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_X_read40__2), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_X_read30__2), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_X_read35__2), BigInt(0), BigInt(32))), BigInt(0), BigInt(32))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))))
      }
    } else {
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_add_bits(BigInt(32), v_st.f_gen_load(v_X_read40__2), v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_X_read30__2), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_X_read35__2), BigInt(0), BigInt(32))), BigInt(0), BigInt(32))), v_st.f_gen_int_lit(BigInt(64))))
      }
    }
  }
}
