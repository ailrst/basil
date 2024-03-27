/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_shift_variable (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
    val v_DecodeShift4__2 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(2)))
    if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2))) then {
      v_DecodeShift4__2.v = BitVecLiteral(BigInt("00", 2), 2)
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2))) then {
        v_DecodeShift4__2.v = BitVecLiteral(BigInt("01", 2), 2)
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2))) then {
          v_DecodeShift4__2.v = BitVecLiteral(BigInt("10", 2), 2)
        } else {
          if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
            v_DecodeShift4__2.v = BitVecLiteral(BigInt("11", 2), 2)
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
    val v_X_read6__2 : RTSym = f_decl_bv(v_st, "X.read6__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read6__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read6__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    val v_X_read13__3 : RTSym = f_decl_bv(v_st, "X.read13__3", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read13__3,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read13__3,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    val v_result__2 : RTSym = f_decl_bv(v_st, "result__2", BigInt(64)) 
    f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_X_read13__3))
    if (f_eq_bits(v_st, BigInt(2), v_DecodeShift4__2.v, BitVecLiteral(BigInt("00", 2), 2))) then {
      f_gen_store (v_st,v_result__2,f_gen_lsl_bits(v_st, BigInt(64), BigInt(7), f_gen_load(v_st, v_X_read13__3), f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_slice(v_st, f_gen_load(v_st, v_X_read6__2), BigInt(0), BigInt(6)), f_gen_int_lit(v_st, BigInt(7)))))
    } else {
      if (f_eq_bits(v_st, BigInt(2), v_DecodeShift4__2.v, BitVecLiteral(BigInt("01", 2), 2))) then {
        f_gen_store (v_st,v_result__2,f_gen_lsr_bits(v_st, BigInt(64), BigInt(7), f_gen_load(v_st, v_X_read13__3), f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_slice(v_st, f_gen_load(v_st, v_X_read6__2), BigInt(0), BigInt(6)), f_gen_int_lit(v_st, BigInt(7)))))
      } else {
        if (f_eq_bits(v_st, BigInt(2), v_DecodeShift4__2.v, BitVecLiteral(BigInt("10", 2), 2))) then {
          f_gen_store (v_st,v_result__2,f_gen_asr_bits(v_st, BigInt(64), BigInt(7), f_gen_load(v_st, v_X_read13__3), f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_slice(v_st, f_gen_load(v_st, v_X_read6__2), BigInt(0), BigInt(6)), f_gen_int_lit(v_st, BigInt(7)))))
        } else {
          if (f_eq_bits(v_st, BigInt(2), v_DecodeShift4__2.v, BitVecLiteral(BigInt("11", 2), 2))) then {
            val v_ROR18__3 : RTSym = f_decl_bv(v_st, "ROR18__3", BigInt(64)) 
            f_gen_assert (v_st,f_gen_sle_bits(v_st, BigInt(7), f_gen_bit_lit(v_st, BigInt(7), BitVecLiteral(BigInt("0000000", 2), 7)), f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_slice(v_st, f_gen_load(v_st, v_X_read6__2), BigInt(0), BigInt(6)), f_gen_int_lit(v_st, BigInt(7)))))
            val v_temp0 = Mutable[RTLabel](rTLabelDefault)
            val v_temp1 = Mutable[RTLabel](rTLabelDefault)
            val v_temp2 = Mutable[RTLabel](rTLabelDefault)
            val (tmp4414,tmp4415,tmp4416) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(6), f_gen_slice(v_st, f_gen_load(v_st, v_X_read6__2), BigInt(0), BigInt(6)), f_gen_bit_lit(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6)))) 
            v_temp0.v = tmp4414
            v_temp1.v = tmp4415
            v_temp2.v = tmp4416
            f_switch_context (v_st,v_temp0.v)
            f_gen_store (v_st,v_ROR18__3,f_gen_load(v_st, v_X_read13__3))
            f_switch_context (v_st,v_temp1.v)
            f_gen_assert (v_st,f_gen_ne_bits(v_st, BigInt(6), f_gen_slice(v_st, f_gen_load(v_st, v_X_read6__2), BigInt(0), BigInt(6)), f_gen_bit_lit(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6))))
            f_gen_store (v_st,v_ROR18__3,f_gen_or_bits(v_st, BigInt(64), f_gen_lsr_bits(v_st, BigInt(64), BigInt(7), f_gen_load(v_st, v_X_read13__3), f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_slice(v_st, f_gen_load(v_st, v_X_read6__2), BigInt(0), BigInt(6)), f_gen_int_lit(v_st, BigInt(7)))), f_gen_lsl_bits(v_st, BigInt(64), BigInt(8), f_gen_load(v_st, v_X_read13__3), f_gen_ZeroExtend(v_st, BigInt(7), BigInt(8), f_gen_sub_bits(v_st, BigInt(7), f_gen_bit_lit(v_st, BigInt(7), BitVecLiteral(BigInt("1000000", 2), 7)), f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_slice(v_st, f_gen_load(v_st, v_X_read6__2), BigInt(0), BigInt(6)), f_gen_int_lit(v_st, BigInt(7)))), f_gen_int_lit(v_st, BigInt(8))))))
            f_switch_context (v_st,v_temp2.v)
            f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_ROR18__3))
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_load(v_st, v_result__2))
    }
  } else {
    val v_DecodeShift25__2 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(2)))
    if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2))) then {
      v_DecodeShift25__2.v = BitVecLiteral(BigInt("00", 2), 2)
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2))) then {
        v_DecodeShift25__2.v = BitVecLiteral(BigInt("01", 2), 2)
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2))) then {
          v_DecodeShift25__2.v = BitVecLiteral(BigInt("10", 2), 2)
        } else {
          if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
            v_DecodeShift25__2.v = BitVecLiteral(BigInt("11", 2), 2)
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
    val v_X_read27__2 : RTSym = f_decl_bv(v_st, "X.read27__2", BigInt(32)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read27__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))
    } else {
      f_gen_store (v_st,v_X_read27__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
    }
    val v_X_read34__3 : RTSym = f_decl_bv(v_st, "X.read34__3", BigInt(32)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read34__3,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
    } else {
      f_gen_store (v_st,v_X_read34__3,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
    }
    val v_result__2 : RTSym = f_decl_bv(v_st, "result__2", BigInt(32)) 
    f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_X_read34__3))
    if (f_eq_bits(v_st, BigInt(2), v_DecodeShift25__2.v, BitVecLiteral(BigInt("00", 2), 2))) then {
      f_gen_store (v_st,v_result__2,f_gen_lsl_bits(v_st, BigInt(32), BigInt(6), f_gen_load(v_st, v_X_read34__3), f_gen_ZeroExtend(v_st, BigInt(5), BigInt(6), f_gen_slice(v_st, f_gen_load(v_st, v_X_read27__2), BigInt(0), BigInt(5)), f_gen_int_lit(v_st, BigInt(6)))))
    } else {
      if (f_eq_bits(v_st, BigInt(2), v_DecodeShift25__2.v, BitVecLiteral(BigInt("01", 2), 2))) then {
        f_gen_store (v_st,v_result__2,f_gen_lsr_bits(v_st, BigInt(32), BigInt(6), f_gen_load(v_st, v_X_read34__3), f_gen_ZeroExtend(v_st, BigInt(5), BigInt(6), f_gen_slice(v_st, f_gen_load(v_st, v_X_read27__2), BigInt(0), BigInt(5)), f_gen_int_lit(v_st, BigInt(6)))))
      } else {
        if (f_eq_bits(v_st, BigInt(2), v_DecodeShift25__2.v, BitVecLiteral(BigInt("10", 2), 2))) then {
          f_gen_store (v_st,v_result__2,f_gen_asr_bits(v_st, BigInt(32), BigInt(6), f_gen_load(v_st, v_X_read34__3), f_gen_ZeroExtend(v_st, BigInt(5), BigInt(6), f_gen_slice(v_st, f_gen_load(v_st, v_X_read27__2), BigInt(0), BigInt(5)), f_gen_int_lit(v_st, BigInt(6)))))
        } else {
          if (f_eq_bits(v_st, BigInt(2), v_DecodeShift25__2.v, BitVecLiteral(BigInt("11", 2), 2))) then {
            val v_ROR39__3 : RTSym = f_decl_bv(v_st, "ROR39__3", BigInt(32)) 
            f_gen_assert (v_st,f_gen_sle_bits(v_st, BigInt(6), f_gen_bit_lit(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6)), f_gen_ZeroExtend(v_st, BigInt(5), BigInt(6), f_gen_slice(v_st, f_gen_load(v_st, v_X_read27__2), BigInt(0), BigInt(5)), f_gen_int_lit(v_st, BigInt(6)))))
            val v_temp3 = Mutable[RTLabel](rTLabelDefault)
            val v_temp4 = Mutable[RTLabel](rTLabelDefault)
            val v_temp5 = Mutable[RTLabel](rTLabelDefault)
            val (tmp4417,tmp4418,tmp4419) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(5), f_gen_slice(v_st, f_gen_load(v_st, v_X_read27__2), BigInt(0), BigInt(5)), f_gen_bit_lit(v_st, BigInt(5), BitVecLiteral(BigInt("00000", 2), 5)))) 
            v_temp3.v = tmp4417
            v_temp4.v = tmp4418
            v_temp5.v = tmp4419
            f_switch_context (v_st,v_temp3.v)
            f_gen_store (v_st,v_ROR39__3,f_gen_load(v_st, v_X_read34__3))
            f_switch_context (v_st,v_temp4.v)
            f_gen_assert (v_st,f_gen_ne_bits(v_st, BigInt(5), f_gen_slice(v_st, f_gen_load(v_st, v_X_read27__2), BigInt(0), BigInt(5)), f_gen_bit_lit(v_st, BigInt(5), BitVecLiteral(BigInt("00000", 2), 5))))
            f_gen_store (v_st,v_ROR39__3,f_gen_or_bits(v_st, BigInt(32), f_gen_lsr_bits(v_st, BigInt(32), BigInt(6), f_gen_load(v_st, v_X_read34__3), f_gen_ZeroExtend(v_st, BigInt(5), BigInt(6), f_gen_slice(v_st, f_gen_load(v_st, v_X_read27__2), BigInt(0), BigInt(5)), f_gen_int_lit(v_st, BigInt(6)))), f_gen_lsl_bits(v_st, BigInt(32), BigInt(7), f_gen_load(v_st, v_X_read34__3), f_gen_ZeroExtend(v_st, BigInt(6), BigInt(7), f_gen_sub_bits(v_st, BigInt(6), f_gen_bit_lit(v_st, BigInt(6), BitVecLiteral(BigInt("100000", 2), 6)), f_gen_ZeroExtend(v_st, BigInt(5), BigInt(6), f_gen_slice(v_st, f_gen_load(v_st, v_X_read27__2), BigInt(0), BigInt(5)), f_gen_int_lit(v_st, BigInt(6)))), f_gen_int_lit(v_st, BigInt(7))))))
            f_switch_context (v_st,v_temp5.v)
            f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_ROR39__3))
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_result__2), f_gen_int_lit(v_st, BigInt(64))))
    }
  }
}
