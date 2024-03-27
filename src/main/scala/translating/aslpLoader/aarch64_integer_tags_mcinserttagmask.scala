/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_tags_mcinserttagmask (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_If4__1 : RTSym = f_decl_bv(v_st, "If4__1", BigInt(64)) 
  if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
    f_gen_store (v_st,v_If4__1,f_gen_load(v_st, v_SP_EL0.v))
  } else {
    val v_X_read7__2 : RTSym = f_decl_bv(v_st, "X.read7__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read7__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read7__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    f_gen_store (v_st,v_If4__1,f_gen_load(v_st, v_X_read7__2))
  }
  val v_X_read12__2 : RTSym = f_decl_bv(v_st, "X.read12__2", BigInt(64)) 
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
    f_gen_store (v_st,v_X_read12__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
  } else {
    f_gen_store (v_st,v_X_read12__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
  }
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
    f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_or_bits(v_st, BigInt(64), f_gen_and_bits(v_st, BigInt(64), f_gen_load(v_st, v_X_read12__2), f_gen_not_bits(v_st, BigInt(64), f_gen_lsl_bits(v_st, BigInt(64), BigInt(5), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000001", 2), 64)), f_gen_ZeroExtend(v_st, BigInt(4), BigInt(5), f_gen_slice(v_st, f_gen_load(v_st, v_If4__1), BigInt(56), BigInt(4)), f_gen_int_lit(v_st, BigInt(5)))))), f_gen_lsl_bits(v_st, BigInt(64), BigInt(5), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000001", 2), 64)), f_gen_ZeroExtend(v_st, BigInt(4), BigInt(5), f_gen_slice(v_st, f_gen_load(v_st, v_If4__1), BigInt(56), BigInt(4)), f_gen_int_lit(v_st, BigInt(5))))))
  }
}
