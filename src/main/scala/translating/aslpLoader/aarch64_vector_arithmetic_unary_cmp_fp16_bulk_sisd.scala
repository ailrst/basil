/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_cmp_fp16_bulk_sisd (v_st: LiftState,v_enc: BV) : Unit = {
  val v_comparison__1 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
  v_comparison__1.v = f_ZeroExtend(v_st, BigInt(2), BigInt(3), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), BigInt(3))
  assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
  val v_test_passed__1 = Mutable[Expr](rTExprDefault)
  if (f_eq_bits(v_st, BigInt(3), v_comparison__1.v, mkBits(v_st, 3, BigInt("000", 2)))) then {
    val v_Exp13__2 = Mutable[Expr](rTExprDefault)
    v_Exp13__2.v = f_gen_FPCompareGT(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))), f_gen_load(v_st, v_FPCR.v))
    v_test_passed__1.v = v_Exp13__2.v
  } else {
    if (f_eq_bits(v_st, BigInt(3), v_comparison__1.v, mkBits(v_st, 3, BigInt("001", 2)))) then {
      val v_Exp15__2 = Mutable[Expr](rTExprDefault)
      v_Exp15__2.v = f_gen_FPCompareGE(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))), f_gen_load(v_st, v_FPCR.v))
      v_test_passed__1.v = v_Exp15__2.v
    } else {
      if (f_eq_bits(v_st, BigInt(3), v_comparison__1.v, mkBits(v_st, 3, BigInt("010", 2)))) then {
        val v_Exp17__2 = Mutable[Expr](rTExprDefault)
        v_Exp17__2.v = f_gen_FPCompareEQ(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))), f_gen_load(v_st, v_FPCR.v))
        v_test_passed__1.v = v_Exp17__2.v
      } else {
        if (f_eq_bits(v_st, BigInt(3), v_comparison__1.v, mkBits(v_st, 3, BigInt("011", 2)))) then {
          val v_Exp19__2 = Mutable[Expr](rTExprDefault)
          v_Exp19__2.v = f_gen_FPCompareGE(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
          v_test_passed__1.v = v_Exp19__2.v
        } else {
          if (f_eq_bits(v_st, BigInt(3), v_comparison__1.v, mkBits(v_st, 3, BigInt("100", 2)))) then {
            val v_Exp21__2 = Mutable[Expr](rTExprDefault)
            v_Exp21__2.v = f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
            v_test_passed__1.v = v_Exp21__2.v
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
  }
  val v_If24__1 : RTSym = f_decl_bv(v_st, "If24__1", BigInt(16)) 
  val v_temp0 : RTLabel = f_gen_branch(v_st, v_test_passed__1.v) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp0))
  f_gen_store (v_st,v_If24__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1111111111111111", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp0))
  f_gen_store (v_st,v_If24__1,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
  assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
  f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_If24__1), f_gen_int_lit(v_st, BigInt(128))))
}
