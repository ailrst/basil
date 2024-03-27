/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_arithmetic_div (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
    val v_X_read4__2 : RTSym = f_decl_bv(v_st, "X.read4__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read4__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read4__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    val v_X_read9__2 : RTSym = f_decl_bv(v_st, "X.read9__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read9__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read9__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    val v_temp0 = Mutable[RTLabel](rTLabelDefault)
    val v_temp1 = Mutable[RTLabel](rTLabelDefault)
    val v_temp2 = Mutable[RTLabel](rTLabelDefault)
    val (tmp3180,tmp3181,tmp3182) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(64), f_gen_load(v_st, v_X_read9__2), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))) 
    v_temp0.v = tmp3180
    v_temp1.v = tmp3181
    v_temp2.v = tmp3182
    f_switch_context (v_st,v_temp0.v)
    f_gen_assert (v_st,f_gen_bool_lit(v_st, ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    f_switch_context (v_st,v_temp1.v)
    val v_If21__2 : RTSym = f_decl_bv(v_st, "If21__2", BigInt(65)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(10),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
      f_gen_store (v_st,v_If21__2,f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), f_gen_load(v_st, v_X_read4__2), f_gen_int_lit(v_st, BigInt(65))))
    } else {
      f_gen_store (v_st,v_If21__2,f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_load(v_st, v_X_read4__2), f_gen_int_lit(v_st, BigInt(65))))
    }
    val v_If26__2 : RTSym = f_decl_bv(v_st, "If26__2", BigInt(65)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(10),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
      f_gen_store (v_st,v_If26__2,f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), f_gen_load(v_st, v_X_read9__2), f_gen_int_lit(v_st, BigInt(65))))
    } else {
      f_gen_store (v_st,v_If26__2,f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_load(v_st, v_X_read9__2), f_gen_int_lit(v_st, BigInt(65))))
    }
    f_gen_assert (v_st,f_gen_bool_lit(v_st, ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_slice(v_st, f_gen_slice(v_st, f_gen_sdiv_bits(v_st, BigInt(65), f_gen_load(v_st, v_If21__2), f_gen_load(v_st, v_If26__2)), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)))
    }
    f_switch_context (v_st,v_temp2.v)
  } else {
    val v_X_read33__2 : RTSym = f_decl_bv(v_st, "X.read33__2", BigInt(32)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read33__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
    } else {
      f_gen_store (v_st,v_X_read33__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
    }
    val v_X_read38__2 : RTSym = f_decl_bv(v_st, "X.read38__2", BigInt(32)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read38__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))
    } else {
      f_gen_store (v_st,v_X_read38__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
    }
    val v_temp3 = Mutable[RTLabel](rTLabelDefault)
    val v_temp4 = Mutable[RTLabel](rTLabelDefault)
    val v_temp5 = Mutable[RTLabel](rTLabelDefault)
    val (tmp3183,tmp3184,tmp3185) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(32), f_gen_load(v_st, v_X_read38__2), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))) 
    v_temp3.v = tmp3183
    v_temp4.v = tmp3184
    v_temp5.v = tmp3185
    f_switch_context (v_st,v_temp3.v)
    f_gen_assert (v_st,f_gen_bool_lit(v_st, ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    f_switch_context (v_st,v_temp4.v)
    val v_If50__2 : RTSym = f_decl_bv(v_st, "If50__2", BigInt(33)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(10),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
      f_gen_store (v_st,v_If50__2,f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read33__2), f_gen_int_lit(v_st, BigInt(33))))
    } else {
      f_gen_store (v_st,v_If50__2,f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read33__2), f_gen_int_lit(v_st, BigInt(33))))
    }
    val v_If55__2 : RTSym = f_decl_bv(v_st, "If55__2", BigInt(33)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(10),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
      f_gen_store (v_st,v_If55__2,f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read38__2), f_gen_int_lit(v_st, BigInt(33))))
    } else {
      f_gen_store (v_st,v_If55__2,f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read38__2), f_gen_int_lit(v_st, BigInt(33))))
    }
    f_gen_assert (v_st,f_gen_bool_lit(v_st, ((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6))))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_sdiv_bits(v_st, BigInt(33), f_gen_load(v_st, v_If50__2), f_gen_load(v_st, v_If55__2)), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(64))))
    }
    f_switch_context (v_st,v_temp5.v)
  }
}
