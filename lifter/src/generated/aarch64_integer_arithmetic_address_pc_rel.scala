/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_integer_arithmetic_address_pc_rel[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2)))) then {
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_st.f_append_bits(BigInt(52), BigInt(12), v_st.bvextract(v_pc,BigInt(12),BigInt(52)), v_st.mkBits(12, BigInt("000000000000", 2))), v_st.f_SignExtend(BigInt(33), BigInt(64), v_st.f_append_bits(BigInt(21), BigInt(12), v_st.f_append_bits(BigInt(19), BigInt(2), v_st.bvextract(v_enc,BigInt(5),BigInt(19)), v_st.bvextract(v_enc,BigInt(29),BigInt(2))), v_st.mkBits(12, BigInt("000000000000", 2))), BigInt(64)))))
    }
  } else {
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.f_SignExtend(BigInt(21), BigInt(64), v_st.f_append_bits(BigInt(19), BigInt(2), v_st.bvextract(v_enc,BigInt(5),BigInt(19)), v_st.bvextract(v_enc,BigInt(29),BigInt(2))), BigInt(64)))))
    }
  }
}
