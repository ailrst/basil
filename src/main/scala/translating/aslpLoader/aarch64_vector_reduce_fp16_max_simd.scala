/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_reduce_fp16_max_simd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
    val v_Exp7__2 = Mutable[Expr](rTExprDefault)
    v_Exp7__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_result__2 = Mutable[Expr](rTExprDefault)
    val v_result__3 = Mutable[Expr](rTExprDefault)
    val v_result__4 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp18__5 : RTSym = f_decl_bv(v_st, "Exp18__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp18__5,f_gen_FPMin(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(112), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4.v = f_gen_load(v_st, v_Exp18__5)
    } else {
      val v_Exp20__5 : RTSym = f_decl_bv(v_st, "Exp20__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp20__5,f_gen_FPMax(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(112), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4.v = f_gen_load(v_st, v_Exp20__5)
    }
    val v_Exp23__4 = Mutable[Expr](rTExprDefault)
    v_Exp23__4.v = v_result__4.v
    val v_result__4_1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp32__5 : RTSym = f_decl_bv(v_st, "Exp32__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp32__5,f_gen_FPMin(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(64), BigInt(16)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(80), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4_1.v = f_gen_load(v_st, v_Exp32__5)
    } else {
      val v_Exp34__5 : RTSym = f_decl_bv(v_st, "Exp34__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp34__5,f_gen_FPMax(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(64), BigInt(16)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(80), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4_1.v = f_gen_load(v_st, v_Exp34__5)
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp43__4 : RTSym = f_decl_bv(v_st, "Exp43__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp43__4,f_gen_FPMin(v_st, BigInt(16), v_result__4_1.v, v_Exp23__4.v, f_gen_load(v_st, v_FPCR.v)))
      v_result__3.v = f_gen_load(v_st, v_Exp43__4)
    } else {
      val v_Exp45__4 : RTSym = f_decl_bv(v_st, "Exp45__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp45__4,f_gen_FPMax(v_st, BigInt(16), v_result__4_1.v, v_Exp23__4.v, f_gen_load(v_st, v_FPCR.v)))
      v_result__3.v = f_gen_load(v_st, v_Exp45__4)
    }
    val v_Exp48__3 = Mutable[Expr](rTExprDefault)
    v_Exp48__3.v = v_result__3.v
    val v_result__3_1 = Mutable[Expr](rTExprDefault)
    val v_result__4_2 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp58__5 : RTSym = f_decl_bv(v_st, "Exp58__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp58__5,f_gen_FPMin(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(32), BigInt(16)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4_2.v = f_gen_load(v_st, v_Exp58__5)
    } else {
      val v_Exp60__5 : RTSym = f_decl_bv(v_st, "Exp60__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp60__5,f_gen_FPMax(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(32), BigInt(16)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4_2.v = f_gen_load(v_st, v_Exp60__5)
    }
    val v_Exp63__4 = Mutable[Expr](rTExprDefault)
    v_Exp63__4.v = v_result__4_2.v
    val v_result__4_3 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp72__5 : RTSym = f_decl_bv(v_st, "Exp72__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp72__5,f_gen_FPMin(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(0), BigInt(16)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4_3.v = f_gen_load(v_st, v_Exp72__5)
    } else {
      val v_Exp74__5 : RTSym = f_decl_bv(v_st, "Exp74__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp74__5,f_gen_FPMax(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(0), BigInt(16)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4_3.v = f_gen_load(v_st, v_Exp74__5)
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp83__4 : RTSym = f_decl_bv(v_st, "Exp83__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp83__4,f_gen_FPMin(v_st, BigInt(16), v_result__4_3.v, v_Exp63__4.v, f_gen_load(v_st, v_FPCR.v)))
      v_result__3_1.v = f_gen_load(v_st, v_Exp83__4)
    } else {
      val v_Exp85__4 : RTSym = f_decl_bv(v_st, "Exp85__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp85__4,f_gen_FPMax(v_st, BigInt(16), v_result__4_3.v, v_Exp63__4.v, f_gen_load(v_st, v_FPCR.v)))
      v_result__3_1.v = f_gen_load(v_st, v_Exp85__4)
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp94__3 = Mutable[Expr](rTExprDefault)
      v_Exp94__3.v = f_gen_FPMin(v_st, BigInt(16), v_result__3_1.v, v_Exp48__3.v, f_gen_load(v_st, v_FPCR.v))
      v_result__2.v = v_Exp94__3.v
    } else {
      val v_Exp96__3 = Mutable[Expr](rTExprDefault)
      v_Exp96__3.v = f_gen_FPMax(v_st, BigInt(16), v_result__3_1.v, v_Exp48__3.v, f_gen_load(v_st, v_FPCR.v))
      v_result__2.v = v_Exp96__3.v
    }
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_result__2.v, f_gen_int_lit(v_st, BigInt(128))))
  } else {
    val v_Exp108__2 = Mutable[Expr](rTExprDefault)
    v_Exp108__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_result__2 = Mutable[Expr](rTExprDefault)
    val v_result__3 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp118__4 : RTSym = f_decl_bv(v_st, "Exp118__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp118__4,f_gen_FPMin(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__3.v = f_gen_load(v_st, v_Exp118__4)
    } else {
      val v_Exp120__4 : RTSym = f_decl_bv(v_st, "Exp120__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp120__4,f_gen_FPMax(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__3.v = f_gen_load(v_st, v_Exp120__4)
    }
    val v_Exp123__3 = Mutable[Expr](rTExprDefault)
    v_Exp123__3.v = v_result__3.v
    val v_result__3_1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp132__4 : RTSym = f_decl_bv(v_st, "Exp132__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp132__4,f_gen_FPMin(v_st, BigInt(16), f_gen_slice(v_st, v_Exp108__2.v, BigInt(0), BigInt(16)), f_gen_slice(v_st, v_Exp108__2.v, BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__3_1.v = f_gen_load(v_st, v_Exp132__4)
    } else {
      val v_Exp134__4 : RTSym = f_decl_bv(v_st, "Exp134__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp134__4,f_gen_FPMax(v_st, BigInt(16), f_gen_slice(v_st, v_Exp108__2.v, BigInt(0), BigInt(16)), f_gen_slice(v_st, v_Exp108__2.v, BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__3_1.v = f_gen_load(v_st, v_Exp134__4)
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp143__3 = Mutable[Expr](rTExprDefault)
      v_Exp143__3.v = f_gen_FPMin(v_st, BigInt(16), v_result__3_1.v, v_Exp123__3.v, f_gen_load(v_st, v_FPCR.v))
      v_result__2.v = v_Exp143__3.v
    } else {
      val v_Exp145__3 = Mutable[Expr](rTExprDefault)
      v_Exp145__3.v = f_gen_FPMax(v_st, BigInt(16), v_result__3_1.v, v_Exp123__3.v, f_gen_load(v_st, v_FPCR.v))
      v_result__2.v = v_Exp145__3.v
    }
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_result__2.v, f_gen_int_lit(v_st, BigInt(128))))
  }
}
