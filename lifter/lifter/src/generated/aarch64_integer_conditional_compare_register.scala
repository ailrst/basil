/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_integer_conditional_compare_register[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2)))) then {
    val v_X_read3__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_X_read3__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
    } else {
      v_X_read3__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    val v_X_read8__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2)))))) then {
      v_X_read8__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5))))
    } else {
      v_X_read8__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    val v_ConditionHolds13__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
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
      v_ConditionHolds13__2_copyprop.v = v_st.f_gen_not_bool(v_st.f_gen_load(v_result__2))
    } else {
      v_ConditionHolds13__2_copyprop.v = v_st.f_gen_load(v_result__2)
    }
    val v_temp0 : RTLabel = v_st.f_gen_branch(v_ConditionHolds13__2_copyprop.v) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp0))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
      v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_add_bits(BigInt(64), v_X_read3__2_copyprop.v, v_st.f_gen_not_bits(BigInt(64), v_X_read8__2_copyprop.v)), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000001", 2)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_X_read3__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_not_bits(BigInt(64), v_X_read8__2_copyprop.v), v_st.f_gen_int_lit(BigInt(128)))), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001", 2))))))))
      v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(128), v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_add_bits(BigInt(64), v_X_read3__2_copyprop.v, v_st.f_gen_not_bits(BigInt(64), v_X_read8__2_copyprop.v)), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000001", 2)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_X_read3__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_not_bits(BigInt(64), v_X_read8__2_copyprop.v), v_st.f_gen_int_lit(BigInt(128)))), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001", 2))))))))
      v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(64), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_add_bits(BigInt(64), v_X_read3__2_copyprop.v, v_st.f_gen_not_bits(BigInt(64), v_X_read8__2_copyprop.v)), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000001", 2)))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))))
      v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_add_bits(BigInt(64), v_X_read3__2_copyprop.v, v_st.f_gen_not_bits(BigInt(64), v_X_read8__2_copyprop.v)), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000001", 2)))), BigInt(63), BigInt(1)))
    } else {
      v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_add_bits(BigInt(64), v_X_read3__2_copyprop.v, v_X_read8__2_copyprop.v), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_X_read3__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_X_read8__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))))))
      v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(128), v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_add_bits(BigInt(64), v_X_read3__2_copyprop.v, v_X_read8__2_copyprop.v), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_X_read3__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_X_read8__2_copyprop.v, v_st.f_gen_int_lit(BigInt(128))))))))
      v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(64), v_st.f_gen_add_bits(BigInt(64), v_X_read3__2_copyprop.v, v_X_read8__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))))
      v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_st.f_gen_add_bits(BigInt(64), v_X_read3__2_copyprop.v, v_X_read8__2_copyprop.v), BigInt(63), BigInt(1)))
    }
    v_st.f_switch_context (v_st.f_false_branch(v_temp0))
    v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(0),BigInt(1))))
    v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(1),BigInt(1))))
    v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(2),BigInt(1))))
    v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(3),BigInt(1))))
    v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
  } else {
    val v_X_read61__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_X_read61__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read61__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
    }
    val v_X_read66__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2)))))) then {
      v_X_read66__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read66__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
    }
    val v_ConditionHolds71__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
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
      v_ConditionHolds71__2_copyprop.v = v_st.f_gen_not_bool(v_st.f_gen_load(v_result__2_1))
    } else {
      v_ConditionHolds71__2_copyprop.v = v_st.f_gen_load(v_result__2_1)
    }
    val v_temp1 : RTLabel = v_st.f_gen_branch(v_ConditionHolds71__2_copyprop.v) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp1))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
      v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_add_bits(BigInt(32), v_st.f_gen_add_bits(BigInt(32), v_X_read61__2_copyprop.v, v_st.f_gen_not_bits(BigInt(32), v_X_read66__2_copyprop.v)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_X_read61__2_copyprop.v, v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_not_bits(BigInt(32), v_X_read66__2_copyprop.v), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000001", 2))))))))
      v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(64), v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_add_bits(BigInt(32), v_st.f_gen_add_bits(BigInt(32), v_X_read61__2_copyprop.v, v_st.f_gen_not_bits(BigInt(32), v_X_read66__2_copyprop.v)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_X_read61__2_copyprop.v, v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_not_bits(BigInt(32), v_X_read66__2_copyprop.v), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000001", 2))))))))
      v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(32), v_st.f_gen_add_bits(BigInt(32), v_st.f_gen_add_bits(BigInt(32), v_X_read61__2_copyprop.v, v_st.f_gen_not_bits(BigInt(32), v_X_read66__2_copyprop.v)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))))
      v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_st.f_gen_add_bits(BigInt(32), v_st.f_gen_add_bits(BigInt(32), v_X_read61__2_copyprop.v, v_st.f_gen_not_bits(BigInt(32), v_X_read66__2_copyprop.v)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))), BigInt(31), BigInt(1)))
    } else {
      v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_add_bits(BigInt(32), v_X_read61__2_copyprop.v, v_X_read66__2_copyprop.v), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_X_read61__2_copyprop.v, v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_X_read66__2_copyprop.v, v_st.f_gen_int_lit(BigInt(64))))))))
      v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_not_bits(BigInt(1), v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(64), v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_add_bits(BigInt(32), v_X_read61__2_copyprop.v, v_X_read66__2_copyprop.v), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_X_read61__2_copyprop.v, v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_X_read66__2_copyprop.v, v_st.f_gen_int_lit(BigInt(64))))))))
      v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(32), v_st.f_gen_add_bits(BigInt(32), v_X_read61__2_copyprop.v, v_X_read66__2_copyprop.v), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))))
      v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_st.f_gen_add_bits(BigInt(32), v_X_read61__2_copyprop.v, v_X_read66__2_copyprop.v), BigInt(31), BigInt(1)))
    }
    v_st.f_switch_context (v_st.f_false_branch(v_temp1))
    v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(0),BigInt(1))))
    v_st.f_gen_store (v_st.v_PSTATE_C.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(1),BigInt(1))))
    v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(2),BigInt(1))))
    v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(3),BigInt(1))))
    v_st.f_switch_context (v_st.f_merge_branch(v_temp1))
  }
}
