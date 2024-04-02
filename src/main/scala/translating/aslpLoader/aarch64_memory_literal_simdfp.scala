/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_memory_literal_simdfp (v_st: LiftState,v_enc: BV) : Unit = {
  val v_Exp2__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(30),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2))) 
  if (v_Exp2__1) then {
    assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_Mem_read(v_st, BigInt(4), f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), f_SignExtend(v_st, BigInt(21), BigInt(64), f_append_bits(v_st, BigInt(19), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(19)), mkBits(v_st, 2, BigInt("00", 2))), BigInt(64)))), f_gen_int_lit(v_st, BigInt(4)), f_gen_int_lit(v_st, BigInt(1))), f_gen_int_lit(v_st, BigInt(128))))
  } else {
    val v_Exp12__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(30),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2))) 
    if (v_Exp12__1) then {
      assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_Mem_read(v_st, BigInt(8), f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), f_SignExtend(v_st, BigInt(21), BigInt(64), f_append_bits(v_st, BigInt(19), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(19)), mkBits(v_st, 2, BigInt("00", 2))), BigInt(64)))), f_gen_int_lit(v_st, BigInt(8)), f_gen_int_lit(v_st, BigInt(1))), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      val v_Exp22__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(30),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2))) 
      if (v_Exp22__1) then {
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_Mem_read(v_st, BigInt(16), f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), f_SignExtend(v_st, BigInt(21), BigInt(64), f_append_bits(v_st, BigInt(19), BigInt(2), bvextract(v_st,v_enc,BigInt(5),BigInt(19)), mkBits(v_st, 2, BigInt("00", 2))), BigInt(64)))), f_gen_int_lit(v_st, BigInt(16)), f_gen_int_lit(v_st, BigInt(1))))
      } else {
        throw Exception("not supported")
      }
    }
  }
}
