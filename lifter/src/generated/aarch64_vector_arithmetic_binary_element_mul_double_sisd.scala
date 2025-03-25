/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_element_mul_double_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_split_expr_38232(v_st, v_enc)) then {
    v_split_fun_38278 (v_st,v_enc,v_pc)
  } else {
    v_split_fun_38279 (v_st,v_enc,v_pc)
  }
}
def v_split_expr_38232[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))
}
def v_split_expr_38233[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_38234[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_append_bits(BigInt(2), BigInt(1), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(11),BigInt(1)), v_st.bvextract(v_enc,BigInt(21),BigInt(1))), v_st.bvextract(v_enc,BigInt(20),BigInt(1)))
}
def v_split_expr_38235[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))
}
def v_split_expr_38236[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_ZeroExtend(BigInt(2), BigInt(3), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(11),BigInt(1)), v_st.bvextract(v_enc,BigInt(21),BigInt(1))), BigInt(3))
}
def v_split_expr_38237[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_38238[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV])  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000001111111111111111111111111111111", 2))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_Rmhi__1.v, v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))))))
}
def v_split_expr_38239[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV])  = {
  v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_Rmhi__1.v, v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))), BigInt(0), BigInt(32))
}
def v_split_expr_38240[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_38241[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_38242[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_SignedSatQ53__2: RTSym)  = {
  v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_SignedSatQ53__2), v_st.f_gen_int_lit(BigInt(128)))
}
def v_split_expr_38243[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_index__1: Mutable[BV])  = {
  ((true) && (v_st.f_sle_bits(BigInt(32), v_st.f_ZeroExtend(BigInt(16), BigInt(32), v_st.f_add_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000000100000", 2))), BigInt(32)), v_st.mkBits(32, BigInt("00000000000000000000000010000000", 2)))))
}
def v_split_expr_38244[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV])  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111", 2))), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_Rmhi__1.v, v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128))))))
}
def v_split_expr_38245[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV])  = {
  v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_Rmhi__1.v, v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64))
}
def v_split_expr_38246[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_38247[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_38248[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_SignedSatQ84__2: RTSym)  = {
  v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_SignedSatQ84__2), v_st.f_gen_int_lit(BigInt(128)))
}
def v_split_expr_38249[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV])  = {
  v_split_expr_38238(v_st, v_Rmhi__1, v_enc, v_index__1)
}
def v_split_expr_38250[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV])  = {
  v_split_expr_38239(v_st, v_Rmhi__1, v_enc, v_index__1)
}
def v_split_expr_38252[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV])  = {
  v_split_expr_38244(v_st, v_Rmhi__1, v_enc, v_index__1)
}
def v_split_expr_38253[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV])  = {
  v_split_expr_38245(v_st, v_Rmhi__1, v_enc, v_index__1)
}
def v_split_expr_38255[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_38256[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_append_bits(BigInt(2), BigInt(1), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(11),BigInt(1)), v_st.bvextract(v_enc,BigInt(21),BigInt(1))), v_st.bvextract(v_enc,BigInt(20),BigInt(1)))
}
def v_split_expr_38257[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))
}
def v_split_expr_38258[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_ZeroExtend(BigInt(2), BigInt(3), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(11),BigInt(1)), v_st.bvextract(v_enc,BigInt(21),BigInt(1))), BigInt(3))
}
def v_split_expr_38259[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_38260[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_index__1_1: Mutable[BV])  = {
  ((true) && (v_st.f_sle_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_add_bits(BigInt(8), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000001000000", 2)))))
}
def v_split_expr_38261[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV,v_index__1_1: Mutable[BV])  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000001111111111111111111111111111111", 2))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_Rmhi__1_1.v, v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))))))
}
def v_split_expr_38262[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV,v_index__1_1: Mutable[BV])  = {
  v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_Rmhi__1_1.v, v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))), BigInt(0), BigInt(32))
}
def v_split_expr_38263[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_38264[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_38265[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_SignedSatQ183__2: RTSym)  = {
  v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_SignedSatQ183__2), v_st.f_gen_int_lit(BigInt(128)))
}
def v_split_expr_38266[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_index__1_1: Mutable[BV])  = {
  ((true) && (v_st.f_sle_bits(BigInt(32), v_st.f_ZeroExtend(BigInt(16), BigInt(32), v_st.f_add_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000000100000", 2))), BigInt(32)), v_st.mkBits(32, BigInt("00000000000000000000000001000000", 2)))))
}
def v_split_expr_38267[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV,v_index__1_1: Mutable[BV])  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111", 2))), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_Rmhi__1_1.v, v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128))))))
}
def v_split_expr_38268[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV,v_index__1_1: Mutable[BV])  = {
  v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_Rmhi__1_1.v, v_st.bvextract(v_enc,BigInt(16),BigInt(4))))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64))
}
def v_split_expr_38269[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_38270[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_38271[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_SignedSatQ214__2: RTSym)  = {
  v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_SignedSatQ214__2), v_st.f_gen_int_lit(BigInt(128)))
}
def v_split_expr_38272[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV,v_index__1_1: Mutable[BV])  = {
  v_split_expr_38261(v_st, v_Rmhi__1_1, v_enc, v_index__1_1)
}
def v_split_expr_38273[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV,v_index__1_1: Mutable[BV])  = {
  v_split_expr_38262(v_st, v_Rmhi__1_1, v_enc, v_index__1_1)
}
def v_split_expr_38275[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV,v_index__1_1: Mutable[BV])  = {
  v_split_expr_38267(v_st, v_Rmhi__1_1, v_enc, v_index__1_1)
}
def v_split_expr_38276[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV,v_index__1_1: Mutable[BV])  = {
  v_split_expr_38268(v_st, v_Rmhi__1_1, v_enc, v_index__1_1)
}
def v_split_fun_38251[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV],v_pc: BV) : Unit = {
  val v_SignedSatQ53__2 : RTSym = v_st.f_decl_bv("SignedSatQ53__2", BigInt(32)) 
  val v_SignedSatQ54__2 : RTSym = v_st.f_decl_bool("SignedSatQ54__2") 
  val v_temp0 : RTLabel = v_split_expr_38249(v_st, v_Rmhi__1, v_enc, v_index__1) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp0))
  v_st.f_gen_store (v_SignedSatQ53__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("01111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ54__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp0))
  v_st.f_gen_store (v_SignedSatQ53__2,v_split_expr_38250(v_st, v_Rmhi__1, v_enc, v_index__1))
  v_st.f_gen_store (v_SignedSatQ54__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
  val v_temp1 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ54__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp1))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_38240(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp1))
  v_st.f_gen_array_store (v_st.v__Z.v,v_split_expr_38241(v_st, v_enc),v_split_expr_38242(v_st, v_SignedSatQ53__2))
}
def v_split_fun_38254[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV],v_pc: BV) : Unit = {
  assert (v_split_expr_38243(v_st, v_index__1))
  val v_SignedSatQ84__2 : RTSym = v_st.f_decl_bv("SignedSatQ84__2", BigInt(64)) 
  val v_SignedSatQ85__2 : RTSym = v_st.f_decl_bool("SignedSatQ85__2") 
  val v_temp2 : RTLabel = v_split_expr_38252(v_st, v_Rmhi__1, v_enc, v_index__1) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp2))
  v_st.f_gen_store (v_SignedSatQ84__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0111111111111111111111111111111111111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ85__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp2))
  v_st.f_gen_store (v_SignedSatQ84__2,v_split_expr_38253(v_st, v_Rmhi__1, v_enc, v_index__1))
  v_st.f_gen_store (v_SignedSatQ85__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp2))
  val v_temp3 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ85__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp3))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_38246(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp3))
  v_st.f_gen_array_store (v_st.v__Z.v,v_split_expr_38247(v_st, v_enc),v_split_expr_38248(v_st, v_SignedSatQ84__2))
}
def v_split_fun_38274[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV,v_index__1_1: Mutable[BV],v_pc: BV) : Unit = {
  assert (v_split_expr_38260(v_st, v_index__1_1))
  val v_SignedSatQ183__2 : RTSym = v_st.f_decl_bv("SignedSatQ183__2", BigInt(32)) 
  val v_SignedSatQ184__2 : RTSym = v_st.f_decl_bool("SignedSatQ184__2") 
  val v_temp4 : RTLabel = v_split_expr_38272(v_st, v_Rmhi__1_1, v_enc, v_index__1_1) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp4))
  v_st.f_gen_store (v_SignedSatQ183__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("01111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ184__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp4))
  v_st.f_gen_store (v_SignedSatQ183__2,v_split_expr_38273(v_st, v_Rmhi__1_1, v_enc, v_index__1_1))
  v_st.f_gen_store (v_SignedSatQ184__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp4))
  val v_temp5 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ184__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp5))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_38263(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp5))
  v_st.f_gen_array_store (v_st.v__Z.v,v_split_expr_38264(v_st, v_enc),v_split_expr_38265(v_st, v_SignedSatQ183__2))
}
def v_split_fun_38277[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV,v_index__1_1: Mutable[BV],v_pc: BV) : Unit = {
  assert (v_split_expr_38266(v_st, v_index__1_1))
  val v_SignedSatQ214__2 : RTSym = v_st.f_decl_bv("SignedSatQ214__2", BigInt(64)) 
  val v_SignedSatQ215__2 : RTSym = v_st.f_decl_bool("SignedSatQ215__2") 
  val v_temp6 : RTLabel = v_split_expr_38275(v_st, v_Rmhi__1_1, v_enc, v_index__1_1) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp6))
  v_st.f_gen_store (v_SignedSatQ214__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0111111111111111111111111111111111111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ215__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp6))
  v_st.f_gen_store (v_SignedSatQ214__2,v_split_expr_38276(v_st, v_Rmhi__1_1, v_enc, v_index__1_1))
  v_st.f_gen_store (v_SignedSatQ215__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp6))
  val v_temp7 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ215__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp7))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_38269(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp7))
  v_st.f_gen_array_store (v_st.v__Z.v,v_split_expr_38270(v_st, v_enc),v_split_expr_38271(v_st, v_SignedSatQ214__2))
}
def v_split_fun_38278[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_index__1 = Mutable[BV](v_st.mkBits(BigInt(3), BigInt(0)))
  val v_Rmhi__1 = Mutable[BV](v_st.mkBits(BigInt(1), BigInt(0)))
  if (v_split_expr_38233(v_st, v_enc)) then {
    v_index__1.v = v_split_expr_38234(v_st, v_enc)
    v_Rmhi__1.v = v_st.mkBits(1, BigInt("0", 2))
  } else {
    if (v_split_expr_38235(v_st, v_enc)) then {
      v_index__1.v = v_split_expr_38236(v_st, v_enc)
      v_Rmhi__1.v = v_st.bvextract(v_enc,BigInt(20),BigInt(1))
    } else {
      throw Exception("not supported")
    }
  }
  if (v_split_expr_38237(v_st, v_enc)) then {
    v_split_fun_38251 (v_st,v_Rmhi__1,v_enc,v_index__1,v_pc)
  } else {
    v_split_fun_38254 (v_st,v_Rmhi__1,v_enc,v_index__1,v_pc)
  }
}
def v_split_fun_38279[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_index__1_1 = Mutable[BV](v_st.mkBits(BigInt(3), BigInt(0)))
  val v_Rmhi__1_1 = Mutable[BV](v_st.mkBits(BigInt(1), BigInt(0)))
  if (v_split_expr_38255(v_st, v_enc)) then {
    v_index__1_1.v = v_split_expr_38256(v_st, v_enc)
    v_Rmhi__1_1.v = v_st.mkBits(1, BigInt("0", 2))
  } else {
    if (v_split_expr_38257(v_st, v_enc)) then {
      v_index__1_1.v = v_split_expr_38258(v_st, v_enc)
      v_Rmhi__1_1.v = v_st.bvextract(v_enc,BigInt(20),BigInt(1))
    } else {
      throw Exception("not supported")
    }
  }
  if (v_split_expr_38259(v_st, v_enc)) then {
    v_split_fun_38274 (v_st,v_Rmhi__1_1,v_enc,v_index__1_1,v_pc)
  } else {
    v_split_fun_38277 (v_st,v_Rmhi__1_1,v_enc,v_index__1_1,v_pc)
  }
}
