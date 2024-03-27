/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_tags_mcsettaganddatapairpost (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
    val v_Exp6__2 : RTSym = f_decl_bv(v_st, "Exp6__2", BigInt(64)) 
    f_gen_store (v_st,v_Exp6__2,f_gen_load(v_st, v_SP_EL0.v))
    val v_X_read7__2 : RTSym = f_decl_bv(v_st, "X.read7__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read7__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read7__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    val v_X_read12__2 : RTSym = f_decl_bv(v_st, "X.read12__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read12__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read12__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    f_gen_Mem_set (v_st,BigInt(8),f_gen_load(v_st, v_SP_EL0.v),f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, BigInt(0)),f_gen_load(v_st, v_X_read7__2))
    f_gen_Mem_set (v_st,BigInt(8),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_SP_EL0.v), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000001000", 2), 64))),f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, BigInt(0)),f_gen_load(v_st, v_X_read12__2))
    f_gen_AArch64_MemTag_set (v_st,f_gen_load(v_st, v_Exp6__2),f_gen_int_lit(v_st, BigInt(0)),f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(56), BigInt(4)))
    if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_SP_EL0.v,f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_Exp6__2), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), BitVecLiteral(BigInt("0000", 2), 4)))))
    } else {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_Exp6__2), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), BitVecLiteral(BigInt("0000", 2), 4)))))
      }
    }
  } else {
    val v_X_read22__2 : RTSym = f_decl_bv(v_st, "X.read22__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read22__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read22__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    val v_Exp26__2 : RTSym = f_decl_bv(v_st, "Exp26__2", BigInt(64)) 
    f_gen_store (v_st,v_Exp26__2,f_gen_load(v_st, v_X_read22__2))
    val v_X_read27__2 : RTSym = f_decl_bv(v_st, "X.read27__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read27__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read27__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    val v_X_read32__2 : RTSym = f_decl_bv(v_st, "X.read32__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read32__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5)))))
    } else {
      f_gen_store (v_st,v_X_read32__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    f_gen_Mem_set (v_st,BigInt(8),f_gen_load(v_st, v_X_read22__2),f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, BigInt(0)),f_gen_load(v_st, v_X_read27__2))
    f_gen_Mem_set (v_st,BigInt(8),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_X_read22__2), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000001000", 2), 64))),f_gen_int_lit(v_st, BigInt(8)),f_gen_int_lit(v_st, BigInt(0)),f_gen_load(v_st, v_X_read32__2))
    f_gen_AArch64_MemTag_set (v_st,f_gen_load(v_st, v_Exp26__2),f_gen_int_lit(v_st, BigInt(0)),f_gen_slice(v_st, f_gen_load(v_st, v_Exp26__2), BigInt(56), BigInt(4)))
    if (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_SP_EL0.v,f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_Exp26__2), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), BitVecLiteral(BigInt("0000", 2), 4)))))
    } else {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
        f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5))),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_Exp26__2), f_gen_bit_lit(v_st, ((BigInt(60)) + (BigInt(4))), f_append_bits(v_st, BigInt(60), BigInt(4), bvextract(v_st,bvextract(v_st,f_SignExtend(v_st, BigInt(7), BigInt(64), bvextract(v_st,v_enc,BigInt(15),BigInt(7)), BigInt(64)),BigInt(0),BigInt(60)),BigInt(0),BigInt(60)), BitVecLiteral(BigInt("0000", 2), 4)))))
      }
    }
  }
}
