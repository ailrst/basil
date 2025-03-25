/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_special_sqrt_est_int[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
      val v_Exp8__2 : RTSym = v_st.f_decl_bv("Exp8__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp8__2,v_st.f_gen_UnsignedRSqrtEstimate(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))))
      val v_Exp11__2 : RTSym = v_st.f_decl_bv("Exp11__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp11__2,v_st.f_gen_UnsignedRSqrtEstimate(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32))))
      val v_Exp14__2 : RTSym = v_st.f_decl_bv("Exp14__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp14__2,v_st.f_gen_UnsignedRSqrtEstimate(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(32))))
      val v_Exp17__2 : RTSym = v_st.f_decl_bv("Exp17__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp17__2,v_st.f_gen_UnsignedRSqrtEstimate(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(32))))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_load(v_Exp17__2), v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_st.f_gen_load(v_Exp14__2), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp11__2), v_st.f_gen_load(v_Exp8__2)))))
    } else {
      val v_Exp29__2 : RTSym = v_st.f_decl_bv("Exp29__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp29__2,v_st.f_gen_UnsignedRSqrtEstimate(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))))
      val v_Exp32__2 : RTSym = v_st.f_decl_bv("Exp32__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp32__2,v_st.f_gen_UnsignedRSqrtEstimate(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32))))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp32__2), v_st.f_gen_load(v_Exp29__2)), v_st.f_gen_int_lit(BigInt(128))))
    }
  }
}
