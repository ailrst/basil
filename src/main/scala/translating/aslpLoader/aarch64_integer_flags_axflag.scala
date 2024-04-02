/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_flags_axflag (v_st: LiftState,v_enc: BV) : Unit = {
  f_gen_store (v_st,v_PSTATE_N.v,f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))))
  f_gen_store (v_st,v_PSTATE_Z.v,f_gen_or_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_load(v_st, v_PSTATE_V.v)))
  f_gen_store (v_st,v_PSTATE_C.v,f_gen_and_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_not_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_V.v))))
  f_gen_store (v_st,v_PSTATE_V.v,f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("0", 2))))
}
