/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_cvt_bf16_vector (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  val v_Exp8__2 = Mutable[Expr](rTExprDefault)
  v_Exp8__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
  val v_FPDecodeRounding14__4 = Mutable[Expr](rTExprDefault)
  v_FPDecodeRounding14__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
  val v_Exp16__3 : RTSym = f_decl_bv(v_st, "Exp16__3", BigInt(16)) 
  f_gen_store (v_st,v_Exp16__3,f_gen_FPConvertBF(v_st, f_gen_slice(v_st, v_Exp8__2.v, BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding14__4.v)))
  val v_FPDecodeRounding21__4 = Mutable[Expr](rTExprDefault)
  v_FPDecodeRounding21__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
  val v_Exp23__3 : RTSym = f_decl_bv(v_st, "Exp23__3", BigInt(16)) 
  f_gen_store (v_st,v_Exp23__3,f_gen_FPConvertBF(v_st, f_gen_slice(v_st, v_Exp8__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding21__4.v)))
  val v_FPDecodeRounding28__4 = Mutable[Expr](rTExprDefault)
  v_FPDecodeRounding28__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
  val v_Exp30__3 : RTSym = f_decl_bv(v_st, "Exp30__3", BigInt(16)) 
  f_gen_store (v_st,v_Exp30__3,f_gen_FPConvertBF(v_st, f_gen_slice(v_st, v_Exp8__2.v, BigInt(64), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding28__4.v)))
  val v_FPDecodeRounding35__4 = Mutable[Expr](rTExprDefault)
  v_FPDecodeRounding35__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
  val v_Exp37__3 = Mutable[Expr](rTExprDefault)
  v_Exp37__3.v = f_gen_FPConvertBF(v_st, f_gen_slice(v_st, v_Exp8__2.v, BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding35__4.v))
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(16), BigInt(48), v_Exp37__3.v, f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp30__3), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_Exp23__3), f_gen_load(v_st, v_Exp16__3)))), f_gen_int_lit(v_st, BigInt(128))))
  } else {
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_append_bits(v_st, BigInt(16), BigInt(48), v_Exp37__3.v, f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp30__3), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_Exp23__3), f_gen_load(v_st, v_Exp16__3)))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64))))
  }
}
