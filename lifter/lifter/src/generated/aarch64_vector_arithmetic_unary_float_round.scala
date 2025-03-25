/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_float_round[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_exact__1 = Mutable[Boolean](false)
        val v_rounding__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
          val v_FPDecodeRounding4__2 = Mutable[BV](v_st.mkBits(BigInt(4), BigInt(0)))
          v_FPDecodeRounding4__2.v = v_st.f_ZeroExtend(BigInt(2), BigInt(4), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(12),BigInt(1)), v_st.bvextract(v_enc,BigInt(23),BigInt(1))), BigInt(4))
          v_rounding__1_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_FPDecodeRounding4__2.v)
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000100000000001000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
            v_rounding__1_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_st.mkBits(4, BigInt("0100", 2)))
          } else {
            if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000100000000001000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000001000000000000", 2)))) then {
              val v_FPDecodeRounding8__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
              v_FPDecodeRounding8__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
              v_rounding__1_copyprop.v = v_FPDecodeRounding8__3_copyprop.v
              v_exact__1.v = true
            } else {
              val v_FPDecodeRounding12__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
              v_FPDecodeRounding12__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
              v_rounding__1_copyprop.v = v_FPDecodeRounding12__3_copyprop.v
            }
          }
        }
        val v_Exp22__2 : RTSym = v_st.f_decl_bv("Exp22__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp22__2,v_st.f_gen_FPRoundInt(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
        val v_Exp25__2 : RTSym = v_st.f_decl_bv("Exp25__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp25__2,v_st.f_gen_FPRoundInt(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
        val v_Exp28__2 : RTSym = v_st.f_decl_bv("Exp28__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp28__2,v_st.f_gen_FPRoundInt(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
        val v_Exp31__2 : RTSym = v_st.f_decl_bv("Exp31__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp31__2,v_st.f_gen_FPRoundInt(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_load(v_Exp31__2), v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_st.f_gen_load(v_Exp28__2), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp25__2), v_st.f_gen_load(v_Exp22__2)))))
      } else {
        val v_exact__1_1 = Mutable[Boolean](false)
        val v_rounding__1_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
          val v_FPDecodeRounding38__2 = Mutable[BV](v_st.mkBits(BigInt(4), BigInt(0)))
          v_FPDecodeRounding38__2.v = v_st.f_ZeroExtend(BigInt(2), BigInt(4), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(12),BigInt(1)), v_st.bvextract(v_enc,BigInt(23),BigInt(1))), BigInt(4))
          v_rounding__1_1_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_FPDecodeRounding38__2.v)
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000100000000001000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
            v_rounding__1_1_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_st.mkBits(4, BigInt("0100", 2)))
          } else {
            if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000100000000001000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000001000000000000", 2)))) then {
              val v_FPDecodeRounding42__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
              v_FPDecodeRounding42__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
              v_rounding__1_1_copyprop.v = v_FPDecodeRounding42__3_copyprop.v
              v_exact__1_1.v = true
            } else {
              val v_FPDecodeRounding46__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
              v_FPDecodeRounding46__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
              v_rounding__1_1_copyprop.v = v_FPDecodeRounding46__3_copyprop.v
            }
          }
        }
        val v_Exp56__2 : RTSym = v_st.f_decl_bv("Exp56__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp56__2,v_st.f_gen_FPRoundInt(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1_1.v)))
        val v_Exp59__2 : RTSym = v_st.f_decl_bv("Exp59__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp59__2,v_st.f_gen_FPRoundInt(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1_1.v)))
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_Exp59__2), v_st.f_gen_load(v_Exp56__2)), v_st.f_gen_int_lit(BigInt(128))))
      }
    } else {
      val v_exact__1_2 = Mutable[Boolean](false)
      val v_rounding__1_2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_FPDecodeRounding67__2 = Mutable[BV](v_st.mkBits(BigInt(4), BigInt(0)))
        v_FPDecodeRounding67__2.v = v_st.f_ZeroExtend(BigInt(2), BigInt(4), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(12),BigInt(1)), v_st.bvextract(v_enc,BigInt(23),BigInt(1))), BigInt(4))
        v_rounding__1_2_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_FPDecodeRounding67__2.v)
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000100000000001000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_rounding__1_2_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_st.mkBits(4, BigInt("0100", 2)))
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000100000000001000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000001000000000000", 2)))) then {
            val v_FPDecodeRounding71__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
            v_FPDecodeRounding71__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
            v_rounding__1_2_copyprop.v = v_FPDecodeRounding71__3_copyprop.v
            v_exact__1_2.v = true
          } else {
            val v_FPDecodeRounding75__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
            v_FPDecodeRounding75__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
            v_rounding__1_2_copyprop.v = v_FPDecodeRounding75__3_copyprop.v
          }
        }
      }
      val v_Exp85__2 : RTSym = v_st.f_decl_bv("Exp85__2", BigInt(64)) 
      v_st.f_gen_store (v_Exp85__2,v_st.f_gen_FPRoundInt(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_2_copyprop.v), v_st.f_gen_bool_lit(v_exact__1_2.v)))
      val v_Exp88__2 : RTSym = v_st.f_decl_bv("Exp88__2", BigInt(64)) 
      v_st.f_gen_store (v_Exp88__2,v_st.f_gen_FPRoundInt(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_2_copyprop.v), v_st.f_gen_bool_lit(v_exact__1_2.v)))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_load(v_Exp88__2), v_st.f_gen_load(v_Exp85__2)))
    }
  }
}
