/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_logical_shiftedreg (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2)))) then {
    val v_result__1 = Mutable[Expr](rTExprDefault)
    val v_X_read8__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_X_read8__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    } else {
      v_X_read8__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    val v_X_read14__3 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
      v_X_read14__3.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
    } else {
      v_X_read14__3.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    val v_result__2 = Mutable[Expr](rTExprDefault)
    v_result__2.v = v_X_read14__3.v
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_result__2.v = f_gen_lsl_bits(v_st, BigInt(64), BigInt(7), v_X_read14__3.v, f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(10),BigInt(6)), BigInt(7))))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
        v_result__2.v = f_gen_lsr_bits(v_st, BigInt(64), BigInt(7), v_X_read14__3.v, f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(10),BigInt(6)), BigInt(7))))
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
          v_result__2.v = f_gen_asr_bits(v_st, BigInt(64), BigInt(7), v_X_read14__3.v, f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(10),BigInt(6)), BigInt(7))))
        } else {
          val v_ROR19__3 = Mutable[Expr](rTExprDefault)
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001111110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
            v_ROR19__3.v = v_X_read14__3.v
          } else {
            assert ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001111110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))))
            v_ROR19__3.v = f_gen_or_bits(v_st, BigInt(64), f_gen_lsr_bits(v_st, BigInt(64), BigInt(7), v_X_read14__3.v, f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(10),BigInt(6)), BigInt(7)))), f_gen_lsl_bits(v_st, BigInt(64), BigInt(8), v_X_read14__3.v, f_gen_bit_lit(v_st, BigInt(8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_sub_bits(v_st, BigInt(7), mkBits(v_st, 7, BigInt("1000000", 2)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(10),BigInt(6)), BigInt(7))), BigInt(8)))))
          }
          v_result__2.v = v_ROR19__3.v
        }
      }
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000001000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000001000000000000000000000", 2)))) then {
      if (((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))))) then {
        v_result__1.v = f_gen_and_bits(v_st, BigInt(64), v_X_read8__2.v, f_gen_not_bits(v_st, BigInt(64), v_result__2.v))
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_result__1.v = f_gen_or_bits(v_st, BigInt(64), v_X_read8__2.v, f_gen_not_bits(v_st, BigInt(64), v_result__2.v))
        } else {
          v_result__1.v = f_gen_eor_bits(v_st, BigInt(64), v_X_read8__2.v, f_gen_not_bits(v_st, BigInt(64), v_result__2.v))
        }
      }
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2)))) then {
        f_gen_store (v_st,v_PSTATE_V.v,f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))))
        f_gen_store (v_st,v_PSTATE_C.v,f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))))
        f_gen_store (v_st,v_PSTATE_Z.v,f_gen_cvt_bool_bv(v_st, f_gen_eq_bits(v_st, BigInt(64), v_result__1.v, f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))))
        f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, v_result__1.v, BigInt(63), BigInt(1)))
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),v_result__1.v)
        }
      } else {
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),v_result__1.v)
        }
      }
    } else {
      if (((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))))) then {
        v_result__1.v = f_gen_and_bits(v_st, BigInt(64), v_X_read8__2.v, v_result__2.v)
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_result__1.v = f_gen_or_bits(v_st, BigInt(64), v_X_read8__2.v, v_result__2.v)
        } else {
          v_result__1.v = f_gen_eor_bits(v_st, BigInt(64), v_X_read8__2.v, v_result__2.v)
        }
      }
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2)))) then {
        f_gen_store (v_st,v_PSTATE_V.v,f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))))
        f_gen_store (v_st,v_PSTATE_C.v,f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))))
        f_gen_store (v_st,v_PSTATE_Z.v,f_gen_cvt_bool_bv(v_st, f_gen_eq_bits(v_st, BigInt(64), v_result__1.v, f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))))
        f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, v_result__1.v, BigInt(63), BigInt(1)))
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),v_result__1.v)
        }
      } else {
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),v_result__1.v)
        }
      }
    }
  } else {
    val v_result__1 = Mutable[Expr](rTExprDefault)
    val v_X_read52__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_X_read52__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read52__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
    }
    val v_X_read58__3 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
      v_X_read58__3.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read58__3.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
    }
    val v_result__2 = Mutable[Expr](rTExprDefault)
    v_result__2.v = v_X_read58__3.v
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_result__2.v = f_gen_lsl_bits(v_st, BigInt(32), BigInt(7), v_X_read58__3.v, f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(10),BigInt(6)), BigInt(7))))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
        v_result__2.v = f_gen_lsr_bits(v_st, BigInt(32), BigInt(7), v_X_read58__3.v, f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(10),BigInt(6)), BigInt(7))))
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
          v_result__2.v = f_gen_asr_bits(v_st, BigInt(32), BigInt(7), v_X_read58__3.v, f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), bvextract(v_st,v_enc,BigInt(10),BigInt(6)), BigInt(7))))
        } else {
          val v_ROR63__3 = Mutable[Expr](rTExprDefault)
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001111110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
            v_ROR63__3.v = v_X_read58__3.v
          } else {
            assert ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001111110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))))
            v_ROR63__3.v = f_gen_or_bits(v_st, BigInt(32), f_gen_lsr_bits(v_st, BigInt(32), BigInt(6), v_X_read58__3.v, f_gen_bit_lit(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BigInt(6)))), f_gen_lsl_bits(v_st, BigInt(32), BigInt(7), v_X_read58__3.v, f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_sub_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("100000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BigInt(6))), BigInt(7)))))
          }
          v_result__2.v = v_ROR63__3.v
        }
      }
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000001000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000001000000000000000000000", 2)))) then {
      if (((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))))) then {
        v_result__1.v = f_gen_and_bits(v_st, BigInt(32), v_X_read52__2.v, f_gen_not_bits(v_st, BigInt(32), v_result__2.v))
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_result__1.v = f_gen_or_bits(v_st, BigInt(32), v_X_read52__2.v, f_gen_not_bits(v_st, BigInt(32), v_result__2.v))
        } else {
          v_result__1.v = f_gen_eor_bits(v_st, BigInt(32), v_X_read52__2.v, f_gen_not_bits(v_st, BigInt(32), v_result__2.v))
        }
      }
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2)))) then {
        f_gen_store (v_st,v_PSTATE_V.v,f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))))
        f_gen_store (v_st,v_PSTATE_C.v,f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))))
        f_gen_store (v_st,v_PSTATE_Z.v,f_gen_cvt_bool_bv(v_st, f_gen_eq_bits(v_st, BigInt(32), v_result__1.v, f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))))
        f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, v_result__1.v, BigInt(31), BigInt(1)))
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), v_result__1.v, f_gen_int_lit(v_st, BigInt(64))))
        }
      } else {
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), v_result__1.v, f_gen_int_lit(v_st, BigInt(64))))
        }
      }
    } else {
      if (((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))))) then {
        v_result__1.v = f_gen_and_bits(v_st, BigInt(32), v_X_read52__2.v, v_result__2.v)
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_result__1.v = f_gen_or_bits(v_st, BigInt(32), v_X_read52__2.v, v_result__2.v)
        } else {
          v_result__1.v = f_gen_eor_bits(v_st, BigInt(32), v_X_read52__2.v, v_result__2.v)
        }
      }
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01100000000000000000000000000000", 2)))) then {
        f_gen_store (v_st,v_PSTATE_V.v,f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))))
        f_gen_store (v_st,v_PSTATE_C.v,f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))))
        f_gen_store (v_st,v_PSTATE_Z.v,f_gen_cvt_bool_bv(v_st, f_gen_eq_bits(v_st, BigInt(32), v_result__1.v, f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))))
        f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, v_result__1.v, BigInt(31), BigInt(1)))
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), v_result__1.v, f_gen_int_lit(v_st, BigInt(64))))
        }
      } else {
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), v_result__1.v, f_gen_int_lit(v_st, BigInt(64))))
        }
      }
    }
  }
}
