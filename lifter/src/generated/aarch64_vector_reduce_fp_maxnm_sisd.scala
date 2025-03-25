/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_reduce_fp_maxnm_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_result__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp12__3 : RTSym = v_st.f_decl_bv("Exp12__3", BigInt(32)) 
      v_st.f_gen_store (v_Exp12__3,v_st.f_gen_FPMinNum(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__2_copyprop.v = v_st.f_gen_load(v_Exp12__3)
    } else {
      val v_Exp14__3 : RTSym = v_st.f_decl_bv("Exp14__3", BigInt(32)) 
      v_st.f_gen_store (v_Exp14__3,v_st.f_gen_FPMaxNum(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__2_copyprop.v = v_st.f_gen_load(v_Exp14__3)
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_result__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
  } else {
    val v_result__2_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp36__3 : RTSym = v_st.f_decl_bv("Exp36__3", BigInt(64)) 
      v_st.f_gen_store (v_Exp36__3,v_st.f_gen_FPMinNum(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__2_1_copyprop.v = v_st.f_gen_load(v_Exp36__3)
    } else {
      val v_Exp38__3 : RTSym = v_st.f_decl_bv("Exp38__3", BigInt(64)) 
      v_st.f_gen_store (v_Exp38__3,v_st.f_gen_FPMaxNum(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__2_1_copyprop.v = v_st.f_gen_load(v_Exp38__3)
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_result__2_1_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
  }
}
