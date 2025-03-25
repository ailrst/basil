/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_cmp_int_lessthan_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2)))))) then {
    throw Exception("not supported")
  } else {
    val v_If58__1 : RTSym = v_st.f_decl_bv("If58__1", BigInt(64)) 
    val v_temp0 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp0))
    v_st.f_gen_store (v_If58__1,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2))))
    v_st.f_switch_context (v_st.f_false_branch(v_temp0))
    v_st.f_gen_store (v_If58__1,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_If58__1), v_st.f_gen_int_lit(BigInt(128))))
  }
}
