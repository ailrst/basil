/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_cvt_bf16_vector[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_Exp8__2 : RTSym = v_st.f_decl_bv("Exp8__2", BigInt(128)) 
  v_st.f_gen_store (v_Exp8__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
  val v_FPDecodeRounding14__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  v_FPDecodeRounding14__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
  val v_Exp16__3 : RTSym = v_st.f_decl_bv("Exp16__3", BigInt(16)) 
  v_st.f_gen_store (v_Exp16__3,v_st.f_gen_FPConvertBF(v_st.f_gen_slice(v_st.f_gen_load(v_Exp8__2), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding14__4_copyprop.v)))
  val v_FPDecodeRounding21__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  v_FPDecodeRounding21__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
  val v_Exp23__3 : RTSym = v_st.f_decl_bv("Exp23__3", BigInt(16)) 
  v_st.f_gen_store (v_Exp23__3,v_st.f_gen_FPConvertBF(v_st.f_gen_slice(v_st.f_gen_load(v_Exp8__2), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding21__4_copyprop.v)))
  val v_FPDecodeRounding28__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  v_FPDecodeRounding28__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
  val v_Exp30__3 : RTSym = v_st.f_decl_bv("Exp30__3", BigInt(16)) 
  v_st.f_gen_store (v_Exp30__3,v_st.f_gen_FPConvertBF(v_st.f_gen_slice(v_st.f_gen_load(v_Exp8__2), BigInt(64), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding28__4_copyprop.v)))
  val v_FPDecodeRounding35__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  v_FPDecodeRounding35__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
  val v_Exp37__3 : RTSym = v_st.f_decl_bv("Exp37__3", BigInt(16)) 
  v_st.f_gen_store (v_Exp37__3,v_st.f_gen_FPConvertBF(v_st.f_gen_slice(v_st.f_gen_load(v_Exp8__2), BigInt(96), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding35__4_copyprop.v)))
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_st.f_gen_load(v_Exp37__3), v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_st.f_gen_load(v_Exp30__3), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_load(v_Exp23__3), v_st.f_gen_load(v_Exp16__3)))), v_st.f_gen_int_lit(BigInt(128))))
  } else {
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_st.f_gen_load(v_Exp37__3), v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_st.f_gen_load(v_Exp30__3), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_load(v_Exp23__3), v_st.f_gen_load(v_Exp16__3)))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64))))
  }
}
