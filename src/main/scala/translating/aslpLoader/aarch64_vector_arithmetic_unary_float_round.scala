/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_float_round (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_exact__1 = Mutable[Boolean](false)
        val v_rounding__1 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
          val v_FPDecodeRounding4__2 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
          v_FPDecodeRounding4__2.v = f_ZeroExtend(v_st, BigInt(2), BigInt(3), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(23),BigInt(1))), BigInt(3))
          v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), v_FPDecodeRounding4__2.v)
        } else {
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000001000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
            v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("100", 2)))
          } else {
            if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000001000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000001000000000000", 2)))) then {
              val v_FPDecodeRounding8__3 = Mutable[Expr](rTExprDefault)
              v_FPDecodeRounding8__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
              v_rounding__1.v = v_FPDecodeRounding8__3.v
              v_exact__1.v = true
            } else {
              val v_FPDecodeRounding12__3 = Mutable[Expr](rTExprDefault)
              v_FPDecodeRounding12__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
              v_rounding__1.v = v_FPDecodeRounding12__3.v
            }
          }
        }
        val v_Exp22__2 : RTSym = f_decl_bv(v_st, "Exp22__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp22__2,f_gen_FPRoundInt(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v)))
        val v_Exp25__2 : RTSym = f_decl_bv(v_st, "Exp25__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp25__2,f_gen_FPRoundInt(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v)))
        val v_Exp28__2 : RTSym = f_decl_bv(v_st, "Exp28__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp28__2,f_gen_FPRoundInt(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v)))
        val v_Exp31__2 = Mutable[Expr](rTExprDefault)
        v_Exp31__2.v = f_gen_FPRoundInt(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_Exp31__2.v, f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_Exp28__2), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_Exp25__2), f_gen_load(v_st, v_Exp22__2)))))
      } else {
        val v_exact__1 = Mutable[Boolean](false)
        val v_rounding__1 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
          val v_FPDecodeRounding38__2 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
          v_FPDecodeRounding38__2.v = f_ZeroExtend(v_st, BigInt(2), BigInt(3), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(23),BigInt(1))), BigInt(3))
          v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), v_FPDecodeRounding38__2.v)
        } else {
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000001000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
            v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("100", 2)))
          } else {
            if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000001000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000001000000000000", 2)))) then {
              val v_FPDecodeRounding42__3 = Mutable[Expr](rTExprDefault)
              v_FPDecodeRounding42__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
              v_rounding__1.v = v_FPDecodeRounding42__3.v
              v_exact__1.v = true
            } else {
              val v_FPDecodeRounding46__3 = Mutable[Expr](rTExprDefault)
              v_FPDecodeRounding46__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
              v_rounding__1.v = v_FPDecodeRounding46__3.v
            }
          }
        }
        val v_Exp56__2 : RTSym = f_decl_bv(v_st, "Exp56__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp56__2,f_gen_FPRoundInt(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v)))
        val v_Exp59__2 = Mutable[Expr](rTExprDefault)
        v_Exp59__2.v = f_gen_FPRoundInt(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp59__2.v, f_gen_load(v_st, v_Exp56__2)), f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      val v_exact__1 = Mutable[Boolean](false)
      val v_rounding__1 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_FPDecodeRounding67__2 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
        v_FPDecodeRounding67__2.v = f_ZeroExtend(v_st, BigInt(2), BigInt(3), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(23),BigInt(1))), BigInt(3))
        v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), v_FPDecodeRounding67__2.v)
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000001000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("100", 2)))
        } else {
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000100000000001000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000001000000000000", 2)))) then {
            val v_FPDecodeRounding71__3 = Mutable[Expr](rTExprDefault)
            v_FPDecodeRounding71__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
            v_rounding__1.v = v_FPDecodeRounding71__3.v
            v_exact__1.v = true
          } else {
            val v_FPDecodeRounding75__3 = Mutable[Expr](rTExprDefault)
            v_FPDecodeRounding75__3.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
            v_rounding__1.v = v_FPDecodeRounding75__3.v
          }
        }
      }
      val v_Exp85__2 : RTSym = f_decl_bv(v_st, "Exp85__2", BigInt(64)) 
      f_gen_store (v_st,v_Exp85__2,f_gen_FPRoundInt(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v)))
      val v_Exp88__2 = Mutable[Expr](rTExprDefault)
      v_Exp88__2.v = f_gen_FPRoundInt(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_Exp88__2.v, f_gen_load(v_st, v_Exp85__2)))
    }
  }
}
