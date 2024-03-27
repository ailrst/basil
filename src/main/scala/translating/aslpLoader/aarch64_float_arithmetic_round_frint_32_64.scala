/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_float_arithmetic_round_frint_32_64 (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_Exp5__1 : Boolean = f_eq_bits(v_st, BigInt(2), f_and_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2)), BitVecLiteral(BigInt("10", 2), 2)) 
  if (v_Exp5__1) then {
    throw Exception("not supported")
  } else {
    val v_Exp6__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2)) 
    if (v_Exp6__1) then {
      val v_If7__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(7)))
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
        v_If7__1.v = BitVecLiteral(BigInt("0100000", 2), 7)
      } else {
        v_If7__1.v = BitVecLiteral(BigInt("1000000", 2), 7)
      }
      val v_If8__1 : RTSym = f_decl_bv(v_st, "If8__1", BigInt(3)) 
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(15),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
        f_gen_store (v_st,v_If8__1,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
      } else {
        val v_FPDecodeRounding11__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding11__3", BigInt(3)) 
        val v_temp0 = Mutable[RTLabel](rTLabelDefault)
        val v_temp1 = Mutable[RTLabel](rTLabelDefault)
        val v_temp2 = Mutable[RTLabel](rTLabelDefault)
        val (tmp257,tmp258,tmp259) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
        v_temp0.v = tmp257
        v_temp1.v = tmp258
        v_temp2.v = tmp259
        f_switch_context (v_st,v_temp0.v)
        f_gen_store (v_st,v_FPDecodeRounding11__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
        f_switch_context (v_st,v_temp1.v)
        val v_temp3 = Mutable[RTLabel](rTLabelDefault)
        val v_temp4 = Mutable[RTLabel](rTLabelDefault)
        val v_temp5 = Mutable[RTLabel](rTLabelDefault)
        val (tmp260,tmp261,tmp262) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
        v_temp3.v = tmp260
        v_temp4.v = tmp261
        v_temp5.v = tmp262
        f_switch_context (v_st,v_temp3.v)
        f_gen_store (v_st,v_FPDecodeRounding11__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
        f_switch_context (v_st,v_temp4.v)
        val v_temp6 = Mutable[RTLabel](rTLabelDefault)
        val v_temp7 = Mutable[RTLabel](rTLabelDefault)
        val v_temp8 = Mutable[RTLabel](rTLabelDefault)
        val (tmp263,tmp264,tmp265) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
        v_temp6.v = tmp263
        v_temp7.v = tmp264
        v_temp8.v = tmp265
        f_switch_context (v_st,v_temp6.v)
        f_gen_store (v_st,v_FPDecodeRounding11__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
        f_switch_context (v_st,v_temp7.v)
        val v_temp9 = Mutable[RTLabel](rTLabelDefault)
        val v_temp10 = Mutable[RTLabel](rTLabelDefault)
        val v_temp11 = Mutable[RTLabel](rTLabelDefault)
        val (tmp266,tmp267,tmp268) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
        v_temp9.v = tmp266
        v_temp10.v = tmp267
        v_temp11.v = tmp268
        f_switch_context (v_st,v_temp9.v)
        f_gen_store (v_st,v_FPDecodeRounding11__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
        f_switch_context (v_st,v_temp10.v)
        f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
        f_switch_context (v_st,v_temp11.v)
        f_switch_context (v_st,v_temp8.v)
        f_switch_context (v_st,v_temp5.v)
        f_switch_context (v_st,v_temp2.v)
        f_gen_store (v_st,v_If8__1,f_gen_load(v_st, v_FPDecodeRounding11__3))
      }
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      val v_Exp17__2 : RTSym = f_decl_bv(v_st, "Exp17__2", BigInt(64)) 
      f_gen_store (v_st,v_Exp17__2,f_gen_FPRoundIntN(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_If8__1)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If7__1.v))))
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_Exp17__2), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      val v_Exp23__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2)) 
      if (v_Exp23__1) then {
        val v_If24__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(7)))
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(16),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
          v_If24__1.v = BitVecLiteral(BigInt("0100000", 2), 7)
        } else {
          v_If24__1.v = BitVecLiteral(BigInt("1000000", 2), 7)
        }
        val v_If25__1 : RTSym = f_decl_bv(v_st, "If25__1", BigInt(3)) 
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(15),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
          f_gen_store (v_st,v_If25__1,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
        } else {
          val v_FPDecodeRounding28__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding28__3", BigInt(3)) 
          val v_temp12 = Mutable[RTLabel](rTLabelDefault)
          val v_temp13 = Mutable[RTLabel](rTLabelDefault)
          val v_temp14 = Mutable[RTLabel](rTLabelDefault)
          val (tmp269,tmp270,tmp271) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
          v_temp12.v = tmp269
          v_temp13.v = tmp270
          v_temp14.v = tmp271
          f_switch_context (v_st,v_temp12.v)
          f_gen_store (v_st,v_FPDecodeRounding28__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
          f_switch_context (v_st,v_temp13.v)
          val v_temp15 = Mutable[RTLabel](rTLabelDefault)
          val v_temp16 = Mutable[RTLabel](rTLabelDefault)
          val v_temp17 = Mutable[RTLabel](rTLabelDefault)
          val (tmp272,tmp273,tmp274) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
          v_temp15.v = tmp272
          v_temp16.v = tmp273
          v_temp17.v = tmp274
          f_switch_context (v_st,v_temp15.v)
          f_gen_store (v_st,v_FPDecodeRounding28__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
          f_switch_context (v_st,v_temp16.v)
          val v_temp18 = Mutable[RTLabel](rTLabelDefault)
          val v_temp19 = Mutable[RTLabel](rTLabelDefault)
          val v_temp20 = Mutable[RTLabel](rTLabelDefault)
          val (tmp275,tmp276,tmp277) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
          v_temp18.v = tmp275
          v_temp19.v = tmp276
          v_temp20.v = tmp277
          f_switch_context (v_st,v_temp18.v)
          f_gen_store (v_st,v_FPDecodeRounding28__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
          f_switch_context (v_st,v_temp19.v)
          val v_temp21 = Mutable[RTLabel](rTLabelDefault)
          val v_temp22 = Mutable[RTLabel](rTLabelDefault)
          val v_temp23 = Mutable[RTLabel](rTLabelDefault)
          val (tmp278,tmp279,tmp280) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
          v_temp21.v = tmp278
          v_temp22.v = tmp279
          v_temp23.v = tmp280
          f_switch_context (v_st,v_temp21.v)
          f_gen_store (v_st,v_FPDecodeRounding28__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
          f_switch_context (v_st,v_temp22.v)
          f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
          f_switch_context (v_st,v_temp23.v)
          f_switch_context (v_st,v_temp20.v)
          f_switch_context (v_st,v_temp17.v)
          f_switch_context (v_st,v_temp14.v)
          f_gen_store (v_st,v_If25__1,f_gen_load(v_st, v_FPDecodeRounding28__3))
        }
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp34__2 : RTSym = f_decl_bv(v_st, "Exp34__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp34__2,f_gen_FPRoundIntN(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_If25__1)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If24__1.v))))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_Exp34__2), f_gen_int_lit(v_st, BigInt(128))))
      } else {
        throw Exception("not supported")
      }
    }
  }
}
