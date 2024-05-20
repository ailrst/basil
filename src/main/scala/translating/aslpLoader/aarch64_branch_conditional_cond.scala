/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_branch_conditional_cond (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  val v_ConditionHolds1__2 = Mutable[Expr](rTExprDefault)
  val v_result__2 = Mutable[Expr](rTExprDefault)
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000001110", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
    v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000001110", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000010", 2)))) then {
      v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000001110", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000100", 2)))) then {
        v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000001110", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000110", 2)))) then {
          v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_V.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
        } else {
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000001110", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000001000", 2)))) then {
            v_result__2.v = f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2)))))
          } else {
            if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000001110", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000001010", 2)))) then {
              v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v))
            } else {
              if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000001110", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000001100", 2)))) then {
                v_result__2.v = f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v)), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2)))))
              } else {
                v_result__2.v = f_gen_bool_lit(v_st, true)
              }
            }
          }
        }
      }
    }
  }
  if (((((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000001001", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000101", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000011", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2)))))) then {
    v_ConditionHolds1__2.v = f_gen_not_bool(v_st, v_result__2.v)
  } else {
    v_ConditionHolds1__2.v = v_result__2.v
  }
  val v_temp0 : RTLabel = f_gen_branch(v_st, v_ConditionHolds1__2.v) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp0))
  f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
  f_gen_store (v_st,v__PC.v,f_gen_bit_lit(v_st, BigInt(64), f_add_bits(v_st, BigInt(64), v_pc, f_SignExtend(v_st, BigInt(21), BigInt(64), f_append_bits(v_st, BigInt(19), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(19)), mkBits(v_st, 2, BigInt("00", 2))), BigInt(64)))))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
}
