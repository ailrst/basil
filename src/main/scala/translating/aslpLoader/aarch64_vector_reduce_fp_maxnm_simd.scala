/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_reduce_fp_maxnm_simd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))))) then {
    throw Exception("not supported")
  } else {
    val v_Exp7__2 = Mutable[Expr](rTExprDefault)
    v_Exp7__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_result__2 = Mutable[Expr](rTExprDefault)
    val v_result__3 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp13__4 : RTSym = f_decl_bv(v_st, "Exp13__4", BigInt(32)) 
      f_gen_store (v_st,v_Exp13__4,f_gen_FPMinNum(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
      v_result__3.v = f_gen_load(v_st, v_Exp13__4)
    } else {
      val v_Exp15__4 : RTSym = f_decl_bv(v_st, "Exp15__4", BigInt(32)) 
      f_gen_store (v_st,v_Exp15__4,f_gen_FPMaxNum(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
      v_result__3.v = f_gen_load(v_st, v_Exp15__4)
    }
    val v_Exp22__3 = Mutable[Expr](rTExprDefault)
    v_Exp22__3.v = v_result__3.v
    val v_result__3_1 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp27__4 : RTSym = f_decl_bv(v_st, "Exp27__4", BigInt(32)) 
      f_gen_store (v_st,v_Exp27__4,f_gen_FPMinNum(v_st, BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(0), BigInt(32)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
      v_result__3_1.v = f_gen_load(v_st, v_Exp27__4)
    } else {
      val v_Exp29__4 : RTSym = f_decl_bv(v_st, "Exp29__4", BigInt(32)) 
      f_gen_store (v_st,v_Exp29__4,f_gen_FPMaxNum(v_st, BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(0), BigInt(32)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
      v_result__3_1.v = f_gen_load(v_st, v_Exp29__4)
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp38__3 = Mutable[Expr](rTExprDefault)
      v_Exp38__3.v = f_gen_FPMinNum(v_st, BigInt(32), v_result__3_1.v, v_Exp22__3.v, f_gen_load(v_st, v_FPCR.v))
      v_result__2.v = v_Exp38__3.v
    } else {
      val v_Exp40__3 = Mutable[Expr](rTExprDefault)
      v_Exp40__3.v = f_gen_FPMaxNum(v_st, BigInt(32), v_result__3_1.v, v_Exp22__3.v, f_gen_load(v_st, v_FPCR.v))
      v_result__2.v = v_Exp40__3.v
    }
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_result__2.v, f_gen_int_lit(v_st, BigInt(128))))
  }
}
