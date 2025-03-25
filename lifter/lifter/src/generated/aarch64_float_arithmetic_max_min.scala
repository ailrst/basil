/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_float_arithmetic_max_min[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_result__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_Exp13__2 : RTSym = v_st.f_decl_bv("Exp13__2", BigInt(32)) 
      v_st.f_gen_store (v_Exp13__2,v_st.f_gen_FPMax(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_result__1_copyprop.v = v_st.f_gen_load(v_Exp13__2)
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))) then {
        val v_Exp15__2 : RTSym = v_st.f_decl_bv("Exp15__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp15__2,v_st.f_gen_FPMin(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_result__1_copyprop.v = v_st.f_gen_load(v_Exp15__2)
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000010000000000000", 2)))) then {
          val v_Exp17__2 : RTSym = v_st.f_decl_bv("Exp17__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp17__2,v_st.f_gen_FPMaxNum(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_result__1_copyprop.v = v_st.f_gen_load(v_Exp17__2)
        } else {
          val v_Exp19__2 : RTSym = v_st.f_decl_bv("Exp19__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp19__2,v_st.f_gen_FPMinNum(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_result__1_copyprop.v = v_st.f_gen_load(v_Exp19__2)
        }
      }
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_result__1_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
      val v_result__1_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_Exp35__2 : RTSym = v_st.f_decl_bv("Exp35__2", BigInt(64)) 
        v_st.f_gen_store (v_Exp35__2,v_st.f_gen_FPMax(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_result__1_1_copyprop.v = v_st.f_gen_load(v_Exp35__2)
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))) then {
          val v_Exp37__2 : RTSym = v_st.f_decl_bv("Exp37__2", BigInt(64)) 
          v_st.f_gen_store (v_Exp37__2,v_st.f_gen_FPMin(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_result__1_1_copyprop.v = v_st.f_gen_load(v_Exp37__2)
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000010000000000000", 2)))) then {
            val v_Exp39__2 : RTSym = v_st.f_decl_bv("Exp39__2", BigInt(64)) 
            v_st.f_gen_store (v_Exp39__2,v_st.f_gen_FPMaxNum(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
            v_result__1_1_copyprop.v = v_st.f_gen_load(v_Exp39__2)
          } else {
            val v_Exp41__2 : RTSym = v_st.f_decl_bv("Exp41__2", BigInt(64)) 
            v_st.f_gen_store (v_Exp41__2,v_st.f_gen_FPMinNum(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
            v_result__1_1_copyprop.v = v_st.f_gen_load(v_Exp41__2)
          }
        }
      }
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_result__1_1_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
    } else {
      val v_result__1_2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_Exp59__2 : RTSym = v_st.f_decl_bv("Exp59__2", BigInt(16)) 
        v_st.f_gen_store (v_Exp59__2,v_st.f_gen_FPMax(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_result__1_2_copyprop.v = v_st.f_gen_load(v_Exp59__2)
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))) then {
          val v_Exp61__2 : RTSym = v_st.f_decl_bv("Exp61__2", BigInt(16)) 
          v_st.f_gen_store (v_Exp61__2,v_st.f_gen_FPMin(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_result__1_2_copyprop.v = v_st.f_gen_load(v_Exp61__2)
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000010000000000000", 2)))) then {
            val v_Exp63__2 : RTSym = v_st.f_decl_bv("Exp63__2", BigInt(16)) 
            v_st.f_gen_store (v_Exp63__2,v_st.f_gen_FPMaxNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
            v_result__1_2_copyprop.v = v_st.f_gen_load(v_Exp63__2)
          } else {
            val v_Exp65__2 : RTSym = v_st.f_decl_bv("Exp65__2", BigInt(16)) 
            v_st.f_gen_store (v_Exp65__2,v_st.f_gen_FPMinNum(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v)))
            v_result__1_2_copyprop.v = v_st.f_gen_load(v_Exp65__2)
          }
        }
      }
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_result__1_2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))
    }
  }
}
