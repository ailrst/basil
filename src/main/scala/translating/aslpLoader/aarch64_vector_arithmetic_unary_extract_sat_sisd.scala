/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_extract_sat_sisd (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
      val v_If9__2 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        v_If9__2.v = f_gen_ZeroExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))
      } else {
        v_If9__2.v = f_gen_SignExtend(v_st, BigInt(16), BigInt(17), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_int_lit(v_st, BigInt(17)))
      }
      val v_SatQ12__2 = Mutable[Expr](rTExprDefault)
      val v_SatQ13__2 = Mutable[Expr](rTExprDefault)
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
        val v_UnsignedSatQ14__3 : RTSym = f_decl_bv(v_st, "UnsignedSatQ14__3", BigInt(8)) 
        val v_UnsignedSatQ15__3 : RTSym = f_decl_bool(v_st, "UnsignedSatQ15__3") 
        val v_temp0 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000011111111", 2))), v_If9__2.v)) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp0))
        f_gen_store (v_st,v_UnsignedSatQ14__3,f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("11111111", 2))))
        f_gen_store (v_st,v_UnsignedSatQ15__3,f_gen_bool_lit(v_st, true))
        f_switch_context (v_st,f_false_branch(v_st, v_temp0))
        val v_temp1 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(17), v_If9__2.v, f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000000000000", 2))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp1))
        f_gen_store (v_st,v_UnsignedSatQ14__3,f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("00000000", 2))))
        f_gen_store (v_st,v_UnsignedSatQ15__3,f_gen_bool_lit(v_st, true))
        f_switch_context (v_st,f_false_branch(v_st, v_temp1))
        f_gen_store (v_st,v_UnsignedSatQ14__3,f_gen_slice(v_st, v_If9__2.v, BigInt(0), BigInt(8)))
        f_gen_store (v_st,v_UnsignedSatQ15__3,f_gen_bool_lit(v_st, false))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
        v_SatQ12__2.v = f_gen_load(v_st, v_UnsignedSatQ14__3)
        v_SatQ13__2.v = f_gen_load(v_st, v_UnsignedSatQ15__3)
      } else {
        val v_SignedSatQ20__3 : RTSym = f_decl_bv(v_st, "SignedSatQ20__3", BigInt(8)) 
        val v_SignedSatQ21__3 : RTSym = f_decl_bool(v_st, "SignedSatQ21__3") 
        val v_temp2 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(17), f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("00000000001111111", 2))), v_If9__2.v)) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp2))
        f_gen_store (v_st,v_SignedSatQ20__3,f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("01111111", 2))))
        f_gen_store (v_st,v_SignedSatQ21__3,f_gen_bool_lit(v_st, true))
        f_switch_context (v_st,f_false_branch(v_st, v_temp2))
        val v_temp3 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(17), v_If9__2.v, f_gen_bit_lit(v_st, BigInt(17), mkBits(v_st, 17, BigInt("11111111110000000", 2))))) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp3))
        f_gen_store (v_st,v_SignedSatQ20__3,f_gen_bit_lit(v_st, BigInt(8), mkBits(v_st, 8, BigInt("10000000", 2))))
        f_gen_store (v_st,v_SignedSatQ21__3,f_gen_bool_lit(v_st, true))
        f_switch_context (v_st,f_false_branch(v_st, v_temp3))
        f_gen_store (v_st,v_SignedSatQ20__3,f_gen_slice(v_st, v_If9__2.v, BigInt(0), BigInt(8)))
        f_gen_store (v_st,v_SignedSatQ21__3,f_gen_bool_lit(v_st, false))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp2))
        v_SatQ12__2.v = f_gen_load(v_st, v_SignedSatQ20__3)
        v_SatQ13__2.v = f_gen_load(v_st, v_SignedSatQ21__3)
      }
      val v_temp4 : RTLabel = f_gen_branch(v_st, v_SatQ13__2.v) 
      f_switch_context (v_st,f_true_branch(v_st, v_temp4))
      f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
      f_switch_context (v_st,f_merge_branch(v_st, v_temp4))
      f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(8), BigInt(128), v_SatQ12__2.v, f_gen_int_lit(v_st, BigInt(128))))
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000110000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000010000000000000000000000", 2)))) then {
        val v_If45__2 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If45__2.v = f_gen_ZeroExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))
        } else {
          v_If45__2.v = f_gen_SignExtend(v_st, BigInt(32), BigInt(33), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_int_lit(v_st, BigInt(33)))
        }
        val v_SatQ48__2 = Mutable[Expr](rTExprDefault)
        val v_SatQ49__2 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_UnsignedSatQ50__3 : RTSym = f_decl_bv(v_st, "UnsignedSatQ50__3", BigInt(16)) 
          val v_UnsignedSatQ51__3 : RTSym = f_decl_bool(v_st, "UnsignedSatQ51__3") 
          val v_temp5 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000001111111111111111", 2))), v_If45__2.v)) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp5))
          f_gen_store (v_st,v_UnsignedSatQ50__3,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1111111111111111", 2))))
          f_gen_store (v_st,v_UnsignedSatQ51__3,f_gen_bool_lit(v_st, true))
          f_switch_context (v_st,f_false_branch(v_st, v_temp5))
          val v_temp6 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), v_If45__2.v, f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000000000000000000", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp6))
          f_gen_store (v_st,v_UnsignedSatQ50__3,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0000000000000000", 2))))
          f_gen_store (v_st,v_UnsignedSatQ51__3,f_gen_bool_lit(v_st, true))
          f_switch_context (v_st,f_false_branch(v_st, v_temp6))
          f_gen_store (v_st,v_UnsignedSatQ50__3,f_gen_slice(v_st, v_If45__2.v, BigInt(0), BigInt(16)))
          f_gen_store (v_st,v_UnsignedSatQ51__3,f_gen_bool_lit(v_st, false))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp5))
          v_SatQ48__2.v = f_gen_load(v_st, v_UnsignedSatQ50__3)
          v_SatQ49__2.v = f_gen_load(v_st, v_UnsignedSatQ51__3)
        } else {
          val v_SignedSatQ56__3 : RTSym = f_decl_bv(v_st, "SignedSatQ56__3", BigInt(16)) 
          val v_SignedSatQ57__3 : RTSym = f_decl_bool(v_st, "SignedSatQ57__3") 
          val v_temp7 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("000000000000000000111111111111111", 2))), v_If45__2.v)) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp7))
          f_gen_store (v_st,v_SignedSatQ56__3,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("0111111111111111", 2))))
          f_gen_store (v_st,v_SignedSatQ57__3,f_gen_bool_lit(v_st, true))
          f_switch_context (v_st,f_false_branch(v_st, v_temp7))
          val v_temp8 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(33), v_If45__2.v, f_gen_bit_lit(v_st, BigInt(33), mkBits(v_st, 33, BigInt("111111111111111111000000000000000", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp8))
          f_gen_store (v_st,v_SignedSatQ56__3,f_gen_bit_lit(v_st, BigInt(16), mkBits(v_st, 16, BigInt("1000000000000000", 2))))
          f_gen_store (v_st,v_SignedSatQ57__3,f_gen_bool_lit(v_st, true))
          f_switch_context (v_st,f_false_branch(v_st, v_temp8))
          f_gen_store (v_st,v_SignedSatQ56__3,f_gen_slice(v_st, v_If45__2.v, BigInt(0), BigInt(16)))
          f_gen_store (v_st,v_SignedSatQ57__3,f_gen_bool_lit(v_st, false))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp7))
          v_SatQ48__2.v = f_gen_load(v_st, v_SignedSatQ56__3)
          v_SatQ49__2.v = f_gen_load(v_st, v_SignedSatQ57__3)
        }
        val v_temp9 : RTLabel = f_gen_branch(v_st, v_SatQ49__2.v) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp9))
        f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp9))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_SatQ48__2.v, f_gen_int_lit(v_st, BigInt(128))))
      } else {
        val v_If81__2 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          v_If81__2.v = f_gen_ZeroExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65)))
        } else {
          v_If81__2.v = f_gen_SignExtend(v_st, BigInt(64), BigInt(65), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_int_lit(v_st, BigInt(65)))
        }
        val v_SatQ84__2 = Mutable[Expr](rTExprDefault)
        val v_SatQ85__2 = Mutable[Expr](rTExprDefault)
        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2))), mkBits(v_st, 32, BigInt("00100000000000000000000000000000", 2)))) then {
          val v_UnsignedSatQ86__3 : RTSym = f_decl_bv(v_st, "UnsignedSatQ86__3", BigInt(32)) 
          val v_UnsignedSatQ87__3 : RTSym = f_decl_bool(v_st, "UnsignedSatQ87__3") 
          val v_temp10 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), f_gen_bit_lit(v_st, BigInt(65), mkBits(v_st, 65, BigInt("00000000000000000000000000000000011111111111111111111111111111111", 2))), v_If81__2.v)) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp10))
          f_gen_store (v_st,v_UnsignedSatQ86__3,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("11111111111111111111111111111111", 2))))
          f_gen_store (v_st,v_UnsignedSatQ87__3,f_gen_bool_lit(v_st, true))
          f_switch_context (v_st,f_false_branch(v_st, v_temp10))
          val v_temp11 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), v_If81__2.v, f_gen_bit_lit(v_st, BigInt(65), mkBits(v_st, 65, BigInt("00000000000000000000000000000000000000000000000000000000000000000", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp11))
          f_gen_store (v_st,v_UnsignedSatQ86__3,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2))))
          f_gen_store (v_st,v_UnsignedSatQ87__3,f_gen_bool_lit(v_st, true))
          f_switch_context (v_st,f_false_branch(v_st, v_temp11))
          f_gen_store (v_st,v_UnsignedSatQ86__3,f_gen_slice(v_st, v_If81__2.v, BigInt(0), BigInt(32)))
          f_gen_store (v_st,v_UnsignedSatQ87__3,f_gen_bool_lit(v_st, false))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp10))
          v_SatQ84__2.v = f_gen_load(v_st, v_UnsignedSatQ86__3)
          v_SatQ85__2.v = f_gen_load(v_st, v_UnsignedSatQ87__3)
        } else {
          val v_SignedSatQ92__3 : RTSym = f_decl_bv(v_st, "SignedSatQ92__3", BigInt(32)) 
          val v_SignedSatQ93__3 : RTSym = f_decl_bool(v_st, "SignedSatQ93__3") 
          val v_temp12 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), f_gen_bit_lit(v_st, BigInt(65), mkBits(v_st, 65, BigInt("00000000000000000000000000000000001111111111111111111111111111111", 2))), v_If81__2.v)) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp12))
          f_gen_store (v_st,v_SignedSatQ92__3,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("01111111111111111111111111111111", 2))))
          f_gen_store (v_st,v_SignedSatQ93__3,f_gen_bool_lit(v_st, true))
          f_switch_context (v_st,f_false_branch(v_st, v_temp12))
          val v_temp13 : RTLabel = f_gen_branch(v_st, f_gen_slt_bits(v_st, BigInt(65), v_If81__2.v, f_gen_bit_lit(v_st, BigInt(65), mkBits(v_st, 65, BigInt("11111111111111111111111111111111110000000000000000000000000000000", 2))))) 
          f_switch_context (v_st,f_true_branch(v_st, v_temp13))
          f_gen_store (v_st,v_SignedSatQ92__3,f_gen_bit_lit(v_st, BigInt(32), mkBits(v_st, 32, BigInt("10000000000000000000000000000000", 2))))
          f_gen_store (v_st,v_SignedSatQ93__3,f_gen_bool_lit(v_st, true))
          f_switch_context (v_st,f_false_branch(v_st, v_temp13))
          f_gen_store (v_st,v_SignedSatQ92__3,f_gen_slice(v_st, v_If81__2.v, BigInt(0), BigInt(32)))
          f_gen_store (v_st,v_SignedSatQ93__3,f_gen_bool_lit(v_st, false))
          f_switch_context (v_st,f_merge_branch(v_st, v_temp12))
          v_SatQ84__2.v = f_gen_load(v_st, v_SignedSatQ92__3)
          v_SatQ85__2.v = f_gen_load(v_st, v_SignedSatQ93__3)
        }
        val v_temp14 : RTLabel = f_gen_branch(v_st, v_SatQ85__2.v) 
        f_switch_context (v_st,f_true_branch(v_st, v_temp14))
        f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(4), BigInt(28), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(28), BigInt(4)), f_gen_append_bits(v_st, BigInt(1), BigInt(27), f_gen_bit_lit(v_st, BigInt(1), mkBits(v_st, 1, BigInt("1", 2))), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(27)))))
        f_switch_context (v_st,f_merge_branch(v_st, v_temp14))
        f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_SatQ84__2.v, f_gen_int_lit(v_st, BigInt(128))))
      }
    }
  }
}
