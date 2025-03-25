/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_branch_conditional_test[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2)))) then {
    val v_X_read3__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_X_read3__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))))
    } else {
      v_X_read3__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    val v_temp0 : RTLabel = v_st.f_gen_branch(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(64), BigInt(12), v_X_read3__2_copyprop.v, v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.f_append_bits(BigInt(1), BigInt(5), v_st.bvextract(v_enc,BigInt(31),BigInt(1)), v_st.bvextract(v_enc,BigInt(19),BigInt(5))), BigInt(12)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)), v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(24),BigInt(1))))) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp0))
    v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
    v_st.f_gen_store (v_st.v__PC.v,v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.f_SignExtend(BigInt(16), BigInt(64), v_st.f_append_bits(BigInt(14), BigInt(2), v_st.bvextract(v_enc,BigInt(5),BigInt(14)), v_st.mkBits(2, BigInt("00", 2))), BigInt(64)))))
    v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
  } else {
    val v_X_read15__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_X_read15__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read15__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
    }
    val v_temp1 : RTLabel = v_st.f_gen_branch(v_st.f_gen_eq_bits(BigInt(1), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(32), BigInt(12), v_X_read15__2_copyprop.v, v_st.f_gen_bit_lit(BigInt(12), v_st.f_ZeroExtend(BigInt(6), BigInt(12), v_st.f_append_bits(BigInt(1), BigInt(5), v_st.bvextract(v_enc,BigInt(31),BigInt(1)), v_st.bvextract(v_enc,BigInt(19),BigInt(5))), BigInt(12)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)), v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(24),BigInt(1))))) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp1))
    v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
    v_st.f_gen_store (v_st.v__PC.v,v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.f_SignExtend(BigInt(16), BigInt(64), v_st.f_append_bits(BigInt(14), BigInt(2), v_st.bvextract(v_enc,BigInt(5),BigInt(14)), v_st.mkBits(2, BigInt("00", 2))), BigInt(64)))))
    v_st.f_switch_context (v_st.f_merge_branch(v_temp1))
  }
}
