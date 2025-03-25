/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_disparate_mul_double_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))))) then {
    throw Exception("not supported")
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
      val v_SignedSatQ51__2 : RTSym = v_st.f_decl_bv("SignedSatQ51__2", BigInt(32)) 
      val v_SignedSatQ52__2 : RTSym = v_st.f_decl_bool("SignedSatQ52__2") 
      val v_temp0 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000001111111111111111111111111111111", 2))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64)))))) 
      v_st.f_switch_context (v_st.f_true_branch(v_temp0))
      v_st.f_gen_store (v_SignedSatQ51__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("01111111111111111111111111111111", 2))))
      v_st.f_gen_store (v_SignedSatQ52__2,v_st.f_gen_bool_lit(true))
      v_st.f_switch_context (v_st.f_false_branch(v_temp0))
      v_st.f_gen_store (v_SignedSatQ51__2,v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))), BigInt(0), BigInt(32)))
      v_st.f_gen_store (v_SignedSatQ52__2,v_st.f_gen_bool_lit(false))
      v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
      val v_temp1 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ52__2)) 
      v_st.f_switch_context (v_st.f_true_branch(v_temp1))
      v_st.f_gen_store (v_st.v_FPSR.v,v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27)))))
      v_st.f_switch_context (v_st.f_merge_branch(v_temp1))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_SignedSatQ51__2), v_st.f_gen_int_lit(BigInt(128))))
    } else {
      val v_SignedSatQ82__2 : RTSym = v_st.f_decl_bv("SignedSatQ82__2", BigInt(64)) 
      val v_SignedSatQ83__2 : RTSym = v_st.f_decl_bool("SignedSatQ83__2") 
      val v_temp2 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111", 2))), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128)))))) 
      v_st.f_switch_context (v_st.f_true_branch(v_temp2))
      v_st.f_gen_store (v_SignedSatQ82__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0111111111111111111111111111111111111111111111111111111111111111", 2))))
      v_st.f_gen_store (v_SignedSatQ83__2,v_st.f_gen_bool_lit(true))
      v_st.f_switch_context (v_st.f_false_branch(v_temp2))
      v_st.f_gen_store (v_SignedSatQ82__2,v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64)))
      v_st.f_gen_store (v_SignedSatQ83__2,v_st.f_gen_bool_lit(false))
      v_st.f_switch_context (v_st.f_merge_branch(v_temp2))
      val v_temp3 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ83__2)) 
      v_st.f_switch_context (v_st.f_true_branch(v_temp3))
      v_st.f_gen_store (v_st.v_FPSR.v,v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27)))))
      v_st.f_switch_context (v_st.f_merge_branch(v_temp3))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_SignedSatQ82__2), v_st.f_gen_int_lit(BigInt(128))))
    }
  }
}
