/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_pac_autib_hint (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_d__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(5)))
  val v_n__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(5)))
  val v_source_is_sp__1 = Mutable[Boolean](false)
  if (f_eq_bits(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(8),BigInt(4)), bvextract(v_st,v_enc,BigInt(5),BigInt(3))), BitVecLiteral(BigInt("0011110", 2), 7))) then {
    v_d__1.v = BitVecLiteral(BigInt("11110", 2), 5)
    v_n__1.v = BitVecLiteral(BigInt("11111", 2), 5)
  } else {
    if (f_eq_bits(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(8),BigInt(4)), bvextract(v_st,v_enc,BigInt(5),BigInt(3))), BitVecLiteral(BigInt("0011111", 2), 7))) then {
      v_d__1.v = BitVecLiteral(BigInt("11110", 2), 5)
      v_source_is_sp__1.v = true
    } else {
      if (f_eq_bits(v_st, BigInt(7), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(8),BigInt(4)), bvextract(v_st,v_enc,BigInt(5),BigInt(3))), BitVecLiteral(BigInt("0001110", 2), 7))) then {
        v_d__1.v = BitVecLiteral(BigInt("10001", 2), 5)
        v_n__1.v = BitVecLiteral(BigInt("10000", 2), 5)
      } else {
        throw Exception("not supported")
      }
    }
  }
  if (v_source_is_sp__1.v) then {
    val v_X_read5__2 : RTSym = f_decl_bv(v_st, "X.read5__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), v_d__1.v, BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read5__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), v_d__1.v)))
    } else {
      f_gen_store (v_st,v_X_read5__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), v_d__1.v, BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), v_d__1.v),f_gen_load(v_st, v_X_read5__2))
    }
  } else {
    val v_X_read16__2 : RTSym = f_decl_bv(v_st, "X.read16__2", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), v_d__1.v, BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_store (v_st,v_X_read16__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), v_d__1.v)))
    } else {
      f_gen_store (v_st,v_X_read16__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_n__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_n__1.v, BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), v_d__1.v, BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_ne_bits(v_st, BigInt(5), v_d__1.v, BitVecLiteral(BigInt("11111", 2), 5))) then {
      f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), v_d__1.v),f_gen_load(v_st, v_X_read16__2))
    }
  }
}
