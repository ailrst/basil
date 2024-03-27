/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_cmp_bitwise_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_ne_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(8)) 
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
        val v_If16__1 : RTSym = f_decl_bv(v_st, "If16__1", BigInt(8)) 
        val v_temp0 = Mutable[RTLabel](rTLabelDefault)
        val v_temp1 = Mutable[RTLabel](rTLabelDefault)
        val v_temp2 = Mutable[RTLabel](rTLabelDefault)
        val (tmp38086,tmp38087,tmp38088) = f_gen_branch(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(8), f_gen_and_bits(v_st, BigInt(8), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(8))), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8))))) 
        v_temp0.v = tmp38086
        v_temp1.v = tmp38087
        v_temp2.v = tmp38088
        f_switch_context (v_st,v_temp0.v)
        f_gen_store (v_st,v_If16__1,f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("11111111", 2), 8)))
        f_switch_context (v_st,v_temp1.v)
        f_gen_store (v_st,v_If16__1,f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8)))
        f_switch_context (v_st,v_temp2.v)
        f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_If16__1))
      } else {
        val v_If21__1 : RTSym = f_decl_bv(v_st, "If21__1", BigInt(8)) 
        val v_temp3 = Mutable[RTLabel](rTLabelDefault)
        val v_temp4 = Mutable[RTLabel](rTLabelDefault)
        val v_temp5 = Mutable[RTLabel](rTLabelDefault)
        val (tmp38089,tmp38090,tmp38091) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(8), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(8)))) 
        v_temp3.v = tmp38089
        v_temp4.v = tmp38090
        v_temp5.v = tmp38091
        f_switch_context (v_st,v_temp3.v)
        f_gen_store (v_st,v_If21__1,f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("11111111", 2), 8)))
        f_switch_context (v_st,v_temp4.v)
        f_gen_store (v_st,v_If21__1,f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8)))
        f_switch_context (v_st,v_temp5.v)
        f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_If21__1))
      }
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(8), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(16)) 
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
          val v_If43__1 : RTSym = f_decl_bv(v_st, "If43__1", BigInt(16)) 
          val v_temp6 = Mutable[RTLabel](rTLabelDefault)
          val v_temp7 = Mutable[RTLabel](rTLabelDefault)
          val v_temp8 = Mutable[RTLabel](rTLabelDefault)
          val (tmp38092,tmp38093,tmp38094) = f_gen_branch(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(16), f_gen_and_bits(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16))), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16))))) 
          v_temp6.v = tmp38092
          v_temp7.v = tmp38093
          v_temp8.v = tmp38094
          f_switch_context (v_st,v_temp6.v)
          f_gen_store (v_st,v_If43__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
          f_switch_context (v_st,v_temp7.v)
          f_gen_store (v_st,v_If43__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
          f_switch_context (v_st,v_temp8.v)
          f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_If43__1))
        } else {
          val v_If48__1 : RTSym = f_decl_bv(v_st, "If48__1", BigInt(16)) 
          val v_temp9 = Mutable[RTLabel](rTLabelDefault)
          val v_temp10 = Mutable[RTLabel](rTLabelDefault)
          val v_temp11 = Mutable[RTLabel](rTLabelDefault)
          val (tmp38095,tmp38096,tmp38097) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)))) 
          v_temp9.v = tmp38095
          v_temp10.v = tmp38096
          v_temp11.v = tmp38097
          f_switch_context (v_st,v_temp9.v)
          f_gen_store (v_st,v_If48__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
          f_switch_context (v_st,v_temp10.v)
          f_gen_store (v_st,v_If48__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
          f_switch_context (v_st,v_temp11.v)
          f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_If48__1))
        }
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
      } else {
        if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(32)) 
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
            val v_If70__1 : RTSym = f_decl_bv(v_st, "If70__1", BigInt(32)) 
            val v_temp12 = Mutable[RTLabel](rTLabelDefault)
            val v_temp13 = Mutable[RTLabel](rTLabelDefault)
            val v_temp14 = Mutable[RTLabel](rTLabelDefault)
            val (tmp38098,tmp38099,tmp38100) = f_gen_branch(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(32), f_gen_and_bits(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32))))) 
            v_temp12.v = tmp38098
            v_temp13.v = tmp38099
            v_temp14.v = tmp38100
            f_switch_context (v_st,v_temp12.v)
            f_gen_store (v_st,v_If70__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
            f_switch_context (v_st,v_temp13.v)
            f_gen_store (v_st,v_If70__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
            f_switch_context (v_st,v_temp14.v)
            f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_If70__1))
          } else {
            val v_If75__1 : RTSym = f_decl_bv(v_st, "If75__1", BigInt(32)) 
            val v_temp15 = Mutable[RTLabel](rTLabelDefault)
            val v_temp16 = Mutable[RTLabel](rTLabelDefault)
            val v_temp17 = Mutable[RTLabel](rTLabelDefault)
            val (tmp38101,tmp38102,tmp38103) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))) 
            v_temp15.v = tmp38101
            v_temp16.v = tmp38102
            v_temp17.v = tmp38103
            f_switch_context (v_st,v_temp15.v)
            f_gen_store (v_st,v_If75__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
            f_switch_context (v_st,v_temp16.v)
            f_gen_store (v_st,v_If75__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
            f_switch_context (v_st,v_temp17.v)
            f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_If75__1))
          }
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
        } else {
          if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(64)) 
            if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
              val v_If97__1 : RTSym = f_decl_bv(v_st, "If97__1", BigInt(64)) 
              val v_temp18 = Mutable[RTLabel](rTLabelDefault)
              val v_temp19 = Mutable[RTLabel](rTLabelDefault)
              val v_temp20 = Mutable[RTLabel](rTLabelDefault)
              val (tmp38104,tmp38105,tmp38106) = f_gen_branch(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(64), f_gen_and_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64))), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64))))) 
              v_temp18.v = tmp38104
              v_temp19.v = tmp38105
              v_temp20.v = tmp38106
              f_switch_context (v_st,v_temp18.v)
              f_gen_store (v_st,v_If97__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2), 64)))
              f_switch_context (v_st,v_temp19.v)
              f_gen_store (v_st,v_If97__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
              f_switch_context (v_st,v_temp20.v)
              f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_If97__1))
            } else {
              val v_If102__1 : RTSym = f_decl_bv(v_st, "If102__1", BigInt(64)) 
              val v_temp21 = Mutable[RTLabel](rTLabelDefault)
              val v_temp22 = Mutable[RTLabel](rTLabelDefault)
              val v_temp23 = Mutable[RTLabel](rTLabelDefault)
              val (tmp38107,tmp38108,tmp38109) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)))) 
              v_temp21.v = tmp38107
              v_temp22.v = tmp38108
              v_temp23.v = tmp38109
              f_switch_context (v_st,v_temp21.v)
              f_gen_store (v_st,v_If102__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2), 64)))
              f_switch_context (v_st,v_temp22.v)
              f_gen_store (v_st,v_If102__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
              f_switch_context (v_st,v_temp23.v)
              f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_If102__1))
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
