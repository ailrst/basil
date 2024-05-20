/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_mul_fp_mul_norounding_upper (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
    val v_Exp11__3 = Mutable[Expr](rTExprDefault)
    v_Exp11__3.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_Exp16__3 = Mutable[Expr](rTExprDefault)
    v_Exp16__3.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
    val v_Exp19__2 = Mutable[Expr](rTExprDefault)
    v_Exp19__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
    val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(128)) 
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp26__2 = Mutable[Expr](rTExprDefault)
      v_Exp26__2.v = f_gen_FPMulAddH(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(79), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(15))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(64), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(96), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(96)), v_Exp26__2.v))
    } else {
      val v_Exp31__2 = Mutable[Expr](rTExprDefault)
      v_Exp31__2.v = f_gen_FPMulAddH(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(64), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(96), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(96)), v_Exp31__2.v))
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp39__2 = Mutable[Expr](rTExprDefault)
      v_Exp39__2.v = f_gen_FPMulAddH(v_st, BigInt(32), f_gen_slice(v_st, v_Exp19__2.v, BigInt(32), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp11__3.v, BigInt(95), BigInt(1))), f_gen_slice(v_st, v_Exp11__3.v, BigInt(80), BigInt(15))), f_gen_slice(v_st, v_Exp16__3.v, BigInt(80), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp39__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32)))))
    } else {
      val v_Exp44__2 = Mutable[Expr](rTExprDefault)
      v_Exp44__2.v = f_gen_FPMulAddH(v_st, BigInt(32), f_gen_slice(v_st, v_Exp19__2.v, BigInt(32), BigInt(32)), f_gen_slice(v_st, v_Exp11__3.v, BigInt(80), BigInt(16)), f_gen_slice(v_st, v_Exp16__3.v, BigInt(80), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp44__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32)))))
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp52__2 = Mutable[Expr](rTExprDefault)
      v_Exp52__2.v = f_gen_FPMulAddH(v_st, BigInt(32), f_gen_slice(v_st, v_Exp19__2.v, BigInt(64), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp11__3.v, BigInt(111), BigInt(1))), f_gen_slice(v_st, v_Exp11__3.v, BigInt(96), BigInt(15))), f_gen_slice(v_st, v_Exp16__3.v, BigInt(96), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(96), BigInt(32)), f_gen_append_bits(v_st, BigInt(32), BigInt(64), v_Exp52__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64)))))
    } else {
      val v_Exp57__2 = Mutable[Expr](rTExprDefault)
      v_Exp57__2.v = f_gen_FPMulAddH(v_st, BigInt(32), f_gen_slice(v_st, v_Exp19__2.v, BigInt(64), BigInt(32)), f_gen_slice(v_st, v_Exp11__3.v, BigInt(96), BigInt(16)), f_gen_slice(v_st, v_Exp16__3.v, BigInt(96), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(96), BigInt(32)), f_gen_append_bits(v_st, BigInt(32), BigInt(64), v_Exp57__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64)))))
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp65__2 = Mutable[Expr](rTExprDefault)
      v_Exp65__2.v = f_gen_FPMulAddH(v_st, BigInt(32), f_gen_slice(v_st, v_Exp19__2.v, BigInt(96), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp11__3.v, BigInt(127), BigInt(1))), f_gen_slice(v_st, v_Exp11__3.v, BigInt(112), BigInt(15))), f_gen_slice(v_st, v_Exp16__3.v, BigInt(112), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_Exp65__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(96))))
    } else {
      val v_Exp70__2 = Mutable[Expr](rTExprDefault)
      v_Exp70__2.v = f_gen_FPMulAddH(v_st, BigInt(32), f_gen_slice(v_st, v_Exp19__2.v, BigInt(96), BigInt(32)), f_gen_slice(v_st, v_Exp11__3.v, BigInt(112), BigInt(16)), f_gen_slice(v_st, v_Exp16__3.v, BigInt(112), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_Exp70__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(96))))
    }
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_load(v_st, v_result__1))
  } else {
    val v_Exp82__3 = Mutable[Expr](rTExprDefault)
    v_Exp82__3.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
    val v_Exp87__3 = Mutable[Expr](rTExprDefault)
    v_Exp87__3.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
    val v_Exp90__2 = Mutable[Expr](rTExprDefault)
    v_Exp90__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
    val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(64)) 
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp97__2 = Mutable[Expr](rTExprDefault)
      v_Exp97__2.v = f_gen_FPMulAddH(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(47), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(15))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(32), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(32)), v_Exp97__2.v))
    } else {
      val v_Exp102__2 = Mutable[Expr](rTExprDefault)
      v_Exp102__2.v = f_gen_FPMulAddH(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(32), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(32)), v_Exp102__2.v))
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
      val v_Exp110__2 = Mutable[Expr](rTExprDefault)
      v_Exp110__2.v = f_gen_FPMulAddH(v_st, BigInt(32), f_gen_slice(v_st, v_Exp90__2.v, BigInt(32), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp82__3.v, BigInt(63), BigInt(1))), f_gen_slice(v_st, v_Exp82__3.v, BigInt(48), BigInt(15))), f_gen_slice(v_st, v_Exp87__3.v, BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp110__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32))))
    } else {
      val v_Exp115__2 = Mutable[Expr](rTExprDefault)
      v_Exp115__2.v = f_gen_FPMulAddH(v_st, BigInt(32), f_gen_slice(v_st, v_Exp90__2.v, BigInt(32), BigInt(32)), f_gen_slice(v_st, v_Exp82__3.v, BigInt(48), BigInt(16)), f_gen_slice(v_st, v_Exp87__3.v, BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v))
      f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp115__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32))))
    }
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
  }
}
