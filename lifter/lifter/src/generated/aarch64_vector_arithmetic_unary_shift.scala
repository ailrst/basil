/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_unary_shift[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_Vpart_read5__2 : RTSym = v_st.f_decl_bv("Vpart.read5__2", BigInt(64)) 
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_st.f_gen_store (v_Vpart_read5__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)))
      } else {
        v_st.f_gen_store (v_Vpart_read5__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)))
      }
      v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(16), BigInt(112), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read5__2), BigInt(56), BigInt(8)), v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00000000", 2)))), v_st.f_gen_append_bits(BigInt(16), BigInt(96), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read5__2), BigInt(48), BigInt(8)), v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00000000", 2)))), v_st.f_gen_append_bits(BigInt(16), BigInt(80), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read5__2), BigInt(40), BigInt(8)), v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00000000", 2)))), v_st.f_gen_append_bits(BigInt(16), BigInt(64), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read5__2), BigInt(32), BigInt(8)), v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00000000", 2)))), v_st.f_gen_append_bits(BigInt(16), BigInt(48), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read5__2), BigInt(24), BigInt(8)), v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00000000", 2)))), v_st.f_gen_append_bits(BigInt(16), BigInt(32), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read5__2), BigInt(16), BigInt(8)), v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00000000", 2)))), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read5__2), BigInt(8), BigInt(8)), v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00000000", 2)))), v_st.f_gen_append_bits(BigInt(8), BigInt(8), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read5__2), BigInt(0), BigInt(8)), v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00000000", 2))))))))))))
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
        val v_Vpart_read64__2 : RTSym = v_st.f_decl_bv("Vpart.read64__2", BigInt(64)) 
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
          v_st.f_gen_store (v_Vpart_read64__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)))
        } else {
          v_st.f_gen_store (v_Vpart_read64__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)))
        }
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(32), BigInt(96), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read64__2), BigInt(48), BigInt(16)), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2)))), v_st.f_gen_append_bits(BigInt(32), BigInt(64), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read64__2), BigInt(32), BigInt(16)), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2)))), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read64__2), BigInt(16), BigInt(16)), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2)))), v_st.f_gen_append_bits(BigInt(16), BigInt(16), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read64__2), BigInt(0), BigInt(16)), v_st.f_gen_bit_lit(BigInt(16), v_st.mkBits(16, BigInt("0000000000000000", 2))))))))
      } else {
        val v_Vpart_read103__2 : RTSym = v_st.f_decl_bv("Vpart.read103__2", BigInt(64)) 
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
          v_st.f_gen_store (v_Vpart_read103__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)))
        } else {
          v_st.f_gen_store (v_Vpart_read103__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)))
        }
        v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read103__2), BigInt(32), BigInt(32)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_slice(v_st.f_gen_load(v_Vpart_read103__2), BigInt(0), BigInt(32)), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))))
      }
    }
  }
}
