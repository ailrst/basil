/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_float_arithmetic_round_frint (v_st: LiftState,v_enc: BV) : Unit = {
  val v_Exp3__1 : Boolean = v_split_expr_81(v_st, v_enc) 
  if (v_Exp3__1) then {
    v_split_fun_169 (v_st,v_Exp3__1,v_enc)
  } else {
    val v_Exp26__1 : Boolean = v_split_expr_108(v_st, v_enc) 
    if (v_Exp26__1) then {
      v_split_fun_166 (v_st,v_Exp26__1,v_Exp3__1,v_enc)
    } else {
      v_split_fun_167 (v_st,v_Exp26__1,v_Exp3__1,v_enc)
    }
  }
}
def v_split_expr_103 (v_st: LiftState,v_enc: BV)  = {
  ((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2)))))
}
def v_split_expr_104 (v_st: LiftState,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr])  = {
  f_gen_FPRoundInt(v_st, BigInt(32), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(32)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v))
}
def v_split_expr_105 (v_st: LiftState,v_enc: BV)  = {
  ((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2)))))
}
def v_split_expr_106 (v_st: LiftState,v_enc: BV)  = {
  f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_107 (v_st: LiftState,v_Exp20__2: Mutable[Expr])  = {
  f_gen_ZeroExtend(v_st, BigInt(32), BigInt(128), v_Exp20__2.v, f_gen_int_lit(v_st, BigInt(128)))
}
def v_split_expr_108 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2)))
}
def v_split_expr_109 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), f_and_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("100", 2))), mkBits(v_st, 3, BigInt("000", 2)))
}
def v_split_expr_110 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2)))
}
def v_split_expr_111 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2)))
}
def v_split_expr_112 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2)))
}
def v_split_expr_113 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))
}
def v_split_expr_115 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("100", 2)))
}
def v_split_expr_116 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("101", 2)))
}
def v_split_expr_117 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("110", 2)))
}
def v_split_expr_118 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2)))))
}
def v_split_expr_119 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2)))))
}
def v_split_expr_120 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2)))))
}
def v_split_expr_121 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2)))))
}
def v_split_expr_122 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("111", 2)))
}
def v_split_expr_123 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2)))))
}
def v_split_expr_124 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2)))))
}
def v_split_expr_125 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2)))))
}
def v_split_expr_126 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2)))))
}
def v_split_expr_130 (v_st: LiftState,v_enc: BV)  = {
  ((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2)))))
}
def v_split_expr_131 (v_st: LiftState,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr])  = {
  f_gen_FPRoundInt(v_st, BigInt(64), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(64)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v))
}
def v_split_expr_132 (v_st: LiftState,v_enc: BV)  = {
  ((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2)))))
}
def v_split_expr_133 (v_st: LiftState,v_enc: BV)  = {
  f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_134 (v_st: LiftState,v_Exp43__2: Mutable[Expr])  = {
  f_gen_ZeroExtend(v_st, BigInt(64), BigInt(128), v_Exp43__2.v, f_gen_int_lit(v_st, BigInt(128)))
}
def v_split_expr_135 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2)))
}
def v_split_expr_136 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))
}
def v_split_expr_137 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), f_and_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("100", 2))), mkBits(v_st, 3, BigInt("000", 2)))
}
def v_split_expr_138 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2)))
}
def v_split_expr_139 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2)))
}
def v_split_expr_140 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2)))
}
def v_split_expr_141 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))
}
def v_split_expr_143 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("100", 2)))
}
def v_split_expr_144 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("101", 2)))
}
def v_split_expr_145 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("110", 2)))
}
def v_split_expr_146 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2)))))
}
def v_split_expr_147 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2)))))
}
def v_split_expr_148 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2)))))
}
def v_split_expr_149 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2)))))
}
def v_split_expr_150 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("111", 2)))
}
def v_split_expr_151 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2)))))
}
def v_split_expr_152 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2)))))
}
def v_split_expr_153 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2)))))
}
def v_split_expr_154 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2)))))
}
def v_split_expr_158 (v_st: LiftState,v_enc: BV)  = {
  ((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2)))))
}
def v_split_expr_159 (v_st: LiftState,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr])  = {
  f_gen_FPRoundInt(v_st, BigInt(16), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(16)), f_gen_load(v_st, v_FPCR.v), f_gen_cvt_bits_uint(v_st, BigInt(3), v_rounding__1.v), f_gen_bool_lit(v_st, v_exact__1.v))
}
def v_split_expr_160 (v_st: LiftState,v_enc: BV)  = {
  ((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2)))))
}
def v_split_expr_161 (v_st: LiftState,v_enc: BV)  = {
  f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)))
}
def v_split_expr_162 (v_st: LiftState,v_Exp68__2: Mutable[Expr])  = {
  f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), v_Exp68__2.v, f_gen_int_lit(v_st, BigInt(128)))
}
def v_split_expr_163 (v_st: LiftState,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr])  = {
  v_split_expr_159(v_st, v_enc, v_exact__1, v_rounding__1)
}
def v_split_expr_165 (v_st: LiftState,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr])  = {
  v_split_expr_131(v_st, v_enc, v_exact__1, v_rounding__1)
}
def v_split_expr_168 (v_st: LiftState,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr])  = {
  v_split_expr_104(v_st, v_enc, v_exact__1, v_rounding__1)
}
def v_split_expr_81 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(22),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2)))
}
def v_split_expr_82 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), f_and_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("100", 2))), mkBits(v_st, 3, BigInt("000", 2)))
}
def v_split_expr_83 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2)))
}
def v_split_expr_84 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2)))
}
def v_split_expr_85 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2)))
}
def v_split_expr_86 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(15),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))
}
def v_split_expr_88 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("100", 2)))
}
def v_split_expr_89 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("101", 2)))
}
def v_split_expr_90 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("110", 2)))
}
def v_split_expr_91 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2)))))
}
def v_split_expr_92 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2)))))
}
def v_split_expr_93 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2)))))
}
def v_split_expr_94 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2)))))
}
def v_split_expr_95 (v_st: LiftState,v_enc: BV)  = {
  f_eq_bits(v_st, BigInt(3), bvextract(v_st,v_enc,BigInt(15),BigInt(3)), mkBits(v_st, 3, BigInt("111", 2)))
}
def v_split_expr_96 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2)))))
}
def v_split_expr_97 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2)))))
}
def v_split_expr_98 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2)))))
}
def v_split_expr_99 (v_st: LiftState)  = {
  f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(22), BigInt(2)), f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("11", 2)))))
}
def v_split_fun_100 (v_st: LiftState,v_Exp3__1: Boolean,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr]) : Unit = {
  val v_FPDecodeRounding12__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding12__3", BigInt(3)) 
  val v_temp4 : RTLabel = v_split_expr_96(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp4))
  f_gen_store (v_st,v_FPDecodeRounding12__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp4))
  val v_temp5 : RTLabel = v_split_expr_97(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp5))
  f_gen_store (v_st,v_FPDecodeRounding12__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp5))
  val v_temp6 : RTLabel = v_split_expr_98(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp6))
  f_gen_store (v_st,v_FPDecodeRounding12__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp6))
  val v_temp7 : RTLabel = v_split_expr_99(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp7))
  f_gen_store (v_st,v_FPDecodeRounding12__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp7))
  f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp4))
  v_rounding__1.v = f_gen_load(v_st, v_FPDecodeRounding12__3)
}
def v_split_fun_101 (v_st: LiftState,v_Exp3__1: Boolean,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr]) : Unit = {
  val v_FPDecodeRounding8__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding8__3", BigInt(3)) 
  val v_temp0 : RTLabel = v_split_expr_91(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp0))
  f_gen_store (v_st,v_FPDecodeRounding8__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp0))
  val v_temp1 : RTLabel = v_split_expr_92(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp1))
  f_gen_store (v_st,v_FPDecodeRounding8__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp1))
  val v_temp2 : RTLabel = v_split_expr_93(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp2))
  f_gen_store (v_st,v_FPDecodeRounding8__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp2))
  val v_temp3 : RTLabel = v_split_expr_94(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp3))
  f_gen_store (v_st,v_FPDecodeRounding8__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp3))
  f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp0))
  v_rounding__1.v = f_gen_load(v_st, v_FPDecodeRounding8__3)
  v_exact__1.v = true
}
def v_split_fun_102 (v_st: LiftState,v_Exp3__1: Boolean,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr]) : Unit = {
  if (v_split_expr_89(v_st, v_enc)) then {
    throw Exception("not supported")
  } else {
    if (v_split_expr_90(v_st, v_enc)) then {
      v_split_fun_101 (v_st,v_Exp3__1,v_enc,v_exact__1,v_rounding__1)
    } else {
      if (v_split_expr_95(v_st, v_enc)) then {
        v_split_fun_100 (v_st,v_Exp3__1,v_enc,v_exact__1,v_rounding__1)
      } else {
        throw Exception("not supported")
      }
    }
  }
}
def v_split_fun_114 (v_st: LiftState,v_Exp26__1: Boolean,v_Exp3__1: Boolean,v_FPDecodeRounding27__2: Mutable[BV],v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr]) : Unit = {
  if (v_split_expr_111(v_st, v_enc)) then {
    v_FPDecodeRounding27__2.v = mkBits(v_st, 3, BigInt("001", 2))
  } else {
    if (v_split_expr_112(v_st, v_enc)) then {
      v_FPDecodeRounding27__2.v = mkBits(v_st, 3, BigInt("010", 2))
    } else {
      if (v_split_expr_113(v_st, v_enc)) then {
        v_FPDecodeRounding27__2.v = mkBits(v_st, 3, BigInt("011", 2))
      } else {
        throw Exception("not supported")
      }
    }
  }
}
def v_split_fun_127 (v_st: LiftState,v_Exp26__1: Boolean,v_Exp3__1: Boolean,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr]) : Unit = {
  val v_FPDecodeRounding35__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding35__3", BigInt(3)) 
  val v_temp12 : RTLabel = v_split_expr_123(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp12))
  f_gen_store (v_st,v_FPDecodeRounding35__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp12))
  val v_temp13 : RTLabel = v_split_expr_124(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp13))
  f_gen_store (v_st,v_FPDecodeRounding35__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp13))
  val v_temp14 : RTLabel = v_split_expr_125(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp14))
  f_gen_store (v_st,v_FPDecodeRounding35__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp14))
  val v_temp15 : RTLabel = v_split_expr_126(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp15))
  f_gen_store (v_st,v_FPDecodeRounding35__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp15))
  f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp12))
  v_rounding__1.v = f_gen_load(v_st, v_FPDecodeRounding35__3)
}
def v_split_fun_128 (v_st: LiftState,v_Exp26__1: Boolean,v_Exp3__1: Boolean,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr]) : Unit = {
  val v_FPDecodeRounding31__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding31__3", BigInt(3)) 
  val v_temp8 : RTLabel = v_split_expr_118(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp8))
  f_gen_store (v_st,v_FPDecodeRounding31__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp8))
  val v_temp9 : RTLabel = v_split_expr_119(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp9))
  f_gen_store (v_st,v_FPDecodeRounding31__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp9))
  val v_temp10 : RTLabel = v_split_expr_120(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp10))
  f_gen_store (v_st,v_FPDecodeRounding31__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp10))
  val v_temp11 : RTLabel = v_split_expr_121(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp11))
  f_gen_store (v_st,v_FPDecodeRounding31__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp11))
  f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp8))
  v_rounding__1.v = f_gen_load(v_st, v_FPDecodeRounding31__3)
  v_exact__1.v = true
}
def v_split_fun_129 (v_st: LiftState,v_Exp26__1: Boolean,v_Exp3__1: Boolean,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr]) : Unit = {
  if (v_split_expr_116(v_st, v_enc)) then {
    throw Exception("not supported")
  } else {
    if (v_split_expr_117(v_st, v_enc)) then {
      v_split_fun_128 (v_st,v_Exp26__1,v_Exp3__1,v_enc,v_exact__1,v_rounding__1)
    } else {
      if (v_split_expr_122(v_st, v_enc)) then {
        v_split_fun_127 (v_st,v_Exp26__1,v_Exp3__1,v_enc,v_exact__1,v_rounding__1)
      } else {
        throw Exception("not supported")
      }
    }
  }
}
def v_split_fun_142 (v_st: LiftState,v_Exp26__1: Boolean,v_Exp3__1: Boolean,v_Exp49__1: Boolean,v_Exp50__1: Boolean,v_FPDecodeRounding52__2: Mutable[BV],v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr]) : Unit = {
  if (v_split_expr_139(v_st, v_enc)) then {
    v_FPDecodeRounding52__2.v = mkBits(v_st, 3, BigInt("001", 2))
  } else {
    if (v_split_expr_140(v_st, v_enc)) then {
      v_FPDecodeRounding52__2.v = mkBits(v_st, 3, BigInt("010", 2))
    } else {
      if (v_split_expr_141(v_st, v_enc)) then {
        v_FPDecodeRounding52__2.v = mkBits(v_st, 3, BigInt("011", 2))
      } else {
        throw Exception("not supported")
      }
    }
  }
}
def v_split_fun_155 (v_st: LiftState,v_Exp26__1: Boolean,v_Exp3__1: Boolean,v_Exp49__1: Boolean,v_Exp50__1: Boolean,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr]) : Unit = {
  val v_FPDecodeRounding60__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding60__3", BigInt(3)) 
  val v_temp20 : RTLabel = v_split_expr_151(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp20))
  f_gen_store (v_st,v_FPDecodeRounding60__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp20))
  val v_temp21 : RTLabel = v_split_expr_152(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp21))
  f_gen_store (v_st,v_FPDecodeRounding60__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp21))
  val v_temp22 : RTLabel = v_split_expr_153(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp22))
  f_gen_store (v_st,v_FPDecodeRounding60__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp22))
  val v_temp23 : RTLabel = v_split_expr_154(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp23))
  f_gen_store (v_st,v_FPDecodeRounding60__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp23))
  f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp20))
  v_rounding__1.v = f_gen_load(v_st, v_FPDecodeRounding60__3)
}
def v_split_fun_156 (v_st: LiftState,v_Exp26__1: Boolean,v_Exp3__1: Boolean,v_Exp49__1: Boolean,v_Exp50__1: Boolean,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr]) : Unit = {
  val v_FPDecodeRounding56__3 : RTSym = f_decl_bv(v_st, "FPDecodeRounding56__3", BigInt(3)) 
  val v_temp16 : RTLabel = v_split_expr_146(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp16))
  f_gen_store (v_st,v_FPDecodeRounding56__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp16))
  val v_temp17 : RTLabel = v_split_expr_147(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp17))
  f_gen_store (v_st,v_FPDecodeRounding56__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("001", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp17))
  val v_temp18 : RTLabel = v_split_expr_148(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp18))
  f_gen_store (v_st,v_FPDecodeRounding56__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("010", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp18))
  val v_temp19 : RTLabel = v_split_expr_149(v_st) 
  f_switch_context (v_st,f_true_branch(v_st, v_temp19))
  f_gen_store (v_st,v_FPDecodeRounding56__3,f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("011", 2))))
  f_switch_context (v_st,f_false_branch(v_st, v_temp19))
  f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,f_merge_branch(v_st, v_temp16))
  v_rounding__1.v = f_gen_load(v_st, v_FPDecodeRounding56__3)
  v_exact__1.v = true
}
def v_split_fun_157 (v_st: LiftState,v_Exp26__1: Boolean,v_Exp3__1: Boolean,v_Exp49__1: Boolean,v_Exp50__1: Boolean,v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr]) : Unit = {
  if (v_split_expr_144(v_st, v_enc)) then {
    throw Exception("not supported")
  } else {
    if (v_split_expr_145(v_st, v_enc)) then {
      v_split_fun_156 (v_st,v_Exp26__1,v_Exp3__1,v_Exp49__1,v_Exp50__1,v_enc,v_exact__1,v_rounding__1)
    } else {
      if (v_split_expr_150(v_st, v_enc)) then {
        v_split_fun_155 (v_st,v_Exp26__1,v_Exp3__1,v_Exp49__1,v_Exp50__1,v_enc,v_exact__1,v_rounding__1)
      } else {
        throw Exception("not supported")
      }
    }
  }
}
def v_split_fun_164 (v_st: LiftState,v_Exp26__1: Boolean,v_Exp3__1: Boolean,v_Exp49__1: Boolean,v_Exp50__1: Boolean,v_enc: BV) : Unit = {
  val v_exact__1 = Mutable[Boolean](false)
  val v_rounding__1 = Mutable[Expr](rTExprDefault)
  if (v_split_expr_137(v_st, v_enc)) then {
    val v_FPDecodeRounding52__2 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
    if (v_split_expr_138(v_st, v_enc)) then {
      v_FPDecodeRounding52__2.v = mkBits(v_st, 3, BigInt("000", 2))
    } else {
      v_split_fun_142 (v_st,v_Exp26__1,v_Exp3__1,v_Exp49__1,v_Exp50__1,v_FPDecodeRounding52__2,v_enc,v_exact__1,v_rounding__1)
    }
    v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), v_FPDecodeRounding52__2.v)
  } else {
    if (v_split_expr_143(v_st, v_enc)) then {
      v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("100", 2)))
    } else {
      v_split_fun_157 (v_st,v_Exp26__1,v_Exp3__1,v_Exp49__1,v_Exp50__1,v_enc,v_exact__1,v_rounding__1)
    }
  }
  assert (v_split_expr_158(v_st, v_enc))
  val v_Exp68__2 = Mutable[Expr](rTExprDefault)
  v_Exp68__2.v = v_split_expr_163(v_st, v_enc, v_exact__1, v_rounding__1)
  assert (v_split_expr_160(v_st, v_enc))
  f_gen_array_store (v_st,v__Z.v,v_split_expr_161(v_st, v_enc),v_split_expr_162(v_st, v_Exp68__2))
}
def v_split_fun_166 (v_st: LiftState,v_Exp26__1: Boolean,v_Exp3__1: Boolean,v_enc: BV) : Unit = {
  val v_exact__1 = Mutable[Boolean](false)
  val v_rounding__1 = Mutable[Expr](rTExprDefault)
  if (v_split_expr_109(v_st, v_enc)) then {
    val v_FPDecodeRounding27__2 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
    if (v_split_expr_110(v_st, v_enc)) then {
      v_FPDecodeRounding27__2.v = mkBits(v_st, 3, BigInt("000", 2))
    } else {
      v_split_fun_114 (v_st,v_Exp26__1,v_Exp3__1,v_FPDecodeRounding27__2,v_enc,v_exact__1,v_rounding__1)
    }
    v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), v_FPDecodeRounding27__2.v)
  } else {
    if (v_split_expr_115(v_st, v_enc)) then {
      v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("100", 2)))
    } else {
      v_split_fun_129 (v_st,v_Exp26__1,v_Exp3__1,v_enc,v_exact__1,v_rounding__1)
    }
  }
  assert (v_split_expr_130(v_st, v_enc))
  val v_Exp43__2 = Mutable[Expr](rTExprDefault)
  v_Exp43__2.v = v_split_expr_165(v_st, v_enc, v_exact__1, v_rounding__1)
  assert (v_split_expr_132(v_st, v_enc))
  f_gen_array_store (v_st,v__Z.v,v_split_expr_133(v_st, v_enc),v_split_expr_134(v_st, v_Exp43__2))
}
def v_split_fun_167 (v_st: LiftState,v_Exp26__1: Boolean,v_Exp3__1: Boolean,v_enc: BV) : Unit = {
  val v_Exp49__1 : Boolean = v_split_expr_135(v_st, v_enc) 
  if (v_Exp49__1) then {
    throw Exception("not supported")
  } else {
    val v_Exp50__1 : Boolean = v_split_expr_136(v_st, v_enc) 
    if (v_Exp50__1) then {
      v_split_fun_164 (v_st,v_Exp26__1,v_Exp3__1,v_Exp49__1,v_Exp50__1,v_enc)
    } else {
      throw Exception("not supported")
    }
  }
}
def v_split_fun_169 (v_st: LiftState,v_Exp3__1: Boolean,v_enc: BV) : Unit = {
  val v_exact__1 = Mutable[Boolean](false)
  val v_rounding__1 = Mutable[Expr](rTExprDefault)
  if (v_split_expr_82(v_st, v_enc)) then {
    val v_FPDecodeRounding4__2 = Mutable[BV](mkBits(v_st, BigInt(3), BigInt(0)))
    if (v_split_expr_83(v_st, v_enc)) then {
      v_FPDecodeRounding4__2.v = mkBits(v_st, 3, BigInt("000", 2))
    } else {
      v_split_fun_87 (v_st,v_Exp3__1,v_FPDecodeRounding4__2,v_enc,v_exact__1,v_rounding__1)
    }
    v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), v_FPDecodeRounding4__2.v)
  } else {
    if (v_split_expr_88(v_st, v_enc)) then {
      v_rounding__1.v = f_gen_bit_lit(v_st, BigInt(3), mkBits(v_st, 3, BigInt("100", 2)))
    } else {
      v_split_fun_102 (v_st,v_Exp3__1,v_enc,v_exact__1,v_rounding__1)
    }
  }
  assert (v_split_expr_103(v_st, v_enc))
  val v_Exp20__2 = Mutable[Expr](rTExprDefault)
  v_Exp20__2.v = v_split_expr_168(v_st, v_enc, v_exact__1, v_rounding__1)
  assert (v_split_expr_105(v_st, v_enc))
  f_gen_array_store (v_st,v__Z.v,v_split_expr_106(v_st, v_enc),v_split_expr_107(v_st, v_Exp20__2))
}
def v_split_fun_87 (v_st: LiftState,v_Exp3__1: Boolean,v_FPDecodeRounding4__2: Mutable[BV],v_enc: BV,v_exact__1: Mutable[Boolean],v_rounding__1: Mutable[Expr]) : Unit = {
  if (v_split_expr_84(v_st, v_enc)) then {
    v_FPDecodeRounding4__2.v = mkBits(v_st, 3, BigInt("001", 2))
  } else {
    if (v_split_expr_85(v_st, v_enc)) then {
      v_FPDecodeRounding4__2.v = mkBits(v_st, 3, BigInt("010", 2))
    } else {
      if (v_split_expr_86(v_st, v_enc)) then {
        v_FPDecodeRounding4__2.v = mkBits(v_st, 3, BigInt("011", 2))
      } else {
        throw Exception("not supported")
      }
    }
  }
}
