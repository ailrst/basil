/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_shift (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_Vpart_read5__2 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        v_Vpart_read5__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))
      } else {
        v_Vpart_read5__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64))
      }
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(16), BigInt(112), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_Vpart_read5__2.v, BigInt(56), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))), f_gen_append_bits(v_st, BigInt(16), BigInt(96), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_Vpart_read5__2.v, BigInt(48), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))), f_gen_append_bits(v_st, BigInt(16), BigInt(80), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_Vpart_read5__2.v, BigInt(40), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))), f_gen_append_bits(v_st, BigInt(16), BigInt(64), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_Vpart_read5__2.v, BigInt(32), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))), f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_Vpart_read5__2.v, BigInt(24), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_Vpart_read5__2.v, BigInt(16), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_Vpart_read5__2.v, BigInt(8), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, v_Vpart_read5__2.v, BigInt(0), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2))))))))))))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
        val v_Vpart_read64__2 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
          v_Vpart_read64__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))
        } else {
          v_Vpart_read64__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64))
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, v_Vpart_read64__2.v, BigInt(48), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2)))), f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, v_Vpart_read64__2.v, BigInt(32), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2)))), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, v_Vpart_read64__2.v, BigInt(16), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2)))), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, v_Vpart_read64__2.v, BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))))))))
      } else {
        val v_Vpart_read103__2 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
          v_Vpart_read103__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64))
        } else {
          v_Vpart_read103__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64))
        }
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, v_Vpart_read103__2.v, BigInt(32), BigInt(32)), f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, v_Vpart_read103__2.v, BigInt(0), BigInt(32)), f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))))
      }
    }
  }
}
