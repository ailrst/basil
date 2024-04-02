/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_float_arithmetic_unary (v_st: LiftState,v_enc: BV) : Unit = {
  val v_Exp3__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2))) 
  if (v_Exp3__1) then {
    val v_fpop__1 = Mutable[BV](mkBits(v_st, BigInt(2), BigInt(0)))
    if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2)))) then {
      v_fpop__1.v = mkBits(v_st, 2, BigInt("01", 2))
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2)))) then {
        v_fpop__1.v = mkBits(v_st, 2, BigInt("00", 2))
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2)))) then {
          v_fpop__1.v = mkBits(v_st, 2, BigInt("10", 2))
        } else {
          if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))) then {
            v_fpop__1.v = mkBits(v_st, 2, BigInt("11", 2))
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
    val v_result__1 = Mutable[Expr](rTExprDefault)
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    if (f_eq_bits(v_st, BigInt(2), v_fpop__1.v, mkBits(v_st, 2, BigInt("01", 2)))) then {
      v_result__1.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      if (f_eq_bits(v_st, BigInt(2), v_fpop__1.v, mkBits(v_st, 2, BigInt("00", 2)))) then {
        v_result__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31)))
      } else {
        if (f_eq_bits(v_st, BigInt(2), v_fpop__1.v, mkBits(v_st, 2, BigInt("10", 2)))) then {
          v_result__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(31), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31)))
        } else {
          if (f_eq_bits(v_st, BigInt(2), v_fpop__1.v, mkBits(v_st, 2, BigInt("11", 2)))) then {
            val v_Exp11__2 = Mutable[Expr](rTExprDefault)
            v_Exp11__2.v = f_gen_FPSqrt(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
            v_result__1.v = v_Exp11__2.v
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
  } else {
    val v_Exp18__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2))) 
    if (v_Exp18__1) then {
      val v_fpop__1 = Mutable[BV](mkBits(v_st, BigInt(2), BigInt(0)))
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2)))) then {
        v_fpop__1.v = mkBits(v_st, 2, BigInt("01", 2))
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2)))) then {
          v_fpop__1.v = mkBits(v_st, 2, BigInt("00", 2))
        } else {
          if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2)))) then {
            v_fpop__1.v = mkBits(v_st, 2, BigInt("10", 2))
          } else {
            if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))) then {
              v_fpop__1.v = mkBits(v_st, 2, BigInt("11", 2))
            } else {
              throw Exception("not supported")
            }
          }
        }
      }
      val v_result__1 = Mutable[Expr](rTExprDefault)
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      if (f_eq_bits(v_st, BigInt(2), v_fpop__1.v, mkBits(v_st, 2, BigInt("01", 2)))) then {
        v_result__1.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))
      } else {
        if (f_eq_bits(v_st, BigInt(2), v_fpop__1.v, mkBits(v_st, 2, BigInt("00", 2)))) then {
          v_result__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(63)))
        } else {
          if (f_eq_bits(v_st, BigInt(2), v_fpop__1.v, mkBits(v_st, 2, BigInt("10", 2)))) then {
            v_result__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(63), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(63)))
          } else {
            if (f_eq_bits(v_st, BigInt(2), v_fpop__1.v, mkBits(v_st, 2, BigInt("11", 2)))) then {
              val v_Exp26__2 = Mutable[Expr](rTExprDefault)
              v_Exp26__2.v = f_gen_FPSqrt(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
              v_result__1.v = v_Exp26__2.v
            } else {
              throw Exception("not supported")
            }
          }
        }
      }
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
    } else {
      val v_Exp33__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2))) 
      if (v_Exp33__1) then {
        throw Exception("not supported")
      } else {
        val v_Exp34__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2))) 
        if (v_Exp34__1) then {
          val v_fpop__1 = Mutable[BV](mkBits(v_st, BigInt(2), BigInt(0)))
          if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2)))) then {
            v_fpop__1.v = mkBits(v_st, 2, BigInt("01", 2))
          } else {
            if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2)))) then {
              v_fpop__1.v = mkBits(v_st, 2, BigInt("00", 2))
            } else {
              if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2)))) then {
                v_fpop__1.v = mkBits(v_st, 2, BigInt("10", 2))
              } else {
                if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))) then {
                  v_fpop__1.v = mkBits(v_st, 2, BigInt("11", 2))
                } else {
                  throw Exception("not supported")
                }
              }
            }
          }
          val v_result__1 = Mutable[Expr](rTExprDefault)
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          if (f_eq_bits(v_st, BigInt(2), v_fpop__1.v, mkBits(v_st, 2, BigInt("01", 2)))) then {
            v_result__1.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16))
          } else {
            if (f_eq_bits(v_st, BigInt(2), v_fpop__1.v, mkBits(v_st, 2, BigInt("00", 2)))) then {
              v_result__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15)))
            } else {
              if (f_eq_bits(v_st, BigInt(2), v_fpop__1.v, mkBits(v_st, 2, BigInt("10", 2)))) then {
                v_result__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(15), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15)))
              } else {
                if (f_eq_bits(v_st, BigInt(2), v_fpop__1.v, mkBits(v_st, 2, BigInt("11", 2)))) then {
                  val v_Exp43__2 = Mutable[Expr](rTExprDefault)
                  v_Exp43__2.v = f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
                  v_result__1.v = v_Exp43__2.v
                } else {
                  throw Exception("not supported")
                }
              }
            }
          }
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
}
