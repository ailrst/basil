/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_float_narrow (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_Exp7__2 = Mutable[Expr](rTExprDefault)
    v_Exp7__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_FPDecodeRounding13__4 = Mutable[Expr](rTExprDefault)
    v_FPDecodeRounding13__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
    val v_Exp15__3 : RTSym = f_decl_bv(v_st, "Exp15__3", BigInt(16)) 
    f_gen_store (v_st,v_Exp15__3,f_gen_FPConvert(v_st, BigInt(16), BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding13__4.v)))
    val v_FPDecodeRounding20__4 = Mutable[Expr](rTExprDefault)
    v_FPDecodeRounding20__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
    val v_Exp22__3 : RTSym = f_decl_bv(v_st, "Exp22__3", BigInt(16)) 
    f_gen_store (v_st,v_Exp22__3,f_gen_FPConvert(v_st, BigInt(16), BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding20__4.v)))
    val v_FPDecodeRounding27__4 = Mutable[Expr](rTExprDefault)
    v_FPDecodeRounding27__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
    val v_Exp29__3 : RTSym = f_decl_bv(v_st, "Exp29__3", BigInt(16)) 
    f_gen_store (v_st,v_Exp29__3,f_gen_FPConvert(v_st, BigInt(16), BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(64), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding27__4.v)))
    val v_FPDecodeRounding34__4 = Mutable[Expr](rTExprDefault)
    v_FPDecodeRounding34__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
    val v_Exp36__3 = Mutable[Expr](rTExprDefault)
    v_Exp36__3.v = f_gen_FPConvert(v_st, BigInt(16), BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding34__4.v))
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(16), BigInt(48), v_Exp36__3.v, f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp29__3), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_Exp22__3), f_gen_load(v_st, v_Exp15__3)))), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_append_bits(v_st, BigInt(16), BigInt(48), v_Exp36__3.v, f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp29__3), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_Exp22__3), f_gen_load(v_st, v_Exp15__3)))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64))))
    }
  } else {
    val v_Exp58__2 = Mutable[Expr](rTExprDefault)
    v_Exp58__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_FPDecodeRounding64__4 = Mutable[Expr](rTExprDefault)
    v_FPDecodeRounding64__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
    val v_Exp66__3 : RTSym = f_decl_bv(v_st, "Exp66__3", BigInt(32)) 
    f_gen_store (v_st,v_Exp66__3,f_gen_FPConvert(v_st, BigInt(32), BigInt(64), f_gen_slice(v_st, v_Exp58__2.v, BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding64__4.v)))
    val v_FPDecodeRounding71__4 = Mutable[Expr](rTExprDefault)
    v_FPDecodeRounding71__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
    val v_Exp73__3 = Mutable[Expr](rTExprDefault)
    v_Exp73__3.v = f_gen_FPConvert(v_st, BigInt(32), BigInt(64), f_gen_slice(v_st, v_Exp58__2.v, BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding71__4.v))
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp73__3.v, f_gen_load(v_st, v_Exp66__3)), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp73__3.v, f_gen_load(v_st, v_Exp66__3)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64))))
    }
  }
}
