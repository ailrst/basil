/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_special_sqrt_est_int (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      val v_Exp5__2 : RTSym = f_decl_bv(v_st, "Exp5__2", BigInt(128)) 
      f_gen_store (v_st,v_Exp5__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
      val v_UnsignedRSqrtEstimate8__2 : RTSym = f_decl_bv(v_st, "UnsignedRSqrtEstimate8__2", BigInt(32)) 
      val v_temp0 = Mutable[RTLabel](rTLabelDefault)
      val v_temp1 = Mutable[RTLabel](rTLabelDefault)
      val v_temp2 = Mutable[RTLabel](rTLabelDefault)
      val (tmp75444,tmp75445,tmp75446) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(30), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
      v_temp0.v = tmp75444
      v_temp1.v = tmp75445
      v_temp2.v = tmp75446
      f_switch_context (v_st,v_temp0.v)
      f_gen_store (v_st,v_UnsignedRSqrtEstimate8__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
      f_switch_context (v_st,v_temp1.v)
      f_gen_assert (v_st,f_gen_and_bool(v_st, f_gen_sle_bits(v_st, BigInt(10), f_gen_bit_lit(v_st, BigInt(10), BitVecLiteral(BigInt("0010000000", 2), 10)), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(10), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(23), BigInt(9)), f_gen_int_lit(v_st, BigInt(10)))), f_gen_slt_bits(v_st, BigInt(11), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(11), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(23), BigInt(9)), f_gen_int_lit(v_st, BigInt(11))), f_gen_bit_lit(v_st, BigInt(11), BitVecLiteral(BigInt("01000000000", 2), 11)))))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,v_temp2.v)
      val v_UnsignedRSqrtEstimate19__2 : RTSym = f_decl_bv(v_st, "UnsignedRSqrtEstimate19__2", BigInt(32)) 
      val v_temp3 = Mutable[RTLabel](rTLabelDefault)
      val v_temp4 = Mutable[RTLabel](rTLabelDefault)
      val v_temp5 = Mutable[RTLabel](rTLabelDefault)
      val (tmp75447,tmp75448,tmp75449) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_Exp5__2), BigInt(62), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
      v_temp3.v = tmp75447
      v_temp4.v = tmp75448
      v_temp5.v = tmp75449
      f_switch_context (v_st,v_temp3.v)
      f_gen_store (v_st,v_UnsignedRSqrtEstimate19__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
      f_switch_context (v_st,v_temp4.v)
      f_gen_assert (v_st,f_gen_and_bool(v_st, f_gen_sle_bits(v_st, BigInt(10), f_gen_bit_lit(v_st, BigInt(10), BitVecLiteral(BigInt("0010000000", 2), 10)), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(10), f_gen_slice(v_st, f_gen_load(v_st, v_Exp5__2), BigInt(55), BigInt(9)), f_gen_int_lit(v_st, BigInt(10)))), f_gen_slt_bits(v_st, BigInt(11), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(11), f_gen_slice(v_st, f_gen_load(v_st, v_Exp5__2), BigInt(55), BigInt(9)), f_gen_int_lit(v_st, BigInt(11))), f_gen_bit_lit(v_st, BigInt(11), BitVecLiteral(BigInt("01000000000", 2), 11)))))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,v_temp5.v)
      val v_UnsignedRSqrtEstimate30__2 : RTSym = f_decl_bv(v_st, "UnsignedRSqrtEstimate30__2", BigInt(32)) 
      val v_temp6 = Mutable[RTLabel](rTLabelDefault)
      val v_temp7 = Mutable[RTLabel](rTLabelDefault)
      val v_temp8 = Mutable[RTLabel](rTLabelDefault)
      val (tmp75450,tmp75451,tmp75452) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_Exp5__2), BigInt(94), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
      v_temp6.v = tmp75450
      v_temp7.v = tmp75451
      v_temp8.v = tmp75452
      f_switch_context (v_st,v_temp6.v)
      f_gen_store (v_st,v_UnsignedRSqrtEstimate30__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
      f_switch_context (v_st,v_temp7.v)
      f_gen_assert (v_st,f_gen_and_bool(v_st, f_gen_sle_bits(v_st, BigInt(10), f_gen_bit_lit(v_st, BigInt(10), BitVecLiteral(BigInt("0010000000", 2), 10)), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(10), f_gen_slice(v_st, f_gen_load(v_st, v_Exp5__2), BigInt(87), BigInt(9)), f_gen_int_lit(v_st, BigInt(10)))), f_gen_slt_bits(v_st, BigInt(11), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(11), f_gen_slice(v_st, f_gen_load(v_st, v_Exp5__2), BigInt(87), BigInt(9)), f_gen_int_lit(v_st, BigInt(11))), f_gen_bit_lit(v_st, BigInt(11), BitVecLiteral(BigInt("01000000000", 2), 11)))))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,v_temp8.v)
      val v_UnsignedRSqrtEstimate41__2 : RTSym = f_decl_bv(v_st, "UnsignedRSqrtEstimate41__2", BigInt(32)) 
      val v_temp9 = Mutable[RTLabel](rTLabelDefault)
      val v_temp10 = Mutable[RTLabel](rTLabelDefault)
      val v_temp11 = Mutable[RTLabel](rTLabelDefault)
      val (tmp75453,tmp75454,tmp75455) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_Exp5__2), BigInt(126), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
      v_temp9.v = tmp75453
      v_temp10.v = tmp75454
      v_temp11.v = tmp75455
      f_switch_context (v_st,v_temp9.v)
      f_gen_store (v_st,v_UnsignedRSqrtEstimate41__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
      f_switch_context (v_st,v_temp10.v)
      f_gen_assert (v_st,f_gen_and_bool(v_st, f_gen_sle_bits(v_st, BigInt(10), f_gen_bit_lit(v_st, BigInt(10), BitVecLiteral(BigInt("0010000000", 2), 10)), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(10), f_gen_slice(v_st, f_gen_load(v_st, v_Exp5__2), BigInt(119), BigInt(9)), f_gen_int_lit(v_st, BigInt(10)))), f_gen_slt_bits(v_st, BigInt(11), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(11), f_gen_slice(v_st, f_gen_load(v_st, v_Exp5__2), BigInt(119), BigInt(9)), f_gen_int_lit(v_st, BigInt(11))), f_gen_bit_lit(v_st, BigInt(11), BitVecLiteral(BigInt("01000000000", 2), 11)))))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,v_temp11.v)
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_load(v_st, v_UnsignedRSqrtEstimate41__2), f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_UnsignedRSqrtEstimate30__2), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_UnsignedRSqrtEstimate19__2), f_gen_load(v_st, v_UnsignedRSqrtEstimate8__2)))))
    } else {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      val v_Exp58__2 : RTSym = f_decl_bv(v_st, "Exp58__2", BigInt(128)) 
      f_gen_store (v_st,v_Exp58__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
      val v_UnsignedRSqrtEstimate61__2 : RTSym = f_decl_bv(v_st, "UnsignedRSqrtEstimate61__2", BigInt(32)) 
      val v_temp12 = Mutable[RTLabel](rTLabelDefault)
      val v_temp13 = Mutable[RTLabel](rTLabelDefault)
      val v_temp14 = Mutable[RTLabel](rTLabelDefault)
      val (tmp75456,tmp75457,tmp75458) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(30), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
      v_temp12.v = tmp75456
      v_temp13.v = tmp75457
      v_temp14.v = tmp75458
      f_switch_context (v_st,v_temp12.v)
      f_gen_store (v_st,v_UnsignedRSqrtEstimate61__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
      f_switch_context (v_st,v_temp13.v)
      f_gen_assert (v_st,f_gen_and_bool(v_st, f_gen_sle_bits(v_st, BigInt(10), f_gen_bit_lit(v_st, BigInt(10), BitVecLiteral(BigInt("0010000000", 2), 10)), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(10), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(23), BigInt(9)), f_gen_int_lit(v_st, BigInt(10)))), f_gen_slt_bits(v_st, BigInt(11), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(11), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(23), BigInt(9)), f_gen_int_lit(v_st, BigInt(11))), f_gen_bit_lit(v_st, BigInt(11), BitVecLiteral(BigInt("01000000000", 2), 11)))))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,v_temp14.v)
      val v_UnsignedRSqrtEstimate72__2 : RTSym = f_decl_bv(v_st, "UnsignedRSqrtEstimate72__2", BigInt(32)) 
      val v_temp15 = Mutable[RTLabel](rTLabelDefault)
      val v_temp16 = Mutable[RTLabel](rTLabelDefault)
      val v_temp17 = Mutable[RTLabel](rTLabelDefault)
      val (tmp75459,tmp75460,tmp75461) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_Exp58__2), BigInt(62), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2)))) 
      v_temp15.v = tmp75459
      v_temp16.v = tmp75460
      v_temp17.v = tmp75461
      f_switch_context (v_st,v_temp15.v)
      f_gen_store (v_st,v_UnsignedRSqrtEstimate72__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
      f_switch_context (v_st,v_temp16.v)
      f_gen_assert (v_st,f_gen_and_bool(v_st, f_gen_sle_bits(v_st, BigInt(10), f_gen_bit_lit(v_st, BigInt(10), BitVecLiteral(BigInt("0010000000", 2), 10)), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(10), f_gen_slice(v_st, f_gen_load(v_st, v_Exp58__2), BigInt(55), BigInt(9)), f_gen_int_lit(v_st, BigInt(10)))), f_gen_slt_bits(v_st, BigInt(11), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(11), f_gen_slice(v_st, f_gen_load(v_st, v_Exp58__2), BigInt(55), BigInt(9)), f_gen_int_lit(v_st, BigInt(11))), f_gen_bit_lit(v_st, BigInt(11), BitVecLiteral(BigInt("01000000000", 2), 11)))))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,v_temp17.v)
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_UnsignedRSqrtEstimate72__2), f_gen_load(v_st, v_UnsignedRSqrtEstimate61__2)), f_gen_int_lit(v_st, BigInt(128))))
    }
  }
}
