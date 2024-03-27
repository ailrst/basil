/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_logical_bsl_eor (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
    val v_op__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(2)))
    if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2))) then {
      v_op__1.v = BitVecLiteral(BigInt("11", 2), 2)
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2))) then {
        v_op__1.v = BitVecLiteral(BigInt("10", 2), 2)
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2))) then {
          v_op__1.v = BitVecLiteral(BigInt("01", 2), 2)
        } else {
          if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
            v_op__1.v = BitVecLiteral(BigInt("00", 2), 2)
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
    val v_operand1__1 : RTSym = f_decl_bv(v_st, "operand1__1", BigInt(128)) 
    val v_operand2__1 : RTSym = f_decl_bv(v_st, "operand2__1", BigInt(128)) 
    val v_operand3__1 : RTSym = f_decl_bv(v_st, "operand3__1", BigInt(128)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp6__2 : RTSym = f_decl_bv(v_st, "Exp6__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp6__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    if (f_eq_bits(v_st, BigInt(2), v_op__1.v, BitVecLiteral(BigInt("11", 2), 2))) then {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_store (v_st,v_operand1__1,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
      f_gen_store (v_st,v_operand2__1,f_gen_bit_lit(v_st, BigInt(128), BitVecLiteral(BigInt("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 2), 128)))
      f_gen_store (v_st,v_operand3__1,f_gen_bit_lit(v_st, BigInt(128), BitVecLiteral(BigInt("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 2), 128)))
    } else {
      if (f_eq_bits(v_st, BigInt(2), v_op__1.v, BitVecLiteral(BigInt("10", 2), 2))) then {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp15__2 : RTSym = f_decl_bv(v_st, "Exp15__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp15__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
        f_gen_store (v_st,v_operand1__1,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
        f_gen_store (v_st,v_operand2__1,f_gen_load(v_st, v_Exp15__2))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_store (v_st,v_operand3__1,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))))
      } else {
        if (f_eq_bits(v_st, BigInt(2), v_op__1.v, BitVecLiteral(BigInt("01", 2), 2))) then {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp21__2 : RTSym = f_decl_bv(v_st, "Exp21__2", BigInt(128)) 
          f_gen_store (v_st,v_Exp21__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))))
          f_gen_store (v_st,v_operand1__1,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))))
          f_gen_store (v_st,v_operand2__1,f_gen_load(v_st, v_Exp21__2))
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_store (v_st,v_operand3__1,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
        } else {
          if (f_eq_bits(v_st, BigInt(2), v_op__1.v, BitVecLiteral(BigInt("00", 2), 2))) then {
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            val v_Exp27__2 : RTSym = f_decl_bv(v_st, "Exp27__2", BigInt(128)) 
            f_gen_store (v_st,v_Exp27__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))))
            f_gen_store (v_st,v_operand1__1,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))))
            f_gen_store (v_st,v_operand2__1,f_gen_load(v_st, v_Exp27__2))
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            f_gen_store (v_st,v_operand3__1,f_gen_not_bits(v_st, BigInt(128), f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5))))))
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_eor_bits(v_st, BigInt(128), f_gen_load(v_st, v_operand1__1), f_gen_and_bits(v_st, BigInt(128), f_gen_eor_bits(v_st, BigInt(128), f_gen_load(v_st, v_operand2__1), f_gen_load(v_st, v_Exp6__2)), f_gen_load(v_st, v_operand3__1))))
  } else {
    val v_op__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(2)))
    if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2))) then {
      v_op__1.v = BitVecLiteral(BigInt("11", 2), 2)
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2))) then {
        v_op__1.v = BitVecLiteral(BigInt("10", 2), 2)
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2))) then {
          v_op__1.v = BitVecLiteral(BigInt("01", 2), 2)
        } else {
          if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
            v_op__1.v = BitVecLiteral(BigInt("00", 2), 2)
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
    val v_operand1__1 : RTSym = f_decl_bv(v_st, "operand1__1", BigInt(64)) 
    val v_operand2__1 : RTSym = f_decl_bv(v_st, "operand2__1", BigInt(64)) 
    val v_operand3__1 : RTSym = f_decl_bv(v_st, "operand3__1", BigInt(64)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp41__2 : RTSym = f_decl_bv(v_st, "Exp41__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp41__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    if (f_eq_bits(v_st, BigInt(2), v_op__1.v, BitVecLiteral(BigInt("11", 2), 2))) then {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_store (v_st,v_operand1__1,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)))
      f_gen_store (v_st,v_operand2__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
      f_gen_store (v_st,v_operand3__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("1111111111111111111111111111111111111111111111111111111111111111", 2), 64)))
    } else {
      if (f_eq_bits(v_st, BigInt(2), v_op__1.v, BitVecLiteral(BigInt("10", 2), 2))) then {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp50__2 : RTSym = f_decl_bv(v_st, "Exp50__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp50__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
        f_gen_store (v_st,v_operand1__1,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)))
        f_gen_store (v_st,v_operand2__1,f_gen_slice(v_st, f_gen_load(v_st, v_Exp50__2), BigInt(0), BigInt(64)))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_store (v_st,v_operand3__1,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64)))
      } else {
        if (f_eq_bits(v_st, BigInt(2), v_op__1.v, BitVecLiteral(BigInt("01", 2), 2))) then {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp56__2 : RTSym = f_decl_bv(v_st, "Exp56__2", BigInt(128)) 
          f_gen_store (v_st,v_Exp56__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))))
          f_gen_store (v_st,v_operand1__1,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64)))
          f_gen_store (v_st,v_operand2__1,f_gen_slice(v_st, f_gen_load(v_st, v_Exp56__2), BigInt(0), BigInt(64)))
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_store (v_st,v_operand3__1,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)))
        } else {
          if (f_eq_bits(v_st, BigInt(2), v_op__1.v, BitVecLiteral(BigInt("00", 2), 2))) then {
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            val v_Exp62__2 : RTSym = f_decl_bv(v_st, "Exp62__2", BigInt(128)) 
            f_gen_store (v_st,v_Exp62__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))))
            f_gen_store (v_st,v_operand1__1,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(64)))
            f_gen_store (v_st,v_operand2__1,f_gen_slice(v_st, f_gen_load(v_st, v_Exp62__2), BigInt(0), BigInt(64)))
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            f_gen_store (v_st,v_operand3__1,f_gen_not_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64))))
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_eor_bits(v_st, BigInt(64), f_gen_load(v_st, v_operand1__1), f_gen_and_bits(v_st, BigInt(64), f_gen_eor_bits(v_st, BigInt(64), f_gen_load(v_st, v_operand2__1), f_gen_slice(v_st, f_gen_load(v_st, v_Exp41__2), BigInt(0), BigInt(64))), f_gen_load(v_st, v_operand3__1))), f_gen_int_lit(v_st, BigInt(128))))
  }
}
