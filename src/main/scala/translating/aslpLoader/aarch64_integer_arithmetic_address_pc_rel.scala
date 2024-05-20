/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_arithmetic_address_pc_rel (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2)))) then {
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), f_add_bits(v_st, BigInt(64), f_append_bits(v_st, BigInt(52), BigInt(12), bvextract(v_st,v_pc,BigInt(12),BigInt(52)), mkBits(v_st, 12, BigInt("000000000000", 2))), f_SignExtend(v_st, BigInt(33), BigInt(64), f_append_bits(v_st, BigInt(21), BigInt(12), f_append_bits(v_st, BigInt(19), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(19)), bvextract(v_st,v_enc,BigInt(29),BigInt(2))), mkBits(v_st, 12, BigInt("000000000000", 2))), BigInt(64)))))
    }
  } else {
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), f_add_bits(v_st, BigInt(64), v_pc, f_SignExtend(v_st, BigInt(21), BigInt(64), f_append_bits(v_st, BigInt(19), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(19)), bvextract(v_st,v_enc,BigInt(29),BigInt(2))), BigInt(64)))))
    }
  }
}
