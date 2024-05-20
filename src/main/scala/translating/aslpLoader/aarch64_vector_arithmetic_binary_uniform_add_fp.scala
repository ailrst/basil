/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_add_fp (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_Exp7__2 = Mutable[Expr](rTExprDefault)
        v_Exp7__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        val v_Exp10__2 = Mutable[Expr](rTExprDefault)
        v_Exp10__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
        val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(128)) 
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp15__2 = Mutable[Expr](rTExprDefault)
          v_Exp15__2.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(96), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(96)), v_Exp15__2.v))
        } else {
          val v_Exp21__2 = Mutable[Expr](rTExprDefault)
          v_Exp21__2.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(96), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(96)), v_Exp21__2.v))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp27__2 = Mutable[Expr](rTExprDefault)
          v_Exp27__2.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(64), BigInt(32)), f_gen_slice(v_st, v_Exp7__2.v, BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp27__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32)))))
        } else {
          val v_Exp33__2 = Mutable[Expr](rTExprDefault)
          v_Exp33__2.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(32), BigInt(32)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp33__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32)))))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp39__2 = Mutable[Expr](rTExprDefault)
          v_Exp39__2.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp10__2.v, BigInt(0), BigInt(32)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(96), BigInt(32)), f_gen_append_bits(v_st, BigInt(32), BigInt(64), v_Exp39__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64)))))
        } else {
          val v_Exp45__2 = Mutable[Expr](rTExprDefault)
          v_Exp45__2.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(64), BigInt(32)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(64), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(96), BigInt(32)), f_gen_append_bits(v_st, BigInt(32), BigInt(64), v_Exp45__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64)))))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp51__2 = Mutable[Expr](rTExprDefault)
          v_Exp51__2.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp10__2.v, BigInt(64), BigInt(32)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_Exp51__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(96))))
        } else {
          val v_Exp57__2 = Mutable[Expr](rTExprDefault)
          v_Exp57__2.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(96), BigInt(32)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_Exp57__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(96))))
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_load(v_st, v_result__1))
      } else {
        val v_Exp67__2 = Mutable[Expr](rTExprDefault)
        v_Exp67__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        val v_Exp70__2 = Mutable[Expr](rTExprDefault)
        v_Exp70__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
        val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(64)) 
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp75__2 = Mutable[Expr](rTExprDefault)
          v_Exp75__2.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(32)), v_Exp75__2.v))
        } else {
          val v_Exp81__2 = Mutable[Expr](rTExprDefault)
          v_Exp81__2.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(32)), v_Exp81__2.v))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_Exp87__2 = Mutable[Expr](rTExprDefault)
          v_Exp87__2.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp70__2.v, BigInt(0), BigInt(32)), f_gen_slice(v_st, v_Exp70__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp87__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32))))
        } else {
          val v_Exp93__2 = Mutable[Expr](rTExprDefault)
          v_Exp93__2.v = f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, v_Exp67__2.v, BigInt(32), BigInt(32)), f_gen_slice(v_st, v_Exp70__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_Exp93__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32))))
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      val v_Exp104__2 = Mutable[Expr](rTExprDefault)
      v_Exp104__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_Exp107__2 = Mutable[Expr](rTExprDefault)
      v_Exp107__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
      val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(128)) 
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp112__2 = Mutable[Expr](rTExprDefault)
        v_Exp112__2.v = f_gen_FPAdd(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), v_Exp112__2.v))
      } else {
        val v_Exp118__2 = Mutable[Expr](rTExprDefault)
        v_Exp118__2.v = f_gen_FPAdd(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), v_Exp118__2.v))
      }
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_Exp124__2 = Mutable[Expr](rTExprDefault)
        v_Exp124__2.v = f_gen_FPAdd(v_st, BigInt(64), f_gen_slice(v_st, v_Exp107__2.v, BigInt(0), BigInt(64)), f_gen_slice(v_st, v_Exp107__2.v, BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_Exp124__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64))))
      } else {
        val v_Exp130__2 = Mutable[Expr](rTExprDefault)
        v_Exp130__2.v = f_gen_FPAdd(v_st, BigInt(64), f_gen_slice(v_st, v_Exp104__2.v, BigInt(64), BigInt(64)), f_gen_slice(v_st, v_Exp107__2.v, BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
        f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_Exp130__2.v, f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64))))
      }
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_load(v_st, v_result__1))
    }
  }
}
