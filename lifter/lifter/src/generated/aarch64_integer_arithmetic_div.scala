/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_integer_arithmetic_div[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2)))) then {
    val v_X_read4__2 : RTSym = v_st.f_decl_bv("X.read4__2", BigInt(64)) 
    val v_X_read4__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000000100000011111", 2)))) then {
        v_X_read4__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
      } else {
        v_st.f_gen_store (v_X_read4__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000000100000011111", 2)))) then {
        v_X_read4__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
      } else {
        v_st.f_gen_store (v_X_read4__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
      }
    }
    val v_X_read9__2 : RTSym = v_st.f_decl_bv("X.read9__2", BigInt(64)) 
    val v_X_read9__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2)))))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000000100000011111", 2)))) then {
        v_X_read9__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5))))
      } else {
        v_st.f_gen_store (v_X_read9__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000000100000011111", 2)))) then {
        v_X_read9__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
      } else {
        v_st.f_gen_store (v_X_read9__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
      }
    }
    val v_temp0 : RTLabel = v_st.f_gen_branch(v_st.f_gen_eq_bits(BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000000100000011111", 2)))) then (v_X_read9__2_copyprop.v) else (v_st.f_gen_load(v_X_read9__2))), v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp0))
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    }
    v_st.f_switch_context (v_st.f_false_branch(v_temp0))
    val v_If21__2 : RTSym = v_st.f_decl_bv("If21__2", BigInt(128)) 
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000010000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_st.f_gen_store (v_If21__2,v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000000100000011111", 2)))) then (v_X_read4__2_copyprop.v) else (v_st.f_gen_load(v_X_read4__2))), v_st.f_gen_int_lit(BigInt(128))))
    } else {
      v_st.f_gen_store (v_If21__2,v_st.f_gen_SignExtend(BigInt(64), BigInt(128), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000000100000011111", 2)))) then (v_X_read4__2_copyprop.v) else (v_st.f_gen_load(v_X_read4__2))), v_st.f_gen_int_lit(BigInt(128))))
    }
    val v_If26__2 : RTSym = v_st.f_decl_bv("If26__2", BigInt(128)) 
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000010000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_st.f_gen_store (v_If26__2,v_st.f_gen_ZeroExtend(BigInt(64), BigInt(128), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000000100000011111", 2)))) then (v_X_read9__2_copyprop.v) else (v_st.f_gen_load(v_X_read9__2))), v_st.f_gen_int_lit(BigInt(128))))
    } else {
      v_st.f_gen_store (v_If26__2,v_st.f_gen_SignExtend(BigInt(64), BigInt(128), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000000100000011111", 2)))) then (v_X_read9__2_copyprop.v) else (v_st.f_gen_load(v_X_read9__2))), v_st.f_gen_int_lit(BigInt(128))))
    }
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_sdiv_bits(BigInt(128), v_st.f_gen_load(v_If21__2), v_st.f_gen_load(v_If26__2)), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)))
    }
    v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
  } else {
    val v_X_read33__2 : RTSym = v_st.f_decl_bv("X.read33__2", BigInt(32)) 
    val v_X_read33__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000000100000011111", 2)))) then {
        v_X_read33__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
      } else {
        v_st.f_gen_store (v_X_read33__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000000100000011111", 2)))) then {
        v_X_read33__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
      } else {
        v_st.f_gen_store (v_X_read33__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
      }
    }
    val v_X_read38__2 : RTSym = v_st.f_decl_bv("X.read38__2", BigInt(32)) 
    val v_X_read38__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2)))))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000000100000011111", 2)))) then {
        v_X_read38__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
      } else {
        v_st.f_gen_store (v_X_read38__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000000100000011111", 2)))) then {
        v_X_read38__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
      } else {
        v_st.f_gen_store (v_X_read38__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
      }
    }
    val v_temp1 : RTLabel = v_st.f_gen_branch(v_st.f_gen_eq_bits(BigInt(32), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000000100000011111", 2)))) then (v_X_read38__2_copyprop.v) else (v_st.f_gen_load(v_X_read38__2))), v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))) 
    v_st.f_switch_context (v_st.f_true_branch(v_temp1))
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    }
    v_st.f_switch_context (v_st.f_false_branch(v_temp1))
    val v_If50__2 : RTSym = v_st.f_decl_bv("If50__2", BigInt(64)) 
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000010000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_st.f_gen_store (v_If50__2,v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000000100000011111", 2)))) then (v_X_read33__2_copyprop.v) else (v_st.f_gen_load(v_X_read33__2))), v_st.f_gen_int_lit(BigInt(64))))
    } else {
      v_st.f_gen_store (v_If50__2,v_st.f_gen_SignExtend(BigInt(32), BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000000100000011111", 2)))) then (v_X_read33__2_copyprop.v) else (v_st.f_gen_load(v_X_read33__2))), v_st.f_gen_int_lit(BigInt(64))))
    }
    val v_If55__2 : RTSym = v_st.f_decl_bv("If55__2", BigInt(64)) 
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000010000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_st.f_gen_store (v_If55__2,v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000000100000011111", 2)))) then (v_X_read38__2_copyprop.v) else (v_st.f_gen_load(v_X_read38__2))), v_st.f_gen_int_lit(BigInt(64))))
    } else {
      v_st.f_gen_store (v_If55__2,v_st.f_gen_SignExtend(BigInt(32), BigInt(64), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111100000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000000100000011111", 2)))) then (v_X_read38__2_copyprop.v) else (v_st.f_gen_load(v_X_read38__2))), v_st.f_gen_int_lit(BigInt(64))))
    }
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_slice(v_st.f_gen_sdiv_bits(BigInt(64), v_st.f_gen_load(v_If50__2), v_st.f_gen_load(v_If55__2)), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))))
    }
    v_st.f_switch_context (v_st.f_merge_branch(v_temp1))
  }
}
