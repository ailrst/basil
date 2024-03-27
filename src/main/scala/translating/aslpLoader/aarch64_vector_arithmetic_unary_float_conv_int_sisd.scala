/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_float_conv_int_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp6__2 : RTSym = f_decl_bv(v_st, "Exp6__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp6__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    val v_FPDecodeRounding9__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding9__3", BigInt(3)) 
    val v_temp0 = Mutable[RTLabel](rTLabelDefault)
    val v_temp1 = Mutable[RTLabel](rTLabelDefault)
    val v_temp2 = Mutable[RTLabel](rTLabelDefault)
    val (tmp72304,tmp72305,tmp72306) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
    v_temp0.v = tmp72304
    v_temp1.v = tmp72305
    v_temp2.v = tmp72306
    f_switch_context (v_st,v_temp0.v)
    f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
    f_switch_context (v_st,v_temp1.v)
    val v_temp3 = Mutable[RTLabel](rTLabelDefault)
    val v_temp4 = Mutable[RTLabel](rTLabelDefault)
    val v_temp5 = Mutable[RTLabel](rTLabelDefault)
    val (tmp72307,tmp72308,tmp72309) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
    v_temp3.v = tmp72307
    v_temp4.v = tmp72308
    v_temp5.v = tmp72309
    f_switch_context (v_st,v_temp3.v)
    f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
    f_switch_context (v_st,v_temp4.v)
    val v_temp6 = Mutable[RTLabel](rTLabelDefault)
    val v_temp7 = Mutable[RTLabel](rTLabelDefault)
    val v_temp8 = Mutable[RTLabel](rTLabelDefault)
    val (tmp72310,tmp72311,tmp72312) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
    v_temp6.v = tmp72310
    v_temp7.v = tmp72311
    v_temp8.v = tmp72312
    f_switch_context (v_st,v_temp6.v)
    f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
    f_switch_context (v_st,v_temp7.v)
    val v_temp9 = Mutable[RTLabel](rTLabelDefault)
    val v_temp10 = Mutable[RTLabel](rTLabelDefault)
    val v_temp11 = Mutable[RTLabel](rTLabelDefault)
    val (tmp72313,tmp72314,tmp72315) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
    v_temp9.v = tmp72313
    v_temp10.v = tmp72314
    v_temp11.v = tmp72315
    f_switch_context (v_st,v_temp9.v)
    f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
    f_switch_context (v_st,v_temp10.v)
    f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
    f_switch_context (v_st,v_temp11.v)
    f_switch_context (v_st,v_temp8.v)
    f_switch_context (v_st,v_temp5.v)
    f_switch_context (v_st,v_temp2.v)
    val v_Exp13__2 : RTSym = f_decl_bv(v_st, "Exp13__2", BigInt(32)) 
    f_gen_store (v_st,v_Exp13__2,f_gen_FixedToFP(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3))))
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_Exp13__2), f_gen_int_lit(v_st, BigInt(128))))
  } else {
    if (f_eq_bits(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      val v_Exp23__2 : RTSym = f_decl_bv(v_st, "Exp23__2", BigInt(128)) 
      f_gen_store (v_st,v_Exp23__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
      val v_FPDecodeRounding26__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding26__3", BigInt(3)) 
      val v_temp12 = Mutable[RTLabel](rTLabelDefault)
      val v_temp13 = Mutable[RTLabel](rTLabelDefault)
      val v_temp14 = Mutable[RTLabel](rTLabelDefault)
      val (tmp72316,tmp72317,tmp72318) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
      v_temp12.v = tmp72316
      v_temp13.v = tmp72317
      v_temp14.v = tmp72318
      f_switch_context (v_st,v_temp12.v)
      f_gen_store (v_st,v_FPDecodeRounding26__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
      f_switch_context (v_st,v_temp13.v)
      val v_temp15 = Mutable[RTLabel](rTLabelDefault)
      val v_temp16 = Mutable[RTLabel](rTLabelDefault)
      val v_temp17 = Mutable[RTLabel](rTLabelDefault)
      val (tmp72319,tmp72320,tmp72321) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
      v_temp15.v = tmp72319
      v_temp16.v = tmp72320
      v_temp17.v = tmp72321
      f_switch_context (v_st,v_temp15.v)
      f_gen_store (v_st,v_FPDecodeRounding26__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
      f_switch_context (v_st,v_temp16.v)
      val v_temp18 = Mutable[RTLabel](rTLabelDefault)
      val v_temp19 = Mutable[RTLabel](rTLabelDefault)
      val v_temp20 = Mutable[RTLabel](rTLabelDefault)
      val (tmp72322,tmp72323,tmp72324) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
      v_temp18.v = tmp72322
      v_temp19.v = tmp72323
      v_temp20.v = tmp72324
      f_switch_context (v_st,v_temp18.v)
      f_gen_store (v_st,v_FPDecodeRounding26__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
      f_switch_context (v_st,v_temp19.v)
      val v_temp21 = Mutable[RTLabel](rTLabelDefault)
      val v_temp22 = Mutable[RTLabel](rTLabelDefault)
      val v_temp23 = Mutable[RTLabel](rTLabelDefault)
      val (tmp72325,tmp72326,tmp72327) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
      v_temp21.v = tmp72325
      v_temp22.v = tmp72326
      v_temp23.v = tmp72327
      f_switch_context (v_st,v_temp21.v)
      f_gen_store (v_st,v_FPDecodeRounding26__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
      f_switch_context (v_st,v_temp22.v)
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,v_temp23.v)
      f_switch_context (v_st,v_temp20.v)
      f_switch_context (v_st,v_temp17.v)
      f_switch_context (v_st,v_temp14.v)
      val v_Exp30__2 : RTSym = f_decl_bv(v_st, "Exp30__2", BigInt(64)) 
      f_gen_store (v_st,v_Exp30__2,f_gen_FixedToFP(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_Exp23__2), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding26__3))))
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_Exp30__2), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      throw Exception("not supported")
    }
  }
}
