/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_float_compare_uncond[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_Exp6__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_Exp6__2_copyprop.v = v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
    val v_If7__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000001000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000001000", 2)))) then {
      v_If7__1_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
    } else {
      v_If7__1_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
    }
    val v_Exp15__2 : RTSym = v_st.f_decl_bv("Exp15__2", BigInt(4)) 
    v_st.f_gen_store (v_Exp15__2,v_st.f_gen_FPCompare(BigInt(32), v_st.f_gen_slice(v_Exp6__2_copyprop.v, BigInt(0), BigInt(32)), v_If7__1_copyprop.v, v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(4),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v)))
    v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp15__2), BigInt(0), BigInt(1)))
    v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp15__2), BigInt(1), BigInt(1)))
    v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp15__2), BigInt(2), BigInt(1)))
    v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp15__2), BigInt(3), BigInt(1)))
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
      val v_Exp19__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      v_Exp19__2_copyprop.v = v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
      val v_If20__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000001000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000001000", 2)))) then {
        v_If20__1_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
      } else {
        v_If20__1_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64))
      }
      val v_Exp28__2 : RTSym = v_st.f_decl_bv("Exp28__2", BigInt(4)) 
      v_st.f_gen_store (v_Exp28__2,v_st.f_gen_FPCompare(BigInt(64), v_st.f_gen_slice(v_Exp19__2_copyprop.v, BigInt(0), BigInt(64)), v_If20__1_copyprop.v, v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(4),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp28__2), BigInt(0), BigInt(1)))
      v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp28__2), BigInt(1), BigInt(1)))
      v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp28__2), BigInt(2), BigInt(1)))
      v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp28__2), BigInt(3), BigInt(1)))
    } else {
      val v_Exp34__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      v_Exp34__2_copyprop.v = v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
      val v_If35__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000001000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000001000", 2)))) then {
        v_If35__1_copyprop.v = v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2)))
      } else {
        v_If35__1_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16))
      }
      val v_Exp43__2 : RTSym = v_st.f_decl_bv("Exp43__2", BigInt(4)) 
      v_st.f_gen_store (v_Exp43__2,v_st.f_gen_FPCompare(BigInt(16), v_st.f_gen_slice(v_Exp34__2_copyprop.v, BigInt(0), BigInt(16)), v_If35__1_copyprop.v, v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(4),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp43__2), BigInt(0), BigInt(1)))
      v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp43__2), BigInt(1), BigInt(1)))
      v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp43__2), BigInt(2), BigInt(1)))
      v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp43__2), BigInt(3), BigInt(1)))
    }
  }
}
