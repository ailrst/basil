/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_float_arithmetic_round_frint_32_64[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_If6__1 = Mutable[BV](v_st.mkBits(BigInt(8), BigInt(0)))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000010000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_If6__1.v = v_st.mkBits(8, BigInt("00100000", 2))
    } else {
      v_If6__1.v = v_st.mkBits(8, BigInt("01000000", 2))
    }
    val v_If7__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_If7__1_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_st.mkBits(4, BigInt("0011", 2)))
    } else {
      val v_FPDecodeRounding10__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      v_FPDecodeRounding10__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
      v_If7__1_copyprop.v = v_FPDecodeRounding10__3_copyprop.v
    }
    val v_Exp16__2 : RTSym = v_st.f_decl_bv("Exp16__2", BigInt(32)) 
    v_st.f_gen_store (v_Exp16__2,v_st.f_gen_FPRoundIntN(BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_If7__1_copyprop.v), v_st.f_gen_int_lit(v_st.f_cvt_bits_uint(BigInt(8), v_If6__1.v))))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_Exp16__2), v_st.f_gen_int_lit(BigInt(128))))
  } else {
    val v_If23__1 = Mutable[BV](v_st.mkBits(BigInt(8), BigInt(0)))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000010000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_If23__1.v = v_st.mkBits(8, BigInt("00100000", 2))
    } else {
      v_If23__1.v = v_st.mkBits(8, BigInt("01000000", 2))
    }
    val v_If24__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_If24__1_copyprop.v = v_st.f_gen_bit_lit(BigInt(4), v_st.mkBits(4, BigInt("0011", 2)))
    } else {
      val v_FPDecodeRounding27__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      v_FPDecodeRounding27__3_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
      v_If24__1_copyprop.v = v_FPDecodeRounding27__3_copyprop.v
    }
    val v_Exp33__2 : RTSym = v_st.f_decl_bv("Exp33__2", BigInt(64)) 
    v_st.f_gen_store (v_Exp33__2,v_st.f_gen_FPRoundIntN(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_If24__1_copyprop.v), v_st.f_gen_int_lit(v_st.f_cvt_bits_uint(BigInt(8), v_If23__1.v))))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_Exp33__2), v_st.f_gen_int_lit(BigInt(128))))
  }
}
