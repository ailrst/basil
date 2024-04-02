/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_pac_pacia_hint (v_st: LiftState,v_enc: BV) : Unit = {
  val v_d__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
  val v_n__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
  val v_source_is_sp__1 = Mutable[Boolean](false)
  if (f_eq_bits(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(8),BigInt(4)), bvextract(v_st,v_enc,BigInt(5),BigInt(3))), mkBits(v_st, 7, BigInt("0011000", 2)))) then {
    v_d__1.v = mkBits(v_st, 5, BigInt("11110", 2))
    v_n__1.v = mkBits(v_st, 5, BigInt("11111", 2))
  } else {
    if (f_eq_bits(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(8),BigInt(4)), bvextract(v_st,v_enc,BigInt(5),BigInt(3))), mkBits(v_st, 7, BigInt("0011001", 2)))) then {
      v_d__1.v = mkBits(v_st, 5, BigInt("11110", 2))
      v_source_is_sp__1.v = true
      val v_BTypeCompatible_PACIXSP3__2 : RTSym = f_decl_bool(v_st, "BTypeCompatible_PACIXSP3__2") 
      val v_Exp6__2 = Mutable[Expr](rTExprDefault)
      v_Exp6__2.v = f_gen_or_bool(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_load(v_st, v_PSTATE_BTYPE.v), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2)))), f_gen_and_bool(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_load(v_st, v_PSTATE_BTYPE.v), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))), f_gen_eq_bits(v_st, BigInt(2), f_gen_load(v_st, v_PSTATE_BTYPE.v), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))))
      val v_temp0 : RTLabel = f_gen_branch(v_st, v_Exp6__2.v) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp0))
      f_gen_store (v_st,v_BTypeCompatible_PACIXSP3__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp0))
      val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_load(v_st, v_PSTATE_BTYPE.v), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp1))
      f_gen_store (v_st,v_BTypeCompatible_PACIXSP3__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp1))
      f_gen_store (v_st,v_BTypeCompatible_PACIXSP3__2,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
      f_gen_store (v_st,v_BTypeCompatible.v,f_gen_load(v_st, v_BTypeCompatible_PACIXSP3__2))
    } else {
      if (f_eq_bits(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(8),BigInt(4)), bvextract(v_st,v_enc,BigInt(5),BigInt(3))), mkBits(v_st, 7, BigInt("0001000", 2)))) then {
        v_d__1.v = mkBits(v_st, 5, BigInt("10001", 2))
        v_n__1.v = mkBits(v_st, 5, BigInt("10000", 2))
      } else {
        throw Exception("not supported")
      }
    }
  }
  if (v_source_is_sp__1.v) then {
    val v_X_read75__2 = Mutable[Expr](rTExprDefault)
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    if (f_ne_bits(v_st, BigInt(5), v_d__1.v, mkBits(v_st, 5, BigInt("11111", 2)))) then {
      v_X_read75__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), v_d__1.v))
    } else {
      v_X_read75__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    if (f_ne_bits(v_st, BigInt(5), v_d__1.v, mkBits(v_st, 5, BigInt("11111", 2)))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), v_d__1.v),v_X_read75__2.v)
    }
  } else {
    val v_X_read177__2 = Mutable[Expr](rTExprDefault)
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    if (f_ne_bits(v_st, BigInt(5), v_d__1.v, mkBits(v_st, 5, BigInt("11111", 2)))) then {
      v_X_read177__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), v_d__1.v))
    } else {
      v_X_read177__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_n__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_n__1.v, BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    if (f_ne_bits(v_st, BigInt(5), v_d__1.v, mkBits(v_st, 5, BigInt("11111", 2)))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), v_d__1.v),v_X_read177__2.v)
    }
  }
}
