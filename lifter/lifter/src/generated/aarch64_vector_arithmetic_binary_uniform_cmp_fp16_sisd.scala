/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_uniform_cmp_fp16_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_result__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  val v_test_passed__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  if (((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))))) then {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      val v_Exp20__2 : RTSym = v_st.f_decl_bool("Exp20__2") 
      v_st.f_gen_store (v_Exp20__2,v_st.f_gen_FPCompareGE(BigInt(16), v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15))), v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(15))), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_test_passed__1_copyprop.v = v_st.f_gen_load(v_Exp20__2)
    } else {
      val v_Exp22__2 : RTSym = v_st.f_decl_bool("Exp22__2") 
      v_st.f_gen_store (v_Exp22__2,v_st.f_gen_FPCompareGT(BigInt(16), v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15))), v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(15))), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_test_passed__1_copyprop.v = v_st.f_gen_load(v_Exp22__2)
    }
    val v_If25__1 : RTSym = v_st.f_decl_bv("If25__1", BigInt(16)) 
    val v_temp0 : RTLabel = v_st.f_gen_branch(v_test_passed__1_copyprop.v) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp0))
    v_st.f_gen_store (v_If25__1,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("1111111111111111", 2))))
    v_st.f_switch_context (v_st.f_false_branch(v_temp0))
    v_st.f_gen_store (v_If25__1,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2))))
    v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
    v_result__1_copyprop.v = v_st.f_gen_load(v_If25__1)
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000100000000000100000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_Exp31__2 : RTSym = v_st.f_decl_bool("Exp31__2") 
      v_st.f_gen_store (v_Exp31__2,v_st.f_gen_FPCompareEQ(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_test_passed__1_copyprop.v = v_st.f_gen_load(v_Exp31__2)
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp33__2 : RTSym = v_st.f_decl_bool("Exp33__2") 
        v_st.f_gen_store (v_Exp33__2,v_st.f_gen_FPCompareGE(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_test_passed__1_copyprop.v = v_st.f_gen_load(v_Exp33__2)
      } else {
        val v_Exp35__2 : RTSym = v_st.f_decl_bool("Exp35__2") 
        v_st.f_gen_store (v_Exp35__2,v_st.f_gen_FPCompareGT(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_test_passed__1_copyprop.v = v_st.f_gen_load(v_Exp35__2)
      }
    }
    val v_If38__1 : RTSym = v_st.f_decl_bv("If38__1", BigInt(16)) 
    val v_temp1 : RTLabel = v_st.f_gen_branch(v_test_passed__1_copyprop.v) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp1))
    v_st.f_gen_store (v_If38__1,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("1111111111111111", 2))))
    v_st.f_switch_context (v_st.f_false_branch(v_temp1))
    v_st.f_gen_store (v_If38__1,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2))))
    v_st.f_switch_context (v_st.f_merge_branch(v_temp1))
    v_result__1_copyprop.v = v_st.f_gen_load(v_If38__1)
  }
  v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_result__1_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
}
