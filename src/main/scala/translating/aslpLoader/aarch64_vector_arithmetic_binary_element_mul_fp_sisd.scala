/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_element_mul_fp_sisd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2)))) then {
    val v_index__1 = Mutable[BV](mkBits(v_st, BigInt(2), BigInt(0)))
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_index__1.v = f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), bvextract(v_st,v_enc,BigInt(21),BigInt(1)))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000011000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
        v_index__1.v = f_ZeroExtend(v_st, BigInt(1), BigInt(2), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), BigInt(2))
      } else {
        throw Exception("not supported")
      }
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_result__1 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp19__2 = Mutable[Expr](rTExprDefault)
        v_Exp19__2.v = f_gen_FPMulX(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(8), f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), f_append_bits(v_st, BigInt(1), BigInt(4), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), bvextract(v_st,v_enc,BigInt(16),BigInt(4))))), f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(2), BigInt(7), v_index__1.v, BigInt(7)), mkBits(v_st, 7, BigInt("0100000", 2))), BigInt(8)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
        v_result__1.v = v_Exp19__2.v
      } else {
        val v_Exp23__2 = Mutable[Expr](rTExprDefault)
        v_Exp23__2.v = f_gen_FPMul(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(8), f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), f_append_bits(v_st, BigInt(1), BigInt(4), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), bvextract(v_st,v_enc,BigInt(16),BigInt(4))))), f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(2), BigInt(7), v_index__1.v, BigInt(7)), mkBits(v_st, 7, BigInt("0100000", 2))), BigInt(8)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
        v_result__1.v = v_Exp23__2.v
      }
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
    } else {
      val v_result__1 = Mutable[Expr](rTExprDefault)
      assert (((true) && (f_sle_bits(v_st, BigInt(10), f_ZeroExtend(v_st, BigInt(9), BigInt(10), f_add_bits(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(2), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("01000000", 2))), BigInt(9)), mkBits(v_st, 9, BigInt("001000000", 2))), BigInt(10)), mkBits(v_st, 10, BigInt("0010000000", 2))))))
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp44__2 = Mutable[Expr](rTExprDefault)
        v_Exp44__2.v = f_gen_FPMulX(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(9), f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), f_append_bits(v_st, BigInt(1), BigInt(4), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), bvextract(v_st,v_enc,BigInt(16),BigInt(4))))), f_gen_bit_lit(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(2), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("01000000", 2))), BigInt(9)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        v_result__1.v = v_Exp44__2.v
      } else {
        val v_Exp48__2 = Mutable[Expr](rTExprDefault)
        v_Exp48__2.v = f_gen_FPMul(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(9), f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), f_append_bits(v_st, BigInt(1), BigInt(4), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), bvextract(v_st,v_enc,BigInt(16),BigInt(4))))), f_gen_bit_lit(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(2), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("01000000", 2))), BigInt(9)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        v_result__1.v = v_Exp48__2.v
      }
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
    }
  } else {
    val v_index__1 = Mutable[BV](mkBits(v_st, BigInt(2), BigInt(0)))
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_index__1.v = f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), bvextract(v_st,v_enc,BigInt(21),BigInt(1)))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000011000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
        v_index__1.v = f_ZeroExtend(v_st, BigInt(1), BigInt(2), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), BigInt(2))
      } else {
        throw Exception("not supported")
      }
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_result__1 = Mutable[Expr](rTExprDefault)
      assert (((true) && (f_sle_bits(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_add_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(2), BigInt(7), v_index__1.v, BigInt(7)), mkBits(v_st, 7, BigInt("0100000", 2))), BigInt(8)), mkBits(v_st, 8, BigInt("00100000", 2))), BigInt(9)), mkBits(v_st, 9, BigInt("001000000", 2))))))
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp74__2 = Mutable[Expr](rTExprDefault)
        v_Exp74__2.v = f_gen_FPMulX(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(64), BigInt(8), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), f_append_bits(v_st, BigInt(1), BigInt(4), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), bvextract(v_st,v_enc,BigInt(16),BigInt(4))))), BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(2), BigInt(7), v_index__1.v, BigInt(7)), mkBits(v_st, 7, BigInt("0100000", 2))), BigInt(8)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
        v_result__1.v = v_Exp74__2.v
      } else {
        val v_Exp78__2 = Mutable[Expr](rTExprDefault)
        v_Exp78__2.v = f_gen_FPMul(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(64), BigInt(8), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), f_append_bits(v_st, BigInt(1), BigInt(4), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), bvextract(v_st,v_enc,BigInt(16),BigInt(4))))), BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(2), BigInt(7), v_index__1.v, BigInt(7)), mkBits(v_st, 7, BigInt("0100000", 2))), BigInt(8)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
        v_result__1.v = v_Exp78__2.v
      }
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
    } else {
      val v_result__1 = Mutable[Expr](rTExprDefault)
      assert (((true) && (f_sle_bits(v_st, BigInt(10), f_ZeroExtend(v_st, BigInt(9), BigInt(10), f_add_bits(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(2), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("01000000", 2))), BigInt(9)), mkBits(v_st, 9, BigInt("001000000", 2))), BigInt(10)), mkBits(v_st, 10, BigInt("0001000000", 2))))))
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp99__2 = Mutable[Expr](rTExprDefault)
        v_Exp99__2.v = f_gen_FPMulX(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(64), BigInt(9), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), f_append_bits(v_st, BigInt(1), BigInt(4), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), bvextract(v_st,v_enc,BigInt(16),BigInt(4))))), BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(2), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("01000000", 2))), BigInt(9)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        v_result__1.v = v_Exp99__2.v
      } else {
        val v_Exp103__2 = Mutable[Expr](rTExprDefault)
        v_Exp103__2.v = f_gen_FPMul(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(64), BigInt(9), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), f_append_bits(v_st, BigInt(1), BigInt(4), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), bvextract(v_st,v_enc,BigInt(16),BigInt(4))))), BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(2), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("01000000", 2))), BigInt(9)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        v_result__1.v = v_Exp103__2.v
      }
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
    }
  }
}
