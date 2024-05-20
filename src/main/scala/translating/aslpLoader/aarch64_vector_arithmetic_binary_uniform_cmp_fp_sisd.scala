/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_cmp_fp_sisd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_result__1 = Mutable[Expr](rTExprDefault)
    val v_test_passed__1 = Mutable[Expr](rTExprDefault)
    if (((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) then {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp20__2 = Mutable[Expr](rTExprDefault)
        v_Exp20__2.v = f_gen_FPCompareGE(v_st, BigInt(32), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31))), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(31))), f_gen_load(v_st, v_FPCR.v))
        v_test_passed__1.v = v_Exp20__2.v
      } else {
        val v_Exp22__2 = Mutable[Expr](rTExprDefault)
        v_Exp22__2.v = f_gen_FPCompareGT(v_st, BigInt(32), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31))), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(31))), f_gen_load(v_st, v_FPCR.v))
        v_test_passed__1.v = v_Exp22__2.v
      }
      val v_If25__1 : RTSym = f_decl_bv(v_st, "If25__1", BigInt(32)) 
      val v_temp0 : RTLabel = f_gen_branch(v_st, v_test_passed__1.v) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp0))
      f_gen_store (v_st,v_If25__1,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp0))
      f_gen_store (v_st,v_If25__1,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
      v_result__1.v = f_gen_load(v_st, v_If25__1)
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000000100000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_Exp31__2 = Mutable[Expr](rTExprDefault)
        v_Exp31__2.v = f_gen_FPCompareEQ(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
        v_test_passed__1.v = v_Exp31__2.v
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp33__2 = Mutable[Expr](rTExprDefault)
          v_Exp33__2.v = f_gen_FPCompareGE(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          v_test_passed__1.v = v_Exp33__2.v
        } else {
          val v_Exp35__2 = Mutable[Expr](rTExprDefault)
          v_Exp35__2.v = f_gen_FPCompareGT(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          v_test_passed__1.v = v_Exp35__2.v
        }
      }
      val v_If38__1 : RTSym = f_decl_bv(v_st, "If38__1", BigInt(32)) 
      val v_temp1 : RTLabel = f_gen_branch(v_st, v_test_passed__1.v) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp1))
      f_gen_store (v_st,v_If38__1,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp1))
      f_gen_store (v_st,v_If38__1,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp1))
      v_result__1.v = f_gen_load(v_st, v_If38__1)
    }
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
  } else {
    val v_result__1 = Mutable[Expr](rTExprDefault)
    val v_test_passed__1 = Mutable[Expr](rTExprDefault)
    if (((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) then {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp64__2 = Mutable[Expr](rTExprDefault)
        v_Exp64__2.v = f_gen_FPCompareGE(v_st, BigInt(64), f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(63))), f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(63))), f_gen_load(v_st, v_FPCR.v))
        v_test_passed__1.v = v_Exp64__2.v
      } else {
        val v_Exp66__2 = Mutable[Expr](rTExprDefault)
        v_Exp66__2.v = f_gen_FPCompareGT(v_st, BigInt(64), f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(63))), f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(63))), f_gen_load(v_st, v_FPCR.v))
        v_test_passed__1.v = v_Exp66__2.v
      }
      val v_If69__1 : RTSym = f_decl_bv(v_st, "If69__1", BigInt(64)) 
      val v_temp2 : RTLabel = f_gen_branch(v_st, v_test_passed__1.v) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp2))
      f_gen_store (v_st,v_If69__1,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp2))
      f_gen_store (v_st,v_If69__1,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp2))
      v_result__1.v = f_gen_load(v_st, v_If69__1)
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000000100000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_Exp75__2 = Mutable[Expr](rTExprDefault)
        v_Exp75__2.v = f_gen_FPCompareEQ(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        v_test_passed__1.v = v_Exp75__2.v
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp77__2 = Mutable[Expr](rTExprDefault)
          v_Exp77__2.v = f_gen_FPCompareGE(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
          v_test_passed__1.v = v_Exp77__2.v
        } else {
          val v_Exp79__2 = Mutable[Expr](rTExprDefault)
          v_Exp79__2.v = f_gen_FPCompareGT(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
          v_test_passed__1.v = v_Exp79__2.v
        }
      }
      val v_If82__1 : RTSym = f_decl_bv(v_st, "If82__1", BigInt(64)) 
      val v_temp3 : RTLabel = f_gen_branch(v_st, v_test_passed__1.v) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp3))
      f_gen_store (v_st,v_If82__1,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp3))
      f_gen_store (v_st,v_If82__1,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp3))
      v_result__1.v = f_gen_load(v_st, v_If82__1)
    }
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
  }
}
