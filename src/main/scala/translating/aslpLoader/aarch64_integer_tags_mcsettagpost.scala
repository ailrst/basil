/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_tags_mcsettagpost (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
    val v_Exp5__2 : RTSym = f_decl_bv(v_st, "Exp5__2", BigInt(64)) 
    f_gen_store (v_st,v_Exp5__2,f_gen_load(v_st, v_SP_EL0.v))
    val v_If6__1 : RTSym = f_decl_bv(v_st, "If6__1", BigInt(64)) 
    if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_If6__1,f_gen_load(v_st, v_SP_EL0.v))
    } else {
      val v_X_read8__2 : RTSym = f_decl_bv(v_st, "X.read8__2", BigInt(64)) 
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
        f_gen_store (v_st,v_X_read8__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))))
      } else {
        f_gen_store (v_st,v_X_read8__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
      }
      f_gen_store (v_st,v_If6__1,f_gen_load(v_st, v_X_read8__2))
    }
    f_gen_AArch64_MemTag_set (v_st,f_gen_load(v_st, v_Exp5__2),f_gen_int_lit(v_st, BigInt(0)),f_gen_slice(v_st, f_gen_load(v_st, v_If6__1), BigInt(56), BigInt(4)))
    if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_SP_EL0.v,f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_Exp5__2), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(9), BigInt(64), bvextract(v_st,v_enc,BigInt(12),BigInt(9)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), BitVecLiteral(BigInt("0000", 2), 4)))))
    } else {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_Exp5__2), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(9), BigInt(64), bvextract(v_st,v_enc,BigInt(12),BigInt(9)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), BitVecLiteral(BigInt("0000", 2), 4)))))
      }
    }
  } else {
    val v_X_read17__2 : RTSym = f_decl_bv(v_st, "X.read17__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read17__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read17__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    val v_Exp21__2 : RTSym = f_decl_bv(v_st, "Exp21__2", BigInt(64)) 
    f_gen_store (v_st,v_Exp21__2,f_gen_load(v_st, v_X_read17__2))
    val v_If22__1 : RTSym = f_decl_bv(v_st, "If22__1", BigInt(64)) 
    if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_If22__1,f_gen_load(v_st, v_SP_EL0.v))
    } else {
      val v_X_read25__2 : RTSym = f_decl_bv(v_st, "X.read25__2", BigInt(64)) 
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
        f_gen_store (v_st,v_X_read25__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))))
      } else {
        f_gen_store (v_st,v_X_read25__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
      }
      f_gen_store (v_st,v_If22__1,f_gen_load(v_st, v_X_read25__2))
    }
    f_gen_AArch64_MemTag_set (v_st,f_gen_load(v_st, v_Exp21__2),f_gen_int_lit(v_st, BigInt(0)),f_gen_slice(v_st, f_gen_load(v_st, v_If22__1), BigInt(56), BigInt(4)))
    if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_SP_EL0.v,f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_Exp21__2), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(9), BigInt(64), bvextract(v_st,v_enc,BigInt(12),BigInt(9)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), BitVecLiteral(BigInt("0000", 2), 4)))))
    } else {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_Exp21__2), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(9), BigInt(64), bvextract(v_st,v_enc,BigInt(12),BigInt(9)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), BitVecLiteral(BigInt("0000", 2), 4)))))
      }
    }
  }
}
