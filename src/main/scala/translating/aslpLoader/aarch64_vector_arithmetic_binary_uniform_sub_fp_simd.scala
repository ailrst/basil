/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_sub_fp_simd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(2), f_append_bits(v_st, BigInt(1), BigInt(1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)), bvextract(v_st,v_enc,BigInt(30),BigInt(1))), BitVecLiteral(BigInt("10", 2), 2))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp7__2 : RTSym = f_decl_bv(v_st, "Exp7__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp7__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp10__2 : RTSym = f_decl_bv(v_st, "Exp10__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp10__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
        val v_Exp14__2 : RTSym = f_decl_bv(v_st, "Exp14__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp14__2,f_gen_FPSub(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If16__1 : RTSym = f_decl_bv(v_st, "If16__1", BigInt(32)) 
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
          f_gen_store (v_st,v_If16__1,f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp14__2), BigInt(0), BigInt(31))))
        } else {
          f_gen_store (v_st,v_If16__1,f_gen_load(v_st, v_Exp14__2))
        }
        val v_Exp21__2 : RTSym = f_decl_bv(v_st, "Exp21__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp21__2,f_gen_FPSub(v_st, BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(32), BigInt(32)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp10__2), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If22__1 : RTSym = f_decl_bv(v_st, "If22__1", BigInt(32)) 
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
          f_gen_store (v_st,v_If22__1,f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp21__2), BigInt(0), BigInt(31))))
        } else {
          f_gen_store (v_st,v_If22__1,f_gen_load(v_st, v_Exp21__2))
        }
        val v_Exp27__2 : RTSym = f_decl_bv(v_st, "Exp27__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp27__2,f_gen_FPSub(v_st, BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(64), BigInt(32)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp10__2), BigInt(64), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If28__1 : RTSym = f_decl_bv(v_st, "If28__1", BigInt(32)) 
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
          f_gen_store (v_st,v_If28__1,f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp27__2), BigInt(0), BigInt(31))))
        } else {
          f_gen_store (v_st,v_If28__1,f_gen_load(v_st, v_Exp27__2))
        }
        val v_Exp33__2 : RTSym = f_decl_bv(v_st, "Exp33__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp33__2,f_gen_FPSub(v_st, BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(96), BigInt(32)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp10__2), BigInt(96), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If34__1 : RTSym = f_decl_bv(v_st, "If34__1", BigInt(32)) 
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
          f_gen_store (v_st,v_If34__1,f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp33__2), BigInt(0), BigInt(31))))
        } else {
          f_gen_store (v_st,v_If34__1,f_gen_load(v_st, v_Exp33__2))
        }
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(32), BigInt(96), f_gen_load(v_st, v_If34__1), f_gen_append_bits(v_st, BigInt(32), BigInt(64), f_gen_load(v_st, v_If28__1), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_If22__1), f_gen_load(v_st, v_If16__1)))))
      } else {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp44__2 : RTSym = f_decl_bv(v_st, "Exp44__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp44__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp47__2 : RTSym = f_decl_bv(v_st, "Exp47__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp47__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
        val v_Exp51__2 : RTSym = f_decl_bv(v_st, "Exp51__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp51__2,f_gen_FPSub(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If53__1 : RTSym = f_decl_bv(v_st, "If53__1", BigInt(32)) 
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
          f_gen_store (v_st,v_If53__1,f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp51__2), BigInt(0), BigInt(31))))
        } else {
          f_gen_store (v_st,v_If53__1,f_gen_load(v_st, v_Exp51__2))
        }
        val v_Exp58__2 : RTSym = f_decl_bv(v_st, "Exp58__2", BigInt(32)) 
        f_gen_store (v_st,v_Exp58__2,f_gen_FPSub(v_st, BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Exp44__2), BigInt(32), BigInt(32)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp47__2), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        val v_If59__1 : RTSym = f_decl_bv(v_st, "If59__1", BigInt(32)) 
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
          f_gen_store (v_st,v_If59__1,f_gen_append_bits(v_st, BigInt(1), BigInt(31), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp58__2), BigInt(0), BigInt(31))))
        } else {
          f_gen_store (v_st,v_If59__1,f_gen_load(v_st, v_Exp58__2))
        }
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(32), BigInt(32), f_gen_load(v_st, v_If59__1), f_gen_load(v_st, v_If53__1)), f_gen_int_lit(v_st, BigInt(128))))
      }
    } else {
      if (f_eq_bits(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp70__2 : RTSym = f_decl_bv(v_st, "Exp70__2", BigInt(128)) 
          f_gen_store (v_st,v_Exp70__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp73__2 : RTSym = f_decl_bv(v_st, "Exp73__2", BigInt(128)) 
          f_gen_store (v_st,v_Exp73__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
          val v_Exp77__2 : RTSym = f_decl_bv(v_st, "Exp77__2", BigInt(64)) 
          f_gen_store (v_st,v_Exp77__2,f_gen_FPSub(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
          val v_If79__1 : RTSym = f_decl_bv(v_st, "If79__1", BigInt(64)) 
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
            f_gen_store (v_st,v_If79__1,f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp77__2), BigInt(0), BigInt(63))))
          } else {
            f_gen_store (v_st,v_If79__1,f_gen_load(v_st, v_Exp77__2))
          }
          val v_Exp84__2 : RTSym = f_decl_bv(v_st, "Exp84__2", BigInt(64)) 
          f_gen_store (v_st,v_Exp84__2,f_gen_FPSub(v_st, BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_Exp70__2), BigInt(64), BigInt(64)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp73__2), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
          val v_If85__1 : RTSym = f_decl_bv(v_st, "If85__1", BigInt(64)) 
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
            f_gen_store (v_st,v_If85__1,f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp84__2), BigInt(0), BigInt(63))))
          } else {
            f_gen_store (v_st,v_If85__1,f_gen_load(v_st, v_Exp84__2))
          }
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(64), BigInt(64), f_gen_load(v_st, v_If85__1), f_gen_load(v_st, v_If79__1)))
        } else {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp102__2 : RTSym = f_decl_bv(v_st, "Exp102__2", BigInt(64)) 
          f_gen_store (v_st,v_Exp102__2,f_gen_FPSub(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
          val v_If104__1 : RTSym = f_decl_bv(v_st, "If104__1", BigInt(64)) 
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
            f_gen_store (v_st,v_If104__1,f_gen_append_bits(v_st, BigInt(1), BigInt(63), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp102__2), BigInt(0), BigInt(63))))
          } else {
            f_gen_store (v_st,v_If104__1,f_gen_load(v_st, v_Exp102__2))
          }
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_If104__1), f_gen_int_lit(v_st, BigInt(128))))
        }
      } else {
        throw Exception("not supported")
      }
    }
  }
}
