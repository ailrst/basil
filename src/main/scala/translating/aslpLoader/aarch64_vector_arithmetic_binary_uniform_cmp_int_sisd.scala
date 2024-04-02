/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_cmp_int_sisd (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_ne_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      val v_Exp10__2 = Mutable[Expr](rTExprDefault)
      v_Exp10__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
      val v_If13__2 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
        v_If13__2.v = f_gen_ZeroExtend(v_st, BigInt(8), BigInt(9), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(9)))
      } else {
        v_If13__2.v = f_gen_SignExtend(v_st, BigInt(8), BigInt(9), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(9)))
      }
      val v_If18__2 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
        v_If18__2.v = f_gen_ZeroExtend(v_st, BigInt(8), BigInt(9), f_gen_slice(v_st, v_Exp10__2.v, BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(9)))
      } else {
        v_If18__2.v = f_gen_SignExtend(v_st, BigInt(8), BigInt(9), f_gen_slice(v_st, v_Exp10__2.v, BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(9)))
      }
      val v_If21__1 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
        v_If21__1.v = f_gen_sle_bits(v_st, BigInt(9), v_If18__2.v, v_If13__2.v)
      } else {
        v_If21__1.v = f_gen_slt_bits(v_st, BigInt(9), v_If18__2.v, v_If13__2.v)
      }
      val v_If23__1 : RTSym = f_decl_bv(v_st, "If23__1", BigInt(8)) 
      val v_temp0 : RTLabel = f_gen_branch(v_st, v_If21__1.v) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp0))
      f_gen_store (v_st,v_If23__1,f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("11111111", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp0))
      f_gen_store (v_st,v_If23__1,f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(8), BigInt(128), f_gen_load(v_st, v_If23__1), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      if (f_eq_bits(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        val v_Exp38__2 = Mutable[Expr](rTExprDefault)
        v_Exp38__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
        val v_If41__2 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
          v_If41__2.v = f_gen_ZeroExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))
        } else {
          v_If41__2.v = f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))
        }
        val v_If46__2 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
          v_If46__2.v = f_gen_ZeroExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Exp38__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))
        } else {
          v_If46__2.v = f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Exp38__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))
        }
        val v_If49__1 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
          v_If49__1.v = f_gen_sle_bits(v_st, BigInt(17), v_If46__2.v, v_If41__2.v)
        } else {
          v_If49__1.v = f_gen_slt_bits(v_st, BigInt(17), v_If46__2.v, v_If41__2.v)
        }
        val v_If51__1 : RTSym = f_decl_bv(v_st, "If51__1", BigInt(16)) 
        val v_temp1 : RTLabel = f_gen_branch(v_st, v_If49__1.v) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp1))
        f_gen_store (v_st,v_If51__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1111111111111111", 2))))
        f_switch_context (v_st,f_false_branch(v_st, v_temp1))
        f_gen_store (v_st,v_If51__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp1))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_If51__1), f_gen_int_lit(v_st, BigInt(128))))
      } else {
        if (f_eq_bits(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          val v_Exp66__2 = Mutable[Expr](rTExprDefault)
          v_Exp66__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
          val v_If69__2 = Mutable[Expr](rTExprDefault)
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
            v_If69__2.v = f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))
          } else {
            v_If69__2.v = f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))
          }
          val v_If74__2 = Mutable[Expr](rTExprDefault)
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
            v_If74__2.v = f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Exp66__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))
          } else {
            v_If74__2.v = f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Exp66__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))
          }
          val v_If77__1 = Mutable[Expr](rTExprDefault)
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
            v_If77__1.v = f_gen_sle_bits(v_st, BigInt(33), v_If74__2.v, v_If69__2.v)
          } else {
            v_If77__1.v = f_gen_slt_bits(v_st, BigInt(33), v_If74__2.v, v_If69__2.v)
          }
          val v_If79__1 : RTSym = f_decl_bv(v_st, "If79__1", BigInt(32)) 
          val v_temp2 : RTLabel = f_gen_branch(v_st, v_If77__1.v) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp2))
          f_gen_store (v_st,v_If79__1,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
          f_switch_context (v_st,f_false_branch(v_st, v_temp2))
          f_gen_store (v_st,v_If79__1,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp2))
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_If79__1), f_gen_int_lit(v_st, BigInt(128))))
        } else {
          if (f_eq_bits(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
            assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
            assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
            val v_Exp94__2 = Mutable[Expr](rTExprDefault)
            v_Exp94__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
            val v_If97__2 = Mutable[Expr](rTExprDefault)
            if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
              v_If97__2.v = f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65)))
            } else {
              v_If97__2.v = f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65)))
            }
            val v_If102__2 = Mutable[Expr](rTExprDefault)
            if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
              v_If102__2.v = f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, v_Exp94__2.v, BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65)))
            } else {
              v_If102__2.v = f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, v_Exp94__2.v, BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65)))
            }
            val v_If105__1 = Mutable[Expr](rTExprDefault)
            if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
              v_If105__1.v = f_gen_sle_bits(v_st, BigInt(65), v_If102__2.v, v_If97__2.v)
            } else {
              v_If105__1.v = f_gen_slt_bits(v_st, BigInt(65), v_If102__2.v, v_If97__2.v)
            }
            val v_If107__1 : RTSym = f_decl_bv(v_st, "If107__1", BigInt(64)) 
            val v_temp3 : RTLabel = f_gen_branch(v_st, v_If105__1.v) 
            f_switch_context (v_st,f_true_branch(v_st, v_temp3))
            f_gen_store (v_st,v_If107__1,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2))))
            f_switch_context (v_st,f_false_branch(v_st, v_temp3))
            f_gen_store (v_st,v_If107__1,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
            f_switch_context (v_st,f_merge_branch(v_st, v_temp3))
            assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
            f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_If107__1), f_gen_int_lit(v_st, BigInt(128))))
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
  }
}
