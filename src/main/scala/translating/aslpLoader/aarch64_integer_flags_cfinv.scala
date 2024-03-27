/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_flags_cfinv (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  f_gen_store (v_st,v_PSTATE_C.v,f_gen_not_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v)))
}
