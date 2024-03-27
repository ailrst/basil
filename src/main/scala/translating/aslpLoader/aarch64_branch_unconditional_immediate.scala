/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_branch_unconditional_immediate (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_If1__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(4)))
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
    v_If1__1.v = BitVecLiteral(BigInt("0000", 2), 4)
  } else {
    v_If1__1.v = BitVecLiteral(BigInt("0101", 2), 4)
  }
  if (f_eq_bits(v_st, BigInt(4), v_If1__1.v, BitVecLiteral(BigInt("0000", 2), 4))) then {
    f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2), 64))))
    f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
    f_gen_store (v_st,v__PC.v,f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), f_SignExtend(v_st, BigInt(28), BigInt(64), f_append_bits(v_st, BigInt(26), BigInt(2), bvextract(v_st,v_enc,BigInt(0),BigInt(26)), BitVecLiteral(BigInt("00", 2), 2)), BigInt(64)))))
  } else {
    f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
    f_gen_store (v_st,v__PC.v,f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), f_SignExtend(v_st, BigInt(28), BigInt(64), f_append_bits(v_st, BigInt(26), BigInt(2), bvextract(v_st,v_enc,BigInt(0),BigInt(26)), BitVecLiteral(BigInt("00", 2), 2)), BigInt(64)))))
  }
}
