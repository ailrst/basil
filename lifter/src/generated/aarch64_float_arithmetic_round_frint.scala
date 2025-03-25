/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_float_arithmetic_round_frint[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_exact__1 = Mutable[Boolean](false)
    val v_rounding__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000100000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_FPDecodeRounding4__2 = Mutable[BV](v_st.mkBits(BigInt(4), BigInt(0)))
      v_FPDecodeRounding4__2.v = v_st.f_ZeroExtend(BigInt(2), BigInt(4), v_st.bvextract(v_enc,BigInt(15),BigInt(2)), BigInt(4))
      v_rounding__1_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_FPDecodeRounding4__2.v)
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000111000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000100000000000000000", 2)))) then {
        v_rounding__1_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_st.mkBits(4, BigInt("0100", 2)))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000111000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000110000000000000000", 2)))) then {
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
    val v_Exp20__2 : RTSym = v_st.f_decl_bv("Exp20__2", BigInt(32)) 
    v_st.f_gen_store (v_Exp20__2,v_st.f_gen_FPRoundInt(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_Exp20__2), v_st.f_gen_int_lit(BigInt(128))))
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
      val v_exact__1_1 = Mutable[Boolean](false)
      val v_rounding__1_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000100000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_FPDecodeRounding27__2 = Mutable[BV](v_st.mkBits(BigInt(4), BigInt(0)))
        v_FPDecodeRounding27__2.v = v_st.f_ZeroExtend(BigInt(2), BigInt(4), v_st.bvextract(v_enc,BigInt(15),BigInt(2)), BigInt(4))
        v_rounding__1_1_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_FPDecodeRounding27__2.v)
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000111000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000100000000000000000", 2)))) then {
          v_rounding__1_1_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_st.mkBits(4, BigInt("0100", 2)))
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000111000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000110000000000000000", 2)))) then {
            val v_FPDecodeRounding31__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
            v_FPDecodeRounding31__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
            v_rounding__1_1_copyprop.v = v_FPDecodeRounding31__3_copyprop.v
            v_exact__1_1.v = true
          } else {
            val v_FPDecodeRounding35__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
            v_FPDecodeRounding35__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
            v_rounding__1_1_copyprop.v = v_FPDecodeRounding35__3_copyprop.v
          }
        }
      }
      val v_Exp43__2 : RTSym = v_st.f_decl_bv("Exp43__2", BigInt(64)) 
      v_st.f_gen_store (v_Exp43__2,v_st.f_gen_FPRoundInt(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1_1.v)))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_Exp43__2), v_st.f_gen_int_lit(BigInt(128))))
    } else {
      val v_exact__1_2 = Mutable[Boolean](false)
      val v_rounding__1_2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000100000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_FPDecodeRounding52__2 = Mutable[BV](v_st.mkBits(BigInt(4), BigInt(0)))
        v_FPDecodeRounding52__2.v = v_st.f_ZeroExtend(BigInt(2), BigInt(4), v_st.bvextract(v_enc,BigInt(15),BigInt(2)), BigInt(4))
        v_rounding__1_2_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_FPDecodeRounding52__2.v)
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000111000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000100000000000000000", 2)))) then {
          v_rounding__1_2_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_st.mkBits(4, BigInt("0100", 2)))
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000111000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000110000000000000000", 2)))) then {
            val v_FPDecodeRounding56__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
            v_FPDecodeRounding56__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
            v_rounding__1_2_copyprop.v = v_FPDecodeRounding56__3_copyprop.v
            v_exact__1_2.v = true
          } else {
            val v_FPDecodeRounding60__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
            v_FPDecodeRounding60__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
            v_rounding__1_2_copyprop.v = v_FPDecodeRounding60__3_copyprop.v
          }
        }
      }
      val v_Exp68__2 : RTSym = v_st.f_decl_bv("Exp68__2", BigInt(16)) 
      v_st.f_gen_store (v_Exp68__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_2_copyprop.v), v_st.f_gen_bool_lit(v_exact__1_2.v)))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_st.f_gen_load(v_Exp68__2), v_st.f_gen_int_lit(BigInt(128))))
    }
  }
}
