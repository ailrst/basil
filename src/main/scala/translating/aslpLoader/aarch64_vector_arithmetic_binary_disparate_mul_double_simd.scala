/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_disparate_mul_double_simd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
      val v_Vpart_read149__2 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_Vpart_read149__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))
      } else {
        v_Vpart_read149__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64))
      }
      val v_Vpart_read160__2 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_Vpart_read160__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64))
      } else {
        v_Vpart_read160__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(64), BigInt(64))
      }
      val v_SignedSatQ175__2 : RTSym = f_decl_bv(v_st, "SignedSatQ175__2", BigInt(32)) 
      val v_SignedSatQ176__2 : RTSym = f_decl_bool(v_st, "SignedSatQ176__2") 
      val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("001111111111111111111111111111111", 2))), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Vpart_read149__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, v_Vpart_read160__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp0))
      f_gen_store (v_st,v_SignedSatQ175__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("01111111111111111111111111111111", 2))))
      f_gen_store (v_st,v_SignedSatQ176__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp0))
      f_gen_store (v_st,v_SignedSatQ175__2,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Vpart_read149__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, v_Vpart_read160__2.v, BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)))
      f_gen_store (v_st,v_SignedSatQ176__2,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
      val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ176__2)) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp1))
      f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp1))
      val v_SignedSatQ190__2 : RTSym = f_decl_bv(v_st, "SignedSatQ190__2", BigInt(32)) 
      val v_SignedSatQ191__2 : RTSym = f_decl_bool(v_st, "SignedSatQ191__2") 
      val v_temp2 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("001111111111111111111111111111111", 2))), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Vpart_read149__2.v, BigInt(16), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, v_Vpart_read160__2.v, BigInt(16), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp2))
      f_gen_store (v_st,v_SignedSatQ190__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("01111111111111111111111111111111", 2))))
      f_gen_store (v_st,v_SignedSatQ191__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp2))
      f_gen_store (v_st,v_SignedSatQ190__2,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Vpart_read149__2.v, BigInt(16), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, v_Vpart_read160__2.v, BigInt(16), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)))
      f_gen_store (v_st,v_SignedSatQ191__2,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp2))
      val v_temp3 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ191__2)) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp3))
      f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp3))
      val v_SignedSatQ204__2 : RTSym = f_decl_bv(v_st, "SignedSatQ204__2", BigInt(32)) 
      val v_SignedSatQ205__2 : RTSym = f_decl_bool(v_st, "SignedSatQ205__2") 
      val v_temp4 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("001111111111111111111111111111111", 2))), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Vpart_read149__2.v, BigInt(32), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, v_Vpart_read160__2.v, BigInt(32), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp4))
      f_gen_store (v_st,v_SignedSatQ204__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("01111111111111111111111111111111", 2))))
      f_gen_store (v_st,v_SignedSatQ205__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp4))
      f_gen_store (v_st,v_SignedSatQ204__2,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Vpart_read149__2.v, BigInt(32), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, v_Vpart_read160__2.v, BigInt(32), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)))
      f_gen_store (v_st,v_SignedSatQ205__2,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp4))
      val v_temp5 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ205__2)) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp5))
      f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp5))
      val v_SignedSatQ218__2 : RTSym = f_decl_bv(v_st, "SignedSatQ218__2", BigInt(32)) 
      val v_SignedSatQ219__2 : RTSym = f_decl_bool(v_st, "SignedSatQ219__2") 
      val v_temp6 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("001111111111111111111111111111111", 2))), f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Vpart_read149__2.v, BigInt(48), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, v_Vpart_read160__2.v, BigInt(48), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp6))
      f_gen_store (v_st,v_SignedSatQ218__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("01111111111111111111111111111111", 2))))
      f_gen_store (v_st,v_SignedSatQ219__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp6))
      f_gen_store (v_st,v_SignedSatQ218__2,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_mul_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(17), BigInt(33), f_gen_mul_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, v_Vpart_read149__2.v, BigInt(48), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_int_lit(v_st, BigInt(33))), f_gen_SignExtend(v_st, BigInt(16), BigInt(33), f_gen_slice(v_st, v_Vpart_read160__2.v, BigInt(48), BigInt(16)), f_gen_int_lit(v_st, BigInt(33)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)))
      f_gen_store (v_st,v_SignedSatQ219__2,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp6))
      val v_temp7 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ219__2)) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp7))
      f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp7))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_load(v_st, v_SignedSatQ218__2), f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_SignedSatQ204__2), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_SignedSatQ190__2), f_gen_load(v_st, v_SignedSatQ175__2)))))
    } else {
      val v_Vpart_read235__2 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_Vpart_read235__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))
      } else {
        v_Vpart_read235__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64))
      }
      val v_Vpart_read246__2 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_Vpart_read246__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64))
      } else {
        v_Vpart_read246__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(64), BigInt(64))
      }
      val v_SignedSatQ261__2 : RTSym = f_decl_bv(v_st, "SignedSatQ261__2", BigInt(64)) 
      val v_SignedSatQ262__2 : RTSym = f_decl_bool(v_st, "SignedSatQ262__2") 
      val v_temp8 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), f_gen_bit_lit(v_st, BigInt(65), mkBits(v_st, 65, BigInt("00111111111111111111111111111111111111111111111111111111111111111", 2))), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Vpart_read235__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, v_Vpart_read246__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp8))
      f_gen_store (v_st,v_SignedSatQ261__2,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0111111111111111111111111111111111111111111111111111111111111111", 2))))
      f_gen_store (v_st,v_SignedSatQ262__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp8))
      f_gen_store (v_st,v_SignedSatQ261__2,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Vpart_read235__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, v_Vpart_read246__2.v, BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)))
      f_gen_store (v_st,v_SignedSatQ262__2,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp8))
      val v_temp9 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ262__2)) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp9))
      f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp9))
      val v_SignedSatQ276__2 : RTSym = f_decl_bv(v_st, "SignedSatQ276__2", BigInt(64)) 
      val v_SignedSatQ277__2 : RTSym = f_decl_bool(v_st, "SignedSatQ277__2") 
      val v_temp10 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), f_gen_bit_lit(v_st, BigInt(65), mkBits(v_st, 65, BigInt("00111111111111111111111111111111111111111111111111111111111111111", 2))), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Vpart_read235__2.v, BigInt(32), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, v_Vpart_read246__2.v, BigInt(32), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp10))
      f_gen_store (v_st,v_SignedSatQ276__2,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0111111111111111111111111111111111111111111111111111111111111111", 2))))
      f_gen_store (v_st,v_SignedSatQ277__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp10))
      f_gen_store (v_st,v_SignedSatQ276__2,f_gen_slice(v_st, f_gen_slice(v_st, f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_mul_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000010", 2))), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, v_Vpart_read235__2.v, BigInt(32), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(32), BigInt(65), f_gen_slice(v_st, v_Vpart_read246__2.v, BigInt(32), BigInt(32)), f_gen_int_lit(v_st, BigInt(65)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)))
      f_gen_store (v_st,v_SignedSatQ277__2,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp10))
      val v_temp11 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_SignedSatQ277__2)) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp11))
      f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp11))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_load(v_st, v_SignedSatQ276__2), f_gen_load(v_st, v_SignedSatQ261__2)))
    }
  }
}
