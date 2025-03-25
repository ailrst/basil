/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_float_move_fp_select[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_ConditionHolds5__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    val v_result__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_result__2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000010000000000000", 2)))) then {
        v_result__2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000100000000000000", 2)))) then {
          v_result__2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000110000000000000", 2)))) then {
            v_result__2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_V.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
          } else {
            if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2)))) then {
              v_result__2_copyprop.v = v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2)))))
            } else {
              if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001010000000000000", 2)))) then {
                v_result__2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v))
              } else {
                if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001100000000000000", 2)))) then {
                  v_result__2_copyprop.v = v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v)), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2)))))
                } else {
                  v_result__2_copyprop.v = v_st.f_gen_bool_lit(true)
                }
              }
            }
          }
        }
      }
    }
    if (((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000101000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))))) then {
      v_ConditionHolds5__2_copyprop.v = v_st.f_gen_not_bool(v_result__2_copyprop.v)
    } else {
      v_ConditionHolds5__2_copyprop.v = v_result__2_copyprop.v
    }
    val v_If23__1 : RTSym = v_st.f_decl_bv("If23__1", BigInt(32)) 
    val v_temp0 : RTLabel = v_st.f_gen_branch(v_ConditionHolds5__2_copyprop.v) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp0))
    v_st.f_gen_store (v_If23__1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
    v_st.f_switch_context (v_st.f_false_branch(v_temp0))
    v_st.f_gen_store (v_If23__1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))
    v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_If23__1), v_st.f_gen_int_lit(BigInt(128))))
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
      val v_ConditionHolds36__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      val v_result__2_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_result__2_1_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000010000000000000", 2)))) then {
          v_result__2_1_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000100000000000000", 2)))) then {
            v_result__2_1_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
          } else {
            if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000110000000000000", 2)))) then {
              v_result__2_1_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_V.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
            } else {
              if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2)))) then {
                v_result__2_1_copyprop.v = v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2)))))
              } else {
                if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001010000000000000", 2)))) then {
                  v_result__2_1_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v))
                } else {
                  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001100000000000000", 2)))) then {
                    v_result__2_1_copyprop.v = v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v)), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2)))))
                  } else {
                    v_result__2_1_copyprop.v = v_st.f_gen_bool_lit(true)
                  }
                }
              }
            }
          }
        }
      }
      if (((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000101000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))))) then {
        v_ConditionHolds36__2_copyprop.v = v_st.f_gen_not_bool(v_result__2_1_copyprop.v)
      } else {
        v_ConditionHolds36__2_copyprop.v = v_result__2_1_copyprop.v
      }
      val v_If54__1 : RTSym = v_st.f_decl_bv("If54__1", BigInt(64)) 
      val v_temp1 : RTLabel = v_st.f_gen_branch(v_ConditionHolds36__2_copyprop.v) 
      v_st.f_switch_context (v_st.f_true_branch(v_temp1))
      v_st.f_gen_store (v_If54__1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)))
      v_st.f_switch_context (v_st.f_false_branch(v_temp1))
      v_st.f_gen_store (v_If54__1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)))
      v_st.f_switch_context (v_st.f_merge_branch(v_temp1))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_If54__1), v_st.f_gen_int_lit(BigInt(128))))
    } else {
      val v_ConditionHolds69__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      val v_result__2_2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_result__2_2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000010000000000000", 2)))) then {
          v_result__2_2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000100000000000000", 2)))) then {
            v_result__2_2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
          } else {
            if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000110000000000000", 2)))) then {
              v_result__2_2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_V.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
            } else {
              if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2)))) then {
                v_result__2_2_copyprop.v = v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2)))))
              } else {
                if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001010000000000000", 2)))) then {
                  v_result__2_2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v))
                } else {
                  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001110000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001100000000000000", 2)))) then {
                    v_result__2_2_copyprop.v = v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v)), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2)))))
                  } else {
                    v_result__2_2_copyprop.v = v_st.f_gen_bool_lit(true)
                  }
                }
              }
            }
          }
        }
      }
      if (((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000101000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000011000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))))) then {
        v_ConditionHolds69__2_copyprop.v = v_st.f_gen_not_bool(v_result__2_2_copyprop.v)
      } else {
        v_ConditionHolds69__2_copyprop.v = v_result__2_2_copyprop.v
      }
      val v_If87__1 : RTSym = v_st.f_decl_bv("If87__1", BigInt(16)) 
      val v_temp2 : RTLabel = v_st.f_gen_branch(v_ConditionHolds69__2_copyprop.v) 
      v_st.f_switch_context (v_st.f_true_branch(v_temp2))
      v_st.f_gen_store (v_If87__1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)))
      v_st.f_switch_context (v_st.f_false_branch(v_temp2))
      v_st.f_gen_store (v_If87__1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)))
      v_st.f_switch_context (v_st.f_merge_branch(v_temp2))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_st.f_gen_load(v_If87__1), v_st.f_gen_int_lit(BigInt(128))))
    }
  }
}
