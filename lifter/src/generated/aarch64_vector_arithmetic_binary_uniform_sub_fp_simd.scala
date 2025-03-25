/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_uniform_sub_fp_simd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_Exp7__2 : RTSym = v_st.f_decl_bv("Exp7__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp7__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_Exp10__2 : RTSym = v_st.f_decl_bv("Exp10__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp10__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
        val v_Exp14__2 : RTSym = v_st.f_decl_bv("Exp14__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp14__2,v_st.f_gen_FPSub(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
        val v_If16__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If16__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp14__2), BigInt(0), BigInt(31)))
        } else {
          v_If16__1_copyprop.v = v_st.f_gen_load(v_Exp14__2)
        }
        val v_Exp21__2 : RTSym = v_st.f_decl_bv("Exp21__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp21__2,v_st.f_gen_FPSub(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(32), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
        val v_If22__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If22__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp21__2), BigInt(0), BigInt(31)))
        } else {
          v_If22__1_copyprop.v = v_st.f_gen_load(v_Exp21__2)
        }
        val v_Exp27__2 : RTSym = v_st.f_decl_bv("Exp27__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp27__2,v_st.f_gen_FPSub(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(64), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(64), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
        val v_If28__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If28__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp27__2), BigInt(0), BigInt(31)))
        } else {
          v_If28__1_copyprop.v = v_st.f_gen_load(v_Exp27__2)
        }
        val v_Exp33__2 : RTSym = v_st.f_decl_bv("Exp33__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp33__2,v_st.f_gen_FPSub(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(96), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp10__2), BigInt(96), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
        val v_If34__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If34__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp33__2), BigInt(0), BigInt(31)))
        } else {
          v_If34__1_copyprop.v = v_st.f_gen_load(v_Exp33__2)
        }
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_If34__1_copyprop.v, v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_If28__1_copyprop.v, v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_If22__1_copyprop.v, v_If16__1_copyprop.v))))
      } else {
        val v_Exp44__2 : RTSym = v_st.f_decl_bv("Exp44__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp44__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_Exp47__2 : RTSym = v_st.f_decl_bv("Exp47__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp47__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
        val v_Exp51__2 : RTSym = v_st.f_decl_bv("Exp51__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp51__2,v_st.f_gen_FPSub(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
        val v_If53__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If53__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp51__2), BigInt(0), BigInt(31)))
        } else {
          v_If53__1_copyprop.v = v_st.f_gen_load(v_Exp51__2)
        }
        val v_Exp58__2 : RTSym = v_st.f_decl_bv("Exp58__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp58__2,v_st.f_gen_FPSub(BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp44__2), BigInt(32), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp47__2), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v)))
        val v_If59__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If59__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp58__2), BigInt(0), BigInt(31)))
        } else {
          v_If59__1_copyprop.v = v_st.f_gen_load(v_Exp58__2)
        }
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_If59__1_copyprop.v, v_If53__1_copyprop.v), v_st.f_gen_int_lit(BigInt(128))))
      }
    } else {
      val v_Exp70__2 : RTSym = v_st.f_decl_bv("Exp70__2", BigInt(128)) 
      v_st.f_gen_store (v_Exp70__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
      val v_Exp73__2 : RTSym = v_st.f_decl_bv("Exp73__2", BigInt(128)) 
      v_st.f_gen_store (v_Exp73__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
      val v_Exp77__2 : RTSym = v_st.f_decl_bv("Exp77__2", BigInt(64)) 
      v_st.f_gen_store (v_Exp77__2,v_st.f_gen_FPSub(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
      val v_If79__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        v_If79__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(63), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp77__2), BigInt(0), BigInt(63)))
      } else {
        v_If79__1_copyprop.v = v_st.f_gen_load(v_Exp77__2)
      }
      val v_Exp84__2 : RTSym = v_st.f_decl_bv("Exp84__2", BigInt(64)) 
      v_st.f_gen_store (v_Exp84__2,v_st.f_gen_FPSub(BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp70__2), BigInt(64), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_load(v_Exp73__2), BigInt(64), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v)))
      val v_If85__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        v_If85__1_copyprop.v = v_st.f_gen_append_bits(BigInt(1), BigInt(63), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp84__2), BigInt(0), BigInt(63)))
      } else {
        v_If85__1_copyprop.v = v_st.f_gen_load(v_Exp84__2)
      }
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_If85__1_copyprop.v, v_If79__1_copyprop.v))
    }
  }
}
