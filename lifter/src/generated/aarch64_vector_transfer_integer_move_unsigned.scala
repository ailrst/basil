/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_vector_transfer_integer_move_unsigned[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000010000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000010000000000000000", 2)))) then {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000100000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000100000000000000000000", 2)))) then {
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_ZeroExtend(BigInt(8), BigInt(32), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(4), BigInt(8), v_st.bvextract(v_enc,BigInt(17),BigInt(4)), BigInt(8)), v_st.mkBits(8, BigInt("00001000", 2))), BigInt(16)))), BigInt(0), BigInt(8)), BigInt(0), BigInt(8)), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_int_lit(BigInt(64))))
      }
    } else {
      assert (((true) && (v_st.f_sle_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_add_bits(BigInt(8), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(4), BigInt(8), v_st.bvextract(v_enc,BigInt(17),BigInt(4)), BigInt(8)), v_st.mkBits(8, BigInt("00001000", 2))), v_st.mkBits(8, BigInt("00001000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000001000000", 2))))))
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_ZeroExtend(BigInt(8), BigInt(32), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(4), BigInt(8), v_st.bvextract(v_enc,BigInt(17),BigInt(4)), BigInt(8)), v_st.mkBits(8, BigInt("00001000", 2))), BigInt(16)))), BigInt(0), BigInt(8)), BigInt(0), BigInt(8)), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_int_lit(BigInt(64))))
      }
    }
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000100000000000000000", 2)))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000100000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000100000000000000000000", 2)))) then {
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
          v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_ZeroExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_st.bvextract(v_enc,BigInt(18),BigInt(3)), BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_int_lit(BigInt(64))))
        }
      } else {
        assert (((true) && (v_st.f_sle_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_add_bits(BigInt(8), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_st.bvextract(v_enc,BigInt(18),BigInt(3)), BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000001000000", 2))))))
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
          v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_ZeroExtend(BigInt(16), BigInt(32), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(3), BigInt(8), v_st.bvextract(v_enc,BigInt(18),BigInt(3)), BigInt(8)), v_st.mkBits(8, BigInt("00010000", 2))), BigInt(16)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_int_lit(BigInt(64))))
        }
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000001110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000001000000000000000000", 2)))) then {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000100000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000100000000000000000000", 2)))) then {
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
            v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_st.bvextract(v_enc,BigInt(19),BigInt(2)), BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))))
          }
        } else {
          assert (((true) && (v_st.f_sle_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_add_bits(BigInt(8), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_st.bvextract(v_enc,BigInt(19),BigInt(2)), BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000001000000", 2))))))
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
            v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(2), BigInt(8), v_st.bvextract(v_enc,BigInt(19),BigInt(2)), BigInt(8)), v_st.mkBits(8, BigInt("00100000", 2))), BigInt(16)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))))
          }
        }
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000011110000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000010000000000000000000", 2)))) then {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000100000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000100000000000000000000", 2)))) then {
            if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
              v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(1), BigInt(8), v_st.bvextract(v_enc,BigInt(20),BigInt(1)), BigInt(8)), v_st.mkBits(8, BigInt("01000000", 2))), BigInt(16)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)))
            }
          } else {
            assert (((true) && (v_st.f_sle_bits(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_add_bits(BigInt(8), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(1), BigInt(8), v_st.bvextract(v_enc,BigInt(20),BigInt(1)), BigInt(8)), v_st.mkBits(8, BigInt("01000000", 2))), v_st.mkBits(8, BigInt("01000000", 2))), BigInt(16)), v_st.mkBits(16, BigInt("0000000001000000", 2))))))
            if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
              v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_lsr_bits(BigInt(128), BigInt(16), v_st.f_gen_array_load(v_st.v__Z.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), v_st.f_gen_bit_lit(BigInt(16), v_st.f_ZeroExtend(BigInt(8), BigInt(16), v_st.f_mul_bits(BigInt(8), v_st.f_ZeroExtend(BigInt(1), BigInt(8), v_st.bvextract(v_enc,BigInt(20),BigInt(1)), BigInt(8)), v_st.mkBits(8, BigInt("01000000", 2))), BigInt(16)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)))
            }
          }
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
}
