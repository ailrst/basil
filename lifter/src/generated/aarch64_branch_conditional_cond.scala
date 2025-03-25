/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_branch_conditional_cond[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_ConditionHolds1__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  val v_result__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000001110", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    v_result__2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000001110", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2)))) then {
      v_result__2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000001110", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000100", 2)))) then {
        v_result__2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000001110", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000110", 2)))) then {
          v_result__2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_V.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))))
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000001110", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000001000", 2)))) then {
            v_result__2_copyprop.v = v_st.f_gen_and_bool(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_C.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2)))), v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_Z.v), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("0", 2)))))
          } else {
            if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000001110", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000001010", 2)))) then {
              v_result__2_copyprop.v = v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_N.v), v_st.f_gen_load(v_st.v_PSTATE_V.v))
            } else {
              if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000001110", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000001100", 2)))) then {
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
  if (((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000001001", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000101", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000011", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))))) then {
    v_ConditionHolds1__2_copyprop.v = v_st.f_gen_not_bool(v_result__2_copyprop.v)
  } else {
    v_ConditionHolds1__2_copyprop.v = v_result__2_copyprop.v
  }
  val v_temp0 : RTLabel = v_st.f_gen_branch(v_ConditionHolds1__2_copyprop.v) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp0))
  v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
  v_st.f_gen_store (v_st.v__PC.v,v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.f_SignExtend(BigInt(21), BigInt(64), v_st.f_append_bits(BigInt(19), BigInt(2), v_st.bvextract(v_enc,BigInt(5),BigInt(19)), v_st.mkBits(2, BigInt("00", 2))), BigInt(64)))))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
}
