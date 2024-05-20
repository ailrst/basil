/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_float_widen (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_Vpart_read5__2 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_Vpart_read5__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))
    } else {
      v_Vpart_read5__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64))
    }
    val v_FPDecodeRounding21__4 = Mutable[Expr](rTExprDefault)
    v_FPDecodeRounding21__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
    val v_Exp23__3 : RTSym = f_decl_bv(v_st, "Exp23__3", BigInt(32)) 
    f_gen_store (v_st,v_Exp23__3,f_gen_FPConvert(v_st, BigInt(32), BigInt(16), f_gen_slice(v_st, v_Vpart_read5__2.v, BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding21__4.v)))
    val v_FPDecodeRounding28__4 = Mutable[Expr](rTExprDefault)
    v_FPDecodeRounding28__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
    val v_Exp30__3 : RTSym = f_decl_bv(v_st, "Exp30__3", BigInt(32)) 
    f_gen_store (v_st,v_Exp30__3,f_gen_FPConvert(v_st, BigInt(32), BigInt(16), f_gen_slice(v_st, v_Vpart_read5__2.v, BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding28__4.v)))
    val v_FPDecodeRounding35__4 = Mutable[Expr](rTExprDefault)
    v_FPDecodeRounding35__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
    val v_Exp37__3 : RTSym = f_decl_bv(v_st, "Exp37__3", BigInt(32)) 
    f_gen_store (v_st,v_Exp37__3,f_gen_FPConvert(v_st, BigInt(32), BigInt(16), f_gen_slice(v_st, v_Vpart_read5__2.v, BigInt(32), BigInt(16)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding35__4.v)))
    val v_FPDecodeRounding42__4 = Mutable[Expr](rTExprDefault)
    v_FPDecodeRounding42__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
    val v_Exp44__3 = Mutable[Expr](rTExprDefault)
    v_Exp44__3.v = f_gen_FPConvert(v_st, BigInt(32), BigInt(16), f_gen_slice(v_st, v_Vpart_read5__2.v, BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding42__4.v))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_Exp44__3.v, f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_Exp37__3), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_Exp30__3), f_gen_load(v_st, v_Exp23__3)))))
  } else {
    val v_Vpart_read53__2 = Mutable[Expr](rTExprDefault)
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      v_Vpart_read53__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))
    } else {
      v_Vpart_read53__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64))
    }
    val v_FPDecodeRounding69__4 = Mutable[Expr](rTExprDefault)
    v_FPDecodeRounding69__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
    val v_Exp71__3 : RTSym = f_decl_bv(v_st, "Exp71__3", BigInt(64)) 
    f_gen_store (v_st,v_Exp71__3,f_gen_FPConvert(v_st, BigInt(64), BigInt(32), f_gen_slice(v_st, v_Vpart_read53__2.v, BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding69__4.v)))
    val v_FPDecodeRounding76__4 = Mutable[Expr](rTExprDefault)
    v_FPDecodeRounding76__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
    val v_Exp78__3 = Mutable[Expr](rTExprDefault)
    v_Exp78__3.v = f_gen_FPConvert(v_st, BigInt(64), BigInt(32), f_gen_slice(v_st, v_Vpart_read53__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding76__4.v))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_Exp78__3.v, f_gen_load(v_st, v_Exp71__3)))
  }
}
