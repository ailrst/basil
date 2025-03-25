/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_integer_flags_setf[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000100000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000100000000000000", 2)))) then {
    val v_X_read4__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_X_read4__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read4__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
    }
    v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_X_read4__2_copyprop.v, BigInt(15), BigInt(1)))
    v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(16), v_st.f_gen_slice(v_X_read4__2_copyprop.v, BigInt(0), BigInt(16)), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2))))))
    v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_eor_bits(BigInt(1), v_st.f_gen_slice(v_X_read4__2_copyprop.v, BigInt(16), BigInt(1)), v_st.f_gen_slice(v_X_read4__2_copyprop.v, BigInt(15), BigInt(1))))
  } else {
    val v_X_read12__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_X_read12__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read12__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
    }
    v_st.f_gen_store (v_st.v_PSTATE_N.v,v_st.f_gen_slice(v_X_read12__2_copyprop.v, BigInt(7), BigInt(1)))
    v_st.f_gen_store (v_st.v_PSTATE_Z.v,v_st.f_gen_cvt_bool_bv(v_st.f_gen_eq_bits(BigInt(8), v_st.f_gen_slice(v_X_read12__2_copyprop.v, BigInt(0), BigInt(8)), v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00000000", 2))))))
    v_st.f_gen_store (v_st.v_PSTATE_V.v,v_st.f_gen_eor_bits(BigInt(1), v_st.f_gen_slice(v_X_read12__2_copyprop.v, BigInt(8), BigInt(1)), v_st.f_gen_slice(v_X_read12__2_copyprop.v, BigInt(7), BigInt(1))))
  }
}
