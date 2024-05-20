/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_memory_atomicops_cas_pair (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000010000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000010000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000001", 2)))) then {
      throw Exception("not supported")
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("01000000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
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
        val v_X_read9__2 = Mutable[Expr](rTExprDefault)
        v_X_read9__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32))
        val v_X_read14__2 = Mutable[Expr](rTExprDefault)
        assert (((true) && (f_sle_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), BigInt(7)), mkBits(v_st, 7, BigInt("0011111", 2))))))
        if (f_ne_bits(v_st, BigInt(6), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), mkBits(v_st, 6, BigInt("011111", 2)))) then {
          v_X_read14__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, ((f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))) + (BigInt(1)))), BigInt(0), BigInt(32))
        } else {
          v_X_read14__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
        }
        val v_X_read19__2 = Mutable[Expr](rTExprDefault)
        v_X_read19__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32))
        val v_X_read24__2 = Mutable[Expr](rTExprDefault)
        assert (((true) && (f_sle_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), BigInt(7)), mkBits(v_st, 7, BigInt("0011111", 2))))))
        if (f_ne_bits(v_st, BigInt(6), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), mkBits(v_st, 6, BigInt("011111", 2)))) then {
          v_X_read24__2.v = f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, ((f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))) + (BigInt(1)))), BigInt(0), BigInt(32))
        } else {
          v_X_read24__2.v = f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
          f_AtomicStart (v_st)
          val v_Exp167__3 : RTSym = f_decl_bv(v_st, "Exp167__3", BigInt(64)) 
          f_gen_store (v_st,v_Exp167__3,f_gen_Mem_read(v_st, BigInt(8), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(8)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If7__1.v))))
          val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(64), f_gen_Mem_read(v_st, BigInt(8), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(8)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If7__1.v))), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_X_read14__2.v, v_X_read9__2.v))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp0))
          f_gen_Mem_set (v_st,BigInt(8),f_gen_load(v_st, v_SP_EL0.v),f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If8__1.v)),f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_X_read24__2.v, v_X_read19__2.v))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
          f_AtomicEnd (v_st)
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_Exp167__3), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(64))))
          assert (((true) && (f_sle_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), BigInt(7)), mkBits(v_st, 7, BigInt("0011111", 2))))))
          if (f_ne_bits(v_st, BigInt(6), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), mkBits(v_st, 6, BigInt("011111", 2)))) then {
            f_gen_array_store (v_st,v__R.v,((f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))) + (BigInt(1))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_Exp167__3), BigInt(32), BigInt(32)), f_gen_int_lit(v_st, BigInt(64))))
          }
        } else {
          val v_X_read373__2 = Mutable[Expr](rTExprDefault)
          v_X_read373__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
          f_AtomicStart (v_st)
          val v_Exp379__3 : RTSym = f_decl_bv(v_st, "Exp379__3", BigInt(64)) 
          f_gen_store (v_st,v_Exp379__3,f_gen_Mem_read(v_st, BigInt(8), v_X_read373__2.v, f_gen_int_lit(v_st, BigInt(8)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If7__1.v))))
          val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(64), f_gen_Mem_read(v_st, BigInt(8), v_X_read373__2.v, f_gen_int_lit(v_st, BigInt(8)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If7__1.v))), f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_X_read14__2.v, v_X_read9__2.v))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp1))
          f_gen_Mem_set (v_st,BigInt(8),v_X_read373__2.v,f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If8__1.v)),f_gen_append_bits(v_st, BigInt(32), BigInt(32), v_X_read24__2.v, v_X_read19__2.v))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp1))
          f_AtomicEnd (v_st)
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_Exp379__3), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(64))))
          assert (((true) && (f_sle_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), BigInt(7)), mkBits(v_st, 7, BigInt("0011111", 2))))))
          if (f_ne_bits(v_st, BigInt(6), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), mkBits(v_st, 6, BigInt("011111", 2)))) then {
            f_gen_array_store (v_st,v__R.v,((f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))) + (BigInt(1))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_Exp379__3), BigInt(32), BigInt(32)), f_gen_int_lit(v_st, BigInt(64))))
          }
        }
      } else {
        val v_If586__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
          v_If586__1.v = mkBits(v_st, 5, BigInt("01001", 2))
        } else {
          v_If586__1.v = mkBits(v_st, 5, BigInt("00101", 2))
        }
        val v_If587__1 = Mutable[BV](mkBits(v_st, BigInt(5), BigInt(0)))
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000001000000000000000", 2)))) then {
          v_If587__1.v = mkBits(v_st, 5, BigInt("01001", 2))
        } else {
          v_If587__1.v = mkBits(v_st, 5, BigInt("00101", 2))
        }
        val v_X_read588__2 = Mutable[Expr](rTExprDefault)
        v_X_read588__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))
        val v_X_read593__2 = Mutable[Expr](rTExprDefault)
        assert (((true) && (f_sle_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), BigInt(7)), mkBits(v_st, 7, BigInt("0011111", 2))))))
        if (f_ne_bits(v_st, BigInt(6), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), mkBits(v_st, 6, BigInt("011111", 2)))) then {
          v_X_read593__2.v = f_gen_array_load(v_st, v__R.v, ((f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))) + (BigInt(1))))
        } else {
          v_X_read593__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
        }
        val v_X_read598__2 = Mutable[Expr](rTExprDefault)
        v_X_read598__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))))
        val v_X_read603__2 = Mutable[Expr](rTExprDefault)
        assert (((true) && (f_sle_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), BigInt(7)), mkBits(v_st, 7, BigInt("0011111", 2))))))
        if (f_ne_bits(v_st, BigInt(6), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), mkBits(v_st, 6, BigInt("011111", 2)))) then {
          v_X_read603__2.v = f_gen_array_load(v_st, v__R.v, ((f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))) + (BigInt(1))))
        } else {
          v_X_read603__2.v = f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2)))
        }
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000001111100000", 2)))) then {
          f_AtomicStart (v_st)
          val v_Exp746__3 : RTSym = f_decl_bv(v_st, "Exp746__3", BigInt(128)) 
          f_gen_store (v_st,v_Exp746__3,f_gen_Mem_read(v_st, BigInt(16), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(16)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If586__1.v))))
          val v_temp2 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(128), f_gen_Mem_read(v_st, BigInt(16), f_gen_load(v_st, v_SP_EL0.v), f_gen_int_lit(v_st, BigInt(16)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If586__1.v))), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read593__2.v, v_X_read588__2.v))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp2))
          f_gen_Mem_set (v_st,BigInt(16),f_gen_load(v_st, v_SP_EL0.v),f_gen_int_lit(v_st, BigInt(16)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If587__1.v)),f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read603__2.v, v_X_read598__2.v))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp2))
          f_AtomicEnd (v_st)
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))),f_gen_slice(v_st, f_gen_load(v_st, v_Exp746__3), BigInt(0), BigInt(64)))
          assert (((true) && (f_sle_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), BigInt(7)), mkBits(v_st, 7, BigInt("0011111", 2))))))
          if (f_ne_bits(v_st, BigInt(6), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), mkBits(v_st, 6, BigInt("011111", 2)))) then {
            f_gen_array_store (v_st,v__R.v,((f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))) + (BigInt(1))),f_gen_slice(v_st, f_gen_load(v_st, v_Exp746__3), BigInt(64), BigInt(64)))
          }
        } else {
          val v_X_read952__2 = Mutable[Expr](rTExprDefault)
          v_X_read952__2.v = f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))))
          f_AtomicStart (v_st)
          val v_Exp958__3 : RTSym = f_decl_bv(v_st, "Exp958__3", BigInt(128)) 
          f_gen_store (v_st,v_Exp958__3,f_gen_Mem_read(v_st, BigInt(16), v_X_read952__2.v, f_gen_int_lit(v_st, BigInt(16)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If586__1.v))))
          val v_temp3 : RTLabel = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(128), f_gen_Mem_read(v_st, BigInt(16), v_X_read952__2.v, f_gen_int_lit(v_st, BigInt(16)), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If586__1.v))), f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read593__2.v, v_X_read588__2.v))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp3))
          f_gen_Mem_set (v_st,BigInt(16),v_X_read952__2.v,f_gen_int_lit(v_st, BigInt(16)),f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(5), v_If587__1.v)),f_gen_append_bits(v_st, BigInt(64), BigInt(64), v_X_read603__2.v, v_X_read598__2.v))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp3))
          f_AtomicEnd (v_st)
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))),f_gen_slice(v_st, f_gen_load(v_st, v_Exp958__3), BigInt(0), BigInt(64)))
          assert (((true) && (f_sle_bits(v_st, BigInt(7), f_ZeroExtend(v_st, BigInt(6), BigInt(7), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), BigInt(7)), mkBits(v_st, 7, BigInt("0011111", 2))))))
          if (f_ne_bits(v_st, BigInt(6), f_add_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("000001", 2))), mkBits(v_st, 6, BigInt("011111", 2)))) then {
            f_gen_array_store (v_st,v__R.v,((f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))) + (BigInt(1))),f_gen_slice(v_st, f_gen_load(v_st, v_Exp958__3), BigInt(64), BigInt(64)))
          }
        }
      }
    }
  }
}
