/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_float_compare_cond[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_Exp6__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_Exp6__2_copyprop.v = v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
    val v_Exp9__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_Exp9__2_copyprop.v = v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5))))
    val v_ConditionHolds10__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    val v_result__2 : RTSym = v_st.f_decl_bool("result__2") 
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_st.f_gen_store (v_result__2,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))))
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000010000000000000", 2)))) then {
        v_st.f_gen_store (v_result__2,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000100000000000000", 2)))) then {
          v_st.f_gen_store (v_result__2,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))))
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000110000000000000", 2)))) then {
            v_st.f_gen_store (v_result__2,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_V.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))))
          } else {
            if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2)))) then {
              v_st.f_gen_store (v_result__2,v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))))))
            } else {
              if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001010000000000000", 2)))) then {
                v_st.f_gen_store (v_result__2,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v)))
              } else {
                if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001100000000000000", 2)))) then {
                  v_st.f_gen_store (v_result__2,v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v)), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))))))
                } else {
                  v_st.f_gen_store (v_result__2,v_st.f_gen_bool_lit(true))
                }
              }
            }
          }
        }
      }
    }
    if (((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000101000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))))) then {
      v_ConditionHolds10__2_copyprop.v = v_st.f_gen_not_bool(v_st.f_gen_load(v_result__2))
    } else {
      v_ConditionHolds10__2_copyprop.v = v_st.f_gen_load(v_result__2)
    }
    val v_temp0 : RTLabel = v_st.f_gen_branch(v_ConditionHolds10__2_copyprop.v) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp0))
    val v_Exp29__2 : RTSym = v_st.f_decl_bv("Exp29__2", BigInt(4)) 
    v_st.f_gen_store (v_Exp29__2,v_st.f_gen_FPCompare(BigInt(32), v_st.f_gen_slice(v_Exp6__2_copyprop.v, BigInt(0), BigInt(32)), v_st.f_gen_slice(v_Exp9__2_copyprop.v, BigInt(0), BigInt(32)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(4),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v)))
    v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp29__2), BigInt(0), BigInt(1)))
    v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp29__2), BigInt(1), BigInt(1)))
    v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp29__2), BigInt(2), BigInt(1)))
    v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp29__2), BigInt(3), BigInt(1)))
    v_st.f_switch_context (v_st.f_false_branch(v_temp0))
    v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(0),BigInt(1))))
    v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(1),BigInt(1))))
    v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(2),BigInt(1))))
    v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(3),BigInt(1))))
    v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
      val v_Exp33__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      v_Exp33__2_copyprop.v = v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
      val v_Exp36__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      v_Exp36__2_copyprop.v = v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5))))
      val v_ConditionHolds37__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      val v_result__2_1 : RTSym = v_st.f_decl_bool("result__2_1") 
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_st.f_gen_store (v_result__2_1,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000010000000000000", 2)))) then {
          v_st.f_gen_store (v_result__2_1,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))))
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000100000000000000", 2)))) then {
            v_st.f_gen_store (v_result__2_1,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))))
          } else {
            if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000110000000000000", 2)))) then {
              v_st.f_gen_store (v_result__2_1,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_V.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))))
            } else {
              if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2)))) then {
                v_st.f_gen_store (v_result__2_1,v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))))))
              } else {
                if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001010000000000000", 2)))) then {
                  v_st.f_gen_store (v_result__2_1,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v)))
                } else {
                  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001100000000000000", 2)))) then {
                    v_st.f_gen_store (v_result__2_1,v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v)), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))))))
                  } else {
                    v_st.f_gen_store (v_result__2_1,v_st.f_gen_bool_lit(true))
                  }
                }
              }
            }
          }
        }
      }
      if (((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000101000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))))) then {
        v_ConditionHolds37__2_copyprop.v = v_st.f_gen_not_bool(v_st.f_gen_load(v_result__2_1))
      } else {
        v_ConditionHolds37__2_copyprop.v = v_st.f_gen_load(v_result__2_1)
      }
      val v_temp1 : RTLabel = v_st.f_gen_branch(v_ConditionHolds37__2_copyprop.v) 
      v_st.f_switch_context (v_st.f_true_branch(v_temp1))
      val v_Exp56__2 : RTSym = v_st.f_decl_bv("Exp56__2", BigInt(4)) 
      v_st.f_gen_store (v_Exp56__2,v_st.f_gen_FPCompare(BigInt(64), v_st.f_gen_slice(v_Exp33__2_copyprop.v, BigInt(0), BigInt(64)), v_st.f_gen_slice(v_Exp36__2_copyprop.v, BigInt(0), BigInt(64)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(4),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp56__2), BigInt(0), BigInt(1)))
      v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp56__2), BigInt(1), BigInt(1)))
      v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp56__2), BigInt(2), BigInt(1)))
      v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp56__2), BigInt(3), BigInt(1)))
      v_st.f_switch_context (v_st.f_false_branch(v_temp1))
      v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(0),BigInt(1))))
      v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(1),BigInt(1))))
      v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(2),BigInt(1))))
      v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(3),BigInt(1))))
      v_st.f_switch_context (v_st.f_merge_branch(v_temp1))
    } else {
      val v_Exp62__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      v_Exp62__2_copyprop.v = v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
      val v_Exp65__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      v_Exp65__2_copyprop.v = v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5))))
      val v_ConditionHolds66__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      val v_result__2_2 : RTSym = v_st.f_decl_bool("result__2_2") 
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_st.f_gen_store (v_result__2_2,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000010000000000000", 2)))) then {
          v_st.f_gen_store (v_result__2_2,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))))
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000100000000000000", 2)))) then {
            v_st.f_gen_store (v_result__2_2,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))))
          } else {
            if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000110000000000000", 2)))) then {
              v_st.f_gen_store (v_result__2_2,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_V.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))))
            } else {
              if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2)))) then {
                v_st.f_gen_store (v_result__2_2,v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))))))
              } else {
                if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001010000000000000", 2)))) then {
                  v_st.f_gen_store (v_result__2_2,v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v)))
                } else {
                  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001100000000000000", 2)))) then {
                    v_st.f_gen_store (v_result__2_2,v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v)), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2))))))
                  } else {
                    v_st.f_gen_store (v_result__2_2,v_st.f_gen_bool_lit(true))
                  }
                }
              }
            }
          }
        }
      }
      if (((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000101000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))))) then {
        v_ConditionHolds66__2_copyprop.v = v_st.f_gen_not_bool(v_st.f_gen_load(v_result__2_2))
      } else {
        v_ConditionHolds66__2_copyprop.v = v_st.f_gen_load(v_result__2_2)
      }
      val v_temp2 : RTLabel = v_st.f_gen_branch(v_ConditionHolds66__2_copyprop.v) 
      v_st.f_switch_context (v_st.f_true_branch(v_temp2))
      val v_Exp85__2 : RTSym = v_st.f_decl_bv("Exp85__2", BigInt(4)) 
      v_st.f_gen_store (v_Exp85__2,v_st.f_gen_FPCompare(BigInt(16), v_st.f_gen_slice(v_Exp62__2_copyprop.v, BigInt(0), BigInt(16)), v_st.f_gen_slice(v_Exp65__2_copyprop.v, BigInt(0), BigInt(16)), v_st.f_gen_bool_lit(v_st.f_eq_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(4),BigInt(1)), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_load(v_st.v_FPCR.v)))
      v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp85__2), BigInt(0), BigInt(1)))
      v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp85__2), BigInt(1), BigInt(1)))
      v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp85__2), BigInt(2), BigInt(1)))
      v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_st.f_gen_load(v_Exp85__2), BigInt(3), BigInt(1)))
      v_st.f_switch_context (v_st.f_false_branch(v_temp2))
      v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(0),BigInt(1))))
      v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(1),BigInt(1))))
      v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(2),BigInt(1))))
      v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(3),BigInt(1))))
      v_st.f_switch_context (v_st.f_merge_branch(v_temp2))
    }
  }
}
