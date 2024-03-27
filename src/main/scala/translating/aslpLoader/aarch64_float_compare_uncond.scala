/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_float_compare_uncond (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_Exp3__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2)) 
  if (v_Exp3__1) then {
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp7__2 : RTSym = f_decl_bv(v_st, "Exp7__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp7__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    val v_If8__1 : RTSym = f_decl_bv(v_st, "If8__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If8__1,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
    } else {
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_store (v_st,v_If8__1,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)))
    }
    val v_Exp16__2 : RTSym = f_decl_bv(v_st, "Exp16__2", BigInt(4)) 
    f_gen_store (v_st,v_Exp16__2,f_gen_FPCompare(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(0), BigInt(16)), f_gen_load(v_st, v_If8__1), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(4),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v)))
    f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp16__2), BigInt(0), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp16__2), BigInt(1), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp16__2), BigInt(2), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp16__2), BigInt(3), BigInt(1)))
  } else {
    val v_Exp17__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2)) 
    if (v_Exp17__1) then {
      throw Exception("not supported")
    } else {
      val v_Exp18__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2)) 
      if (v_Exp18__1) then {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp21__2 : RTSym = f_decl_bv(v_st, "Exp21__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp21__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
        val v_If22__1 : RTSym = f_decl_bv(v_st, "If22__1", BigInt(64)) 
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
          f_gen_store (v_st,v_If22__1,f_gen_bit_lit(v_st, BigInt(64), BitVecLiteral(BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2), 64)))
        } else {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_store (v_st,v_If22__1,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)))
        }
        val v_Exp30__2 : RTSym = f_decl_bv(v_st, "Exp30__2", BigInt(4)) 
        f_gen_store (v_st,v_Exp30__2,f_gen_FPCompare(v_st, BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_Exp21__2), BigInt(0), BigInt(64)), f_gen_load(v_st, v_If22__1), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(4),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v)))
        f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp30__2), BigInt(0), BigInt(1)))
        f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp30__2), BigInt(1), BigInt(1)))
        f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp30__2), BigInt(2), BigInt(1)))
        f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp30__2), BigInt(3), BigInt(1)))
      } else {
        val v_Exp31__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2)) 
        if (v_Exp31__1) then {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp34__2 : RTSym = f_decl_bv(v_st, "Exp34__2", BigInt(128)) 
          f_gen_store (v_st,v_Exp34__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
          val v_If35__1 : RTSym = f_decl_bv(v_st, "If35__1", BigInt(32)) 
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
            f_gen_store (v_st,v_If35__1,f_gen_bit_lit(v_st, BigInt(32), BitVecLiteral(BigInt("00000000000000000000000000000000", 2), 32)))
          } else {
            assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
            f_gen_store (v_st,v_If35__1,f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))
          }
          val v_Exp43__2 : RTSym = f_decl_bv(v_st, "Exp43__2", BigInt(4)) 
          f_gen_store (v_st,v_Exp43__2,f_gen_FPCompare(v_st, BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Exp34__2), BigInt(0), BigInt(32)), f_gen_load(v_st, v_If35__1), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(4),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v)))
          f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp43__2), BigInt(0), BigInt(1)))
          f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp43__2), BigInt(1), BigInt(1)))
          f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp43__2), BigInt(2), BigInt(1)))
          f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp43__2), BigInt(3), BigInt(1)))
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
}
