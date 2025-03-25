/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_fp16_round[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
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
    val v_Exp22__2 : RTSym = v_st.f_decl_bv("Exp22__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp22__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
    val v_Exp25__2 : RTSym = v_st.f_decl_bv("Exp25__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp25__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(16), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
    val v_Exp28__2 : RTSym = v_st.f_decl_bv("Exp28__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp28__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
    val v_Exp31__2 : RTSym = v_st.f_decl_bv("Exp31__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp31__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
    val v_Exp34__2 : RTSym = v_st.f_decl_bv("Exp34__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp34__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
    val v_Exp37__2 : RTSym = v_st.f_decl_bv("Exp37__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp37__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(80), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
    val v_Exp40__2 : RTSym = v_st.f_decl_bv("Exp40__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp40__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
    val v_Exp43__2 : RTSym = v_st.f_decl_bv("Exp43__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp43__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(112), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1.v)))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(16), BigInt(112), v_st.f_gen_load(v_Exp43__2), v_st.f_gen_append_bits(BigInt(16), BigInt(96), v_st.f_gen_load(v_Exp40__2), v_st.f_gen_append_bits(BigInt(16), BigInt(80), v_st.f_gen_load(v_Exp37__2), v_st.f_gen_append_bits(BigInt(16), BigInt(64), v_st.f_gen_load(v_Exp34__2), v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_st.f_gen_load(v_Exp31__2), v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_st.f_gen_load(v_Exp28__2), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_load(v_Exp25__2), v_st.f_gen_load(v_Exp22__2)))))))))
  } else {
    val v_exact__1_1 = Mutable[Boolean](false)
    val v_rounding__1_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_FPDecodeRounding50__2 = Mutable[BV](v_st.mkBits(BigInt(4), BigInt(0)))
      v_FPDecodeRounding50__2.v = v_st.f_ZeroExtend(BigInt(2), BigInt(4), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(12),BigInt(1)), v_st.bvextract(v_enc,BigInt(23),BigInt(1))), BigInt(4))
      v_rounding__1_1_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_FPDecodeRounding50__2.v)
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000100000000001000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        v_rounding__1_1_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_st.mkBits(4, BigInt("0100", 2)))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000100000000001000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000001000000000000", 2)))) then {
          val v_FPDecodeRounding54__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
          v_FPDecodeRounding54__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
          v_rounding__1_1_copyprop.v = v_FPDecodeRounding54__3_copyprop.v
          v_exact__1_1.v = true
        } else {
          val v_FPDecodeRounding58__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
          v_FPDecodeRounding58__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
          v_rounding__1_1_copyprop.v = v_FPDecodeRounding58__3_copyprop.v
        }
      }
    }
    val v_Exp68__2 : RTSym = v_st.f_decl_bv("Exp68__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp68__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1_1.v)))
    val v_Exp71__2 : RTSym = v_st.f_decl_bv("Exp71__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp71__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(16), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1_1.v)))
    val v_Exp74__2 : RTSym = v_st.f_decl_bv("Exp74__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp74__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1_1.v)))
    val v_Exp77__2 : RTSym = v_st.f_decl_bv("Exp77__2", BigInt(16)) 
    v_st.f_gen_store (v_Exp77__2,v_st.f_gen_FPRoundInt(BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_rounding__1_1_copyprop.v), v_st.f_gen_bool_lit(v_exact__1_1.v)))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_st.f_gen_load(v_Exp77__2), v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_st.f_gen_load(v_Exp74__2), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_load(v_Exp71__2), v_st.f_gen_load(v_Exp68__2)))), v_st.f_gen_int_lit(BigInt(128))))
  }
}
