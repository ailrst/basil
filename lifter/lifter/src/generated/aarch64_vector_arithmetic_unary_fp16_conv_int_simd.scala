/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_fp16_conv_int_simd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
    val v_Exp6__2 : RTSym = v_st.f_decl_bv("Exp6__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp6__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_FPDecodeRounding9__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_FPDecodeRounding9__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
    val v_Exp13__2 : RTSym = v_st.f_decl_bv("Exp13__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp13__2,v_st.f_gen_FixedToFP(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding9__3_copyprop.v)))
    val v_Exp16__2 : RTSym = v_st.f_decl_bv("Exp16__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp16__2,v_st.f_gen_FixedToFP(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(16), BigInt(16)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding9__3_copyprop.v)))
    val v_Exp19__2 : RTSym = v_st.f_decl_bv("Exp19__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp19__2,v_st.f_gen_FixedToFP(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(32), BigInt(16)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding9__3_copyprop.v)))
    val v_Exp22__2 : RTSym = v_st.f_decl_bv("Exp22__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp22__2,v_st.f_gen_FixedToFP(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(48), BigInt(16)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding9__3_copyprop.v)))
    val v_Exp25__2 : RTSym = v_st.f_decl_bv("Exp25__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp25__2,v_st.f_gen_FixedToFP(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(64), BigInt(16)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding9__3_copyprop.v)))
    val v_Exp28__2 : RTSym = v_st.f_decl_bv("Exp28__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp28__2,v_st.f_gen_FixedToFP(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(80), BigInt(16)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding9__3_copyprop.v)))
    val v_Exp31__2 : RTSym = v_st.f_decl_bv("Exp31__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp31__2,v_st.f_gen_FixedToFP(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(96), BigInt(16)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding9__3_copyprop.v)))
    val v_Exp34__2 : RTSym = v_st.f_decl_bv("Exp34__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp34__2,v_st.f_gen_FixedToFP(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(112), BigInt(16)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding9__3_copyprop.v)))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(16), BigInt(112), v_st.f_gen_load(v_Exp34__2), v_st.f_gen_append_bits(BigInt(16), BigInt(96), v_st.f_gen_load(v_Exp31__2), v_st.f_gen_append_bits(BigInt(16), BigInt(80), v_st.f_gen_load(v_Exp28__2), v_st.f_gen_append_bits(BigInt(16), BigInt(64), v_st.f_gen_load(v_Exp25__2), v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_st.f_gen_load(v_Exp22__2), v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_st.f_gen_load(v_Exp19__2), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_load(v_Exp16__2), v_st.f_gen_load(v_Exp13__2)))))))))
  } else {
    val v_Exp43__2 : RTSym = v_st.f_decl_bv("Exp43__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp43__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_FPDecodeRounding46__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_FPDecodeRounding46__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
    val v_Exp50__2 : RTSym = v_st.f_decl_bv("Exp50__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp50__2,v_st.f_gen_FixedToFP(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp43__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding46__3_copyprop.v)))
    val v_Exp53__2 : RTSym = v_st.f_decl_bv("Exp53__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp53__2,v_st.f_gen_FixedToFP(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp43__2), BigInt(16), BigInt(16)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding46__3_copyprop.v)))
    val v_Exp56__2 : RTSym = v_st.f_decl_bv("Exp56__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp56__2,v_st.f_gen_FixedToFP(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp43__2), BigInt(32), BigInt(16)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding46__3_copyprop.v)))
    val v_Exp59__2 : RTSym = v_st.f_decl_bv("Exp59__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp59__2,v_st.f_gen_FixedToFP(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp43__2), BigInt(48), BigInt(16)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding46__3_copyprop.v)))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_st.f_gen_load(v_Exp59__2), v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_st.f_gen_load(v_Exp56__2), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_load(v_Exp53__2), v_st.f_gen_load(v_Exp50__2)))), v_st.f_gen_int_lit(BigInt(128))))
  }
}
