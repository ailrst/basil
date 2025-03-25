/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_uniform_mul_int_doubling_accum_sisd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_split_expr_45700(v_st, v_enc)) then {
    throw Exception("not supported")
  } else {
    v_split_fun_45728 (v_st,v_enc,v_pc)
  }
}
def v_split_expr_45700[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  ((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))))
}
def v_split_expr_45701[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_45702[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))
}
def v_split_expr_45703[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000111111111111111", 2))), v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_sub_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000001000000000000000", 2)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2))))))
}
def v_split_expr_45704[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_sub_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000001000000000000000", 2)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2)))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("1111111111111111111111111111111111111111111111111000000000000000", 2)))))
}
def v_split_expr_45705[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_sub_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000001000000000000000", 2)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16))
}
def v_split_expr_45706[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_45707[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000111111111111111", 2))), v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000001000000000000000", 2)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2))))))
}
def v_split_expr_45708[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000001000000000000000", 2)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2)))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("1111111111111111111111111111111111111111111111111000000000000000", 2)))))
}
def v_split_expr_45709[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_asr_bits(BigInt(64), BigInt(16), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_add_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000001000000000000000", 2)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000010000", 2)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16))
}
def v_split_expr_45710[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_45713[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_45714[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_result__1_1: RTSym)  = {
  v_st.f_gen_ZeroExtend(BigInt(16), BigInt(128), v_st.f_gen_load(v_result__1_1), v_st.f_gen_int_lit(BigInt(128)))
}
def v_split_expr_45715[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))
}
def v_split_expr_45716[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111111111111111111", 2))), v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_sub_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))))), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000", 2)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2))))))
}
def v_split_expr_45717[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_sub_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))))), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000", 2)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2)))), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000", 2)))))
}
def v_split_expr_45718[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_sub_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))))), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000", 2)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))
}
def v_split_expr_45719[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_45720[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111111111111111111", 2))), v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))))), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000", 2)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2))))))
}
def v_split_expr_45721[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))))), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000", 2)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2)))), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000", 2)))))
}
def v_split_expr_45722[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_asr_bits(BigInt(128), BigInt(16), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_add_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))))), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000", 2)))), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000100000", 2)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))
}
def v_split_expr_45723[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_45726[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_45727[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_result__1_2: RTSym)  = {
  v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_result__1_2), v_st.f_gen_int_lit(BigInt(128)))
}
def v_split_fun_45711[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV,v_result__1_1: RTSym) : Unit = {
  val v_SignedSatQ75__2 : RTSym = v_st.f_decl_bv("SignedSatQ75__2", BigInt(16)) 
  val v_SignedSatQ76__2 : RTSym = v_st.f_decl_bool("SignedSatQ76__2") 
  val v_temp0 : RTLabel = v_split_expr_45703(v_st, v_enc) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp0))
  v_st.f_gen_store (v_SignedSatQ75__2,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ76__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp0))
  val v_temp1 : RTLabel = v_split_expr_45704(v_st, v_enc) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp1))
  v_st.f_gen_store (v_SignedSatQ75__2,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("1000000000000000", 2))))
  v_st.f_gen_store (v_SignedSatQ76__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp1))
  v_st.f_gen_store (v_SignedSatQ75__2,v_split_expr_45705(v_st, v_enc))
  v_st.f_gen_store (v_SignedSatQ76__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
  v_st.f_gen_store (v_result__1_1,v_st.f_gen_load(v_SignedSatQ75__2))
  val v_temp2 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ76__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp2))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_45706(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp2))
}
def v_split_fun_45712[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV,v_result__1_1: RTSym) : Unit = {
  val v_SignedSatQ88__2 : RTSym = v_st.f_decl_bv("SignedSatQ88__2", BigInt(16)) 
  val v_SignedSatQ89__2 : RTSym = v_st.f_decl_bool("SignedSatQ89__2") 
  val v_temp3 : RTLabel = v_split_expr_45707(v_st, v_enc) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp3))
  v_st.f_gen_store (v_SignedSatQ88__2,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ89__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp3))
  val v_temp4 : RTLabel = v_split_expr_45708(v_st, v_enc) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp4))
  v_st.f_gen_store (v_SignedSatQ88__2,v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("1000000000000000", 2))))
  v_st.f_gen_store (v_SignedSatQ89__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp4))
  v_st.f_gen_store (v_SignedSatQ88__2,v_split_expr_45709(v_st, v_enc))
  v_st.f_gen_store (v_SignedSatQ89__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp3))
  v_st.f_gen_store (v_result__1_1,v_st.f_gen_load(v_SignedSatQ88__2))
  val v_temp5 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ89__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp5))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_45710(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp5))
}
def v_split_fun_45724[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV,v_result__1_2: RTSym) : Unit = {
  val v_SignedSatQ124__2 : RTSym = v_st.f_decl_bv("SignedSatQ124__2", BigInt(32)) 
  val v_SignedSatQ125__2 : RTSym = v_st.f_decl_bool("SignedSatQ125__2") 
  val v_temp6 : RTLabel = v_split_expr_45716(v_st, v_enc) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp6))
  v_st.f_gen_store (v_SignedSatQ124__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("01111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ125__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp6))
  val v_temp7 : RTLabel = v_split_expr_45717(v_st, v_enc) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp7))
  v_st.f_gen_store (v_SignedSatQ124__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))))
  v_st.f_gen_store (v_SignedSatQ125__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp7))
  v_st.f_gen_store (v_SignedSatQ124__2,v_split_expr_45718(v_st, v_enc))
  v_st.f_gen_store (v_SignedSatQ125__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp6))
  v_st.f_gen_store (v_result__1_2,v_st.f_gen_load(v_SignedSatQ124__2))
  val v_temp8 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ125__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp8))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_45719(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp8))
}
def v_split_fun_45725[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV,v_result__1_2: RTSym) : Unit = {
  val v_SignedSatQ137__2 : RTSym = v_st.f_decl_bv("SignedSatQ137__2", BigInt(32)) 
  val v_SignedSatQ138__2 : RTSym = v_st.f_decl_bool("SignedSatQ138__2") 
  val v_temp9 : RTLabel = v_split_expr_45720(v_st, v_enc) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp9))
  v_st.f_gen_store (v_SignedSatQ137__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("01111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ138__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp9))
  val v_temp10 : RTLabel = v_split_expr_45721(v_st, v_enc) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp10))
  v_st.f_gen_store (v_SignedSatQ137__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))))
  v_st.f_gen_store (v_SignedSatQ138__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp10))
  v_st.f_gen_store (v_SignedSatQ137__2,v_split_expr_45722(v_st, v_enc))
  v_st.f_gen_store (v_SignedSatQ138__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp9))
  v_st.f_gen_store (v_result__1_2,v_st.f_gen_load(v_SignedSatQ137__2))
  val v_temp11 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ138__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp11))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_45723(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp11))
}
def v_split_fun_45728[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_split_expr_45701(v_st, v_enc)) then {
    val v_result__1_1 : RTSym = v_st.f_decl_bv("result__1_1", BigInt(16)) 
    if (v_split_expr_45702(v_st, v_enc)) then {
      v_split_fun_45711 (v_st,v_enc,v_pc,v_result__1_1)
    } else {
      v_split_fun_45712 (v_st,v_enc,v_pc,v_result__1_1)
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_split_expr_45713(v_st, v_enc),v_split_expr_45714(v_st, v_result__1_1))
  } else {
    val v_result__1_2 : RTSym = v_st.f_decl_bv("result__1_2", BigInt(32)) 
    if (v_split_expr_45715(v_st, v_enc)) then {
      v_split_fun_45724 (v_st,v_enc,v_pc,v_result__1_2)
    } else {
      v_split_fun_45725 (v_st,v_enc,v_pc,v_result__1_2)
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_split_expr_45726(v_st, v_enc),v_split_expr_45727(v_st, v_result__1_2))
  }
}
