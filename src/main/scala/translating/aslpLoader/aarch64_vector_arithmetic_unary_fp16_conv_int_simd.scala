/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_fp16_conv_int_simd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp6__2 : RTSym = f_decl_bv(v_st, "Exp6__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp6__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    val v_FPDecodeRounding9__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding9__3", BigInt(3)) 
    val v_temp0 = Mutable[RTLabel](rTLabelDefault)
    val v_temp1 = Mutable[RTLabel](rTLabelDefault)
    val v_temp2 = Mutable[RTLabel](rTLabelDefault)
    val (tmp72812,tmp72813,tmp72814) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
    v_temp0.v = tmp72812
    v_temp1.v = tmp72813
    v_temp2.v = tmp72814
    f_switch_context (v_st,v_temp0.v)
    f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
    f_switch_context (v_st,v_temp1.v)
    val v_temp3 = Mutable[RTLabel](rTLabelDefault)
    val v_temp4 = Mutable[RTLabel](rTLabelDefault)
    val v_temp5 = Mutable[RTLabel](rTLabelDefault)
    val (tmp72815,tmp72816,tmp72817) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
    v_temp3.v = tmp72815
    v_temp4.v = tmp72816
    v_temp5.v = tmp72817
    f_switch_context (v_st,v_temp3.v)
    f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
    f_switch_context (v_st,v_temp4.v)
    val v_temp6 = Mutable[RTLabel](rTLabelDefault)
    val v_temp7 = Mutable[RTLabel](rTLabelDefault)
    val v_temp8 = Mutable[RTLabel](rTLabelDefault)
    val (tmp72818,tmp72819,tmp72820) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
    v_temp6.v = tmp72818
    v_temp7.v = tmp72819
    v_temp8.v = tmp72820
    f_switch_context (v_st,v_temp6.v)
    f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
    f_switch_context (v_st,v_temp7.v)
    val v_temp9 = Mutable[RTLabel](rTLabelDefault)
    val v_temp10 = Mutable[RTLabel](rTLabelDefault)
    val v_temp11 = Mutable[RTLabel](rTLabelDefault)
    val (tmp72821,tmp72822,tmp72823) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
    v_temp9.v = tmp72821
    v_temp10.v = tmp72822
    v_temp11.v = tmp72823
    f_switch_context (v_st,v_temp9.v)
    f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
    f_switch_context (v_st,v_temp10.v)
    f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
    f_switch_context (v_st,v_temp11.v)
    f_switch_context (v_st,v_temp8.v)
    f_switch_context (v_st,v_temp5.v)
    f_switch_context (v_st,v_temp2.v)
    val v_Exp13__2 : RTSym = f_decl_bv(v_st, "Exp13__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp13__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3))))
    val v_Exp16__2 : RTSym = f_decl_bv(v_st, "Exp16__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp16__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(16), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3))))
    val v_Exp19__2 : RTSym = f_decl_bv(v_st, "Exp19__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp19__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(32), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3))))
    val v_Exp22__2 : RTSym = f_decl_bv(v_st, "Exp22__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp22__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(48), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3))))
    val v_Exp25__2 : RTSym = f_decl_bv(v_st, "Exp25__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp25__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(64), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3))))
    val v_Exp28__2 : RTSym = f_decl_bv(v_st, "Exp28__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp28__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(80), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3))))
    val v_Exp31__2 : RTSym = f_decl_bv(v_st, "Exp31__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp31__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(96), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3))))
    val v_Exp34__2 : RTSym = f_decl_bv(v_st, "Exp34__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp34__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(112), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3))))
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(16), BigInt(112), f_gen_load(v_st, v_Exp34__2), f_gen_append_bits(v_st, BigInt(16), BigInt(96), f_gen_load(v_st, v_Exp31__2), f_gen_append_bits(v_st, BigInt(16), BigInt(80), f_gen_load(v_st, v_Exp28__2), f_gen_append_bits(v_st, BigInt(16), BigInt(64), f_gen_load(v_st, v_Exp25__2), f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_load(v_st, v_Exp22__2), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp19__2), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_Exp16__2), f_gen_load(v_st, v_Exp13__2)))))))))
  } else {
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp43__2 : RTSym = f_decl_bv(v_st, "Exp43__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp43__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    val v_FPDecodeRounding46__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding46__3", BigInt(3)) 
    val v_temp12 = Mutable[RTLabel](rTLabelDefault)
    val v_temp13 = Mutable[RTLabel](rTLabelDefault)
    val v_temp14 = Mutable[RTLabel](rTLabelDefault)
    val (tmp72824,tmp72825,tmp72826) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
    v_temp12.v = tmp72824
    v_temp13.v = tmp72825
    v_temp14.v = tmp72826
    f_switch_context (v_st,v_temp12.v)
    f_gen_store (v_st,v_FPDecodeRounding46__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
    f_switch_context (v_st,v_temp13.v)
    val v_temp15 = Mutable[RTLabel](rTLabelDefault)
    val v_temp16 = Mutable[RTLabel](rTLabelDefault)
    val v_temp17 = Mutable[RTLabel](rTLabelDefault)
    val (tmp72827,tmp72828,tmp72829) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
    v_temp15.v = tmp72827
    v_temp16.v = tmp72828
    v_temp17.v = tmp72829
    f_switch_context (v_st,v_temp15.v)
    f_gen_store (v_st,v_FPDecodeRounding46__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
    f_switch_context (v_st,v_temp16.v)
    val v_temp18 = Mutable[RTLabel](rTLabelDefault)
    val v_temp19 = Mutable[RTLabel](rTLabelDefault)
    val v_temp20 = Mutable[RTLabel](rTLabelDefault)
    val (tmp72830,tmp72831,tmp72832) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
    v_temp18.v = tmp72830
    v_temp19.v = tmp72831
    v_temp20.v = tmp72832
    f_switch_context (v_st,v_temp18.v)
    f_gen_store (v_st,v_FPDecodeRounding46__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
    f_switch_context (v_st,v_temp19.v)
    val v_temp21 = Mutable[RTLabel](rTLabelDefault)
    val v_temp22 = Mutable[RTLabel](rTLabelDefault)
    val v_temp23 = Mutable[RTLabel](rTLabelDefault)
    val (tmp72833,tmp72834,tmp72835) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
    v_temp21.v = tmp72833
    v_temp22.v = tmp72834
    v_temp23.v = tmp72835
    f_switch_context (v_st,v_temp21.v)
    f_gen_store (v_st,v_FPDecodeRounding46__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
    f_switch_context (v_st,v_temp22.v)
    f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
    f_switch_context (v_st,v_temp23.v)
    f_switch_context (v_st,v_temp20.v)
    f_switch_context (v_st,v_temp17.v)
    f_switch_context (v_st,v_temp14.v)
    val v_Exp50__2 : RTSym = f_decl_bv(v_st, "Exp50__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp50__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp43__2), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding46__3))))
    val v_Exp53__2 : RTSym = f_decl_bv(v_st, "Exp53__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp53__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp43__2), BigInt(16), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding46__3))))
    val v_Exp56__2 : RTSym = f_decl_bv(v_st, "Exp56__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp56__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp43__2), BigInt(32), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding46__3))))
    val v_Exp59__2 : RTSym = f_decl_bv(v_st, "Exp59__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp59__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp43__2), BigInt(48), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding46__3))))
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_load(v_st, v_Exp59__2), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp56__2), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_Exp53__2), f_gen_load(v_st, v_Exp50__2)))), f_gen_int_lit(v_st, BigInt(128))))
  }
}
