/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_pac_pacib_hint (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_d__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(5)))
  val v_n__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(5)))
  val v_source_is_sp__1 = Mutable[Boolean](false)
  if (f_eq_bits(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(8),BigInt(4)), bvextract(v_st,v_enc,BigInt(5),BigInt(3))), BitVecLiteral(BigInt("0011010", 2), 7))) then {
    v_d__1.v = BitVecLiteral(BigInt("11110", 2), 5)
    v_n__1.v = BitVecLiteral(BigInt("11111", 2), 5)
  } else {
    if (f_eq_bits(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(8),BigInt(4)), bvextract(v_st,v_enc,BigInt(5),BigInt(3))), BitVecLiteral(BigInt("0011011", 2), 7))) then {
      v_d__1.v = BitVecLiteral(BigInt("11110", 2), 5)
      v_source_is_sp__1.v = true
      val v_BTypeCompatible_PACIXSP3__2 : RTSym = f_decl_bool(v_st, "BTypeCompatible_PACIXSP3__2") 
      val v_Exp6__2 : RTSym = f_decl_bool(v_st, "Exp6__2") 
      f_gen_store (v_st,v_Exp6__2,f_gen_or_bool(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_load(v_st, v_PSTATE_BTYPE.v), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2))), f_gen_and_bool(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_load(v_st, v_PSTATE_BTYPE.v), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2)))), f_gen_eq_bits(v_st, BigInt(2), f_gen_load(v_st, v_PSTATE_BTYPE.v), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2))))))
      val v_temp0 = Mutable[RTLabel](rTLabelDefault)
      val v_temp1 = Mutable[RTLabel](rTLabelDefault)
      val v_temp2 = Mutable[RTLabel](rTLabelDefault)
      val (tmp4408,tmp4409,tmp4410) = f_gen_branch(v_st, f_gen_load(v_st, v_Exp6__2)) 
      v_temp0.v = tmp4408
      v_temp1.v = tmp4409
      v_temp2.v = tmp4410
      f_switch_context (v_st,v_temp0.v)
      f_gen_store (v_st,v_BTypeCompatible_PACIXSP3__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,v_temp1.v)
      val v_temp3 = Mutable[RTLabel](rTLabelDefault)
      val v_temp4 = Mutable[RTLabel](rTLabelDefault)
      val v_temp5 = Mutable[RTLabel](rTLabelDefault)
      val (tmp4411,tmp4412,tmp4413) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_load(v_st, v_PSTATE_BTYPE.v), f_gen_bit_lit(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2)))) 
      v_temp3.v = tmp4411
      v_temp4.v = tmp4412
      v_temp5.v = tmp4413
      f_switch_context (v_st,v_temp3.v)
      f_gen_store (v_st,v_BTypeCompatible_PACIXSP3__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,v_temp4.v)
      f_gen_store (v_st,v_BTypeCompatible_PACIXSP3__2,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,v_temp5.v)
      f_switch_context (v_st,v_temp2.v)
      f_gen_store (v_st,v_BTypeCompatible.v,f_gen_load(v_st, v_BTypeCompatible_PACIXSP3__2))
    } else {
      if (f_eq_bits(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(8),BigInt(4)), bvextract(v_st,v_enc,BigInt(5),BigInt(3))), BitVecLiteral(BigInt("0001010", 2), 7))) then {
        v_d__1.v = BitVecLiteral(BigInt("10001", 2), 5)
        v_n__1.v = BitVecLiteral(BigInt("10000", 2), 5)
      } else {
        throw Exception("not supported")
      }
    }
  }
  if (v_source_is_sp__1.v) then {
    val v_X_read75__2 : RTSym = f_decl_bv(v_st, "X.read75__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), v_d__1.v, BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read75__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), v_d__1.v)))
    } else {
      f_gen_store (v_st,v_X_read75__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), v_d__1.v, BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), v_d__1.v),f_gen_load(v_st, v_X_read75__2))
    }
  } else {
    val v_X_read177__2 : RTSym = f_decl_bv(v_st, "X.read177__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), v_d__1.v, BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read177__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), v_d__1.v)))
    } else {
      f_gen_store (v_st,v_X_read177__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_n__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_n__1.v, BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), v_d__1.v, BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), v_d__1.v),f_gen_load(v_st, v_X_read177__2))
    }
  }
}
