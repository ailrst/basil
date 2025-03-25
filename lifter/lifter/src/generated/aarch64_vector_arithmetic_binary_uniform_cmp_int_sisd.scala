/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_uniform_cmp_int_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2)))))) then {
    throw Exception("not supported")
  } else {
    val v_Exp94__2 : RTSym = v_st.f_decl_bv("Exp94__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp94__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
    val v_If97__2 : RTSym = v_st.f_decl_bv("If97__2", BigInt(128)) 
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_st.f_gen_store (v_If97__2,v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_int_lit(BigInt(128))))
    } else {
      v_st.f_gen_store (v_If97__2,v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_int_lit(BigInt(128))))
    }
    val v_If102__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If102__2_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_slice(v_st.f_gen_load(v_Exp94__2), BigInt(0), BigInt(64)), v_st.f_gen_int_lit(BigInt(128)))
    } else {
      v_If102__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_slice(v_st.f_gen_load(v_Exp94__2), BigInt(0), BigInt(64)), v_st.f_gen_int_lit(BigInt(128)))
    }
    val v_If105__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))) then {
      v_If105__1_copyprop.v = v_st.f_gen_sle_bits(BigInt(128), v_If102__2_copyprop.v, v_st.f_gen_load(v_If97__2))
    } else {
      v_If105__1_copyprop.v = v_st.f_gen_slt_bits(BigInt(128), v_If102__2_copyprop.v, v_st.f_gen_load(v_If97__2))
    }
    val v_If107__1 : RTSym = v_st.f_decl_bv("If107__1", BigInt(64)) 
    val v_temp0 : RTLabel = v_st.f_gen_branch(v_If105__1_copyprop.v) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp0))
    v_st.f_gen_store (v_If107__1,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2))))
    v_st.f_switch_context (v_st.f_false_branch(v_temp0))
    v_st.f_gen_store (v_If107__1,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_If107__1), v_st.f_gen_int_lit(BigInt(128))))
  }
}
