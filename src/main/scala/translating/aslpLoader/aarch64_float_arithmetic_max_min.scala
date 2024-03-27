/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_float_arithmetic_max_min (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_Exp4__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2)) 
  if (v_Exp4__1) then {
    val v_operation__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(2)))
    if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(12),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2))) then {
      v_operation__1.v = BitVecLiteral(BigInt("00", 2), 2)
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(12),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2))) then {
        v_operation__1.v = BitVecLiteral(BigInt("01", 2), 2)
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(12),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2))) then {
          v_operation__1.v = BitVecLiteral(BigInt("10", 2), 2)
        } else {
          if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(12),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
            v_operation__1.v = BitVecLiteral(BigInt("11", 2), 2)
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
    val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(16)) 
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    if (f_eq_bits(v_st, BigInt(2), v_operation__1.v, BitVecLiteral(BigInt("00", 2), 2))) then {
      val v_Exp14__2 : RTSym = f_decl_bv(v_st, "Exp14__2", BigInt(16)) 
      f_gen_store (v_st,v_Exp14__2,f_gen_FPMax(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
      f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_Exp14__2))
    } else {
      if (f_eq_bits(v_st, BigInt(2), v_operation__1.v, BitVecLiteral(BigInt("01", 2), 2))) then {
        val v_Exp16__2 : RTSym = f_decl_bv(v_st, "Exp16__2", BigInt(16)) 
        f_gen_store (v_st,v_Exp16__2,f_gen_FPMin(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
        f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_Exp16__2))
      } else {
        if (f_eq_bits(v_st, BigInt(2), v_operation__1.v, BitVecLiteral(BigInt("10", 2), 2))) then {
          val v_Exp18__2 : RTSym = f_decl_bv(v_st, "Exp18__2", BigInt(16)) 
          f_gen_store (v_st,v_Exp18__2,f_gen_FPMaxNum(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
          f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_Exp18__2))
        } else {
          if (f_eq_bits(v_st, BigInt(2), v_operation__1.v, BitVecLiteral(BigInt("11", 2), 2))) then {
            val v_Exp20__2 : RTSym = f_decl_bv(v_st, "Exp20__2", BigInt(16)) 
            f_gen_store (v_st,v_Exp20__2,f_gen_FPMinNum(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
            f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_Exp20__2))
          } else {
            throw Exception("not supported")
          }
        }
      }
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
  } else {
    val v_Exp27__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2)) 
    if (v_Exp27__1) then {
      throw Exception("not supported")
    } else {
      val v_Exp28__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2)) 
      if (v_Exp28__1) then {
        val v_operation__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(2)))
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(12),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2))) then {
          v_operation__1.v = BitVecLiteral(BigInt("00", 2), 2)
        } else {
          if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(12),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2))) then {
            v_operation__1.v = BitVecLiteral(BigInt("01", 2), 2)
          } else {
            if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(12),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2))) then {
              v_operation__1.v = BitVecLiteral(BigInt("10", 2), 2)
            } else {
              if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(12),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
                v_operation__1.v = BitVecLiteral(BigInt("11", 2), 2)
              } else {
                throw Exception("not supported")
              }
            }
          }
        }
        val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(64)) 
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        if (f_eq_bits(v_st, BigInt(2), v_operation__1.v, BitVecLiteral(BigInt("00", 2), 2))) then {
          val v_Exp37__2 : RTSym = f_decl_bv(v_st, "Exp37__2", BigInt(64)) 
          f_gen_store (v_st,v_Exp37__2,f_gen_FPMax(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
          f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_Exp37__2))
        } else {
          if (f_eq_bits(v_st, BigInt(2), v_operation__1.v, BitVecLiteral(BigInt("01", 2), 2))) then {
            val v_Exp39__2 : RTSym = f_decl_bv(v_st, "Exp39__2", BigInt(64)) 
            f_gen_store (v_st,v_Exp39__2,f_gen_FPMin(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
            f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_Exp39__2))
          } else {
            if (f_eq_bits(v_st, BigInt(2), v_operation__1.v, BitVecLiteral(BigInt("10", 2), 2))) then {
              val v_Exp41__2 : RTSym = f_decl_bv(v_st, "Exp41__2", BigInt(64)) 
              f_gen_store (v_st,v_Exp41__2,f_gen_FPMaxNum(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
              f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_Exp41__2))
            } else {
              if (f_eq_bits(v_st, BigInt(2), v_operation__1.v, BitVecLiteral(BigInt("11", 2), 2))) then {
                val v_Exp43__2 : RTSym = f_decl_bv(v_st, "Exp43__2", BigInt(64)) 
                f_gen_store (v_st,v_Exp43__2,f_gen_FPMinNum(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v)))
                f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_Exp43__2))
              } else {
                throw Exception("not supported")
              }
            }
          }
        }
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
      } else {
        val v_Exp50__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2)) 
        if (v_Exp50__1) then {
          val v_operation__1 = Mutable[BitVecLiteral](BitVecLiteral(0, BigInt(2)))
          if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(12),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2))) then {
            v_operation__1.v = BitVecLiteral(BigInt("00", 2), 2)
          } else {
            if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(12),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2))) then {
              v_operation__1.v = BitVecLiteral(BigInt("01", 2), 2)
            } else {
              if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(12),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2))) then {
                v_operation__1.v = BitVecLiteral(BigInt("10", 2), 2)
              } else {
                if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(12),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
                  v_operation__1.v = BitVecLiteral(BigInt("11", 2), 2)
                } else {
                  throw Exception("not supported")
                }
              }
            }
          }
          val v_result__1 : RTSym = f_decl_bv(v_st, "result__1", BigInt(32)) 
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          if (f_eq_bits(v_st, BigInt(2), v_operation__1.v, BitVecLiteral(BigInt("00", 2), 2))) then {
            val v_Exp59__2 : RTSym = f_decl_bv(v_st, "Exp59__2", BigInt(32)) 
            f_gen_store (v_st,v_Exp59__2,f_gen_FPMax(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
            f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_Exp59__2))
          } else {
            if (f_eq_bits(v_st, BigInt(2), v_operation__1.v, BitVecLiteral(BigInt("01", 2), 2))) then {
              val v_Exp61__2 : RTSym = f_decl_bv(v_st, "Exp61__2", BigInt(32)) 
              f_gen_store (v_st,v_Exp61__2,f_gen_FPMin(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
              f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_Exp61__2))
            } else {
              if (f_eq_bits(v_st, BigInt(2), v_operation__1.v, BitVecLiteral(BigInt("10", 2), 2))) then {
                val v_Exp63__2 : RTSym = f_decl_bv(v_st, "Exp63__2", BigInt(32)) 
                f_gen_store (v_st,v_Exp63__2,f_gen_FPMaxNum(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
                f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_Exp63__2))
              } else {
                if (f_eq_bits(v_st, BigInt(2), v_operation__1.v, BitVecLiteral(BigInt("11", 2), 2))) then {
                  val v_Exp65__2 : RTSym = f_decl_bv(v_st, "Exp65__2", BigInt(32)) 
                  f_gen_store (v_st,v_Exp65__2,f_gen_FPMinNum(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v)))
                  f_gen_store (v_st,v_result__1,f_gen_load(v_st, v_Exp65__2))
                } else {
                  throw Exception("not supported")
                }
              }
            }
          }
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), f_gen_load(v_st, v_result__1), f_gen_int_lit(v_st, BigInt(128))))
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
}
