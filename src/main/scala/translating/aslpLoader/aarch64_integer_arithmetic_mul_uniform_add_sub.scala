/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_arithmetic_mul_uniform_add_sub (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
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
    val v_X_read15__2 = Mutable[Expr](rTExprDefault)
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
      v_X_read15__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5))))
    } else {
      v_X_read15__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(15),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_slice(v_st, f_gen_sub_bits(v_st, BigInt(64), f_gen_slice(v_st, v_X_read15__2.v, BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_mul_bits(v_st, BigInt(128), f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_X_read5__2.v, f_gen_int_lit(v_st, BigInt(128))), f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_X_read10__2.v, f_gen_int_lit(v_st, BigInt(128)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64)))
      }
    } else {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(64), f_gen_slice(v_st, v_X_read15__2.v, BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_mul_bits(v_st, BigInt(128), f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_X_read5__2.v, f_gen_int_lit(v_st, BigInt(128))), f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_X_read10__2.v, f_gen_int_lit(v_st, BigInt(128)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64)))
      }
    }
  } else {
    val v_X_read30__2 = Mutable[Expr](rTExprDefault)
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
      v_X_read30__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read30__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
    }
    val v_X_read35__2 = Mutable[Expr](rTExprDefault)
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
      v_X_read35__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read35__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
    }
    val v_X_read40__2 = Mutable[Expr](rTExprDefault)
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
      v_X_read40__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read40__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(15),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_slice(v_st, f_gen_sub_bits(v_st, BigInt(32), f_gen_slice(v_st, v_X_read40__2.v, BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_mul_bits(v_st, BigInt(64), f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), v_X_read30__2.v, f_gen_int_lit(v_st, BigInt(64))), f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), v_X_read35__2.v, f_gen_int_lit(v_st, BigInt(64)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(64))))
      }
    } else {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(32), f_gen_slice(v_st, v_X_read40__2.v, BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_mul_bits(v_st, BigInt(64), f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), v_X_read30__2.v, f_gen_int_lit(v_st, BigInt(64))), f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), v_X_read35__2.v, f_gen_int_lit(v_st, BigInt(64)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(64))))
      }
    }
  }
}
