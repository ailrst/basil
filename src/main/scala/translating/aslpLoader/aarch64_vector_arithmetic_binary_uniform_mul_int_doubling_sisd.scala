/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_mul_int_doubling_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (v_split_expr_47677(v_st, v_enc)) then {
    throw Exception("not supported")
  } else {
    if (v_split_expr_47678(v_st, v_enc)) then {
      v_split_fun_47745 (v_st,v_enc)
    } else {
      v_split_fun_47746 (v_st,v_enc)
    }
  }
}
def v_split_expr_47677 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) || ((( (!(f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))))) && (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2))))))
}
def v_split_expr_47678 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))
}
def v_split_expr_47679 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))
}
def v_split_expr_47680 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
}
def v_split_expr_47681 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))
}
def v_split_expr_47682 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
}
def v_split_expr_47683 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))
}
def v_split_expr_47684 (v_st: LiftState,v_Exp11__2: RTSym,v_Exp8__2: RTSym,v_If12__1: Mutable[BitVecLiteral])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), BitVecLiteral(BigInt("00000000001111111", 2), 17)), f_gen_asr_bits(v_st, BigInt(17), BigInt(5), f_gen_add_bits(v_st, BigInt(17), f_gen_mul_bits(v_st, BigInt(17), f_gen_SignExtend(v_st, BigInt(9), BigInt(17), f_gen_mul_bits(v_st, BigInt(9), f_gen_bit_lit(v_st, BigInt(9), BitVecLiteral(BigInt("000000010", 2), 9)), f_gen_SignExtend(v_st, BigInt(8), BigInt(9), f_gen_slice(v_st, f_gen_load(v_st, v_Exp8__2), BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(9)))), f_gen_int_lit(v_st, BigInt(17))), f_gen_SignExtend(v_st, BigInt(8), BigInt(17), f_gen_slice(v_st, f_gen_load(v_st, v_Exp11__2), BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_bit_lit(v_st, BigInt(17), f_ZeroExtend(v_st, BigInt(8), BigInt(17), v_If12__1.v, BigInt(17)))), f_gen_bit_lit(v_st, BigInt(5), BitVecLiteral(BigInt("01000", 2), 5)))))
}
def v_split_expr_47685 (v_st: LiftState,v_Exp11__2: RTSym,v_Exp8__2: RTSym,v_If12__1: Mutable[BitVecLiteral])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(17), f_gen_asr_bits(v_st, BigInt(17), BigInt(5), f_gen_add_bits(v_st, BigInt(17), f_gen_mul_bits(v_st, BigInt(17), f_gen_SignExtend(v_st, BigInt(9), BigInt(17), f_gen_mul_bits(v_st, BigInt(9), f_gen_bit_lit(v_st, BigInt(9), BitVecLiteral(BigInt("000000010", 2), 9)), f_gen_SignExtend(v_st, BigInt(8), BigInt(9), f_gen_slice(v_st, f_gen_load(v_st, v_Exp8__2), BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(9)))), f_gen_int_lit(v_st, BigInt(17))), f_gen_SignExtend(v_st, BigInt(8), BigInt(17), f_gen_slice(v_st, f_gen_load(v_st, v_Exp11__2), BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_bit_lit(v_st, BigInt(17), f_ZeroExtend(v_st, BigInt(8), BigInt(17), v_If12__1.v, BigInt(17)))), f_gen_bit_lit(v_st, BigInt(5), BitVecLiteral(BigInt("01000", 2), 5))), f_gen_bit_lit(v_st, BigInt(17), BitVecLiteral(BigInt("11111111110000000", 2), 17))))
}
def v_split_expr_47686 (v_st: LiftState,v_Exp11__2: RTSym,v_Exp8__2: RTSym,v_If12__1: Mutable[BitVecLiteral])  = {
  f_gen_slice(v_st, f_gen_slice(v_st, f_gen_asr_bits(v_st, BigInt(17), BigInt(5), f_gen_add_bits(v_st, BigInt(17), f_gen_mul_bits(v_st, BigInt(17), f_gen_SignExtend(v_st, BigInt(9), BigInt(17), f_gen_mul_bits(v_st, BigInt(9), f_gen_bit_lit(v_st, BigInt(9), BitVecLiteral(BigInt("000000010", 2), 9)), f_gen_SignExtend(v_st, BigInt(8), BigInt(9), f_gen_slice(v_st, f_gen_load(v_st, v_Exp8__2), BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(9)))), f_gen_int_lit(v_st, BigInt(17))), f_gen_SignExtend(v_st, BigInt(8), BigInt(17), f_gen_slice(v_st, f_gen_load(v_st, v_Exp11__2), BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_bit_lit(v_st, BigInt(17), f_ZeroExtend(v_st, BigInt(8), BigInt(17), v_If12__1.v, BigInt(17)))), f_gen_bit_lit(v_st, BigInt(5), BitVecLiteral(BigInt("01000", 2), 5))), BigInt(0), BigInt(8)), BigInt(0), BigInt(8))
}
def v_split_expr_47687 (v_st: LiftState)  = {
  f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_47688 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))
}
def v_split_expr_47689 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_47690 (v_st: LiftState,v_SignedSatQ19__2: RTSym)  = {
  f_gen_ZeroExtend(v_st, BigInt(8), BigInt(128), f_gen_load(v_st, v_SignedSatQ19__2), f_gen_int_lit(v_st, BigInt(128)))
}
def v_split_expr_47691 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))
}
def v_split_expr_47692 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))
}
def v_split_expr_47693 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
}
def v_split_expr_47694 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))
}
def v_split_expr_47695 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
}
def v_split_expr_47696 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))
}
def v_split_expr_47697 (v_st: LiftState,v_Exp38__2: RTSym,v_Exp41__2: RTSym,v_If42__1: Mutable[BitVecLiteral])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), BitVecLiteral(BigInt("000000000000000000111111111111111", 2), 33)), f_gen_asr_bits(v_st, BigInt(33), BigInt(6), f_gen_add_bits(v_st, BigInt(33), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), BitVecLiteral(BigInt("00000000000000010", 2), 17)), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, f_gen_load(v_st, v_Exp38__2), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, f_gen_load(v_st, v_Exp41__2), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), f_ZeroExtend(v_st, BigInt(16), BigInt(33), v_If42__1.v, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(6), BitVecLiteral(BigInt("010000", 2), 6)))))
}
def v_split_expr_47698 (v_st: LiftState,v_Exp38__2: RTSym,v_Exp41__2: RTSym,v_If42__1: Mutable[BitVecLiteral])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_asr_bits(v_st, BigInt(33), BigInt(6), f_gen_add_bits(v_st, BigInt(33), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), BitVecLiteral(BigInt("00000000000000010", 2), 17)), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, f_gen_load(v_st, v_Exp38__2), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, f_gen_load(v_st, v_Exp41__2), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), f_ZeroExtend(v_st, BigInt(16), BigInt(33), v_If42__1.v, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(6), BitVecLiteral(BigInt("010000", 2), 6))), f_gen_bit_lit(v_st, BigInt(33), BitVecLiteral(BigInt("111111111111111111000000000000000", 2), 33))))
}
def v_split_expr_47699 (v_st: LiftState,v_Exp38__2: RTSym,v_Exp41__2: RTSym,v_If42__1: Mutable[BitVecLiteral])  = {
  f_gen_slice(v_st, f_gen_slice(v_st, f_gen_asr_bits(v_st, BigInt(33), BigInt(6), f_gen_add_bits(v_st, BigInt(33), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), BitVecLiteral(BigInt("00000000000000010", 2), 17)), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, f_gen_load(v_st, v_Exp38__2), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, f_gen_load(v_st, v_Exp41__2), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), f_ZeroExtend(v_st, BigInt(16), BigInt(33), v_If42__1.v, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(6), BitVecLiteral(BigInt("010000", 2), 6))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16))
}
def v_split_expr_47700 (v_st: LiftState)  = {
  f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_47701 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))
}
def v_split_expr_47702 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_47703 (v_st: LiftState,v_SignedSatQ49__2: RTSym)  = {
  f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_SignedSatQ49__2), f_gen_int_lit(v_st, BigInt(128)))
}
def v_split_expr_47704 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))
}
def v_split_expr_47705 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))
}
def v_split_expr_47706 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
}
def v_split_expr_47707 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))
}
def v_split_expr_47708 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
}
def v_split_expr_47709 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))
}
def v_split_expr_47710 (v_st: LiftState,v_Exp68__2: RTSym,v_Exp71__2: RTSym,v_If72__1: Mutable[BitVecLiteral])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), f_gen_bit_lit(v_st, BigInt(65), BitVecLiteral(BigInt("00000000000000000000000000000000001111111111111111111111111111111", 2), 65)), f_gen_asr_bits(v_st, BigInt(65), BigInt(7), f_gen_add_bits(v_st, BigInt(65), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), BitVecLiteral(BigInt("000000000000000000000000000000010", 2), 33)), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, f_gen_load(v_st, v_Exp68__2), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, f_gen_load(v_st, v_Exp71__2), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), f_ZeroExtend(v_st, BigInt(32), BigInt(65), v_If72__1.v, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(7), BitVecLiteral(BigInt("0100000", 2), 7)))))
}
def v_split_expr_47711 (v_st: LiftState,v_Exp68__2: RTSym,v_Exp71__2: RTSym,v_If72__1: Mutable[BitVecLiteral])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), f_gen_asr_bits(v_st, BigInt(65), BigInt(7), f_gen_add_bits(v_st, BigInt(65), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), BitVecLiteral(BigInt("000000000000000000000000000000010", 2), 33)), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, f_gen_load(v_st, v_Exp68__2), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, f_gen_load(v_st, v_Exp71__2), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), f_ZeroExtend(v_st, BigInt(32), BigInt(65), v_If72__1.v, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(7), BitVecLiteral(BigInt("0100000", 2), 7))), f_gen_bit_lit(v_st, BigInt(65), BitVecLiteral(BigInt("11111111111111111111111111111111110000000000000000000000000000000", 2), 65))))
}
def v_split_expr_47712 (v_st: LiftState,v_Exp68__2: RTSym,v_Exp71__2: RTSym,v_If72__1: Mutable[BitVecLiteral])  = {
  f_gen_slice(v_st, f_gen_slice(v_st, f_gen_asr_bits(v_st, BigInt(65), BigInt(7), f_gen_add_bits(v_st, BigInt(65), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), BitVecLiteral(BigInt("000000000000000000000000000000010", 2), 33)), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, f_gen_load(v_st, v_Exp68__2), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, f_gen_load(v_st, v_Exp71__2), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), f_ZeroExtend(v_st, BigInt(32), BigInt(65), v_If72__1.v, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(7), BitVecLiteral(BigInt("0100000", 2), 7))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))
}
def v_split_expr_47713 (v_st: LiftState)  = {
  f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_47714 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))
}
def v_split_expr_47715 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_47716 (v_st: LiftState,v_SignedSatQ79__2: RTSym)  = {
  f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_SignedSatQ79__2), f_gen_int_lit(v_st, BigInt(128)))
}
def v_split_expr_47717 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))
}
def v_split_expr_47718 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))
}
def v_split_expr_47719 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
}
def v_split_expr_47720 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))
}
def v_split_expr_47721 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
}
def v_split_expr_47722 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))
}
def v_split_expr_47723 (v_st: LiftState,v_Exp101__2: RTSym,v_Exp98__2: RTSym,v_If102__1: Mutable[BitVecLiteral])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(129), f_gen_bit_lit(v_st, BigInt(129), BitVecLiteral(BigInt("000000000000000000000000000000000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111", 2), 129)), f_gen_asr_bits(v_st, BigInt(129), BigInt(8), f_gen_add_bits(v_st, BigInt(129), f_gen_mul_bits(v_st, BigInt(129), f_gen_SignExtend(v_st, BigInt(65), BigInt(129), f_gen_mul_bits(v_st, BigInt(65), f_gen_bit_lit(v_st, BigInt(65), BitVecLiteral(BigInt("00000000000000000000000000000000000000000000000000000000000000010", 2), 65)), f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, f_gen_load(v_st, v_Exp98__2), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_int_lit(v_st, BigInt(129))), f_gen_SignExtend(v_st, BigInt(64), BigInt(129), f_gen_slice(v_st, f_gen_load(v_st, v_Exp101__2), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(129)))), f_gen_bit_lit(v_st, BigInt(129), f_ZeroExtend(v_st, BigInt(64), BigInt(129), v_If102__1.v, BigInt(129)))), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("01000000", 2), 8)))))
}
def v_split_expr_47724 (v_st: LiftState,v_Exp101__2: RTSym,v_Exp98__2: RTSym,v_If102__1: Mutable[BitVecLiteral])  = {
  f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(129), f_gen_asr_bits(v_st, BigInt(129), BigInt(8), f_gen_add_bits(v_st, BigInt(129), f_gen_mul_bits(v_st, BigInt(129), f_gen_SignExtend(v_st, BigInt(65), BigInt(129), f_gen_mul_bits(v_st, BigInt(65), f_gen_bit_lit(v_st, BigInt(65), BitVecLiteral(BigInt("00000000000000000000000000000000000000000000000000000000000000010", 2), 65)), f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, f_gen_load(v_st, v_Exp98__2), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_int_lit(v_st, BigInt(129))), f_gen_SignExtend(v_st, BigInt(64), BigInt(129), f_gen_slice(v_st, f_gen_load(v_st, v_Exp101__2), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(129)))), f_gen_bit_lit(v_st, BigInt(129), f_ZeroExtend(v_st, BigInt(64), BigInt(129), v_If102__1.v, BigInt(129)))), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("01000000", 2), 8))), f_gen_bit_lit(v_st, BigInt(129), BitVecLiteral(BigInt("111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000000000000000000000000000000000000000", 2), 129))))
}
def v_split_expr_47725 (v_st: LiftState,v_Exp101__2: RTSym,v_Exp98__2: RTSym,v_If102__1: Mutable[BitVecLiteral])  = {
  f_gen_slice(v_st, f_gen_slice(v_st, f_gen_asr_bits(v_st, BigInt(129), BigInt(8), f_gen_add_bits(v_st, BigInt(129), f_gen_mul_bits(v_st, BigInt(129), f_gen_SignExtend(v_st, BigInt(65), BigInt(129), f_gen_mul_bits(v_st, BigInt(65), f_gen_bit_lit(v_st, BigInt(65), BitVecLiteral(BigInt("00000000000000000000000000000000000000000000000000000000000000010", 2), 65)), f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, f_gen_load(v_st, v_Exp98__2), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_int_lit(v_st, BigInt(129))), f_gen_SignExtend(v_st, BigInt(64), BigInt(129), f_gen_slice(v_st, f_gen_load(v_st, v_Exp101__2), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(129)))), f_gen_bit_lit(v_st, BigInt(129), f_ZeroExtend(v_st, BigInt(64), BigInt(129), v_If102__1.v, BigInt(129)))), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("01000000", 2), 8))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))
}
def v_split_expr_47726 (v_st: LiftState)  = {
  f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_47727 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))
}
def v_split_expr_47728 (v_st: LiftState,v_enc: BitVecLiteral)  = {
  f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_47729 (v_st: LiftState,v_SignedSatQ109__2: RTSym)  = {
  f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_SignedSatQ109__2), f_gen_int_lit(v_st, BigInt(128)))
}
def v_split_expr_47730 (v_st: LiftState,v_Exp101__2: RTSym,v_Exp98__2: RTSym,v_If102__1: Mutable[BitVecLiteral])  = {
  v_split_expr_47723(v_st, v_Exp101__2, v_Exp98__2, v_If102__1)
}
def v_split_expr_47731 (v_st: LiftState,v_Exp101__2: RTSym,v_Exp98__2: RTSym,v_If102__1: Mutable[BitVecLiteral])  = {
  v_split_expr_47724(v_st, v_Exp101__2, v_Exp98__2, v_If102__1)
}
def v_split_expr_47732 (v_st: LiftState,v_Exp101__2: RTSym,v_Exp98__2: RTSym,v_If102__1: Mutable[BitVecLiteral])  = {
  v_split_expr_47725(v_st, v_Exp101__2, v_Exp98__2, v_If102__1)
}
def v_split_expr_47734 (v_st: LiftState,v_Exp68__2: RTSym,v_Exp71__2: RTSym,v_If72__1: Mutable[BitVecLiteral])  = {
  v_split_expr_47710(v_st, v_Exp68__2, v_Exp71__2, v_If72__1)
}
def v_split_expr_47735 (v_st: LiftState,v_Exp68__2: RTSym,v_Exp71__2: RTSym,v_If72__1: Mutable[BitVecLiteral])  = {
  v_split_expr_47711(v_st, v_Exp68__2, v_Exp71__2, v_If72__1)
}
def v_split_expr_47736 (v_st: LiftState,v_Exp68__2: RTSym,v_Exp71__2: RTSym,v_If72__1: Mutable[BitVecLiteral])  = {
  v_split_expr_47712(v_st, v_Exp68__2, v_Exp71__2, v_If72__1)
}
def v_split_expr_47738 (v_st: LiftState,v_Exp38__2: RTSym,v_Exp41__2: RTSym,v_If42__1: Mutable[BitVecLiteral])  = {
  v_split_expr_47697(v_st, v_Exp38__2, v_Exp41__2, v_If42__1)
}
def v_split_expr_47739 (v_st: LiftState,v_Exp38__2: RTSym,v_Exp41__2: RTSym,v_If42__1: Mutable[BitVecLiteral])  = {
  v_split_expr_47698(v_st, v_Exp38__2, v_Exp41__2, v_If42__1)
}
def v_split_expr_47740 (v_st: LiftState,v_Exp38__2: RTSym,v_Exp41__2: RTSym,v_If42__1: Mutable[BitVecLiteral])  = {
  v_split_expr_47699(v_st, v_Exp38__2, v_Exp41__2, v_If42__1)
}
def v_split_expr_47742 (v_st: LiftState,v_Exp11__2: RTSym,v_Exp8__2: RTSym,v_If12__1: Mutable[BitVecLiteral])  = {
  v_split_expr_47684(v_st, v_Exp11__2, v_Exp8__2, v_If12__1)
}
def v_split_expr_47743 (v_st: LiftState,v_Exp11__2: RTSym,v_Exp8__2: RTSym,v_If12__1: Mutable[BitVecLiteral])  = {
  v_split_expr_47685(v_st, v_Exp11__2, v_Exp8__2, v_If12__1)
}
def v_split_expr_47744 (v_st: LiftState,v_Exp11__2: RTSym,v_Exp8__2: RTSym,v_If12__1: Mutable[BitVecLiteral])  = {
  v_split_expr_47686(v_st, v_Exp11__2, v_Exp8__2, v_If12__1)
}
def v_split_fun_47733 (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  assert (v_split_expr_47718(v_st, v_enc))
  val v_Exp98__2 : RTSym = f_decl_bv(v_st, "Exp98__2", BigInt(128)) 
  f_gen_store (v_st,v_Exp98__2,v_split_expr_47719(v_st, v_enc))
  assert (v_split_expr_47720(v_st, v_enc))
  val v_Exp101__2 : RTSym = f_decl_bv(v_st, "Exp101__2", BigInt(128)) 
  f_gen_store (v_st,v_Exp101__2,v_split_expr_47721(v_st, v_enc))
  val v_If102__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(64)))
  if (v_split_expr_47722(v_st, v_enc)) then {
    v_If102__1.v = BitVecLiteral(BigInt("1000000000000000000000000000000000000000000000000000000000000000", 2), 64)
  } else {
    v_If102__1.v = BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)
  }
  val v_SignedSatQ109__2 : RTSym = f_decl_bv(v_st, "SignedSatQ109__2", BigInt(64)) 
  val v_SignedSatQ110__2 : RTSym = f_decl_bool(v_st, "SignedSatQ110__2") 
  val v_temp27 = Mutable[RTLabel](rTLabelDefault)
  val v_temp28 = Mutable[RTLabel](rTLabelDefault)
  val v_temp29 = Mutable[RTLabel](rTLabelDefault)
  val (tmp47747,tmp47748,tmp47749) = v_split_expr_47730(v_st, v_Exp101__2, v_Exp98__2, v_If102__1) 
  v_temp27.v = tmp47747
  v_temp28.v = tmp47748
  v_temp29.v = tmp47749
  f_switch_context (v_st,v_temp27.v)
  f_gen_store (v_st,v_SignedSatQ109__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0111111111111111111111111111111111111111111111111111111111111111", 2), 64)))
  f_gen_store (v_st,v_SignedSatQ110__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,v_temp28.v)
  val v_temp30 = Mutable[RTLabel](rTLabelDefault)
  val v_temp31 = Mutable[RTLabel](rTLabelDefault)
  val v_temp32 = Mutable[RTLabel](rTLabelDefault)
  val (tmp47750,tmp47751,tmp47752) = v_split_expr_47731(v_st, v_Exp101__2, v_Exp98__2, v_If102__1) 
  v_temp30.v = tmp47750
  v_temp31.v = tmp47751
  v_temp32.v = tmp47752
  f_switch_context (v_st,v_temp30.v)
  f_gen_store (v_st,v_SignedSatQ109__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("1000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
  f_gen_store (v_st,v_SignedSatQ110__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,v_temp31.v)
  f_gen_store (v_st,v_SignedSatQ109__2,v_split_expr_47732(v_st, v_Exp101__2, v_Exp98__2, v_If102__1))
  f_gen_store (v_st,v_SignedSatQ110__2,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,v_temp32.v)
  f_switch_context (v_st,v_temp29.v)
  val v_temp33 = Mutable[RTLabel](rTLabelDefault)
  val v_temp34 = Mutable[RTLabel](rTLabelDefault)
  val v_temp35 = Mutable[RTLabel](rTLabelDefault)
  val (tmp47753,tmp47754,tmp47755) = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ110__2)) 
  v_temp33.v = tmp47753
  v_temp34.v = tmp47754
  v_temp35.v = tmp47755
  f_switch_context (v_st,v_temp33.v)
  f_gen_store (v_st,v_FPSR.v,v_split_expr_47726(v_st))
  f_switch_context (v_st,v_temp34.v)
  f_switch_context (v_st,v_temp35.v)
  assert (v_split_expr_47727(v_st, v_enc))
  f_gen_array_store (v_st,v__Z.v,v_split_expr_47728(v_st, v_enc),v_split_expr_47729(v_st, v_SignedSatQ109__2))
}
def v_split_fun_47737 (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  assert (v_split_expr_47705(v_st, v_enc))
  val v_Exp68__2 : RTSym = f_decl_bv(v_st, "Exp68__2", BigInt(128)) 
  f_gen_store (v_st,v_Exp68__2,v_split_expr_47706(v_st, v_enc))
  assert (v_split_expr_47707(v_st, v_enc))
  val v_Exp71__2 : RTSym = f_decl_bv(v_st, "Exp71__2", BigInt(128)) 
  f_gen_store (v_st,v_Exp71__2,v_split_expr_47708(v_st, v_enc))
  val v_If72__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(32)))
  if (v_split_expr_47709(v_st, v_enc)) then {
    v_If72__1.v = BitVecLiteral(BigInt("10000000000000000000000000000000", 2), 32)
  } else {
    v_If72__1.v = BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)
  }
  val v_SignedSatQ79__2 : RTSym = f_decl_bv(v_st, "SignedSatQ79__2", BigInt(32)) 
  val v_SignedSatQ80__2 : RTSym = f_decl_bool(v_st, "SignedSatQ80__2") 
  val v_temp18 = Mutable[RTLabel](rTLabelDefault)
  val v_temp19 = Mutable[RTLabel](rTLabelDefault)
  val v_temp20 = Mutable[RTLabel](rTLabelDefault)
  val (tmp47756,tmp47757,tmp47758) = v_split_expr_47734(v_st, v_Exp68__2, v_Exp71__2, v_If72__1) 
  v_temp18.v = tmp47756
  v_temp19.v = tmp47757
  v_temp20.v = tmp47758
  f_switch_context (v_st,v_temp18.v)
  f_gen_store (v_st,v_SignedSatQ79__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("01111111111111111111111111111111", 2), 32)))
  f_gen_store (v_st,v_SignedSatQ80__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,v_temp19.v)
  val v_temp21 = Mutable[RTLabel](rTLabelDefault)
  val v_temp22 = Mutable[RTLabel](rTLabelDefault)
  val v_temp23 = Mutable[RTLabel](rTLabelDefault)
  val (tmp47759,tmp47760,tmp47761) = v_split_expr_47735(v_st, v_Exp68__2, v_Exp71__2, v_If72__1) 
  v_temp21.v = tmp47759
  v_temp22.v = tmp47760
  v_temp23.v = tmp47761
  f_switch_context (v_st,v_temp21.v)
  f_gen_store (v_st,v_SignedSatQ79__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("10000000000000000000000000000000", 2), 32)))
  f_gen_store (v_st,v_SignedSatQ80__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,v_temp22.v)
  f_gen_store (v_st,v_SignedSatQ79__2,v_split_expr_47736(v_st, v_Exp68__2, v_Exp71__2, v_If72__1))
  f_gen_store (v_st,v_SignedSatQ80__2,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,v_temp23.v)
  f_switch_context (v_st,v_temp20.v)
  val v_temp24 = Mutable[RTLabel](rTLabelDefault)
  val v_temp25 = Mutable[RTLabel](rTLabelDefault)
  val v_temp26 = Mutable[RTLabel](rTLabelDefault)
  val (tmp47762,tmp47763,tmp47764) = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ80__2)) 
  v_temp24.v = tmp47762
  v_temp25.v = tmp47763
  v_temp26.v = tmp47764
  f_switch_context (v_st,v_temp24.v)
  f_gen_store (v_st,v_FPSR.v,v_split_expr_47713(v_st))
  f_switch_context (v_st,v_temp25.v)
  f_switch_context (v_st,v_temp26.v)
  assert (v_split_expr_47714(v_st, v_enc))
  f_gen_array_store (v_st,v__Z.v,v_split_expr_47715(v_st, v_enc),v_split_expr_47716(v_st, v_SignedSatQ79__2))
}
def v_split_fun_47741 (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  assert (v_split_expr_47692(v_st, v_enc))
  val v_Exp38__2 : RTSym = f_decl_bv(v_st, "Exp38__2", BigInt(128)) 
  f_gen_store (v_st,v_Exp38__2,v_split_expr_47693(v_st, v_enc))
  assert (v_split_expr_47694(v_st, v_enc))
  val v_Exp41__2 : RTSym = f_decl_bv(v_st, "Exp41__2", BigInt(128)) 
  f_gen_store (v_st,v_Exp41__2,v_split_expr_47695(v_st, v_enc))
  val v_If42__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(16)))
  if (v_split_expr_47696(v_st, v_enc)) then {
    v_If42__1.v = BitVecLiteral(BigInt("1000000000000000", 2), 16)
  } else {
    v_If42__1.v = BitVecLiteral(BigInt("0000000000000000", 2), 16)
  }
  val v_SignedSatQ49__2 : RTSym = f_decl_bv(v_st, "SignedSatQ49__2", BigInt(16)) 
  val v_SignedSatQ50__2 : RTSym = f_decl_bool(v_st, "SignedSatQ50__2") 
  val v_temp9 = Mutable[RTLabel](rTLabelDefault)
  val v_temp10 = Mutable[RTLabel](rTLabelDefault)
  val v_temp11 = Mutable[RTLabel](rTLabelDefault)
  val (tmp47765,tmp47766,tmp47767) = v_split_expr_47738(v_st, v_Exp38__2, v_Exp41__2, v_If42__1) 
  v_temp9.v = tmp47765
  v_temp10.v = tmp47766
  v_temp11.v = tmp47767
  f_switch_context (v_st,v_temp9.v)
  f_gen_store (v_st,v_SignedSatQ49__2,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0111111111111111", 2), 16)))
  f_gen_store (v_st,v_SignedSatQ50__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,v_temp10.v)
  val v_temp12 = Mutable[RTLabel](rTLabelDefault)
  val v_temp13 = Mutable[RTLabel](rTLabelDefault)
  val v_temp14 = Mutable[RTLabel](rTLabelDefault)
  val (tmp47768,tmp47769,tmp47770) = v_split_expr_47739(v_st, v_Exp38__2, v_Exp41__2, v_If42__1) 
  v_temp12.v = tmp47768
  v_temp13.v = tmp47769
  v_temp14.v = tmp47770
  f_switch_context (v_st,v_temp12.v)
  f_gen_store (v_st,v_SignedSatQ49__2,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1000000000000000", 2), 16)))
  f_gen_store (v_st,v_SignedSatQ50__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,v_temp13.v)
  f_gen_store (v_st,v_SignedSatQ49__2,v_split_expr_47740(v_st, v_Exp38__2, v_Exp41__2, v_If42__1))
  f_gen_store (v_st,v_SignedSatQ50__2,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,v_temp14.v)
  f_switch_context (v_st,v_temp11.v)
  val v_temp15 = Mutable[RTLabel](rTLabelDefault)
  val v_temp16 = Mutable[RTLabel](rTLabelDefault)
  val v_temp17 = Mutable[RTLabel](rTLabelDefault)
  val (tmp47771,tmp47772,tmp47773) = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ50__2)) 
  v_temp15.v = tmp47771
  v_temp16.v = tmp47772
  v_temp17.v = tmp47773
  f_switch_context (v_st,v_temp15.v)
  f_gen_store (v_st,v_FPSR.v,v_split_expr_47700(v_st))
  f_switch_context (v_st,v_temp16.v)
  f_switch_context (v_st,v_temp17.v)
  assert (v_split_expr_47701(v_st, v_enc))
  f_gen_array_store (v_st,v__Z.v,v_split_expr_47702(v_st, v_enc),v_split_expr_47703(v_st, v_SignedSatQ49__2))
}
def v_split_fun_47745 (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  assert (v_split_expr_47679(v_st, v_enc))
  val v_Exp8__2 : RTSym = f_decl_bv(v_st, "Exp8__2", BigInt(128)) 
  f_gen_store (v_st,v_Exp8__2,v_split_expr_47680(v_st, v_enc))
  assert (v_split_expr_47681(v_st, v_enc))
  val v_Exp11__2 : RTSym = f_decl_bv(v_st, "Exp11__2", BigInt(128)) 
  f_gen_store (v_st,v_Exp11__2,v_split_expr_47682(v_st, v_enc))
  val v_If12__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(8)))
  if (v_split_expr_47683(v_st, v_enc)) then {
    v_If12__1.v = BitVecLiteral(BigInt("10000000", 2), 8)
  } else {
    v_If12__1.v = BitVecLiteral(BigInt("00000000", 2), 8)
  }
  val v_SignedSatQ19__2 : RTSym = f_decl_bv(v_st, "SignedSatQ19__2", BigInt(8)) 
  val v_SignedSatQ20__2 : RTSym = f_decl_bool(v_st, "SignedSatQ20__2") 
  val v_temp0 = Mutable[RTLabel](rTLabelDefault)
  val v_temp1 = Mutable[RTLabel](rTLabelDefault)
  val v_temp2 = Mutable[RTLabel](rTLabelDefault)
  val (tmp47774,tmp47775,tmp47776) = v_split_expr_47742(v_st, v_Exp11__2, v_Exp8__2, v_If12__1) 
  v_temp0.v = tmp47774
  v_temp1.v = tmp47775
  v_temp2.v = tmp47776
  f_switch_context (v_st,v_temp0.v)
  f_gen_store (v_st,v_SignedSatQ19__2,f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("01111111", 2), 8)))
  f_gen_store (v_st,v_SignedSatQ20__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,v_temp1.v)
  val v_temp3 = Mutable[RTLabel](rTLabelDefault)
  val v_temp4 = Mutable[RTLabel](rTLabelDefault)
  val v_temp5 = Mutable[RTLabel](rTLabelDefault)
  val (tmp47777,tmp47778,tmp47779) = v_split_expr_47743(v_st, v_Exp11__2, v_Exp8__2, v_If12__1) 
  v_temp3.v = tmp47777
  v_temp4.v = tmp47778
  v_temp5.v = tmp47779
  f_switch_context (v_st,v_temp3.v)
  f_gen_store (v_st,v_SignedSatQ19__2,f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("10000000", 2), 8)))
  f_gen_store (v_st,v_SignedSatQ20__2,f_gen_bool_lit(v_st, true))
  f_switch_context (v_st,v_temp4.v)
  f_gen_store (v_st,v_SignedSatQ19__2,v_split_expr_47744(v_st, v_Exp11__2, v_Exp8__2, v_If12__1))
  f_gen_store (v_st,v_SignedSatQ20__2,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,v_temp5.v)
  f_switch_context (v_st,v_temp2.v)
  val v_temp6 = Mutable[RTLabel](rTLabelDefault)
  val v_temp7 = Mutable[RTLabel](rTLabelDefault)
  val v_temp8 = Mutable[RTLabel](rTLabelDefault)
  val (tmp47780,tmp47781,tmp47782) = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ20__2)) 
  v_temp6.v = tmp47780
  v_temp7.v = tmp47781
  v_temp8.v = tmp47782
  f_switch_context (v_st,v_temp6.v)
  f_gen_store (v_st,v_FPSR.v,v_split_expr_47687(v_st))
  f_switch_context (v_st,v_temp7.v)
  f_switch_context (v_st,v_temp8.v)
  assert (v_split_expr_47688(v_st, v_enc))
  f_gen_array_store (v_st,v__Z.v,v_split_expr_47689(v_st, v_enc),v_split_expr_47690(v_st, v_SignedSatQ19__2))
}
def v_split_fun_47746 (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (v_split_expr_47691(v_st, v_enc)) then {
    v_split_fun_47741 (v_st,v_enc)
  } else {
    if (v_split_expr_47704(v_st, v_enc)) then {
      v_split_fun_47737 (v_st,v_enc)
    } else {
      if (v_split_expr_47717(v_st, v_enc)) then {
        v_split_fun_47733 (v_st,v_enc)
      } else {
        throw Exception("not supported")
      }
    }
  }
}
