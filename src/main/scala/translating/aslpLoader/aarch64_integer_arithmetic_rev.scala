/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_integer_arithmetic_rev (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
    val v_Exp3__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2)) 
    if (v_Exp3__1) then {
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
        throw Exception("not supported")
      } else {
        val v_X_read4__2 : RTSym = f_decl_bv(v_st, "X.read4__2", BigInt(64)) 
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
          f_gen_store (v_st,v_X_read4__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
        } else {
          f_gen_store (v_st,v_X_read4__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
        }
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(56), BigInt(8), f_gen_append_bits(v_st, BigInt(48), BigInt(8), f_gen_append_bits(v_st, BigInt(40), BigInt(8), f_gen_append_bits(v_st, BigInt(32), BigInt(8), f_gen_append_bits(v_st, BigInt(24), BigInt(8), f_gen_append_bits(v_st, BigInt(16), BigInt(8), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_X_read4__2), BigInt(0), BigInt(8)), f_gen_slice(v_st, f_gen_load(v_st, v_X_read4__2), BigInt(8), BigInt(8))), f_gen_slice(v_st, f_gen_load(v_st, v_X_read4__2), BigInt(16), BigInt(8))), f_gen_slice(v_st, f_gen_load(v_st, v_X_read4__2), BigInt(24), BigInt(8))), f_gen_slice(v_st, f_gen_load(v_st, v_X_read4__2), BigInt(32), BigInt(8))), f_gen_slice(v_st, f_gen_load(v_st, v_X_read4__2), BigInt(40), BigInt(8))), f_gen_slice(v_st, f_gen_load(v_st, v_X_read4__2), BigInt(48), BigInt(8))), f_gen_slice(v_st, f_gen_load(v_st, v_X_read4__2), BigInt(56), BigInt(8))))
        }
      }
    } else {
      val v_Exp12__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2)) 
      if (v_Exp12__1) then {
        val v_X_read13__2 : RTSym = f_decl_bv(v_st, "X.read13__2", BigInt(64)) 
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
          f_gen_store (v_st,v_X_read13__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
        } else {
          f_gen_store (v_st,v_X_read13__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
        }
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(24), BigInt(40), f_gen_append_bits(v_st, BigInt(16), BigInt(8), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_X_read13__2), BigInt(32), BigInt(8)), f_gen_slice(v_st, f_gen_load(v_st, v_X_read13__2), BigInt(40), BigInt(8))), f_gen_slice(v_st, f_gen_load(v_st, v_X_read13__2), BigInt(48), BigInt(8))), f_gen_append_bits(v_st, BigInt(8), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_X_read13__2), BigInt(56), BigInt(8)), f_gen_append_bits(v_st, BigInt(24), BigInt(8), f_gen_append_bits(v_st, BigInt(16), BigInt(8), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_X_read13__2), BigInt(0), BigInt(8)), f_gen_slice(v_st, f_gen_load(v_st, v_X_read13__2), BigInt(8), BigInt(8))), f_gen_slice(v_st, f_gen_load(v_st, v_X_read13__2), BigInt(16), BigInt(8))), f_gen_slice(v_st, f_gen_load(v_st, v_X_read13__2), BigInt(24), BigInt(8))))))
        }
      } else {
        val v_Exp21__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2)) 
        if (v_Exp21__1) then {
          val v_X_read22__2 : RTSym = f_decl_bv(v_st, "X.read22__2", BigInt(64)) 
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
            f_gen_store (v_st,v_X_read22__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
          } else {
            f_gen_store (v_st,v_X_read22__2,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
          }
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(8), BigInt(56), f_gen_slice(v_st, f_gen_load(v_st, v_X_read22__2), BigInt(48), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(48), f_gen_slice(v_st, f_gen_load(v_st, v_X_read22__2), BigInt(56), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(40), f_gen_slice(v_st, f_gen_load(v_st, v_X_read22__2), BigInt(32), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_X_read22__2), BigInt(40), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(24), f_gen_slice(v_st, f_gen_load(v_st, v_X_read22__2), BigInt(16), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_X_read22__2), BigInt(24), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_X_read22__2), BigInt(0), BigInt(8)), f_gen_slice(v_st, f_gen_load(v_st, v_X_read22__2), BigInt(8), BigInt(8))))))))))
          }
        } else {
          throw Exception("not supported")
        }
      }
    }
  } else {
    val v_Exp31__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2)) 
    if (v_Exp31__1) then {
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(31),BigInt(1)), BitVecLiteral(BigInt("0", 2), 1))) then {
        throw Exception("not supported")
      } else {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_result__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(32)))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_bit_lit(v_st, BigInt(64), f_ZeroExtend(v_st, BigInt(32), BigInt(64), v_result__1.v, BigInt(64))))
        }
      }
    } else {
      val v_Exp40__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2)) 
      if (v_Exp40__1) then {
        val v_X_read41__2 : RTSym = f_decl_bv(v_st, "X.read41__2", BigInt(32)) 
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
          f_gen_store (v_st,v_X_read41__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
        } else {
          f_gen_store (v_st,v_X_read41__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
        }
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
          f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_append_bits(v_st, BigInt(24), BigInt(8), f_gen_append_bits(v_st, BigInt(16), BigInt(8), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_X_read41__2), BigInt(0), BigInt(8)), f_gen_slice(v_st, f_gen_load(v_st, v_X_read41__2), BigInt(8), BigInt(8))), f_gen_slice(v_st, f_gen_load(v_st, v_X_read41__2), BigInt(16), BigInt(8))), f_gen_slice(v_st, f_gen_load(v_st, v_X_read41__2), BigInt(24), BigInt(8))), f_gen_int_lit(v_st, BigInt(64))))
        }
      } else {
        val v_Exp49__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2)) 
        if (v_Exp49__1) then {
          val v_X_read50__2 : RTSym = f_decl_bv(v_st, "X.read50__2", BigInt(32)) 
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
            f_gen_store (v_st,v_X_read50__2,f_gen_slice(v_st, f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)))
          } else {
            f_gen_store (v_st,v_X_read50__2,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
          }
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BitVecLiteral(BigInt("11111", 2), 5))) then {
            f_gen_array_store (v_st,v__R.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(64), f_gen_append_bits(v_st, BigInt(8), BigInt(24), f_gen_slice(v_st, f_gen_load(v_st, v_X_read50__2), BigInt(16), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_X_read50__2), BigInt(24), BigInt(8)), f_gen_append_bits(v_st, BigInt(8), BigInt(8), f_gen_slice(v_st, f_gen_load(v_st, v_X_read50__2), BigInt(0), BigInt(8)), f_gen_slice(v_st, f_gen_load(v_st, v_X_read50__2), BigInt(8), BigInt(8))))), f_gen_int_lit(v_st, BigInt(64))))
          }
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
}
