/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_float_round_frint_32_64 (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)), bvextract(v_st,v_enc,BigInt(30),BigInt(1))), mkBits(v_st, 2, BigInt("10", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
        val v_If6__1 = Mutable[BV](mkBits(v_st, BigInt(7), BigInt(0)))
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
          v_If6__1.v = mkBits(v_st, 7, BigInt("0100000", 2))
        } else {
          v_If6__1.v = mkBits(v_st, 7, BigInt("1000000", 2))
        }
        val v_If7__1 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
          v_If7__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2)))
        } else {
          val v_FPDecodeRounding10__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding10__3", BigInt(3)) 
          val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp0))
          f_gen_store (v_st,v_FPDecodeRounding10__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
          f_switch_context (v_st,f_false_branch(v_st, v_temp0))
          val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp1))
          f_gen_store (v_st,v_FPDecodeRounding10__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
          f_switch_context (v_st,f_false_branch(v_st, v_temp1))
          val v_temp2 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp2))
          f_gen_store (v_st,v_FPDecodeRounding10__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
          f_switch_context (v_st,f_false_branch(v_st, v_temp2))
          val v_temp3 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp3))
          f_gen_store (v_st,v_FPDecodeRounding10__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
          f_switch_context (v_st,f_false_branch(v_st, v_temp3))
          f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
          v_If7__1.v = f_gen_load(v_st, v_FPDecodeRounding10__3)
        }
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        val v_Exp18__2 : RTSym = f_decl_bv(v_st, "Exp18__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp18__2,f_gen_FPRoundIntN(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_If7__1.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If6__1.v))))
        val v_Exp21__2 : RTSym = f_decl_bv(v_st, "Exp21__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp21__2,f_gen_FPRoundIntN(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_If7__1.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If6__1.v))))
        val v_Exp24__2 : RTSym = f_decl_bv(v_st, "Exp24__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp24__2,f_gen_FPRoundIntN(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_If7__1.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If6__1.v))))
        val v_Exp27__2 = Mutable[Expr](rTExprDefault)
        v_Exp27__2.v = f_gen_FPRoundIntN(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_If7__1.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If6__1.v)))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_Exp27__2.v, f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_Exp24__2), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_Exp21__2), f_gen_load(v_st, v_Exp18__2)))))
      } else {
        val v_If34__1 = Mutable[BV](mkBits(v_st, BigInt(7), BigInt(0)))
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
          v_If34__1.v = mkBits(v_st, 7, BigInt("0100000", 2))
        } else {
          v_If34__1.v = mkBits(v_st, 7, BigInt("1000000", 2))
        }
        val v_If35__1 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
          v_If35__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2)))
        } else {
          val v_FPDecodeRounding38__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding38__3", BigInt(3)) 
          val v_temp4 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp4))
          f_gen_store (v_st,v_FPDecodeRounding38__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
          f_switch_context (v_st,f_false_branch(v_st, v_temp4))
          val v_temp5 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp5))
          f_gen_store (v_st,v_FPDecodeRounding38__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
          f_switch_context (v_st,f_false_branch(v_st, v_temp5))
          val v_temp6 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp6))
          f_gen_store (v_st,v_FPDecodeRounding38__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
          f_switch_context (v_st,f_false_branch(v_st, v_temp6))
          val v_temp7 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp7))
          f_gen_store (v_st,v_FPDecodeRounding38__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
          f_switch_context (v_st,f_false_branch(v_st, v_temp7))
          f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp4))
          v_If35__1.v = f_gen_load(v_st, v_FPDecodeRounding38__3)
        }
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        val v_Exp46__2 : RTSym = f_decl_bv(v_st, "Exp46__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp46__2,f_gen_FPRoundIntN(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_If35__1.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If34__1.v))))
        val v_Exp49__2 = Mutable[Expr](rTExprDefault)
        v_Exp49__2.v = f_gen_FPRoundIntN(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_If35__1.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If34__1.v)))
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp49__2.v, f_gen_load(v_st, v_Exp46__2)), f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      if (f_eq_bits(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
          val v_If57__1 = Mutable[BV](mkBits(v_st, BigInt(7), BigInt(0)))
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
            v_If57__1.v = mkBits(v_st, 7, BigInt("0100000", 2))
          } else {
            v_If57__1.v = mkBits(v_st, 7, BigInt("1000000", 2))
          }
          val v_If58__1 = Mutable[Expr](rTExprDefault)
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
            v_If58__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2)))
          } else {
            val v_FPDecodeRounding61__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding61__3", BigInt(3)) 
            val v_temp8 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
            f_switch_context (v_st,f_true_branch(v_st, v_temp8))
            f_gen_store (v_st,v_FPDecodeRounding61__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
            f_switch_context (v_st,f_false_branch(v_st, v_temp8))
            val v_temp9 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))) 
            f_switch_context (v_st,f_true_branch(v_st, v_temp9))
            f_gen_store (v_st,v_FPDecodeRounding61__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
            f_switch_context (v_st,f_false_branch(v_st, v_temp9))
            val v_temp10 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))) 
            f_switch_context (v_st,f_true_branch(v_st, v_temp10))
            f_gen_store (v_st,v_FPDecodeRounding61__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
            f_switch_context (v_st,f_false_branch(v_st, v_temp10))
            val v_temp11 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2))))) 
            f_switch_context (v_st,f_true_branch(v_st, v_temp11))
            f_gen_store (v_st,v_FPDecodeRounding61__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
            f_switch_context (v_st,f_false_branch(v_st, v_temp11))
            f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
            f_switch_context (v_st,f_merge_branch(v_st, v_temp8))
            v_If58__1.v = f_gen_load(v_st, v_FPDecodeRounding61__3)
          }
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          val v_Exp69__2 : RTSym = f_decl_bv(v_st, "Exp69__2", BigInt(64)) 
          f_gen_store (v_st,v_Exp69__2,f_gen_FPRoundIntN(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_If58__1.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If57__1.v))))
          val v_Exp72__2 = Mutable[Expr](rTExprDefault)
          v_Exp72__2.v = f_gen_FPRoundIntN(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_If58__1.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If57__1.v)))
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_Exp72__2.v, f_gen_load(v_st, v_Exp69__2)))
        } else {
          val v_If79__1 = Mutable[BV](mkBits(v_st, BigInt(7), BigInt(0)))
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
            v_If79__1.v = mkBits(v_st, 7, BigInt("0100000", 2))
          } else {
            v_If79__1.v = mkBits(v_st, 7, BigInt("1000000", 2))
          }
          val v_If80__1 = Mutable[Expr](rTExprDefault)
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
            v_If80__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2)))
          } else {
            val v_FPDecodeRounding83__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding83__3", BigInt(3)) 
            val v_temp12 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
            f_switch_context (v_st,f_true_branch(v_st, v_temp12))
            f_gen_store (v_st,v_FPDecodeRounding83__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
            f_switch_context (v_st,f_false_branch(v_st, v_temp12))
            val v_temp13 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))) 
            f_switch_context (v_st,f_true_branch(v_st, v_temp13))
            f_gen_store (v_st,v_FPDecodeRounding83__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
            f_switch_context (v_st,f_false_branch(v_st, v_temp13))
            val v_temp14 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))) 
            f_switch_context (v_st,f_true_branch(v_st, v_temp14))
            f_gen_store (v_st,v_FPDecodeRounding83__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
            f_switch_context (v_st,f_false_branch(v_st, v_temp14))
            val v_temp15 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2))))) 
            f_switch_context (v_st,f_true_branch(v_st, v_temp15))
            f_gen_store (v_st,v_FPDecodeRounding83__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
            f_switch_context (v_st,f_false_branch(v_st, v_temp15))
            f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
            f_switch_context (v_st,f_merge_branch(v_st, v_temp12))
            v_If80__1.v = f_gen_load(v_st, v_FPDecodeRounding83__3)
          }
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          val v_Exp91__2 = Mutable[Expr](rTExprDefault)
          v_Exp91__2.v = f_gen_FPRoundIntN(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_If80__1.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(7), v_If79__1.v)))
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_Exp91__2.v, f_gen_int_lit(v_st, BigInt(128))))
        }
      } else {
        throw Exception("not supported")
      }
    }
  }
}
