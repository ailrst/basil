/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_cvt_bf16_scalar (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  val v_Exp7__2 = Mutable[Expr](rTExprDefault)
  v_Exp7__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
  val v_FPDecodeRounding11__4 = Mutable[Expr](rTExprDefault)
  v_FPDecodeRounding11__4.v = f_gen_ZeroExtend(v_st, BigInt(2), BigInt(3), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_int_lit(v_st, BigInt(3)))
  val v_Exp13__3 = Mutable[Expr](rTExprDefault)
  v_Exp13__3.v = f_gen_FPConvertBF(v_st, f_gen_slice(v_st, v_Exp7__2.v, BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding11__4.v))
  f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_Exp13__3.v, f_gen_int_lit(v_st, BigInt(128))))
}
