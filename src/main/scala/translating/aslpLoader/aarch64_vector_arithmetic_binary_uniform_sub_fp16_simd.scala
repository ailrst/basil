/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_sub_fp16_simd (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_Exp7__2 = Mutable[Expr](rTExprDefault)
    v_Exp7__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_Exp10__2 = Mutable[Expr](rTExprDefault)
    v_Exp10__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
    val v_Exp14__2 : RTSym = f_decl_bv(v_st, "Exp14__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp14__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If16__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If16__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp14__2), BigInt(0), BigInt(15)))
    } else {
      v_If16__1.v = f_gen_load(v_st, v_Exp14__2)
    }
    val v_Exp21__2 : RTSym = f_decl_bv(v_st, "Exp21__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp21__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(16), BigInt(16)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If22__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If22__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp21__2), BigInt(0), BigInt(15)))
    } else {
      v_If22__1.v = f_gen_load(v_st, v_Exp21__2)
    }
    val v_Exp27__2 : RTSym = f_decl_bv(v_st, "Exp27__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp27__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(32), BigInt(16)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(32), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If28__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If28__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp27__2), BigInt(0), BigInt(15)))
    } else {
      v_If28__1.v = f_gen_load(v_st, v_Exp27__2)
    }
    val v_Exp33__2 : RTSym = f_decl_bv(v_st, "Exp33__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp33__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(48), BigInt(16)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If34__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If34__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp33__2), BigInt(0), BigInt(15)))
    } else {
      v_If34__1.v = f_gen_load(v_st, v_Exp33__2)
    }
    val v_Exp39__2 : RTSym = f_decl_bv(v_st, "Exp39__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp39__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(64), BigInt(16)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(64), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If40__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If40__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp39__2), BigInt(0), BigInt(15)))
    } else {
      v_If40__1.v = f_gen_load(v_st, v_Exp39__2)
    }
    val v_Exp45__2 : RTSym = f_decl_bv(v_st, "Exp45__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp45__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(80), BigInt(16)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(80), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If46__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If46__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp45__2), BigInt(0), BigInt(15)))
    } else {
      v_If46__1.v = f_gen_load(v_st, v_Exp45__2)
    }
    val v_Exp51__2 : RTSym = f_decl_bv(v_st, "Exp51__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp51__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(96), BigInt(16)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(96), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If52__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If52__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp51__2), BigInt(0), BigInt(15)))
    } else {
      v_If52__1.v = f_gen_load(v_st, v_Exp51__2)
    }
    val v_Exp57__2 = Mutable[Expr](rTExprDefault)
    v_Exp57__2.v = f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(112), BigInt(16)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(112), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
    val v_If58__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If58__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp57__2.v, BigInt(0), BigInt(15)))
    } else {
      v_If58__1.v = v_Exp57__2.v
    }
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(16), BigInt(112), v_If58__1.v, f_gen_append_bits(v_st, BigInt(16), BigInt(96), v_If52__1.v, f_gen_append_bits(v_st, BigInt(16), BigInt(80), v_If46__1.v, f_gen_append_bits(v_st, BigInt(16), BigInt(64), v_If40__1.v, f_gen_append_bits(v_st, BigInt(16), BigInt(48), v_If34__1.v, f_gen_append_bits(v_st, BigInt(16), BigInt(32), v_If28__1.v, f_gen_append_bits(v_st, BigInt(16), BigInt(16), v_If22__1.v, v_If16__1.v))))))))
  } else {
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_Exp68__2 = Mutable[Expr](rTExprDefault)
    v_Exp68__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_Exp71__2 = Mutable[Expr](rTExprDefault)
    v_Exp71__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
    val v_Exp75__2 : RTSym = f_decl_bv(v_st, "Exp75__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp75__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If77__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If77__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp75__2), BigInt(0), BigInt(15)))
    } else {
      v_If77__1.v = f_gen_load(v_st, v_Exp75__2)
    }
    val v_Exp82__2 : RTSym = f_decl_bv(v_st, "Exp82__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp82__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, v_Exp68__2.v, BigInt(16), BigInt(16)), f_gen_slice(v_st, v_Exp71__2.v, BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If83__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If83__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp82__2), BigInt(0), BigInt(15)))
    } else {
      v_If83__1.v = f_gen_load(v_st, v_Exp82__2)
    }
    val v_Exp88__2 : RTSym = f_decl_bv(v_st, "Exp88__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp88__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, v_Exp68__2.v, BigInt(32), BigInt(16)), f_gen_slice(v_st, v_Exp71__2.v, BigInt(32), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If89__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If89__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp88__2), BigInt(0), BigInt(15)))
    } else {
      v_If89__1.v = f_gen_load(v_st, v_Exp88__2)
    }
    val v_Exp94__2 = Mutable[Expr](rTExprDefault)
    v_Exp94__2.v = f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, v_Exp68__2.v, BigInt(48), BigInt(16)), f_gen_slice(v_st, v_Exp71__2.v, BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
    val v_If95__1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If95__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp94__2.v, BigInt(0), BigInt(15)))
    } else {
      v_If95__1.v = v_Exp94__2.v
    }
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(16), BigInt(48), v_If95__1.v, f_gen_append_bits(v_st, BigInt(16), BigInt(32), v_If89__1.v, f_gen_append_bits(v_st, BigInt(16), BigInt(16), v_If83__1.v, v_If77__1.v))), f_gen_int_lit(v_st, BigInt(128))))
  }
}
