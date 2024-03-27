/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_reduce_fp_max_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
    val v_If4__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(3)))
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      v_If4__1.v = BitVecLiteral(BigInt("010", 2), 3)
    } else {
      v_If4__1.v = BitVecLiteral(BigInt("011", 2), 3)
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_result__2 : RTSym = f_decl_bv(v_st, "result__2", BigInt(32)) 
    if (f_eq_bits(v_st, BigInt(3), v_If4__1.v, BitVecLiteral(BigInt("000", 2), 3))) then {
      val v_Exp12__3 : RTSym = f_decl_bv(v_st, "Exp12__3", BigInt(32)) 
      f_gen_store (v_st,v_Exp12__3,f_gen_FPMinNum(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
      f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_Exp12__3))
    } else {
      if (f_eq_bits(v_st, BigInt(3), v_If4__1.v, BitVecLiteral(BigInt("001", 2), 3))) then {
        val v_Exp14__3 : RTSym = f_decl_bv(v_st, "Exp14__3", BigInt(32)) 
        f_gen_store (v_st,v_Exp14__3,f_gen_FPMaxNum(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
        f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_Exp14__3))
      } else {
        if (f_eq_bits(v_st, BigInt(3), v_If4__1.v, BitVecLiteral(BigInt("010", 2), 3))) then {
          val v_Exp16__3 : RTSym = f_decl_bv(v_st, "Exp16__3", BigInt(32)) 
          f_gen_store (v_st,v_Exp16__3,f_gen_FPMin(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
          f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_Exp16__3))
        } else {
          if (f_eq_bits(v_st, BigInt(3), v_If4__1.v, BitVecLiteral(BigInt("011", 2), 3))) then {
            val v_Exp18__3 : RTSym = f_decl_bv(v_st, "Exp18__3", BigInt(32)) 
            f_gen_store (v_st,v_Exp18__3,f_gen_FPMax(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
            f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_Exp18__3))
          } else {
            if (f_eq_bits(v_st, BigInt(3), v_If4__1.v, BitVecLiteral(BigInt("100", 2), 3))) then {
              val v_Exp20__3 : RTSym = f_decl_bv(v_st, "Exp20__3", BigInt(32)) 
              f_gen_store (v_st,v_Exp20__3,f_gen_FPAdd(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
              f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_Exp20__3))
            } else {
              if (f_eq_bits(v_st, BigInt(3), v_If4__1.v, BitVecLiteral(BigInt("101", 2), 3))) then {
                f_gen_store (v_st,v_result__2,f_gen_add_bits(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(32), BigInt(32))))
              } else {
                throw Exception("not supported")
              }
            }
          }
        }
      }
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_result__2), f_gen_int_lit(v_st, BigInt(128))))
  } else {
    if (f_eq_bits(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1), bvextract(v_st,v_enc,BigInt(22),BigInt(1)))) then {
      val v_If28__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(3)))
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(23),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
        v_If28__1.v = BitVecLiteral(BigInt("010", 2), 3)
      } else {
        v_If28__1.v = BitVecLiteral(BigInt("011", 2), 3)
      }
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      val v_result__2 : RTSym = f_decl_bv(v_st, "result__2", BigInt(64)) 
      if (f_eq_bits(v_st, BigInt(3), v_If28__1.v, BitVecLiteral(BigInt("000", 2), 3))) then {
        val v_Exp36__3 : RTSym = f_decl_bv(v_st, "Exp36__3", BigInt(64)) 
        f_gen_store (v_st,v_Exp36__3,f_gen_FPMinNum(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
        f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_Exp36__3))
      } else {
        if (f_eq_bits(v_st, BigInt(3), v_If28__1.v, BitVecLiteral(BigInt("001", 2), 3))) then {
          val v_Exp38__3 : RTSym = f_decl_bv(v_st, "Exp38__3", BigInt(64)) 
          f_gen_store (v_st,v_Exp38__3,f_gen_FPMaxNum(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
          f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_Exp38__3))
        } else {
          if (f_eq_bits(v_st, BigInt(3), v_If28__1.v, BitVecLiteral(BigInt("010", 2), 3))) then {
            val v_Exp40__3 : RTSym = f_decl_bv(v_st, "Exp40__3", BigInt(64)) 
            f_gen_store (v_st,v_Exp40__3,f_gen_FPMin(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
            f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_Exp40__3))
          } else {
            if (f_eq_bits(v_st, BigInt(3), v_If28__1.v, BitVecLiteral(BigInt("011", 2), 3))) then {
              val v_Exp42__3 : RTSym = f_decl_bv(v_st, "Exp42__3", BigInt(64)) 
              f_gen_store (v_st,v_Exp42__3,f_gen_FPMax(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
              f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_Exp42__3))
            } else {
              if (f_eq_bits(v_st, BigInt(3), v_If28__1.v, BitVecLiteral(BigInt("100", 2), 3))) then {
                val v_Exp44__3 : RTSym = f_decl_bv(v_st, "Exp44__3", BigInt(64)) 
                f_gen_store (v_st,v_Exp44__3,f_gen_FPAdd(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
                f_gen_store (v_st,v_result__2,f_gen_load(v_st, v_Exp44__3))
              } else {
                if (f_eq_bits(v_st, BigInt(3), v_If28__1.v, BitVecLiteral(BigInt("101", 2), 3))) then {
                  f_gen_store (v_st,v_result__2,f_gen_add_bits(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(64), BigInt(64))))
                } else {
                  throw Exception("not supported")
                }
              }
            }
          }
        }
      }
      assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_result__2), f_gen_int_lit(v_st, BigInt(128))))
    } else {
      throw Exception("not supported")
    }
  }
}
