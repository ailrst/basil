/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_fp16_conv_float_bulk_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_FPDecodeRounding4__2 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(3)))
  if (f_eq_bits(v_st, BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(23),BigInt(1))), BitVecLiteral(BigInt("00", 2), 2))) then {
    v_FPDecodeRounding4__2.v = BitVecLiteral(BigInt("000", 2), 3)
  } else {
    if (f_eq_bits(v_st, BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(23),BigInt(1))), BitVecLiteral(BigInt("01", 2), 2))) then {
      v_FPDecodeRounding4__2.v = BitVecLiteral(BigInt("001", 2), 3)
    } else {
      if (f_eq_bits(v_st, BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(23),BigInt(1))), BitVecLiteral(BigInt("10", 2), 2))) then {
        v_FPDecodeRounding4__2.v = BitVecLiteral(BigInt("010", 2), 3)
      } else {
        if (f_eq_bits(v_st, BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), bvextract(v_st,v_enc,BigInt(23),BigInt(1))), BitVecLiteral(BigInt("11", 2), 2))) then {
          v_FPDecodeRounding4__2.v = BitVecLiteral(BigInt("011", 2), 3)
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  val v_Exp12__2 : RTSym = f_decl_bv(v_st, "Exp12__2", BigInt(16)) 
  f_gen_store (v_st,v_Exp12__2,f_gen_FPToFixed(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(0)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v), f_gen_int_lit(v_st, f_cvt_bits_uint(v_st, BigInt(3), v_FPDecodeRounding4__2.v))))
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_Exp12__2), f_gen_int_lit(v_st, BigInt(128))))
}
