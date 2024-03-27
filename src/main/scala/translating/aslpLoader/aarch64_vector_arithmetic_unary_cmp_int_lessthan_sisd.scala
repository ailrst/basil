/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_cmp_int_lessthan_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_ne_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      val v_If10__1 : RTSym = f_decl_bv(v_st, "If10__1", BigInt(8)) 
      val v_temp0 = Mutable[RTLabel](rTLabelDefault)
      val v_temp1 = Mutable[RTLabel](rTLabelDefault)
      val v_temp2 = Mutable[RTLabel](rTLabelDefault)
      val (tmp68002,tmp68003,tmp68004) = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(8), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8)))) 
      v_temp0.v = tmp68002
      v_temp1.v = tmp68003
      v_temp2.v = tmp68004
      f_switch_context (v_st,v_temp0.v)
      f_gen_store (v_st,v_If10__1,f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("11111111", 2), 8)))
      f_switch_context (v_st,v_temp1.v)
      f_gen_store (v_st,v_If10__1,f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8)))
      f_switch_context (v_st,v_temp2.v)
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(8), BigInt(128), f_gen_load(v_st, v_If10__1), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_If26__1 : RTSym = f_decl_bv(v_st, "If26__1", BigInt(16)) 
        val v_temp3 = Mutable[RTLabel](rTLabelDefault)
        val v_temp4 = Mutable[RTLabel](rTLabelDefault)
        val v_temp5 = Mutable[RTLabel](rTLabelDefault)
        val (tmp68005,tmp68006,tmp68007) = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))) 
        v_temp3.v = tmp68005
        v_temp4.v = tmp68006
        v_temp5.v = tmp68007
        f_switch_context (v_st,v_temp3.v)
        f_gen_store (v_st,v_If26__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
        f_switch_context (v_st,v_temp4.v)
        f_gen_store (v_st,v_If26__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
        f_switch_context (v_st,v_temp5.v)
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_If26__1), f_gen_int_lit(v_st, BigInt(128))))
      } else {
        if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_If42__1 : RTSym = f_decl_bv(v_st, "If42__1", BigInt(32)) 
          val v_temp6 = Mutable[RTLabel](rTLabelDefault)
          val v_temp7 = Mutable[RTLabel](rTLabelDefault)
          val v_temp8 = Mutable[RTLabel](rTLabelDefault)
          val (tmp68008,tmp68009,tmp68010) = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))) 
          v_temp6.v = tmp68008
          v_temp7.v = tmp68009
          v_temp8.v = tmp68010
          f_switch_context (v_st,v_temp6.v)
          f_gen_store (v_st,v_If42__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
          f_switch_context (v_st,v_temp7.v)
          f_gen_store (v_st,v_If42__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
          f_switch_context (v_st,v_temp8.v)
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_If42__1), f_gen_int_lit(v_st, BigInt(128))))
        } else {
          if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            val v_If58__1 : RTSym = f_decl_bv(v_st, "If58__1", BigInt(64)) 
            val v_temp9 = Mutable[RTLabel](rTLabelDefault)
            val v_temp10 = Mutable[RTLabel](rTLabelDefault)
            val v_temp11 = Mutable[RTLabel](rTLabelDefault)
            val (tmp68011,tmp68012,tmp68013) = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))) 
            v_temp9.v = tmp68011
            v_temp10.v = tmp68012
            v_temp11.v = tmp68013
            f_switch_context (v_st,v_temp9.v)
            f_gen_store (v_st,v_If58__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2), 64)))
            f_switch_context (v_st,v_temp10.v)
            f_gen_store (v_st,v_If58__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
            f_switch_context (v_st,v_temp11.v)
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_If58__1), f_gen_int_lit(v_st, BigInt(128))))
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
  }
}
