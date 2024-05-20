/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_reduce_fp16_maxnm_simd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
    val v_Exp7__2 = Mutable[Expr](rTExprDefault)
    v_Exp7__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_result__2 = Mutable[Expr](rTExprDefault)
    val v_result__3 = Mutable[Expr](rTExprDefault)
    val v_result__4 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp14__5 : RTSym = f_decl_bv(v_st, "Exp14__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp14__5,f_gen_FPMinNum(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(112), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4.v = f_gen_load(v_st, v_Exp14__5)
    } else {
      val v_Exp16__5 : RTSym = f_decl_bv(v_st, "Exp16__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp16__5,f_gen_FPMaxNum(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(112), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4.v = f_gen_load(v_st, v_Exp16__5)
    }
    val v_Exp23__4 = Mutable[Expr](rTExprDefault)
    v_Exp23__4.v = v_result__4.v
    val v_result__4_1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp28__5 : RTSym = f_decl_bv(v_st, "Exp28__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp28__5,f_gen_FPMinNum(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(64), BigInt(16)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(80), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4_1.v = f_gen_load(v_st, v_Exp28__5)
    } else {
      val v_Exp30__5 : RTSym = f_decl_bv(v_st, "Exp30__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp30__5,f_gen_FPMaxNum(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(64), BigInt(16)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(80), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4_1.v = f_gen_load(v_st, v_Exp30__5)
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp39__4 : RTSym = f_decl_bv(v_st, "Exp39__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp39__4,f_gen_FPMinNum(v_st, BigInt(16), v_result__4_1.v, v_Exp23__4.v, f_gen_load(v_st, v_FPCR.v)))
      v_result__3.v = f_gen_load(v_st, v_Exp39__4)
    } else {
      val v_Exp41__4 : RTSym = f_decl_bv(v_st, "Exp41__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp41__4,f_gen_FPMaxNum(v_st, BigInt(16), v_result__4_1.v, v_Exp23__4.v, f_gen_load(v_st, v_FPCR.v)))
      v_result__3.v = f_gen_load(v_st, v_Exp41__4)
    }
    val v_Exp48__3 = Mutable[Expr](rTExprDefault)
    v_Exp48__3.v = v_result__3.v
    val v_result__3_1 = Mutable[Expr](rTExprDefault)
    val v_result__4_2 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp54__5 : RTSym = f_decl_bv(v_st, "Exp54__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp54__5,f_gen_FPMinNum(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(32), BigInt(16)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4_2.v = f_gen_load(v_st, v_Exp54__5)
    } else {
      val v_Exp56__5 : RTSym = f_decl_bv(v_st, "Exp56__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp56__5,f_gen_FPMaxNum(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(32), BigInt(16)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4_2.v = f_gen_load(v_st, v_Exp56__5)
    }
    val v_Exp63__4 = Mutable[Expr](rTExprDefault)
    v_Exp63__4.v = v_result__4_2.v
    val v_result__4_3 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp68__5 : RTSym = f_decl_bv(v_st, "Exp68__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp68__5,f_gen_FPMinNum(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(0), BigInt(16)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4_3.v = f_gen_load(v_st, v_Exp68__5)
    } else {
      val v_Exp70__5 : RTSym = f_decl_bv(v_st, "Exp70__5", BigInt(16)) 
      f_gen_store (v_st,v_Exp70__5,f_gen_FPMaxNum(v_st, BigInt(16), f_gen_slice(v_st, v_Exp7__2.v, BigInt(0), BigInt(16)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__4_3.v = f_gen_load(v_st, v_Exp70__5)
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp79__4 : RTSym = f_decl_bv(v_st, "Exp79__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp79__4,f_gen_FPMinNum(v_st, BigInt(16), v_result__4_3.v, v_Exp63__4.v, f_gen_load(v_st, v_FPCR.v)))
      v_result__3_1.v = f_gen_load(v_st, v_Exp79__4)
    } else {
      val v_Exp81__4 : RTSym = f_decl_bv(v_st, "Exp81__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp81__4,f_gen_FPMaxNum(v_st, BigInt(16), v_result__4_3.v, v_Exp63__4.v, f_gen_load(v_st, v_FPCR.v)))
      v_result__3_1.v = f_gen_load(v_st, v_Exp81__4)
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp90__3 = Mutable[Expr](rTExprDefault)
      v_Exp90__3.v = f_gen_FPMinNum(v_st, BigInt(16), v_result__3_1.v, v_Exp48__3.v, f_gen_load(v_st, v_FPCR.v))
      v_result__2.v = v_Exp90__3.v
    } else {
      val v_Exp92__3 = Mutable[Expr](rTExprDefault)
      v_Exp92__3.v = f_gen_FPMaxNum(v_st, BigInt(16), v_result__3_1.v, v_Exp48__3.v, f_gen_load(v_st, v_FPCR.v))
      v_result__2.v = v_Exp92__3.v
    }
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_result__2.v, f_gen_int_lit(v_st, BigInt(128))))
  } else {
    val v_Exp108__2 = Mutable[Expr](rTExprDefault)
    v_Exp108__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_result__2 = Mutable[Expr](rTExprDefault)
    val v_result__3 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp114__4 : RTSym = f_decl_bv(v_st, "Exp114__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp114__4,f_gen_FPMinNum(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__3.v = f_gen_load(v_st, v_Exp114__4)
    } else {
      val v_Exp116__4 : RTSym = f_decl_bv(v_st, "Exp116__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp116__4,f_gen_FPMaxNum(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__3.v = f_gen_load(v_st, v_Exp116__4)
    }
    val v_Exp123__3 = Mutable[Expr](rTExprDefault)
    v_Exp123__3.v = v_result__3.v
    val v_result__3_1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp128__4 : RTSym = f_decl_bv(v_st, "Exp128__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp128__4,f_gen_FPMinNum(v_st, BigInt(16), f_gen_slice(v_st, v_Exp108__2.v, BigInt(0), BigInt(16)), f_gen_slice(v_st, v_Exp108__2.v, BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__3_1.v = f_gen_load(v_st, v_Exp128__4)
    } else {
      val v_Exp130__4 : RTSym = f_decl_bv(v_st, "Exp130__4", BigInt(16)) 
      f_gen_store (v_st,v_Exp130__4,f_gen_FPMaxNum(v_st, BigInt(16), f_gen_slice(v_st, v_Exp108__2.v, BigInt(0), BigInt(16)), f_gen_slice(v_st, v_Exp108__2.v, BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      v_result__3_1.v = f_gen_load(v_st, v_Exp130__4)
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp139__3 = Mutable[Expr](rTExprDefault)
      v_Exp139__3.v = f_gen_FPMinNum(v_st, BigInt(16), v_result__3_1.v, v_Exp123__3.v, f_gen_load(v_st, v_FPCR.v))
      v_result__2.v = v_Exp139__3.v
    } else {
      val v_Exp141__3 = Mutable[Expr](rTExprDefault)
      v_Exp141__3.v = f_gen_FPMaxNum(v_st, BigInt(16), v_result__3_1.v, v_Exp123__3.v, f_gen_load(v_st, v_FPCR.v))
      v_result__2.v = v_Exp141__3.v
    }
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_result__2.v, f_gen_int_lit(v_st, BigInt(128))))
  }
}
