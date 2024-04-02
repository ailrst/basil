/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_float_move_fp_imm (v_st: LiftState,v_enc: BV) : Unit = {
  val v_Exp2__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2))) 
  if (v_Exp2__1) then {
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(128), f_ZeroExtend(v_st, BigInt(32), BigInt(128), f_append_bits(v_st, BigInt(9), BigInt(23), f_append_bits(v_st, BigInt(1), BigInt(8), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), f_append_bits(v_st, BigInt(6), BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(5), f_not_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(19),BigInt(1))), f_replicate_bits(v_st, BigInt(1), BigInt(5), bvextract(v_st,v_enc,BigInt(19),BigInt(1)), BigInt(5))), bvextract(v_st,v_enc,BigInt(17),BigInt(2)))), f_append_bits(v_st, BigInt(4), BigInt(19), bvextract(v_st,v_enc,BigInt(13),BigInt(4)), mkBits(v_st, 19, BigInt("0000000000000000000", 2)))), BigInt(128))))
  } else {
    val v_Exp11__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2))) 
    if (v_Exp11__1) then {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(128), f_ZeroExtend(v_st, BigInt(64), BigInt(128), f_append_bits(v_st, BigInt(12), BigInt(52), f_append_bits(v_st, BigInt(1), BigInt(11), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), f_append_bits(v_st, BigInt(9), BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(8), f_not_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(19),BigInt(1))), f_replicate_bits(v_st, BigInt(1), BigInt(8), bvextract(v_st,v_enc,BigInt(19),BigInt(1)), BigInt(8))), bvextract(v_st,v_enc,BigInt(17),BigInt(2)))), f_append_bits(v_st, BigInt(4), BigInt(48), bvextract(v_st,v_enc,BigInt(13),BigInt(4)), mkBits(v_st, 48, BigInt("000000000000000000000000000000000000000000000000", 2)))), BigInt(128))))
    } else {
      val v_Exp20__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2))) 
      if (v_Exp20__1) then {
        throw Exception("not supported")
      } else {
        val v_Exp21__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2))) 
        if (v_Exp21__1) then {
          assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(128), f_ZeroExtend(v_st, BigInt(16), BigInt(128), f_append_bits(v_st, BigInt(6), BigInt(10), f_append_bits(v_st, BigInt(1), BigInt(5), bvextract(v_st,v_enc,BigInt(20),BigInt(1)), f_append_bits(v_st, BigInt(3), BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(2), f_not_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(19),BigInt(1))), f_replicate_bits(v_st, BigInt(1), BigInt(2), bvextract(v_st,v_enc,BigInt(19),BigInt(1)), BigInt(2))), bvextract(v_st,v_enc,BigInt(17),BigInt(2)))), f_append_bits(v_st, BigInt(4), BigInt(6), bvextract(v_st,v_enc,BigInt(13),BigInt(4)), mkBits(v_st, 6, BigInt("000000", 2)))), BigInt(128))))
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
}
