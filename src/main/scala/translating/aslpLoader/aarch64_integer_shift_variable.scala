/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_shift_variable (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2)))) then {
    val v_X_read6__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
      v_X_read6__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
    } else {
      v_X_read6__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    val v_X_read13__3 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_X_read13__3.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    } else {
      v_X_read13__3.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    val v_result__2 = Mutable[Expr](rTExprDefault)
    v_result__2.v = v_X_read13__3.v
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_result__2.v = f_gen_lsl_bits(v_st, BigInt(64), BigInt(7), v_X_read13__3.v, f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_slice(v_st, v_X_read6__2.v, BigInt(0), BigInt(6)), f_gen_int_lit(v_st, BigInt(7))))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000010000000000", 2)))) then {
        v_result__2.v = f_gen_lsr_bits(v_st, BigInt(64), BigInt(7), v_X_read13__3.v, f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_slice(v_st, v_X_read6__2.v, BigInt(0), BigInt(6)), f_gen_int_lit(v_st, BigInt(7))))
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2)))) then {
          v_result__2.v = f_gen_asr_bits(v_st, BigInt(64), BigInt(7), v_X_read13__3.v, f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_slice(v_st, v_X_read6__2.v, BigInt(0), BigInt(6)), f_gen_int_lit(v_st, BigInt(7))))
        } else {
          val v_ROR18__3 : RTSym = f_decl_bv(v_st, "ROR18__3", BigInt(64)) 
          val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(6), f_gen_slice(v_st, v_X_read6__2.v, BigInt(0), BigInt(6)), f_gen_bit_lit(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp0))
          f_gen_store (v_st,v_ROR18__3,v_X_read13__3.v)
          f_switch_context (v_st,f_false_branch(v_st, v_temp0))
          f_gen_assert (v_st,f_gen_ne_bits(v_st, BigInt(6), f_gen_slice(v_st, v_X_read6__2.v, BigInt(0), BigInt(6)), f_gen_bit_lit(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)))))
          f_gen_store (v_st,v_ROR18__3,f_gen_or_bits(v_st, BigInt(64), f_gen_lsr_bits(v_st, BigInt(64), BigInt(7), v_X_read13__3.v, f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_slice(v_st, v_X_read6__2.v, BigInt(0), BigInt(6)), f_gen_int_lit(v_st, BigInt(7)))), f_gen_lsl_bits(v_st, BigInt(64), BigInt(8), v_X_read13__3.v, f_gen_ZeroExtend(v_st, BigInt(7), BigInt(8), f_gen_sub_bits(v_st, BigInt(7), f_gen_bit_lit(v_st, BigInt(7), mkBits(v_st, 7, BigInt("1000000", 2))), f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_slice(v_st, v_X_read6__2.v, BigInt(0), BigInt(6)), f_gen_int_lit(v_st, BigInt(7)))), f_gen_int_lit(v_st, BigInt(8))))))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
          v_result__2.v = f_gen_load(v_st, v_ROR18__3)
        }
      }
    }
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),v_result__2.v)
    }
  } else {
    val v_X_read27__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
      v_X_read27__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read27__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
    }
    val v_X_read34__3 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_X_read34__3.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read34__3.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
    }
    val v_result__2 = Mutable[Expr](rTExprDefault)
    v_result__2.v = v_X_read34__3.v
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_result__2.v = f_gen_lsl_bits(v_st, BigInt(32), BigInt(6), v_X_read34__3.v, f_gen_ZeroExtend(v_st, BigInt(5), BigInt(6), f_gen_slice(v_st, v_X_read27__2.v, BigInt(0), BigInt(5)), f_gen_int_lit(v_st, BigInt(6))))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000010000000000", 2)))) then {
        v_result__2.v = f_gen_lsr_bits(v_st, BigInt(32), BigInt(6), v_X_read34__3.v, f_gen_ZeroExtend(v_st, BigInt(5), BigInt(6), f_gen_slice(v_st, v_X_read27__2.v, BigInt(0), BigInt(5)), f_gen_int_lit(v_st, BigInt(6))))
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2)))) then {
          v_result__2.v = f_gen_asr_bits(v_st, BigInt(32), BigInt(6), v_X_read34__3.v, f_gen_ZeroExtend(v_st, BigInt(5), BigInt(6), f_gen_slice(v_st, v_X_read27__2.v, BigInt(0), BigInt(5)), f_gen_int_lit(v_st, BigInt(6))))
        } else {
          val v_ROR39__3 : RTSym = f_decl_bv(v_st, "ROR39__3", BigInt(32)) 
          val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(5), f_gen_slice(v_st, v_X_read27__2.v, BigInt(0), BigInt(5)), f_gen_bit_lit(v_st, BigInt(5), mkBits(v_st, 5, BigInt("00000", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp1))
          f_gen_store (v_st,v_ROR39__3,v_X_read34__3.v)
          f_switch_context (v_st,f_false_branch(v_st, v_temp1))
          f_gen_assert (v_st,f_gen_ne_bits(v_st, BigInt(5), f_gen_slice(v_st, v_X_read27__2.v, BigInt(0), BigInt(5)), f_gen_bit_lit(v_st, BigInt(5), mkBits(v_st, 5, BigInt("00000", 2)))))
          f_gen_store (v_st,v_ROR39__3,f_gen_or_bits(v_st, BigInt(32), f_gen_lsr_bits(v_st, BigInt(32), BigInt(6), v_X_read34__3.v, f_gen_ZeroExtend(v_st, BigInt(5), BigInt(6), f_gen_slice(v_st, v_X_read27__2.v, BigInt(0), BigInt(5)), f_gen_int_lit(v_st, BigInt(6)))), f_gen_lsl_bits(v_st, BigInt(32), BigInt(7), v_X_read34__3.v, f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_sub_bits(v_st, BigInt(6), f_gen_bit_lit(v_st, BigInt(6), mkBits(v_st, 6, BigInt("100000", 2))), f_gen_ZeroExtend(v_st, BigInt(5), BigInt(6), f_gen_slice(v_st, v_X_read27__2.v, BigInt(0), BigInt(5)), f_gen_int_lit(v_st, BigInt(6)))), f_gen_int_lit(v_st, BigInt(7))))))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp1))
          v_result__2.v = f_gen_load(v_st, v_ROR39__3)
        }
      }
    }
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), v_result__2.v, f_gen_int_lit(v_st, BigInt(64))))
    }
  }
}
