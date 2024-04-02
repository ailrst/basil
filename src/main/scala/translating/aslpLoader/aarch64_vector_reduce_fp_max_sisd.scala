/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_reduce_fp_max_sisd (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
    val v_If4__1 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If4__1.v = mkBits(v_st, 3, BigInt("010", 2))
    } else {
      v_If4__1.v = mkBits(v_st, 3, BigInt("011", 2))
    }
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_result__2 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(3), v_If4__1.v, mkBits(v_st, 3, BigInt("000", 2)))) then {
      val v_Exp12__3 = Mutable[Expr](rTExprDefault)
      v_Exp12__3.v = f_gen_FPMinNum(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
      v_result__2.v = v_Exp12__3.v
    } else {
      if (f_eq_bits(v_st, BigInt(3), v_If4__1.v, mkBits(v_st, 3, BigInt("001", 2)))) then {
        val v_Exp14__3 = Mutable[Expr](rTExprDefault)
        v_Exp14__3.v = f_gen_FPMaxNum(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
        v_result__2.v = v_Exp14__3.v
      } else {
        if (f_eq_bits(v_st, BigInt(3), v_If4__1.v, mkBits(v_st, 3, BigInt("010", 2)))) then {
          val v_Exp16__3 = Mutable[Expr](rTExprDefault)
          v_Exp16__3.v = f_gen_FPMin(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          v_result__2.v = v_Exp16__3.v
        } else {
          if (f_eq_bits(v_st, BigInt(3), v_If4__1.v, mkBits(v_st, 3, BigInt("011", 2)))) then {
            val v_Exp18__3 = Mutable[Expr](rTExprDefault)
            v_Exp18__3.v = f_gen_FPMax(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
            v_result__2.v = v_Exp18__3.v
          } else {
            if (f_eq_bits(v_st, BigInt(3), v_If4__1.v, mkBits(v_st, 3, BigInt("100", 2)))) then {
              val v_Exp20__3 = Mutable[Expr](rTExprDefault)
              v_Exp20__3.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
              v_result__2.v = v_Exp20__3.v
            } else {
              if (f_eq_bits(v_st, BigInt(3), v_If4__1.v, mkBits(v_st, 3, BigInt("101", 2)))) then {
                v_result__2.v = f_gen_add_bits(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)))
              } else {
                throw Exception("not supported")
              }
            }
          }
        }
      }
    }
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_result__2.v, f_gen_int_lit(v_st, BigInt(128))))
  } else {
    if (f_eq_bits(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
      val v_If28__1 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
        v_If28__1.v = mkBits(v_st, 3, BigInt("010", 2))
      } else {
        v_If28__1.v = mkBits(v_st, 3, BigInt("011", 2))
      }
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      val v_result__2 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(3), v_If28__1.v, mkBits(v_st, 3, BigInt("000", 2)))) then {
        val v_Exp36__3 = Mutable[Expr](rTExprDefault)
        v_Exp36__3.v = f_gen_FPMinNum(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        v_result__2.v = v_Exp36__3.v
      } else {
        if (f_eq_bits(v_st, BigInt(3), v_If28__1.v, mkBits(v_st, 3, BigInt("001", 2)))) then {
          val v_Exp38__3 = Mutable[Expr](rTExprDefault)
          v_Exp38__3.v = f_gen_FPMaxNum(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
          v_result__2.v = v_Exp38__3.v
        } else {
          if (f_eq_bits(v_st, BigInt(3), v_If28__1.v, mkBits(v_st, 3, BigInt("010", 2)))) then {
            val v_Exp40__3 = Mutable[Expr](rTExprDefault)
            v_Exp40__3.v = f_gen_FPMin(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
            v_result__2.v = v_Exp40__3.v
          } else {
            if (f_eq_bits(v_st, BigInt(3), v_If28__1.v, mkBits(v_st, 3, BigInt("011", 2)))) then {
              val v_Exp42__3 = Mutable[Expr](rTExprDefault)
              v_Exp42__3.v = f_gen_FPMax(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
              v_result__2.v = v_Exp42__3.v
            } else {
              if (f_eq_bits(v_st, BigInt(3), v_If28__1.v, mkBits(v_st, 3, BigInt("100", 2)))) then {
                val v_Exp44__3 = Mutable[Expr](rTExprDefault)
                v_Exp44__3.v = f_gen_FPAdd(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
                v_result__2.v = v_Exp44__3.v
              } else {
                if (f_eq_bits(v_st, BigInt(3), v_If28__1.v, mkBits(v_st, 3, BigInt("101", 2)))) then {
                  v_result__2.v = f_gen_add_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)))
                } else {
                  throw Exception("not supported")
                }
              }
            }
          }
        }
      }
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_result__2.v, f_gen_int_lit(v_st, BigInt(128))))
    } else {
      throw Exception("not supported")
    }
  }
}
