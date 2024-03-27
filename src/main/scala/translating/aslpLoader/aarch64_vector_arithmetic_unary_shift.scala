/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_shift (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("00", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
      val v_Vpart_read5__2 : RTSym = f_decl_bv(v_st, "Vpart.read5__2", BigInt(64)) 
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      val v_Exp8__2 : Boolean = ((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) || ((( (!(f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))))) && (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1)))))) 
      assert (v_Exp8__2)
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_store (v_st,v_Vpart_read5__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)))
      } else {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_store (v_st,v_Vpart_read5__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)))
      }
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(16), BigInt(112), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read5__2), BigInt(56), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8))), f_gen_append_bits(v_st, BigInt(16), BigInt(96), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read5__2), BigInt(48), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8))), f_gen_append_bits(v_st, BigInt(16), BigInt(80), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read5__2), BigInt(40), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8))), f_gen_append_bits(v_st, BigInt(16), BigInt(64), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read5__2), BigInt(32), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8))), f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read5__2), BigInt(24), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8))), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read5__2), BigInt(16), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8))), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read5__2), BigInt(8), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8))), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read5__2), BigInt(0), BigInt(8)), f_gen_bit_lit(v_st, BigInt(8), BitVecLiteral(BigInt("00000000", 2), 8)))))))))))
    } else {
      if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("01", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
        val v_Vpart_read64__2 : RTSym = f_decl_bv(v_st, "Vpart.read64__2", BigInt(64)) 
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp67__2 : Boolean = ((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) || ((( (!(f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))))) && (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1)))))) 
        assert (v_Exp67__2)
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_store (v_st,v_Vpart_read64__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)))
        } else {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_store (v_st,v_Vpart_read64__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)))
        }
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read64__2), BigInt(48), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16))), f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read64__2), BigInt(32), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16))), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read64__2), BigInt(16), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16))), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read64__2), BigInt(0), BigInt(16)), f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))))))
      } else {
        if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("10", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
          val v_Vpart_read103__2 : RTSym = f_decl_bv(v_st, "Vpart.read103__2", BigInt(64)) 
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp106__2 : Boolean = ((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) || ((( (!(f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))))) && (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1)))))) 
          assert (v_Exp106__2)
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            f_gen_store (v_st,v_Vpart_read103__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)))
          } else {
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            f_gen_store (v_st,v_Vpart_read103__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)))
          }
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read103__2), BigInt(32), BigInt(32)), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32))), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Vpart_read103__2), BigInt(0), BigInt(32)), f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))))
        } else {
          if (f_eq_bits(v_st, BigInt(2), BitVecLiteral(BigInt("11", 2), 2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)))) then {
            val v_Vpart_read132__2 : RTSym = f_decl_bv(v_st, "Vpart.read132__2", BigInt(64)) 
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            val v_Exp135__2 : Boolean = ((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) || ((( (!(f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))))) && (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1)))))) 
            assert (v_Exp135__2)
            if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
              assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
              f_gen_store (v_st,v_Vpart_read132__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)))
            } else {
              assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
              f_gen_store (v_st,v_Vpart_read132__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)))
            }
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_load(v_st, v_Vpart_read132__2), f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64))))
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
  }
}
