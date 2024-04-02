/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_cmp_bitwise_sisd (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_ne_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      val v_result__1 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
        val v_If16__1 : RTSym = f_decl_bv(v_st, "If16__1", BigInt(8)) 
        val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(8), f_gen_and_bits(v_st, BigInt(8), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(8))), f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp0))
        f_gen_store (v_st,v_If16__1,f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("11111111", 2))))
        f_switch_context (v_st,f_false_branch(v_st, v_temp0))
        f_gen_store (v_st,v_If16__1,f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2))))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
        v_result__1.v = f_gen_load(v_st, v_If16__1)
      } else {
        val v_If21__1 : RTSym = f_decl_bv(v_st, "If21__1", BigInt(8)) 
        val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(8), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(8)))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp1))
        f_gen_store (v_st,v_If21__1,f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("11111111", 2))))
        f_switch_context (v_st,f_false_branch(v_st, v_temp1))
        f_gen_store (v_st,v_If21__1,f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2))))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp1))
        v_result__1.v = f_gen_load(v_st, v_If21__1)
      }
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(8), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
    } else {
      if (f_eq_bits(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        val v_result__1 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
          val v_If43__1 : RTSym = f_decl_bv(v_st, "If43__1", BigInt(16)) 
          val v_temp2 : RTLabel = f_gen_branch(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(16), f_gen_and_bits(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16))), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2)))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp2))
          f_gen_store (v_st,v_If43__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1111111111111111", 2))))
          f_switch_context (v_st,f_false_branch(v_st, v_temp2))
          f_gen_store (v_st,v_If43__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp2))
          v_result__1.v = f_gen_load(v_st, v_If43__1)
        } else {
          val v_If48__1 : RTSym = f_decl_bv(v_st, "If48__1", BigInt(16)) 
          val v_temp3 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp3))
          f_gen_store (v_st,v_If48__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1111111111111111", 2))))
          f_switch_context (v_st,f_false_branch(v_st, v_temp3))
          f_gen_store (v_st,v_If48__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp3))
          v_result__1.v = f_gen_load(v_st, v_If48__1)
        }
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
      } else {
        if (f_eq_bits(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          val v_result__1 = Mutable[Expr](rTExprDefault)
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
            val v_If70__1 : RTSym = f_decl_bv(v_st, "If70__1", BigInt(32)) 
            val v_temp4 : RTLabel = f_gen_branch(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(32), f_gen_and_bits(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))), f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))))) 
            f_switch_context (v_st,f_true_branch(v_st, v_temp4))
            f_gen_store (v_st,v_If70__1,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
            f_switch_context (v_st,f_false_branch(v_st, v_temp4))
            f_gen_store (v_st,v_If70__1,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))
            f_switch_context (v_st,f_merge_branch(v_st, v_temp4))
            v_result__1.v = f_gen_load(v_st, v_If70__1)
          } else {
            val v_If75__1 : RTSym = f_decl_bv(v_st, "If75__1", BigInt(32)) 
            val v_temp5 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))) 
            f_switch_context (v_st,f_true_branch(v_st, v_temp5))
            f_gen_store (v_st,v_If75__1,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
            f_switch_context (v_st,f_false_branch(v_st, v_temp5))
            f_gen_store (v_st,v_If75__1,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))
            f_switch_context (v_st,f_merge_branch(v_st, v_temp5))
            v_result__1.v = f_gen_load(v_st, v_If75__1)
          }
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
        } else {
          if (f_eq_bits(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
            assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
            assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
            val v_result__1 = Mutable[Expr](rTExprDefault)
            if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
              val v_If97__1 : RTSym = f_decl_bv(v_st, "If97__1", BigInt(64)) 
              val v_temp6 : RTLabel = f_gen_branch(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(64), f_gen_and_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64))), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))))) 
              f_switch_context (v_st,f_true_branch(v_st, v_temp6))
              f_gen_store (v_st,v_If97__1,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2))))
              f_switch_context (v_st,f_false_branch(v_st, v_temp6))
              f_gen_store (v_st,v_If97__1,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
              f_switch_context (v_st,f_merge_branch(v_st, v_temp6))
              v_result__1.v = f_gen_load(v_st, v_If97__1)
            } else {
              val v_If102__1 : RTSym = f_decl_bv(v_st, "If102__1", BigInt(64)) 
              val v_temp7 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)))) 
              f_switch_context (v_st,f_true_branch(v_st, v_temp7))
              f_gen_store (v_st,v_If102__1,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2))))
              f_switch_context (v_st,f_false_branch(v_st, v_temp7))
              f_gen_store (v_st,v_If102__1,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
              f_switch_context (v_st,f_merge_branch(v_st, v_temp7))
              v_result__1.v = f_gen_load(v_st, v_If102__1)
            }
            assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
            f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
  }
}
