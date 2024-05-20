/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_float_compare_cond (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_Exp6__2 = Mutable[Expr](rTExprDefault)
    v_Exp6__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_Exp9__2 = Mutable[Expr](rTExprDefault)
    v_Exp9__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
    val v_ConditionHolds10__2 = Mutable[Expr](rTExprDefault)
    val v_result__2 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000010000000000000", 2)))) then {
        v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000100000000000000", 2)))) then {
          v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
        } else {
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000110000000000000", 2)))) then {
            v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_V.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
          } else {
            if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2)))) then {
              v_result__2.v = f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2)))))
            } else {
              if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001010000000000000", 2)))) then {
                v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v))
              } else {
                if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001100000000000000", 2)))) then {
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
    if (((((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001001000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000101000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000011000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))))) then {
      v_ConditionHolds10__2.v = f_gen_not_bool(v_st, v_result__2.v)
    } else {
      v_ConditionHolds10__2.v = v_result__2.v
    }
    val v_temp0 : RTLabel = f_gen_branch(v_st, v_ConditionHolds10__2.v) 
    f_switch_context (v_st,f_true_branch(v_st, v_temp0))
    val v_Exp29__2 : RTSym = f_decl_bv(v_st, "Exp29__2", BigInt(4)) 
    f_gen_store (v_st,v_Exp29__2,f_gen_FPCompare(v_st, BigInt(32), f_gen_slice(v_st, v_Exp6__2.v, BigInt(0), BigInt(32)), f_gen_slice(v_st, v_Exp9__2.v, BigInt(0), BigInt(32)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(4),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v)))
    f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp29__2), BigInt(0), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp29__2), BigInt(1), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp29__2), BigInt(2), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp29__2), BigInt(3), BigInt(1)))
    f_switch_context (v_st,f_false_branch(v_st, v_temp0))
    f_gen_store (v_st,v_PSTATE_V.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1))))
    f_gen_store (v_st,v_PSTATE_C.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(1),BigInt(1))))
    f_gen_store (v_st,v_PSTATE_Z.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(2),BigInt(1))))
    f_gen_store (v_st,v_PSTATE_N.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1))))
    f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
      val v_Exp33__2 = Mutable[Expr](rTExprDefault)
      v_Exp33__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_Exp36__2 = Mutable[Expr](rTExprDefault)
      v_Exp36__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
      val v_ConditionHolds37__2 = Mutable[Expr](rTExprDefault)
      val v_result__2 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000010000000000000", 2)))) then {
          v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
        } else {
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000100000000000000", 2)))) then {
            v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
          } else {
            if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000110000000000000", 2)))) then {
              v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_V.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
            } else {
              if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2)))) then {
                v_result__2.v = f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2)))))
              } else {
                if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001010000000000000", 2)))) then {
                  v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v))
                } else {
                  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001100000000000000", 2)))) then {
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
      if (((((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001001000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000101000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000011000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))))) then {
        v_ConditionHolds37__2.v = f_gen_not_bool(v_st, v_result__2.v)
      } else {
        v_ConditionHolds37__2.v = v_result__2.v
      }
      val v_temp1 : RTLabel = f_gen_branch(v_st, v_ConditionHolds37__2.v) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp1))
      val v_Exp56__2 : RTSym = f_decl_bv(v_st, "Exp56__2", BigInt(4)) 
      f_gen_store (v_st,v_Exp56__2,f_gen_FPCompare(v_st, BigInt(64), f_gen_slice(v_st, v_Exp33__2.v, BigInt(0), BigInt(64)), f_gen_slice(v_st, v_Exp36__2.v, BigInt(0), BigInt(64)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(4),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v)))
      f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp56__2), BigInt(0), BigInt(1)))
      f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp56__2), BigInt(1), BigInt(1)))
      f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp56__2), BigInt(2), BigInt(1)))
      f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp56__2), BigInt(3), BigInt(1)))
      f_switch_context (v_st,f_false_branch(v_st, v_temp1))
      f_gen_store (v_st,v_PSTATE_V.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1))))
      f_gen_store (v_st,v_PSTATE_C.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(1),BigInt(1))))
      f_gen_store (v_st,v_PSTATE_Z.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(2),BigInt(1))))
      f_gen_store (v_st,v_PSTATE_N.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp1))
    } else {
      val v_Exp62__2 = Mutable[Expr](rTExprDefault)
      v_Exp62__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_Exp65__2 = Mutable[Expr](rTExprDefault)
      v_Exp65__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
      val v_ConditionHolds66__2 = Mutable[Expr](rTExprDefault)
      val v_result__2 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000010000000000000", 2)))) then {
          v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
        } else {
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000100000000000000", 2)))) then {
            v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
          } else {
            if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000110000000000000", 2)))) then {
              v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_V.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))))
            } else {
              if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2)))) then {
                v_result__2.v = f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2)))))
              } else {
                if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001010000000000000", 2)))) then {
                  v_result__2.v = f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v))
                } else {
                  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001110000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001100000000000000", 2)))) then {
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
      if (((((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001001000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000101000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000011000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))))) then {
        v_ConditionHolds66__2.v = f_gen_not_bool(v_st, v_result__2.v)
      } else {
        v_ConditionHolds66__2.v = v_result__2.v
      }
      val v_temp2 : RTLabel = f_gen_branch(v_st, v_ConditionHolds66__2.v) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp2))
      val v_Exp85__2 : RTSym = f_decl_bv(v_st, "Exp85__2", BigInt(4)) 
      f_gen_store (v_st,v_Exp85__2,f_gen_FPCompare(v_st, BigInt(16), f_gen_slice(v_st, v_Exp62__2.v, BigInt(0), BigInt(16)), f_gen_slice(v_st, v_Exp65__2.v, BigInt(0), BigInt(16)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(4),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v)))
      f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp85__2), BigInt(0), BigInt(1)))
      f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp85__2), BigInt(1), BigInt(1)))
      f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp85__2), BigInt(2), BigInt(1)))
      f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp85__2), BigInt(3), BigInt(1)))
      f_switch_context (v_st,f_false_branch(v_st, v_temp2))
      f_gen_store (v_st,v_PSTATE_V.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1))))
      f_gen_store (v_st,v_PSTATE_C.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(1),BigInt(1))))
      f_gen_store (v_st,v_PSTATE_Z.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(2),BigInt(1))))
      f_gen_store (v_st,v_PSTATE_N.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp2))
    }
  }
}
