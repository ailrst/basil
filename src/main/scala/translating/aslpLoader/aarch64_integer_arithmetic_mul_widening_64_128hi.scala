/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_arithmetic_mul_widening_64_128hi (v_st: LiftState,v_enc: BV) : Unit = {
  val v_X_read5__2 = Mutable[Expr](rTExprDefault)
  assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
  if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
    v_X_read5__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
  } else {
    v_X_read5__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
  }
  val v_X_read10__2 = Mutable[Expr](rTExprDefault)
  assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
  if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
    v_X_read10__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
  } else {
    v_X_read10__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
  }
  val v_If16__2 = Mutable[Expr](rTExprDefault)
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
    v_If16__2.v = f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), v_X_read5__2.v, f_gen_int_lit(v_st, BigInt(65)))
  } else {
    v_If16__2.v = f_gen_SignExtend(v_st, BigInt(64), BigInt(65), v_X_read5__2.v, f_gen_int_lit(v_st, BigInt(65)))
  }
  val v_If20__2 = Mutable[Expr](rTExprDefault)
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
    v_If20__2.v = f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), v_X_read10__2.v, f_gen_int_lit(v_st, BigInt(65)))
  } else {
    v_If20__2.v = f_gen_SignExtend(v_st, BigInt(64), BigInt(65), v_X_read10__2.v, f_gen_int_lit(v_st, BigInt(65)))
  }
  assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
  if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
    f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_slice(v_st, f_gen_slice(v_st, f_gen_mul_bits(v_st, BigInt(129), f_gen_SignExtend(v_st, BigInt(65), BigInt(129), v_If16__2.v, f_gen_int_lit(v_st, BigInt(129))), f_gen_SignExtend(v_st, BigInt(65), BigInt(129), v_If20__2.v, f_gen_int_lit(v_st, BigInt(129)))), BigInt(0), BigInt(128)), BigInt(64), BigInt(64)))
  }
}
