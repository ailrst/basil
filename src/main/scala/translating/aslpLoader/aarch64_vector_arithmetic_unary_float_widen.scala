/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_float_widen (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
    val v_Vpart_read5__2 = Mutable[Expr](rTExprDefault)
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    val v_Exp8__2 : Boolean = ((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) || ((( (!(f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))))) && (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2))))))) 
    assert (v_Exp8__2)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      v_Vpart_read5__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))
    } else {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
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
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_Exp44__3.v, f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_Exp37__3), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_Exp30__3), f_gen_load(v_st, v_Exp23__3)))))
  } else {
    if (f_eq_bits(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2)), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
      val v_Vpart_read53__2 = Mutable[Expr](rTExprDefault)
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      val v_Exp56__2 : Boolean = ((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) || ((( (!(f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))))) && (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2))))))) 
      assert (v_Exp56__2)
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        v_Vpart_read53__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))
      } else {
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
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
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_Exp78__3.v, f_gen_load(v_st, v_Exp71__3)))
    } else {
      throw Exception("not supported")
    }
  }
}
