/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_uniform_mul_fp_mul_norounding_upper[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
    val v_Exp11__3 : RTSym = v_st.f_decl_bv("Exp11__3", BigInt(128)) 
    v_st.f_gen_store (v_Exp11__3,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_Exp16__3 : RTSym = v_st.f_decl_bv("Exp16__3", BigInt(128)) 
    v_st.f_gen_store (v_Exp16__3,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
    val v_Exp19__2 : RTSym = v_st.f_decl_bv("Exp19__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp19__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))))
    val v_result__1 : RTSym = v_st.f_decl_bv("result__1", BigInt(128)) 
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp26__2 : RTSym = v_st.f_decl_bv("Exp26__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp26__2,v_st.f_gen_FPMulAddH(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(79), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(15))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(64), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(96), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(32), BigInt(96)), v_st.f_gen_load(v_Exp26__2)))
    } else {
      val v_Exp31__2 : RTSym = v_st.f_decl_bv("Exp31__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp31__2,v_st.f_gen_FPMulAddH(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(64), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(96), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(32), BigInt(96)), v_st.f_gen_load(v_Exp31__2)))
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp39__2 : RTSym = v_st.f_decl_bv("Exp39__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp39__2,v_st.f_gen_FPMulAddH(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp19__2), BigInt(32), BigInt(32)), v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_load(v_Exp11__3), BigInt(95), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp11__3), BigInt(80), BigInt(15))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp16__3), BigInt(80), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(64), BigInt(64)), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp39__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(32)))))
    } else {
      val v_Exp44__2 : RTSym = v_st.f_decl_bv("Exp44__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp44__2,v_st.f_gen_FPMulAddH(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp19__2), BigInt(32), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp11__3), BigInt(80), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp16__3), BigInt(80), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(64), BigInt(64)), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp44__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(32)))))
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp52__2 : RTSym = v_st.f_decl_bv("Exp52__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp52__2,v_st.f_gen_FPMulAddH(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp19__2), BigInt(64), BigInt(32)), v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_load(v_Exp11__3), BigInt(111), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp11__3), BigInt(96), BigInt(15))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp16__3), BigInt(96), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(96), BigInt(32)), v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_st.f_gen_load(v_Exp52__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(64)))))
    } else {
      val v_Exp57__2 : RTSym = v_st.f_decl_bv("Exp57__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp57__2,v_st.f_gen_FPMulAddH(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp19__2), BigInt(64), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp11__3), BigInt(96), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp16__3), BigInt(96), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(96), BigInt(32)), v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_st.f_gen_load(v_Exp57__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(64)))))
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp65__2 : RTSym = v_st.f_decl_bv("Exp65__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp65__2,v_st.f_gen_FPMulAddH(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp19__2), BigInt(96), BigInt(32)), v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_load(v_Exp11__3), BigInt(127), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp11__3), BigInt(112), BigInt(15))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp16__3), BigInt(112), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_load(v_Exp65__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(96))))
    } else {
      val v_Exp70__2 : RTSym = v_st.f_decl_bv("Exp70__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp70__2,v_st.f_gen_FPMulAddH(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp19__2), BigInt(96), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp11__3), BigInt(112), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp16__3), BigInt(112), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_load(v_Exp70__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(96))))
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_load(v_result__1))
  } else {
    val v_Exp82__3 : RTSym = v_st.f_decl_bv("Exp82__3", BigInt(128)) 
    v_st.f_gen_store (v_Exp82__3,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_Exp87__3 : RTSym = v_st.f_decl_bv("Exp87__3", BigInt(128)) 
    v_st.f_gen_store (v_Exp87__3,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
    val v_Exp90__2 : RTSym = v_st.f_decl_bv("Exp90__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp90__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))))
    val v_result__1_1 : RTSym = v_st.f_decl_bv("result__1_1", BigInt(64)) 
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp97__2 : RTSym = v_st.f_decl_bv("Exp97__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp97__2,v_st.f_gen_FPMulAddH(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(47), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(15))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(32), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_result__1_1,v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_1), BigInt(32), BigInt(32)), v_st.f_gen_load(v_Exp97__2)))
    } else {
      val v_Exp102__2 : RTSym = v_st.f_decl_bv("Exp102__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp102__2,v_st.f_gen_FPMulAddH(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(32), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_result__1_1,v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_1), BigInt(32), BigInt(32)), v_st.f_gen_load(v_Exp102__2)))
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp110__2 : RTSym = v_st.f_decl_bv("Exp110__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp110__2,v_st.f_gen_FPMulAddH(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp90__2), BigInt(32), BigInt(32)), v_st.f_gen_append_bits(BigInt(1), BigInt(15), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_load(v_Exp82__3), BigInt(63), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp82__3), BigInt(48), BigInt(15))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp87__3), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_result__1_1,v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp110__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_1), BigInt(0), BigInt(32))))
    } else {
      val v_Exp115__2 : RTSym = v_st.f_decl_bv("Exp115__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp115__2,v_st.f_gen_FPMulAddH(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp90__2), BigInt(32), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp82__3), BigInt(48), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp87__3), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_result__1_1,v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp115__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_1), BigInt(0), BigInt(32))))
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_result__1_1), v_st.f_gen_int_lit(BigInt(128))))
  }
}
