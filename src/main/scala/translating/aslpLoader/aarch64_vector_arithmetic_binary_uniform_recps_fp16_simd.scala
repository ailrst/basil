/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_recps_fp16_simd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
    val v_Exp14__2 : RTSym = f_decl_bv(v_st, "Exp14__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp14__2,f_gen_FPRecipStepFused(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16))))
    val v_Exp18__2 : RTSym = f_decl_bv(v_st, "Exp18__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp18__2,f_gen_FPRecipStepFused(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(16), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(16), BigInt(16))))
    val v_Exp22__2 : RTSym = f_decl_bv(v_st, "Exp22__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp22__2,f_gen_FPRecipStepFused(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(32), BigInt(16))))
    val v_Exp26__2 : RTSym = f_decl_bv(v_st, "Exp26__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp26__2,f_gen_FPRecipStepFused(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(48), BigInt(16))))
    val v_Exp30__2 : RTSym = f_decl_bv(v_st, "Exp30__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp30__2,f_gen_FPRecipStepFused(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(64), BigInt(16))))
    val v_Exp34__2 : RTSym = f_decl_bv(v_st, "Exp34__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp34__2,f_gen_FPRecipStepFused(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(80), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(80), BigInt(16))))
    val v_Exp38__2 : RTSym = f_decl_bv(v_st, "Exp38__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp38__2,f_gen_FPRecipStepFused(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(96), BigInt(16))))
    val v_Exp42__2 = Mutable[Expr](rTExprDefault)
    v_Exp42__2.v = f_gen_FPRecipStepFused(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(112), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(112), BigInt(16)))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(16), BigInt(112), v_Exp42__2.v, f_gen_append_bits(v_st, BigInt(16), BigInt(96), f_gen_load(v_st, v_Exp38__2), f_gen_append_bits(v_st, BigInt(16), BigInt(80), f_gen_load(v_st, v_Exp34__2), f_gen_append_bits(v_st, BigInt(16), BigInt(64), f_gen_load(v_st, v_Exp30__2), f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_load(v_st, v_Exp26__2), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp22__2), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_Exp18__2), f_gen_load(v_st, v_Exp14__2)))))))))
  } else {
    val v_Exp58__2 : RTSym = f_decl_bv(v_st, "Exp58__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp58__2,f_gen_FPRecipStepFused(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16))))
    val v_Exp62__2 : RTSym = f_decl_bv(v_st, "Exp62__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp62__2,f_gen_FPRecipStepFused(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(16), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(16), BigInt(16))))
    val v_Exp66__2 : RTSym = f_decl_bv(v_st, "Exp66__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp66__2,f_gen_FPRecipStepFused(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(32), BigInt(16))))
    val v_Exp70__2 = Mutable[Expr](rTExprDefault)
    v_Exp70__2.v = f_gen_FPRecipStepFused(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(48), BigInt(16)))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(16), BigInt(48), v_Exp70__2.v, f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp66__2), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_Exp62__2), f_gen_load(v_st, v_Exp58__2)))), f_gen_int_lit(v_st, BigInt(128))))
  }
}
