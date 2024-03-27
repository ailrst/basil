/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_diff_neg_int_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_ne_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(8)) 
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
        f_gen_store (v_st,v_result__1,f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(8), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_not_bits(v_st, BigInt(9), f_gen_SignExtend(v_st, BigInt(8), BigInt(9), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(9)))), BigInt(0), BigInt(8)), BigInt(0), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000001", 2), 8))), BigInt(0), BigInt(8)))
      } else {
        val v_If12__2 : RTSym = f_decl_bv(v_st, "If12__2", BigInt(9)) 
        val v_temp0 = Mutable[RTLabel](rTLabelDefault)
        val v_temp1 = Mutable[RTLabel](rTLabelDefault)
        val v_temp2 = Mutable[RTLabel](rTLabelDefault)
        val (tmp69469,tmp69470,tmp69471) = f_gen_branch(v_st, f_gen_sle_bits(v_st, BigInt(8), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8)))) 
        v_temp0.v = tmp69469
        v_temp1.v = tmp69470
        v_temp2.v = tmp69471
        f_switch_context (v_st,v_temp0.v)
        f_gen_store (v_st,v_If12__2,f_gen_SignExtend(v_st, BigInt(8), BigInt(9), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(9))))
        f_switch_context (v_st,v_temp1.v)
        f_gen_store (v_st,v_If12__2,f_gen_add_bits(v_st, BigInt(9), f_gen_not_bits(v_st, BigInt(9), f_gen_SignExtend(v_st, BigInt(8), BigInt(9), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8)), f_gen_int_lit(v_st, BigInt(9)))), f_gen_bit_lit(v_st, BigInt(9), BitVecLiteral(BigInt("000000001", 2), 9))))
        f_switch_context (v_st,v_temp2.v)
        f_gen_store (v_st,v_result__1,f_gen_slice(v_st, f_gen_load(v_st, v_If12__2), BigInt(0), BigInt(8)))
      }
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(8), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(16)) 
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
          f_gen_store (v_st,v_result__1,f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(16), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_not_bits(v_st, BigInt(17), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), BigInt(0), BigInt(16)), BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000001", 2), 16))), BigInt(0), BigInt(16)))
        } else {
          val v_If30__2 : RTSym = f_decl_bv(v_st, "If30__2", BigInt(17)) 
          val v_temp3 = Mutable[RTLabel](rTLabelDefault)
          val v_temp4 = Mutable[RTLabel](rTLabelDefault)
          val v_temp5 = Mutable[RTLabel](rTLabelDefault)
          val (tmp69472,tmp69473,tmp69474) = f_gen_branch(v_st, f_gen_sle_bits(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)))) 
          v_temp3.v = tmp69472
          v_temp4.v = tmp69473
          v_temp5.v = tmp69474
          f_switch_context (v_st,v_temp3.v)
          f_gen_store (v_st,v_If30__2,f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17))))
          f_switch_context (v_st,v_temp4.v)
          f_gen_store (v_st,v_If30__2,f_gen_add_bits(v_st, BigInt(17), f_gen_not_bits(v_st, BigInt(17), f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))), f_gen_bit_lit(v_st, BigInt(17), BitVecLiteral(BigInt("00000000000000001", 2), 17))))
          f_switch_context (v_st,v_temp5.v)
          f_gen_store (v_st,v_result__1,f_gen_slice(v_st, f_gen_load(v_st, v_If30__2), BigInt(0), BigInt(16)))
        }
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
      } else {
        if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(32)) 
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
            f_gen_store (v_st,v_result__1,f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(32), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_not_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000001", 2), 32))), BigInt(0), BigInt(32)))
          } else {
            val v_If48__2 : RTSym = f_decl_bv(v_st, "If48__2", BigInt(33)) 
            val v_temp6 = Mutable[RTLabel](rTLabelDefault)
            val v_temp7 = Mutable[RTLabel](rTLabelDefault)
            val v_temp8 = Mutable[RTLabel](rTLabelDefault)
            val (tmp69475,tmp69476,tmp69477) = f_gen_branch(v_st, f_gen_sle_bits(v_st, BigInt(32), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))) 
            v_temp6.v = tmp69475
            v_temp7.v = tmp69476
            v_temp8.v = tmp69477
            f_switch_context (v_st,v_temp6.v)
            f_gen_store (v_st,v_If48__2,f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33))))
            f_switch_context (v_st,v_temp7.v)
            f_gen_store (v_st,v_If48__2,f_gen_add_bits(v_st, BigInt(33), f_gen_not_bits(v_st, BigInt(33), f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))), f_gen_bit_lit(v_st, BigInt(33), BitVecLiteral(BigInt("000000000000000000000000000000001", 2), 33))))
            f_switch_context (v_st,v_temp8.v)
            f_gen_store (v_st,v_result__1,f_gen_slice(v_st, f_gen_load(v_st, v_If48__2), BigInt(0), BigInt(32)))
          }
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
        } else {
          if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(64)) 
            if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
              f_gen_store (v_st,v_result__1,f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_not_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65)))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000001", 2), 64))), BigInt(0), BigInt(64)))
            } else {
              val v_If66__2 : RTSym = f_decl_bv(v_st, "If66__2", BigInt(65)) 
              val v_temp9 = Mutable[RTLabel](rTLabelDefault)
              val v_temp10 = Mutable[RTLabel](rTLabelDefault)
              val v_temp11 = Mutable[RTLabel](rTLabelDefault)
              val (tmp69478,tmp69479,tmp69480) = f_gen_branch(v_st, f_gen_sle_bits(v_st, BigInt(64), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)))) 
              v_temp9.v = tmp69478
              v_temp10.v = tmp69479
              v_temp11.v = tmp69480
              f_switch_context (v_st,v_temp9.v)
              f_gen_store (v_st,v_If66__2,f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65))))
              f_switch_context (v_st,v_temp10.v)
              f_gen_store (v_st,v_If66__2,f_gen_add_bits(v_st, BigInt(65), f_gen_not_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65)))), f_gen_bit_lit(v_st, BigInt(65), BitVecLiteral(BigInt("00000000000000000000000000000000000000000000000000000000000000001", 2), 65))))
              f_switch_context (v_st,v_temp11.v)
              f_gen_store (v_st,v_result__1,f_gen_slice(v_st, f_gen_load(v_st, v_If66__2), BigInt(0), BigInt(64)))
            }
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
  }
}
