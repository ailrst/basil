/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_branch_conditional_cond (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_ConditionHolds1__2 : RTSym = f_decl_bool(v_st, "ConditionHolds1__2") 
  val v_result__2 : RTSym = f_decl_bool(v_st, "result__2") 
  if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), BitVecLiteral(BigInt("000", 2), 3))) then {
    f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
  } else {
    if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), BitVecLiteral(BigInt("001", 2), 3))) then {
      f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
    } else {
      if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), BitVecLiteral(BigInt("010", 2), 3))) then {
        f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
      } else {
        if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), BitVecLiteral(BigInt("011", 2), 3))) then {
          f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_V.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
        } else {
          if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), BitVecLiteral(BigInt("100", 2), 3))) then {
            f_gen_store (v_st,v_result__2,f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)))))
          } else {
            if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), BitVecLiteral(BigInt("101", 2), 3))) then {
              f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v)))
            } else {
              if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), BitVecLiteral(BigInt("110", 2), 3))) then {
                f_gen_store (v_st,v_result__2,f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v)), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)))))
              } else {
                if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(1),BigInt(3)), BitVecLiteral(BigInt("111", 2), 3))) then {
                  f_gen_store (v_st,v_result__2,f_gen_bool_lit(v_st, true))
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
  if (((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) && (f_ne_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(0),BigInt(4)), BitVecLiteral(BigInt("1111", 2), 4))))) then {
    f_gen_store (v_st,v_ConditionHolds1__2,f_gen_not_bool(v_st, f_gen_load(v_st, v_result__2)))
  } else {
    f_gen_store (v_st,v_ConditionHolds1__2,f_gen_load(v_st, v_result__2))
  }
  val v_temp0 = Mutable[RTLabel](rTLabelDefault)
  val v_temp1 = Mutable[RTLabel](rTLabelDefault)
  val v_temp2 = Mutable[RTLabel](rTLabelDefault)
  val (tmp7,tmp8,tmp9) = f_gen_branch(v_st, f_gen_load(v_st, v_ConditionHolds1__2)) 
  v_temp0.v = tmp7
  v_temp1.v = tmp8
  v_temp2.v = tmp9
  f_switch_context (v_st,v_temp0.v)
  f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
  f_gen_store (v_st,v__PC.v,f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), f_SignExtend(v_st, BigInt(21), BigInt(64), f_append_bits(v_st, BigInt(19), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(19)), BitVecLiteral(BigInt("00", 2), 2)), BigInt(64)))))
  f_switch_context (v_st,v_temp1.v)
  f_switch_context (v_st,v_temp2.v)
}
