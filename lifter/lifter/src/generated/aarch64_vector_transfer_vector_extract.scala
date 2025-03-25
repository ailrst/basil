/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_transfer_vector_extract[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000100000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000100000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(256), BigInt(14), v_st.f_gen_append_bits(BigInt(128), BigInt(128), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))), v_st.f_gen_bit_lit(BigInt(14), v_st.f_ZeroExtend(BigInt(7), BigInt(14), v_st.f_append_bits(BigInt(4), BigInt(3), v_st.bvextract(v_enc,BigInt(11),BigInt(4)), v_st.mkBits(3, BigInt("000", 2))), BigInt(14)))), BigInt(0), BigInt(128)), BigInt(0), BigInt(128)))
    } else {
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(14), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))), v_st.f_gen_bit_lit(BigInt(14), v_st.f_ZeroExtend(BigInt(7), BigInt(14), v_st.f_append_bits(BigInt(4), BigInt(3), v_st.bvextract(v_enc,BigInt(11),BigInt(4)), v_st.mkBits(3, BigInt("000", 2))), BigInt(14)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), v_st.f_gen_int_lit(BigInt(128))))
    }
  }
}
