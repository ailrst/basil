/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_float_conv_float_bulk_simd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_FPDecodeRounding4__2 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
        v_FPDecodeRounding4__2.v = f_ZeroExtend(v_st, BigInt(2), BigInt(3), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(23),BigInt(1))), BigInt(3))
        val v_Exp12__2 : RTSym = f_decl_bv(v_st, "Exp12__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp12__2,f_gen_FPToFixed(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding4__2.v))))
        val v_Exp15__2 : RTSym = f_decl_bv(v_st, "Exp15__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp15__2,f_gen_FPToFixed(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding4__2.v))))
        val v_Exp18__2 : RTSym = f_decl_bv(v_st, "Exp18__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp18__2,f_gen_FPToFixed(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding4__2.v))))
        val v_Exp21__2 = Mutable[Expr](rTExprDefault)
        v_Exp21__2.v = f_gen_FPToFixed(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding4__2.v)))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_Exp21__2.v, f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_Exp18__2), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_Exp15__2), f_gen_load(v_st, v_Exp12__2)))))
      } else {
        val v_FPDecodeRounding28__2 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
        v_FPDecodeRounding28__2.v = f_ZeroExtend(v_st, BigInt(2), BigInt(3), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(23),BigInt(1))), BigInt(3))
        val v_Exp36__2 : RTSym = f_decl_bv(v_st, "Exp36__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp36__2,f_gen_FPToFixed(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding28__2.v))))
        val v_Exp39__2 = Mutable[Expr](rTExprDefault)
        v_Exp39__2.v = f_gen_FPToFixed(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding28__2.v)))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp39__2.v, f_gen_load(v_st, v_Exp36__2)), f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      val v_FPDecodeRounding47__2 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
      v_FPDecodeRounding47__2.v = f_ZeroExtend(v_st, BigInt(2), BigInt(3), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(23),BigInt(1))), BigInt(3))
      val v_Exp55__2 : RTSym = f_decl_bv(v_st, "Exp55__2", BigInt(64)) 
      f_gen_store (v_st,v_Exp55__2,f_gen_FPToFixed(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding47__2.v))))
      val v_Exp58__2 = Mutable[Expr](rTExprDefault)
      v_Exp58__2.v = f_gen_FPToFixed(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))), f_gen_load(v_st, v_FPCR.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding47__2.v)))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_Exp58__2.v, f_gen_load(v_st, v_Exp55__2)))
    }
  }
}
