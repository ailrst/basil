/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_element_mul_fp_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))) then {
    val v_index__1 = Mutable[BV](v_st.mkBits(BigInt(2), BigInt(0)))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_index__1.v = v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(11),BigInt(1)), v_st.bvextract(v_enc,BigInt(21),BigInt(1)))
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000011000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
        v_index__1.v = v_st.f_ZeroExtend(BigInt(1), BigInt(2), v_st.bvextract(v_enc,BigInt(11),BigInt(1)), BigInt(2))
      } else {
        throw Exception("not supported")
      }
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_result__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp19__2 : RTSym = v_st.f_decl_bv("Exp19__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp19__2,v_st.f_gen_FPMulX(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_st.bvextract(v_enc,BigInt(20),BigInt(1)), v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_result__1_copyprop.v = v_st.f_gen_load(v_Exp19__2)
      } else {
        val v_Exp23__2 : RTSym = v_st.f_decl_bv("Exp23__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp23__2,v_st.f_gen_FPMul(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_st.bvextract(v_enc,BigInt(20),BigInt(1)), v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_result__1_copyprop.v = v_st.f_gen_load(v_Exp23__2)
      }
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_result__1_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
    } else {
      val v_result__1_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      assert (((true) && (v_st.f_sle_bits(BigInt(32), v_st.f_ZeroExtend(BigInt(16), BigInt(32), v_st.f_add_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("01000000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000001000000", 2))), BigInt(32)), v_st.mkBits(32, BigInt("00000000000000000000000010000000", 2))))))
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp44__2 : RTSym = v_st.f_decl_bv("Exp44__2", BigInt(64)) 
        v_st.f_gen_store (v_Exp44__2,v_st.f_gen_FPMulX(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_st.bvextract(v_enc,BigInt(20),BigInt(1)), v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("01000000", 2))), BigInt(16)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_result__1_1_copyprop.v = v_st.f_gen_load(v_Exp44__2)
      } else {
        val v_Exp48__2 : RTSym = v_st.f_decl_bv("Exp48__2", BigInt(64)) 
        v_st.f_gen_store (v_Exp48__2,v_st.f_gen_FPMul(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_st.bvextract(v_enc,BigInt(20),BigInt(1)), v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("01000000", 2))), BigInt(16)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_result__1_1_copyprop.v = v_st.f_gen_load(v_Exp48__2)
      }
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_result__1_1_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
    }
  } else {
    val v_index__1_1 = Mutable[BV](v_st.mkBits(BigInt(2), BigInt(0)))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_index__1_1.v = v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(11),BigInt(1)), v_st.bvextract(v_enc,BigInt(21),BigInt(1)))
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000011000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
        v_index__1_1.v = v_st.f_ZeroExtend(BigInt(1), BigInt(2), v_st.bvextract(v_enc,BigInt(11),BigInt(1)), BigInt(2))
      } else {
        throw Exception("not supported")
      }
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_result__1_2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      assert (((true) && (v_st.f_sle_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_add_bits(BigInt(8), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000001000000", 2))))))
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp74__2 : RTSym = v_st.f_decl_bv("Exp74__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp74__2,v_st.f_gen_FPMulX(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_st.bvextract(v_enc,BigInt(20),BigInt(1)), v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_result__1_2_copyprop.v = v_st.f_gen_load(v_Exp74__2)
      } else {
        val v_Exp78__2 : RTSym = v_st.f_decl_bv("Exp78__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp78__2,v_st.f_gen_FPMul(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_st.bvextract(v_enc,BigInt(20),BigInt(1)), v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_result__1_2_copyprop.v = v_st.f_gen_load(v_Exp78__2)
      }
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_result__1_2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
    } else {
      val v_result__1_3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      assert (((true) && (v_st.f_sle_bits(BigInt(32), v_st.f_ZeroExtend(BigInt(16), BigInt(32), v_st.f_add_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("01000000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000001000000", 2))), BigInt(32)), v_st.mkBits(32, BigInt("00000000000000000000000001000000", 2))))))
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp99__2 : RTSym = v_st.f_decl_bv("Exp99__2", BigInt(64)) 
        v_st.f_gen_store (v_Exp99__2,v_st.f_gen_FPMulX(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_st.bvextract(v_enc,BigInt(20),BigInt(1)), v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("01000000", 2))), BigInt(16)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_result__1_3_copyprop.v = v_st.f_gen_load(v_Exp99__2)
      } else {
        val v_Exp103__2 : RTSym = v_st.f_decl_bv("Exp103__2", BigInt(64)) 
        v_st.f_gen_store (v_Exp103__2,v_st.f_gen_FPMul(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_st.bvextract(v_enc,BigInt(20),BigInt(1)), v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("01000000", 2))), BigInt(16)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_result__1_3_copyprop.v = v_st.f_gen_load(v_Exp103__2)
      }
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_result__1_3_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
    }
  }
}
