/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_shift_right_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    val v_Exp7__2 : RTSym = v_st.f_decl_bv("Exp7__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp7__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    val v_If8__1 = Mutable[BV](v_st.mkBits(BigInt(256), BigInt(0)))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000010000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000010000000000000", 2)))) then {
      val v_If10__2 = Mutable[BV](v_st.mkBits(BigInt(256), BigInt(0)))
      v_If10__2.v = v_st.f_ZeroExtend(BigInt(128), BigInt(256), v_st.f_lsl_bits(BigInt(128), BigInt(16), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001", 2)), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_sub_bits(BigInt(8), v_st.f_sub_bits(BigInt(8), v_st.mkBits(8, BigInt("10000000", 2)), v_st.f_ZeroExtend(BigInt(7), BigInt(8), v_st.f_append_bits(BigInt(4), BigInt(3), v_st.bvextract(v_enc,BigInt(19),BigInt(4)), v_st.bvextract(v_enc,BigInt(16),BigInt(3))), BigInt(8))), v_st.mkBits(8, BigInt("00000001", 2))), BigInt(16))), BigInt(256))
      v_If8__1.v = v_If10__2.v
    } else {
      v_If8__1.v = v_st.mkBits(256, BigInt("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 2))
    }
    val v_If11__1 : RTSym = v_st.f_decl_bv("If11__1", BigInt(64)) 
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))) then {
      v_st.f_gen_store (v_If11__1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64)))
    } else {
      v_st.f_gen_store (v_If11__1,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    }
    val v_If18__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
      v_If18__2_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(0), BigInt(64)), v_st.f_gen_int_lit(BigInt(128)))
    } else {
      v_If18__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_slice(v_st.f_gen_load(v_Exp7__2), BigInt(0), BigInt(64)), v_st.f_gen_int_lit(BigInt(128)))
    }
    val v_If22__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_If22__2_copyprop.v = v_st.f_gen_asr_bits(BigInt(256), BigInt(16), v_st.f_gen_add_bits(BigInt(256), v_st.f_gen_SignExtend(BigInt(128), BigInt(256), v_If18__2_copyprop.v, v_st.f_gen_int_lit(BigInt(256))), v_st.f_gen_bit_lit(BigInt(256), v_If8__1.v)), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_sub_bits(BigInt(8), v_st.mkBits(8, BigInt("10000000", 2)), v_st.f_ZeroExtend(BigInt(7), BigInt(8), v_st.f_append_bits(BigInt(4), BigInt(3), v_st.bvextract(v_enc,BigInt(19),BigInt(4)), v_st.bvextract(v_enc,BigInt(16),BigInt(3))), BigInt(8))), BigInt(16))))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_load(v_If11__1), v_st.f_gen_slice(v_If22__2_copyprop.v, BigInt(0), BigInt(64))), v_st.f_gen_int_lit(BigInt(128))))
  }
}
