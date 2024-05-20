/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_memory_literal_simdfp (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("11000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_Mem_read(v_st, BigInt(4), f_gen_bit_lit(v_st, BigInt(64), f_add_bits(v_st, BigInt(64), v_pc, f_SignExtend(v_st, BigInt(21), BigInt(64), f_append_bits(v_st, BigInt(19), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(19)), mkBits(v_st, 2, BigInt("00", 2))), BigInt(64)))), f_gen_int_lit(v_st, BigInt(4)), f_gen_int_lit(v_st, BigInt(1))), f_gen_int_lit(v_st, BigInt(128))))
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("11000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_Mem_read(v_st, BigInt(8), f_gen_bit_lit(v_st, BigInt(64), f_add_bits(v_st, BigInt(64), v_pc, f_SignExtend(v_st, BigInt(21), BigInt(64), f_append_bits(v_st, BigInt(19), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(19)), mkBits(v_st, 2, BigInt("00", 2))), BigInt(64)))), f_gen_int_lit(v_st, BigInt(8)), f_gen_int_lit(v_st, BigInt(1))), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_Mem_read(v_st, BigInt(16), f_gen_bit_lit(v_st, BigInt(64), f_add_bits(v_st, BigInt(64), v_pc, f_SignExtend(v_st, BigInt(21), BigInt(64), f_append_bits(v_st, BigInt(19), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(19)), mkBits(v_st, 2, BigInt("00", 2))), BigInt(64)))), f_gen_int_lit(v_st, BigInt(16)), f_gen_int_lit(v_st, BigInt(1))))
    }
  }
}
