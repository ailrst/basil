/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_cmp_fp16_sisd (v_st: LiftState,v_enc: BV) : Unit = {
  val v_cmp__1 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
  val v_abs__1 = Mutable[Boolean](true)
  if (f_eq_bits(v_st, BigInt(3), f_append_bits(v_st, BigInt(2), BigInt(1), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), bvextract(v_st,v_enc,BigInt(11),BigInt(1))), mkBits(v_st, 3, BigInt("000", 2)))) then {
    v_cmp__1.v = mkBits(v_st, 3, BigInt("010", 2))
    v_abs__1.v = false
  } else {
    if (f_eq_bits(v_st, BigInt(3), f_append_bits(v_st, BigInt(2), BigInt(1), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), bvextract(v_st,v_enc,BigInt(11),BigInt(1))), mkBits(v_st, 3, BigInt("010", 2)))) then {
      v_cmp__1.v = mkBits(v_st, 3, BigInt("001", 2))
      v_abs__1.v = false
    } else {
      if (f_eq_bits(v_st, BigInt(3), f_append_bits(v_st, BigInt(2), BigInt(1), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), bvextract(v_st,v_enc,BigInt(11),BigInt(1))), mkBits(v_st, 3, BigInt("011", 2)))) then {
        v_cmp__1.v = mkBits(v_st, 3, BigInt("001", 2))
        v_abs__1.v = true
      } else {
        if (f_eq_bits(v_st, BigInt(3), f_append_bits(v_st, BigInt(2), BigInt(1), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), bvextract(v_st,v_enc,BigInt(11),BigInt(1))), mkBits(v_st, 3, BigInt("110", 2)))) then {
          v_cmp__1.v = mkBits(v_st, 3, BigInt("000", 2))
          v_abs__1.v = false
        } else {
          if (f_eq_bits(v_st, BigInt(3), f_append_bits(v_st, BigInt(2), BigInt(1), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), bvextract(v_st,v_enc,BigInt(11),BigInt(1))), mkBits(v_st, 3, BigInt("111", 2)))) then {
            v_cmp__1.v = mkBits(v_st, 3, BigInt("000", 2))
            v_abs__1.v = true
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
  }
  assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
  assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
  val v_result__1 = Mutable[Expr](rTExprDefault)
  val v_test_passed__1 = Mutable[Expr](rTExprDefault)
  if (v_abs__1.v) then {
    if (f_eq_bits(v_st, BigInt(3), v_cmp__1.v, mkBits(v_st, 3, BigInt("010", 2)))) then {
      val v_Exp18__2 = Mutable[Expr](rTExprDefault)
      v_Exp18__2.v = f_gen_FPCompareEQ(v_st, BigInt(16), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15))), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(15))), f_gen_load(v_st, v_FPCR.v))
      v_test_passed__1.v = v_Exp18__2.v
    } else {
      if (f_eq_bits(v_st, BigInt(3), v_cmp__1.v, mkBits(v_st, 3, BigInt("001", 2)))) then {
        val v_Exp20__2 = Mutable[Expr](rTExprDefault)
        v_Exp20__2.v = f_gen_FPCompareGE(v_st, BigInt(16), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15))), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(15))), f_gen_load(v_st, v_FPCR.v))
        v_test_passed__1.v = v_Exp20__2.v
      } else {
        if (f_eq_bits(v_st, BigInt(3), v_cmp__1.v, mkBits(v_st, 3, BigInt("000", 2)))) then {
          val v_Exp22__2 = Mutable[Expr](rTExprDefault)
          v_Exp22__2.v = f_gen_FPCompareGT(v_st, BigInt(16), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15))), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(15))), f_gen_load(v_st, v_FPCR.v))
          v_test_passed__1.v = v_Exp22__2.v
        } else {
          throw Exception("not supported")
        }
      }
    }
    val v_If25__1 : RTSym = f_decl_bv(v_st, "If25__1", BigInt(16)) 
    val v_temp0 : RTLabel = f_gen_branch(v_st, v_test_passed__1.v) 
    f_switch_context (v_st,f_true_branch(v_st, v_temp0))
    f_gen_store (v_st,v_If25__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1111111111111111", 2))))
    f_switch_context (v_st,f_false_branch(v_st, v_temp0))
    f_gen_store (v_st,v_If25__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))))
    f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
    v_result__1.v = f_gen_load(v_st, v_If25__1)
  } else {
    if (f_eq_bits(v_st, BigInt(3), v_cmp__1.v, mkBits(v_st, 3, BigInt("010", 2)))) then {
      val v_Exp31__2 = Mutable[Expr](rTExprDefault)
      v_Exp31__2.v = f_gen_FPCompareEQ(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      v_test_passed__1.v = v_Exp31__2.v
    } else {
      if (f_eq_bits(v_st, BigInt(3), v_cmp__1.v, mkBits(v_st, 3, BigInt("001", 2)))) then {
        val v_Exp33__2 = Mutable[Expr](rTExprDefault)
        v_Exp33__2.v = f_gen_FPCompareGE(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
        v_test_passed__1.v = v_Exp33__2.v
      } else {
        if (f_eq_bits(v_st, BigInt(3), v_cmp__1.v, mkBits(v_st, 3, BigInt("000", 2)))) then {
          val v_Exp35__2 = Mutable[Expr](rTExprDefault)
          v_Exp35__2.v = f_gen_FPCompareGT(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
          v_test_passed__1.v = v_Exp35__2.v
        } else {
          throw Exception("not supported")
        }
      }
    }
    val v_If38__1 : RTSym = f_decl_bv(v_st, "If38__1", BigInt(16)) 
    val v_temp1 : RTLabel = f_gen_branch(v_st, v_test_passed__1.v) 
    f_switch_context (v_st,f_true_branch(v_st, v_temp1))
    f_gen_store (v_st,v_If38__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1111111111111111", 2))))
    f_switch_context (v_st,f_false_branch(v_st, v_temp1))
    f_gen_store (v_st,v_If38__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))))
    f_switch_context (v_st,f_merge_branch(v_st, v_temp1))
    v_result__1.v = f_gen_load(v_st, v_If38__1)
  }
  assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
  f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_result__1.v, f_gen_int_lit(v_st, BigInt(128))))
}
