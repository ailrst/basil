/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_binary_uniform_sub_fp16_simd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(30),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp7__2 : RTSym = f_decl_bv(v_st, "Exp7__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp7__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp10__2 : RTSym = f_decl_bv(v_st, "Exp10__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp10__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
    val v_Exp14__2 : RTSym = f_decl_bv(v_st, "Exp14__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp14__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If16__1 : RTSym = f_decl_bv(v_st, "If16__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If16__1,f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp14__2), BigInt(0), BigInt(15))))
    } else {
      f_gen_store (v_st,v_If16__1,f_gen_load(v_st, v_Exp14__2))
    }
    val v_Exp21__2 : RTSym = f_decl_bv(v_st, "Exp21__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp21__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(16), BigInt(16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp10__2), BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If22__1 : RTSym = f_decl_bv(v_st, "If22__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If22__1,f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp21__2), BigInt(0), BigInt(15))))
    } else {
      f_gen_store (v_st,v_If22__1,f_gen_load(v_st, v_Exp21__2))
    }
    val v_Exp27__2 : RTSym = f_decl_bv(v_st, "Exp27__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp27__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(32), BigInt(16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp10__2), BigInt(32), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If28__1 : RTSym = f_decl_bv(v_st, "If28__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If28__1,f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp27__2), BigInt(0), BigInt(15))))
    } else {
      f_gen_store (v_st,v_If28__1,f_gen_load(v_st, v_Exp27__2))
    }
    val v_Exp33__2 : RTSym = f_decl_bv(v_st, "Exp33__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp33__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(48), BigInt(16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp10__2), BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If34__1 : RTSym = f_decl_bv(v_st, "If34__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If34__1,f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp33__2), BigInt(0), BigInt(15))))
    } else {
      f_gen_store (v_st,v_If34__1,f_gen_load(v_st, v_Exp33__2))
    }
    val v_Exp39__2 : RTSym = f_decl_bv(v_st, "Exp39__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp39__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(64), BigInt(16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp10__2), BigInt(64), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If40__1 : RTSym = f_decl_bv(v_st, "If40__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If40__1,f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp39__2), BigInt(0), BigInt(15))))
    } else {
      f_gen_store (v_st,v_If40__1,f_gen_load(v_st, v_Exp39__2))
    }
    val v_Exp45__2 : RTSym = f_decl_bv(v_st, "Exp45__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp45__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(80), BigInt(16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp10__2), BigInt(80), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If46__1 : RTSym = f_decl_bv(v_st, "If46__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If46__1,f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp45__2), BigInt(0), BigInt(15))))
    } else {
      f_gen_store (v_st,v_If46__1,f_gen_load(v_st, v_Exp45__2))
    }
    val v_Exp51__2 : RTSym = f_decl_bv(v_st, "Exp51__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp51__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(96), BigInt(16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp10__2), BigInt(96), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If52__1 : RTSym = f_decl_bv(v_st, "If52__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If52__1,f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp51__2), BigInt(0), BigInt(15))))
    } else {
      f_gen_store (v_st,v_If52__1,f_gen_load(v_st, v_Exp51__2))
    }
    val v_Exp57__2 : RTSym = f_decl_bv(v_st, "Exp57__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp57__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp7__2), BigInt(112), BigInt(16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp10__2), BigInt(112), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If58__1 : RTSym = f_decl_bv(v_st, "If58__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If58__1,f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp57__2), BigInt(0), BigInt(15))))
    } else {
      f_gen_store (v_st,v_If58__1,f_gen_load(v_st, v_Exp57__2))
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_append_bits(v_st, BigInt(16), BigInt(112), f_gen_load(v_st, v_If58__1), f_gen_append_bits(v_st, BigInt(16), BigInt(96), f_gen_load(v_st, v_If52__1), f_gen_append_bits(v_st, BigInt(16), BigInt(80), f_gen_load(v_st, v_If46__1), f_gen_append_bits(v_st, BigInt(16), BigInt(64), f_gen_load(v_st, v_If40__1), f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_load(v_st, v_If34__1), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_If28__1), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_If22__1), f_gen_load(v_st, v_If16__1)))))))))
  } else {
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp68__2 : RTSym = f_decl_bv(v_st, "Exp68__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp68__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(16),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    val v_Exp71__2 : RTSym = f_decl_bv(v_st, "Exp71__2", BigInt(128)) 
    f_gen_store (v_st,v_Exp71__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))))
    val v_Exp75__2 : RTSym = f_decl_bv(v_st, "Exp75__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp75__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If77__1 : RTSym = f_decl_bv(v_st, "If77__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If77__1,f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp75__2), BigInt(0), BigInt(15))))
    } else {
      f_gen_store (v_st,v_If77__1,f_gen_load(v_st, v_Exp75__2))
    }
    val v_Exp82__2 : RTSym = f_decl_bv(v_st, "Exp82__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp82__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp68__2), BigInt(16), BigInt(16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp71__2), BigInt(16), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If83__1 : RTSym = f_decl_bv(v_st, "If83__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If83__1,f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp82__2), BigInt(0), BigInt(15))))
    } else {
      f_gen_store (v_st,v_If83__1,f_gen_load(v_st, v_Exp82__2))
    }
    val v_Exp88__2 : RTSym = f_decl_bv(v_st, "Exp88__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp88__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp68__2), BigInt(32), BigInt(16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp71__2), BigInt(32), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If89__1 : RTSym = f_decl_bv(v_st, "If89__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If89__1,f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp88__2), BigInt(0), BigInt(15))))
    } else {
      f_gen_store (v_st,v_If89__1,f_gen_load(v_st, v_Exp88__2))
    }
    val v_Exp94__2 : RTSym = f_decl_bv(v_st, "Exp94__2", BigInt(16)) 
    f_gen_store (v_st,v_Exp94__2,f_gen_FPSub(v_st, BigInt(16), f_gen_slice(v_st, f_gen_load(v_st, v_Exp68__2), BigInt(48), BigInt(16)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp71__2), BigInt(48), BigInt(16)), f_gen_load(v_st, v_FPCR.v)))
    val v_If95__1 : RTSym = f_decl_bv(v_st, "If95__1", BigInt(16)) 
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(29),BigInt(1)), BitVecLiteral(BigInt("1", 2), 1))) then {
      f_gen_store (v_st,v_If95__1,f_gen_append_bits(v_st, BigInt(1), BigInt(15), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("0", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp94__2), BigInt(0), BigInt(15))))
    } else {
      f_gen_store (v_st,v_If95__1,f_gen_load(v_st, v_Exp94__2))
    }
    assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
    f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), f_gen_append_bits(v_st, BigInt(16), BigInt(48), f_gen_load(v_st, v_If95__1), f_gen_append_bits(v_st, BigInt(16), BigInt(32), f_gen_load(v_st, v_If89__1), f_gen_append_bits(v_st, BigInt(16), BigInt(16), f_gen_load(v_st, v_If83__1), f_gen_load(v_st, v_If77__1)))), f_gen_int_lit(v_st, BigInt(128))))
  }
}
