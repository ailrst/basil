/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_ins_ext_insert_movewide (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
    val v_opcode__1 = Mutable[BV](mkBits(v_st, BigInt(2), BigInt(0)))
    if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(29),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2)))) then {
      v_opcode__1.v = mkBits(v_st, 2, BigInt("00", 2))
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(29),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2)))) then {
        v_opcode__1.v = mkBits(v_st, 2, BigInt("01", 2))
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(29),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))) then {
          v_opcode__1.v = mkBits(v_st, 2, BigInt("10", 2))
        } else {
          throw Exception("not supported")
        }
      }
    }
    if (((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) && (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))))) then {
      throw Exception("not supported")
    } else {
      if (f_eq_bits(v_st, BigInt(2), v_opcode__1.v, mkBits(v_st, 2, BigInt("10", 2)))) then {
        val v_X_read5__2 = Mutable[Expr](rTExprDefault)
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
          v_X_read5__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
        } else {
          v_X_read5__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
        }
        if (f_eq_bits(v_st, BigInt(2), v_opcode__1.v, mkBits(v_st, 2, BigInt("00", 2)))) then {
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_not_bits(v_st, BigInt(64), f_gen_or_bits(v_st, BigInt(64), f_gen_and_bits(v_st, BigInt(64), v_X_read5__2.v, f_gen_bit_lit(v_st, BigInt(64), f_not_bits(v_st, BigInt(64), f_lsl_bits(v_st, BigInt(64), BigInt(7), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000001111111111111111", 2)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7)))))), f_gen_bit_lit(v_st, BigInt(64), f_lsl_bits(v_st, BigInt(64), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(64), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(64)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7)))))))
          }
        } else {
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_or_bits(v_st, BigInt(64), f_gen_and_bits(v_st, BigInt(64), v_X_read5__2.v, f_gen_bit_lit(v_st, BigInt(64), f_not_bits(v_st, BigInt(64), f_lsl_bits(v_st, BigInt(64), BigInt(7), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000001111111111111111", 2)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7)))))), f_gen_bit_lit(v_st, BigInt(64), f_lsl_bits(v_st, BigInt(64), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(64), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(64)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7))))))
          }
        }
      } else {
        if (f_eq_bits(v_st, BigInt(2), v_opcode__1.v, mkBits(v_st, 2, BigInt("00", 2)))) then {
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), f_not_bits(v_st, BigInt(64), f_lsl_bits(v_st, BigInt(64), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(64), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(64)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7))))))
          }
        } else {
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), f_lsl_bits(v_st, BigInt(64), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(64), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(64)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7)))))
          }
        }
      }
    }
  } else {
    val v_opcode__1 = Mutable[BV](mkBits(v_st, BigInt(2), BigInt(0)))
    if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(29),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2)))) then {
      v_opcode__1.v = mkBits(v_st, 2, BigInt("00", 2))
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(29),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2)))) then {
        v_opcode__1.v = mkBits(v_st, 2, BigInt("01", 2))
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(29),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))) then {
          v_opcode__1.v = mkBits(v_st, 2, BigInt("10", 2))
        } else {
          throw Exception("not supported")
        }
      }
    }
    if (((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) && (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))))) then {
      throw Exception("not supported")
    } else {
      if (f_eq_bits(v_st, BigInt(2), v_opcode__1.v, mkBits(v_st, 2, BigInt("10", 2)))) then {
        val v_X_read22__2 = Mutable[Expr](rTExprDefault)
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
          v_X_read22__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32))
        } else {
          v_X_read22__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
        }
        if (f_eq_bits(v_st, BigInt(2), v_opcode__1.v, mkBits(v_st, 2, BigInt("00", 2)))) then {
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_not_bits(v_st, BigInt(32), f_gen_or_bits(v_st, BigInt(32), f_gen_and_bits(v_st, BigInt(32), v_X_read22__2.v, f_gen_bit_lit(v_st, BigInt(32), f_not_bits(v_st, BigInt(32), f_lsl_bits(v_st, BigInt(32), BigInt(7), mkBits(v_st, 32, BigInt("00000000000000001111111111111111", 2)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7)))))), f_gen_bit_lit(v_st, BigInt(32), f_lsl_bits(v_st, BigInt(32), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(32), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(32)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7)))))), f_gen_int_lit(v_st, BigInt(64))))
          }
        } else {
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_or_bits(v_st, BigInt(32), f_gen_and_bits(v_st, BigInt(32), v_X_read22__2.v, f_gen_bit_lit(v_st, BigInt(32), f_not_bits(v_st, BigInt(32), f_lsl_bits(v_st, BigInt(32), BigInt(7), mkBits(v_st, 32, BigInt("00000000000000001111111111111111", 2)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7)))))), f_gen_bit_lit(v_st, BigInt(32), f_lsl_bits(v_st, BigInt(32), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(32), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(32)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7))))), f_gen_int_lit(v_st, BigInt(64))))
          }
        }
      } else {
        if (f_eq_bits(v_st, BigInt(2), v_opcode__1.v, mkBits(v_st, 2, BigInt("00", 2)))) then {
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), f_ZeroExtend(v_st, BigInt(32), BigInt(64), f_not_bits(v_st, BigInt(32), f_lsl_bits(v_st, BigInt(32), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(32), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(32)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7)))), BigInt(64))))
          }
        } else {
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), f_ZeroExtend(v_st, BigInt(32), BigInt(64), f_lsl_bits(v_st, BigInt(32), BigInt(7), f_ZeroExtend(v_st, BigInt(16), BigInt(32), bvextract(v_st,v_enc,BigInt(5),BigInt(16)), BigInt(32)), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(2), BigInt(4), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 4, BigInt("0000", 2))), BigInt(7))), BigInt(64))))
          }
        }
      }
    }
  }
}
