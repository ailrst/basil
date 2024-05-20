/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_memory_atomicops_cas_single (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("11000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_If7__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
      v_If7__1.v = mkBits(v_st, 5, BigInt("01001", 2))
    } else {
      v_If7__1.v = mkBits(v_st, 5, BigInt("00101", 2))
    }
    val v_If8__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2)))) then {
      v_If8__1.v = mkBits(v_st, 5, BigInt("01001", 2))
    } else {
      v_If8__1.v = mkBits(v_st, 5, BigInt("00101", 2))
    }
    val v_X_read10__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
      v_X_read10__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(8))
    } else {
      v_X_read10__2.v = f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))
    }
    val v_X_read15__2 = Mutable[Expr](rTExprDefault)
    if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
      v_X_read15__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(8))
    } else {
      v_X_read15__2.v = f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
      f_AtomicStart (v_st)
      val v_Exp23__3 : RTSym = f_decl_bv(v_st, "Exp23__3", BigInt(8)) 
      f_gen_store (v_st,v_Exp23__3,f_gen_Mem_read(v_st, BigInt(1), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(1)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If7__1.v))))
      val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(8), f_gen_Mem_read(v_st, BigInt(1), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(1)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If7__1.v))), v_X_read10__2.v)) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp0))
      f_gen_Mem_set (v_st,BigInt(1),f_gen_load(v_st, v_SP_EL0.v),f_gen_int_lit(v_st, BigInt(1)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If8__1.v)),v_X_read15__2.v)
      f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
      f_AtomicEnd (v_st)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_ZeroExtend(v_st, BigInt(8), BigInt(32), f_gen_load(v_st, v_Exp23__3), f_gen_int_lit(v_st, BigInt(32))), f_gen_int_lit(v_st, BigInt(64))))
      }
    } else {
      val v_X_read160__2 = Mutable[Expr](rTExprDefault)
      v_X_read160__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      f_AtomicStart (v_st)
      val v_Exp166__3 : RTSym = f_decl_bv(v_st, "Exp166__3", BigInt(8)) 
      f_gen_store (v_st,v_Exp166__3,f_gen_Mem_read(v_st, BigInt(1), v_X_read160__2.v, f_gen_int_lit(v_st, BigInt(1)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If7__1.v))))
      val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(8), f_gen_Mem_read(v_st, BigInt(1), v_X_read160__2.v, f_gen_int_lit(v_st, BigInt(1)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If7__1.v))), v_X_read10__2.v)) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp1))
      f_gen_Mem_set (v_st,BigInt(1),v_X_read160__2.v,f_gen_int_lit(v_st, BigInt(1)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If8__1.v)),v_X_read15__2.v)
      f_switch_context (v_st,f_merge_branch(v_st, v_temp1))
      f_AtomicEnd (v_st)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_ZeroExtend(v_st, BigInt(8), BigInt(32), f_gen_load(v_st, v_Exp166__3), f_gen_int_lit(v_st, BigInt(32))), f_gen_int_lit(v_st, BigInt(64))))
      }
    }
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("11000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
      val v_If304__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
        v_If304__1.v = mkBits(v_st, 5, BigInt("01001", 2))
      } else {
        v_If304__1.v = mkBits(v_st, 5, BigInt("00101", 2))
      }
      val v_If305__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2)))) then {
        v_If305__1.v = mkBits(v_st, 5, BigInt("01001", 2))
      } else {
        v_If305__1.v = mkBits(v_st, 5, BigInt("00101", 2))
      }
      val v_X_read307__2 = Mutable[Expr](rTExprDefault)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
        v_X_read307__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16))
      } else {
        v_X_read307__2.v = f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2)))
      }
      val v_X_read312__2 = Mutable[Expr](rTExprDefault)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_X_read312__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(16))
      } else {
        v_X_read312__2.v = f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2)))
      }
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
        f_AtomicStart (v_st)
        val v_Exp320__3 : RTSym = f_decl_bv(v_st, "Exp320__3", BigInt(16)) 
        f_gen_store (v_st,v_Exp320__3,f_gen_Mem_read(v_st, BigInt(2), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(2)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If304__1.v))))
        val v_temp2 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(16), f_gen_Mem_read(v_st, BigInt(2), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(2)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If304__1.v))), v_X_read307__2.v)) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp2))
        f_gen_Mem_set (v_st,BigInt(2),f_gen_load(v_st, v_SP_EL0.v),f_gen_int_lit(v_st, BigInt(2)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If305__1.v)),v_X_read312__2.v)
        f_switch_context (v_st,f_merge_branch(v_st, v_temp2))
        f_AtomicEnd (v_st)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_ZeroExtend(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp320__3), f_gen_int_lit(v_st, BigInt(32))), f_gen_int_lit(v_st, BigInt(64))))
        }
      } else {
        val v_X_read457__2 = Mutable[Expr](rTExprDefault)
        v_X_read457__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        f_AtomicStart (v_st)
        val v_Exp463__3 : RTSym = f_decl_bv(v_st, "Exp463__3", BigInt(16)) 
        f_gen_store (v_st,v_Exp463__3,f_gen_Mem_read(v_st, BigInt(2), v_X_read457__2.v, f_gen_int_lit(v_st, BigInt(2)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If304__1.v))))
        val v_temp3 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(16), f_gen_Mem_read(v_st, BigInt(2), v_X_read457__2.v, f_gen_int_lit(v_st, BigInt(2)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If304__1.v))), v_X_read307__2.v)) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp3))
        f_gen_Mem_set (v_st,BigInt(2),v_X_read457__2.v,f_gen_int_lit(v_st, BigInt(2)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If305__1.v)),v_X_read312__2.v)
        f_switch_context (v_st,f_merge_branch(v_st, v_temp3))
        f_AtomicEnd (v_st)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_ZeroExtend(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp463__3), f_gen_int_lit(v_st, BigInt(32))), f_gen_int_lit(v_st, BigInt(64))))
        }
      }
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("11000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2)))) then {
        val v_If601__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
          v_If601__1.v = mkBits(v_st, 5, BigInt("01001", 2))
        } else {
          v_If601__1.v = mkBits(v_st, 5, BigInt("00101", 2))
        }
        val v_If602__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2)))) then {
          v_If602__1.v = mkBits(v_st, 5, BigInt("01001", 2))
        } else {
          v_If602__1.v = mkBits(v_st, 5, BigInt("00101", 2))
        }
        val v_X_read604__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
          v_X_read604__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
        } else {
          v_X_read604__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
        }
        val v_X_read609__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          v_X_read609__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32))
        } else {
          v_X_read609__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
          f_AtomicStart (v_st)
          val v_Exp617__3 : RTSym = f_decl_bv(v_st, "Exp617__3", BigInt(32)) 
          f_gen_store (v_st,v_Exp617__3,f_gen_Mem_read(v_st, BigInt(4), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(4)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If601__1.v))))
          val v_temp4 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(32), f_gen_Mem_read(v_st, BigInt(4), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(4)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If601__1.v))), v_X_read604__2.v)) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp4))
          f_gen_Mem_set (v_st,BigInt(4),f_gen_load(v_st, v_SP_EL0.v),f_gen_int_lit(v_st, BigInt(4)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If602__1.v)),v_X_read609__2.v)
          f_switch_context (v_st,f_merge_branch(v_st, v_temp4))
          f_AtomicEnd (v_st)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_Exp617__3), f_gen_int_lit(v_st, BigInt(64))))
          }
        } else {
          val v_X_read754__2 = Mutable[Expr](rTExprDefault)
          v_X_read754__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
          f_AtomicStart (v_st)
          val v_Exp760__3 : RTSym = f_decl_bv(v_st, "Exp760__3", BigInt(32)) 
          f_gen_store (v_st,v_Exp760__3,f_gen_Mem_read(v_st, BigInt(4), v_X_read754__2.v, f_gen_int_lit(v_st, BigInt(4)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If601__1.v))))
          val v_temp5 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(32), f_gen_Mem_read(v_st, BigInt(4), v_X_read754__2.v, f_gen_int_lit(v_st, BigInt(4)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If601__1.v))), v_X_read604__2.v)) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp5))
          f_gen_Mem_set (v_st,BigInt(4),v_X_read754__2.v,f_gen_int_lit(v_st, BigInt(4)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If602__1.v)),v_X_read609__2.v)
          f_switch_context (v_st,f_merge_branch(v_st, v_temp5))
          f_AtomicEnd (v_st)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_Exp760__3), f_gen_int_lit(v_st, BigInt(64))))
          }
        }
      } else {
        val v_If898__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
          v_If898__1.v = mkBits(v_st, 5, BigInt("01001", 2))
        } else {
          v_If898__1.v = mkBits(v_st, 5, BigInt("00101", 2))
        }
        val v_If899__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2)))) then {
          v_If899__1.v = mkBits(v_st, 5, BigInt("01001", 2))
        } else {
          v_If899__1.v = mkBits(v_st, 5, BigInt("00101", 2))
        }
        val v_X_read901__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
          v_X_read901__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
        } else {
          v_X_read901__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
        }
        val v_X_read906__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          v_X_read906__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
        } else {
          v_X_read906__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
          f_AtomicStart (v_st)
          val v_Exp914__3 : RTSym = f_decl_bv(v_st, "Exp914__3", BigInt(64)) 
          f_gen_store (v_st,v_Exp914__3,f_gen_Mem_read(v_st, BigInt(8), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(8)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If898__1.v))))
          val v_temp6 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(64), f_gen_Mem_read(v_st, BigInt(8), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(8)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If898__1.v))), v_X_read901__2.v)) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp6))
          f_gen_Mem_set (v_st,BigInt(8),f_gen_load(v_st, v_SP_EL0.v),f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If899__1.v)),v_X_read906__2.v)
          f_switch_context (v_st,f_merge_branch(v_st, v_temp6))
          f_AtomicEnd (v_st)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))),f_gen_load(v_st, v_Exp914__3))
          }
        } else {
          val v_X_read1051__2 = Mutable[Expr](rTExprDefault)
          v_X_read1051__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
          f_AtomicStart (v_st)
          val v_Exp1057__3 : RTSym = f_decl_bv(v_st, "Exp1057__3", BigInt(64)) 
          f_gen_store (v_st,v_Exp1057__3,f_gen_Mem_read(v_st, BigInt(8), v_X_read1051__2.v, f_gen_int_lit(v_st, BigInt(8)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If898__1.v))))
          val v_temp7 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(64), f_gen_Mem_read(v_st, BigInt(8), v_X_read1051__2.v, f_gen_int_lit(v_st, BigInt(8)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If898__1.v))), v_X_read901__2.v)) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp7))
          f_gen_Mem_set (v_st,BigInt(8),v_X_read1051__2.v,f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If899__1.v)),v_X_read906__2.v)
          f_switch_context (v_st,f_merge_branch(v_st, v_temp7))
          f_AtomicEnd (v_st)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))),f_gen_load(v_st, v_Exp1057__3))
          }
        }
      }
    }
  }
}
