/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_extract_sqxtun_sisd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_UnsignedSatQ9__2 : RTSym = f_decl_bv(v_st, "UnsignedSatQ9__2", BigInt(8)) 
      val v_UnsignedSatQ10__2 : RTSym = f_decl_bool(v_st, "UnsignedSatQ10__2") 
      val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000011111111", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp0))
      f_gen_store (v_st,v_UnsignedSatQ9__2,f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("11111111", 2))))
      f_gen_store (v_st,v_UnsignedSatQ10__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp0))
      val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp1))
      f_gen_store (v_st,v_UnsignedSatQ9__2,f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2))))
      f_gen_store (v_st,v_UnsignedSatQ10__2,f_gen_bool_lit(v_st, true))
      f_switch_context (v_st,f_false_branch(v_st, v_temp1))
      f_gen_store (v_st,v_UnsignedSatQ9__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(8)))
      f_gen_store (v_st,v_UnsignedSatQ10__2,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
      val v_temp2 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_UnsignedSatQ10__2)) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp2))
      f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp2))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(8), BigInt(128), f_gen_load(v_st, v_UnsignedSatQ9__2), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
        val v_UnsignedSatQ30__2 : RTSym = f_decl_bv(v_st, "UnsignedSatQ30__2", BigInt(16)) 
        val v_UnsignedSatQ31__2 : RTSym = f_decl_bool(v_st, "UnsignedSatQ31__2") 
        val v_temp3 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(32), f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000001111111111111111", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp3))
        f_gen_store (v_st,v_UnsignedSatQ30__2,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1111111111111111", 2))))
        f_gen_store (v_st,v_UnsignedSatQ31__2,f_gen_bool_lit(v_st, true))
        f_switch_context (v_st,f_false_branch(v_st, v_temp3))
        val v_temp4 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp4))
        f_gen_store (v_st,v_UnsignedSatQ30__2,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))))
        f_gen_store (v_st,v_UnsignedSatQ31__2,f_gen_bool_lit(v_st, true))
        f_switch_context (v_st,f_false_branch(v_st, v_temp4))
        f_gen_store (v_st,v_UnsignedSatQ30__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)))
        f_gen_store (v_st,v_UnsignedSatQ31__2,f_gen_bool_lit(v_st, false))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp3))
        val v_temp5 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_UnsignedSatQ31__2)) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp5))
        f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp5))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_UnsignedSatQ30__2), f_gen_int_lit(v_st, BigInt(128))))
      } else {
        val v_UnsignedSatQ51__2 : RTSym = f_decl_bv(v_st, "UnsignedSatQ51__2", BigInt(32)) 
        val v_UnsignedSatQ52__2 : RTSym = f_decl_bool(v_st, "UnsignedSatQ52__2") 
        val v_temp6 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(64), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000011111111111111111111111111111111", 2))), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp6))
        f_gen_store (v_st,v_UnsignedSatQ51__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
        f_gen_store (v_st,v_UnsignedSatQ52__2,f_gen_bool_lit(v_st, true))
        f_switch_context (v_st,f_false_branch(v_st, v_temp6))
        val v_temp7 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp7))
        f_gen_store (v_st,v_UnsignedSatQ51__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))
        f_gen_store (v_st,v_UnsignedSatQ52__2,f_gen_bool_lit(v_st, true))
        f_switch_context (v_st,f_false_branch(v_st, v_temp7))
        f_gen_store (v_st,v_UnsignedSatQ51__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
        f_gen_store (v_st,v_UnsignedSatQ52__2,f_gen_bool_lit(v_st, false))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp6))
        val v_temp8 : RTLabel = f_gen_branch(v_st, f_gen_load(v_st, v_UnsignedSatQ52__2)) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp8))
        f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp8))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_UnsignedSatQ51__2), f_gen_int_lit(v_st, BigInt(128))))
      }
    }
  }
}
