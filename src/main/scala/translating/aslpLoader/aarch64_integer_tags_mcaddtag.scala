/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_tags_mcaddtag (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_If3__1 : RTSym = f_decl_bv(v_st, "If3__1", BigInt(64)) 
  if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
    f_gen_store (v_st,v_If3__1,f_gen_load(v_st, v_SP_EL0.v))
  } else {
    val v_X_read6__2 : RTSym = f_decl_bv(v_st, "X.read6__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read6__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read6__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    f_gen_store (v_st,v_If3__1,f_gen_load(v_st, v_X_read6__2))
  }
  if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
    f_gen_store (v_st,v_SP_EL0.v,f_gen_append_bits(v_st, BigInt(4), BigInt(60), f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_If3__1), BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), f_append_bits(v_st, BigInt(54), BigInt(6), BitVecLiteral(BigInt("000000000000000000000000000000000000000000000000000000", 2), 54), bvextract(v_st,v_enc,BigInt(16),BigInt(6))), BitVecLiteral(BigInt("0000", 2), 4)))), BigInt(60), BigInt(4)), f_gen_append_bits(v_st, BigInt(4), BigInt(56), f_gen_bit_lit(v_st, BigInt(4), BitVecLiteral(BigInt("0000", 2), 4)), f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(56), f_gen_slice(v_st, f_gen_load(v_st, v_If3__1), BigInt(0), BigInt(56)), f_gen_bit_lit(v_st, ((BigInt(52)) + (BigInt(4))), f_append_bits(v_st, BigInt(52), BigInt(4), f_append_bits(v_st, BigInt(46), BigInt(6), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000", 2), 46), bvextract(v_st,v_enc,BigInt(16),BigInt(6))), BitVecLiteral(BigInt("0000", 2), 4)))), BigInt(0), BigInt(56)))))
  } else {
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(4), BigInt(60), f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_If3__1), BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), f_append_bits(v_st, BigInt(54), BigInt(6), BitVecLiteral(BigInt("000000000000000000000000000000000000000000000000000000", 2), 54), bvextract(v_st,v_enc,BigInt(16),BigInt(6))), BitVecLiteral(BigInt("0000", 2), 4)))), BigInt(60), BigInt(4)), f_gen_append_bits(v_st, BigInt(4), BigInt(56), f_gen_bit_lit(v_st, BigInt(4), BitVecLiteral(BigInt("0000", 2), 4)), f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(56), f_gen_slice(v_st, f_gen_load(v_st, v_If3__1), BigInt(0), BigInt(56)), f_gen_bit_lit(v_st, ((BigInt(52)) + (BigInt(4))), f_append_bits(v_st, BigInt(52), BigInt(4), f_append_bits(v_st, BigInt(46), BigInt(6), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000", 2), 46), bvextract(v_st,v_enc,BigInt(16),BigInt(6))), BitVecLiteral(BigInt("0000", 2), 4)))), BigInt(0), BigInt(56)))))
    }
  }
}
