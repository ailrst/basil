/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_cmp_float_lessthan_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp12__2 : RTSym = f_decl_bool(v_st, "Exp12__2") 
    f_gen_store (v_st,v_Exp12__2,f_gen_FPCompareGT(v_st, BigInt(32), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
    val v_If14__1 : RTSym = f_decl_bv(v_st, "If14__1", BigInt(32)) 
    val v_temp0 = Mutable[RTLabel](rTLabelDefault)
    val v_temp1 = Mutable[RTLabel](rTLabelDefault)
    val v_temp2 = Mutable[RTLabel](rTLabelDefault)
    val (tmp66976,tmp66977,tmp66978) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp12__2)) 
    v_temp0.v = tmp66976
    v_temp1.v = tmp66977
    v_temp2.v = tmp66978
    f_switch_context (v_st,v_temp0.v)
    f_gen_store (v_st,v_If14__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("11111111111111111111111111111111", 2), 32)))
    f_switch_context (v_st,v_temp1.v)
    f_gen_store (v_st,v_If14__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
    f_switch_context (v_st,v_temp2.v)
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_If14__1), f_gen_int_lit(v_st, BigInt(128))))
  } else {
    if (f_eq_bits(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      val v_Exp32__2 : RTSym = f_decl_bool(v_st, "Exp32__2") 
      f_gen_store (v_st,v_Exp32__2,f_gen_FPCompareGT(v_st, BigInt(64), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
      val v_If34__1 : RTSym = f_decl_bv(v_st, "If34__1", BigInt(64)) 
      val v_temp3 = Mutable[RTLabel](rTLabelDefault)
      val v_temp4 = Mutable[RTLabel](rTLabelDefault)
      val v_temp5 = Mutable[RTLabel](rTLabelDefault)
      val (tmp66979,tmp66980,tmp66981) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp32__2)) 
      v_temp3.v = tmp66979
      v_temp4.v = tmp66980
      v_temp5.v = tmp66981
      f_switch_context (v_st,v_temp3.v)
      f_gen_store (v_st,v_If34__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2), 64)))
      f_switch_context (v_st,v_temp4.v)
      f_gen_store (v_st,v_If34__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
      f_switch_context (v_st,v_temp5.v)
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_If34__1), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      throw Exception("not supported")
    }
  }
}
