/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_disparate_mul_double_simd[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_split_expr_34822(v_st, v_enc)) then {
    throw Exception("not supported")
  } else {
    if (v_split_expr_34823(v_st, v_enc)) then {
      v_split_fun_34859 (v_st,v_enc,v_pc)
    } else {
      v_split_fun_34860 (v_st,v_enc,v_pc)
    }
  }
}
def v_split_expr_34822[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  ((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))))
}
def v_split_expr_34823[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))
}
def v_split_expr_34824[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
}
def v_split_expr_34825[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))
}
def v_split_expr_34826[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64))
}
def v_split_expr_34827[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
}
def v_split_expr_34828[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64))
}
def v_split_expr_34829[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(64), BigInt(64))
}
def v_split_expr_34830[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Vpart_read149__2: RTSym,v_Vpart_read160__2: RTSym)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000001111111111111111111111111111111", 2))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read149__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read160__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))))))
}
def v_split_expr_34831[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Vpart_read149__2: RTSym,v_Vpart_read160__2: RTSym)  = {
  v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read149__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read160__2), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))), BigInt(0), BigInt(32))
}
def v_split_expr_34832[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_34833[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Vpart_read149__2: RTSym,v_Vpart_read160__2: RTSym)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000001111111111111111111111111111111", 2))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read149__2), BigInt(16), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read160__2), BigInt(16), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))))))
}
def v_split_expr_34834[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Vpart_read149__2: RTSym,v_Vpart_read160__2: RTSym)  = {
  v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read149__2), BigInt(16), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read160__2), BigInt(16), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))), BigInt(0), BigInt(32))
}
def v_split_expr_34835[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_34836[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Vpart_read149__2: RTSym,v_Vpart_read160__2: RTSym)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000001111111111111111111111111111111", 2))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read149__2), BigInt(32), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read160__2), BigInt(32), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))))))
}
def v_split_expr_34837[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Vpart_read149__2: RTSym,v_Vpart_read160__2: RTSym)  = {
  v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read149__2), BigInt(32), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read160__2), BigInt(32), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))), BigInt(0), BigInt(32))
}
def v_split_expr_34838[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_34839[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Vpart_read149__2: RTSym,v_Vpart_read160__2: RTSym)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000001111111111111111111111111111111", 2))), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read149__2), BigInt(48), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read160__2), BigInt(48), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))))))
}
def v_split_expr_34840[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Vpart_read149__2: RTSym,v_Vpart_read160__2: RTSym)  = {
  v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_mul_bits(BigInt(32), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read149__2), BigInt(48), BigInt(16)), v_st.f_gen_int_lit(BigInt(32)))), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(16), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read160__2), BigInt(48), BigInt(16)), v_st.f_gen_int_lit(BigInt(64))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))), BigInt(0), BigInt(32))
}
def v_split_expr_34841[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_34842[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_34843[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_SignedSatQ175__2: RTSym,v_SignedSatQ190__2: RTSym,v_SignedSatQ204__2: RTSym,v_SignedSatQ218__2: RTSym)  = {
  v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_load(v_SignedSatQ218__2), v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_st.f_gen_load(v_SignedSatQ204__2), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_SignedSatQ190__2), v_st.f_gen_load(v_SignedSatQ175__2))))
}
def v_split_expr_34844[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
}
def v_split_expr_34845[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))
}
def v_split_expr_34846[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64))
}
def v_split_expr_34847[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
}
def v_split_expr_34848[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64))
}
def v_split_expr_34849[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(64), BigInt(64))
}
def v_split_expr_34850[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Vpart_read235__2: RTSym,v_Vpart_read246__2: RTSym)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111", 2))), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read235__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read246__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128))))))
}
def v_split_expr_34851[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Vpart_read235__2: RTSym,v_Vpart_read246__2: RTSym)  = {
  v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read235__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read246__2), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64))
}
def v_split_expr_34852[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_34853[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Vpart_read235__2: RTSym,v_Vpart_read246__2: RTSym)  = {
  v_st.f_gen_branch(v_st.f_gen_slt_bits(BigInt(128), v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111", 2))), v_st.f_gen_mul_bits(BigInt(128), v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read235__2), BigInt(32), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read246__2), BigInt(32), BigInt(32)), v_st.f_gen_int_lit(BigInt(128))))))
}
def v_split_expr_34854[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_Vpart_read235__2: RTSym,v_Vpart_read246__2: RTSym)  = {
  v_st.f_gen_slice(v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(64), BigInt(128), v_st.f_gen_mul_bits(BigInt(64), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000010", 2))), v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read235__2), BigInt(32), BigInt(32)), v_st.f_gen_int_lit(BigInt(64)))), v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_SignExtend(BigInt(32), BigInt(128), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read246__2), BigInt(32), BigInt(32)), v_st.f_gen_int_lit(BigInt(128))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64))
}
def v_split_expr_34855[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV])  = {
  v_st.f_gen_append_bits(BigInt(4), BigInt(28), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(28), BigInt(4)), v_st.f_gen_append_bits(BigInt(1), BigInt(27), v_st.f_gen_bit_lit(BigInt(1), v_st.mkBits(1, BigInt("1", 2))), v_st.f_gen_slice(v_st.f_gen_load(v_st.v_FPSR.v), BigInt(0), BigInt(27))))
}
def v_split_expr_34856[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV)  = {
  v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_34857[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_SignedSatQ261__2: RTSym,v_SignedSatQ276__2: RTSym)  = {
  v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_load(v_SignedSatQ276__2), v_st.f_gen_load(v_SignedSatQ261__2))
}
def v_split_expr_34858[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_SignedSatQ175__2: RTSym,v_SignedSatQ190__2: RTSym,v_SignedSatQ204__2: RTSym,v_SignedSatQ218__2: RTSym)  = {
  v_split_expr_34843(v_st, v_SignedSatQ175__2, v_SignedSatQ190__2, v_SignedSatQ204__2, v_SignedSatQ218__2)
}
def v_split_fun_34859[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_Vpart_read149__2 : RTSym = v_st.f_decl_bv("Vpart.read149__2", BigInt(64)) 
  if (v_split_expr_34824(v_st, v_enc)) then {
    v_st.f_gen_store (v_Vpart_read149__2,v_split_expr_34825(v_st, v_enc))
  } else {
    v_st.f_gen_store (v_Vpart_read149__2,v_split_expr_34826(v_st, v_enc))
  }
  val v_Vpart_read160__2 : RTSym = v_st.f_decl_bv("Vpart.read160__2", BigInt(64)) 
  if (v_split_expr_34827(v_st, v_enc)) then {
    v_st.f_gen_store (v_Vpart_read160__2,v_split_expr_34828(v_st, v_enc))
  } else {
    v_st.f_gen_store (v_Vpart_read160__2,v_split_expr_34829(v_st, v_enc))
  }
  val v_SignedSatQ175__2 : RTSym = v_st.f_decl_bv("SignedSatQ175__2", BigInt(32)) 
  val v_SignedSatQ176__2 : RTSym = v_st.f_decl_bool("SignedSatQ176__2") 
  val v_temp0 : RTLabel = v_split_expr_34830(v_st, v_Vpart_read149__2, v_Vpart_read160__2) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp0))
  v_st.f_gen_store (v_SignedSatQ175__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("01111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ176__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp0))
  v_st.f_gen_store (v_SignedSatQ175__2,v_split_expr_34831(v_st, v_Vpart_read149__2, v_Vpart_read160__2))
  v_st.f_gen_store (v_SignedSatQ176__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
  val v_temp1 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ176__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp1))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_34832(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp1))
  val v_SignedSatQ190__2 : RTSym = v_st.f_decl_bv("SignedSatQ190__2", BigInt(32)) 
  val v_SignedSatQ191__2 : RTSym = v_st.f_decl_bool("SignedSatQ191__2") 
  val v_temp2 : RTLabel = v_split_expr_34833(v_st, v_Vpart_read149__2, v_Vpart_read160__2) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp2))
  v_st.f_gen_store (v_SignedSatQ190__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("01111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ191__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp2))
  v_st.f_gen_store (v_SignedSatQ190__2,v_split_expr_34834(v_st, v_Vpart_read149__2, v_Vpart_read160__2))
  v_st.f_gen_store (v_SignedSatQ191__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp2))
  val v_temp3 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ191__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp3))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_34835(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp3))
  val v_SignedSatQ204__2 : RTSym = v_st.f_decl_bv("SignedSatQ204__2", BigInt(32)) 
  val v_SignedSatQ205__2 : RTSym = v_st.f_decl_bool("SignedSatQ205__2") 
  val v_temp4 : RTLabel = v_split_expr_34836(v_st, v_Vpart_read149__2, v_Vpart_read160__2) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp4))
  v_st.f_gen_store (v_SignedSatQ204__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("01111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ205__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp4))
  v_st.f_gen_store (v_SignedSatQ204__2,v_split_expr_34837(v_st, v_Vpart_read149__2, v_Vpart_read160__2))
  v_st.f_gen_store (v_SignedSatQ205__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp4))
  val v_temp5 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ205__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp5))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_34838(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp5))
  val v_SignedSatQ218__2 : RTSym = v_st.f_decl_bv("SignedSatQ218__2", BigInt(32)) 
  val v_SignedSatQ219__2 : RTSym = v_st.f_decl_bool("SignedSatQ219__2") 
  val v_temp6 : RTLabel = v_split_expr_34839(v_st, v_Vpart_read149__2, v_Vpart_read160__2) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp6))
  v_st.f_gen_store (v_SignedSatQ218__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("01111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ219__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp6))
  v_st.f_gen_store (v_SignedSatQ218__2,v_split_expr_34840(v_st, v_Vpart_read149__2, v_Vpart_read160__2))
  v_st.f_gen_store (v_SignedSatQ219__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp6))
  val v_temp7 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ219__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp7))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_34841(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp7))
  v_st.f_gen_array_store (v_st.v__Z.v,v_split_expr_34842(v_st, v_enc),v_split_expr_34858(v_st, v_SignedSatQ175__2, v_SignedSatQ190__2, v_SignedSatQ204__2, v_SignedSatQ218__2))
}
def v_split_fun_34860[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  val v_Vpart_read235__2 : RTSym = v_st.f_decl_bv("Vpart.read235__2", BigInt(64)) 
  if (v_split_expr_34844(v_st, v_enc)) then {
    v_st.f_gen_store (v_Vpart_read235__2,v_split_expr_34845(v_st, v_enc))
  } else {
    v_st.f_gen_store (v_Vpart_read235__2,v_split_expr_34846(v_st, v_enc))
  }
  val v_Vpart_read246__2 : RTSym = v_st.f_decl_bv("Vpart.read246__2", BigInt(64)) 
  if (v_split_expr_34847(v_st, v_enc)) then {
    v_st.f_gen_store (v_Vpart_read246__2,v_split_expr_34848(v_st, v_enc))
  } else {
    v_st.f_gen_store (v_Vpart_read246__2,v_split_expr_34849(v_st, v_enc))
  }
  val v_SignedSatQ261__2 : RTSym = v_st.f_decl_bv("SignedSatQ261__2", BigInt(64)) 
  val v_SignedSatQ262__2 : RTSym = v_st.f_decl_bool("SignedSatQ262__2") 
  val v_temp8 : RTLabel = v_split_expr_34850(v_st, v_Vpart_read235__2, v_Vpart_read246__2) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp8))
  v_st.f_gen_store (v_SignedSatQ261__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0111111111111111111111111111111111111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ262__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp8))
  v_st.f_gen_store (v_SignedSatQ261__2,v_split_expr_34851(v_st, v_Vpart_read235__2, v_Vpart_read246__2))
  v_st.f_gen_store (v_SignedSatQ262__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp8))
  val v_temp9 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ262__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp9))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_34852(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp9))
  val v_SignedSatQ276__2 : RTSym = v_st.f_decl_bv("SignedSatQ276__2", BigInt(64)) 
  val v_SignedSatQ277__2 : RTSym = v_st.f_decl_bool("SignedSatQ277__2") 
  val v_temp10 : RTLabel = v_split_expr_34853(v_st, v_Vpart_read235__2, v_Vpart_read246__2) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp10))
  v_st.f_gen_store (v_SignedSatQ276__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0111111111111111111111111111111111111111111111111111111111111111", 2))))
  v_st.f_gen_store (v_SignedSatQ277__2,v_st.f_gen_bool_lit(true))
  v_st.f_switch_context (v_st.f_false_branch(v_temp10))
  v_st.f_gen_store (v_SignedSatQ276__2,v_split_expr_34854(v_st, v_Vpart_read235__2, v_Vpart_read246__2))
  v_st.f_gen_store (v_SignedSatQ277__2,v_st.f_gen_bool_lit(false))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp10))
  val v_temp11 : RTLabel = v_st.f_gen_branch(v_st.f_gen_load(v_SignedSatQ277__2)) 
  v_st.f_switch_context (v_st.f_true_branch(v_temp11))
  v_st.f_gen_store (v_st.v_FPSR.v,v_split_expr_34855(v_st))
  v_st.f_switch_context (v_st.f_merge_branch(v_temp11))
  v_st.f_gen_array_store (v_st.v__Z.v,v_split_expr_34856(v_st, v_enc),v_split_expr_34857(v_st, v_SignedSatQ261__2, v_SignedSatQ276__2))
}
