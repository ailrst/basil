/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_transfer_integer_dup (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000010000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000010000000000000000", 2)))) then {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
      val v_X_read6__2 = Mutable[Expr](rTExprDefault)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
        v_X_read6__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8))
      } else {
        v_X_read6__2.v = f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))
      }
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(8), BigInt(120), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(112), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(104), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(96), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(88), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(80), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(72), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(64), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(56), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(48), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(40), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(32), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(24), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(16), v_X_read6__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(8), v_X_read6__2.v, v_X_read6__2.v))))))))))))))))
    } else {
      val v_X_read33__2 = Mutable[Expr](rTExprDefault)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
        v_X_read33__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8))
      } else {
        v_X_read33__2.v = f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))
      }
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(8), BigInt(56), v_X_read33__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(48), v_X_read33__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(40), v_X_read33__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(32), v_X_read33__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(24), v_X_read33__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(16), v_X_read33__2.v, f_gen_append_bits(v_st, BigInt(8), BigInt(8), v_X_read33__2.v, v_X_read33__2.v))))))), f_gen_int_lit(v_st, BigInt(128))))
    }
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000100000000000000000", 2)))) then {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
        val v_X_read55__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
          v_X_read55__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16))
        } else {
          v_X_read55__2.v = f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2)))
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(16), BigInt(112), v_X_read55__2.v, f_gen_append_bits(v_st, BigInt(16), BigInt(96), v_X_read55__2.v, f_gen_append_bits(v_st, BigInt(16), BigInt(80), v_X_read55__2.v, f_gen_append_bits(v_st, BigInt(16), BigInt(64), v_X_read55__2.v, f_gen_append_bits(v_st, BigInt(16), BigInt(48), v_X_read55__2.v, f_gen_append_bits(v_st, BigInt(16), BigInt(32), v_X_read55__2.v, f_gen_append_bits(v_st, BigInt(16), BigInt(16), v_X_read55__2.v, v_X_read55__2.v))))))))
      } else {
        val v_X_read74__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
          v_X_read74__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16))
        } else {
          v_X_read74__2.v = f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2)))
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(16), BigInt(48), v_X_read74__2.v, f_gen_append_bits(v_st, BigInt(16), BigInt(32), v_X_read74__2.v, f_gen_append_bits(v_st, BigInt(16), BigInt(16), v_X_read74__2.v, v_X_read74__2.v))), f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000001000000000000000000", 2)))) then {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
          val v_X_read92__2 = Mutable[Expr](rTExprDefault)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
            v_X_read92__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
          } else {
            v_X_read92__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
          }
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), v_X_read92__2.v, f_gen_append_bits(v_st, BigInt(32), BigInt(64), v_X_read92__2.v, f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_X_read92__2.v, v_X_read92__2.v))))
        } else {
          val v_X_read107__2 = Mutable[Expr](rTExprDefault)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
            v_X_read107__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
          } else {
            v_X_read107__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
          }
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_X_read107__2.v, v_X_read107__2.v), f_gen_int_lit(v_st, BigInt(128))))
        }
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
          throw Exception("not supported")
        } else {
          val v_X_read123__2 = Mutable[Expr](rTExprDefault)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
            v_X_read123__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
          } else {
            v_X_read123__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
          }
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read123__2.v, v_X_read123__2.v))
        }
      }
    }
  }
}
