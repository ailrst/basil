/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_arithmetic_binary_uniform_logical_bsl_eor[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
    val v_operand1__1 : RTSym = v_st.f_decl_bv("operand1__1", BigInt(128)) 
    val v_operand2__1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    val v_operand3__1 : RTSym = v_st.f_decl_bv("operand3__1", BigInt(128)) 
    val v_Exp6__2 : RTSym = v_st.f_decl_bv("Exp6__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp6__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_st.f_gen_store (v_operand1__1,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
      v_operand2__1_copyprop.v = v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 2)))
      v_st.f_gen_store (v_operand3__1,v_st.f_gen_bit_lit(BigInt(128), v_st.mkBits(128, BigInt("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 2))))
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
        val v_Exp15__2 : RTSym = v_st.f_decl_bv("Exp15__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp15__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
        v_st.f_gen_store (v_operand1__1,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
        v_operand2__1_copyprop.v = v_st.f_gen_load(v_Exp15__2)
        v_st.f_gen_store (v_operand3__1,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
          val v_Exp21__2 : RTSym = v_st.f_decl_bv("Exp21__2", BigInt(128)) 
          v_st.f_gen_store (v_Exp21__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))))
          v_st.f_gen_store (v_operand1__1,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))))
          v_operand2__1_copyprop.v = v_st.f_gen_load(v_Exp21__2)
          v_st.f_gen_store (v_operand3__1,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
        } else {
          val v_Exp27__2 : RTSym = v_st.f_decl_bv("Exp27__2", BigInt(128)) 
          v_st.f_gen_store (v_Exp27__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))))
          v_st.f_gen_store (v_operand1__1,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))))
          v_operand2__1_copyprop.v = v_st.f_gen_load(v_Exp27__2)
          v_st.f_gen_store (v_operand3__1,v_st.f_gen_not_bits(BigInt(128), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5))))))
        }
      }
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_eor_bits(BigInt(128), v_st.f_gen_load(v_operand1__1), v_st.f_gen_and_bits(BigInt(128), v_st.f_gen_eor_bits(BigInt(128), v_operand2__1_copyprop.v, v_st.f_gen_load(v_Exp6__2)), v_st.f_gen_load(v_operand3__1))))
  } else {
    val v_operand1__1_1 : RTSym = v_st.f_decl_bv("operand1__1_1", BigInt(64)) 
    val v_operand2__1_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    val v_operand3__1_1 : RTSym = v_st.f_decl_bv("operand3__1_1", BigInt(64)) 
    val v_Exp41__2 : RTSym = v_st.f_decl_bv("Exp41__2", BigInt(128)) 
    v_st.f_gen_store (v_Exp41__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_st.f_gen_store (v_operand1__1_1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)))
      v_operand2__1_1_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
      v_st.f_gen_store (v_operand3__1_1,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2))))
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
        val v_Exp50__2 : RTSym = v_st.f_decl_bv("Exp50__2", BigInt(128)) 
        v_st.f_gen_store (v_Exp50__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
        v_st.f_gen_store (v_operand1__1_1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)))
        v_operand2__1_1_copyprop.v = v_st.f_gen_slice(v_st.f_gen_load(v_Exp50__2), BigInt(0), BigInt(64))
        v_st.f_gen_store (v_operand3__1_1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64)))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000110000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000100000000000000000000000", 2)))) then {
          val v_Exp56__2 : RTSym = v_st.f_decl_bv("Exp56__2", BigInt(128)) 
          v_st.f_gen_store (v_Exp56__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))))
          v_st.f_gen_store (v_operand1__1_1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64)))
          v_operand2__1_1_copyprop.v = v_st.f_gen_slice(v_st.f_gen_load(v_Exp56__2), BigInt(0), BigInt(64))
          v_st.f_gen_store (v_operand3__1_1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)))
        } else {
          val v_Exp62__2 : RTSym = v_st.f_decl_bv("Exp62__2", BigInt(128)) 
          v_st.f_gen_store (v_Exp62__2,v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))))
          v_st.f_gen_store (v_operand1__1_1,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64)))
          v_operand2__1_1_copyprop.v = v_st.f_gen_slice(v_st.f_gen_load(v_Exp62__2), BigInt(0), BigInt(64))
          v_st.f_gen_store (v_operand3__1_1,v_st.f_gen_not_bits(BigInt(64), v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64))))
        }
      }
    }
    v_st.f_gen_array_store (v_st.v__Z.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), v_st.f_gen_eor_bits(BigInt(64), v_st.f_gen_load(v_operand1__1_1), v_st.f_gen_and_bits(BigInt(64), v_st.f_gen_eor_bits(BigInt(64), v_operand2__1_1_copyprop.v, v_st.f_gen_slice(v_st.f_gen_load(v_Exp41__2), BigInt(0), BigInt(64))), v_st.f_gen_load(v_operand3__1_1))), v_st.f_gen_int_lit(BigInt(128))))
  }
}
