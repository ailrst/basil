/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_branch_unconditional_register[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))) then {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000010000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_st.f_gen_store (v_st.v_BTypeNext.v,v_st.f_gen_bit_lit(BigInt(2), v_st.mkBits(2, BigInt("00", 2))))
        v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
        v_st.f_gen_store (v_st.v__PC.v,v_st.f_gen_array_load(v_st.v__R.v, BigInt(30)))
      } else {
        v_st.f_gen_store (v_st.v_BTypeNext.v,v_st.f_gen_bit_lit(BigInt(2), v_st.mkBits(2, BigInt("00", 2))))
        v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
        v_st.f_gen_store (v_st.v__PC.v,v_st.f_gen_array_load(v_st.v__R.v, BigInt(30)))
      }
    } else {
      val v_X_read55__2 : RTSym = v_st.f_decl_bv("X.read55__2", BigInt(64)) 
      val v_X_read55__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
        if (((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111110111111111111100000011111", 2))), v_st.mkBits(32, BigInt("11010110000111110000100000011111", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111111111111100000000000", 2))), v_st.mkBits(32, BigInt("11010111000111110000100000000000", 2)))))) then {
          v_X_read55__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
        } else {
          v_st.f_gen_store (v_X_read55__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        }
      } else {
        if (((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111110111111111111100000011111", 2))), v_st.mkBits(32, BigInt("11010110000111110000100000011111", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111111111111100000000000", 2))), v_st.mkBits(32, BigInt("11010111000111110000100000000000", 2)))))) then {
          v_X_read55__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
        } else {
          v_st.f_gen_store (v_X_read55__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
        }
      }
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000010000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000011000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000001000000000000000000000", 2)))) then {
          v_st.f_gen_array_store (v_st.v__R.v,BigInt(30),v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
          v_st.f_gen_store (v_st.v_BTypeNext.v,v_st.f_gen_bit_lit(BigInt(2), v_st.mkBits(2, BigInt("10", 2))))
          v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
          v_st.f_gen_store (v_st.v__PC.v,v_st.f_gen_load(v_X_read55__2))
        } else {
          v_st.f_gen_store (v_st.v_BTypeNext.v,v_st.f_gen_bit_lit(BigInt(2), v_st.mkBits(2, BigInt("01", 2))))
          v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
          v_st.f_gen_store (v_st.v__PC.v,v_X_read55__2_copyprop.v)
        }
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000011000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000001000000000000000000000", 2)))) then {
          v_st.f_gen_array_store (v_st.v__R.v,BigInt(30),v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
          v_st.f_gen_store (v_st.v_BTypeNext.v,v_st.f_gen_bit_lit(BigInt(2), v_st.mkBits(2, BigInt("10", 2))))
          v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
          v_st.f_gen_store (v_st.v__PC.v,v_st.f_gen_load(v_X_read55__2))
        } else {
          v_st.f_gen_store (v_st.v_BTypeNext.v,v_st.f_gen_bit_lit(BigInt(2), v_st.mkBits(2, BigInt("01", 2))))
          v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
          v_st.f_gen_store (v_st.v__PC.v,v_X_read55__2_copyprop.v)
        }
      }
    }
  } else {
    val v_X_read109__2 : RTSym = v_st.f_decl_bv("X.read109__2", BigInt(64)) 
    val v_X_read109__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111101111111111110000011111", 2))), v_st.mkBits(32, BigInt("11010110000111110000000000000000", 2)))) then {
        v_X_read109__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
      } else {
        v_st.f_gen_store (v_X_read109__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111101111111111110000011111", 2))), v_st.mkBits(32, BigInt("11010110000111110000000000000000", 2)))) then {
        v_X_read109__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
      } else {
        v_st.f_gen_store (v_X_read109__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
      }
    }
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000011000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000001000000000000000000000", 2)))) then {
      v_st.f_gen_array_store (v_st.v__R.v,BigInt(30),v_st.f_gen_bit_lit(BigInt(64), v_st.f_add_bits(BigInt(64), v_pc, v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
      v_st.f_gen_store (v_st.v_BTypeNext.v,v_st.f_gen_bit_lit(BigInt(2), v_st.mkBits(2, BigInt("10", 2))))
      v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
      v_st.f_gen_store (v_st.v__PC.v,v_st.f_gen_load(v_X_read109__2))
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000011000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_st.f_gen_store (v_st.v_BTypeNext.v,v_st.f_gen_bit_lit(BigInt(2), v_st.mkBits(2, BigInt("01", 2))))
      } else {
        v_st.f_gen_store (v_st.v_BTypeNext.v,v_st.f_gen_bit_lit(BigInt(2), v_st.mkBits(2, BigInt("00", 2))))
      }
      v_st.f_gen_store (v_st.v___BranchTaken.v,v_st.f_gen_bool_lit(true))
      v_st.f_gen_store (v_st.v__PC.v,v_X_read109__2_copyprop.v)
    }
  }
}
