/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_tags_mcsettagpairpost (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  val v_If3__1 = Mutable[Expr](rTExprDefault)
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))) then {
    v_If3__1.v = f_gen_load(v_st, v_SP_EL0.v)
  } else {
    val v_X_read6__2 = Mutable[Expr](rTExprDefault)
    v_X_read6__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
    v_If3__1.v = v_X_read6__2.v
  }
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
    val v_Exp14__2 = Mutable[Expr](rTExprDefault)
    v_Exp14__2.v = f_gen_load(v_st, v_SP_EL0.v)
    f_gen_AArch64_MemTag_set (v_st,v_Exp14__2.v,f_gen_int_lit(v_st, BigInt(0)),f_gen_slice(v_st, v_If3__1.v, BigInt(56), BigInt(4)))
    f_gen_AArch64_MemTag_set (v_st,f_gen_add_bits(v_st, BigInt(64), v_Exp14__2.v, f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000010000", 2)))),f_gen_int_lit(v_st, BigInt(0)),f_gen_slice(v_st, v_If3__1.v, BigInt(56), BigInt(4)))
    f_gen_store (v_st,v_SP_EL0.v,f_gen_add_bits(v_st, BigInt(64), v_Exp14__2.v, f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(9), BigInt(64), bvextract(v_st,v_enc,BigInt(12),BigInt(9)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), mkBits(v_st, 4, BigInt("0000", 2))))))
  } else {
    val v_X_read19__2 = Mutable[Expr](rTExprDefault)
    v_X_read19__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_Exp23__2 = Mutable[Expr](rTExprDefault)
    v_Exp23__2.v = v_X_read19__2.v
    f_gen_AArch64_MemTag_set (v_st,v_Exp23__2.v,f_gen_int_lit(v_st, BigInt(0)),f_gen_slice(v_st, v_If3__1.v, BigInt(56), BigInt(4)))
    f_gen_AArch64_MemTag_set (v_st,f_gen_add_bits(v_st, BigInt(64), v_Exp23__2.v, f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000010000", 2)))),f_gen_int_lit(v_st, BigInt(0)),f_gen_slice(v_st, v_If3__1.v, BigInt(56), BigInt(4)))
    f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))),f_gen_add_bits(v_st, BigInt(64), v_Exp23__2.v, f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(9), BigInt(64), bvextract(v_st,v_enc,BigInt(12),BigInt(9)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), mkBits(v_st, 4, BigInt("0000", 2))))))
  }
}
