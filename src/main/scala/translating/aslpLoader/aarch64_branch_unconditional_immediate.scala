/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_branch_unconditional_immediate (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2)))) then {
    f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_bit_lit(v_st, BigInt(64), f_add_bits(v_st, BigInt(64), v_pc, mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
    f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
    f_gen_store (v_st,v__PC.v,f_gen_bit_lit(v_st, BigInt(64), f_add_bits(v_st, BigInt(64), v_pc, f_SignExtend(v_st, BigInt(28), BigInt(64), f_append_bits(v_st, BigInt(26), BigInt(2), bvextract(v_st,v_enc,BigInt(0),BigInt(26)), mkBits(v_st, 2, BigInt("00", 2))), BigInt(64)))))
  } else {
    f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
    f_gen_store (v_st,v__PC.v,f_gen_bit_lit(v_st, BigInt(64), f_add_bits(v_st, BigInt(64), v_pc, f_SignExtend(v_st, BigInt(28), BigInt(64), f_append_bits(v_st, BigInt(26), BigInt(2), bvextract(v_st,v_enc,BigInt(0),BigInt(26)), mkBits(v_st, 2, BigInt("00", 2))), BigInt(64)))))
  }
}
