/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_integer_shift_variable[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2)))) then {
    val v_X_read6__2 : RTSym = v_st.f_decl_bv("X.read6__2", BigInt(64)) 
    val v_X_read6__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2)))))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then {
        v_X_read6__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5))))
      } else {
        v_st.f_gen_store (v_X_read6__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then {
        v_X_read6__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
      } else {
        v_st.f_gen_store (v_X_read6__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
      }
    }
    val v_X_read13__3 : RTSym = v_st.f_decl_bv("X.read13__3", BigInt(64)) 
    val v_X_read13__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then {
        v_X_read13__3_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
      } else {
        v_st.f_gen_store (v_X_read13__3,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then {
        v_X_read13__3_copyprop.v = v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
      } else {
        v_st.f_gen_store (v_X_read13__3,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
      }
    }
    val v_result__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_result__2_copyprop.v = (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read13__3_copyprop.v) else (v_st.f_gen_load(v_X_read13__3)))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000110000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_result__2_copyprop.v = v_st.f_gen_lsl_bits(BigInt(64), BigInt(12), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read13__3_copyprop.v) else (v_st.f_gen_load(v_X_read13__3))), v_st.f_gen_ZeroExtend(BigInt(6), BigInt(12), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read6__2_copyprop.v) else (v_st.f_gen_load(v_X_read6__2))), BigInt(0), BigInt(6)), v_st.f_gen_int_lit(BigInt(12))))
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000110000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000010000000000", 2)))) then {
        v_result__2_copyprop.v = v_st.f_gen_lsr_bits(BigInt(64), BigInt(12), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read13__3_copyprop.v) else (v_st.f_gen_load(v_X_read13__3))), v_st.f_gen_ZeroExtend(BigInt(6), BigInt(12), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read6__2_copyprop.v) else (v_st.f_gen_load(v_X_read6__2))), BigInt(0), BigInt(6)), v_st.f_gen_int_lit(BigInt(12))))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000110000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))) then {
          v_result__2_copyprop.v = v_st.f_gen_asr_bits(BigInt(64), BigInt(12), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read13__3_copyprop.v) else (v_st.f_gen_load(v_X_read13__3))), v_st.f_gen_ZeroExtend(BigInt(6), BigInt(12), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read6__2_copyprop.v) else (v_st.f_gen_load(v_X_read6__2))), BigInt(0), BigInt(6)), v_st.f_gen_int_lit(BigInt(12))))
        } else {
          val v_ROR18__3 : RTSym = v_st.f_decl_bv("ROR18__3", BigInt(64)) 
          val v_temp0 : RTLabel = v_st.f_gen_branch(v_st.f_gen_eq_bits(BigInt(6), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read6__2_copyprop.v) else (v_st.f_gen_load(v_X_read6__2))), BigInt(0), BigInt(6)), v_st.f_gen_bit_lit(BigInt(6), v_st.mkBits(6, BigInt("000000", 2))))) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp0))
          v_st.f_gen_store (v_ROR18__3,(if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read13__3_copyprop.v) else (v_st.f_gen_load(v_X_read13__3))))
          v_st.f_switch_context (v_st.f_false_branch(v_temp0))
          v_st.f_gen_assert (v_st.f_gen_ne_bits(BigInt(6), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read6__2_copyprop.v) else (v_st.f_gen_load(v_X_read6__2))), BigInt(0), BigInt(6)), v_st.f_gen_bit_lit(BigInt(6), v_st.mkBits(6, BigInt("000000", 2)))))
          v_st.f_gen_store (v_ROR18__3,v_st.f_gen_or_bits(BigInt(64), v_st.f_gen_lsr_bits(BigInt(64), BigInt(12), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read13__3_copyprop.v) else (v_st.f_gen_load(v_X_read13__3))), v_st.f_gen_ZeroExtend(BigInt(6), BigInt(12), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read6__2_copyprop.v) else (v_st.f_gen_load(v_X_read6__2))), BigInt(0), BigInt(6)), v_st.f_gen_int_lit(BigInt(12)))), v_st.f_gen_lsl_bits(BigInt(64), BigInt(16), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read13__3_copyprop.v) else (v_st.f_gen_load(v_X_read13__3))), v_st.f_gen_ZeroExtend(BigInt(8), BigInt(16), v_st.f_gen_sub_bits(BigInt(8), v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("01000000", 2))), v_st.f_gen_ZeroExtend(BigInt(6), BigInt(8), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("10011010110000000010000000011111", 2)))) then (v_X_read6__2_copyprop.v) else (v_st.f_gen_load(v_X_read6__2))), BigInt(0), BigInt(6)), v_st.f_gen_int_lit(BigInt(8)))), v_st.f_gen_int_lit(BigInt(16))))))
          v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
          v_result__2_copyprop.v = v_st.f_gen_load(v_ROR18__3)
        }
      }
    }
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_result__2_copyprop.v)
    }
  } else {
    val v_X_read27__2 : RTSym = v_st.f_decl_bv("X.read27__2", BigInt(32)) 
    val v_X_read27__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2)))))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then {
        v_X_read27__2_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
      } else {
        v_st.f_gen_store (v_X_read27__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then {
        v_X_read27__2_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
      } else {
        v_st.f_gen_store (v_X_read27__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
      }
    }
    val v_X_read34__3 : RTSym = v_st.f_decl_bv("X.read34__3", BigInt(32)) 
    val v_X_read34__3_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then {
        v_X_read34__3_copyprop.v = v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
      } else {
        v_st.f_gen_store (v_X_read34__3,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then {
        v_X_read34__3_copyprop.v = v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))
      } else {
        v_st.f_gen_store (v_X_read34__3,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
      }
    }
    val v_result__2_1_copyprop = Mutable[RTSym](v_st.rTExprDefault)
    v_result__2_1_copyprop.v = (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read34__3_copyprop.v) else (v_st.f_gen_load(v_X_read34__3)))
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000110000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_result__2_1_copyprop.v = v_st.f_gen_lsl_bits(BigInt(32), BigInt(10), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read34__3_copyprop.v) else (v_st.f_gen_load(v_X_read34__3))), v_st.f_gen_ZeroExtend(BigInt(5), BigInt(10), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read27__2_copyprop.v) else (v_st.f_gen_load(v_X_read27__2))), BigInt(0), BigInt(5)), v_st.f_gen_int_lit(BigInt(10))))
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000110000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000010000000000", 2)))) then {
        v_result__2_1_copyprop.v = v_st.f_gen_lsr_bits(BigInt(32), BigInt(10), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read34__3_copyprop.v) else (v_st.f_gen_load(v_X_read34__3))), v_st.f_gen_ZeroExtend(BigInt(5), BigInt(10), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read27__2_copyprop.v) else (v_st.f_gen_load(v_X_read27__2))), BigInt(0), BigInt(5)), v_st.f_gen_int_lit(BigInt(10))))
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000110000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000100000000000", 2)))) then {
          v_result__2_1_copyprop.v = v_st.f_gen_asr_bits(BigInt(32), BigInt(10), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read34__3_copyprop.v) else (v_st.f_gen_load(v_X_read34__3))), v_st.f_gen_ZeroExtend(BigInt(5), BigInt(10), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read27__2_copyprop.v) else (v_st.f_gen_load(v_X_read27__2))), BigInt(0), BigInt(5)), v_st.f_gen_int_lit(BigInt(10))))
        } else {
          val v_ROR39__3 : RTSym = v_st.f_decl_bv("ROR39__3", BigInt(32)) 
          val v_temp1 : RTLabel = v_st.f_gen_branch(v_st.f_gen_eq_bits(BigInt(5), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read27__2_copyprop.v) else (v_st.f_gen_load(v_X_read27__2))), BigInt(0), BigInt(5)), v_st.f_gen_bit_lit(BigInt(5), v_st.mkBits(5, BigInt("00000", 2))))) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp1))
          v_st.f_gen_store (v_ROR39__3,(if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read34__3_copyprop.v) else (v_st.f_gen_load(v_X_read34__3))))
          v_st.f_switch_context (v_st.f_false_branch(v_temp1))
          v_st.f_gen_assert (v_st.f_gen_ne_bits(BigInt(5), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read27__2_copyprop.v) else (v_st.f_gen_load(v_X_read27__2))), BigInt(0), BigInt(5)), v_st.f_gen_bit_lit(BigInt(5), v_st.mkBits(5, BigInt("00000", 2)))))
          v_st.f_gen_store (v_ROR39__3,v_st.f_gen_or_bits(BigInt(32), v_st.f_gen_lsr_bits(BigInt(32), BigInt(10), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read34__3_copyprop.v) else (v_st.f_gen_load(v_X_read34__3))), v_st.f_gen_ZeroExtend(BigInt(5), BigInt(10), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read27__2_copyprop.v) else (v_st.f_gen_load(v_X_read27__2))), BigInt(0), BigInt(5)), v_st.f_gen_int_lit(BigInt(10)))), v_st.f_gen_lsl_bits(BigInt(32), BigInt(16), (if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read34__3_copyprop.v) else (v_st.f_gen_load(v_X_read34__3))), v_st.f_gen_ZeroExtend(BigInt(8), BigInt(16), v_st.f_gen_sub_bits(BigInt(8), v_st.f_gen_bit_lit(BigInt(8), v_st.mkBits(8, BigInt("00100000", 2))), v_st.f_gen_ZeroExtend(BigInt(5), BigInt(8), v_st.f_gen_slice((if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111000000011111", 2))), v_st.mkBits(32, BigInt("00011010110000000010000000011111", 2)))) then (v_X_read27__2_copyprop.v) else (v_st.f_gen_load(v_X_read27__2))), BigInt(0), BigInt(5)), v_st.f_gen_int_lit(BigInt(8)))), v_st.f_gen_int_lit(BigInt(16))))))
          v_st.f_switch_context (v_st.f_merge_branch(v_temp1))
          v_result__2_1_copyprop.v = v_st.f_gen_load(v_ROR39__3)
        }
      }
    }
    if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_result__2_1_copyprop.v, v_st.f_gen_int_lit(BigInt(64))))
    }
  }
}
