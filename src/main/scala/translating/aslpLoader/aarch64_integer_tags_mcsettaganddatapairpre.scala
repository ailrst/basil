/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_tags_mcsettaganddatapairpre (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
    val v_Exp6__2 = Mutable[Expr](rTExprDefault)
    v_Exp6__2.v = f_gen_load(v_st, v_SP_EL0.v)
    val v_X_read7__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_X_read7__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
    } else {
      v_X_read7__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    val v_X_read12__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000111110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000111110000000000", 2)))))) then {
      v_X_read12__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5))))
    } else {
      v_X_read12__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    f_gen_Mem_set (v_st,BigInt(8),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_SP_EL0.v), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), mkBits(v_st, 4, BigInt("0000", 2))))),f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, BigInt(0)),v_X_read7__2.v)
    f_gen_Mem_set (v_st,BigInt(8),f_gen_add_bits(v_st, BigInt(64), f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_SP_EL0.v), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), mkBits(v_st, 4, BigInt("0000", 2))))), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000001000", 2)))),f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, BigInt(0)),v_X_read12__2.v)
    f_gen_AArch64_MemTag_set (v_st,f_gen_add_bits(v_st, BigInt(64), v_Exp6__2.v, f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), mkBits(v_st, 4, BigInt("0000", 2))))),f_gen_int_lit(v_st, BigInt(0)),f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(60), f_gen_slice(v_st, v_Exp6__2.v, BigInt(0), BigInt(60)), f_gen_bit_lit(v_st, ((BigInt(56)) + (BigInt(4))), f_append_bits(v_st, BigInt(56), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(56)),BigInt(0),BigInt(56)), mkBits(v_st, 4, BigInt("0000", 2))))), BigInt(56), BigInt(4)))
    f_gen_store (v_st,v_SP_EL0.v,f_gen_add_bits(v_st, BigInt(64), v_Exp6__2.v, f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), mkBits(v_st, 4, BigInt("0000", 2))))))
  } else {
    val v_X_read22__2 = Mutable[Expr](rTExprDefault)
    v_X_read22__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_Exp26__2 = Mutable[Expr](rTExprDefault)
    v_Exp26__2.v = v_X_read22__2.v
    val v_X_read27__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_X_read27__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
    } else {
      v_X_read27__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    val v_X_read32__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000111110000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000111110000000000", 2)))))) then {
      v_X_read32__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5))))
    } else {
      v_X_read32__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    f_gen_Mem_set (v_st,BigInt(8),f_gen_add_bits(v_st, BigInt(64), v_X_read22__2.v, f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), mkBits(v_st, 4, BigInt("0000", 2))))),f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, BigInt(0)),v_X_read27__2.v)
    f_gen_Mem_set (v_st,BigInt(8),f_gen_add_bits(v_st, BigInt(64), f_gen_add_bits(v_st, BigInt(64), v_X_read22__2.v, f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), mkBits(v_st, 4, BigInt("0000", 2))))), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000001000", 2)))),f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, BigInt(0)),v_X_read32__2.v)
    f_gen_AArch64_MemTag_set (v_st,f_gen_add_bits(v_st, BigInt(64), v_Exp26__2.v, f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), mkBits(v_st, 4, BigInt("0000", 2))))),f_gen_int_lit(v_st, BigInt(0)),f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(60), f_gen_slice(v_st, v_Exp26__2.v, BigInt(0), BigInt(60)), f_gen_bit_lit(v_st, ((BigInt(56)) + (BigInt(4))), f_append_bits(v_st, BigInt(56), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(56)),BigInt(0),BigInt(56)), mkBits(v_st, 4, BigInt("0000", 2))))), BigInt(56), BigInt(4)))
    f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))),f_gen_add_bits(v_st, BigInt(64), v_Exp26__2.v, f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), mkBits(v_st, 4, BigInt("0000", 2))))))
  }
}
