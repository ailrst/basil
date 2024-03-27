/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_flags_setf (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_ne_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(14),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      val v_X_read4__2 : RTSym = f_decl_bv(v_st, "X.read4__2", BigInt(32)) 
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
        f_gen_store (v_st,v_X_read4__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
      } else {
        f_gen_store (v_st,v_X_read4__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
      }
      f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_load(v_st, v_X_read4__2), BigInt(15), BigInt(1)))
      f_gen_store (v_st,v_PSTATE_Z.v,f_gen_cvt_bool_bv(v_st, f_gen_eq_bits(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_X_read4__2), BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))))
      f_gen_store (v_st,v_PSTATE_V.v,f_gen_eor_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_load(v_st, v_X_read4__2), BigInt(16), BigInt(1)), f_gen_slice(v_st, f_gen_load(v_st, v_X_read4__2), BigInt(15), BigInt(1))))
    } else {
      val v_X_read12__2 : RTSym = f_decl_bv(v_st, "X.read12__2", BigInt(32)) 
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
        f_gen_store (v_st,v_X_read12__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
      } else {
        f_gen_store (v_st,v_X_read12__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
      }
      f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_load(v_st, v_X_read12__2), BigInt(7), BigInt(1)))
      f_gen_store (v_st,v_PSTATE_Z.v,f_gen_cvt_bool_bv(v_st, f_gen_eq_bits(v_st, BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_X_read12__2), BigInt(0), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8)))))
      f_gen_store (v_st,v_PSTATE_V.v,f_gen_eor_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_load(v_st, v_X_read12__2), BigInt(8), BigInt(1)), f_gen_slice(v_st, f_gen_load(v_st, v_X_read12__2), BigInt(7), BigInt(1))))
    }
  }
}
