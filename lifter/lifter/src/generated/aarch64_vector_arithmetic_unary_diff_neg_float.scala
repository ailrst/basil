/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_diff_neg_float[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_Exp6__2 : RTSym = v_st.f_decl_bv("Exp6__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp6__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_result__1 : RTSym = v_st.f_decl_bv("result__1", BigInt(128)) 
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(96), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(32), BigInt(96)), v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(31), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31)))))
        } else {
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(96), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(32), BigInt(96)), v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31)))))
        }
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(64), BigInt(64)), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(63), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(32), BigInt(31))), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(32)))))
        } else {
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(64), BigInt(64)), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(32), BigInt(31))), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(32)))))
        }
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(96), BigInt(32)), v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(95), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(64), BigInt(31))), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(64)))))
        } else {
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(96), BigInt(32)), v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(64), BigInt(31))), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(64)))))
        }
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(127), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(96), BigInt(31))), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(96))))
        } else {
          v_st.f_gen_store (v_result__1,v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp6__2), BigInt(96), BigInt(31))), v_st.f_gen_slice(v_st.f_gen_load(v_result__1), BigInt(0), BigInt(96))))
        }
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_load(v_result__1))
      } else {
        val v_Exp43__2 : RTSym = v_st.f_decl_bv("Exp43__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp43__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_result__1_1 : RTSym = v_st.f_decl_bv("result__1_1", BigInt(64)) 
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_st.f_gen_store (v_result__1_1,v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_1), BigInt(32), BigInt(32)), v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(31), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31)))))
        } else {
          v_st.f_gen_store (v_result__1_1,v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_1), BigInt(32), BigInt(32)), v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31)))))
        }
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_st.f_gen_store (v_result__1_1,v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_load(v_Exp43__2), BigInt(63), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp43__2), BigInt(32), BigInt(31))), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_1), BigInt(0), BigInt(32))))
        } else {
          v_st.f_gen_store (v_result__1_1,v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_append_bits(BigInt(1), BigInt(31), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp43__2), BigInt(32), BigInt(31))), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_1), BigInt(0), BigInt(32))))
        }
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_result__1_1), v_st.f_gen_int_lit(BigInt(128))))
      }
    } else {
      val v_Exp67__2 : RTSym = v_st.f_decl_bv("Exp67__2", BigInt(128)) 
      v_st.f_gen_store (v_Exp67__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
      val v_result__1_2 : RTSym = v_st.f_decl_bv("result__1_2", BigInt(128)) 
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        v_st.f_gen_store (v_result__1_2,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_2), BigInt(64), BigInt(64)), v_st.f_gen_append_bits(BigInt(1), BigInt(63), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(63), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(63)))))
      } else {
        v_st.f_gen_store (v_result__1_2,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_2), BigInt(64), BigInt(64)), v_st.f_gen_append_bits(BigInt(1), BigInt(63), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(63)))))
      }
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        v_st.f_gen_store (v_result__1_2,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_append_bits(BigInt(1), BigInt(63), v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_load(v_Exp67__2), BigInt(127), BigInt(1))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp67__2), BigInt(64), BigInt(63))), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_2), BigInt(0), BigInt(64))))
      } else {
        v_st.f_gen_store (v_result__1_2,v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_append_bits(BigInt(1), BigInt(63), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_Exp67__2), BigInt(64), BigInt(63))), v_st.f_gen_slice(v_st.f_gen_load(v_result__1_2), BigInt(0), BigInt(64))))
      }
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_load(v_result__1_2))
    }
  }
}
