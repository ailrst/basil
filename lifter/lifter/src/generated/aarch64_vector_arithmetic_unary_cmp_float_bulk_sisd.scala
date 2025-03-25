/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_cmp_float_bulk_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_test_passed__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_Exp13__2 : RTSym = v_st.f_decl_bool("Exp13__2") 
      v_st.f_gen_store (v_Exp13__2,v_st.f_gen_FPCompareGT(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_test_passed__1_copyprop.v = v_st.f_gen_load(v_Exp13__2)
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000001000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp15__2 : RTSym = v_st.f_decl_bool("Exp15__2") 
        v_st.f_gen_store (v_Exp15__2,v_st.f_gen_FPCompareGE(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_test_passed__1_copyprop.v = v_st.f_gen_load(v_Exp15__2)
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))) then {
          val v_Exp17__2 : RTSym = v_st.f_decl_bool("Exp17__2") 
          v_st.f_gen_store (v_Exp17__2,v_st.f_gen_FPCompareEQ(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_test_passed__1_copyprop.v = v_st.f_gen_load(v_Exp17__2)
        } else {
          val v_Exp19__2 : RTSym = v_st.f_decl_bool("Exp19__2") 
          v_st.f_gen_store (v_Exp19__2,v_st.f_gen_FPCompareGE(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_test_passed__1_copyprop.v = v_st.f_gen_load(v_Exp19__2)
        }
      }
    }
    val v_If24__1 : RTSym = v_st.f_decl_bv("If24__1", BigInt(32)) 
    val v_temp0 : RTLabel = v_st.f_gen_branch(v_test_passed__1_copyprop.v) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp0))
    v_st.f_gen_store (v_If24__1,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("11111111111111111111111111111111", 2))))
    v_st.f_switch_context (v_st.f_false_branch(v_temp0))
    v_st.f_gen_store (v_If24__1,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
    v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_If24__1), v_st.f_gen_int_lit(BigInt(128))))
  } else {
    val v_test_passed__1_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_Exp43__2 : RTSym = v_st.f_decl_bool("Exp43__2") 
      v_st.f_gen_store (v_Exp43__2,v_st.f_gen_FPCompareGT(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_test_passed__1_1_copyprop.v = v_st.f_gen_load(v_Exp43__2)
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000001000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp45__2 : RTSym = v_st.f_decl_bool("Exp45__2") 
        v_st.f_gen_store (v_Exp45__2,v_st.f_gen_FPCompareGE(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_test_passed__1_1_copyprop.v = v_st.f_gen_load(v_Exp45__2)
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))) then {
          val v_Exp47__2 : RTSym = v_st.f_decl_bool("Exp47__2") 
          v_st.f_gen_store (v_Exp47__2,v_st.f_gen_FPCompareEQ(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_test_passed__1_1_copyprop.v = v_st.f_gen_load(v_Exp47__2)
        } else {
          val v_Exp49__2 : RTSym = v_st.f_decl_bool("Exp49__2") 
          v_st.f_gen_store (v_Exp49__2,v_st.f_gen_FPCompareGE(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_test_passed__1_1_copyprop.v = v_st.f_gen_load(v_Exp49__2)
        }
      }
    }
    val v_If54__1 : RTSym = v_st.f_decl_bv("If54__1", BigInt(64)) 
    val v_temp1 : RTLabel = v_st.f_gen_branch(v_test_passed__1_1_copyprop.v) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp1))
    v_st.f_gen_store (v_If54__1,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2))))
    v_st.f_switch_context (v_st.f_false_branch(v_temp1))
    v_st.f_gen_store (v_If54__1,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    v_st.f_switch_context (v_st.f_merge_branch(v_temp1))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_If54__1), v_st.f_gen_int_lit(BigInt(128))))
  }
}
