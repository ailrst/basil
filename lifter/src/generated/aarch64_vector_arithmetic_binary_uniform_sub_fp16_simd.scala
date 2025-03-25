/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_uniform_sub_fp16_simd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
    val v_Exp7__2 : RTSym = v_st.f_decl_bv("Exp7__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp7__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_Exp10__2 : RTSym = v_st.f_decl_bv("Exp10__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp10__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
    val v_Exp14__2 : RTSym = v_st.f_decl_bv("Exp14__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp14__2,v_st.f_gen_FPSub(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
    val v_If16__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If16__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp14__2), BigInt(0), BigInt(15)))
    } else {
      v_If16__1_copyprop.v = v_st.f_gen_load(v_Exp14__2)
    }
    val v_Exp21__2 : RTSym = v_st.f_decl_bv("Exp21__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp21__2,v_st.f_gen_FPSub(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(16), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(16), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
    val v_If22__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If22__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp21__2), BigInt(0), BigInt(15)))
    } else {
      v_If22__1_copyprop.v = v_st.f_gen_load(v_Exp21__2)
    }
    val v_Exp27__2 : RTSym = v_st.f_decl_bv("Exp27__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp27__2,v_st.f_gen_FPSub(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(32), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(32), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
    val v_If28__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If28__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp27__2), BigInt(0), BigInt(15)))
    } else {
      v_If28__1_copyprop.v = v_st.f_gen_load(v_Exp27__2)
    }
    val v_Exp33__2 : RTSym = v_st.f_decl_bv("Exp33__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp33__2,v_st.f_gen_FPSub(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(48), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
    val v_If34__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If34__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp33__2), BigInt(0), BigInt(15)))
    } else {
      v_If34__1_copyprop.v = v_st.f_gen_load(v_Exp33__2)
    }
    val v_Exp39__2 : RTSym = v_st.f_decl_bv("Exp39__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp39__2,v_st.f_gen_FPSub(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(64), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(64), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
    val v_If40__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If40__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp39__2), BigInt(0), BigInt(15)))
    } else {
      v_If40__1_copyprop.v = v_st.f_gen_load(v_Exp39__2)
    }
    val v_Exp45__2 : RTSym = v_st.f_decl_bv("Exp45__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp45__2,v_st.f_gen_FPSub(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(80), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(80), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
    val v_If46__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If46__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp45__2), BigInt(0), BigInt(15)))
    } else {
      v_If46__1_copyprop.v = v_st.f_gen_load(v_Exp45__2)
    }
    val v_Exp51__2 : RTSym = v_st.f_decl_bv("Exp51__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp51__2,v_st.f_gen_FPSub(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(96), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(96), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
    val v_If52__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If52__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp51__2), BigInt(0), BigInt(15)))
    } else {
      v_If52__1_copyprop.v = v_st.f_gen_load(v_Exp51__2)
    }
    val v_Exp57__2 : RTSym = v_st.f_decl_bv("Exp57__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp57__2,v_st.f_gen_FPSub(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(112), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(112), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
    val v_If58__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If58__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp57__2), BigInt(0), BigInt(15)))
    } else {
      v_If58__1_copyprop.v = v_st.f_gen_load(v_Exp57__2)
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(16), BigInt(112), v_If58__1_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(96), v_If52__1_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(80), v_If46__1_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(64), v_If40__1_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_If34__1_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_If28__1_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_If22__1_copyprop.v, v_If16__1_copyprop.v))))))))
  } else {
    val v_Exp68__2 : RTSym = v_st.f_decl_bv("Exp68__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp68__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_Exp71__2 : RTSym = v_st.f_decl_bv("Exp71__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp71__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
    val v_Exp75__2 : RTSym = v_st.f_decl_bv("Exp75__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp75__2,v_st.f_gen_FPSub(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
    val v_If77__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If77__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp75__2), BigInt(0), BigInt(15)))
    } else {
      v_If77__1_copyprop.v = v_st.f_gen_load(v_Exp75__2)
    }
    val v_Exp82__2 : RTSym = v_st.f_decl_bv("Exp82__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp82__2,v_st.f_gen_FPSub(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp68__2), BigInt(16), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp71__2), BigInt(16), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
    val v_If83__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If83__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp82__2), BigInt(0), BigInt(15)))
    } else {
      v_If83__1_copyprop.v = v_st.f_gen_load(v_Exp82__2)
    }
    val v_Exp88__2 : RTSym = v_st.f_decl_bv("Exp88__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp88__2,v_st.f_gen_FPSub(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp68__2), BigInt(32), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp71__2), BigInt(32), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
    val v_If89__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If89__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp88__2), BigInt(0), BigInt(15)))
    } else {
      v_If89__1_copyprop.v = v_st.f_gen_load(v_Exp88__2)
    }
    val v_Exp94__2 : RTSym = v_st.f_decl_bv("Exp94__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp94__2,v_st.f_gen_FPSub(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp68__2), BigInt(48), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp71__2), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
    val v_If95__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If95__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp94__2), BigInt(0), BigInt(15)))
    } else {
      v_If95__1_copyprop.v = v_st.f_gen_load(v_Exp94__2)
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_If95__1_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_If89__1_copyprop.v, v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_If83__1_copyprop.v, v_If77__1_copyprop.v))), v_st.f_gen_int_lit(BigInt(128))))
  }
}
