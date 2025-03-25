/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_float_narrow[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_Exp7__2 : RTSym = v_st.f_decl_bv("Exp7__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp7__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_FPDecodeRounding13__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_FPDecodeRounding13__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
    val v_Exp15__3 : RTSym = v_st.f_decl_bv("Exp15__3", BigInt(16)) 
    v_st.f_gen_store (v_Exp15__3,v_st.f_gen_FPConvert(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding13__4_copyprop.v)))
    val v_FPDecodeRounding20__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_FPDecodeRounding20__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
    val v_Exp22__3 : RTSym = v_st.f_decl_bv("Exp22__3", BigInt(16)) 
    v_st.f_gen_store (v_Exp22__3,v_st.f_gen_FPConvert(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding20__4_copyprop.v)))
    val v_FPDecodeRounding27__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_FPDecodeRounding27__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
    val v_Exp29__3 : RTSym = v_st.f_decl_bv("Exp29__3", BigInt(16)) 
    v_st.f_gen_store (v_Exp29__3,v_st.f_gen_FPConvert(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(64), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding27__4_copyprop.v)))
    val v_FPDecodeRounding34__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_FPDecodeRounding34__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
    val v_Exp36__3 : RTSym = v_st.f_decl_bv("Exp36__3", BigInt(16)) 
    v_st.f_gen_store (v_Exp36__3,v_st.f_gen_FPConvert(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(96), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding34__4_copyprop.v)))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_st.f_gen_load(v_Exp36__3), v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_st.f_gen_load(v_Exp29__3), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_load(v_Exp22__3), v_st.f_gen_load(v_Exp15__3)))), v_st.f_gen_int_lit(BigInt(128))))
    } else {
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_st.f_gen_load(v_Exp36__3), v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_st.f_gen_load(v_Exp29__3), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_load(v_Exp22__3), v_st.f_gen_load(v_Exp15__3)))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64))))
    }
  } else {
    val v_Exp58__2 : RTSym = v_st.f_decl_bv("Exp58__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp58__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_FPDecodeRounding64__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_FPDecodeRounding64__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
    val v_Exp66__3 : RTSym = v_st.f_decl_bv("Exp66__3", BigInt(32)) 
    v_st.f_gen_store (v_Exp66__3,v_st.f_gen_FPConvert(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp58__2), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding64__4_copyprop.v)))
    val v_FPDecodeRounding71__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_FPDecodeRounding71__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
    val v_Exp73__3 : RTSym = v_st.f_decl_bv("Exp73__3", BigInt(32)) 
    v_st.f_gen_store (v_Exp73__3,v_st.f_gen_FPConvert(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp58__2), BigInt(64), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding71__4_copyprop.v)))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp73__3), v_st.f_gen_load(v_Exp66__3)), v_st.f_gen_int_lit(BigInt(128))))
    } else {
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp73__3), v_st.f_gen_load(v_Exp66__3)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64))))
    }
  }
}
