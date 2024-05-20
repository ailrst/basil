/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_tags_mcinserttagmask (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  val v_If4__1 = Mutable[Expr](rTExprDefault)
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
    v_If4__1.v = f_gen_load(v_st, v_SP_EL0.v)
  } else {
    val v_X_read7__2 = Mutable[Expr](rTExprDefault)
    v_X_read7__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    v_If4__1.v = v_X_read7__2.v
  }
  val v_X_read12__2 = Mutable[Expr](rTExprDefault)
  if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
    v_X_read12__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
  } else {
    v_X_read12__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
  }
  if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
    f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_or_bits(v_st, BigInt(64), f_gen_and_bits(v_st, BigInt(64), v_X_read12__2.v, f_gen_not_bits(v_st, BigInt(64), f_gen_lsl_bits(v_st, BigInt(64), BigInt(5), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000001", 2))), f_gen_ZeroExtend(v_st, BigInt(4), BigInt(5), f_gen_slice(v_st, v_If4__1.v, BigInt(56), BigInt(4)), f_gen_int_lit(v_st, BigInt(5)))))), f_gen_lsl_bits(v_st, BigInt(64), BigInt(5), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000001", 2))), f_gen_ZeroExtend(v_st, BigInt(4), BigInt(5), f_gen_slice(v_st, v_If4__1.v, BigInt(56), BigInt(4)), f_gen_int_lit(v_st, BigInt(5))))))
  }
}
