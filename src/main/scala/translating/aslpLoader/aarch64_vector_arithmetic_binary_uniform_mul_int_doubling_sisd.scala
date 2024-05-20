/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_mul_int_doubling_sisd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
      val v_Exp38__2 = Mutable[Expr](rTExprDefault)
      v_Exp38__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_Exp41__2 = Mutable[Expr](rTExprDefault)
      v_Exp41__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
      val v_If42__1 = Mutable[BV](mkBits(v_st, BigInt(16), BigInt(0)))
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        v_If42__1.v = mkBits(v_st, 16, BigInt("1000000000000000", 2))
      } else {
        v_If42__1.v = mkBits(v_st, 16, BigInt("0000000000000000", 2))
      }
      val v_SignedSatQ49__2 : RTSym = f_decl_bv(v_st, "SignedSatQ49__2", BigInt(16)) 
      val v_SignedSatQ50__2 : RTSym = f_decl_bool(v_st, "SignedSatQ50__2") 
      val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000111111111111111", 2))), f_gen_asr_bits(v_st, BigInt(33), BigInt(6), f_gen_add_bits(v_st, BigInt(33), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Exp38__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, v_Exp41__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), f_ZeroExtend(v_st, BigInt(16), BigInt(33), v_If42__1.v, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(6), mkBits(v_st, 6, BigInt("010000", 2)))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp0))
      f_gen_store (v_st,v_SignedSatQ49__2,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0111111111111111", 2))))
      f_gen_store (v_st,v_SignedSatQ50__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp0))
      val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_asr_bits(v_st, BigInt(33), BigInt(6), f_gen_add_bits(v_st, BigInt(33), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Exp38__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, v_Exp41__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), f_ZeroExtend(v_st, BigInt(16), BigInt(33), v_If42__1.v, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(6), mkBits(v_st, 6, BigInt("010000", 2)))), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("111111111111111111000000000000000", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp1))
      f_gen_store (v_st,v_SignedSatQ49__2,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1000000000000000", 2))))
      f_gen_store (v_st,v_SignedSatQ50__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp1))
      f_gen_store (v_st,v_SignedSatQ49__2,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_asr_bits(v_st, BigInt(33), BigInt(6), f_gen_add_bits(v_st, BigInt(33), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Exp38__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, v_Exp41__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), f_ZeroExtend(v_st, BigInt(16), BigInt(33), v_If42__1.v, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(6), mkBits(v_st, 6, BigInt("010000", 2)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)))
      f_gen_store (v_st,v_SignedSatQ50__2,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
      val v_temp2 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ50__2)) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp2))
      f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp2))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_SignedSatQ49__2), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      val v_Exp68__2 = Mutable[Expr](rTExprDefault)
      v_Exp68__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_Exp71__2 = Mutable[Expr](rTExprDefault)
      v_Exp71__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
      val v_If72__1 = Mutable[BV](mkBits(v_st, BigInt(32), BigInt(0)))
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        v_If72__1.v = mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))
      } else {
        v_If72__1.v = mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))
      }
      val v_SignedSatQ79__2 : RTSym = f_decl_bv(v_st, "SignedSatQ79__2", BigInt(32)) 
      val v_SignedSatQ80__2 : RTSym = f_decl_bool(v_st, "SignedSatQ80__2") 
      val v_temp3 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), f_gen_bit_lit(v_st, BigInt(65), mkBits(v_st, 65, BigInt("00000000000000000000000000000000001111111111111111111111111111111", 2))), f_gen_asr_bits(v_st, BigInt(65), BigInt(7), f_gen_add_bits(v_st, BigInt(65), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Exp68__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, v_Exp71__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), f_ZeroExtend(v_st, BigInt(32), BigInt(65), v_If72__1.v, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(7), mkBits(v_st, 7, BigInt("0100000", 2)))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp3))
      f_gen_store (v_st,v_SignedSatQ79__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("01111111111111111111111111111111", 2))))
      f_gen_store (v_st,v_SignedSatQ80__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp3))
      val v_temp4 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), f_gen_asr_bits(v_st, BigInt(65), BigInt(7), f_gen_add_bits(v_st, BigInt(65), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Exp68__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, v_Exp71__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), f_ZeroExtend(v_st, BigInt(32), BigInt(65), v_If72__1.v, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(7), mkBits(v_st, 7, BigInt("0100000", 2)))), f_gen_bit_lit(v_st, BigInt(65), mkBits(v_st, 65, BigInt("11111111111111111111111111111111110000000000000000000000000000000", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp4))
      f_gen_store (v_st,v_SignedSatQ79__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))))
      f_gen_store (v_st,v_SignedSatQ80__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp4))
      f_gen_store (v_st,v_SignedSatQ79__2,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_asr_bits(v_st, BigInt(65), BigInt(7), f_gen_add_bits(v_st, BigInt(65), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Exp68__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, v_Exp71__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), f_ZeroExtend(v_st, BigInt(32), BigInt(65), v_If72__1.v, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(7), mkBits(v_st, 7, BigInt("0100000", 2)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)))
      f_gen_store (v_st,v_SignedSatQ80__2,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp3))
      val v_temp5 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ80__2)) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp5))
      f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp5))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_SignedSatQ79__2), f_gen_int_lit(v_st, BigInt(128))))
    }
  }
}
