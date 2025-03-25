/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_special_sqrt_est_fp16_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_Exp10__2 : RTSym = v_st.f_decl_bv("Exp10__2", BigInt(16)) 
  v_st.f_gen_store (v_Exp10__2,v_st.f_gen_FPRSqrtEstimate(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
  v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_st.f_gen_load(v_Exp10__2), v_st.f_gen_int_lit(BigInt(128))))
}
