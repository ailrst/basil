/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_sub_fp_simd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_Exp7__2 = Mutable[Expr](rTExprDefault)
        v_Exp7__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        val v_Exp10__2 = Mutable[Expr](rTExprDefault)
        v_Exp10__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
        val v_Exp14__2 : RTSym = f_decl_bv(v_st, "Exp14__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp14__2,f_gen_FPSub(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If16__1 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If16__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp14__2), BigInt(0), BigInt(31)))
        } else {
          v_If16__1.v = f_gen_load(v_st, v_Exp14__2)
        }
        val v_Exp21__2 : RTSym = f_decl_bv(v_st, "Exp21__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp21__2,f_gen_FPSub(v_st, BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(32), BigInt(32)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If22__1 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If22__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp21__2), BigInt(0), BigInt(31)))
        } else {
          v_If22__1.v = f_gen_load(v_st, v_Exp21__2)
        }
        val v_Exp27__2 : RTSym = f_decl_bv(v_st, "Exp27__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp27__2,f_gen_FPSub(v_st, BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(64), BigInt(32)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(64), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If28__1 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If28__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp27__2), BigInt(0), BigInt(31)))
        } else {
          v_If28__1.v = f_gen_load(v_st, v_Exp27__2)
        }
        val v_Exp33__2 = Mutable[Expr](rTExprDefault)
        v_Exp33__2.v = f_gen_FPSub(v_st, BigInt(32), f_gen_slice(v_st, v_Exp7__2.v, BigInt(96), BigInt(32)), f_gen_slice(v_st, v_Exp10__2.v, BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
        val v_If34__1 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If34__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp33__2.v, BigInt(0), BigInt(31)))
        } else {
          v_If34__1.v = v_Exp33__2.v
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_If34__1.v, f_gen_append_bits(v_st, BigInt(32), BigInt(64), v_If28__1.v, f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_If22__1.v, v_If16__1.v))))
      } else {
        val v_Exp44__2 = Mutable[Expr](rTExprDefault)
        v_Exp44__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        val v_Exp47__2 = Mutable[Expr](rTExprDefault)
        v_Exp47__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
        val v_Exp51__2 : RTSym = f_decl_bv(v_st, "Exp51__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp51__2,f_gen_FPSub(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If53__1 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If53__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp51__2), BigInt(0), BigInt(31)))
        } else {
          v_If53__1.v = f_gen_load(v_st, v_Exp51__2)
        }
        val v_Exp58__2 = Mutable[Expr](rTExprDefault)
        v_Exp58__2.v = f_gen_FPSub(v_st, BigInt(32), f_gen_slice(v_st, v_Exp44__2.v, BigInt(32), BigInt(32)), f_gen_slice(v_st, v_Exp47__2.v, BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v))
        val v_If59__1 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If59__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp58__2.v, BigInt(0), BigInt(31)))
        } else {
          v_If59__1.v = v_Exp58__2.v
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_If59__1.v, v_If53__1.v), f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      val v_Exp70__2 = Mutable[Expr](rTExprDefault)
      v_Exp70__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_Exp73__2 = Mutable[Expr](rTExprDefault)
      v_Exp73__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
      val v_Exp77__2 : RTSym = f_decl_bv(v_st, "Exp77__2", BigInt(64)) 
      f_gen_store (v_st,v_Exp77__2,f_gen_FPSub(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
      val v_If79__1 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        v_If79__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_Exp77__2), BigInt(0), BigInt(63)))
      } else {
        v_If79__1.v = f_gen_load(v_st, v_Exp77__2)
      }
      val v_Exp84__2 = Mutable[Expr](rTExprDefault)
      v_Exp84__2.v = f_gen_FPSub(v_st, BigInt(64), f_gen_slice(v_st, v_Exp70__2.v, BigInt(64), BigInt(64)), f_gen_slice(v_st, v_Exp73__2.v, BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v))
      val v_If85__1 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        v_If85__1.v = f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp84__2.v, BigInt(0), BigInt(63)))
      } else {
        v_If85__1.v = v_Exp84__2.v
      }
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_If85__1.v, v_If79__1.v))
    }
  }
}
