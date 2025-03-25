/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_float_convert_fp[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000011000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2)))) then {
      val v_Exp22__2 : RTSym = v_st.f_decl_bv("Exp22__2", BigInt(128)) 
      v_st.f_gen_store (v_Exp22__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
      val v_FPDecodeRounding26__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      v_FPDecodeRounding26__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
      val v_Exp28__3 : RTSym = v_st.f_decl_bv("Exp28__3", BigInt(64)) 
      v_st.f_gen_store (v_Exp28__3,v_st.f_gen_FPConvert(BigInt(64), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp22__2), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding26__4_copyprop.v)))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_Exp28__3), v_st.f_gen_int_lit(BigInt(128))))
    } else {
      val v_Exp38__2 : RTSym = v_st.f_decl_bv("Exp38__2", BigInt(128)) 
      v_st.f_gen_store (v_Exp38__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
      val v_FPDecodeRounding42__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      v_FPDecodeRounding42__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
      val v_Exp44__3 : RTSym = v_st.f_decl_bv("Exp44__3", BigInt(16)) 
      v_st.f_gen_store (v_Exp44__3,v_st.f_gen_FPConvert(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp38__2), BigInt(0), BigInt(32)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding42__4_copyprop.v)))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_st.f_gen_load(v_Exp44__3), v_st.f_gen_int_lit(BigInt(128))))
    }
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000011000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_Exp54__2 : RTSym = v_st.f_decl_bv("Exp54__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp54__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_FPDecodeRounding58__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        v_FPDecodeRounding58__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
        val v_Exp60__3 : RTSym = v_st.f_decl_bv("Exp60__3", BigInt(32)) 
        v_st.f_gen_store (v_Exp60__3,v_st.f_gen_FPConvert(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp54__2), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding58__4_copyprop.v)))
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_Exp60__3), v_st.f_gen_int_lit(BigInt(128))))
      } else {
        val v_Exp85__2 : RTSym = v_st.f_decl_bv("Exp85__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp85__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_FPDecodeRounding89__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        v_FPDecodeRounding89__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
        val v_Exp91__3 : RTSym = v_st.f_decl_bv("Exp91__3", BigInt(16)) 
        v_st.f_gen_store (v_Exp91__3,v_st.f_gen_FPConvert(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp85__2), BigInt(0), BigInt(64)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding89__4_copyprop.v)))
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_st.f_gen_load(v_Exp91__3), v_st.f_gen_int_lit(BigInt(128))))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000011000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_Exp102__2 : RTSym = v_st.f_decl_bv("Exp102__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp102__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_FPDecodeRounding106__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        v_FPDecodeRounding106__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
        val v_Exp108__3 : RTSym = v_st.f_decl_bv("Exp108__3", BigInt(32)) 
        v_st.f_gen_store (v_Exp108__3,v_st.f_gen_FPConvert(BigInt(32), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp102__2), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding106__4_copyprop.v)))
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_Exp108__3), v_st.f_gen_int_lit(BigInt(128))))
      } else {
        val v_Exp117__2 : RTSym = v_st.f_decl_bv("Exp117__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp117__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_FPDecodeRounding121__4_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        v_FPDecodeRounding121__4_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(2), BigInt(4), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPCR.v), BigInt(22), BigInt(2)), v_st.f_gen_int_lit(BigInt(4)))
        val v_Exp123__3 : RTSym = v_st.f_decl_bv("Exp123__3", BigInt(64)) 
        v_st.f_gen_store (v_Exp123__3,v_st.f_gen_FPConvert(BigInt(64), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Exp117__2), BigInt(0), BigInt(16)), v_st.f_gen_load(v_st.v_FPCR.v), v_st.f_gen_cvt_bits_uint(BigInt(4), v_FPDecodeRounding121__4_copyprop.v)))
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_Exp123__3), v_st.f_gen_int_lit(BigInt(128))))
      }
    }
  }
}
