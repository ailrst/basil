/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_float_compare_cond (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  val v_Exp3__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2)) 
  if (v_Exp3__1) then {
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp7__2 : RTSym = f_decl_bv(v_st, "Exp7__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp7__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp10__2 : RTSym = f_decl_bv(v_st, "Exp10__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp10__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
    val v_ConditionHolds11__2 : RTSym = f_decl_bool(v_st, "ConditionHolds11__2") 
    val v_result__2 : RTSym = f_decl_bool(v_st, "result__2") 
    if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("000", 2), 3))) then {
      f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
    } else {
      if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("001", 2), 3))) then {
        f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
      } else {
        if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("010", 2), 3))) then {
          f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
        } else {
          if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("011", 2), 3))) then {
            f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_V.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
          } else {
            if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("100", 2), 3))) then {
              f_gen_store (v_st,v_result__2,f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)))))
            } else {
              if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("101", 2), 3))) then {
                f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v)))
              } else {
                if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("110", 2), 3))) then {
                  f_gen_store (v_st,v_result__2,f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v)), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)))))
                } else {
                  if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("111", 2), 3))) then {
                    f_gen_store (v_st,v_result__2,f_gen_bool_lit(v_st, true))
                  } else {
                    throw Exception("not supported")
                  }
                }
              }
            }
          }
        }
      }
    }
    if (((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) && (f_ne_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(12),BigInt(4)), BitVecLiteral(BigInt("1111", 2), 4))))) then {
      f_gen_store (v_st,v_ConditionHolds11__2,f_gen_not_bool(v_st, f_gen_load(v_st, v_result__2)))
    } else {
      f_gen_store (v_st,v_ConditionHolds11__2,f_gen_load(v_st, v_result__2))
    }
    val v_temp0 = Mutable[RTLabel](rTLabelDefault)
    val v_temp1 = Mutable[RTLabel](rTLabelDefault)
    val v_temp2 = Mutable[RTLabel](rTLabelDefault)
    val (tmp281,tmp282,tmp283) = f_gen_branch(v_st, f_gen_load(v_st, v_ConditionHolds11__2)) 
    v_temp0.v = tmp281
    v_temp1.v = tmp282
    v_temp2.v = tmp283
    f_switch_context (v_st,v_temp0.v)
    val v_Exp30__2 : RTSym = f_decl_bv(v_st, "Exp30__2", BigInt(4)) 
    f_gen_store (v_st,v_Exp30__2,f_gen_FPCompare(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp10__2), BigInt(0), BigInt(16)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(4),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v)))
    f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp30__2), BigInt(0), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp30__2), BigInt(1), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp30__2), BigInt(2), BigInt(1)))
    f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp30__2), BigInt(3), BigInt(1)))
    f_switch_context (v_st,v_temp1.v)
    f_gen_store (v_st,v_PSTATE_V.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1))))
    f_gen_store (v_st,v_PSTATE_C.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(1),BigInt(1))))
    f_gen_store (v_st,v_PSTATE_Z.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(2),BigInt(1))))
    f_gen_store (v_st,v_PSTATE_N.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1))))
    f_switch_context (v_st,v_temp2.v)
  } else {
    val v_Exp31__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2)) 
    if (v_Exp31__1) then {
      throw Exception("not supported")
    } else {
      val v_Exp32__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2)) 
      if (v_Exp32__1) then {
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp35__2 : RTSym = f_decl_bv(v_st, "Exp35__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp35__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
        assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
        val v_Exp38__2 : RTSym = f_decl_bv(v_st, "Exp38__2", BigInt(128)) 
        f_gen_store (v_st,v_Exp38__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
        val v_ConditionHolds39__2 : RTSym = f_decl_bool(v_st, "ConditionHolds39__2") 
        val v_result__2 : RTSym = f_decl_bool(v_st, "result__2") 
        if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("000", 2), 3))) then {
          f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
        } else {
          if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("001", 2), 3))) then {
            f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
          } else {
            if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("010", 2), 3))) then {
              f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
            } else {
              if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("011", 2), 3))) then {
                f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_V.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
              } else {
                if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("100", 2), 3))) then {
                  f_gen_store (v_st,v_result__2,f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)))))
                } else {
                  if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("101", 2), 3))) then {
                    f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v)))
                  } else {
                    if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("110", 2), 3))) then {
                      f_gen_store (v_st,v_result__2,f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v)), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)))))
                    } else {
                      if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("111", 2), 3))) then {
                        f_gen_store (v_st,v_result__2,f_gen_bool_lit(v_st, true))
                      } else {
                        throw Exception("not supported")
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) && (f_ne_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(12),BigInt(4)), BitVecLiteral(BigInt("1111", 2), 4))))) then {
          f_gen_store (v_st,v_ConditionHolds39__2,f_gen_not_bool(v_st, f_gen_load(v_st, v_result__2)))
        } else {
          f_gen_store (v_st,v_ConditionHolds39__2,f_gen_load(v_st, v_result__2))
        }
        val v_temp3 = Mutable[RTLabel](rTLabelDefault)
        val v_temp4 = Mutable[RTLabel](rTLabelDefault)
        val v_temp5 = Mutable[RTLabel](rTLabelDefault)
        val (tmp284,tmp285,tmp286) = f_gen_branch(v_st, f_gen_load(v_st, v_ConditionHolds39__2)) 
        v_temp3.v = tmp284
        v_temp4.v = tmp285
        v_temp5.v = tmp286
        f_switch_context (v_st,v_temp3.v)
        val v_Exp58__2 : RTSym = f_decl_bv(v_st, "Exp58__2", BigInt(4)) 
        f_gen_store (v_st,v_Exp58__2,f_gen_FPCompare(v_st, BigInt(64), f_gen_slice(v_st, f_gen_load(v_st, v_Exp35__2), BigInt(0), BigInt(64)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp38__2), BigInt(0), BigInt(64)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(4),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v)))
        f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp58__2), BigInt(0), BigInt(1)))
        f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp58__2), BigInt(1), BigInt(1)))
        f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp58__2), BigInt(2), BigInt(1)))
        f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp58__2), BigInt(3), BigInt(1)))
        f_switch_context (v_st,v_temp4.v)
        f_gen_store (v_st,v_PSTATE_V.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1))))
        f_gen_store (v_st,v_PSTATE_C.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(1),BigInt(1))))
        f_gen_store (v_st,v_PSTATE_Z.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(2),BigInt(1))))
        f_gen_store (v_st,v_PSTATE_N.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1))))
        f_switch_context (v_st,v_temp5.v)
      } else {
        val v_Exp59__1 : Boolean = f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2)) 
        if (v_Exp59__1) then {
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp62__2 : RTSym = f_decl_bv(v_st, "Exp62__2", BigInt(128)) 
          f_gen_store (v_st,v_Exp62__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
          assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
          val v_Exp65__2 : RTSym = f_decl_bv(v_st, "Exp65__2", BigInt(128)) 
          f_gen_store (v_st,v_Exp65__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
          val v_ConditionHolds66__2 : RTSym = f_decl_bool(v_st, "ConditionHolds66__2") 
          val v_result__2 : RTSym = f_decl_bool(v_st, "result__2") 
          if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("000", 2), 3))) then {
            f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
          } else {
            if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("001", 2), 3))) then {
              f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
            } else {
              if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("010", 2), 3))) then {
                f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
              } else {
                if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("011", 2), 3))) then {
                  f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_V.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
                } else {
                  if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("100", 2), 3))) then {
                    f_gen_store (v_st,v_result__2,f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_C.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)))))
                  } else {
                    if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("101", 2), 3))) then {
                      f_gen_store (v_st,v_result__2,f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v)))
                    } else {
                      if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("110", 2), 3))) then {
                        f_gen_store (v_st,v_result__2,f_gen_and_bool(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_N.v), f_gen_load(v_st, v_PSTATE_V.v)), f_gen_eq_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_Z.v), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)))))
                      } else {
                        if (f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(13),BigInt(3)), BitVecLiteral(BigInt("111", 2), 3))) then {
                          f_gen_store (v_st,v_result__2,f_gen_bool_lit(v_st, true))
                        } else {
                          throw Exception("not supported")
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if (((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(12),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) && (f_ne_bits(v_st, BigInt(4), bvextract(v_st,v_enc,BigInt(12),BigInt(4)), BitVecLiteral(BigInt("1111", 2), 4))))) then {
            f_gen_store (v_st,v_ConditionHolds66__2,f_gen_not_bool(v_st, f_gen_load(v_st, v_result__2)))
          } else {
            f_gen_store (v_st,v_ConditionHolds66__2,f_gen_load(v_st, v_result__2))
          }
          val v_temp6 = Mutable[RTLabel](rTLabelDefault)
          val v_temp7 = Mutable[RTLabel](rTLabelDefault)
          val v_temp8 = Mutable[RTLabel](rTLabelDefault)
          val (tmp287,tmp288,tmp289) = f_gen_branch(v_st, f_gen_load(v_st, v_ConditionHolds66__2)) 
          v_temp6.v = tmp287
          v_temp7.v = tmp288
          v_temp8.v = tmp289
          f_switch_context (v_st,v_temp6.v)
          val v_Exp85__2 : RTSym = f_decl_bv(v_st, "Exp85__2", BigInt(4)) 
          f_gen_store (v_st,v_Exp85__2,f_gen_FPCompare(v_st, BigInt(32), f_gen_slice(v_st, f_gen_load(v_st, v_Exp62__2), BigInt(0), BigInt(32)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp65__2), BigInt(0), BigInt(32)), f_gen_bool_lit(v_st, f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(4),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))), f_gen_load(v_st, v_FPCR.v)))
          f_gen_store (v_st,v_PSTATE_V.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp85__2), BigInt(0), BigInt(1)))
          f_gen_store (v_st,v_PSTATE_C.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp85__2), BigInt(1), BigInt(1)))
          f_gen_store (v_st,v_PSTATE_Z.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp85__2), BigInt(2), BigInt(1)))
          f_gen_store (v_st,v_PSTATE_N.v,f_gen_slice(v_st, f_gen_load(v_st, v_Exp85__2), BigInt(3), BigInt(1)))
          f_switch_context (v_st,v_temp7.v)
          f_gen_store (v_st,v_PSTATE_V.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(0),BigInt(1))))
          f_gen_store (v_st,v_PSTATE_C.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(1),BigInt(1))))
          f_gen_store (v_st,v_PSTATE_Z.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(2),BigInt(1))))
          f_gen_store (v_st,v_PSTATE_N.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(3),BigInt(1))))
          f_switch_context (v_st,v_temp8.v)
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
}
