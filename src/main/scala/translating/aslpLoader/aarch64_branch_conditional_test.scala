/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_branch_conditional_test (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
    val v_X_read3__2 : RTSym = f_decl_bv(v_st, "X.read3__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read3__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read3__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    val v_temp0 = Mutable[RTLabel](rTLabelDefault)
    val v_temp1 = Mutable[RTLabel](rTLabelDefault)
    val v_temp2 = Mutable[RTLabel](rTLabelDefault)
    val (tmp10,tmp11,tmp12) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(64), BigInt(7), f_gen_load(v_st, v_X_read3__2), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(1), BigInt(5), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), bvextract(v_st,v_enc,BigInt(19),BigInt(5))), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(24),BigInt(1))))) 
    v_temp0.v = tmp10
    v_temp1.v = tmp11
    v_temp2.v = tmp12
    f_switch_context (v_st,v_temp0.v)
    f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
    f_gen_store (v_st,v__PC.v,f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), f_SignExtend(v_st, BigInt(16), BigInt(64), f_append_bits(v_st, BigInt(14), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(14)), BitVecLiteral(BigInt("00", 2), 2)), BigInt(64)))))
    f_switch_context (v_st,v_temp1.v)
    f_switch_context (v_st,v_temp2.v)
  } else {
    val v_X_read16__2 : RTSym = f_decl_bv(v_st, "X.read16__2", BigInt(32)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read16__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)))
    } else {
      f_gen_store (v_st,v_X_read16__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
    }
    val v_temp3 = Mutable[RTLabel](rTLabelDefault)
    val v_temp4 = Mutable[RTLabel](rTLabelDefault)
    val v_temp5 = Mutable[RTLabel](rTLabelDefault)
    val (tmp13,tmp14,tmp15) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_lsr_bits(v_st, BigInt(32), BigInt(7), f_gen_load(v_st, v_X_read16__2), f_gen_bit_lit(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_append_bits(v_st, BigInt(1), BigInt(5), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), bvextract(v_st,v_enc,BigInt(19),BigInt(5))), BigInt(7)))), BigInt(0), BigInt(1)), BigInt(0), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(24),BigInt(1))))) 
    v_temp3.v = tmp13
    v_temp4.v = tmp14
    v_temp5.v = tmp15
    f_switch_context (v_st,v_temp3.v)
    f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
    f_gen_store (v_st,v__PC.v,f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), f_SignExtend(v_st, BigInt(16), BigInt(64), f_append_bits(v_st, BigInt(14), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(14)), BitVecLiteral(BigInt("00", 2), 2)), BigInt(64)))))
    f_switch_context (v_st,v_temp4.v)
    f_switch_context (v_st,v_temp5.v)
  }
}
