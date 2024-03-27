/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_shift_right_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_ne_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
    throw Exception("not supported")
  } else {
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp7__2 : RTSym = f_decl_bv(v_st, "Exp7__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp7__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    val v_If8__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(129)))
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(13),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      val v_If10__2 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(129)))
      if (f_sle_bits(v_st, BigInt(9), BitVecLiteral(BigInt("000000000", 2), 9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_sub_bits(v_st, BigInt(8), f_sub_bits(v_st, BigInt(8), BitVecLiteral(BigInt("10000000", 2), 8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))), BigInt(8))), BitVecLiteral(BigInt("00000001", 2), 8)), BigInt(9)))) then {
        v_If10__2.v = f_ZeroExtend(v_st, BigInt(128), BigInt(129), f_lsl_bits(v_st, BigInt(128), BigInt(9), BitVecLiteral(BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001", 2), 128), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_sub_bits(v_st, BigInt(8), f_sub_bits(v_st, BigInt(8), BitVecLiteral(BigInt("10000000", 2), 8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))), BigInt(8))), BitVecLiteral(BigInt("00000001", 2), 8)), BigInt(9))), BigInt(129))
      } else {
        v_If10__2.v = f_SignExtend(v_st, BigInt(2), BigInt(129), f_asr_bits(v_st, BigInt(2), BigInt(9), BitVecLiteral(BigInt("01", 2), 2), f_add_bits(v_st, BigInt(9), f_not_bits(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_sub_bits(v_st, BigInt(8), f_sub_bits(v_st, BigInt(8), BitVecLiteral(BigInt("10000000", 2), 8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))), BigInt(8))), BitVecLiteral(BigInt("00000001", 2), 8)), BigInt(9))), BitVecLiteral(BigInt("000000001", 2), 9))), BigInt(129))
      }
      v_If8__1.v = v_If10__2.v
    } else {
      v_If8__1.v = BitVecLiteral(BigInt("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 2), 129)
    }
    val v_If11__1 : RTSym = f_decl_bv(v_st, "If11__1", BigInt(64)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_store (v_st,v_If11__1,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64)))
    } else {
      f_gen_store (v_st,v_If11__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
    }
    val v_If18__2 : RTSym = f_decl_bv(v_st, "If18__2", BigInt(65)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If18__2,f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65))))
    } else {
      f_gen_store (v_st,v_If18__2,f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65))))
    }
    val v_If22__2 : RTSym = f_decl_bv(v_st, "If22__2", BigInt(130)) 
    if (f_sle_bits(v_st, BigInt(9), BitVecLiteral(BigInt("000000000", 2), 9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_sub_bits(v_st, BigInt(8), BitVecLiteral(BigInt("10000000", 2), 8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))), BigInt(8))), BigInt(9)))) then {
      f_gen_store (v_st,v_If22__2,f_gen_asr_bits(v_st, BigInt(130), BigInt(9), f_gen_add_bits(v_st, BigInt(130), f_gen_SignExtend(v_st, BigInt(65), BigInt(130), f_gen_load(v_st, v_If18__2), f_gen_int_lit(v_st, BigInt(130))), f_gen_bit_lit(v_st, BigInt(130), f_SignExtend(v_st, BigInt(129), BigInt(130), v_If8__1.v, BigInt(130)))), f_gen_bit_lit(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_sub_bits(v_st, BigInt(8), BitVecLiteral(BigInt("10000000", 2), 8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))), BigInt(8))), BigInt(9)))))
    } else {
      f_gen_store (v_st,v_If22__2,f_gen_lsl_bits(v_st, BigInt(130), BigInt(9), f_gen_add_bits(v_st, BigInt(130), f_gen_SignExtend(v_st, BigInt(65), BigInt(130), f_gen_load(v_st, v_If18__2), f_gen_int_lit(v_st, BigInt(130))), f_gen_bit_lit(v_st, BigInt(130), f_SignExtend(v_st, BigInt(129), BigInt(130), v_If8__1.v, BigInt(130)))), f_gen_bit_lit(v_st, BigInt(9), f_add_bits(v_st, BigInt(9), f_not_bits(v_st, BigInt(9), f_ZeroExtend(v_st, BigInt(8), BigInt(9), f_sub_bits(v_st, BigInt(8), BitVecLiteral(BigInt("10000000", 2), 8), f_ZeroExtend(v_st, BigInt(7), BigInt(8), f_append_bits(v_st, BigInt(4), BigInt(3), bvextract(v_st,v_enc,BigInt(19),BigInt(4)), bvextract(v_st,v_enc,BigInt(16),BigInt(3))), BigInt(8))), BigInt(9))), BitVecLiteral(BigInt("000000001", 2), 9)))))
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v_If11__1), f_gen_slice(v_st, f_gen_load(v_st, v_If22__2), BigInt(0), BigInt(64))), f_gen_int_lit(v_st, BigInt(128))))
  }
}
