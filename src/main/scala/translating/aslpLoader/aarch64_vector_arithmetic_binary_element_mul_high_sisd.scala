/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_element_mul_high_sisd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (v_split_expr_31804(v_st, v_enc)) then {
    v_split_fun_31870 (v_st,v_enc,v_pc)
  } else {
    v_split_fun_31871 (v_st,v_enc,v_pc)
  }
}
def v_split_expr_31804 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2)))
}
def v_split_expr_31805 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_31806 (v_st: LiftState,v_enc: BV)  = {
  f_append_bits(v_st, BigInt(2), BigInt(1), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), bvextract(v_st,v_enc,BigInt(21),BigInt(1))), bvextract(v_st,v_enc,BigInt(20),BigInt(1)))
}
def v_split_expr_31807 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))
}
def v_split_expr_31808 (v_st: LiftState,v_enc: BV)  = {
  f_ZeroExtend(v_st, BigInt(2), BigInt(3), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), bvextract(v_st,v_enc,BigInt(21),BigInt(1))), BigInt(3))
}
def v_split_expr_31809 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_31810 (v_st: LiftState,v_enc: BV)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
}
def v_split_expr_31811 (v_st: LiftState,v_Rmhi__1: Mutable[BV],v_enc: BV)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), f_append_bits(v_st, BigInt(1), BigInt(4), v_Rmhi__1.v, bvextract(v_st,v_enc,BigInt(16),BigInt(4)))))
}
def v_split_expr_31812 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))
}
def v_split_expr_31813 (v_st: LiftState,v_Exp42__2: Mutable[Expr],v_Exp45__2: Mutable[Expr],v_If46__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000111111111111111", 2))), f_gen_asr_bits(v_st, BigInt(33), BigInt(6), f_gen_add_bits(v_st, BigInt(33), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Exp42__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(8), v_Exp45__2.v, f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(3), BigInt(7), v_index__1.v, BigInt(7)), mkBits(v_st, 7, BigInt("0010000", 2))), BigInt(8)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), f_ZeroExtend(v_st, BigInt(16), BigInt(33), v_If46__1.v, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(6), mkBits(v_st, 6, BigInt("010000", 2))))))
}
def v_split_expr_31814 (v_st: LiftState,v_Exp42__2: Mutable[Expr],v_Exp45__2: Mutable[Expr],v_If46__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_asr_bits(v_st, BigInt(33), BigInt(6), f_gen_add_bits(v_st, BigInt(33), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Exp42__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(8), v_Exp45__2.v, f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(3), BigInt(7), v_index__1.v, BigInt(7)), mkBits(v_st, 7, BigInt("0010000", 2))), BigInt(8)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), f_ZeroExtend(v_st, BigInt(16), BigInt(33), v_If46__1.v, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(6), mkBits(v_st, 6, BigInt("010000", 2)))), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("111111111111111111000000000000000", 2)))))
}
def v_split_expr_31815 (v_st: LiftState,v_Exp42__2: Mutable[Expr],v_Exp45__2: Mutable[Expr],v_If46__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  f_gen_slice(v_st, f_gen_slice(v_st, f_gen_asr_bits(v_st, BigInt(33), BigInt(6), f_gen_add_bits(v_st, BigInt(33), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Exp42__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(8), v_Exp45__2.v, f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(3), BigInt(7), v_index__1.v, BigInt(7)), mkBits(v_st, 7, BigInt("0010000", 2))), BigInt(8)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), f_ZeroExtend(v_st, BigInt(16), BigInt(33), v_If46__1.v, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(6), mkBits(v_st, 6, BigInt("010000", 2)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16))
}
def v_split_expr_31816 (v_st: LiftState)  = {
  f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_31817 (v_st: LiftState,v_enc: BV)  = {
  f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_31818 (v_st: LiftState,v_SignedSatQ55__2: RTSym)  = {
  f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_SignedSatQ55__2), f_gen_int_lit(v_st, BigInt(128)))
}
def v_split_expr_31819 (v_st: LiftState,v_enc: BV)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
}
def v_split_expr_31820 (v_st: LiftState,v_Rmhi__1: Mutable[BV],v_enc: BV)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), f_append_bits(v_st, BigInt(1), BigInt(4), v_Rmhi__1.v, bvextract(v_st,v_enc,BigInt(16),BigInt(4)))))
}
def v_split_expr_31821 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))
}
def v_split_expr_31822 (v_st: LiftState,v_index__1: Mutable[BV])  = {
  ((true) && (f_sle_bits(v_st, BigInt(10), f_ZeroExtend(v_st, BigInt(9), BigInt(10), f_add_bits(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("00100000", 2))), BigInt(9)), mkBits(v_st, 9, BigInt("000100000", 2))), BigInt(10)), mkBits(v_st, 10, BigInt("0010000000", 2)))))
}
def v_split_expr_31823 (v_st: LiftState,v_Exp74__2: Mutable[Expr],v_Exp77__2: Mutable[Expr],v_If78__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), f_gen_bit_lit(v_st, BigInt(65), mkBits(v_st, 65, BigInt("00000000000000000000000000000000001111111111111111111111111111111", 2))), f_gen_asr_bits(v_st, BigInt(65), BigInt(7), f_gen_add_bits(v_st, BigInt(65), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Exp74__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(9), v_Exp77__2.v, f_gen_bit_lit(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("00100000", 2))), BigInt(9)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), f_ZeroExtend(v_st, BigInt(32), BigInt(65), v_If78__1.v, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(7), mkBits(v_st, 7, BigInt("0100000", 2))))))
}
def v_split_expr_31824 (v_st: LiftState,v_Exp74__2: Mutable[Expr],v_Exp77__2: Mutable[Expr],v_If78__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), f_gen_asr_bits(v_st, BigInt(65), BigInt(7), f_gen_add_bits(v_st, BigInt(65), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Exp74__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(9), v_Exp77__2.v, f_gen_bit_lit(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("00100000", 2))), BigInt(9)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), f_ZeroExtend(v_st, BigInt(32), BigInt(65), v_If78__1.v, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(7), mkBits(v_st, 7, BigInt("0100000", 2)))), f_gen_bit_lit(v_st, BigInt(65), mkBits(v_st, 65, BigInt("11111111111111111111111111111111110000000000000000000000000000000", 2)))))
}
def v_split_expr_31825 (v_st: LiftState,v_Exp74__2: Mutable[Expr],v_Exp77__2: Mutable[Expr],v_If78__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  f_gen_slice(v_st, f_gen_slice(v_st, f_gen_asr_bits(v_st, BigInt(65), BigInt(7), f_gen_add_bits(v_st, BigInt(65), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Exp74__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(128), BigInt(9), v_Exp77__2.v, f_gen_bit_lit(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("00100000", 2))), BigInt(9)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), f_ZeroExtend(v_st, BigInt(32), BigInt(65), v_If78__1.v, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(7), mkBits(v_st, 7, BigInt("0100000", 2)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))
}
def v_split_expr_31826 (v_st: LiftState)  = {
  f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_31827 (v_st: LiftState,v_enc: BV)  = {
  f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_31828 (v_st: LiftState,v_SignedSatQ87__2: RTSym)  = {
  f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_SignedSatQ87__2), f_gen_int_lit(v_st, BigInt(128)))
}
def v_split_expr_31829 (v_st: LiftState,v_Exp42__2: Mutable[Expr],v_Exp45__2: Mutable[Expr],v_If46__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_31813(v_st, v_Exp42__2, v_Exp45__2, v_If46__1, v_index__1)
}
def v_split_expr_31830 (v_st: LiftState,v_Exp42__2: Mutable[Expr],v_Exp45__2: Mutable[Expr],v_If46__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_31814(v_st, v_Exp42__2, v_Exp45__2, v_If46__1, v_index__1)
}
def v_split_expr_31831 (v_st: LiftState,v_Exp42__2: Mutable[Expr],v_Exp45__2: Mutable[Expr],v_If46__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_31815(v_st, v_Exp42__2, v_Exp45__2, v_If46__1, v_index__1)
}
def v_split_expr_31833 (v_st: LiftState,v_Exp74__2: Mutable[Expr],v_Exp77__2: Mutable[Expr],v_If78__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_31823(v_st, v_Exp74__2, v_Exp77__2, v_If78__1, v_index__1)
}
def v_split_expr_31834 (v_st: LiftState,v_Exp74__2: Mutable[Expr],v_Exp77__2: Mutable[Expr],v_If78__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_31824(v_st, v_Exp74__2, v_Exp77__2, v_If78__1, v_index__1)
}
def v_split_expr_31835 (v_st: LiftState,v_Exp74__2: Mutable[Expr],v_Exp77__2: Mutable[Expr],v_If78__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_31825(v_st, v_Exp74__2, v_Exp77__2, v_If78__1, v_index__1)
}
def v_split_expr_31837 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_31838 (v_st: LiftState,v_enc: BV)  = {
  f_append_bits(v_st, BigInt(2), BigInt(1), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), bvextract(v_st,v_enc,BigInt(21),BigInt(1))), bvextract(v_st,v_enc,BigInt(20),BigInt(1)))
}
def v_split_expr_31839 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))
}
def v_split_expr_31840 (v_st: LiftState,v_enc: BV)  = {
  f_ZeroExtend(v_st, BigInt(2), BigInt(3), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), bvextract(v_st,v_enc,BigInt(21),BigInt(1))), BigInt(3))
}
def v_split_expr_31841 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_31842 (v_st: LiftState,v_enc: BV)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
}
def v_split_expr_31843 (v_st: LiftState,v_Rmhi__1: Mutable[BV],v_enc: BV)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), f_append_bits(v_st, BigInt(1), BigInt(4), v_Rmhi__1.v, bvextract(v_st,v_enc,BigInt(16),BigInt(4)))))
}
def v_split_expr_31844 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))
}
def v_split_expr_31845 (v_st: LiftState,v_index__1: Mutable[BV])  = {
  ((true) && (f_sle_bits(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_add_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(3), BigInt(7), v_index__1.v, BigInt(7)), mkBits(v_st, 7, BigInt("0010000", 2))), BigInt(8)), mkBits(v_st, 8, BigInt("00010000", 2))), BigInt(9)), mkBits(v_st, 9, BigInt("001000000", 2)))))
}
def v_split_expr_31846 (v_st: LiftState,v_Exp176__2: Mutable[Expr],v_Exp179__2: Mutable[Expr],v_If180__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000111111111111111", 2))), f_gen_asr_bits(v_st, BigInt(33), BigInt(6), f_gen_add_bits(v_st, BigInt(33), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Exp176__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(64), BigInt(8), f_gen_slice(v_st, v_Exp179__2.v, BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(3), BigInt(7), v_index__1.v, BigInt(7)), mkBits(v_st, 7, BigInt("0010000", 2))), BigInt(8)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), f_ZeroExtend(v_st, BigInt(16), BigInt(33), v_If180__1.v, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(6), mkBits(v_st, 6, BigInt("010000", 2))))))
}
def v_split_expr_31847 (v_st: LiftState,v_Exp176__2: Mutable[Expr],v_Exp179__2: Mutable[Expr],v_If180__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_asr_bits(v_st, BigInt(33), BigInt(6), f_gen_add_bits(v_st, BigInt(33), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Exp176__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(64), BigInt(8), f_gen_slice(v_st, v_Exp179__2.v, BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(3), BigInt(7), v_index__1.v, BigInt(7)), mkBits(v_st, 7, BigInt("0010000", 2))), BigInt(8)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), f_ZeroExtend(v_st, BigInt(16), BigInt(33), v_If180__1.v, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(6), mkBits(v_st, 6, BigInt("010000", 2)))), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("111111111111111111000000000000000", 2)))))
}
def v_split_expr_31848 (v_st: LiftState,v_Exp176__2: Mutable[Expr],v_Exp179__2: Mutable[Expr],v_If180__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  f_gen_slice(v_st, f_gen_slice(v_st, f_gen_asr_bits(v_st, BigInt(33), BigInt(6), f_gen_add_bits(v_st, BigInt(33), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Exp176__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(64), BigInt(8), f_gen_slice(v_st, v_Exp179__2.v, BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_mul_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(3), BigInt(7), v_index__1.v, BigInt(7)), mkBits(v_st, 7, BigInt("0010000", 2))), BigInt(8)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), f_ZeroExtend(v_st, BigInt(16), BigInt(33), v_If180__1.v, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(6), mkBits(v_st, 6, BigInt("010000", 2)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16))
}
def v_split_expr_31849 (v_st: LiftState)  = {
  f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_31850 (v_st: LiftState,v_enc: BV)  = {
  f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_31851 (v_st: LiftState,v_SignedSatQ189__2: RTSym)  = {
  f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_SignedSatQ189__2), f_gen_int_lit(v_st, BigInt(128)))
}
def v_split_expr_31852 (v_st: LiftState,v_enc: BV)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
}
def v_split_expr_31853 (v_st: LiftState,v_Rmhi__1: Mutable[BV],v_enc: BV)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), f_append_bits(v_st, BigInt(1), BigInt(4), v_Rmhi__1.v, bvextract(v_st,v_enc,BigInt(16),BigInt(4)))))
}
def v_split_expr_31854 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000001000000000000", 2)))
}
def v_split_expr_31855 (v_st: LiftState,v_index__1: Mutable[BV])  = {
  ((true) && (f_sle_bits(v_st, BigInt(10), f_ZeroExtend(v_st, BigInt(9), BigInt(10), f_add_bits(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("00100000", 2))), BigInt(9)), mkBits(v_st, 9, BigInt("000100000", 2))), BigInt(10)), mkBits(v_st, 10, BigInt("0001000000", 2)))))
}
def v_split_expr_31856 (v_st: LiftState,v_Exp208__2: Mutable[Expr],v_Exp211__2: Mutable[Expr],v_If212__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), f_gen_bit_lit(v_st, BigInt(65), mkBits(v_st, 65, BigInt("00000000000000000000000000000000001111111111111111111111111111111", 2))), f_gen_asr_bits(v_st, BigInt(65), BigInt(7), f_gen_add_bits(v_st, BigInt(65), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Exp208__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(64), BigInt(9), f_gen_slice(v_st, v_Exp211__2.v, BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("00100000", 2))), BigInt(9)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), f_ZeroExtend(v_st, BigInt(32), BigInt(65), v_If212__1.v, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(7), mkBits(v_st, 7, BigInt("0100000", 2))))))
}
def v_split_expr_31857 (v_st: LiftState,v_Exp208__2: Mutable[Expr],v_Exp211__2: Mutable[Expr],v_If212__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), f_gen_asr_bits(v_st, BigInt(65), BigInt(7), f_gen_add_bits(v_st, BigInt(65), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Exp208__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(64), BigInt(9), f_gen_slice(v_st, v_Exp211__2.v, BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("00100000", 2))), BigInt(9)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), f_ZeroExtend(v_st, BigInt(32), BigInt(65), v_If212__1.v, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(7), mkBits(v_st, 7, BigInt("0100000", 2)))), f_gen_bit_lit(v_st, BigInt(65), mkBits(v_st, 65, BigInt("11111111111111111111111111111111110000000000000000000000000000000", 2)))))
}
def v_split_expr_31858 (v_st: LiftState,v_Exp208__2: Mutable[Expr],v_Exp211__2: Mutable[Expr],v_If212__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  f_gen_slice(v_st, f_gen_slice(v_st, f_gen_asr_bits(v_st, BigInt(65), BigInt(7), f_gen_add_bits(v_st, BigInt(65), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Exp208__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(64), BigInt(9), f_gen_slice(v_st, v_Exp211__2.v, BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_mul_bits(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), mkBits(v_st, 8, BigInt("00100000", 2))), BigInt(9)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), f_ZeroExtend(v_st, BigInt(32), BigInt(65), v_If212__1.v, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(7), mkBits(v_st, 7, BigInt("0100000", 2)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))
}
def v_split_expr_31859 (v_st: LiftState)  = {
  f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_31860 (v_st: LiftState,v_enc: BV)  = {
  f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_31861 (v_st: LiftState,v_SignedSatQ221__2: RTSym)  = {
  f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_SignedSatQ221__2), f_gen_int_lit(v_st, BigInt(128)))
}
def v_split_expr_31862 (v_st: LiftState,v_Exp176__2: Mutable[Expr],v_Exp179__2: Mutable[Expr],v_If180__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_31846(v_st, v_Exp176__2, v_Exp179__2, v_If180__1, v_index__1)
}
def v_split_expr_31863 (v_st: LiftState,v_Exp176__2: Mutable[Expr],v_Exp179__2: Mutable[Expr],v_If180__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_31847(v_st, v_Exp176__2, v_Exp179__2, v_If180__1, v_index__1)
}
def v_split_expr_31864 (v_st: LiftState,v_Exp176__2: Mutable[Expr],v_Exp179__2: Mutable[Expr],v_If180__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_31848(v_st, v_Exp176__2, v_Exp179__2, v_If180__1, v_index__1)
}
def v_split_expr_31866 (v_st: LiftState,v_Exp208__2: Mutable[Expr],v_Exp211__2: Mutable[Expr],v_If212__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_31856(v_st, v_Exp208__2, v_Exp211__2, v_If212__1, v_index__1)
}
def v_split_expr_31867 (v_st: LiftState,v_Exp208__2: Mutable[Expr],v_Exp211__2: Mutable[Expr],v_If212__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_31857(v_st, v_Exp208__2, v_Exp211__2, v_If212__1, v_index__1)
}
def v_split_expr_31868 (v_st: LiftState,v_Exp208__2: Mutable[Expr],v_Exp211__2: Mutable[Expr],v_If212__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_31858(v_st, v_Exp208__2, v_Exp211__2, v_If212__1, v_index__1)
}
def v_split_fun_31832 (v_st: LiftState,v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV],v_pc: BV) : Unit = {
  val v_Exp42__2 = Mutable[Expr](rTExprDefault)
  v_Exp42__2.v = v_split_expr_31810(v_st, v_enc)
  val v_Exp45__2 = Mutable[Expr](rTExprDefault)
  v_Exp45__2.v = v_split_expr_31811(v_st, v_Rmhi__1, v_enc)
  val v_If46__1 = Mutable[BV](mkBits(v_st, BigInt(16), BigInt(0)))
  if (v_split_expr_31812(v_st, v_enc)) then {
    v_If46__1.v = mkBits(v_st, 16, BigInt("1000000000000000", 2))
  } else {
    v_If46__1.v = mkBits(v_st, 16, BigInt("0000000000000000", 2))
  }
  val v_SignedSatQ55__2 : RTSym = f_decl_bv(v_st, "SignedSatQ55__2", BigInt(16)) 
  val v_SignedSatQ56__2 : RTSym = f_decl_bool(v_st, "SignedSatQ56__2") 
  val v_temp0 : RTLabel = v_split_expr_31829(v_st, v_Exp42__2, v_Exp45__2, v_If46__1, v_index__1) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp0))
  f_gen_store (v_st,v_SignedSatQ55__2,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0111111111111111", 2))))
  f_gen_store (v_st,v_SignedSatQ56__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,f_false_branch(v_st, v_temp0))
  val v_temp1 : RTLabel = v_split_expr_31830(v_st, v_Exp42__2, v_Exp45__2, v_If46__1, v_index__1) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp1))
  f_gen_store (v_st,v_SignedSatQ55__2,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1000000000000000", 2))))
  f_gen_store (v_st,v_SignedSatQ56__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,f_false_branch(v_st, v_temp1))
  f_gen_store (v_st,v_SignedSatQ55__2,v_split_expr_31831(v_st, v_Exp42__2, v_Exp45__2, v_If46__1, v_index__1))
  f_gen_store (v_st,v_SignedSatQ56__2,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
  val v_temp2 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ56__2)) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp2))
  f_gen_store (v_st,v_FPSR.v,v_split_expr_31816(v_st))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp2))
  f_gen_array_store (v_st,v__Z.v,v_split_expr_31817(v_st, v_enc),v_split_expr_31818(v_st, v_SignedSatQ55__2))
}
def v_split_fun_31836 (v_st: LiftState,v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV],v_pc: BV) : Unit = {
  val v_Exp74__2 = Mutable[Expr](rTExprDefault)
  v_Exp74__2.v = v_split_expr_31819(v_st, v_enc)
  val v_Exp77__2 = Mutable[Expr](rTExprDefault)
  v_Exp77__2.v = v_split_expr_31820(v_st, v_Rmhi__1, v_enc)
  val v_If78__1 = Mutable[BV](mkBits(v_st, BigInt(32), BigInt(0)))
  if (v_split_expr_31821(v_st, v_enc)) then {
    v_If78__1.v = mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))
  } else {
    v_If78__1.v = mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))
  }
  assert (v_split_expr_31822(v_st, v_index__1))
  val v_SignedSatQ87__2 : RTSym = f_decl_bv(v_st, "SignedSatQ87__2", BigInt(32)) 
  val v_SignedSatQ88__2 : RTSym = f_decl_bool(v_st, "SignedSatQ88__2") 
  val v_temp3 : RTLabel = v_split_expr_31833(v_st, v_Exp74__2, v_Exp77__2, v_If78__1, v_index__1) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp3))
  f_gen_store (v_st,v_SignedSatQ87__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("01111111111111111111111111111111", 2))))
  f_gen_store (v_st,v_SignedSatQ88__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,f_false_branch(v_st, v_temp3))
  val v_temp4 : RTLabel = v_split_expr_31834(v_st, v_Exp74__2, v_Exp77__2, v_If78__1, v_index__1) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp4))
  f_gen_store (v_st,v_SignedSatQ87__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))))
  f_gen_store (v_st,v_SignedSatQ88__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,f_false_branch(v_st, v_temp4))
  f_gen_store (v_st,v_SignedSatQ87__2,v_split_expr_31835(v_st, v_Exp74__2, v_Exp77__2, v_If78__1, v_index__1))
  f_gen_store (v_st,v_SignedSatQ88__2,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp3))
  val v_temp5 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ88__2)) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp5))
  f_gen_store (v_st,v_FPSR.v,v_split_expr_31826(v_st))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp5))
  f_gen_array_store (v_st,v__Z.v,v_split_expr_31827(v_st, v_enc),v_split_expr_31828(v_st, v_SignedSatQ87__2))
}
def v_split_fun_31865 (v_st: LiftState,v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV],v_pc: BV) : Unit = {
  val v_Exp176__2 = Mutable[Expr](rTExprDefault)
  v_Exp176__2.v = v_split_expr_31842(v_st, v_enc)
  val v_Exp179__2 = Mutable[Expr](rTExprDefault)
  v_Exp179__2.v = v_split_expr_31843(v_st, v_Rmhi__1, v_enc)
  val v_If180__1 = Mutable[BV](mkBits(v_st, BigInt(16), BigInt(0)))
  if (v_split_expr_31844(v_st, v_enc)) then {
    v_If180__1.v = mkBits(v_st, 16, BigInt("1000000000000000", 2))
  } else {
    v_If180__1.v = mkBits(v_st, 16, BigInt("0000000000000000", 2))
  }
  assert (v_split_expr_31845(v_st, v_index__1))
  val v_SignedSatQ189__2 : RTSym = f_decl_bv(v_st, "SignedSatQ189__2", BigInt(16)) 
  val v_SignedSatQ190__2 : RTSym = f_decl_bool(v_st, "SignedSatQ190__2") 
  val v_temp6 : RTLabel = v_split_expr_31862(v_st, v_Exp176__2, v_Exp179__2, v_If180__1, v_index__1) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp6))
  f_gen_store (v_st,v_SignedSatQ189__2,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0111111111111111", 2))))
  f_gen_store (v_st,v_SignedSatQ190__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,f_false_branch(v_st, v_temp6))
  val v_temp7 : RTLabel = v_split_expr_31863(v_st, v_Exp176__2, v_Exp179__2, v_If180__1, v_index__1) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp7))
  f_gen_store (v_st,v_SignedSatQ189__2,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1000000000000000", 2))))
  f_gen_store (v_st,v_SignedSatQ190__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,f_false_branch(v_st, v_temp7))
  f_gen_store (v_st,v_SignedSatQ189__2,v_split_expr_31864(v_st, v_Exp176__2, v_Exp179__2, v_If180__1, v_index__1))
  f_gen_store (v_st,v_SignedSatQ190__2,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp6))
  val v_temp8 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ190__2)) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp8))
  f_gen_store (v_st,v_FPSR.v,v_split_expr_31849(v_st))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp8))
  f_gen_array_store (v_st,v__Z.v,v_split_expr_31850(v_st, v_enc),v_split_expr_31851(v_st, v_SignedSatQ189__2))
}
def v_split_fun_31869 (v_st: LiftState,v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV],v_pc: BV) : Unit = {
  val v_Exp208__2 = Mutable[Expr](rTExprDefault)
  v_Exp208__2.v = v_split_expr_31852(v_st, v_enc)
  val v_Exp211__2 = Mutable[Expr](rTExprDefault)
  v_Exp211__2.v = v_split_expr_31853(v_st, v_Rmhi__1, v_enc)
  val v_If212__1 = Mutable[BV](mkBits(v_st, BigInt(32), BigInt(0)))
  if (v_split_expr_31854(v_st, v_enc)) then {
    v_If212__1.v = mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))
  } else {
    v_If212__1.v = mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))
  }
  assert (v_split_expr_31855(v_st, v_index__1))
  val v_SignedSatQ221__2 : RTSym = f_decl_bv(v_st, "SignedSatQ221__2", BigInt(32)) 
  val v_SignedSatQ222__2 : RTSym = f_decl_bool(v_st, "SignedSatQ222__2") 
  val v_temp9 : RTLabel = v_split_expr_31866(v_st, v_Exp208__2, v_Exp211__2, v_If212__1, v_index__1) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp9))
  f_gen_store (v_st,v_SignedSatQ221__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("01111111111111111111111111111111", 2))))
  f_gen_store (v_st,v_SignedSatQ222__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,f_false_branch(v_st, v_temp9))
  val v_temp10 : RTLabel = v_split_expr_31867(v_st, v_Exp208__2, v_Exp211__2, v_If212__1, v_index__1) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp10))
  f_gen_store (v_st,v_SignedSatQ221__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))))
  f_gen_store (v_st,v_SignedSatQ222__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,f_false_branch(v_st, v_temp10))
  f_gen_store (v_st,v_SignedSatQ221__2,v_split_expr_31868(v_st, v_Exp208__2, v_Exp211__2, v_If212__1, v_index__1))
  f_gen_store (v_st,v_SignedSatQ222__2,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp9))
  val v_temp11 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ222__2)) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp11))
  f_gen_store (v_st,v_FPSR.v,v_split_expr_31859(v_st))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp11))
  f_gen_array_store (v_st,v__Z.v,v_split_expr_31860(v_st, v_enc),v_split_expr_31861(v_st, v_SignedSatQ221__2))
}
def v_split_fun_31870 (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  val v_index__1 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
  val v_Rmhi__1 = Mutable[BV](mkBits(v_st, BigInt(1), BigInt(0)))
  if (v_split_expr_31805(v_st, v_enc)) then {
    v_index__1.v = v_split_expr_31806(v_st, v_enc)
    v_Rmhi__1.v = mkBits(v_st, 1, BigInt("0", 2))
  } else {
    if (v_split_expr_31807(v_st, v_enc)) then {
      v_index__1.v = v_split_expr_31808(v_st, v_enc)
      v_Rmhi__1.v = bvextract(v_st,v_enc,BigInt(20),BigInt(1))
    } else {
      throw Exception("not supported")
    }
  }
  if (v_split_expr_31809(v_st, v_enc)) then {
    v_split_fun_31832 (v_st,v_Rmhi__1,v_enc,v_index__1,v_pc)
  } else {
    v_split_fun_31836 (v_st,v_Rmhi__1,v_enc,v_index__1,v_pc)
  }
}
def v_split_fun_31871 (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  val v_index__1 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
  val v_Rmhi__1 = Mutable[BV](mkBits(v_st, BigInt(1), BigInt(0)))
  if (v_split_expr_31837(v_st, v_enc)) then {
    v_index__1.v = v_split_expr_31838(v_st, v_enc)
    v_Rmhi__1.v = mkBits(v_st, 1, BigInt("0", 2))
  } else {
    if (v_split_expr_31839(v_st, v_enc)) then {
      v_index__1.v = v_split_expr_31840(v_st, v_enc)
      v_Rmhi__1.v = bvextract(v_st,v_enc,BigInt(20),BigInt(1))
    } else {
      throw Exception("not supported")
    }
  }
  if (v_split_expr_31841(v_st, v_enc)) then {
    v_split_fun_31865 (v_st,v_Rmhi__1,v_enc,v_index__1,v_pc)
  } else {
    v_split_fun_31869 (v_st,v_Rmhi__1,v_enc,v_index__1,v_pc)
  }
}
