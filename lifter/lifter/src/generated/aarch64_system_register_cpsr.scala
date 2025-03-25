/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_system_register_cpsr[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001110000000011100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001110000000011100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000100000", 2)))) then {
      throw Exception("not supported")
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001110000000011100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000001000000", 2)))) then {
        throw Exception("not supported")
      } else {
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000110000000000000000", 2)))))) then {
          throw Exception("not supported")
        } else {
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001110000000011100000", 2))), v_st.mkBits(32, BigInt("00000000000000110000000001000000", 2)))) then {
            /*proc return */ ()
          } else {
            if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001110000000011100000", 2))), v_st.mkBits(32, BigInt("00000000000000110000000010000000", 2)))) then {
              throw Exception("not supported")
            } else {
              if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001110000000011100000", 2))), v_st.mkBits(32, BigInt("00000000000000110000000011000000", 2)))) then {
                /*proc return */ ()
              } else {
                if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001110000000011100000", 2))), v_st.mkBits(32, BigInt("00000000000000110000000011100000", 2)))) then {
                  /*proc return */ ()
                } else {
                  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001110000000011100000", 2))), v_st.mkBits(32, BigInt("00000000000000110000000000100000", 2)))) then {
                    /*proc return */ ()
                  } else {
                    throw Exception("not supported")
                  }
                }
              }
            }
          }
          if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001110000000011000000", 2))), v_st.mkBits(32, BigInt("00000000000000110000000011000000", 2)))) then {
            if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001110000000011100000", 2))), v_st.mkBits(32, BigInt("00000000000000110000000011000000", 2)))) then {
              v_st.f_gen_store (v_st.v_PSTATE_D.v,v_st.f_gen_or_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_D.v), v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(11),BigInt(1)))))
              v_st.f_gen_store (v_st.v_PSTATE_A.v,v_st.f_gen_or_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_A.v), v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(10),BigInt(1)))))
              v_st.f_gen_store (v_st.v_PSTATE_I.v,v_st.f_gen_or_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_I.v), v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(9),BigInt(1)))))
              v_st.f_gen_store (v_st.v_PSTATE_F.v,v_st.f_gen_or_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_F.v), v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(8),BigInt(1)))))
            } else {
              v_st.f_gen_store (v_st.v_PSTATE_D.v,v_st.f_gen_and_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_D.v), v_st.f_gen_bit_lit(BigInt(1), v_st.f_not_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(11),BigInt(1))))))
              v_st.f_gen_store (v_st.v_PSTATE_A.v,v_st.f_gen_and_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_A.v), v_st.f_gen_bit_lit(BigInt(1), v_st.f_not_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(10),BigInt(1))))))
              v_st.f_gen_store (v_st.v_PSTATE_I.v,v_st.f_gen_and_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_I.v), v_st.f_gen_bit_lit(BigInt(1), v_st.f_not_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(9),BigInt(1))))))
              v_st.f_gen_store (v_st.v_PSTATE_F.v,v_st.f_gen_and_bits(BigInt(1), v_st.f_gen_load(v_st.v_PSTATE_F.v), v_st.f_gen_bit_lit(BigInt(1), v_st.f_not_bits(BigInt(1), v_st.bvextract(v_enc,BigInt(8),BigInt(1))))))
            }
          } else {
            if (((((((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000010100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000100000", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000001000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000001000000000000000000", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000100000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000010000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000001000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))))) then {
              v_st.f_gen_store (v_st.v_PSTATE_SSBS.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(8),BigInt(1))))
            } else {
              v_st.f_gen_store (v_st.v_PSTATE_DIT.v,v_st.f_gen_bit_lit(BigInt(1), v_st.bvextract(v_enc,BigInt(8),BigInt(1))))
            }
          }
        }
      }
    }
  }
}
