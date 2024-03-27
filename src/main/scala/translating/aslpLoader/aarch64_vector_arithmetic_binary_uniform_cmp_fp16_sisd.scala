/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_cmp_fp16_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_cmp__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(3)))
  val v_abs__1 = Mutable[Boolean](true)
  if (f_eq_bits(v_st, BigInt(3), f_append_bits(v_st, BigInt(2), BigInt(1), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), bvextract(v_st,v_enc,BigInt(11),BigInt(1))), BitVecLiteral(BigInt("000", 2), 3))) then {
    v_cmp__1.v = BitVecLiteral(BigInt("010", 2), 3)
    v_abs__1.v = false
  } else {
    if (f_eq_bits(v_st, BigInt(3), f_append_bits(v_st, BigInt(2), BigInt(1), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), bvextract(v_st,v_enc,BigInt(11),BigInt(1))), BitVecLiteral(BigInt("010", 2), 3))) then {
      v_cmp__1.v = BitVecLiteral(BigInt("001", 2), 3)
      v_abs__1.v = false
    } else {
      if (f_eq_bits(v_st, BigInt(3), f_append_bits(v_st, BigInt(2), BigInt(1), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), bvextract(v_st,v_enc,BigInt(11),BigInt(1))), BitVecLiteral(BigInt("011", 2), 3))) then {
        v_cmp__1.v = BitVecLiteral(BigInt("001", 2), 3)
        v_abs__1.v = true
      } else {
        if (f_eq_bits(v_st, BigInt(3), f_append_bits(v_st, BigInt(2), BigInt(1), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), bvextract(v_st,v_enc,BigInt(11),BigInt(1))), BitVecLiteral(BigInt("110", 2), 3))) then {
          v_cmp__1.v = BitVecLiteral(BigInt("000", 2), 3)
          v_abs__1.v = false
        } else {
          if (f_eq_bits(v_st, BigInt(3), f_append_bits(v_st, BigInt(2), BigInt(1), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), bvextract(v_st,v_enc,BigInt(29),BigInt(1))), bvextract(v_st,v_enc,BigInt(11),BigInt(1))), BitVecLiteral(BigInt("111", 2), 3))) then {
            v_cmp__1.v = BitVecLiteral(BigInt("000", 2), 3)
            v_abs__1.v = true
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
  }
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(16)) 
  val v_test_passed__1 : RTSym = f_decl_bool(v_st, "test_passed__1") 
  if (v_abs__1.v) then {
    if (f_eq_bits(v_st, BigInt(3), v_cmp__1.v, BitVecLiteral(BigInt("010", 2), 3))) then {
      val v_Exp18__2 : RTSym = f_decl_bool(v_st, "Exp18__2") 
      f_gen_store (v_st,v_Exp18__2,f_gen_FPCompareEQ(v_st, BigInt(16), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15))), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(15))), f_gen_load(v_st, v_FPCR.v)))
      f_gen_store (v_st,v_test_passed__1,f_gen_load(v_st, v_Exp18__2))
    } else {
      if (f_eq_bits(v_st, BigInt(3), v_cmp__1.v, BitVecLiteral(BigInt("001", 2), 3))) then {
        val v_Exp20__2 : RTSym = f_decl_bool(v_st, "Exp20__2") 
        f_gen_store (v_st,v_Exp20__2,f_gen_FPCompareGE(v_st, BigInt(16), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15))), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(15))), f_gen_load(v_st, v_FPCR.v)))
        f_gen_store (v_st,v_test_passed__1,f_gen_load(v_st, v_Exp20__2))
      } else {
        if (f_eq_bits(v_st, BigInt(3), v_cmp__1.v, BitVecLiteral(BigInt("000", 2), 3))) then {
          val v_Exp22__2 : RTSym = f_decl_bool(v_st, "Exp22__2") 
          f_gen_store (v_st,v_Exp22__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15))), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(15))), f_gen_load(v_st, v_FPCR.v)))
          f_gen_store (v_st,v_test_passed__1,f_gen_load(v_st, v_Exp22__2))
        } else {
          throw Exception("not supported")
        }
      }
    }
    val v_If25__1 : RTSym = f_decl_bv(v_st, "If25__1", BigInt(16)) 
    val v_temp0 = Mutable[RTLabel](rTLabelDefault)
    val v_temp1 = Mutable[RTLabel](rTLabelDefault)
    val v_temp2 = Mutable[RTLabel](rTLabelDefault)
    val (tmp38356,tmp38357,tmp38358) = f_gen_branch(v_st, f_gen_load(v_st, v_test_passed__1)) 
    v_temp0.v = tmp38356
    v_temp1.v = tmp38357
    v_temp2.v = tmp38358
    f_switch_context (v_st,v_temp0.v)
    f_gen_store (v_st,v_If25__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp1.v)
    f_gen_store (v_st,v_If25__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp2.v)
    f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_If25__1))
  } else {
    if (f_eq_bits(v_st, BigInt(3), v_cmp__1.v, BitVecLiteral(BigInt("010", 2), 3))) then {
      val v_Exp31__2 : RTSym = f_decl_bool(v_st, "Exp31__2") 
      f_gen_store (v_st,v_Exp31__2,f_gen_FPCompareEQ(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      f_gen_store (v_st,v_test_passed__1,f_gen_load(v_st, v_Exp31__2))
    } else {
      if (f_eq_bits(v_st, BigInt(3), v_cmp__1.v, BitVecLiteral(BigInt("001", 2), 3))) then {
        val v_Exp33__2 : RTSym = f_decl_bool(v_st, "Exp33__2") 
        f_gen_store (v_st,v_Exp33__2,f_gen_FPCompareGE(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
        f_gen_store (v_st,v_test_passed__1,f_gen_load(v_st, v_Exp33__2))
      } else {
        if (f_eq_bits(v_st, BigInt(3), v_cmp__1.v, BitVecLiteral(BigInt("000", 2), 3))) then {
          val v_Exp35__2 : RTSym = f_decl_bool(v_st, "Exp35__2") 
          f_gen_store (v_st,v_Exp35__2,f_gen_FPCompareGT(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
          f_gen_store (v_st,v_test_passed__1,f_gen_load(v_st, v_Exp35__2))
        } else {
          throw Exception("not supported")
        }
      }
    }
    val v_If38__1 : RTSym = f_decl_bv(v_st, "If38__1", BigInt(16)) 
    val v_temp3 = Mutable[RTLabel](rTLabelDefault)
    val v_temp4 = Mutable[RTLabel](rTLabelDefault)
    val v_temp5 = Mutable[RTLabel](rTLabelDefault)
    val (tmp38359,tmp38360,tmp38361) = f_gen_branch(v_st, f_gen_load(v_st, v_test_passed__1)) 
    v_temp3.v = tmp38359
    v_temp4.v = tmp38360
    v_temp5.v = tmp38361
    f_switch_context (v_st,v_temp3.v)
    f_gen_store (v_st,v_If38__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("1111111111111111", 2), 16)))
    f_switch_context (v_st,v_temp4.v)
    f_gen_store (v_st,v_If38__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    f_switch_context (v_st,v_temp5.v)
    f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_If38__1))
  }
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
}
