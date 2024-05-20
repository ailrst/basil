/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_mul_fp_fused (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_Exp7__2 = Mutable[Expr](rTExprDefault)
        v_Exp7__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        val v_Exp10__2 = Mutable[Expr](rTExprDefault)
        v_Exp10__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
        val v_Exp13__2 = Mutable[Expr](rTExprDefault)
        v_Exp13__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
        val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(128)) 
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
          val v_Exp20__2 = Mutable[Expr](rTExprDefault)
          v_Exp20__2.v = f_gen_FPMulAdd(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(31), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(96), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(96)), v_Exp20__2.v))
        } else {
          val v_Exp25__2 = Mutable[Expr](rTExprDefault)
          v_Exp25__2.v = f_gen_FPMulAdd(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(96), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(96)), v_Exp25__2.v))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
          val v_Exp33__2 = Mutable[Expr](rTExprDefault)
          v_Exp33__2.v = f_gen_FPMulAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp13__2.v, BigInt(32), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp7__2.v, BigInt(63), BigInt(1))), f_gen_slice(v_st, v_Exp7__2.v, BigInt(32), BigInt(31))), f_gen_slice(v_st, v_Exp10__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp33__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32)))))
        } else {
          val v_Exp38__2 = Mutable[Expr](rTExprDefault)
          v_Exp38__2.v = f_gen_FPMulAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp13__2.v, BigInt(32), BigInt(32)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(32), BigInt(32)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp38__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32)))))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
          val v_Exp46__2 = Mutable[Expr](rTExprDefault)
          v_Exp46__2.v = f_gen_FPMulAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp13__2.v, BigInt(64), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp7__2.v, BigInt(95), BigInt(1))), f_gen_slice(v_st, v_Exp7__2.v, BigInt(64), BigInt(31))), f_gen_slice(v_st, v_Exp10__2.v, BigInt(64), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(96), BigInt(32)), f_gen_append_bits(v_st, BigInt(32), BigInt(64), v_Exp46__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64)))))
        } else {
          val v_Exp51__2 = Mutable[Expr](rTExprDefault)
          v_Exp51__2.v = f_gen_FPMulAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp13__2.v, BigInt(64), BigInt(32)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(64), BigInt(32)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(64), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(96), BigInt(32)), f_gen_append_bits(v_st, BigInt(32), BigInt(64), v_Exp51__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64)))))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
          val v_Exp59__2 = Mutable[Expr](rTExprDefault)
          v_Exp59__2.v = f_gen_FPMulAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp13__2.v, BigInt(96), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp7__2.v, BigInt(127), BigInt(1))), f_gen_slice(v_st, v_Exp7__2.v, BigInt(96), BigInt(31))), f_gen_slice(v_st, v_Exp10__2.v, BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_Exp59__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(96))))
        } else {
          val v_Exp64__2 = Mutable[Expr](rTExprDefault)
          v_Exp64__2.v = f_gen_FPMulAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp13__2.v, BigInt(96), BigInt(32)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(96), BigInt(32)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_Exp64__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(96))))
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_load(v_st, v_result__1))
      } else {
        val v_Exp74__2 = Mutable[Expr](rTExprDefault)
        v_Exp74__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        val v_Exp77__2 = Mutable[Expr](rTExprDefault)
        v_Exp77__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
        val v_Exp80__2 = Mutable[Expr](rTExprDefault)
        v_Exp80__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
        val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(64)) 
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
          val v_Exp87__2 = Mutable[Expr](rTExprDefault)
          v_Exp87__2.v = f_gen_FPMulAdd(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(31), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(32)), v_Exp87__2.v))
        } else {
          val v_Exp92__2 = Mutable[Expr](rTExprDefault)
          v_Exp92__2.v = f_gen_FPMulAdd(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(32)), v_Exp92__2.v))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
          val v_Exp100__2 = Mutable[Expr](rTExprDefault)
          v_Exp100__2.v = f_gen_FPMulAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp80__2.v, BigInt(32), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp74__2.v, BigInt(63), BigInt(1))), f_gen_slice(v_st, v_Exp74__2.v, BigInt(32), BigInt(31))), f_gen_slice(v_st, v_Exp77__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp100__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32))))
        } else {
          val v_Exp105__2 = Mutable[Expr](rTExprDefault)
          v_Exp105__2.v = f_gen_FPMulAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp80__2.v, BigInt(32), BigInt(32)), f_gen_slice(v_st, v_Exp74__2.v, BigInt(32), BigInt(32)), f_gen_slice(v_st, v_Exp77__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp105__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32))))
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      val v_Exp116__2 = Mutable[Expr](rTExprDefault)
      v_Exp116__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_Exp119__2 = Mutable[Expr](rTExprDefault)
      v_Exp119__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
      val v_Exp122__2 = Mutable[Expr](rTExprDefault)
      v_Exp122__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
      val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(128)) 
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
        val v_Exp129__2 = Mutable[Expr](rTExprDefault)
        v_Exp129__2.v = f_gen_FPMulAdd(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(63), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(63))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), v_Exp129__2.v))
      } else {
        val v_Exp134__2 = Mutable[Expr](rTExprDefault)
        v_Exp134__2.v = f_gen_FPMulAdd(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), v_Exp134__2.v))
      }
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) then {
        val v_Exp142__2 = Mutable[Expr](rTExprDefault)
        v_Exp142__2.v = f_gen_FPMulAdd(v_st, BigInt(64), f_gen_slice(v_st, v_Exp122__2.v, BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp116__2.v, BigInt(127), BigInt(1))), f_gen_slice(v_st, v_Exp116__2.v, BigInt(64), BigInt(63))), f_gen_slice(v_st, v_Exp119__2.v, BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_Exp142__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64))))
      } else {
        val v_Exp147__2 = Mutable[Expr](rTExprDefault)
        v_Exp147__2.v = f_gen_FPMulAdd(v_st, BigInt(64), f_gen_slice(v_st, v_Exp122__2.v, BigInt(64), BigInt(64)), f_gen_slice(v_st, v_Exp116__2.v, BigInt(64), BigInt(64)), f_gen_slice(v_st, v_Exp119__2.v, BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_Exp147__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64))))
      }
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_load(v_st, v_result__1))
    }
  }
}
