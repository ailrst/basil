/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_reduce_fp16_maxnm_simd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
    val v_Exp7__2 : RTSym = v_st.f_decl_bv("Exp7__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp7__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_result__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    val v_result__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    val v_result__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp14__5 : RTSym = v_st.f_decl_bv("Exp14__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp14__5,v_st.f_gen_FPMinNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(112), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_copyprop.v = v_st.f_gen_load(v_Exp14__5)
    } else {
      val v_Exp16__5 : RTSym = v_st.f_decl_bv("Exp16__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp16__5,v_st.f_gen_FPMaxNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(112), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_copyprop.v = v_st.f_gen_load(v_Exp16__5)
    }
    val v_Exp23__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_Exp23__4_copyprop.v = v_result__4_copyprop.v
    val v_result__4_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp28__5 : RTSym = v_st.f_decl_bv("Exp28__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp28__5,v_st.f_gen_FPMinNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(64), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(80), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_1_copyprop.v = v_st.f_gen_load(v_Exp28__5)
    } else {
      val v_Exp30__5 : RTSym = v_st.f_decl_bv("Exp30__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp30__5,v_st.f_gen_FPMaxNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(64), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(80), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_1_copyprop.v = v_st.f_gen_load(v_Exp30__5)
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp39__4 : RTSym = v_st.f_decl_bv("Exp39__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp39__4,v_st.f_gen_FPMinNum(BigInt(16), v_result__4_1_copyprop.v, v_Exp23__4_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_copyprop.v = v_st.f_gen_load(v_Exp39__4)
    } else {
      val v_Exp41__4 : RTSym = v_st.f_decl_bv("Exp41__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp41__4,v_st.f_gen_FPMaxNum(BigInt(16), v_result__4_1_copyprop.v, v_Exp23__4_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_copyprop.v = v_st.f_gen_load(v_Exp41__4)
    }
    val v_Exp48__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_Exp48__3_copyprop.v = v_result__3_copyprop.v
    val v_result__3_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    val v_result__4_2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp54__5 : RTSym = v_st.f_decl_bv("Exp54__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp54__5,v_st.f_gen_FPMinNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(32), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_2_copyprop.v = v_st.f_gen_load(v_Exp54__5)
    } else {
      val v_Exp56__5 : RTSym = v_st.f_decl_bv("Exp56__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp56__5,v_st.f_gen_FPMaxNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(32), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_2_copyprop.v = v_st.f_gen_load(v_Exp56__5)
    }
    val v_Exp63__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_Exp63__4_copyprop.v = v_result__4_2_copyprop.v
    val v_result__4_3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp68__5 : RTSym = v_st.f_decl_bv("Exp68__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp68__5,v_st.f_gen_FPMinNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(16), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_3_copyprop.v = v_st.f_gen_load(v_Exp68__5)
    } else {
      val v_Exp70__5 : RTSym = v_st.f_decl_bv("Exp70__5", BigInt(16)) 
      v_st.f_gen_store (v_Exp70__5,v_st.f_gen_FPMaxNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(16), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__4_3_copyprop.v = v_st.f_gen_load(v_Exp70__5)
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp79__4 : RTSym = v_st.f_decl_bv("Exp79__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp79__4,v_st.f_gen_FPMinNum(BigInt(16), v_result__4_3_copyprop.v, v_Exp63__4_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_1_copyprop.v = v_st.f_gen_load(v_Exp79__4)
    } else {
      val v_Exp81__4 : RTSym = v_st.f_decl_bv("Exp81__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp81__4,v_st.f_gen_FPMaxNum(BigInt(16), v_result__4_3_copyprop.v, v_Exp63__4_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_1_copyprop.v = v_st.f_gen_load(v_Exp81__4)
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp90__3 : RTSym = v_st.f_decl_bv("Exp90__3", BigInt(16)) 
      v_st.f_gen_store (v_Exp90__3,v_st.f_gen_FPMinNum(BigInt(16), v_result__3_1_copyprop.v, v_Exp48__3_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__2_copyprop.v = v_st.f_gen_load(v_Exp90__3)
    } else {
      val v_Exp92__3 : RTSym = v_st.f_decl_bv("Exp92__3", BigInt(16)) 
      v_st.f_gen_store (v_Exp92__3,v_st.f_gen_FPMaxNum(BigInt(16), v_result__3_1_copyprop.v, v_Exp48__3_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__2_copyprop.v = v_st.f_gen_load(v_Exp92__3)
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_result__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
  } else {
    val v_Exp108__2 : RTSym = v_st.f_decl_bv("Exp108__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp108__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_result__2_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    val v_result__3_2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp114__4 : RTSym = v_st.f_decl_bv("Exp114__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp114__4,v_st.f_gen_FPMinNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_2_copyprop.v = v_st.f_gen_load(v_Exp114__4)
    } else {
      val v_Exp116__4 : RTSym = v_st.f_decl_bv("Exp116__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp116__4,v_st.f_gen_FPMaxNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_2_copyprop.v = v_st.f_gen_load(v_Exp116__4)
    }
    val v_Exp123__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_Exp123__3_copyprop.v = v_result__3_2_copyprop.v
    val v_result__3_3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp128__4 : RTSym = v_st.f_decl_bv("Exp128__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp128__4,v_st.f_gen_FPMinNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp108__2), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp108__2), BigInt(16), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_3_copyprop.v = v_st.f_gen_load(v_Exp128__4)
    } else {
      val v_Exp130__4 : RTSym = v_st.f_decl_bv("Exp130__4", BigInt(16)) 
      v_st.f_gen_store (v_Exp130__4,v_st.f_gen_FPMaxNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp108__2), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp108__2), BigInt(16), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__3_3_copyprop.v = v_st.f_gen_load(v_Exp130__4)
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp139__3 : RTSym = v_st.f_decl_bv("Exp139__3", BigInt(16)) 
      v_st.f_gen_store (v_Exp139__3,v_st.f_gen_FPMinNum(BigInt(16), v_result__3_3_copyprop.v, v_Exp123__3_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__2_1_copyprop.v = v_st.f_gen_load(v_Exp139__3)
    } else {
      val v_Exp141__3 : RTSym = v_st.f_decl_bv("Exp141__3", BigInt(16)) 
      v_st.f_gen_store (v_Exp141__3,v_st.f_gen_FPMaxNum(BigInt(16), v_result__3_3_copyprop.v, v_Exp123__3_copyprop.v, v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__2_1_copyprop.v = v_st.f_gen_load(v_Exp141__3)
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_result__2_1_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
  }
}
