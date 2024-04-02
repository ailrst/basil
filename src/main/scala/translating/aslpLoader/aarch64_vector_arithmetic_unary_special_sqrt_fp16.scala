/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_special_sqrt_fp16 (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_Exp10__2 : RTSym = f_decl_bv(v_st, "Exp10__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp10__2,f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_Exp13__2 : RTSym = f_decl_bv(v_st, "Exp13__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp13__2,f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_Exp16__2 : RTSym = f_decl_bv(v_st, "Exp16__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp16__2,f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_Exp19__2 : RTSym = f_decl_bv(v_st, "Exp19__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp19__2,f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_Exp22__2 : RTSym = f_decl_bv(v_st, "Exp22__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp22__2,f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_Exp25__2 : RTSym = f_decl_bv(v_st, "Exp25__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp25__2,f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(80), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_Exp28__2 : RTSym = f_decl_bv(v_st, "Exp28__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp28__2,f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_Exp31__2 = Mutable[Expr](rTExprDefault)
    v_Exp31__2.v = f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(112), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(16), BigInt(112), v_Exp31__2.v, f_gen_append_bits(v_st, BigInt(16), BigInt(96), f_gen_load(v_st, v_Exp28__2), f_gen_append_bits(v_st, BigInt(16), BigInt(80), f_gen_load(v_st, v_Exp25__2), f_gen_append_bits(v_st, BigInt(16), BigInt(64), f_gen_load(v_st, v_Exp22__2), f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_load(v_st, v_Exp19__2), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp16__2), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_Exp13__2), f_gen_load(v_st, v_Exp10__2)))))))))
  } else {
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_Exp44__2 : RTSym = f_decl_bv(v_st, "Exp44__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp44__2,f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_Exp47__2 : RTSym = f_decl_bv(v_st, "Exp47__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp47__2,f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_Exp50__2 : RTSym = f_decl_bv(v_st, "Exp50__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp50__2,f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_Exp53__2 = Mutable[Expr](rTExprDefault)
    v_Exp53__2.v = f_gen_FPSqrt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(16), BigInt(48), v_Exp53__2.v, f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp50__2), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_Exp47__2), f_gen_load(v_st, v_Exp44__2)))), f_gen_int_lit(v_st, BigInt(128))))
  }
}
