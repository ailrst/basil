/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_flags_xaflag (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_Exp8__1 : RTSym = f_decl_bv(v_st, "Exp8__1", BigInt(1)) 
  f_gen_store (v_st,v_Exp8__1,f_gen_load(v_st, v_PSTATE_Z.v))
  val v_Exp9__1 : RTSym = f_decl_bv(v_st, "Exp9__1", BigInt(1)) 
  f_gen_store (v_st,v_Exp9__1,f_gen_load(v_st, v_PSTATE_C.v))
  val v_Exp10__1 : RTSym = f_decl_bv(v_st, "Exp10__1", BigInt(1)) 
  f_gen_store (v_st,v_Exp10__1,f_gen_load(v_st, v_PSTATE_Z.v))
  f_gen_store (v_st,v_PSTATE_N.v,f_gen_and_bits(v_st, BigInt(1), f_gen_not_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v)), f_gen_not_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v))))
  f_gen_store (v_st,v_PSTATE_Z.v,f_gen_and_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_load(v_st, v_PSTATE_C.v)))
  f_gen_store (v_st,v_PSTATE_C.v,f_gen_or_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_load(v_st, v_Exp8__1)))
  f_gen_store (v_st,v_PSTATE_V.v,f_gen_and_bits(v_st, BigInt(1), f_gen_not_bits(v_st, BigInt(1), f_gen_load(v_st, v_Exp9__1)), f_gen_load(v_st, v_Exp10__1)))
}
