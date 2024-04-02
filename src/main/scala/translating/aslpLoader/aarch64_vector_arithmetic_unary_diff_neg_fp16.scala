/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_diff_neg_fp16 (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_Exp6__2 = Mutable[Expr](rTExprDefault)
    v_Exp6__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(128)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(112), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(16), BigInt(112)), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(15), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15)))))
    } else {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(112), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(16), BigInt(112)), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15)))))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(96), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(96)), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp6__2.v, BigInt(31), BigInt(1))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(16), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(16)))))
    } else {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(96), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(96)), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(16), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(16)))))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(80), BigInt(48), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(48), BigInt(80)), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp6__2.v, BigInt(47), BigInt(1))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(32), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32)))))
    } else {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(80), BigInt(48), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(48), BigInt(80)), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(32), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32)))))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp6__2.v, BigInt(63), BigInt(1))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(48), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(48)))))
    } else {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(48), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(48)))))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(48), BigInt(80), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(80), BigInt(48)), f_gen_append_bits(v_st, BigInt(16), BigInt(64), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp6__2.v, BigInt(79), BigInt(1))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(64), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64)))))
    } else {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(48), BigInt(80), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(80), BigInt(48)), f_gen_append_bits(v_st, BigInt(16), BigInt(64), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(64), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64)))))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(96), BigInt(32)), f_gen_append_bits(v_st, BigInt(16), BigInt(80), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp6__2.v, BigInt(95), BigInt(1))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(80), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(80)))))
    } else {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(96), BigInt(32)), f_gen_append_bits(v_st, BigInt(16), BigInt(80), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(80), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(80)))))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(16), BigInt(112), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(112), BigInt(16)), f_gen_append_bits(v_st, BigInt(16), BigInt(96), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp6__2.v, BigInt(111), BigInt(1))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(96), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(96)))))
    } else {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(16), BigInt(112), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(112), BigInt(16)), f_gen_append_bits(v_st, BigInt(16), BigInt(96), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(96), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(96)))))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(16), BigInt(112), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp6__2.v, BigInt(127), BigInt(1))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(112), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(112))))
    } else {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(16), BigInt(112), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(112), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(112))))
    }
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_load(v_st, v_result__1))
  } else {
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_Exp71__2 = Mutable[Expr](rTExprDefault)
    v_Exp71__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(64)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(48), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(16), BigInt(48)), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(15), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15)))))
    } else {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(48), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(16), BigInt(48)), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(15)))))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(32)), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp71__2.v, BigInt(31), BigInt(1))), f_gen_slice(v_st, v_Exp71__2.v, BigInt(16), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(16)))))
    } else {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(32)), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp71__2.v, BigInt(16), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(16)))))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(48), BigInt(16)), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp71__2.v, BigInt(47), BigInt(1))), f_gen_slice(v_st, v_Exp71__2.v, BigInt(32), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32)))))
    } else {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(48), BigInt(16)), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp71__2.v, BigInt(32), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32)))))
    }
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp71__2.v, BigInt(63), BigInt(1))), f_gen_slice(v_st, v_Exp71__2.v, BigInt(48), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(48))))
    } else {
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp71__2.v, BigInt(48), BigInt(15))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(48))))
    }
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
  }
}
