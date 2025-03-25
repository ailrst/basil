/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_memory_literal_general[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_Exp5__2 : RTSym = v_st.f_decl_bv("Exp5__2", BigInt(32)) 
    v_st.f_gen_store (v_Exp5__2,v_st.f_gen_Mem_read(BigInt(4), v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.f_SignExtend(BigInt(21), BigInt(64), v_st.f_append_bits(BigInt(19), BigInt(2), v_st.bvextract(v_enc,BigInt(5),BigInt(19)), v_st.mkBits(2, BigInt("00", 2))), BigInt(64)))), v_st.f_gen_int_lit(BigInt(4)), v_st.f_gen_int_lit(BigInt(0))))
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_load(v_Exp5__2), v_st.f_gen_int_lit(BigInt(64))))
    }
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
      val v_Exp11__2 : RTSym = v_st.f_decl_bv("Exp11__2", BigInt(64)) 
      v_st.f_gen_store (v_Exp11__2,v_st.f_gen_Mem_read(BigInt(8), v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.f_SignExtend(BigInt(21), BigInt(64), v_st.f_append_bits(BigInt(19), BigInt(2), v_st.bvextract(v_enc,BigInt(5),BigInt(19)), v_st.mkBits(2, BigInt("00", 2))), BigInt(64)))), v_st.f_gen_int_lit(BigInt(8)), v_st.f_gen_int_lit(BigInt(0))))
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_load(v_Exp11__2))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2)))) then {
        val v_Exp17__2 : RTSym = v_st.f_decl_bv("Exp17__2", BigInt(32)) 
        v_st.f_gen_store (v_Exp17__2,v_st.f_gen_Mem_read(BigInt(4), v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.f_SignExtend(BigInt(21), BigInt(64), v_st.f_append_bits(BigInt(19), BigInt(2), v_st.bvextract(v_enc,BigInt(5),BigInt(19)), v_st.mkBits(2, BigInt("00", 2))), BigInt(64)))), v_st.f_gen_int_lit(BigInt(4)), v_st.f_gen_int_lit(BigInt(0))))
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
          v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_SignExtend(BigInt(32), BigInt(64), v_st.f_gen_load(v_Exp17__2), v_st.f_gen_int_lit(BigInt(64))))
        }
      }
    }
  }
}
