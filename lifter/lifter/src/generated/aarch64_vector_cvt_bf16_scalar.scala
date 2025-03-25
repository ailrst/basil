/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_cvt_bf16_scalar[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_Exp7__2 : RTSym = v_st.f_decl_bv("Exp7__2", BigInt(128)) 
  v_st.f_gen_store (v_Exp7__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
  val v_FPDecodeRounding11__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  v_FPDecodeRounding11__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
  val v_Exp13__3 : RTSym = v_st.f_decl_bv("Exp13__3", BigInt(16)) 
  v_st.f_gen_store (v_Exp13__3,v_st.f_gen_FPConvertBF(v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding11__4_copyprop.v)))
  v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_st.f_gen_load(v_Exp13__3), v_st.f_gen_int_lit(BigInt(128))))
}
