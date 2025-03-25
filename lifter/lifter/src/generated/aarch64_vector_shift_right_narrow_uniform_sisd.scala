/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_shift_right_narrow_uniform_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000001100000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_Exp9__2 : RTSym = v_st.f_decl_bv("Exp9__2", BigInt(128)) 
      v_st.f_gen_store (v_Exp9__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
      val v_If10__1 = Mutable[BV](v_st.mkBits(BigInt(32), BigInt(0)))
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))) then {
        val v_If12__2 = Mutable[BV](v_st.mkBits(BigInt(32), BigInt(0)))
        v_If12__2.v = v_st.f_ZeroExtend(BigInt(16), BigInt(32), v_st.f_lsl_bits(BigInt(16), BigInt(16), v_st.mkBits(16, BigInt("0000000000000001", 2)), v_st.f_sub_bits(BigInt(16), v_st.f_sub_bits(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2)), v_st.f_ZeroExtend(BigInt(7), BigInt(16), v_st.f_append_bits(BigInt(4), BigInt(3), v_st.bvextract(v_enc,BigInt(19),BigInt(4)), v_st.bvextract(v_enc,BigInt(16),BigInt(3))), BigInt(16))), v_st.mkBits(16, BigInt("0000000000000001", 2)))), BigInt(32))
        v_If10__1.v = v_If12__2.v
      } else {
        v_If10__1.v = v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))
      }
      val v_If15__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        v_If15__2_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp9__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))
      } else {
        v_If15__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp9__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))
      }
      val v_If19__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      v_If19__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(32), BigInt(143), v_st.f_gen_asr_bits(BigInt(32), BigInt(16), v_st.f_gen_add_bits(BigInt(32), v_If15__2_copyprop.v, v_st.f_gen_bit_lit(BigInt(32), v_If10__1.v)), v_st.f_gen_bit_lit(BigInt(16), v_st.f_sub_bits(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2)), v_st.f_ZeroExtend(BigInt(7), BigInt(16), v_st.f_append_bits(BigInt(4), BigInt(3), v_st.bvextract(v_enc,BigInt(19),BigInt(4)), v_st.bvextract(v_enc,BigInt(16),BigInt(3))), BigInt(16))))), v_st.f_gen_int_lit(BigInt(143)))
      val v_SatQ20__2 : RTSym = v_st.f_decl_bv("SatQ20__2", BigInt(8)) 
      val v_SatQ21__2 : RTSym = v_st.f_decl_bool("SatQ21__2") 
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_UnsignedSatQ22__3 : RTSym = v_st.f_decl_bv("UnsignedSatQ22__3", BigInt(8)) 
        val v_UnsignedSatQ23__3 : RTSym = v_st.f_decl_bool("UnsignedSatQ23__3") 
        val v_temp0 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(143), v_st.f_gen_bit_lit(BigInt(143), v_st.mkBits(143, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111", 2))), v_If19__2_copyprop.v)) 
        v_st.f_switch_context (v_st.f_true_branch(v_temp0))
        v_st.f_gen_store (v_UnsignedSatQ22__3,v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("11111111", 2))))
        v_st.f_gen_store (v_UnsignedSatQ23__3,v_st.f_gen_bool_lit(true))
        v_st.f_switch_context (v_st.f_false_branch(v_temp0))
        val v_temp1 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(143), v_If19__2_copyprop.v, v_st.f_gen_bit_lit(BigInt(143), v_st.mkBits(143, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 2))))) 
        v_st.f_switch_context (v_st.f_true_branch(v_temp1))
        v_st.f_gen_store (v_UnsignedSatQ22__3,v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00000000", 2))))
        v_st.f_gen_store (v_UnsignedSatQ23__3,v_st.f_gen_bool_lit(true))
        v_st.f_switch_context (v_st.f_false_branch(v_temp1))
        v_st.f_gen_store (v_UnsignedSatQ22__3,v_st.f_gen_slice(v_If19__2_copyprop.v, BigInt(0), BigInt(8)))
        v_st.f_gen_store (v_UnsignedSatQ23__3,v_st.f_gen_bool_lit(false))
        v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
        v_st.f_gen_store (v_SatQ20__2,v_st.f_gen_load(v_UnsignedSatQ22__3))
        v_st.f_gen_store (v_SatQ21__2,v_st.f_gen_load(v_UnsignedSatQ23__3))
      } else {
        val v_SignedSatQ28__3 : RTSym = v_st.f_decl_bv("SignedSatQ28__3", BigInt(8)) 
        val v_SignedSatQ29__3 : RTSym = v_st.f_decl_bool("SignedSatQ29__3") 
        val v_temp2 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(143), v_st.f_gen_bit_lit(BigInt(143), v_st.mkBits(143, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111", 2))), v_If19__2_copyprop.v)) 
        v_st.f_switch_context (v_st.f_true_branch(v_temp2))
        v_st.f_gen_store (v_SignedSatQ28__3,v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("01111111", 2))))
        v_st.f_gen_store (v_SignedSatQ29__3,v_st.f_gen_bool_lit(true))
        v_st.f_switch_context (v_st.f_false_branch(v_temp2))
        val v_temp3 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(143), v_If19__2_copyprop.v, v_st.f_gen_bit_lit(BigInt(143), v_st.mkBits(143, BigInt("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000", 2))))) 
        v_st.f_switch_context (v_st.f_true_branch(v_temp3))
        v_st.f_gen_store (v_SignedSatQ28__3,v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("10000000", 2))))
        v_st.f_gen_store (v_SignedSatQ29__3,v_st.f_gen_bool_lit(true))
        v_st.f_switch_context (v_st.f_false_branch(v_temp3))
        v_st.f_gen_store (v_SignedSatQ28__3,v_st.f_gen_slice(v_If19__2_copyprop.v, BigInt(0), BigInt(8)))
        v_st.f_gen_store (v_SignedSatQ29__3,v_st.f_gen_bool_lit(false))
        v_st.f_switch_context (v_st.f_merge_branch(v_temp2))
        v_st.f_gen_store (v_SatQ20__2,v_st.f_gen_load(v_SignedSatQ28__3))
        v_st.f_gen_store (v_SatQ21__2,v_st.f_gen_load(v_SignedSatQ29__3))
      }
      val v_temp4 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SatQ21__2)) 
      v_st.f_switch_context (v_st.f_true_branch(v_temp4))
      v_st.f_gen_store (v_st.v_FPSR.v,v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27)))))
      v_st.f_switch_context (v_st.f_merge_branch(v_temp4))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(8), BigInt(128), v_st.f_gen_load(v_SatQ20__2), v_st.f_gen_int_lit(BigInt(128))))
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000001000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_Exp53__2 : RTSym = v_st.f_decl_bv("Exp53__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp53__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_If54__1 = Mutable[BV](v_st.mkBits(BigInt(64), BigInt(0)))
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))) then {
          val v_If56__2 = Mutable[BV](v_st.mkBits(BigInt(64), BigInt(0)))
          v_If56__2.v = v_st.f_ZeroExtend(BigInt(32), BigInt(64), v_st.f_lsl_bits(BigInt(32), BigInt(16), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)), v_st.f_sub_bits(BigInt(16), v_st.f_sub_bits(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2)), v_st.f_ZeroExtend(BigInt(7), BigInt(16), v_st.f_append_bits(BigInt(4), BigInt(3), v_st.bvextract(v_enc,BigInt(19),BigInt(4)), v_st.bvextract(v_enc,BigInt(16),BigInt(3))), BigInt(16))), v_st.mkBits(16, BigInt("0000000000000001", 2)))), BigInt(64))
          v_If54__1.v = v_If56__2.v
        } else {
          v_If54__1.v = v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))
        }
        val v_If59__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If59__2_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp53__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))
        } else {
          v_If59__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp53__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))
        }
        val v_If63__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        v_If63__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(64), BigInt(159), v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_If59__2_copyprop.v, v_st.f_gen_bit_lit(BigInt(64), v_If54__1.v)), v_st.f_gen_bit_lit(BigInt(16), v_st.f_sub_bits(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2)), v_st.f_ZeroExtend(BigInt(7), BigInt(16), v_st.f_append_bits(BigInt(4), BigInt(3), v_st.bvextract(v_enc,BigInt(19),BigInt(4)), v_st.bvextract(v_enc,BigInt(16),BigInt(3))), BigInt(16))))), v_st.f_gen_int_lit(BigInt(159)))
        val v_SatQ64__2 : RTSym = v_st.f_decl_bv("SatQ64__2", BigInt(16)) 
        val v_SatQ65__2 : RTSym = v_st.f_decl_bool("SatQ65__2") 
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_UnsignedSatQ66__3 : RTSym = v_st.f_decl_bv("UnsignedSatQ66__3", BigInt(16)) 
          val v_UnsignedSatQ67__3 : RTSym = v_st.f_decl_bool("UnsignedSatQ67__3") 
          val v_temp5 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(159), v_st.f_gen_bit_lit(BigInt(159), v_st.mkBits(159, BigInt("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111", 2))), v_If63__2_copyprop.v)) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp5))
          v_st.f_gen_store (v_UnsignedSatQ66__3,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("1111111111111111", 2))))
          v_st.f_gen_store (v_UnsignedSatQ67__3,v_st.f_gen_bool_lit(true))
          v_st.f_switch_context (v_st.f_false_branch(v_temp5))
          val v_temp6 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(159), v_If63__2_copyprop.v, v_st.f_gen_bit_lit(BigInt(159), v_st.mkBits(159, BigInt("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 2))))) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp6))
          v_st.f_gen_store (v_UnsignedSatQ66__3,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2))))
          v_st.f_gen_store (v_UnsignedSatQ67__3,v_st.f_gen_bool_lit(true))
          v_st.f_switch_context (v_st.f_false_branch(v_temp6))
          v_st.f_gen_store (v_UnsignedSatQ66__3,v_st.f_gen_slice(v_If63__2_copyprop.v, BigInt(0), BigInt(16)))
          v_st.f_gen_store (v_UnsignedSatQ67__3,v_st.f_gen_bool_lit(false))
          v_st.f_switch_context (v_st.f_merge_branch(v_temp5))
          v_st.f_gen_store (v_SatQ64__2,v_st.f_gen_load(v_UnsignedSatQ66__3))
          v_st.f_gen_store (v_SatQ65__2,v_st.f_gen_load(v_UnsignedSatQ67__3))
        } else {
          val v_SignedSatQ72__3 : RTSym = v_st.f_decl_bv("SignedSatQ72__3", BigInt(16)) 
          val v_SignedSatQ73__3 : RTSym = v_st.f_decl_bool("SignedSatQ73__3") 
          val v_temp7 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(159), v_st.f_gen_bit_lit(BigInt(159), v_st.mkBits(159, BigInt("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111111111111", 2))), v_If63__2_copyprop.v)) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp7))
          v_st.f_gen_store (v_SignedSatQ72__3,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0111111111111111", 2))))
          v_st.f_gen_store (v_SignedSatQ73__3,v_st.f_gen_bool_lit(true))
          v_st.f_switch_context (v_st.f_false_branch(v_temp7))
          val v_temp8 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(159), v_If63__2_copyprop.v, v_st.f_gen_bit_lit(BigInt(159), v_st.mkBits(159, BigInt("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000", 2))))) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp8))
          v_st.f_gen_store (v_SignedSatQ72__3,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("1000000000000000", 2))))
          v_st.f_gen_store (v_SignedSatQ73__3,v_st.f_gen_bool_lit(true))
          v_st.f_switch_context (v_st.f_false_branch(v_temp8))
          v_st.f_gen_store (v_SignedSatQ72__3,v_st.f_gen_slice(v_If63__2_copyprop.v, BigInt(0), BigInt(16)))
          v_st.f_gen_store (v_SignedSatQ73__3,v_st.f_gen_bool_lit(false))
          v_st.f_switch_context (v_st.f_merge_branch(v_temp7))
          v_st.f_gen_store (v_SatQ64__2,v_st.f_gen_load(v_SignedSatQ72__3))
          v_st.f_gen_store (v_SatQ65__2,v_st.f_gen_load(v_SignedSatQ73__3))
        }
        val v_temp9 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SatQ65__2)) 
        v_st.f_switch_context (v_st.f_true_branch(v_temp9))
        v_st.f_gen_store (v_st.v_FPSR.v,v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27)))))
        v_st.f_switch_context (v_st.f_merge_branch(v_temp9))
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_st.f_gen_load(v_SatQ64__2), v_st.f_gen_int_lit(BigInt(128))))
      } else {
        val v_Exp97__2 : RTSym = v_st.f_decl_bv("Exp97__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp97__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        val v_If98__1 = Mutable[BV](v_st.mkBits(BigInt(128), BigInt(0)))
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))) then {
          val v_If100__2 = Mutable[BV](v_st.mkBits(BigInt(128), BigInt(0)))
          v_If100__2.v = v_st.f_ZeroExtend(BigInt(64), BigInt(128), v_st.f_lsl_bits(BigInt(64), BigInt(16), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000001", 2)), v_st.f_sub_bits(BigInt(16), v_st.f_sub_bits(BigInt(16), v_st.mkBits(16, BigInt("0000000001000000", 2)), v_st.f_ZeroExtend(BigInt(7), BigInt(16), v_st.f_append_bits(BigInt(4), BigInt(3), v_st.bvextract(v_enc,BigInt(19),BigInt(4)), v_st.bvextract(v_enc,BigInt(16),BigInt(3))), BigInt(16))), v_st.mkBits(16, BigInt("0000000000000001", 2)))), BigInt(128))
          v_If98__1.v = v_If100__2.v
        } else {
          v_If98__1.v = v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 2))
        }
        val v_If103__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If103__2_copyprop.v = v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_slice(v_st.f_gen_load(v_Exp97__2), BigInt(0), BigInt(64)), v_st.f_gen_int_lit(BigInt(128)))
        } else {
          v_If103__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_slice(v_st.f_gen_load(v_Exp97__2), BigInt(0), BigInt(64)), v_st.f_gen_int_lit(BigInt(128)))
        }
        val v_If107__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        v_If107__2_copyprop.v = v_st.f_gen_SignExtend(BigInt(128), BigInt(191), v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_If103__2_copyprop.v, v_st.f_gen_bit_lit(BigInt(128), v_If98__1.v)), v_st.f_gen_bit_lit(BigInt(16), v_st.f_sub_bits(BigInt(16), v_st.mkBits(16, BigInt("0000000001000000", 2)), v_st.f_ZeroExtend(BigInt(7), BigInt(16), v_st.f_append_bits(BigInt(4), BigInt(3), v_st.bvextract(v_enc,BigInt(19),BigInt(4)), v_st.bvextract(v_enc,BigInt(16),BigInt(3))), BigInt(16))))), v_st.f_gen_int_lit(BigInt(191)))
        val v_SatQ108__2 : RTSym = v_st.f_decl_bv("SatQ108__2", BigInt(32)) 
        val v_SatQ109__2 : RTSym = v_st.f_decl_bool("SatQ109__2") 
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_UnsignedSatQ110__3 : RTSym = v_st.f_decl_bv("UnsignedSatQ110__3", BigInt(32)) 
          val v_UnsignedSatQ111__3 : RTSym = v_st.f_decl_bool("UnsignedSatQ111__3") 
          val v_temp10 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(191), v_st.f_gen_bit_lit(BigInt(191), v_st.mkBits(191, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111111111111111111111111", 2))), v_If107__2_copyprop.v)) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp10))
          v_st.f_gen_store (v_UnsignedSatQ110__3,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("11111111111111111111111111111111", 2))))
          v_st.f_gen_store (v_UnsignedSatQ111__3,v_st.f_gen_bool_lit(true))
          v_st.f_switch_context (v_st.f_false_branch(v_temp10))
          val v_temp11 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(191), v_If107__2_copyprop.v, v_st.f_gen_bit_lit(BigInt(191), v_st.mkBits(191, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 2))))) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp11))
          v_st.f_gen_store (v_UnsignedSatQ110__3,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
          v_st.f_gen_store (v_UnsignedSatQ111__3,v_st.f_gen_bool_lit(true))
          v_st.f_switch_context (v_st.f_false_branch(v_temp11))
          v_st.f_gen_store (v_UnsignedSatQ110__3,v_st.f_gen_slice(v_If107__2_copyprop.v, BigInt(0), BigInt(32)))
          v_st.f_gen_store (v_UnsignedSatQ111__3,v_st.f_gen_bool_lit(false))
          v_st.f_switch_context (v_st.f_merge_branch(v_temp10))
          v_st.f_gen_store (v_SatQ108__2,v_st.f_gen_load(v_UnsignedSatQ110__3))
          v_st.f_gen_store (v_SatQ109__2,v_st.f_gen_load(v_UnsignedSatQ111__3))
        } else {
          val v_SignedSatQ116__3 : RTSym = v_st.f_decl_bv("SignedSatQ116__3", BigInt(32)) 
          val v_SignedSatQ117__3 : RTSym = v_st.f_decl_bool("SignedSatQ117__3") 
          val v_temp12 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(191), v_st.f_gen_bit_lit(BigInt(191), v_st.mkBits(191, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111111111111111111", 2))), v_If107__2_copyprop.v)) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp12))
          v_st.f_gen_store (v_SignedSatQ116__3,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("01111111111111111111111111111111", 2))))
          v_st.f_gen_store (v_SignedSatQ117__3,v_st.f_gen_bool_lit(true))
          v_st.f_switch_context (v_st.f_false_branch(v_temp12))
          val v_temp13 : RTLabel = v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(191), v_If107__2_copyprop.v, v_st.f_gen_bit_lit(BigInt(191), v_st.mkBits(191, BigInt("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000", 2))))) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp13))
          v_st.f_gen_store (v_SignedSatQ116__3,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))))
          v_st.f_gen_store (v_SignedSatQ117__3,v_st.f_gen_bool_lit(true))
          v_st.f_switch_context (v_st.f_false_branch(v_temp13))
          v_st.f_gen_store (v_SignedSatQ116__3,v_st.f_gen_slice(v_If107__2_copyprop.v, BigInt(0), BigInt(32)))
          v_st.f_gen_store (v_SignedSatQ117__3,v_st.f_gen_bool_lit(false))
          v_st.f_switch_context (v_st.f_merge_branch(v_temp12))
          v_st.f_gen_store (v_SatQ108__2,v_st.f_gen_load(v_SignedSatQ116__3))
          v_st.f_gen_store (v_SatQ109__2,v_st.f_gen_load(v_SignedSatQ117__3))
        }
        val v_temp14 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SatQ109__2)) 
        v_st.f_switch_context (v_st.f_true_branch(v_temp14))
        v_st.f_gen_store (v_st.v_FPSR.v,v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27)))))
        v_st.f_switch_context (v_st.f_merge_branch(v_temp14))
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_SatQ108__2), v_st.f_gen_int_lit(BigInt(128))))
      }
    }
  }
}
