/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_cmp_fp16_lessthan_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_Exp12__2 : RTSym = v_st.f_decl_bool("Exp12__2") 
  v_st.f_gen_store (v_Exp12__2,v_st.f_gen_FPCompareGT(BigInt(16), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
  val v_If14__1 : RTSym = v_st.f_decl_bv("If14__1", BigInt(16)) 
  val v_temp0 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_Exp12__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp0))
  v_st.f_gen_store (v_If14__1,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("1111111111111111", 2))))
  v_st.f_switch_context (v_st.f_false_branch(v_temp0))
  v_st.f_gen_store (v_If14__1,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2))))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
  v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_st.f_gen_load(v_If14__1), v_st.f_gen_int_lit(BigInt(128))))
}
