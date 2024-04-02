/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_float_compare_uncond (v_st: LiftState,v_enc: BV) : Unit = {
  val v_Exp3__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2))) 
  if (v_Exp3__1) then {
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_Exp6__2 = Mutable[Expr](rTExprDefault)
    v_Exp6__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_If7__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If7__1.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
    } else {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      v_If7__1.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
    }
    val v_Exp15__2 = Mutable[Expr](rTExprDefault)
    v_Exp15__2.v = f_gen_FPCompare(v_st, BigInt(32), f_gen_slice(v_st, v_Exp6__2.v, BigInt(0), BigInt(32)), v_If7__1.v, f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(4),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v))
    f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, v_Exp15__2.v, BigInt(0), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, v_Exp15__2.v, BigInt(1), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, v_Exp15__2.v, BigInt(2), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, v_Exp15__2.v, BigInt(3), BigInt(1)))
  } else {
    val v_Exp16__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2))) 
    if (v_Exp16__1) then {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      val v_Exp19__2 = Mutable[Expr](rTExprDefault)
      v_Exp19__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_If20__1 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
        v_If20__1.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
      } else {
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        v_If20__1.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64))
      }
      val v_Exp28__2 = Mutable[Expr](rTExprDefault)
      v_Exp28__2.v = f_gen_FPCompare(v_st, BigInt(64), f_gen_slice(v_st, v_Exp19__2.v, BigInt(0), BigInt(64)), v_If20__1.v, f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(4),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, v_Exp28__2.v, BigInt(0), BigInt(1)))
      f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, v_Exp28__2.v, BigInt(1), BigInt(1)))
      f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, v_Exp28__2.v, BigInt(2), BigInt(1)))
      f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, v_Exp28__2.v, BigInt(3), BigInt(1)))
    } else {
      val v_Exp29__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2))) 
      if (v_Exp29__1) then {
        throw Exception("not supported")
      } else {
        val v_Exp30__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2))) 
        if (v_Exp30__1) then {
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          val v_Exp34__2 = Mutable[Expr](rTExprDefault)
          v_Exp34__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
          val v_If35__1 = Mutable[Expr](rTExprDefault)
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
            v_If35__1.v = f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2)))
          } else {
            assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
            v_If35__1.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16))
          }
          val v_Exp43__2 = Mutable[Expr](rTExprDefault)
          v_Exp43__2.v = f_gen_FPCompare(v_st, BigInt(16), f_gen_slice(v_st, v_Exp34__2.v, BigInt(0), BigInt(16)), v_If35__1.v, f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(4),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, v_Exp43__2.v, BigInt(0), BigInt(1)))
          f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, v_Exp43__2.v, BigInt(1), BigInt(1)))
          f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, v_Exp43__2.v, BigInt(2), BigInt(1)))
          f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, v_Exp43__2.v, BigInt(3), BigInt(1)))
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
}
