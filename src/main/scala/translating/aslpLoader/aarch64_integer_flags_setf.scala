/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_flags_setf (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000100000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000100000000000000", 2)))) then {
    val v_X_read4__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_X_read4__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read4__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
    }
    f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, v_X_read4__2.v, BigInt(15), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_Z.v,f_gen_cvt_bool_bv(v_st, f_gen_eq_bits(v_st, BigInt(16), f_gen_slice(v_st, v_X_read4__2.v, BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))))))
    f_gen_store (v_st,v_PSTATE_V.v,f_gen_eor_bits(v_st, BigInt(1), f_gen_slice(v_st, v_X_read4__2.v, BigInt(16), BigInt(1)), f_gen_slice(v_st, v_X_read4__2.v, BigInt(15), BigInt(1))))
  } else {
    val v_X_read12__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
      v_X_read12__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32))
    } else {
      v_X_read12__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
    }
    f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, v_X_read12__2.v, BigInt(7), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_Z.v,f_gen_cvt_bool_bv(v_st, f_gen_eq_bits(v_st, BigInt(8), f_gen_slice(v_st, v_X_read12__2.v, BigInt(0), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2))))))
    f_gen_store (v_st,v_PSTATE_V.v,f_gen_eor_bits(v_st, BigInt(1), f_gen_slice(v_st, v_X_read12__2.v, BigInt(8), BigInt(1)), f_gen_slice(v_st, v_X_read12__2.v, BigInt(7), BigInt(1))))
  }
}
