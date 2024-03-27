/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_cmp_fp16_lessthan_simd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp6__2 : RTSym = f_decl_bv(v_st, "Exp6__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp6__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    val v_Exp12__2 : RTSym = f_decl_bool(v_st, "Exp12__2") 
    f_gen_store (v_st,v_Exp12__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If14__1 : RTSym = f_decl_bv(v_st, "If14__1", BigInt(16)) 
    val v_temp0 = Mutable[RTLabel](rTLabelDefault)
    val v_temp1 = Mutable[RTLabel](rTLabelDefault)
    val v_temp2 = Mutable[RTLabel](rTLabelDefault)
    val (tmp67130,tmp67131,tmp67132) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp12__2)) 
    v_temp0.v = tmp67130
    v_temp1.v = tmp67131
    v_temp2.v = tmp67132
    f_switch_context (v_st,v_temp0.v)
    f_gen_store (v_st,v_If14__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp1.v)
    f_gen_store (v_st,v_If14__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp2.v)
    val v_Exp19__2 : RTSym = f_decl_bool(v_st, "Exp19__2") 
    f_gen_store (v_st,v_Exp19__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If20__1 : RTSym = f_decl_bv(v_st, "If20__1", BigInt(16)) 
    val v_temp3 = Mutable[RTLabel](rTLabelDefault)
    val v_temp4 = Mutable[RTLabel](rTLabelDefault)
    val v_temp5 = Mutable[RTLabel](rTLabelDefault)
    val (tmp67133,tmp67134,tmp67135) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp19__2)) 
    v_temp3.v = tmp67133
    v_temp4.v = tmp67134
    v_temp5.v = tmp67135
    f_switch_context (v_st,v_temp3.v)
    f_gen_store (v_st,v_If20__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp4.v)
    f_gen_store (v_st,v_If20__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp5.v)
    val v_Exp25__2 : RTSym = f_decl_bool(v_st, "Exp25__2") 
    f_gen_store (v_st,v_Exp25__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(32), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If26__1 : RTSym = f_decl_bv(v_st, "If26__1", BigInt(16)) 
    val v_temp6 = Mutable[RTLabel](rTLabelDefault)
    val v_temp7 = Mutable[RTLabel](rTLabelDefault)
    val v_temp8 = Mutable[RTLabel](rTLabelDefault)
    val (tmp67136,tmp67137,tmp67138) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp25__2)) 
    v_temp6.v = tmp67136
    v_temp7.v = tmp67137
    v_temp8.v = tmp67138
    f_switch_context (v_st,v_temp6.v)
    f_gen_store (v_st,v_If26__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp7.v)
    f_gen_store (v_st,v_If26__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp8.v)
    val v_Exp31__2 : RTSym = f_decl_bool(v_st, "Exp31__2") 
    f_gen_store (v_st,v_Exp31__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If32__1 : RTSym = f_decl_bv(v_st, "If32__1", BigInt(16)) 
    val v_temp9 = Mutable[RTLabel](rTLabelDefault)
    val v_temp10 = Mutable[RTLabel](rTLabelDefault)
    val v_temp11 = Mutable[RTLabel](rTLabelDefault)
    val (tmp67139,tmp67140,tmp67141) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp31__2)) 
    v_temp9.v = tmp67139
    v_temp10.v = tmp67140
    v_temp11.v = tmp67141
    f_switch_context (v_st,v_temp9.v)
    f_gen_store (v_st,v_If32__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp10.v)
    f_gen_store (v_st,v_If32__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp11.v)
    val v_Exp37__2 : RTSym = f_decl_bool(v_st, "Exp37__2") 
    f_gen_store (v_st,v_Exp37__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(64), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If38__1 : RTSym = f_decl_bv(v_st, "If38__1", BigInt(16)) 
    val v_temp12 = Mutable[RTLabel](rTLabelDefault)
    val v_temp13 = Mutable[RTLabel](rTLabelDefault)
    val v_temp14 = Mutable[RTLabel](rTLabelDefault)
    val (tmp67142,tmp67143,tmp67144) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp37__2)) 
    v_temp12.v = tmp67142
    v_temp13.v = tmp67143
    v_temp14.v = tmp67144
    f_switch_context (v_st,v_temp12.v)
    f_gen_store (v_st,v_If38__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp13.v)
    f_gen_store (v_st,v_If38__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp14.v)
    val v_Exp43__2 : RTSym = f_decl_bool(v_st, "Exp43__2") 
    f_gen_store (v_st,v_Exp43__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(80), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If44__1 : RTSym = f_decl_bv(v_st, "If44__1", BigInt(16)) 
    val v_temp15 = Mutable[RTLabel](rTLabelDefault)
    val v_temp16 = Mutable[RTLabel](rTLabelDefault)
    val v_temp17 = Mutable[RTLabel](rTLabelDefault)
    val (tmp67145,tmp67146,tmp67147) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp43__2)) 
    v_temp15.v = tmp67145
    v_temp16.v = tmp67146
    v_temp17.v = tmp67147
    f_switch_context (v_st,v_temp15.v)
    f_gen_store (v_st,v_If44__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp16.v)
    f_gen_store (v_st,v_If44__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp17.v)
    val v_Exp49__2 : RTSym = f_decl_bool(v_st, "Exp49__2") 
    f_gen_store (v_st,v_Exp49__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(96), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If50__1 : RTSym = f_decl_bv(v_st, "If50__1", BigInt(16)) 
    val v_temp18 = Mutable[RTLabel](rTLabelDefault)
    val v_temp19 = Mutable[RTLabel](rTLabelDefault)
    val v_temp20 = Mutable[RTLabel](rTLabelDefault)
    val (tmp67148,tmp67149,tmp67150) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp49__2)) 
    v_temp18.v = tmp67148
    v_temp19.v = tmp67149
    v_temp20.v = tmp67150
    f_switch_context (v_st,v_temp18.v)
    f_gen_store (v_st,v_If50__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp19.v)
    f_gen_store (v_st,v_If50__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp20.v)
    val v_Exp55__2 : RTSym = f_decl_bool(v_st, "Exp55__2") 
    f_gen_store (v_st,v_Exp55__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(112), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If56__1 : RTSym = f_decl_bv(v_st, "If56__1", BigInt(16)) 
    val v_temp21 = Mutable[RTLabel](rTLabelDefault)
    val v_temp22 = Mutable[RTLabel](rTLabelDefault)
    val v_temp23 = Mutable[RTLabel](rTLabelDefault)
    val (tmp67151,tmp67152,tmp67153) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp55__2)) 
    v_temp21.v = tmp67151
    v_temp22.v = tmp67152
    v_temp23.v = tmp67153
    f_switch_context (v_st,v_temp21.v)
    f_gen_store (v_st,v_If56__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp22.v)
    f_gen_store (v_st,v_If56__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp23.v)
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(16), BigInt(112), f_gen_load(v_st, v_If56__1), f_gen_append_bits(v_st, BigInt(16), BigInt(96), f_gen_load(v_st, v_If50__1), f_gen_append_bits(v_st, BigInt(16), BigInt(80), f_gen_load(v_st, v_If44__1), f_gen_append_bits(v_st, BigInt(16), BigInt(64), f_gen_load(v_st, v_If38__1), f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_load(v_st, v_If32__1), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_If26__1), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_If20__1), f_gen_load(v_st, v_If14__1)))))))))
  } else {
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp67__2 : RTSym = f_decl_bv(v_st, "Exp67__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp67__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    val v_Exp73__2 : RTSym = f_decl_bool(v_st, "Exp73__2") 
    f_gen_store (v_st,v_Exp73__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If75__1 : RTSym = f_decl_bv(v_st, "If75__1", BigInt(16)) 
    val v_temp24 = Mutable[RTLabel](rTLabelDefault)
    val v_temp25 = Mutable[RTLabel](rTLabelDefault)
    val v_temp26 = Mutable[RTLabel](rTLabelDefault)
    val (tmp67154,tmp67155,tmp67156) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp73__2)) 
    v_temp24.v = tmp67154
    v_temp25.v = tmp67155
    v_temp26.v = tmp67156
    f_switch_context (v_st,v_temp24.v)
    f_gen_store (v_st,v_If75__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp25.v)
    f_gen_store (v_st,v_If75__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp26.v)
    val v_Exp80__2 : RTSym = f_decl_bool(v_st, "Exp80__2") 
    f_gen_store (v_st,v_Exp80__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp67__2), BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If81__1 : RTSym = f_decl_bv(v_st, "If81__1", BigInt(16)) 
    val v_temp27 = Mutable[RTLabel](rTLabelDefault)
    val v_temp28 = Mutable[RTLabel](rTLabelDefault)
    val v_temp29 = Mutable[RTLabel](rTLabelDefault)
    val (tmp67157,tmp67158,tmp67159) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp80__2)) 
    v_temp27.v = tmp67157
    v_temp28.v = tmp67158
    v_temp29.v = tmp67159
    f_switch_context (v_st,v_temp27.v)
    f_gen_store (v_st,v_If81__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp28.v)
    f_gen_store (v_st,v_If81__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp29.v)
    val v_Exp86__2 : RTSym = f_decl_bool(v_st, "Exp86__2") 
    f_gen_store (v_st,v_Exp86__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp67__2), BigInt(32), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If87__1 : RTSym = f_decl_bv(v_st, "If87__1", BigInt(16)) 
    val v_temp30 = Mutable[RTLabel](rTLabelDefault)
    val v_temp31 = Mutable[RTLabel](rTLabelDefault)
    val v_temp32 = Mutable[RTLabel](rTLabelDefault)
    val (tmp67160,tmp67161,tmp67162) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp86__2)) 
    v_temp30.v = tmp67160
    v_temp31.v = tmp67161
    v_temp32.v = tmp67162
    f_switch_context (v_st,v_temp30.v)
    f_gen_store (v_st,v_If87__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp31.v)
    f_gen_store (v_st,v_If87__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp32.v)
    val v_Exp92__2 : RTSym = f_decl_bool(v_st, "Exp92__2") 
    f_gen_store (v_st,v_Exp92__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp67__2), BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If93__1 : RTSym = f_decl_bv(v_st, "If93__1", BigInt(16)) 
    val v_temp33 = Mutable[RTLabel](rTLabelDefault)
    val v_temp34 = Mutable[RTLabel](rTLabelDefault)
    val v_temp35 = Mutable[RTLabel](rTLabelDefault)
    val (tmp67163,tmp67164,tmp67165) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp92__2)) 
    v_temp33.v = tmp67163
    v_temp34.v = tmp67164
    v_temp35.v = tmp67165
    f_switch_context (v_st,v_temp33.v)
    f_gen_store (v_st,v_If93__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp34.v)
    f_gen_store (v_st,v_If93__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp35.v)
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_load(v_st, v_If93__1), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_If87__1), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_If81__1), f_gen_load(v_st, v_If75__1)))), f_gen_int_lit(v_st, BigInt(128))))
  }
}
