/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_branch_unconditional_register (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000100000000000", 2)))) then {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000010000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
        f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
        f_gen_store (v_st,v__PC.v,f_gen_array_load(v_st, v__R.v, BigInt(30)))
      } else {
        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
        f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
        f_gen_store (v_st,v__PC.v,f_gen_array_load(v_st, v__R.v, BigInt(30)))
      }
    } else {
      val v_X_read55__2 : RTSym = f_decl_bv(v_st, "X.read55__2", BigInt(64)) 
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
        f_gen_store (v_st,v_X_read55__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
      } else {
        f_gen_store (v_st,v_X_read55__2,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
      }
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000010000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000011000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000001000000000000000000000", 2)))) then {
          f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_bit_lit(v_st, BigInt(64), f_add_bits(v_st, BigInt(64), v_pc, mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
          f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
          f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
          f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read55__2))
        } else {
          f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
          f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
          f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read55__2))
        }
      } else {
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000011000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000001000000000000000000000", 2)))) then {
          f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_bit_lit(v_st, BigInt(64), f_add_bits(v_st, BigInt(64), v_pc, mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
          f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
          f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
          f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read55__2))
        } else {
          f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
          f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
          f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read55__2))
        }
      }
    }
  } else {
    val v_X_read109__2 : RTSym = f_decl_bv(v_st, "X.read109__2", BigInt(64)) 
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))))) then {
      f_gen_store (v_st,v_X_read109__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read109__2,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000011000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000001000000000000000000000", 2)))) then {
      f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_bit_lit(v_st, BigInt(64), f_add_bits(v_st, BigInt(64), v_pc, mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
      f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
      f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read109__2))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000011000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
      } else {
        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
      }
      f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
      f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read109__2))
    }
  }
}
