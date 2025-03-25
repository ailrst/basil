/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_float_conv_int_simd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_Exp6__2 : RTSym = v_st.f_decl_bv("Exp6__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp6__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_FPDecodeRounding9__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        v_FPDecodeRounding9__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
        val v_Exp13__2 : RTSym = v_st.f_decl_bv("Exp13__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp13__2,v_st.f_gen_FixedToFP(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding9__3_copyprop.v)))
        val v_Exp16__2 : RTSym = v_st.f_decl_bv("Exp16__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp16__2,v_st.f_gen_FixedToFP(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(32), BigInt(32)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding9__3_copyprop.v)))
        val v_Exp19__2 : RTSym = v_st.f_decl_bv("Exp19__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp19__2,v_st.f_gen_FixedToFP(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(64), BigInt(32)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding9__3_copyprop.v)))
        val v_Exp22__2 : RTSym = v_st.f_decl_bv("Exp22__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp22__2,v_st.f_gen_FixedToFP(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(96), BigInt(32)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding9__3_copyprop.v)))
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_load(v_Exp22__2), v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_st.f_gen_load(v_Exp19__2), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp16__2), v_st.f_gen_load(v_Exp13__2)))))
      } else {
        val v_Exp31__2 : RTSym = v_st.f_decl_bv("Exp31__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp31__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_FPDecodeRounding34__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        v_FPDecodeRounding34__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
        val v_Exp38__2 : RTSym = v_st.f_decl_bv("Exp38__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp38__2,v_st.f_gen_FixedToFP(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp31__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding34__3_copyprop.v)))
        val v_Exp41__2 : RTSym = v_st.f_decl_bv("Exp41__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp41__2,v_st.f_gen_FixedToFP(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp31__2), BigInt(32), BigInt(32)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding34__3_copyprop.v)))
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp41__2), v_st.f_gen_load(v_Exp38__2)), v_st.f_gen_int_lit(BigInt(128))))
      }
    } else {
      val v_Exp51__2 : RTSym = v_st.f_decl_bv("Exp51__2", BigInt(128)) 
      v_st.f_gen_store (v_Exp51__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
      val v_FPDecodeRounding54__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      v_FPDecodeRounding54__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
      val v_Exp58__2 : RTSym = v_st.f_decl_bv("Exp58__2", BigInt(64)) 
      v_st.f_gen_store (v_Exp58__2,v_st.f_gen_FixedToFP(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp51__2), BigInt(0), BigInt(64)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding54__3_copyprop.v)))
      val v_Exp61__2 : RTSym = v_st.f_decl_bv("Exp61__2", BigInt(64)) 
      v_st.f_gen_store (v_Exp61__2,v_st.f_gen_FixedToFP(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp51__2), BigInt(64), BigInt(64)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding54__3_copyprop.v)))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_load(v_Exp61__2), v_st.f_gen_load(v_Exp58__2)))
    }
  }
}
