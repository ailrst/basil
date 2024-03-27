/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_cmp_float_lessthan_simd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)), bvextract(v_st,v_enc,BigInt(30),BigInt(1))), BitVecLiteral(BigInt("10", 2), 2))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp6__2 : RTSym = f_decl_bv(v_st, "Exp6__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp6__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
        val v_Exp12__2 : RTSym = f_decl_bool(v_st, "Exp12__2") 
        f_gen_store (v_st,v_Exp12__2,f_gen_FPCompareGT(v_st, BigInt(32), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If14__1 : RTSym = f_decl_bv(v_st, "If14__1", BigInt(32)) 
        val v_temp0 = Mutable[RTLabel](rTLabelDefault)
        val v_temp1 = Mutable[RTLabel](rTLabelDefault)
        val v_temp2 = Mutable[RTLabel](rTLabelDefault)
        val (tmp66949,tmp66950,tmp66951) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp12__2)) 
        v_temp0.v = tmp66949
        v_temp1.v = tmp66950
        v_temp2.v = tmp66951
        f_switch_context (v_st,v_temp0.v)
        f_gen_store (v_st,v_If14__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
        f_switch_context (v_st,v_temp1.v)
        f_gen_store (v_st,v_If14__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
        f_switch_context (v_st,v_temp2.v)
        val v_Exp19__2 : RTSym = f_decl_bool(v_st, "Exp19__2") 
        f_gen_store (v_st,v_Exp19__2,f_gen_FPCompareGT(v_st, BigInt(32), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If20__1 : RTSym = f_decl_bv(v_st, "If20__1", BigInt(32)) 
        val v_temp3 = Mutable[RTLabel](rTLabelDefault)
        val v_temp4 = Mutable[RTLabel](rTLabelDefault)
        val v_temp5 = Mutable[RTLabel](rTLabelDefault)
        val (tmp66952,tmp66953,tmp66954) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp19__2)) 
        v_temp3.v = tmp66952
        v_temp4.v = tmp66953
        v_temp5.v = tmp66954
        f_switch_context (v_st,v_temp3.v)
        f_gen_store (v_st,v_If20__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
        f_switch_context (v_st,v_temp4.v)
        f_gen_store (v_st,v_If20__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
        f_switch_context (v_st,v_temp5.v)
        val v_Exp25__2 : RTSym = f_decl_bool(v_st, "Exp25__2") 
        f_gen_store (v_st,v_Exp25__2,f_gen_FPCompareGT(v_st, BigInt(32), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(64), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If26__1 : RTSym = f_decl_bv(v_st, "If26__1", BigInt(32)) 
        val v_temp6 = Mutable[RTLabel](rTLabelDefault)
        val v_temp7 = Mutable[RTLabel](rTLabelDefault)
        val v_temp8 = Mutable[RTLabel](rTLabelDefault)
        val (tmp66955,tmp66956,tmp66957) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp25__2)) 
        v_temp6.v = tmp66955
        v_temp7.v = tmp66956
        v_temp8.v = tmp66957
        f_switch_context (v_st,v_temp6.v)
        f_gen_store (v_st,v_If26__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
        f_switch_context (v_st,v_temp7.v)
        f_gen_store (v_st,v_If26__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
        f_switch_context (v_st,v_temp8.v)
        val v_Exp31__2 : RTSym = f_decl_bool(v_st, "Exp31__2") 
        f_gen_store (v_st,v_Exp31__2,f_gen_FPCompareGT(v_st, BigInt(32), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If32__1 : RTSym = f_decl_bv(v_st, "If32__1", BigInt(32)) 
        val v_temp9 = Mutable[RTLabel](rTLabelDefault)
        val v_temp10 = Mutable[RTLabel](rTLabelDefault)
        val v_temp11 = Mutable[RTLabel](rTLabelDefault)
        val (tmp66958,tmp66959,tmp66960) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp31__2)) 
        v_temp9.v = tmp66958
        v_temp10.v = tmp66959
        v_temp11.v = tmp66960
        f_switch_context (v_st,v_temp9.v)
        f_gen_store (v_st,v_If32__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
        f_switch_context (v_st,v_temp10.v)
        f_gen_store (v_st,v_If32__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
        f_switch_context (v_st,v_temp11.v)
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_load(v_st, v_If32__1), f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_If26__1), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_If20__1), f_gen_load(v_st, v_If14__1)))))
      } else {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp43__2 : RTSym = f_decl_bv(v_st, "Exp43__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp43__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
        val v_Exp49__2 : RTSym = f_decl_bool(v_st, "Exp49__2") 
        f_gen_store (v_st,v_Exp49__2,f_gen_FPCompareGT(v_st, BigInt(32), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If51__1 : RTSym = f_decl_bv(v_st, "If51__1", BigInt(32)) 
        val v_temp12 = Mutable[RTLabel](rTLabelDefault)
        val v_temp13 = Mutable[RTLabel](rTLabelDefault)
        val v_temp14 = Mutable[RTLabel](rTLabelDefault)
        val (tmp66961,tmp66962,tmp66963) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp49__2)) 
        v_temp12.v = tmp66961
        v_temp13.v = tmp66962
        v_temp14.v = tmp66963
        f_switch_context (v_st,v_temp12.v)
        f_gen_store (v_st,v_If51__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
        f_switch_context (v_st,v_temp13.v)
        f_gen_store (v_st,v_If51__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
        f_switch_context (v_st,v_temp14.v)
        val v_Exp56__2 : RTSym = f_decl_bool(v_st, "Exp56__2") 
        f_gen_store (v_st,v_Exp56__2,f_gen_FPCompareGT(v_st, BigInt(32), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp43__2), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If57__1 : RTSym = f_decl_bv(v_st, "If57__1", BigInt(32)) 
        val v_temp15 = Mutable[RTLabel](rTLabelDefault)
        val v_temp16 = Mutable[RTLabel](rTLabelDefault)
        val v_temp17 = Mutable[RTLabel](rTLabelDefault)
        val (tmp66964,tmp66965,tmp66966) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp56__2)) 
        v_temp15.v = tmp66964
        v_temp16.v = tmp66965
        v_temp17.v = tmp66966
        f_switch_context (v_st,v_temp15.v)
        f_gen_store (v_st,v_If57__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
        f_switch_context (v_st,v_temp16.v)
        f_gen_store (v_st,v_If57__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
        f_switch_context (v_st,v_temp17.v)
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_If57__1), f_gen_load(v_st, v_If51__1)), f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      if (f_eq_bits(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp69__2 : RTSym = f_decl_bv(v_st, "Exp69__2", BigInt(128)) 
          f_gen_store (v_st,v_Exp69__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
          val v_Exp75__2 : RTSym = f_decl_bool(v_st, "Exp75__2") 
          f_gen_store (v_st,v_Exp75__2,f_gen_FPCompareGT(v_st, BigInt(64), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
          val v_If77__1 : RTSym = f_decl_bv(v_st, "If77__1", BigInt(64)) 
          val v_temp18 = Mutable[RTLabel](rTLabelDefault)
          val v_temp19 = Mutable[RTLabel](rTLabelDefault)
          val v_temp20 = Mutable[RTLabel](rTLabelDefault)
          val (tmp66967,tmp66968,tmp66969) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp75__2)) 
          v_temp18.v = tmp66967
          v_temp19.v = tmp66968
          v_temp20.v = tmp66969
          f_switch_context (v_st,v_temp18.v)
          f_gen_store (v_st,v_If77__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2), 64)))
          f_switch_context (v_st,v_temp19.v)
          f_gen_store (v_st,v_If77__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
          f_switch_context (v_st,v_temp20.v)
          val v_Exp82__2 : RTSym = f_decl_bool(v_st, "Exp82__2") 
          f_gen_store (v_st,v_Exp82__2,f_gen_FPCompareGT(v_st, BigInt(64), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp69__2), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
          val v_If83__1 : RTSym = f_decl_bv(v_st, "If83__1", BigInt(64)) 
          val v_temp21 = Mutable[RTLabel](rTLabelDefault)
          val v_temp22 = Mutable[RTLabel](rTLabelDefault)
          val v_temp23 = Mutable[RTLabel](rTLabelDefault)
          val (tmp66970,tmp66971,tmp66972) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp82__2)) 
          v_temp21.v = tmp66970
          v_temp22.v = tmp66971
          v_temp23.v = tmp66972
          f_switch_context (v_st,v_temp21.v)
          f_gen_store (v_st,v_If83__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2), 64)))
          f_switch_context (v_st,v_temp22.v)
          f_gen_store (v_st,v_If83__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
          f_switch_context (v_st,v_temp23.v)
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_load(v_st, v_If83__1), f_gen_load(v_st, v_If77__1)))
        } else {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp100__2 : RTSym = f_decl_bool(v_st, "Exp100__2") 
          f_gen_store (v_st,v_Exp100__2,f_gen_FPCompareGT(v_st, BigInt(64), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
          val v_If102__1 : RTSym = f_decl_bv(v_st, "If102__1", BigInt(64)) 
          val v_temp24 = Mutable[RTLabel](rTLabelDefault)
          val v_temp25 = Mutable[RTLabel](rTLabelDefault)
          val v_temp26 = Mutable[RTLabel](rTLabelDefault)
          val (tmp66973,tmp66974,tmp66975) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp100__2)) 
          v_temp24.v = tmp66973
          v_temp25.v = tmp66974
          v_temp26.v = tmp66975
          f_switch_context (v_st,v_temp24.v)
          f_gen_store (v_st,v_If102__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2), 64)))
          f_switch_context (v_st,v_temp25.v)
          f_gen_store (v_st,v_If102__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
          f_switch_context (v_st,v_temp26.v)
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_If102__1), f_gen_int_lit(v_st, BigInt(128))))
        }
      } else {
        throw Exception("not supported")
      }
    }
  }
}
