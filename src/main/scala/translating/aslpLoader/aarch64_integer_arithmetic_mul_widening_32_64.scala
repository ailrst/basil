/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_arithmetic_mul_widening_32_64 (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  val v_X_read5__2 = Mutable[Expr](rTExprDefault)
  if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
    v_X_read5__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
  } else {
    v_X_read5__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
  }
  val v_X_read10__2 = Mutable[Expr](rTExprDefault)
  if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
    v_X_read10__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
  } else {
    v_X_read10__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
  }
  val v_X_read15__2 = Mutable[Expr](rTExprDefault)
  if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000111110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000111110000000000", 2)))))) then {
    v_X_read15__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5))))
  } else {
    v_X_read15__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
  }
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2)))) then {
    val v_If21__2 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      v_If21__2.v = f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), v_X_read15__2.v, f_gen_int_lit(v_st, BigInt(65)))
    } else {
      v_If21__2.v = f_gen_SignExtend(v_st, BigInt(64), BigInt(65), v_X_read15__2.v, f_gen_int_lit(v_st, BigInt(65)))
    }
    val v_If25__2 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      v_If25__2.v = f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), v_X_read5__2.v, f_gen_int_lit(v_st, BigInt(33)))
    } else {
      v_If25__2.v = f_gen_SignExtend(v_st, BigInt(32), BigInt(33), v_X_read5__2.v, f_gen_int_lit(v_st, BigInt(33)))
    }
    val v_If29__2 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      v_If29__2.v = f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), v_X_read10__2.v, f_gen_int_lit(v_st, BigInt(33)))
    } else {
      v_If29__2.v = f_gen_SignExtend(v_st, BigInt(32), BigInt(33), v_X_read10__2.v, f_gen_int_lit(v_st, BigInt(33)))
    }
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_slice(v_st, f_gen_sub_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_SignExtend(v_st, BigInt(65), BigInt(66), v_If21__2.v, f_gen_int_lit(v_st, BigInt(66))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_SignExtend(v_st, BigInt(65), BigInt(66), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), v_If25__2.v, f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), v_If29__2.v, f_gen_int_lit(v_st, BigInt(65)))), f_gen_int_lit(v_st, BigInt(66))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64)))
    }
  } else {
    val v_If35__2 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      v_If35__2.v = f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), v_X_read15__2.v, f_gen_int_lit(v_st, BigInt(65)))
    } else {
      v_If35__2.v = f_gen_SignExtend(v_st, BigInt(64), BigInt(65), v_X_read15__2.v, f_gen_int_lit(v_st, BigInt(65)))
    }
    val v_If39__2 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      v_If39__2.v = f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), v_X_read5__2.v, f_gen_int_lit(v_st, BigInt(33)))
    } else {
      v_If39__2.v = f_gen_SignExtend(v_st, BigInt(32), BigInt(33), v_X_read5__2.v, f_gen_int_lit(v_st, BigInt(33)))
    }
    val v_If43__2 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      v_If43__2.v = f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), v_X_read10__2.v, f_gen_int_lit(v_st, BigInt(33)))
    } else {
      v_If43__2.v = f_gen_SignExtend(v_st, BigInt(32), BigInt(33), v_X_read10__2.v, f_gen_int_lit(v_st, BigInt(33)))
    }
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_SignExtend(v_st, BigInt(65), BigInt(66), v_If35__2.v, f_gen_int_lit(v_st, BigInt(66))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_SignExtend(v_st, BigInt(65), BigInt(66), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), v_If39__2.v, f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), v_If43__2.v, f_gen_int_lit(v_st, BigInt(65)))), f_gen_int_lit(v_st, BigInt(66))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64)))
    }
  }
}
