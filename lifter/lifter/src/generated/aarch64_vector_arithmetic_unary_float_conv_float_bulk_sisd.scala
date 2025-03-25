/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_float_conv_float_bulk_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_FPDecodeRounding4__2 = Mutable[BV](v_st.mkBits(BigInt(4), BigInt(0)))
    v_FPDecodeRounding4__2.v = v_st.f_ZeroExtend(BigInt(2), BigInt(4), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(12),BigInt(1)), v_st.bvextract(v_enc,BigInt(23),BigInt(1))), BigInt(4))
    val v_Exp12__2 : RTSym = v_st.f_decl_bv("Exp12__2", BigInt(32)) 
    v_st.f_gen_store (v_Exp12__2,v_st.f_gen_FPToFixed(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_int_lit(v_st.f_cvt_bits_uint(BigInt(4), v_FPDecodeRounding4__2.v))))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_Exp12__2), v_st.f_gen_int_lit(BigInt(128))))
  } else {
    val v_FPDecodeRounding20__2 = Mutable[BV](v_st.mkBits(BigInt(4), BigInt(0)))
    v_FPDecodeRounding20__2.v = v_st.f_ZeroExtend(BigInt(2), BigInt(4), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(12),BigInt(1)), v_st.bvextract(v_enc,BigInt(23),BigInt(1))), BigInt(4))
    val v_Exp28__2 : RTSym = v_st.f_decl_bv("Exp28__2", BigInt(64)) 
    v_st.f_gen_store (v_Exp28__2,v_st.f_gen_FPToFixed(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_int_lit(BigInt(0)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(29),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_int_lit(v_st.f_cvt_bits_uint(BigInt(4), v_FPDecodeRounding20__2.v))))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_Exp28__2), v_st.f_gen_int_lit(BigInt(128))))
  }
}
