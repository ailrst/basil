/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_special_sqrt_est_int (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
      val v_Exp5__2 = Mutable[Expr](rTExprDefault)
      v_Exp5__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_UnsignedRSqrtEstimate8__2 : RTSym = f_decl_bv(v_st, "UnsignedRSqrtEstimate8__2", BigInt(32)) 
      val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(30), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp0))
      f_gen_store (v_st,v_UnsignedRSqrtEstimate8__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp0))
      f_gen_assert (v_st,f_gen_and_bool(v_st, f_gen_sle_bits(v_st, BigInt(10), f_gen_bit_lit(v_st, BigInt(10), mkBits(v_st, 10, BigInt("0010000000", 2))), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(10), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(23), BigInt(9)), f_gen_int_lit(v_st, BigInt(10)))), f_gen_bool_lit(v_st, true)))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
      val v_UnsignedRSqrtEstimate19__2 : RTSym = f_decl_bv(v_st, "UnsignedRSqrtEstimate19__2", BigInt(32)) 
      val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, v_Exp5__2.v, BigInt(62), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp1))
      f_gen_store (v_st,v_UnsignedRSqrtEstimate19__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp1))
      f_gen_assert (v_st,f_gen_and_bool(v_st, f_gen_sle_bits(v_st, BigInt(10), f_gen_bit_lit(v_st, BigInt(10), mkBits(v_st, 10, BigInt("0010000000", 2))), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(10), f_gen_slice(v_st, v_Exp5__2.v, BigInt(55), BigInt(9)), f_gen_int_lit(v_st, BigInt(10)))), f_gen_bool_lit(v_st, true)))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp1))
      val v_UnsignedRSqrtEstimate30__2 : RTSym = f_decl_bv(v_st, "UnsignedRSqrtEstimate30__2", BigInt(32)) 
      val v_temp2 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, v_Exp5__2.v, BigInt(94), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp2))
      f_gen_store (v_st,v_UnsignedRSqrtEstimate30__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp2))
      f_gen_assert (v_st,f_gen_and_bool(v_st, f_gen_sle_bits(v_st, BigInt(10), f_gen_bit_lit(v_st, BigInt(10), mkBits(v_st, 10, BigInt("0010000000", 2))), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(10), f_gen_slice(v_st, v_Exp5__2.v, BigInt(87), BigInt(9)), f_gen_int_lit(v_st, BigInt(10)))), f_gen_bool_lit(v_st, true)))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp2))
      val v_UnsignedRSqrtEstimate41__2 : RTSym = f_decl_bv(v_st, "UnsignedRSqrtEstimate41__2", BigInt(32)) 
      val v_temp3 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, v_Exp5__2.v, BigInt(126), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp3))
      f_gen_store (v_st,v_UnsignedRSqrtEstimate41__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp3))
      f_gen_assert (v_st,f_gen_and_bool(v_st, f_gen_sle_bits(v_st, BigInt(10), f_gen_bit_lit(v_st, BigInt(10), mkBits(v_st, 10, BigInt("0010000000", 2))), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(10), f_gen_slice(v_st, v_Exp5__2.v, BigInt(119), BigInt(9)), f_gen_int_lit(v_st, BigInt(10)))), f_gen_bool_lit(v_st, true)))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp3))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_load(v_st, v_UnsignedRSqrtEstimate41__2), f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_UnsignedRSqrtEstimate30__2), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_UnsignedRSqrtEstimate19__2), f_gen_load(v_st, v_UnsignedRSqrtEstimate8__2)))))
    } else {
      val v_Exp58__2 = Mutable[Expr](rTExprDefault)
      v_Exp58__2.v = f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_UnsignedRSqrtEstimate61__2 : RTSym = f_decl_bv(v_st, "UnsignedRSqrtEstimate61__2", BigInt(32)) 
      val v_temp4 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(30), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp4))
      f_gen_store (v_st,v_UnsignedRSqrtEstimate61__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp4))
      f_gen_assert (v_st,f_gen_and_bool(v_st, f_gen_sle_bits(v_st, BigInt(10), f_gen_bit_lit(v_st, BigInt(10), mkBits(v_st, 10, BigInt("0010000000", 2))), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(10), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(23), BigInt(9)), f_gen_int_lit(v_st, BigInt(10)))), f_gen_bool_lit(v_st, true)))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp4))
      val v_UnsignedRSqrtEstimate72__2 : RTSym = f_decl_bv(v_st, "UnsignedRSqrtEstimate72__2", BigInt(32)) 
      val v_temp5 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, v_Exp58__2.v, BigInt(62), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp5))
      f_gen_store (v_st,v_UnsignedRSqrtEstimate72__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
      f_switch_context (v_st,f_false_branch(v_st, v_temp5))
      f_gen_assert (v_st,f_gen_and_bool(v_st, f_gen_sle_bits(v_st, BigInt(10), f_gen_bit_lit(v_st, BigInt(10), mkBits(v_st, 10, BigInt("0010000000", 2))), f_gen_ZeroExtend(v_st, BigInt(9), BigInt(10), f_gen_slice(v_st, v_Exp58__2.v, BigInt(55), BigInt(9)), f_gen_int_lit(v_st, BigInt(10)))), f_gen_bool_lit(v_st, true)))
      f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp5))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_UnsignedRSqrtEstimate72__2), f_gen_load(v_st, v_UnsignedRSqrtEstimate61__2)), f_gen_int_lit(v_st, BigInt(128))))
    }
  }
}
