/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_memory_literal_simdfp[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_Exp5__2 : RTSym = v_st.f_decl_bv("Exp5__2", BigInt(32)) 
    v_st.f_gen_store (v_Exp5__2,v_st.f_gen_Mem_read(BigInt(4), v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.f_SignExtend(BigInt(21), BigInt(64), v_st.f_append_bits(BigInt(19), BigInt(2), v_st.bvextract(v_enc,BigInt(5),BigInt(19)), v_st.mkBits(2, BigInt("00", 2))), BigInt(64)))), v_st.f_gen_int_lit(BigInt(4)), v_st.f_gen_int_lit(BigInt(1))))
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(128), v_st.f_gen_load(v_Exp5__2), v_st.f_gen_int_lit(BigInt(128))))
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
      val v_Exp14__2 : RTSym = v_st.f_decl_bv("Exp14__2", BigInt(64)) 
      v_st.f_gen_store (v_Exp14__2,v_st.f_gen_Mem_read(BigInt(8), v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.f_SignExtend(BigInt(21), BigInt(64), v_st.f_append_bits(BigInt(19), BigInt(2), v_st.bvextract(v_enc,BigInt(5),BigInt(19)), v_st.mkBits(2, BigInt("00", 2))), BigInt(64)))), v_st.f_gen_int_lit(BigInt(8)), v_st.f_gen_int_lit(BigInt(1))))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_load(v_Exp14__2), v_st.f_gen_int_lit(BigInt(128))))
    } else {
      val v_Exp23__2 : RTSym = v_st.f_decl_bv("Exp23__2", BigInt(128)) 
      v_st.f_gen_store (v_Exp23__2,v_st.f_gen_Mem_read(BigInt(16), v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.f_SignExtend(BigInt(21), BigInt(64), v_st.f_append_bits(BigInt(19), BigInt(2), v_st.bvextract(v_enc,BigInt(5),BigInt(19)), v_st.mkBits(2, BigInt("00", 2))), BigInt(64)))), v_st.f_gen_int_lit(BigInt(16)), v_st.f_gen_int_lit(BigInt(1))))
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_load(v_Exp23__2))
    }
  }
}
