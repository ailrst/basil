/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_uniform_add_fp[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_Exp7__2 : RTSym = v_st.f_decl_bv("Exp7__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp7__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_Exp10__2 : RTSym = v_st.f_decl_bv("Exp10__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp10__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
        val v_result__1 : RTSym = v_st.f_decl_bv("result__1", BigInt(128)) 
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp15__2 : RTSym = v_st.f_decl_bv("Exp15__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp15__2,v_st.f_gen_FPAdd(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(96), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(32), BigInt(96)), v_st.f_gen_load(v_Exp15__2)))
        } else {
          val v_Exp21__2 : RTSym = v_st.f_decl_bv("Exp21__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp21__2,v_st.f_gen_FPAdd(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(96), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(32), BigInt(96)), v_st.f_gen_load(v_Exp21__2)))
        }
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp27__2 : RTSym = v_st.f_decl_bv("Exp27__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp27__2,v_st.f_gen_FPAdd(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(64), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(96), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(64), BigInt(64)), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp27__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(32)))))
        } else {
          val v_Exp33__2 : RTSym = v_st.f_decl_bv("Exp33__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp33__2,v_st.f_gen_FPAdd(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(32), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(64), BigInt(64)), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp33__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(32)))))
        }
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp39__2 : RTSym = v_st.f_decl_bv("Exp39__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp39__2,v_st.f_gen_FPAdd(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(96), BigInt(32)), v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_st.f_gen_load(v_Exp39__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(64)))))
        } else {
          val v_Exp45__2 : RTSym = v_st.f_decl_bv("Exp45__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp45__2,v_st.f_gen_FPAdd(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(64), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(64), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(96), BigInt(32)), v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_st.f_gen_load(v_Exp45__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(64)))))
        }
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp51__2 : RTSym = v_st.f_decl_bv("Exp51__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp51__2,v_st.f_gen_FPAdd(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(64), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(96), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_load(v_Exp51__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(96))))
        } else {
          val v_Exp57__2 : RTSym = v_st.f_decl_bv("Exp57__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp57__2,v_st.f_gen_FPAdd(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(96), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(96), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_load(v_Exp57__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(96))))
        }
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_load(v_result__1))
      } else {
        val v_Exp67__2 : RTSym = v_st.f_decl_bv("Exp67__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp67__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_Exp70__2 : RTSym = v_st.f_decl_bv("Exp70__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp70__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
        val v_result__1_1 : RTSym = v_st.f_decl_bv("result__1_1", BigInt(64)) 
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp75__2 : RTSym = v_st.f_decl_bv("Exp75__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp75__2,v_st.f_gen_FPAdd(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_st.f_gen_store (v_result__1_1,v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_1), BigInt(32), BigInt(32)), v_st.f_gen_load(v_Exp75__2)))
        } else {
          val v_Exp81__2 : RTSym = v_st.f_decl_bv("Exp81__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp81__2,v_st.f_gen_FPAdd(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_st.f_gen_store (v_result__1_1,v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_1), BigInt(32), BigInt(32)), v_st.f_gen_load(v_Exp81__2)))
        }
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp87__2 : RTSym = v_st.f_decl_bv("Exp87__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp87__2,v_st.f_gen_FPAdd(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp70__2), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp70__2), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_st.f_gen_store (v_result__1_1,v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp87__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_1), BigInt(0), BigInt(32))))
        } else {
          val v_Exp93__2 : RTSym = v_st.f_decl_bv("Exp93__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp93__2,v_st.f_gen_FPAdd(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp67__2), BigInt(32), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp70__2), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
          v_st.f_gen_store (v_result__1_1,v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp93__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_1), BigInt(0), BigInt(32))))
        }
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_result__1_1), v_st.f_gen_int_lit(BigInt(128))))
      }
    } else {
      val v_Exp104__2 : RTSym = v_st.f_decl_bv("Exp104__2", BigInt(128)) 
      v_st.f_gen_store (v_Exp104__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
      val v_Exp107__2 : RTSym = v_st.f_decl_bv("Exp107__2", BigInt(128)) 
      v_st.f_gen_store (v_Exp107__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
      val v_result__1_2 : RTSym = v_st.f_decl_bv("result__1_2", BigInt(128)) 
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp112__2 : RTSym = v_st.f_decl_bv("Exp112__2", BigInt(64)) 
        v_st.f_gen_store (v_Exp112__2,v_st.f_gen_FPAdd(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_st.f_gen_store (v_result__1_2,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_2), BigInt(64), BigInt(64)), v_st.f_gen_load(v_Exp112__2)))
      } else {
        val v_Exp118__2 : RTSym = v_st.f_decl_bv("Exp118__2", BigInt(64)) 
        v_st.f_gen_store (v_Exp118__2,v_st.f_gen_FPAdd(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_st.f_gen_store (v_result__1_2,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_2), BigInt(64), BigInt(64)), v_st.f_gen_load(v_Exp118__2)))
      }
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp124__2 : RTSym = v_st.f_decl_bv("Exp124__2", BigInt(64)) 
        v_st.f_gen_store (v_Exp124__2,v_st.f_gen_FPAdd(BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp107__2), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp107__2), BigInt(64), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_st.f_gen_store (v_result__1_2,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_load(v_Exp124__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_2), BigInt(0), BigInt(64))))
      } else {
        val v_Exp130__2 : RTSym = v_st.f_decl_bv("Exp130__2", BigInt(64)) 
        v_st.f_gen_store (v_Exp130__2,v_st.f_gen_FPAdd(BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp104__2), BigInt(64), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp107__2), BigInt(64), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
        v_st.f_gen_store (v_result__1_2,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_load(v_Exp130__2), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_2), BigInt(0), BigInt(64))))
      }
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_load(v_result__1_2))
    }
  }
}
