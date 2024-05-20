/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_diff_neg_float (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_Exp6__2 = Mutable[Expr](rTExprDefault)
        v_Exp6__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(128)) 
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(96), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(96)), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(31), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31)))))
        } else {
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(96), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(96)), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31)))))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp6__2.v, BigInt(63), BigInt(1))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(32), BigInt(31))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32)))))
        } else {
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(32), BigInt(31))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32)))))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(96), BigInt(32)), f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp6__2.v, BigInt(95), BigInt(1))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(64), BigInt(31))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64)))))
        } else {
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(96), BigInt(32)), f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(64), BigInt(31))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64)))))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp6__2.v, BigInt(127), BigInt(1))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(96), BigInt(31))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(96))))
        } else {
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp6__2.v, BigInt(96), BigInt(31))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(96))))
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_load(v_st, v_result__1))
      } else {
        val v_Exp43__2 = Mutable[Expr](rTExprDefault)
        v_Exp43__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(64)) 
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(31), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31)))))
        } else {
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(32), BigInt(32)), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(31)))))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp43__2.v, BigInt(63), BigInt(1))), f_gen_slice(v_st, v_Exp43__2.v, BigInt(32), BigInt(31))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32))))
        } else {
          f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp43__2.v, BigInt(32), BigInt(31))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(32))))
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      val v_Exp67__2 = Mutable[Expr](rTExprDefault)
      v_Exp67__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(128)) 
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(63), BigInt(1))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(63)))))
      } else {
        f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(64), BigInt(64)), f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(63)))))
      }
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_not_bits(v_st, BigInt(1), f_gen_slice(v_st, v_Exp67__2.v, BigInt(127), BigInt(1))), f_gen_slice(v_st, v_Exp67__2.v, BigInt(64), BigInt(63))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64))))
      } else {
        f_gen_store (v_st,v_result__1,f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))), f_gen_slice(v_st, v_Exp67__2.v, BigInt(64), BigInt(63))), f_gen_slice(v_st, f_gen_load(v_st, v_result__1), BigInt(0), BigInt(64))))
      }
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_load(v_st, v_result__1))
    }
  }
}
