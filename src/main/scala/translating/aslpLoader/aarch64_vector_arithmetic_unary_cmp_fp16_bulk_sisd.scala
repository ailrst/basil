/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_cmp_fp16_bulk_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_comparison__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(3)))
  if (f_eq_bits(v_st, BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), BitVecLiteral(BigInt("00", 2), 2))) then {
    v_comparison__1.v = BitVecLiteral(BigInt("000", 2), 3)
  } else {
    if (f_eq_bits(v_st, BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), BitVecLiteral(BigInt("01", 2), 2))) then {
      v_comparison__1.v = BitVecLiteral(BigInt("001", 2), 3)
    } else {
      if (f_eq_bits(v_st, BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), BitVecLiteral(BigInt("10", 2), 2))) then {
        v_comparison__1.v = BitVecLiteral(BigInt("010", 2), 3)
      } else {
        if (f_eq_bits(v_st, BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), BitVecLiteral(BigInt("11", 2), 2))) then {
          v_comparison__1.v = BitVecLiteral(BigInt("011", 2), 3)
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  val v_test_passed__1 : RTSym = f_decl_bool(v_st, "test_passed__1") 
  if (f_eq_bits(v_st, BigInt(3), v_comparison__1.v, BitVecLiteral(BigInt("000", 2), 3))) then {
    val v_Exp13__2 : RTSym = f_decl_bool(v_st, "Exp13__2") 
    f_gen_store (v_st,v_Exp13__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_load(v_st, v_FPCR.v)))
    f_gen_store (v_st,v_test_passed__1,f_gen_load(v_st, v_Exp13__2))
  } else {
    if (f_eq_bits(v_st, BigInt(3), v_comparison__1.v, BitVecLiteral(BigInt("001", 2), 3))) then {
      val v_Exp15__2 : RTSym = f_decl_bool(v_st, "Exp15__2") 
      f_gen_store (v_st,v_Exp15__2,f_gen_FPCompareGE(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_load(v_st, v_FPCR.v)))
      f_gen_store (v_st,v_test_passed__1,f_gen_load(v_st, v_Exp15__2))
    } else {
      if (f_eq_bits(v_st, BigInt(3), v_comparison__1.v, BitVecLiteral(BigInt("010", 2), 3))) then {
        val v_Exp17__2 : RTSym = f_decl_bool(v_st, "Exp17__2") 
        f_gen_store (v_st,v_Exp17__2,f_gen_FPCompareEQ(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_load(v_st, v_FPCR.v)))
        f_gen_store (v_st,v_test_passed__1,f_gen_load(v_st, v_Exp17__2))
      } else {
        if (f_eq_bits(v_st, BigInt(3), v_comparison__1.v, BitVecLiteral(BigInt("011", 2), 3))) then {
          val v_Exp19__2 : RTSym = f_decl_bool(v_st, "Exp19__2") 
          f_gen_store (v_st,v_Exp19__2,f_gen_FPCompareGE(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
          f_gen_store (v_st,v_test_passed__1,f_gen_load(v_st, v_Exp19__2))
        } else {
          if (f_eq_bits(v_st, BigInt(3), v_comparison__1.v, BitVecLiteral(BigInt("100", 2), 3))) then {
            val v_Exp21__2 : RTSym = f_decl_bool(v_st, "Exp21__2") 
            f_gen_store (v_st,v_Exp21__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
            f_gen_store (v_st,v_test_passed__1,f_gen_load(v_st, v_Exp21__2))
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
  }
  val v_If24__1 : RTSym = f_decl_bv(v_st, "If24__1", BigInt(16)) 
  val v_temp0 = Mutable[RTLabel](rTLabelDefault)
  val v_temp1 = Mutable[RTLabel](rTLabelDefault)
  val v_temp2 = Mutable[RTLabel](rTLabelDefault)
  val (tmp67127,tmp67128,tmp67129) = f_gen_branch(v_st, f_gen_load(v_st, v_test_passed__1)) 
  v_temp0.v = tmp67127
  v_temp1.v = tmp67128
  v_temp2.v = tmp67129
  f_switch_context (v_st,v_temp0.v)
  f_gen_store (v_st,v_If24__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
  f_switch_context (v_st,v_temp1.v)
  f_gen_store (v_st,v_If24__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
  f_switch_context (v_st,v_temp2.v)
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_If24__1), f_gen_int_lit(v_st, BigInt(128))))
}
