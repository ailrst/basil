/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_tags_mcaddtag (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  val v_If3__1 = Mutable[Expr](rTExprDefault)
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
    v_If3__1.v = f_gen_load(v_st, v_SP_EL0.v)
  } else {
    val v_X_read6__2 = Mutable[Expr](rTExprDefault)
    v_X_read6__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    v_If3__1.v = v_X_read6__2.v
  }
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))) then {
    f_gen_store (v_st,v_SP_EL0.v,f_gen_append_bits(v_st, BigInt(4), BigInt(60), f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(64), f_gen_slice(v_st, v_If3__1.v, BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), f_append_bits(v_st, BigInt(54), BigInt(6), mkBits(v_st, 54, BigInt("000000000000000000000000000000000000000000000000000000", 2)), bvextract(v_st,v_enc,BigInt(16),BigInt(6))), mkBits(v_st, 4, BigInt("0000", 2))))), BigInt(60), BigInt(4)), f_gen_append_bits(v_st, BigInt(4), BigInt(56), f_gen_bit_lit(v_st, BigInt(4), mkBits(v_st, 4, BigInt("0000", 2))), f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(56), f_gen_slice(v_st, v_If3__1.v, BigInt(0), BigInt(56)), f_gen_bit_lit(v_st, ((BigInt(52)) + (BigInt(4))), f_append_bits(v_st, BigInt(52), BigInt(4), f_append_bits(v_st, BigInt(46), BigInt(6), mkBits(v_st, 46, BigInt("0000000000000000000000000000000000000000000000", 2)), bvextract(v_st,v_enc,BigInt(16),BigInt(6))), mkBits(v_st, 4, BigInt("0000", 2))))), BigInt(0), BigInt(56)))))
  } else {
    f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(4), BigInt(60), f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(64), f_gen_slice(v_st, v_If3__1.v, BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), f_append_bits(v_st, BigInt(54), BigInt(6), mkBits(v_st, 54, BigInt("000000000000000000000000000000000000000000000000000000", 2)), bvextract(v_st,v_enc,BigInt(16),BigInt(6))), mkBits(v_st, 4, BigInt("0000", 2))))), BigInt(60), BigInt(4)), f_gen_append_bits(v_st, BigInt(4), BigInt(56), f_gen_bit_lit(v_st, BigInt(4), mkBits(v_st, 4, BigInt("0000", 2))), f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(56), f_gen_slice(v_st, v_If3__1.v, BigInt(0), BigInt(56)), f_gen_bit_lit(v_st, ((BigInt(52)) + (BigInt(4))), f_append_bits(v_st, BigInt(52), BigInt(4), f_append_bits(v_st, BigInt(46), BigInt(6), mkBits(v_st, 46, BigInt("0000000000000000000000000000000000000000000000", 2)), bvextract(v_st,v_enc,BigInt(16),BigInt(6))), mkBits(v_st, 4, BigInt("0000", 2))))), BigInt(0), BigInt(56)))))
  }
}
