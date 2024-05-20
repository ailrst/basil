/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_memory_atomicops_swp (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("11000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
    val v_If8__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
    if (((((((((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000010000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000001000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000100", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000010", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) then {
      v_If8__1.v = mkBits(v_st, 5, BigInt("01001", 2))
    } else {
      v_If8__1.v = mkBits(v_st, 5, BigInt("00101", 2))
    }
    val v_If9__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
      v_If9__1.v = mkBits(v_st, 5, BigInt("01001", 2))
    } else {
      v_If9__1.v = mkBits(v_st, 5, BigInt("00101", 2))
    }
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
      val v_X_read13__2 = Mutable[Expr](rTExprDefault)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
        v_X_read13__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(8))
      } else {
        v_X_read13__2.v = f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))
      }
      f_AtomicStart (v_st)
      val v_Exp19__3 : RTSym = f_decl_bv(v_st, "Exp19__3", BigInt(8)) 
      f_gen_store (v_st,v_Exp19__3,f_gen_Mem_read(v_st, BigInt(1), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(1)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If8__1.v))))
      f_gen_Mem_set (v_st,BigInt(1),f_gen_load(v_st, v_SP_EL0.v),f_gen_int_lit(v_st, BigInt(1)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If9__1.v)),v_X_read13__2.v)
      f_AtomicEnd (v_st)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_ZeroExtend(v_st, BigInt(8), BigInt(32), f_gen_load(v_st, v_Exp19__3), f_gen_int_lit(v_st, BigInt(32))), f_gen_int_lit(v_st, BigInt(64))))
      }
    } else {
      val v_X_read156__2 = Mutable[Expr](rTExprDefault)
      v_X_read156__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
      val v_X_read161__2 = Mutable[Expr](rTExprDefault)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
        v_X_read161__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(8))
      } else {
        v_X_read161__2.v = f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2)))
      }
      f_AtomicStart (v_st)
      val v_Exp167__3 : RTSym = f_decl_bv(v_st, "Exp167__3", BigInt(8)) 
      f_gen_store (v_st,v_Exp167__3,f_gen_Mem_read(v_st, BigInt(1), v_X_read156__2.v, f_gen_int_lit(v_st, BigInt(1)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If8__1.v))))
      f_gen_Mem_set (v_st,BigInt(1),v_X_read156__2.v,f_gen_int_lit(v_st, BigInt(1)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If9__1.v)),v_X_read161__2.v)
      f_AtomicEnd (v_st)
      if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_ZeroExtend(v_st, BigInt(8), BigInt(32), f_gen_load(v_st, v_Exp167__3), f_gen_int_lit(v_st, BigInt(32))), f_gen_int_lit(v_st, BigInt(64))))
      }
    }
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("11000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2)))) then {
      val v_If306__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
      if (((((((((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000010000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000001000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000100", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000010", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) then {
        v_If306__1.v = mkBits(v_st, 5, BigInt("01001", 2))
      } else {
        v_If306__1.v = mkBits(v_st, 5, BigInt("00101", 2))
      }
      val v_If307__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
        v_If307__1.v = mkBits(v_st, 5, BigInt("01001", 2))
      } else {
        v_If307__1.v = mkBits(v_st, 5, BigInt("00101", 2))
      }
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
        val v_X_read311__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
          v_X_read311__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16))
        } else {
          v_X_read311__2.v = f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2)))
        }
        f_AtomicStart (v_st)
        val v_Exp317__3 : RTSym = f_decl_bv(v_st, "Exp317__3", BigInt(16)) 
        f_gen_store (v_st,v_Exp317__3,f_gen_Mem_read(v_st, BigInt(2), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(2)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If306__1.v))))
        f_gen_Mem_set (v_st,BigInt(2),f_gen_load(v_st, v_SP_EL0.v),f_gen_int_lit(v_st, BigInt(2)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If307__1.v)),v_X_read311__2.v)
        f_AtomicEnd (v_st)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_ZeroExtend(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp317__3), f_gen_int_lit(v_st, BigInt(32))), f_gen_int_lit(v_st, BigInt(64))))
        }
      } else {
        val v_X_read454__2 = Mutable[Expr](rTExprDefault)
        v_X_read454__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
        val v_X_read459__2 = Mutable[Expr](rTExprDefault)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
          v_X_read459__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16))
        } else {
          v_X_read459__2.v = f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2)))
        }
        f_AtomicStart (v_st)
        val v_Exp465__3 : RTSym = f_decl_bv(v_st, "Exp465__3", BigInt(16)) 
        f_gen_store (v_st,v_Exp465__3,f_gen_Mem_read(v_st, BigInt(2), v_X_read454__2.v, f_gen_int_lit(v_st, BigInt(2)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If306__1.v))))
        f_gen_Mem_set (v_st,BigInt(2),v_X_read454__2.v,f_gen_int_lit(v_st, BigInt(2)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If307__1.v)),v_X_read459__2.v)
        f_AtomicEnd (v_st)
        if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_ZeroExtend(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_Exp465__3), f_gen_int_lit(v_st, BigInt(32))), f_gen_int_lit(v_st, BigInt(64))))
        }
      }
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("11000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2)))) then {
        val v_If604__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
        if (((((((((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000010000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000001000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000100", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000010", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) then {
          v_If604__1.v = mkBits(v_st, 5, BigInt("01001", 2))
        } else {
          v_If604__1.v = mkBits(v_st, 5, BigInt("00101", 2))
        }
        val v_If605__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
          v_If605__1.v = mkBits(v_st, 5, BigInt("01001", 2))
        } else {
          v_If605__1.v = mkBits(v_st, 5, BigInt("00101", 2))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
          val v_X_read609__2 = Mutable[Expr](rTExprDefault)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
            v_X_read609__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
          } else {
            v_X_read609__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
          }
          f_AtomicStart (v_st)
          val v_Exp615__3 : RTSym = f_decl_bv(v_st, "Exp615__3", BigInt(32)) 
          f_gen_store (v_st,v_Exp615__3,f_gen_Mem_read(v_st, BigInt(4), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(4)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If604__1.v))))
          f_gen_Mem_set (v_st,BigInt(4),f_gen_load(v_st, v_SP_EL0.v),f_gen_int_lit(v_st, BigInt(4)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If605__1.v)),v_X_read609__2.v)
          f_AtomicEnd (v_st)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_Exp615__3), f_gen_int_lit(v_st, BigInt(64))))
          }
        } else {
          val v_X_read752__2 = Mutable[Expr](rTExprDefault)
          v_X_read752__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
          val v_X_read757__2 = Mutable[Expr](rTExprDefault)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
            v_X_read757__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
          } else {
            v_X_read757__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
          }
          f_AtomicStart (v_st)
          val v_Exp763__3 : RTSym = f_decl_bv(v_st, "Exp763__3", BigInt(32)) 
          f_gen_store (v_st,v_Exp763__3,f_gen_Mem_read(v_st, BigInt(4), v_X_read752__2.v, f_gen_int_lit(v_st, BigInt(4)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If604__1.v))))
          f_gen_Mem_set (v_st,BigInt(4),v_X_read752__2.v,f_gen_int_lit(v_st, BigInt(4)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If605__1.v)),v_X_read757__2.v)
          f_AtomicEnd (v_st)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_Exp763__3), f_gen_int_lit(v_st, BigInt(64))))
          }
        }
      } else {
        val v_If902__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
        if (((((((((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000010000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000001000", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000100", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000010", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000100000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000100000000000000000000000", 2)))))) then {
          v_If902__1.v = mkBits(v_st, 5, BigInt("01001", 2))
        } else {
          v_If902__1.v = mkBits(v_st, 5, BigInt("00101", 2))
        }
        val v_If903__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
          v_If903__1.v = mkBits(v_st, 5, BigInt("01001", 2))
        } else {
          v_If903__1.v = mkBits(v_st, 5, BigInt("00101", 2))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
          val v_X_read907__2 = Mutable[Expr](rTExprDefault)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
            v_X_read907__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
          } else {
            v_X_read907__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
          }
          f_AtomicStart (v_st)
          val v_Exp913__3 : RTSym = f_decl_bv(v_st, "Exp913__3", BigInt(64)) 
          f_gen_store (v_st,v_Exp913__3,f_gen_Mem_read(v_st, BigInt(8), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(8)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If902__1.v))))
          f_gen_Mem_set (v_st,BigInt(8),f_gen_load(v_st, v_SP_EL0.v),f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If903__1.v)),v_X_read907__2.v)
          f_AtomicEnd (v_st)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_load(v_st, v_Exp913__3))
          }
        } else {
          val v_X_read1050__2 = Mutable[Expr](rTExprDefault)
          v_X_read1050__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
          val v_X_read1055__2 = Mutable[Expr](rTExprDefault)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000111110000000000000000", 2)))))) then {
            v_X_read1055__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
          } else {
            v_X_read1055__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
          }
          f_AtomicStart (v_st)
          val v_Exp1061__3 : RTSym = f_decl_bv(v_st, "Exp1061__3", BigInt(64)) 
          f_gen_store (v_st,v_Exp1061__3,f_gen_Mem_read(v_st, BigInt(8), v_X_read1050__2.v, f_gen_int_lit(v_st, BigInt(8)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If902__1.v))))
          f_gen_Mem_set (v_st,BigInt(8),v_X_read1050__2.v,f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If903__1.v)),v_X_read1055__2.v)
          f_AtomicEnd (v_st)
          if ( (!(f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000011111", 2)))))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_load(v_st, v_Exp1061__3))
          }
        }
      }
    }
  }
}
