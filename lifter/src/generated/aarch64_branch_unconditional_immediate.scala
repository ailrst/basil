/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_branch_unconditional_immediate[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2)))) then {
    v_st.f_gen_array_store (v_st.v__R.v,BigInt(30),v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
    v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
    v_st.f_gen_store (v_st.v__PC.v,v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.f_SignExtend(BigInt(28), BigInt(64), v_st.f_append_bits(BigInt(26), BigInt(2), v_st.bvextract(v_enc,BigInt(0),BigInt(26)), v_st.mkBits(2, BigInt("00", 2))), BigInt(64)))))
  } else {
    v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
    v_st.f_gen_store (v_st.v__PC.v,v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.f_SignExtend(BigInt(28), BigInt(64), v_st.f_append_bits(BigInt(26), BigInt(2), v_st.bvextract(v_enc,BigInt(0),BigInt(26)), v_st.mkBits(2, BigInt("00", 2))), BigInt(64)))))
  }
}
