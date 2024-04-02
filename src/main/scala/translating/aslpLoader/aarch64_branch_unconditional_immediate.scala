/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_branch_unconditional_immediate (v_st: LiftState,v_enc: BV) : Unit = {
  val v_If1__1 = Mutable[BV](mkBits(v_st, BigInt(4), BigInt(0)))
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
    v_If1__1.v = mkBits(v_st, 4, BigInt("0000", 2))
  } else {
    v_If1__1.v = mkBits(v_st, 4, BigInt("0101", 2))
  }
  if (f_eq_bits(v_st, BigInt(4), v_If1__1.v, mkBits(v_st, 4, BigInt("0000", 2)))) then {
    f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
    f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
    f_gen_store (v_st,v__PC.v,f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), f_SignExtend(v_st, BigInt(28), BigInt(64), f_append_bits(v_st, BigInt(26), BigInt(2), bvextract(v_st,v_enc,BigInt(0),BigInt(26)), mkBits(v_st, 2, BigInt("00", 2))), BigInt(64)))))
  } else {
    f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
    f_gen_store (v_st,v__PC.v,f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), f_SignExtend(v_st, BigInt(28), BigInt(64), f_append_bits(v_st, BigInt(26), BigInt(2), bvextract(v_st,v_enc,BigInt(0),BigInt(26)), mkBits(v_st, 2, BigInt("00", 2))), BigInt(64)))))
  }
}
