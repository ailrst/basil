/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_integer_arithmetic_mul_widening_32_64[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_X_read5__2 : RTSym = v_st.f_decl_bv("X.read5__2", BigInt(32)) 
  val v_X_read5__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then {
      v_X_read5__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_st.f_gen_store (v_X_read5__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
    }
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then {
      v_X_read5__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
    } else {
      v_st.f_gen_store (v_X_read5__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
    }
  }
  val v_X_read10__2 : RTSym = v_st.f_decl_bv("X.read10__2", BigInt(32)) 
  val v_X_read10__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2)))))) then {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then {
      v_X_read10__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_st.f_gen_store (v_X_read10__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))
    }
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then {
      v_X_read10__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
    } else {
      v_st.f_gen_store (v_X_read10__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
    }
  }
  val v_X_read15__2 : RTSym = v_st.f_decl_bv("X.read15__2", BigInt(64)) 
  val v_X_read15__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000111110000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000111110000000000", 2)))))) then {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then {
      v_X_read15__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(10),BigInt(5))))
    } else {
      v_st.f_gen_store (v_X_read15__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(10),BigInt(5)))))
    }
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then {
      v_X_read15__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    } else {
      v_st.f_gen_store (v_X_read15__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    }
  }
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2)))) then {
    val v_If21__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      v_If21__2_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then (v_X_read15__2_copyprop.v) else (v_st.f_gen_load(v_X_read15__2))), v_st.f_gen_int_lit(BigInt(128)))
    } else {
      v_If21__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(64), BigInt(128), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then (v_X_read15__2_copyprop.v) else (v_st.f_gen_load(v_X_read15__2))), v_st.f_gen_int_lit(BigInt(128)))
    }
    val v_If25__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      v_If25__2_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then (v_X_read5__2_copyprop.v) else (v_st.f_gen_load(v_X_read5__2))), v_st.f_gen_int_lit(BigInt(64)))
    } else {
      v_If25__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(32), BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then (v_X_read5__2_copyprop.v) else (v_st.f_gen_load(v_X_read5__2))), v_st.f_gen_int_lit(BigInt(64)))
    }
    val v_If29__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      v_If29__2_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then (v_X_read10__2_copyprop.v) else (v_st.f_gen_load(v_X_read10__2))), v_st.f_gen_int_lit(BigInt(64)))
    } else {
      v_If29__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(32), BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then (v_X_read10__2_copyprop.v) else (v_st.f_gen_load(v_X_read10__2))), v_st.f_gen_int_lit(BigInt(64)))
    }
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_slice(v_st.f_gen_sub_bits(BigInt(64), v_st.f_gen_slice(v_If21__2_copyprop.v, BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_If25__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_If29__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64))), BigInt(0), BigInt(64)))
    }
  } else {
    val v_If35__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      v_If35__2_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then (v_X_read15__2_copyprop.v) else (v_st.f_gen_load(v_X_read15__2))), v_st.f_gen_int_lit(BigInt(128)))
    } else {
      v_If35__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(64), BigInt(128), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then (v_X_read15__2_copyprop.v) else (v_st.f_gen_load(v_X_read15__2))), v_st.f_gen_int_lit(BigInt(128)))
    }
    val v_If39__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      v_If39__2_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then (v_X_read5__2_copyprop.v) else (v_st.f_gen_load(v_X_read5__2))), v_st.f_gen_int_lit(BigInt(64)))
    } else {
      v_If39__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(32), BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then (v_X_read5__2_copyprop.v) else (v_st.f_gen_load(v_X_read5__2))), v_st.f_gen_int_lit(BigInt(64)))
    }
    val v_If43__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      v_If43__2_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then (v_X_read10__2_copyprop.v) else (v_st.f_gen_load(v_X_read10__2))), v_st.f_gen_int_lit(BigInt(64)))
    } else {
      v_If43__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(32), BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111011000000000000000011111", 2))), v_st.mkBits(32, BigInt("10011011001000000000000000011111", 2)))) then (v_X_read10__2_copyprop.v) else (v_st.f_gen_load(v_X_read10__2))), v_st.f_gen_int_lit(BigInt(64)))
    }
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_slice(v_If35__2_copyprop.v, BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_If39__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_If43__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64))))
    }
  }
}
