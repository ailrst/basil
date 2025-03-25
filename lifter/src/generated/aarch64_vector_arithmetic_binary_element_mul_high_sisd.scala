/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_element_mul_high_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_split_expr_39059(v_st, v_enc)) then {
    v_split_fun_39125 (v_st,v_enc,v_pc)
  } else {
    v_split_fun_39126 (v_st,v_enc,v_pc)
  }
}
def v_split_expr_39059[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))
}
def v_split_expr_39060[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_39061[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_append_bits(BigInt(2), BigInt(1), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(11),BigInt(1)), v_st.bvextract(v_enc,BigInt(21),BigInt(1))), v_st.bvextract(v_enc,BigInt(20),BigInt(1)))
}
def v_split_expr_39062[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))
}
def v_split_expr_39063[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_ZeroExtend(BigInt(2), BigInt(3), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(11),BigInt(1)), v_st.bvextract(v_enc,BigInt(21),BigInt(1))), BigInt(3))
}
def v_split_expr_39064[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_39065[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
}
def v_split_expr_39066[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV)  = {
  v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_Rmhi__1.v, v_st.bvextract(v_enc,BigInt(16),BigInt(4)))))
}
def v_split_expr_39067[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))
}
def v_split_expr_39068[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp42__2: RTSym,v_Exp45__2: RTSym,v_If46__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000111111111111111", 2))), v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp42__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_load(v_Exp45__2), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_bit_lit(BigInt(64), v_st.f_ZeroExtend(BigInt(16), BigInt(64), v_If46__1.v, BigInt(64)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2))))))
}
def v_split_expr_39069[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp42__2: RTSym,v_Exp45__2: RTSym,v_If46__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp42__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_load(v_Exp45__2), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_bit_lit(BigInt(64), v_st.f_ZeroExtend(BigInt(16), BigInt(64), v_If46__1.v, BigInt(64)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2)))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("1111111111111111111111111111111111111111111111111000000000000000", 2)))))
}
def v_split_expr_39070[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp42__2: RTSym,v_Exp45__2: RTSym,v_If46__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp42__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_load(v_Exp45__2), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_bit_lit(BigInt(64), v_st.f_ZeroExtend(BigInt(16), BigInt(64), v_If46__1.v, BigInt(64)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16))
}
def v_split_expr_39071[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_39072[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_39073[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_SignedSatQ55__2: RTSym)  = {
  v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_st.f_gen_load(v_SignedSatQ55__2), v_st.f_gen_int_lit(BigInt(128)))
}
def v_split_expr_39074[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
}
def v_split_expr_39075[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV)  = {
  v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_Rmhi__1.v, v_st.bvextract(v_enc,BigInt(16),BigInt(4)))))
}
def v_split_expr_39076[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))
}
def v_split_expr_39077[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_index__1: Mutable[BV])  = {
  ((true) && (v_st.f_sle_bits(BigInt(32), v_st.f_ZeroExtend(BigInt(16), BigInt(32), v_st.f_add_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000000100000", 2))), BigInt(32)), v_st.mkBits(32, BigInt("00000000000000000000000010000000", 2)))))
}
def v_split_expr_39078[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp74__2: RTSym,v_Exp77__2: RTSym,v_If78__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111111111111111111", 2))), v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp74__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_load(v_Exp77__2), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128)))), v_st.f_gen_bit_lit(BigInt(128), v_st.f_ZeroExtend(BigInt(32), BigInt(128), v_If78__1.v, BigInt(128)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2))))))
}
def v_split_expr_39079[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp74__2: RTSym,v_Exp77__2: RTSym,v_If78__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp74__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_load(v_Exp77__2), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128)))), v_st.f_gen_bit_lit(BigInt(128), v_st.f_ZeroExtend(BigInt(32), BigInt(128), v_If78__1.v, BigInt(128)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2)))), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000", 2)))))
}
def v_split_expr_39080[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp74__2: RTSym,v_Exp77__2: RTSym,v_If78__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp74__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_load(v_Exp77__2), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128)))), v_st.f_gen_bit_lit(BigInt(128), v_st.f_ZeroExtend(BigInt(32), BigInt(128), v_If78__1.v, BigInt(128)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))
}
def v_split_expr_39081[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_39082[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_39083[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_SignedSatQ87__2: RTSym)  = {
  v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_SignedSatQ87__2), v_st.f_gen_int_lit(BigInt(128)))
}
def v_split_expr_39084[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp42__2: RTSym,v_Exp45__2: RTSym,v_If46__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_39068(v_st, v_Exp42__2, v_Exp45__2, v_If46__1, v_index__1)
}
def v_split_expr_39085[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp42__2: RTSym,v_Exp45__2: RTSym,v_If46__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_39069(v_st, v_Exp42__2, v_Exp45__2, v_If46__1, v_index__1)
}
def v_split_expr_39086[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp42__2: RTSym,v_Exp45__2: RTSym,v_If46__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_39070(v_st, v_Exp42__2, v_Exp45__2, v_If46__1, v_index__1)
}
def v_split_expr_39088[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp74__2: RTSym,v_Exp77__2: RTSym,v_If78__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_39078(v_st, v_Exp74__2, v_Exp77__2, v_If78__1, v_index__1)
}
def v_split_expr_39089[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp74__2: RTSym,v_Exp77__2: RTSym,v_If78__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_39079(v_st, v_Exp74__2, v_Exp77__2, v_If78__1, v_index__1)
}
def v_split_expr_39090[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp74__2: RTSym,v_Exp77__2: RTSym,v_If78__1: Mutable[BV],v_index__1: Mutable[BV])  = {
  v_split_expr_39080(v_st, v_Exp74__2, v_Exp77__2, v_If78__1, v_index__1)
}
def v_split_expr_39092[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_39093[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_append_bits(BigInt(2), BigInt(1), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(11),BigInt(1)), v_st.bvextract(v_enc,BigInt(21),BigInt(1))), v_st.bvextract(v_enc,BigInt(20),BigInt(1)))
}
def v_split_expr_39094[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))
}
def v_split_expr_39095[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_ZeroExtend(BigInt(2), BigInt(3), v_st.f_append_bits(BigInt(1), BigInt(1), v_st.bvextract(v_enc,BigInt(11),BigInt(1)), v_st.bvextract(v_enc,BigInt(21),BigInt(1))), BigInt(3))
}
def v_split_expr_39096[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_39097[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
}
def v_split_expr_39098[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV)  = {
  v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_Rmhi__1_1.v, v_st.bvextract(v_enc,BigInt(16),BigInt(4)))))
}
def v_split_expr_39099[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))
}
def v_split_expr_39100[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_index__1_1: Mutable[BV])  = {
  ((true) && (v_st.f_sle_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_add_bits(BigInt(8), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000001000000", 2)))))
}
def v_split_expr_39101[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp176__2: RTSym,v_Exp179__2: RTSym,v_If180__1: Mutable[BV],v_index__1_1: Mutable[BV])  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000111111111111111", 2))), v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp176__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_load(v_Exp179__2), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_bit_lit(BigInt(64), v_st.f_ZeroExtend(BigInt(16), BigInt(64), v_If180__1.v, BigInt(64)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2))))))
}
def v_split_expr_39102[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp176__2: RTSym,v_Exp179__2: RTSym,v_If180__1: Mutable[BV],v_index__1_1: Mutable[BV])  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp176__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_load(v_Exp179__2), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_bit_lit(BigInt(64), v_st.f_ZeroExtend(BigInt(16), BigInt(64), v_If180__1.v, BigInt(64)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2)))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("1111111111111111111111111111111111111111111111111000000000000000", 2)))))
}
def v_split_expr_39103[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp176__2: RTSym,v_Exp179__2: RTSym,v_If180__1: Mutable[BV],v_index__1_1: Mutable[BV])  = {
  v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Exp176__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_load(v_Exp179__2), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_bit_lit(BigInt(64), v_st.f_ZeroExtend(BigInt(16), BigInt(64), v_If180__1.v, BigInt(64)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16))
}
def v_split_expr_39104[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_39105[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_39106[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_SignedSatQ189__2: RTSym)  = {
  v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_st.f_gen_load(v_SignedSatQ189__2), v_st.f_gen_int_lit(BigInt(128)))
}
def v_split_expr_39107[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
}
def v_split_expr_39108[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV)  = {
  v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.f_append_bits(BigInt(1), BigInt(4), v_Rmhi__1_1.v, v_st.bvextract(v_enc,BigInt(16),BigInt(4)))))
}
def v_split_expr_39109[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000001000000000000", 2)))
}
def v_split_expr_39110[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_index__1_1: Mutable[BV])  = {
  ((true) && (v_st.f_sle_bits(BigInt(32), v_st.f_ZeroExtend(BigInt(16), BigInt(32), v_st.f_add_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000000100000", 2))), BigInt(32)), v_st.mkBits(32, BigInt("00000000000000000000000001000000", 2)))))
}
def v_split_expr_39111[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp208__2: RTSym,v_Exp211__2: RTSym,v_If212__1: Mutable[BV],v_index__1_1: Mutable[BV])  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111111111111111111", 2))), v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp208__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_load(v_Exp211__2), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128)))), v_st.f_gen_bit_lit(BigInt(128), v_st.f_ZeroExtend(BigInt(32), BigInt(128), v_If212__1.v, BigInt(128)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2))))))
}
def v_split_expr_39112[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp208__2: RTSym,v_Exp211__2: RTSym,v_If212__1: Mutable[BV],v_index__1_1: Mutable[BV])  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp208__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_load(v_Exp211__2), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128)))), v_st.f_gen_bit_lit(BigInt(128), v_st.f_ZeroExtend(BigInt(32), BigInt(128), v_If212__1.v, BigInt(128)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2)))), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000", 2)))))
}
def v_split_expr_39113[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp208__2: RTSym,v_Exp211__2: RTSym,v_If212__1: Mutable[BV],v_index__1_1: Mutable[BV])  = {
  v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp208__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_load(v_Exp211__2), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_index__1_1.v, BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128)))), v_st.f_gen_bit_lit(BigInt(128), v_st.f_ZeroExtend(BigInt(32), BigInt(128), v_If212__1.v, BigInt(128)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))
}
def v_split_expr_39114[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_39115[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_39116[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_SignedSatQ221__2: RTSym)  = {
  v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_SignedSatQ221__2), v_st.f_gen_int_lit(BigInt(128)))
}
def v_split_expr_39117[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp176__2: RTSym,v_Exp179__2: RTSym,v_If180__1: Mutable[BV],v_index__1_1: Mutable[BV])  = {
  v_split_expr_39101(v_st, v_Exp176__2, v_Exp179__2, v_If180__1, v_index__1_1)
}
def v_split_expr_39118[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp176__2: RTSym,v_Exp179__2: RTSym,v_If180__1: Mutable[BV],v_index__1_1: Mutable[BV])  = {
  v_split_expr_39102(v_st, v_Exp176__2, v_Exp179__2, v_If180__1, v_index__1_1)
}
def v_split_expr_39119[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp176__2: RTSym,v_Exp179__2: RTSym,v_If180__1: Mutable[BV],v_index__1_1: Mutable[BV])  = {
  v_split_expr_39103(v_st, v_Exp176__2, v_Exp179__2, v_If180__1, v_index__1_1)
}
def v_split_expr_39121[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp208__2: RTSym,v_Exp211__2: RTSym,v_If212__1: Mutable[BV],v_index__1_1: Mutable[BV])  = {
  v_split_expr_39111(v_st, v_Exp208__2, v_Exp211__2, v_If212__1, v_index__1_1)
}
def v_split_expr_39122[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp208__2: RTSym,v_Exp211__2: RTSym,v_If212__1: Mutable[BV],v_index__1_1: Mutable[BV])  = {
  v_split_expr_39112(v_st, v_Exp208__2, v_Exp211__2, v_If212__1, v_index__1_1)
}
def v_split_expr_39123[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Exp208__2: RTSym,v_Exp211__2: RTSym,v_If212__1: Mutable[BV],v_index__1_1: Mutable[BV])  = {
  v_split_expr_39113(v_st, v_Exp208__2, v_Exp211__2, v_If212__1, v_index__1_1)
}
def v_split_fun_39087[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV],v_pc: BV) : Unit = {
  val v_Exp42__2 : RTSym = v_st.f_decl_bv("Exp42__2", BigInt(128)) 
  v_st.f_gen_store (v_Exp42__2,v_split_expr_39065(v_st, v_enc))
  val v_Exp45__2 : RTSym = v_st.f_decl_bv("Exp45__2", BigInt(128)) 
  v_st.f_gen_store (v_Exp45__2,v_split_expr_39066(v_st, v_Rmhi__1, v_enc))
  val v_If46__1 = Mutable[BV](v_st.mkBits(BigInt(16), BigInt(0)))
  if (v_split_expr_39067(v_st, v_enc)) then {
    v_If46__1.v = v_st.mkBits(16, BigInt("1000000000000000", 2))
  } else {
    v_If46__1.v = v_st.mkBits(16, BigInt("0000000000000000", 2))
  }
  val v_SignedSatQ55__2 : RTSym = v_st.f_decl_bv("SignedSatQ55__2", BigInt(16)) 
  val v_SignedSatQ56__2 : RTSym = v_st.f_decl_bool("SignedSatQ56__2") 
  val v_temp0 : RTLabel = v_split_expr_39084(v_st, v_Exp42__2, v_Exp45__2, v_If46__1, v_index__1) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp0))
  v_st.f_gen_store (v_SignedSatQ55__2,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ56__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp0))
  val v_temp1 : RTLabel = v_split_expr_39085(v_st, v_Exp42__2, v_Exp45__2, v_If46__1, v_index__1) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp1))
  v_st.f_gen_store (v_SignedSatQ55__2,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("1000000000000000", 2))))
  v_st.f_gen_store (v_SignedSatQ56__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp1))
  v_st.f_gen_store (v_SignedSatQ55__2,v_split_expr_39086(v_st, v_Exp42__2, v_Exp45__2, v_If46__1, v_index__1))
  v_st.f_gen_store (v_SignedSatQ56__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
  val v_temp2 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ56__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp2))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_39071(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp2))
  v_st.f_gen_array_store (v_st.v__Z.v,v_split_expr_39072(v_st, v_enc),v_split_expr_39073(v_st, v_SignedSatQ55__2))
}
def v_split_fun_39091[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1: Mutable[BV],v_enc: BV,v_index__1: Mutable[BV],v_pc: BV) : Unit = {
  val v_Exp74__2 : RTSym = v_st.f_decl_bv("Exp74__2", BigInt(128)) 
  v_st.f_gen_store (v_Exp74__2,v_split_expr_39074(v_st, v_enc))
  val v_Exp77__2 : RTSym = v_st.f_decl_bv("Exp77__2", BigInt(128)) 
  v_st.f_gen_store (v_Exp77__2,v_split_expr_39075(v_st, v_Rmhi__1, v_enc))
  val v_If78__1 = Mutable[BV](v_st.mkBits(BigInt(32), BigInt(0)))
  if (v_split_expr_39076(v_st, v_enc)) then {
    v_If78__1.v = v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))
  } else {
    v_If78__1.v = v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))
  }
  assert (v_split_expr_39077(v_st, v_index__1))
  val v_SignedSatQ87__2 : RTSym = v_st.f_decl_bv("SignedSatQ87__2", BigInt(32)) 
  val v_SignedSatQ88__2 : RTSym = v_st.f_decl_bool("SignedSatQ88__2") 
  val v_temp3 : RTLabel = v_split_expr_39088(v_st, v_Exp74__2, v_Exp77__2, v_If78__1, v_index__1) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp3))
  v_st.f_gen_store (v_SignedSatQ87__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("01111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ88__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp3))
  val v_temp4 : RTLabel = v_split_expr_39089(v_st, v_Exp74__2, v_Exp77__2, v_If78__1, v_index__1) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp4))
  v_st.f_gen_store (v_SignedSatQ87__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))))
  v_st.f_gen_store (v_SignedSatQ88__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp4))
  v_st.f_gen_store (v_SignedSatQ87__2,v_split_expr_39090(v_st, v_Exp74__2, v_Exp77__2, v_If78__1, v_index__1))
  v_st.f_gen_store (v_SignedSatQ88__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp3))
  val v_temp5 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ88__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp5))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_39081(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp5))
  v_st.f_gen_array_store (v_st.v__Z.v,v_split_expr_39082(v_st, v_enc),v_split_expr_39083(v_st, v_SignedSatQ87__2))
}
def v_split_fun_39120[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV,v_index__1_1: Mutable[BV],v_pc: BV) : Unit = {
  val v_Exp176__2 : RTSym = v_st.f_decl_bv("Exp176__2", BigInt(128)) 
  v_st.f_gen_store (v_Exp176__2,v_split_expr_39097(v_st, v_enc))
  val v_Exp179__2 : RTSym = v_st.f_decl_bv("Exp179__2", BigInt(128)) 
  v_st.f_gen_store (v_Exp179__2,v_split_expr_39098(v_st, v_Rmhi__1_1, v_enc))
  val v_If180__1 = Mutable[BV](v_st.mkBits(BigInt(16), BigInt(0)))
  if (v_split_expr_39099(v_st, v_enc)) then {
    v_If180__1.v = v_st.mkBits(16, BigInt("1000000000000000", 2))
  } else {
    v_If180__1.v = v_st.mkBits(16, BigInt("0000000000000000", 2))
  }
  assert (v_split_expr_39100(v_st, v_index__1_1))
  val v_SignedSatQ189__2 : RTSym = v_st.f_decl_bv("SignedSatQ189__2", BigInt(16)) 
  val v_SignedSatQ190__2 : RTSym = v_st.f_decl_bool("SignedSatQ190__2") 
  val v_temp6 : RTLabel = v_split_expr_39117(v_st, v_Exp176__2, v_Exp179__2, v_If180__1, v_index__1_1) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp6))
  v_st.f_gen_store (v_SignedSatQ189__2,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ190__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp6))
  val v_temp7 : RTLabel = v_split_expr_39118(v_st, v_Exp176__2, v_Exp179__2, v_If180__1, v_index__1_1) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp7))
  v_st.f_gen_store (v_SignedSatQ189__2,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("1000000000000000", 2))))
  v_st.f_gen_store (v_SignedSatQ190__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp7))
  v_st.f_gen_store (v_SignedSatQ189__2,v_split_expr_39119(v_st, v_Exp176__2, v_Exp179__2, v_If180__1, v_index__1_1))
  v_st.f_gen_store (v_SignedSatQ190__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp6))
  val v_temp8 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ190__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp8))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_39104(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp8))
  v_st.f_gen_array_store (v_st.v__Z.v,v_split_expr_39105(v_st, v_enc),v_split_expr_39106(v_st, v_SignedSatQ189__2))
}
def v_split_fun_39124[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Rmhi__1_1: Mutable[BV],v_enc: BV,v_index__1_1: Mutable[BV],v_pc: BV) : Unit = {
  val v_Exp208__2 : RTSym = v_st.f_decl_bv("Exp208__2", BigInt(128)) 
  v_st.f_gen_store (v_Exp208__2,v_split_expr_39107(v_st, v_enc))
  val v_Exp211__2 : RTSym = v_st.f_decl_bv("Exp211__2", BigInt(128)) 
  v_st.f_gen_store (v_Exp211__2,v_split_expr_39108(v_st, v_Rmhi__1_1, v_enc))
  val v_If212__1 = Mutable[BV](v_st.mkBits(BigInt(32), BigInt(0)))
  if (v_split_expr_39109(v_st, v_enc)) then {
    v_If212__1.v = v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))
  } else {
    v_If212__1.v = v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))
  }
  assert (v_split_expr_39110(v_st, v_index__1_1))
  val v_SignedSatQ221__2 : RTSym = v_st.f_decl_bv("SignedSatQ221__2", BigInt(32)) 
  val v_SignedSatQ222__2 : RTSym = v_st.f_decl_bool("SignedSatQ222__2") 
  val v_temp9 : RTLabel = v_split_expr_39121(v_st, v_Exp208__2, v_Exp211__2, v_If212__1, v_index__1_1) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp9))
  v_st.f_gen_store (v_SignedSatQ221__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("01111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ222__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp9))
  val v_temp10 : RTLabel = v_split_expr_39122(v_st, v_Exp208__2, v_Exp211__2, v_If212__1, v_index__1_1) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp10))
  v_st.f_gen_store (v_SignedSatQ221__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))))
  v_st.f_gen_store (v_SignedSatQ222__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp10))
  v_st.f_gen_store (v_SignedSatQ221__2,v_split_expr_39123(v_st, v_Exp208__2, v_Exp211__2, v_If212__1, v_index__1_1))
  v_st.f_gen_store (v_SignedSatQ222__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp9))
  val v_temp11 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ222__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp11))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_39114(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp11))
  v_st.f_gen_array_store (v_st.v__Z.v,v_split_expr_39115(v_st, v_enc),v_split_expr_39116(v_st, v_SignedSatQ221__2))
}
def v_split_fun_39125[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_index__1 = Mutable[BV](v_st.mkBits(BigInt(3), BigInt(0)))
  val v_Rmhi__1 = Mutable[BV](v_st.mkBits(BigInt(1), BigInt(0)))
  if (v_split_expr_39060(v_st, v_enc)) then {
    v_index__1.v = v_split_expr_39061(v_st, v_enc)
    v_Rmhi__1.v = v_st.mkBits(1, BigInt("0", 2))
  } else {
    if (v_split_expr_39062(v_st, v_enc)) then {
      v_index__1.v = v_split_expr_39063(v_st, v_enc)
      v_Rmhi__1.v = v_st.bvextract(v_enc,BigInt(20),BigInt(1))
    } else {
      throw Exception("not supported")
    }
  }
  if (v_split_expr_39064(v_st, v_enc)) then {
    v_split_fun_39087 (v_st,v_Rmhi__1,v_enc,v_index__1,v_pc)
  } else {
    v_split_fun_39091 (v_st,v_Rmhi__1,v_enc,v_index__1,v_pc)
  }
}
def v_split_fun_39126[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_index__1_1 = Mutable[BV](v_st.mkBits(BigInt(3), BigInt(0)))
  val v_Rmhi__1_1 = Mutable[BV](v_st.mkBits(BigInt(1), BigInt(0)))
  if (v_split_expr_39092(v_st, v_enc)) then {
    v_index__1_1.v = v_split_expr_39093(v_st, v_enc)
    v_Rmhi__1_1.v = v_st.mkBits(1, BigInt("0", 2))
  } else {
    if (v_split_expr_39094(v_st, v_enc)) then {
      v_index__1_1.v = v_split_expr_39095(v_st, v_enc)
      v_Rmhi__1_1.v = v_st.bvextract(v_enc,BigInt(20),BigInt(1))
    } else {
      throw Exception("not supported")
    }
  }
  if (v_split_expr_39096(v_st, v_enc)) then {
    v_split_fun_39120 (v_st,v_Rmhi__1_1,v_enc,v_index__1_1,v_pc)
  } else {
    v_split_fun_39124 (v_st,v_Rmhi__1_1,v_enc,v_index__1_1,v_pc)
  }
}
