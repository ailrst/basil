/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_reduce_fp16_max_simd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
    val v_Exp7__2 : RTSym = v_st.f_decl_bv("Exp7__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp7__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_result__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    val v_result__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    val v_result__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp18__5 : RTSym = v_st.f_decl_bv("Exp18__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp18__5,v_st.f_gen_FPMin(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(112), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_copyprop.v = v_st.f_gen_load(v_Exp18__5)
    } else {
      val v_Exp20__5 : RTSym = v_st.f_decl_bv("Exp20__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp20__5,v_st.f_gen_FPMax(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(112), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_copyprop.v = v_st.f_gen_load(v_Exp20__5)
    }
    val v_Exp23__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_Exp23__4_copyprop.v = v_result__4_copyprop.v
    val v_result__4_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp32__5 : RTSym = v_st.f_decl_bv("Exp32__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp32__5,v_st.f_gen_FPMin(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(64), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(80), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_1_copyprop.v = v_st.f_gen_load(v_Exp32__5)
    } else {
      val v_Exp34__5 : RTSym = v_st.f_decl_bv("Exp34__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp34__5,v_st.f_gen_FPMax(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(64), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(80), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_1_copyprop.v = v_st.f_gen_load(v_Exp34__5)
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp43__4 : RTSym = v_st.f_decl_bv("Exp43__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp43__4,v_st.f_gen_FPMin(BigInt(16), v_result__4_1_copyprop.v, v_Exp23__4_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_copyprop.v = v_st.f_gen_load(v_Exp43__4)
    } else {
      val v_Exp45__4 : RTSym = v_st.f_decl_bv("Exp45__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp45__4,v_st.f_gen_FPMax(BigInt(16), v_result__4_1_copyprop.v, v_Exp23__4_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_copyprop.v = v_st.f_gen_load(v_Exp45__4)
    }
    val v_Exp48__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_Exp48__3_copyprop.v = v_result__3_copyprop.v
    val v_result__3_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    val v_result__4_2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp58__5 : RTSym = v_st.f_decl_bv("Exp58__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp58__5,v_st.f_gen_FPMin(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(32), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_2_copyprop.v = v_st.f_gen_load(v_Exp58__5)
    } else {
      val v_Exp60__5 : RTSym = v_st.f_decl_bv("Exp60__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp60__5,v_st.f_gen_FPMax(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(32), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_2_copyprop.v = v_st.f_gen_load(v_Exp60__5)
    }
    val v_Exp63__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_Exp63__4_copyprop.v = v_result__4_2_copyprop.v
    val v_result__4_3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp72__5 : RTSym = v_st.f_decl_bv("Exp72__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp72__5,v_st.f_gen_FPMin(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(16), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_3_copyprop.v = v_st.f_gen_load(v_Exp72__5)
    } else {
      val v_Exp74__5 : RTSym = v_st.f_decl_bv("Exp74__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp74__5,v_st.f_gen_FPMax(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(16), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_3_copyprop.v = v_st.f_gen_load(v_Exp74__5)
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp83__4 : RTSym = v_st.f_decl_bv("Exp83__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp83__4,v_st.f_gen_FPMin(BigInt(16), v_result__4_3_copyprop.v, v_Exp63__4_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_1_copyprop.v = v_st.f_gen_load(v_Exp83__4)
    } else {
      val v_Exp85__4 : RTSym = v_st.f_decl_bv("Exp85__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp85__4,v_st.f_gen_FPMax(BigInt(16), v_result__4_3_copyprop.v, v_Exp63__4_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_1_copyprop.v = v_st.f_gen_load(v_Exp85__4)
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp94__3 : RTSym = v_st.f_decl_bv("Exp94__3", BigInt(16)) 
      v_st.f_gen_store (v_Exp94__3,v_st.f_gen_FPMin(BigInt(16), v_result__3_1_copyprop.v, v_Exp48__3_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__2_copyprop.v = v_st.f_gen_load(v_Exp94__3)
    } else {
      val v_Exp96__3 : RTSym = v_st.f_decl_bv("Exp96__3", BigInt(16)) 
      v_st.f_gen_store (v_Exp96__3,v_st.f_gen_FPMax(BigInt(16), v_result__3_1_copyprop.v, v_Exp48__3_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__2_copyprop.v = v_st.f_gen_load(v_Exp96__3)
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_result__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
  } else {
    val v_Exp108__2 : RTSym = v_st.f_decl_bv("Exp108__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp108__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_result__2_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    val v_result__3_2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp118__4 : RTSym = v_st.f_decl_bv("Exp118__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp118__4,v_st.f_gen_FPMin(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_2_copyprop.v = v_st.f_gen_load(v_Exp118__4)
    } else {
      val v_Exp120__4 : RTSym = v_st.f_decl_bv("Exp120__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp120__4,v_st.f_gen_FPMax(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_2_copyprop.v = v_st.f_gen_load(v_Exp120__4)
    }
    val v_Exp123__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_Exp123__3_copyprop.v = v_result__3_2_copyprop.v
    val v_result__3_3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp132__4 : RTSym = v_st.f_decl_bv("Exp132__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp132__4,v_st.f_gen_FPMin(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp108__2), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp108__2), BigInt(16), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_3_copyprop.v = v_st.f_gen_load(v_Exp132__4)
    } else {
      val v_Exp134__4 : RTSym = v_st.f_decl_bv("Exp134__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp134__4,v_st.f_gen_FPMax(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp108__2), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp108__2), BigInt(16), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_3_copyprop.v = v_st.f_gen_load(v_Exp134__4)
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp143__3 : RTSym = v_st.f_decl_bv("Exp143__3", BigInt(16)) 
      v_st.f_gen_store (v_Exp143__3,v_st.f_gen_FPMin(BigInt(16), v_result__3_3_copyprop.v, v_Exp123__3_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__2_1_copyprop.v = v_st.f_gen_load(v_Exp143__3)
    } else {
      val v_Exp145__3 : RTSym = v_st.f_decl_bv("Exp145__3", BigInt(16)) 
      v_st.f_gen_store (v_Exp145__3,v_st.f_gen_FPMax(BigInt(16), v_result__3_3_copyprop.v, v_Exp123__3_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__2_1_copyprop.v = v_st.f_gen_load(v_Exp145__3)
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_result__2_1_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
  }
}
