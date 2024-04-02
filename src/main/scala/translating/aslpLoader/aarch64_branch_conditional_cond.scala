/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_branch_conditional_cond (v_st: LiftState,v_enc: BV) : Unit = {
  val v_ConditionHolds1__2 = Mutable[Expr](rTExprDefault)
  val v_result__2 = Mutable[Expr](rTExprDefault)
  if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), mkBits(v_st, 3, BigInt("000", 2)))) then {
    v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
  } else {
    if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), mkBits(v_st, 3, BigInt("001", 2)))) then {
      v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
    } else {
      if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), mkBits(v_st, 3, BigInt("010", 2)))) then {
        v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
      } else {
        if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), mkBits(v_st, 3, BigInt("011", 2)))) then {
          v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_V.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
        } else {
          if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), mkBits(v_st, 3, BigInt("100", 2)))) then {
            v_result__2.v = f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2)))))
          } else {
            if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), mkBits(v_st, 3, BigInt("101", 2)))) then {
              v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v))
            } else {
              if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), mkBits(v_st, 3, BigInt("110", 2)))) then {
                v_result__2.v = f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v)), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2)))))
              } else {
                if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), mkBits(v_st, 3, BigInt("111", 2)))) then {
                  v_result__2.v = f_gen_bool_lit(v_st, true)
                } else {
                  throw Exception("not supported")
                }
              }
            }
          }
        }
      }
    }
  }
  if (((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) && (f_ne_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(0),BigInt(4)), mkBits(v_st, 4, BigInt("1111", 2)))))) then {
    v_ConditionHolds1__2.v = f_gen_not_bool(v_st, v_result__2.v)
  } else {
    v_ConditionHolds1__2.v = v_result__2.v
  }
  val v_temp0 : RTLabel = f_gen_branch(v_st, v_ConditionHolds1__2.v) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp0))
  f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
  f_gen_store (v_st,v__PC.v,f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), f_SignExtend(v_st, BigInt(21), BigInt(64), f_append_bits(v_st, BigInt(19), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(19)), mkBits(v_st, 2, BigInt("00", 2))), BigInt(64)))))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
}
