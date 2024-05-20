/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_arithmetic_div (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2)))) then {
    val v_X_read4__2 : RTSym = f_decl_bv(v_st, "X.read4__2", BigInt(64)) 
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
      f_gen_store (v_st,v_X_read4__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read4__2,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    }
    val v_X_read9__2 : RTSym = f_decl_bv(v_st, "X.read9__2", BigInt(64)) 
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
      f_gen_store (v_st,v_X_read9__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read9__2,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    }
    val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(64), f_gen_load(v_st, v_X_read9__2), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))) 
    f_switch_context (v_st,f_true_branch(v_st, v_temp0))
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    }
    f_switch_context (v_st,f_false_branch(v_st, v_temp0))
    val v_If21__2 : RTSym = f_decl_bv(v_st, "If21__2", BigInt(65)) 
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000010000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      f_gen_store (v_st,v_If21__2,f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), f_gen_load(v_st, v_X_read4__2), f_gen_int_lit(v_st, BigInt(65))))
    } else {
      f_gen_store (v_st,v_If21__2,f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_load(v_st, v_X_read4__2), f_gen_int_lit(v_st, BigInt(65))))
    }
    val v_If26__2 : RTSym = f_decl_bv(v_st, "If26__2", BigInt(65)) 
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000010000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      f_gen_store (v_st,v_If26__2,f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), f_gen_load(v_st, v_X_read9__2), f_gen_int_lit(v_st, BigInt(65))))
    } else {
      f_gen_store (v_st,v_If26__2,f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_load(v_st, v_X_read9__2), f_gen_int_lit(v_st, BigInt(65))))
    }
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_slice(v_st, f_gen_slice(v_st, f_gen_sdiv_bits(v_st, BigInt(65), f_gen_load(v_st, v_If21__2), f_gen_load(v_st, v_If26__2)), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)))
    }
    f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
  } else {
    val v_X_read33__2 : RTSym = f_decl_bv(v_st, "X.read33__2", BigInt(32)) 
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
      f_gen_store (v_st,v_X_read33__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
    } else {
      f_gen_store (v_st,v_X_read33__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))
    }
    val v_X_read38__2 : RTSym = f_decl_bv(v_st, "X.read38__2", BigInt(32)) 
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
      f_gen_store (v_st,v_X_read38__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))
    } else {
      f_gen_store (v_st,v_X_read38__2,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))
    }
    val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(32), f_gen_load(v_st, v_X_read38__2), f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))) 
    f_switch_context (v_st,f_true_branch(v_st, v_temp1))
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    }
    f_switch_context (v_st,f_false_branch(v_st, v_temp1))
    val v_If50__2 : RTSym = f_decl_bv(v_st, "If50__2", BigInt(33)) 
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000010000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      f_gen_store (v_st,v_If50__2,f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read33__2), f_gen_int_lit(v_st, BigInt(33))))
    } else {
      f_gen_store (v_st,v_If50__2,f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read33__2), f_gen_int_lit(v_st, BigInt(33))))
    }
    val v_If55__2 : RTSym = f_decl_bv(v_st, "If55__2", BigInt(33)) 
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000010000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      f_gen_store (v_st,v_If55__2,f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read38__2), f_gen_int_lit(v_st, BigInt(33))))
    } else {
      f_gen_store (v_st,v_If55__2,f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read38__2), f_gen_int_lit(v_st, BigInt(33))))
    }
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_sdiv_bits(v_st, BigInt(33), f_gen_load(v_st, v_If50__2), f_gen_load(v_st, v_If55__2)), BigInt(0), BigInt(32)), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(64))))
    }
    f_switch_context (v_st,f_merge_branch(v_st, v_temp1))
  }
}
