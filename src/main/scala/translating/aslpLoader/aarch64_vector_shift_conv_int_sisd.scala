/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_shift_conv_int_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_Exp3__1 : Boolean = f_eq_bits(v_st, BigInt(4), f_and_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), BitVecLiteral(BigInt("1110", 2), 4)), BitVecLiteral(BigInt("0000", 2), 4)) 
  val v_If4__1 = Mutable[Boolean](true)
  if (v_Exp3__1) then {
    v_If4__1.v = true
  } else {
    val v_Exp5__1 : Boolean = f_eq_bits(v_st, BigInt(4), f_and_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), BitVecLiteral(BigInt("1110", 2), 4)), BitVecLiteral(BigInt("0010", 2), 4)) 
    val v_If6__1 = Mutable[Boolean](true)
    if (v_Exp5__1) then {
      v_If6__1.v = false
    } else {
      v_If6__1.v = false
    }
    v_If4__1.v = v_If6__1.v
  }
  if (v_If4__1.v) then {
    throw Exception("not supported")
  } else {
    val v_Exp8__1 : Boolean = f_eq_bits(v_st, BigInt(4), f_and_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), BitVecLiteral(BigInt("1000", 2), 4)), BitVecLiteral(BigInt("1000", 2), 4)) 
    if (v_Exp8__1) then {
      val v_FPDecodeRounding12__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding12__3", BigInt(3)) 
      val v_temp0 = Mutable[RTLabel](rTLabelDefault)
      val v_temp1 = Mutable[RTLabel](rTLabelDefault)
      val v_temp2 = Mutable[RTLabel](rTLabelDefault)
      val (tmp77093,tmp77094,tmp77095) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
      v_temp0.v = tmp77093
      v_temp1.v = tmp77094
      v_temp2.v = tmp77095
      f_switch_context (v_st,v_temp0.v)
      f_gen_store (v_st,v_FPDecodeRounding12__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
      f_switch_context (v_st,v_temp1.v)
      val v_temp3 = Mutable[RTLabel](rTLabelDefault)
      val v_temp4 = Mutable[RTLabel](rTLabelDefault)
      val v_temp5 = Mutable[RTLabel](rTLabelDefault)
      val (tmp77096,tmp77097,tmp77098) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
      v_temp3.v = tmp77096
      v_temp4.v = tmp77097
      v_temp5.v = tmp77098
      f_switch_context (v_st,v_temp3.v)
      f_gen_store (v_st,v_FPDecodeRounding12__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
      f_switch_context (v_st,v_temp4.v)
      val v_temp6 = Mutable[RTLabel](rTLabelDefault)
      val v_temp7 = Mutable[RTLabel](rTLabelDefault)
      val v_temp8 = Mutable[RTLabel](rTLabelDefault)
      val (tmp77099,tmp77100,tmp77101) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
      v_temp6.v = tmp77099
      v_temp7.v = tmp77100
      v_temp8.v = tmp77101
      f_switch_context (v_st,v_temp6.v)
      f_gen_store (v_st,v_FPDecodeRounding12__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
      f_switch_context (v_st,v_temp7.v)
      val v_temp9 = Mutable[RTLabel](rTLabelDefault)
      val v_temp10 = Mutable[RTLabel](rTLabelDefault)
      val v_temp11 = Mutable[RTLabel](rTLabelDefault)
      val (tmp77102,tmp77103,tmp77104) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
      v_temp9.v = tmp77102
      v_temp10.v = tmp77103
      v_temp11.v = tmp77104
      f_switch_context (v_st,v_temp9.v)
      f_gen_store (v_st,v_FPDecodeRounding12__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
      f_switch_context (v_st,v_temp10.v)
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,v_temp11.v)
      f_switch_context (v_st,v_temp8.v)
      f_switch_context (v_st,v_temp5.v)
      f_switch_context (v_st,v_temp2.v)
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      val v_Exp19__2 : RTSym = f_decl_bv(v_st, "Exp19__2", BigInt(64)) 
      f_gen_store (v_st,v_Exp19__2,f_gen_FixedToFP(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, ((BigInt(128)) - (f_cvt_bits_uint(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))))))), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding12__3))))
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_Exp19__2), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      val v_Exp26__1 : Boolean = f_eq_bits(v_st, BigInt(4), f_and_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), BitVecLiteral(BigInt("1100", 2), 4)), BitVecLiteral(BigInt("0100", 2), 4)) 
      if (v_Exp26__1) then {
        val v_FPDecodeRounding30__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding30__3", BigInt(3)) 
        val v_temp12 = Mutable[RTLabel](rTLabelDefault)
        val v_temp13 = Mutable[RTLabel](rTLabelDefault)
        val v_temp14 = Mutable[RTLabel](rTLabelDefault)
        val (tmp77105,tmp77106,tmp77107) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
        v_temp12.v = tmp77105
        v_temp13.v = tmp77106
        v_temp14.v = tmp77107
        f_switch_context (v_st,v_temp12.v)
        f_gen_store (v_st,v_FPDecodeRounding30__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
        f_switch_context (v_st,v_temp13.v)
        val v_temp15 = Mutable[RTLabel](rTLabelDefault)
        val v_temp16 = Mutable[RTLabel](rTLabelDefault)
        val v_temp17 = Mutable[RTLabel](rTLabelDefault)
        val (tmp77108,tmp77109,tmp77110) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
        v_temp15.v = tmp77108
        v_temp16.v = tmp77109
        v_temp17.v = tmp77110
        f_switch_context (v_st,v_temp15.v)
        f_gen_store (v_st,v_FPDecodeRounding30__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
        f_switch_context (v_st,v_temp16.v)
        val v_temp18 = Mutable[RTLabel](rTLabelDefault)
        val v_temp19 = Mutable[RTLabel](rTLabelDefault)
        val v_temp20 = Mutable[RTLabel](rTLabelDefault)
        val (tmp77111,tmp77112,tmp77113) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
        v_temp18.v = tmp77111
        v_temp19.v = tmp77112
        v_temp20.v = tmp77113
        f_switch_context (v_st,v_temp18.v)
        f_gen_store (v_st,v_FPDecodeRounding30__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
        f_switch_context (v_st,v_temp19.v)
        val v_temp21 = Mutable[RTLabel](rTLabelDefault)
        val v_temp22 = Mutable[RTLabel](rTLabelDefault)
        val v_temp23 = Mutable[RTLabel](rTLabelDefault)
        val (tmp77114,tmp77115,tmp77116) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
        v_temp21.v = tmp77114
        v_temp22.v = tmp77115
        v_temp23.v = tmp77116
        f_switch_context (v_st,v_temp21.v)
        f_gen_store (v_st,v_FPDecodeRounding30__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
        f_switch_context (v_st,v_temp22.v)
        f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
        f_switch_context (v_st,v_temp23.v)
        f_switch_context (v_st,v_temp20.v)
        f_switch_context (v_st,v_temp17.v)
        f_switch_context (v_st,v_temp14.v)
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp37__2 : RTSym = f_decl_bv(v_st, "Exp37__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp37__2,f_gen_FixedToFP(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, ((BigInt(64)) - (f_cvt_bits_uint(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))))))), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding30__3))))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_Exp37__2), f_gen_int_lit(v_st, BigInt(128))))
      } else {
        val v_FPDecodeRounding47__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding47__3", BigInt(3)) 
        val v_temp24 = Mutable[RTLabel](rTLabelDefault)
        val v_temp25 = Mutable[RTLabel](rTLabelDefault)
        val v_temp26 = Mutable[RTLabel](rTLabelDefault)
        val (tmp77117,tmp77118,tmp77119) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
        v_temp24.v = tmp77117
        v_temp25.v = tmp77118
        v_temp26.v = tmp77119
        f_switch_context (v_st,v_temp24.v)
        f_gen_store (v_st,v_FPDecodeRounding47__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
        f_switch_context (v_st,v_temp25.v)
        val v_temp27 = Mutable[RTLabel](rTLabelDefault)
        val v_temp28 = Mutable[RTLabel](rTLabelDefault)
        val v_temp29 = Mutable[RTLabel](rTLabelDefault)
        val (tmp77120,tmp77121,tmp77122) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))) 
        v_temp27.v = tmp77120
        v_temp28.v = tmp77121
        v_temp29.v = tmp77122
        f_switch_context (v_st,v_temp27.v)
        f_gen_store (v_st,v_FPDecodeRounding47__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
        f_switch_context (v_st,v_temp28.v)
        val v_temp30 = Mutable[RTLabel](rTLabelDefault)
        val v_temp31 = Mutable[RTLabel](rTLabelDefault)
        val v_temp32 = Mutable[RTLabel](rTLabelDefault)
        val (tmp77123,tmp77124,tmp77125) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2)))) 
        v_temp30.v = tmp77123
        v_temp31.v = tmp77124
        v_temp32.v = tmp77125
        f_switch_context (v_st,v_temp30.v)
        f_gen_store (v_st,v_FPDecodeRounding47__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
        f_switch_context (v_st,v_temp31.v)
        val v_temp33 = Mutable[RTLabel](rTLabelDefault)
        val v_temp34 = Mutable[RTLabel](rTLabelDefault)
        val v_temp35 = Mutable[RTLabel](rTLabelDefault)
        val (tmp77126,tmp77127,tmp77128) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
        v_temp33.v = tmp77126
        v_temp34.v = tmp77127
        v_temp35.v = tmp77128
        f_switch_context (v_st,v_temp33.v)
        f_gen_store (v_st,v_FPDecodeRounding47__3,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
        f_switch_context (v_st,v_temp34.v)
        f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
        f_switch_context (v_st,v_temp35.v)
        f_switch_context (v_st,v_temp32.v)
        f_switch_context (v_st,v_temp29.v)
        f_switch_context (v_st,v_temp26.v)
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp54__2 : RTSym = f_decl_bv(v_st, "Exp54__2", BigInt(16)) 
        f_gen_store (v_st,v_Exp54__2,f_gen_FixedToFP(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, ((BigInt(32)) - (f_cvt_bits_uint(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))))))), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), f_gen_load(v_st, v_FPDecodeRounding47__3))))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_Exp54__2), f_gen_int_lit(v_st, BigInt(128))))
      }
    }
  }
}
