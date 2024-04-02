/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_tags_mcsettag (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
    val v_Exp5__2 = Mutable[Expr](rTExprDefault)
    v_Exp5__2.v = f_gen_load(v_st, v_SP_EL0.v)
    val v_If6__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
      v_If6__1.v = f_gen_load(v_st, v_SP_EL0.v)
    } else {
      val v_X_read8__2 = Mutable[Expr](rTExprDefault)
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
        v_X_read8__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
      } else {
        v_X_read8__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
      }
      v_If6__1.v = v_X_read8__2.v
    }
    f_gen_AArch64_MemTag_set (v_st,f_gen_add_bits(v_st, BigInt(64), v_Exp5__2.v, f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(9), BigInt(64), bvextract(v_st,v_enc,BigInt(12),BigInt(9)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), mkBits(v_st, 4, BigInt("0000", 2))))),f_gen_int_lit(v_st, BigInt(0)),f_gen_slice(v_st, v_If6__1.v, BigInt(56), BigInt(4)))
  } else {
    val v_X_read14__2 = Mutable[Expr](rTExprDefault)
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
      v_X_read14__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    } else {
      v_X_read14__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
    }
    val v_Exp18__2 = Mutable[Expr](rTExprDefault)
    v_Exp18__2.v = v_X_read14__2.v
    val v_If19__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
      v_If19__1.v = f_gen_load(v_st, v_SP_EL0.v)
    } else {
      val v_X_read22__2 = Mutable[Expr](rTExprDefault)
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
        v_X_read22__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
      } else {
        v_X_read22__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
      }
      v_If19__1.v = v_X_read22__2.v
    }
    f_gen_AArch64_MemTag_set (v_st,f_gen_add_bits(v_st, BigInt(64), v_Exp18__2.v, f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(9), BigInt(64), bvextract(v_st,v_enc,BigInt(12),BigInt(9)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), mkBits(v_st, 4, BigInt("0000", 2))))),f_gen_int_lit(v_st, BigInt(0)),f_gen_slice(v_st, v_If19__1.v, BigInt(56), BigInt(4)))
  }
}
