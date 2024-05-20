/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_float_convert_fix (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2)))) then {
    val v_rounding__1 = Mutable[Expr](rTExprDefault)
    val v_unsigned__1 = Mutable[Boolean](true)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000110000000000000000000", 2)))) then {
        v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2)))
        v_unsigned__1.v = f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))
      } else {
        val v_FPDecodeRounding8__3 = Mutable[Expr](rTExprDefault)
        v_FPDecodeRounding8__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
        v_rounding__1.v = v_FPDecodeRounding8__3.v
        v_unsigned__1.v = f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))
      }
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000110000000000000000000", 2)))) then {
        val v_Exp17__2 = Mutable[Expr](rTExprDefault)
        v_Exp17__2.v = f_gen_FPToFixed(v_st, BigInt(64), BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(6)))))), f_gen_bool_lit(v_st, v_unsigned__1.v), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v))
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),v_Exp17__2.v)
        }
      } else {
        val v_X_read20__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
          v_X_read20__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        } else {
          v_X_read20__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
        }
        val v_Exp28__2 = Mutable[Expr](rTExprDefault)
        v_Exp28__2.v = f_gen_FixedToFP(v_st, BigInt(64), BigInt(32), v_X_read20__2.v, f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(6)))))), f_gen_bool_lit(v_st, v_unsigned__1.v), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_Exp28__2.v, f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000110000000000000000000", 2)))) then {
          v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2)))
          v_unsigned__1.v = f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))
        } else {
          val v_FPDecodeRounding39__3 = Mutable[Expr](rTExprDefault)
          v_FPDecodeRounding39__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
          v_rounding__1.v = v_FPDecodeRounding39__3.v
          v_unsigned__1.v = f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000110000000000000000000", 2)))) then {
          val v_Exp48__2 = Mutable[Expr](rTExprDefault)
          v_Exp48__2.v = f_gen_FPToFixed(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(6)))))), f_gen_bool_lit(v_st, v_unsigned__1.v), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v))
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),v_Exp48__2.v)
          }
        } else {
          val v_X_read51__2 = Mutable[Expr](rTExprDefault)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
            v_X_read51__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
          } else {
            v_X_read51__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
          }
          val v_Exp59__2 = Mutable[Expr](rTExprDefault)
          v_Exp59__2.v = f_gen_FixedToFP(v_st, BigInt(64), BigInt(64), v_X_read51__2.v, f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(6)))))), f_gen_bool_lit(v_st, v_unsigned__1.v), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_Exp59__2.v, f_gen_int_lit(v_st, BigInt(128))))
        }
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000110000000000000000000", 2)))) then {
          v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2)))
          v_unsigned__1.v = f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))
        } else {
          val v_FPDecodeRounding72__3 = Mutable[Expr](rTExprDefault)
          v_FPDecodeRounding72__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
          v_rounding__1.v = v_FPDecodeRounding72__3.v
          v_unsigned__1.v = f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000110000000000000000000", 2)))) then {
          val v_Exp81__2 = Mutable[Expr](rTExprDefault)
          v_Exp81__2.v = f_gen_FPToFixed(v_st, BigInt(64), BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(6)))))), f_gen_bool_lit(v_st, v_unsigned__1.v), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v))
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),v_Exp81__2.v)
          }
        } else {
          val v_X_read84__2 = Mutable[Expr](rTExprDefault)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
            v_X_read84__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
          } else {
            v_X_read84__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
          }
          val v_Exp92__2 = Mutable[Expr](rTExprDefault)
          v_Exp92__2.v = f_gen_FixedToFP(v_st, BigInt(64), BigInt(16), v_X_read84__2.v, f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(6)))))), f_gen_bool_lit(v_st, v_unsigned__1.v), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_Exp92__2.v, f_gen_int_lit(v_st, BigInt(128))))
        }
      }
    }
  } else {
    val v_rounding__1 = Mutable[Expr](rTExprDefault)
    val v_unsigned__1 = Mutable[Boolean](true)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000110000000000000000000", 2)))) then {
        v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2)))
        v_unsigned__1.v = f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))
      } else {
        val v_FPDecodeRounding103__3 = Mutable[Expr](rTExprDefault)
        v_FPDecodeRounding103__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
        v_rounding__1.v = v_FPDecodeRounding103__3.v
        v_unsigned__1.v = f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))
      }
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000110000000000000000000", 2)))) then {
        val v_Exp112__2 = Mutable[Expr](rTExprDefault)
        v_Exp112__2.v = f_gen_FPToFixed(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(6)))))), f_gen_bool_lit(v_st, v_unsigned__1.v), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v))
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), v_Exp112__2.v, f_gen_int_lit(v_st, BigInt(64))))
        }
      } else {
        val v_X_read115__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
          v_X_read115__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
        } else {
          v_X_read115__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
        }
        val v_Exp123__2 = Mutable[Expr](rTExprDefault)
        v_Exp123__2.v = f_gen_FixedToFP(v_st, BigInt(32), BigInt(32), v_X_read115__2.v, f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(6)))))), f_gen_bool_lit(v_st, v_unsigned__1.v), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_Exp123__2.v, f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000110000000000000000000", 2)))) then {
          v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2)))
          v_unsigned__1.v = f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))
        } else {
          val v_FPDecodeRounding134__3 = Mutable[Expr](rTExprDefault)
          v_FPDecodeRounding134__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
          v_rounding__1.v = v_FPDecodeRounding134__3.v
          v_unsigned__1.v = f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000110000000000000000000", 2)))) then {
          val v_Exp143__2 = Mutable[Expr](rTExprDefault)
          v_Exp143__2.v = f_gen_FPToFixed(v_st, BigInt(32), BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(6)))))), f_gen_bool_lit(v_st, v_unsigned__1.v), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v))
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), v_Exp143__2.v, f_gen_int_lit(v_st, BigInt(64))))
          }
        } else {
          val v_X_read146__2 = Mutable[Expr](rTExprDefault)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
            v_X_read146__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
          } else {
            v_X_read146__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
          }
          val v_Exp154__2 = Mutable[Expr](rTExprDefault)
          v_Exp154__2.v = f_gen_FixedToFP(v_st, BigInt(32), BigInt(64), v_X_read146__2.v, f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(6)))))), f_gen_bool_lit(v_st, v_unsigned__1.v), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_Exp154__2.v, f_gen_int_lit(v_st, BigInt(128))))
        }
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000110000000000000000000", 2)))) then {
          v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2)))
          v_unsigned__1.v = f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))
        } else {
          val v_FPDecodeRounding167__3 = Mutable[Expr](rTExprDefault)
          v_FPDecodeRounding167__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
          v_rounding__1.v = v_FPDecodeRounding167__3.v
          v_unsigned__1.v = f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000110000000000000000000", 2)))) then {
          val v_Exp176__2 = Mutable[Expr](rTExprDefault)
          v_Exp176__2.v = f_gen_FPToFixed(v_st, BigInt(32), BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(6)))))), f_gen_bool_lit(v_st, v_unsigned__1.v), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v))
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), v_Exp176__2.v, f_gen_int_lit(v_st, BigInt(64))))
          }
        } else {
          val v_X_read179__2 = Mutable[Expr](rTExprDefault)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
            v_X_read179__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
          } else {
            v_X_read179__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
          }
          val v_Exp187__2 = Mutable[Expr](rTExprDefault)
          v_Exp187__2.v = f_gen_FixedToFP(v_st, BigInt(32), BigInt(16), v_X_read179__2.v, f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(6)))))), f_gen_bool_lit(v_st, v_unsigned__1.v), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_Exp187__2.v, f_gen_int_lit(v_st, BigInt(128))))
        }
      }
    }
  }
}
