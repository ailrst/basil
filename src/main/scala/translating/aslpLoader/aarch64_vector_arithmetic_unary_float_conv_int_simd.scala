/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_float_conv_int_simd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)), bvextract(v_st,v_enc,BigInt(30),BigInt(1))), BitVecLiteral(BigInt("10", 2), 2))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp6__2 : RTSym = f_decl_bv(v_st, "Exp6__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp6__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
        val v_FPDecodeRounding9__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding9__3", BigInt(3)) 
        val v_temp0 = Mutable[RTLabel](rTLabelDefault)
        val v_temp1 = Mutable[RTLabel](rTLabelDefault)
        val v_temp2 = Mutable[RTLabel](rTLabelDefault)
        val (tmp72256,tmp72257,tmp72258) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
        v_temp0.v = tmp72256
        v_temp1.v = tmp72257
        v_temp2.v = tmp72258
        f_switch_context (v_st,v_temp0.v)
        f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
        f_switch_context (v_st,v_temp1.v)
        val v_temp3 = Mutable[RTLabel](rTLabelDefault)
        val v_temp4 = Mutable[RTLabel](rTLabelDefault)
        val v_temp5 = Mutable[RTLabel](rTLabelDefault)
        val (tmp72259,tmp72260,tmp72261) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
        v_temp3.v = tmp72259
        v_temp4.v = tmp72260
        v_temp5.v = tmp72261
        f_switch_context (v_st,v_temp3.v)
        f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
        f_switch_context (v_st,v_temp4.v)
        val v_temp6 = Mutable[RTLabel](rTLabelDefault)
        val v_temp7 = Mutable[RTLabel](rTLabelDefault)
        val v_temp8 = Mutable[RTLabel](rTLabelDefault)
        val (tmp72262,tmp72263,tmp72264) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
        v_temp6.v = tmp72262
        v_temp7.v = tmp72263
        v_temp8.v = tmp72264
        f_switch_context (v_st,v_temp6.v)
        f_gen_store (v_st,v_FPDecodeRounding9__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
        f_switch_context (v_st,v_temp7.v)
        val v_temp9 = Mutable[RTLabel](rTLabelDefault)
        val v_temp10 = Mutable[RTLabel](rTLabelDefault)
        val v_temp11 = Mutable[RTLabel](rTLabelDefault)
        val (tmp72265,tmp72266,tmp72267) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
        v_temp9.v = tmp72265
        v_temp10.v = tmp72266
        v_temp11.v = tmp72267
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
        val v_Exp16__2 : RTSym = f_decl_bv(v_st, "Exp16__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp16__2,f_gen_FixedToFP(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(32), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3))))
        val v_Exp19__2 : RTSym = f_decl_bv(v_st, "Exp19__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp19__2,f_gen_FixedToFP(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(64), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3))))
        val v_Exp22__2 : RTSym = f_decl_bv(v_st, "Exp22__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp22__2,f_gen_FixedToFP(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(96), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding9__3))))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_load(v_st, v_Exp22__2), f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_Exp19__2), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_Exp16__2), f_gen_load(v_st, v_Exp13__2)))))
      } else {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp31__2 : RTSym = f_decl_bv(v_st, "Exp31__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp31__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
        val v_FPDecodeRounding34__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding34__3", BigInt(3)) 
        val v_temp12 = Mutable[RTLabel](rTLabelDefault)
        val v_temp13 = Mutable[RTLabel](rTLabelDefault)
        val v_temp14 = Mutable[RTLabel](rTLabelDefault)
        val (tmp72268,tmp72269,tmp72270) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
        v_temp12.v = tmp72268
        v_temp13.v = tmp72269
        v_temp14.v = tmp72270
        f_switch_context (v_st,v_temp12.v)
        f_gen_store (v_st,v_FPDecodeRounding34__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
        f_switch_context (v_st,v_temp13.v)
        val v_temp15 = Mutable[RTLabel](rTLabelDefault)
        val v_temp16 = Mutable[RTLabel](rTLabelDefault)
        val v_temp17 = Mutable[RTLabel](rTLabelDefault)
        val (tmp72271,tmp72272,tmp72273) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
        v_temp15.v = tmp72271
        v_temp16.v = tmp72272
        v_temp17.v = tmp72273
        f_switch_context (v_st,v_temp15.v)
        f_gen_store (v_st,v_FPDecodeRounding34__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
        f_switch_context (v_st,v_temp16.v)
        val v_temp18 = Mutable[RTLabel](rTLabelDefault)
        val v_temp19 = Mutable[RTLabel](rTLabelDefault)
        val v_temp20 = Mutable[RTLabel](rTLabelDefault)
        val (tmp72274,tmp72275,tmp72276) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
        v_temp18.v = tmp72274
        v_temp19.v = tmp72275
        v_temp20.v = tmp72276
        f_switch_context (v_st,v_temp18.v)
        f_gen_store (v_st,v_FPDecodeRounding34__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
        f_switch_context (v_st,v_temp19.v)
        val v_temp21 = Mutable[RTLabel](rTLabelDefault)
        val v_temp22 = Mutable[RTLabel](rTLabelDefault)
        val v_temp23 = Mutable[RTLabel](rTLabelDefault)
        val (tmp72277,tmp72278,tmp72279) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
        v_temp21.v = tmp72277
        v_temp22.v = tmp72278
        v_temp23.v = tmp72279
        f_switch_context (v_st,v_temp21.v)
        f_gen_store (v_st,v_FPDecodeRounding34__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
        f_switch_context (v_st,v_temp22.v)
        f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
        f_switch_context (v_st,v_temp23.v)
        f_switch_context (v_st,v_temp20.v)
        f_switch_context (v_st,v_temp17.v)
        f_switch_context (v_st,v_temp14.v)
        val v_Exp38__2 : RTSym = f_decl_bv(v_st, "Exp38__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp38__2,f_gen_FixedToFP(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Exp31__2), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding34__3))))
        val v_Exp41__2 : RTSym = f_decl_bv(v_st, "Exp41__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp41__2,f_gen_FixedToFP(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Exp31__2), BigInt(32), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding34__3))))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_Exp41__2), f_gen_load(v_st, v_Exp38__2)), f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      if (f_eq_bits(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp51__2 : RTSym = f_decl_bv(v_st, "Exp51__2", BigInt(128)) 
          f_gen_store (v_st,v_Exp51__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
          val v_FPDecodeRounding54__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding54__3", BigInt(3)) 
          val v_temp24 = Mutable[RTLabel](rTLabelDefault)
          val v_temp25 = Mutable[RTLabel](rTLabelDefault)
          val v_temp26 = Mutable[RTLabel](rTLabelDefault)
          val (tmp72280,tmp72281,tmp72282) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
          v_temp24.v = tmp72280
          v_temp25.v = tmp72281
          v_temp26.v = tmp72282
          f_switch_context (v_st,v_temp24.v)
          f_gen_store (v_st,v_FPDecodeRounding54__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
          f_switch_context (v_st,v_temp25.v)
          val v_temp27 = Mutable[RTLabel](rTLabelDefault)
          val v_temp28 = Mutable[RTLabel](rTLabelDefault)
          val v_temp29 = Mutable[RTLabel](rTLabelDefault)
          val (tmp72283,tmp72284,tmp72285) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
          v_temp27.v = tmp72283
          v_temp28.v = tmp72284
          v_temp29.v = tmp72285
          f_switch_context (v_st,v_temp27.v)
          f_gen_store (v_st,v_FPDecodeRounding54__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
          f_switch_context (v_st,v_temp28.v)
          val v_temp30 = Mutable[RTLabel](rTLabelDefault)
          val v_temp31 = Mutable[RTLabel](rTLabelDefault)
          val v_temp32 = Mutable[RTLabel](rTLabelDefault)
          val (tmp72286,tmp72287,tmp72288) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
          v_temp30.v = tmp72286
          v_temp31.v = tmp72287
          v_temp32.v = tmp72288
          f_switch_context (v_st,v_temp30.v)
          f_gen_store (v_st,v_FPDecodeRounding54__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
          f_switch_context (v_st,v_temp31.v)
          val v_temp33 = Mutable[RTLabel](rTLabelDefault)
          val v_temp34 = Mutable[RTLabel](rTLabelDefault)
          val v_temp35 = Mutable[RTLabel](rTLabelDefault)
          val (tmp72289,tmp72290,tmp72291) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
          v_temp33.v = tmp72289
          v_temp34.v = tmp72290
          v_temp35.v = tmp72291
          f_switch_context (v_st,v_temp33.v)
          f_gen_store (v_st,v_FPDecodeRounding54__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
          f_switch_context (v_st,v_temp34.v)
          f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
          f_switch_context (v_st,v_temp35.v)
          f_switch_context (v_st,v_temp32.v)
          f_switch_context (v_st,v_temp29.v)
          f_switch_context (v_st,v_temp26.v)
          val v_Exp58__2 : RTSym = f_decl_bv(v_st, "Exp58__2", BigInt(64)) 
          f_gen_store (v_st,v_Exp58__2,f_gen_FixedToFP(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_Exp51__2), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding54__3))))
          val v_Exp61__2 : RTSym = f_decl_bv(v_st, "Exp61__2", BigInt(64)) 
          f_gen_store (v_st,v_Exp61__2,f_gen_FixedToFP(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_Exp51__2), BigInt(64), BigInt(64)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding54__3))))
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_load(v_st, v_Exp61__2), f_gen_load(v_st, v_Exp58__2)))
        } else {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp70__2 : RTSym = f_decl_bv(v_st, "Exp70__2", BigInt(128)) 
          f_gen_store (v_st,v_Exp70__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
          val v_FPDecodeRounding73__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding73__3", BigInt(3)) 
          val v_temp36 = Mutable[RTLabel](rTLabelDefault)
          val v_temp37 = Mutable[RTLabel](rTLabelDefault)
          val v_temp38 = Mutable[RTLabel](rTLabelDefault)
          val (tmp72292,tmp72293,tmp72294) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
          v_temp36.v = tmp72292
          v_temp37.v = tmp72293
          v_temp38.v = tmp72294
          f_switch_context (v_st,v_temp36.v)
          f_gen_store (v_st,v_FPDecodeRounding73__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
          f_switch_context (v_st,v_temp37.v)
          val v_temp39 = Mutable[RTLabel](rTLabelDefault)
          val v_temp40 = Mutable[RTLabel](rTLabelDefault)
          val v_temp41 = Mutable[RTLabel](rTLabelDefault)
          val (tmp72295,tmp72296,tmp72297) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
          v_temp39.v = tmp72295
          v_temp40.v = tmp72296
          v_temp41.v = tmp72297
          f_switch_context (v_st,v_temp39.v)
          f_gen_store (v_st,v_FPDecodeRounding73__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
          f_switch_context (v_st,v_temp40.v)
          val v_temp42 = Mutable[RTLabel](rTLabelDefault)
          val v_temp43 = Mutable[RTLabel](rTLabelDefault)
          val v_temp44 = Mutable[RTLabel](rTLabelDefault)
          val (tmp72298,tmp72299,tmp72300) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
          v_temp42.v = tmp72298
          v_temp43.v = tmp72299
          v_temp44.v = tmp72300
          f_switch_context (v_st,v_temp42.v)
          f_gen_store (v_st,v_FPDecodeRounding73__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
          f_switch_context (v_st,v_temp43.v)
          val v_temp45 = Mutable[RTLabel](rTLabelDefault)
          val v_temp46 = Mutable[RTLabel](rTLabelDefault)
          val v_temp47 = Mutable[RTLabel](rTLabelDefault)
          val (tmp72301,tmp72302,tmp72303) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
          v_temp45.v = tmp72301
          v_temp46.v = tmp72302
          v_temp47.v = tmp72303
          f_switch_context (v_st,v_temp45.v)
          f_gen_store (v_st,v_FPDecodeRounding73__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
          f_switch_context (v_st,v_temp46.v)
          f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
          f_switch_context (v_st,v_temp47.v)
          f_switch_context (v_st,v_temp44.v)
          f_switch_context (v_st,v_temp41.v)
          f_switch_context (v_st,v_temp38.v)
          val v_Exp77__2 : RTSym = f_decl_bv(v_st, "Exp77__2", BigInt(64)) 
          f_gen_store (v_st,v_Exp77__2,f_gen_FixedToFP(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_Exp70__2), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding73__3))))
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_Exp77__2), f_gen_int_lit(v_st, BigInt(128))))
        }
      } else {
        throw Exception("not supported")
      }
    }
  }
}
