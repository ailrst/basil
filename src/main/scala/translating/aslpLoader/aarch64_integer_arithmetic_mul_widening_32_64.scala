/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_arithmetic_mul_widening_32_64 (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_X_read5__2 : RTSym = f_decl_bv(v_st, "X.read5__2", BigInt(32)) 
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
    f_gen_store (v_st,v_X_read5__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
  } else {
    f_gen_store (v_st,v_X_read5__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
  }
  val v_X_read10__2 : RTSym = f_decl_bv(v_st, "X.read10__2", BigInt(32)) 
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
    f_gen_store (v_st,v_X_read10__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))
  } else {
    f_gen_store (v_st,v_X_read10__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
  }
  val v_X_read15__2 : RTSym = f_decl_bv(v_st, "X.read15__2", BigInt(64)) 
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
    f_gen_store (v_st,v_X_read15__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(10),BigInt(5)))))
  } else {
    f_gen_store (v_st,v_X_read15__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
  }
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(15),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
    val v_If21__2 : RTSym = f_decl_bv(v_st, "If21__2", BigInt(65)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If21__2,f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), f_gen_load(v_st, v_X_read15__2), f_gen_int_lit(v_st, BigInt(65))))
    } else {
      f_gen_store (v_st,v_If21__2,f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_load(v_st, v_X_read15__2), f_gen_int_lit(v_st, BigInt(65))))
    }
    val v_If25__2 : RTSym = f_decl_bv(v_st, "If25__2", BigInt(33)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If25__2,f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read5__2), f_gen_int_lit(v_st, BigInt(33))))
    } else {
      f_gen_store (v_st,v_If25__2,f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read5__2), f_gen_int_lit(v_st, BigInt(33))))
    }
    val v_If29__2 : RTSym = f_decl_bv(v_st, "If29__2", BigInt(33)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If29__2,f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read10__2), f_gen_int_lit(v_st, BigInt(33))))
    } else {
      f_gen_store (v_st,v_If29__2,f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read10__2), f_gen_int_lit(v_st, BigInt(33))))
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_slice(v_st, f_gen_sub_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_SignExtend(v_st, BigInt(65), BigInt(66), f_gen_load(v_st, v_If21__2), f_gen_int_lit(v_st, BigInt(66))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_SignExtend(v_st, BigInt(65), BigInt(66), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_load(v_st, v_If25__2), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_load(v_st, v_If29__2), f_gen_int_lit(v_st, BigInt(65)))), f_gen_int_lit(v_st, BigInt(66))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64)))
    }
  } else {
    val v_If35__2 : RTSym = f_decl_bv(v_st, "If35__2", BigInt(65)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If35__2,f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), f_gen_load(v_st, v_X_read15__2), f_gen_int_lit(v_st, BigInt(65))))
    } else {
      f_gen_store (v_st,v_If35__2,f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_load(v_st, v_X_read15__2), f_gen_int_lit(v_st, BigInt(65))))
    }
    val v_If39__2 : RTSym = f_decl_bv(v_st, "If39__2", BigInt(33)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If39__2,f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read5__2), f_gen_int_lit(v_st, BigInt(33))))
    } else {
      f_gen_store (v_st,v_If39__2,f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read5__2), f_gen_int_lit(v_st, BigInt(33))))
    }
    val v_If43__2 : RTSym = f_decl_bv(v_st, "If43__2", BigInt(33)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If43__2,f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read10__2), f_gen_int_lit(v_st, BigInt(33))))
    } else {
      f_gen_store (v_st,v_If43__2,f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_load(v_st, v_X_read10__2), f_gen_int_lit(v_st, BigInt(33))))
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_slice(v_st, f_gen_add_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_SignExtend(v_st, BigInt(65), BigInt(66), f_gen_load(v_st, v_If35__2), f_gen_int_lit(v_st, BigInt(66))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_slice(v_st, f_gen_SignExtend(v_st, BigInt(65), BigInt(66), f_gen_mul_bits(v_st, BigInt(65), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_load(v_st, v_If39__2), f_gen_int_lit(v_st, BigInt(65))), f_gen_SignExtend(v_st, BigInt(33), BigInt(65), f_gen_load(v_st, v_If43__2), f_gen_int_lit(v_st, BigInt(65)))), f_gen_int_lit(v_st, BigInt(66))), BigInt(0), BigInt(64)), BigInt(0), BigInt(64))), BigInt(0), BigInt(64)))
    }
  }
}
