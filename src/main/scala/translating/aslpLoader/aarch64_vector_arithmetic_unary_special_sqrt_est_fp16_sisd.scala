/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_vector_arithmetic_unary_special_sqrt_est_fp16_sisd (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  val v_Exp6__2 : RTSym = f_decl_bv(v_st, "Exp6__2", BigInt(128)) 
  f_gen_store (v_st,v_Exp6__2,f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
  val v_FPRSqrtEstimate10__2 : RTSym = f_decl_bv(v_st, "FPRSqrtEstimate10__2", BigInt(16)) 
  val v_FPUnpackBase14__4 : RTSym = f_decl_bv(v_st, "FPUnpackBase14__4", BigInt(3)) 
  val v_temp0 = Mutable[RTLabel](rTLabelDefault)
  val v_temp1 = Mutable[RTLabel](rTLabelDefault)
  val v_temp2 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75384,tmp75385,tmp75386) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(5), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(10), BigInt(5)), f_gen_bit_lit(v_st, BigInt(5), BitVecLiteral(BigInt("00000", 2), 5)))) 
  v_temp0.v = tmp75384
  v_temp1.v = tmp75385
  v_temp2.v = tmp75386
  f_switch_context (v_st,v_temp0.v)
  val v_temp3 = Mutable[RTLabel](rTLabelDefault)
  val v_temp4 = Mutable[RTLabel](rTLabelDefault)
  val v_temp5 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75387,tmp75388,tmp75389) = f_gen_branch(v_st, f_gen_or_bool(v_st, f_gen_eq_bits(v_st, BigInt(10), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(10)), f_gen_bit_lit(v_st, BigInt(10), BitVecLiteral(BigInt("0000000000", 2), 10))), f_gen_and_bool(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(10), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(10)), f_gen_bit_lit(v_st, BigInt(10), BitVecLiteral(BigInt("0000000000", 2), 10)))), f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(19), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))))) 
  v_temp3.v = tmp75387
  v_temp4.v = tmp75388
  v_temp5.v = tmp75389
  f_switch_context (v_st,v_temp3.v)
  val v_temp6 = Mutable[RTLabel](rTLabelDefault)
  val v_temp7 = Mutable[RTLabel](rTLabelDefault)
  val v_temp8 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75390,tmp75391,tmp75392) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(15), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))) 
  v_temp6.v = tmp75390
  v_temp7.v = tmp75391
  v_temp8.v = tmp75392
  f_switch_context (v_st,v_temp6.v)
  f_gen_store (v_st,v_FPUnpackBase14__4,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
  f_switch_context (v_st,v_temp7.v)
  f_gen_store (v_st,v_FPUnpackBase14__4,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))
  f_switch_context (v_st,v_temp8.v)
  f_switch_context (v_st,v_temp4.v)
  val v_temp9 = Mutable[RTLabel](rTLabelDefault)
  val v_temp10 = Mutable[RTLabel](rTLabelDefault)
  val v_temp11 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75393,tmp75394,tmp75395) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(15), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))) 
  v_temp9.v = tmp75393
  v_temp10.v = tmp75394
  v_temp11.v = tmp75395
  f_switch_context (v_st,v_temp9.v)
  f_gen_store (v_st,v_FPUnpackBase14__4,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
  f_switch_context (v_st,v_temp10.v)
  f_gen_store (v_st,v_FPUnpackBase14__4,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
  f_switch_context (v_st,v_temp11.v)
  f_switch_context (v_st,v_temp5.v)
  f_switch_context (v_st,v_temp1.v)
  val v_temp12 = Mutable[RTLabel](rTLabelDefault)
  val v_temp13 = Mutable[RTLabel](rTLabelDefault)
  val v_temp14 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75396,tmp75397,tmp75398) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(5), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(10), BigInt(5)), f_gen_bit_lit(v_st, BigInt(5), BitVecLiteral(BigInt("11111", 2), 5)))) 
  v_temp12.v = tmp75396
  v_temp13.v = tmp75397
  v_temp14.v = tmp75398
  f_switch_context (v_st,v_temp12.v)
  val v_temp15 = Mutable[RTLabel](rTLabelDefault)
  val v_temp16 = Mutable[RTLabel](rTLabelDefault)
  val v_temp17 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75399,tmp75400,tmp75401) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(10), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(0), BigInt(10)), f_gen_bit_lit(v_st, BigInt(10), BitVecLiteral(BigInt("0000000000", 2), 10)))) 
  v_temp15.v = tmp75399
  v_temp16.v = tmp75400
  v_temp17.v = tmp75401
  f_switch_context (v_st,v_temp15.v)
  val v_temp18 = Mutable[RTLabel](rTLabelDefault)
  val v_temp19 = Mutable[RTLabel](rTLabelDefault)
  val v_temp20 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75402,tmp75403,tmp75404) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(15), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))) 
  v_temp18.v = tmp75402
  v_temp19.v = tmp75403
  v_temp20.v = tmp75404
  f_switch_context (v_st,v_temp18.v)
  f_gen_store (v_st,v_FPUnpackBase14__4,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
  f_switch_context (v_st,v_temp19.v)
  f_gen_store (v_st,v_FPUnpackBase14__4,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))
  f_switch_context (v_st,v_temp20.v)
  f_switch_context (v_st,v_temp16.v)
  val v_If32__4 : RTSym = f_decl_bv(v_st, "If32__4", BigInt(3)) 
  val v_temp21 = Mutable[RTLabel](rTLabelDefault)
  val v_temp22 = Mutable[RTLabel](rTLabelDefault)
  val v_temp23 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75405,tmp75406,tmp75407) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(9), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))) 
  v_temp21.v = tmp75405
  v_temp22.v = tmp75406
  v_temp23.v = tmp75407
  f_switch_context (v_st,v_temp21.v)
  f_gen_store (v_st,v_If32__4,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))
  f_switch_context (v_st,v_temp22.v)
  f_gen_store (v_st,v_If32__4,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("100", 2), 3)))
  f_switch_context (v_st,v_temp23.v)
  val v_temp24 = Mutable[RTLabel](rTLabelDefault)
  val v_temp25 = Mutable[RTLabel](rTLabelDefault)
  val v_temp26 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75408,tmp75409,tmp75410) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(15), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))) 
  v_temp24.v = tmp75408
  v_temp25.v = tmp75409
  v_temp26.v = tmp75410
  f_switch_context (v_st,v_temp24.v)
  f_gen_store (v_st,v_FPUnpackBase14__4,f_gen_load(v_st, v_If32__4))
  f_switch_context (v_st,v_temp25.v)
  f_gen_store (v_st,v_FPUnpackBase14__4,f_gen_load(v_st, v_If32__4))
  f_switch_context (v_st,v_temp26.v)
  f_switch_context (v_st,v_temp17.v)
  f_switch_context (v_st,v_temp13.v)
  val v_temp27 = Mutable[RTLabel](rTLabelDefault)
  val v_temp28 = Mutable[RTLabel](rTLabelDefault)
  val v_temp29 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75411,tmp75412,tmp75413) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_array_load(v_st, v__Z.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))), BigInt(15), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))) 
  v_temp27.v = tmp75411
  v_temp28.v = tmp75412
  v_temp29.v = tmp75413
  f_switch_context (v_st,v_temp27.v)
  f_gen_store (v_st,v_FPUnpackBase14__4,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
  f_switch_context (v_st,v_temp28.v)
  f_gen_store (v_st,v_FPUnpackBase14__4,f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("000", 2), 3)))
  f_switch_context (v_st,v_temp29.v)
  f_switch_context (v_st,v_temp14.v)
  f_switch_context (v_st,v_temp2.v)
  val v_temp30 = Mutable[RTLabel](rTLabelDefault)
  val v_temp31 = Mutable[RTLabel](rTLabelDefault)
  val v_temp32 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75414,tmp75415,tmp75416) = f_gen_branch(v_st, f_gen_or_bool(v_st, f_gen_eq_bits(v_st, BigInt(3), f_gen_load(v_st, v_FPUnpackBase14__4), f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("100", 2), 3))), f_gen_and_bool(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(3), f_gen_load(v_st, v_FPUnpackBase14__4), f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("100", 2), 3)))), f_gen_eq_bits(v_st, BigInt(3), f_gen_load(v_st, v_FPUnpackBase14__4), f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))))) 
  v_temp30.v = tmp75414
  v_temp31.v = tmp75415
  v_temp32.v = tmp75416
  f_switch_context (v_st,v_temp30.v)
  val v_FPProcessNaN41__3 : RTSym = f_decl_bv(v_st, "FPProcessNaN41__3", BigInt(16)) 
  val v_Exp43__3 : RTSym = f_decl_bool(v_st, "Exp43__3") 
  f_gen_store (v_st,v_Exp43__3,f_gen_or_bool(v_st, f_gen_eq_bits(v_st, BigInt(3), f_gen_load(v_st, v_FPUnpackBase14__4), f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3))), f_gen_and_bool(v_st, f_gen_not_bool(v_st, f_gen_eq_bits(v_st, BigInt(3), f_gen_load(v_st, v_FPUnpackBase14__4), f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("011", 2), 3)))), f_gen_eq_bits(v_st, BigInt(3), f_gen_load(v_st, v_FPUnpackBase14__4), f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("100", 2), 3))))))
  f_gen_assert (v_st,f_gen_load(v_st, v_Exp43__3))
  val v_temp33 = Mutable[RTLabel](rTLabelDefault)
  val v_temp34 = Mutable[RTLabel](rTLabelDefault)
  val v_temp35 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75417,tmp75418,tmp75419) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(3), f_gen_load(v_st, v_FPUnpackBase14__4), f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("100", 2), 3)))) 
  v_temp33.v = tmp75417
  v_temp34.v = tmp75418
  v_temp35.v = tmp75419
  f_switch_context (v_st,v_temp33.v)
  val v_temp36 = Mutable[RTLabel](rTLabelDefault)
  val v_temp37 = Mutable[RTLabel](rTLabelDefault)
  val v_temp38 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75420,tmp75421,tmp75422) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(8), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))) 
  v_temp36.v = tmp75420
  v_temp37.v = tmp75421
  v_temp38.v = tmp75422
  f_switch_context (v_st,v_temp36.v)
  f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,v_temp37.v)
  f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(31), BigInt(1), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(1), BigInt(31)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
  f_switch_context (v_st,v_temp38.v)
  val v_temp39 = Mutable[RTLabel](rTLabelDefault)
  val v_temp40 = Mutable[RTLabel](rTLabelDefault)
  val v_temp41 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75423,tmp75424,tmp75425) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(25), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))) 
  v_temp39.v = tmp75423
  v_temp40.v = tmp75424
  v_temp41.v = tmp75425
  f_switch_context (v_st,v_temp39.v)
  f_gen_store (v_st,v_FPProcessNaN41__3,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0111111000000000", 2), 16)))
  f_switch_context (v_st,v_temp40.v)
  f_gen_store (v_st,v_FPProcessNaN41__3,f_gen_append_bits(v_st, BigInt(6), BigInt(10), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(10), BigInt(6)), f_gen_append_bits(v_st, BigInt(1), BigInt(9), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(0), BigInt(9)))))
  f_switch_context (v_st,v_temp41.v)
  f_switch_context (v_st,v_temp34.v)
  val v_temp42 = Mutable[RTLabel](rTLabelDefault)
  val v_temp43 = Mutable[RTLabel](rTLabelDefault)
  val v_temp44 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75426,tmp75427,tmp75428) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(25), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))) 
  v_temp42.v = tmp75426
  v_temp43.v = tmp75427
  v_temp44.v = tmp75428
  f_switch_context (v_st,v_temp42.v)
  f_gen_store (v_st,v_FPProcessNaN41__3,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0111111000000000", 2), 16)))
  f_switch_context (v_st,v_temp43.v)
  f_gen_store (v_st,v_FPProcessNaN41__3,f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(0), BigInt(16)))
  f_switch_context (v_st,v_temp44.v)
  f_switch_context (v_st,v_temp35.v)
  f_gen_store (v_st,v_FPRSqrtEstimate10__2,f_gen_load(v_st, v_FPProcessNaN41__3))
  f_switch_context (v_st,v_temp31.v)
  val v_temp45 = Mutable[RTLabel](rTLabelDefault)
  val v_temp46 = Mutable[RTLabel](rTLabelDefault)
  val v_temp47 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75429,tmp75430,tmp75431) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(3), f_gen_load(v_st, v_FPUnpackBase14__4), f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("001", 2), 3)))) 
  v_temp45.v = tmp75429
  v_temp46.v = tmp75430
  v_temp47.v = tmp75431
  f_switch_context (v_st,v_temp45.v)
  val v_temp48 = Mutable[RTLabel](rTLabelDefault)
  val v_temp49 = Mutable[RTLabel](rTLabelDefault)
  val v_temp50 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75432,tmp75433,tmp75434) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(9), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))) 
  v_temp48.v = tmp75432
  v_temp49.v = tmp75433
  v_temp50.v = tmp75434
  f_switch_context (v_st,v_temp48.v)
  f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,v_temp49.v)
  f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(30), BigInt(2), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(2), BigInt(30)), f_gen_append_bits(v_st, BigInt(1), BigInt(1), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(0), BigInt(1)))))
  f_switch_context (v_st,v_temp50.v)
  f_gen_store (v_st,v_FPRSqrtEstimate10__2,f_gen_append_bits(v_st, BigInt(6), BigInt(10), f_gen_append_bits(v_st, BigInt(1), BigInt(5), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(15), BigInt(1)), f_gen_bit_lit(v_st, BigInt(5), BitVecLiteral(BigInt("11111", 2), 5))), f_gen_bit_lit(v_st, BigInt(10), BitVecLiteral(BigInt("0000000000", 2), 10))))
  f_switch_context (v_st,v_temp46.v)
  val v_temp51 = Mutable[RTLabel](rTLabelDefault)
  val v_temp52 = Mutable[RTLabel](rTLabelDefault)
  val v_temp53 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75435,tmp75436,tmp75437) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_load(v_st, v_Exp6__2), BigInt(15), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))) 
  v_temp51.v = tmp75435
  v_temp52.v = tmp75436
  v_temp53.v = tmp75437
  f_switch_context (v_st,v_temp51.v)
  val v_temp54 = Mutable[RTLabel](rTLabelDefault)
  val v_temp55 = Mutable[RTLabel](rTLabelDefault)
  val v_temp56 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75438,tmp75439,tmp75440) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(1), f_gen_slice(v_st, f_gen_load(v_st, v_FPCR.v), BigInt(8), BigInt(1)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1)))) 
  v_temp54.v = tmp75438
  v_temp55.v = tmp75439
  v_temp56.v = tmp75440
  f_switch_context (v_st,v_temp54.v)
  f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,v_temp55.v)
  f_gen_store (v_st,v_FPSR.v,f_gen_append_bits(v_st, BigInt(31), BigInt(1), f_gen_slice(v_st, f_gen_load(v_st, v_FPSR.v), BigInt(1), BigInt(31)), f_gen_bit_lit(v_st, BigInt(1), BitVecLiteral(BigInt("1", 2), 1))))
  f_switch_context (v_st,v_temp56.v)
  f_gen_store (v_st,v_FPRSqrtEstimate10__2,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0111111000000000", 2), 16)))
  f_switch_context (v_st,v_temp52.v)
  val v_temp57 = Mutable[RTLabel](rTLabelDefault)
  val v_temp58 = Mutable[RTLabel](rTLabelDefault)
  val v_temp59 = Mutable[RTLabel](rTLabelDefault)
  val (tmp75441,tmp75442,tmp75443) = f_gen_branch(v_st, f_gen_eq_bits(v_st, BigInt(3), f_gen_load(v_st, v_FPUnpackBase14__4), f_gen_bit_lit(v_st, BigInt(3), BitVecLiteral(BigInt("010", 2), 3)))) 
  v_temp57.v = tmp75441
  v_temp58.v = tmp75442
  v_temp59.v = tmp75443
  f_switch_context (v_st,v_temp57.v)
  f_gen_store (v_st,v_FPRSqrtEstimate10__2,f_gen_bit_lit(v_st, BigInt(16), BitVecLiteral(BigInt("0000000000000000", 2), 16)))
  f_switch_context (v_st,v_temp58.v)
  f_gen_assert (v_st,f_gen_bool_lit(v_st, false))
  f_switch_context (v_st,v_temp59.v)
  f_switch_context (v_st,v_temp53.v)
  f_switch_context (v_st,v_temp47.v)
  f_switch_context (v_st,v_temp32.v)
  assert (((f_sle_bits(v_st, BigInt(6), BitVecLiteral(BigInt("000000", 2), 6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), BitVecLiteral(BigInt("011111", 2), 6)))))
  f_gen_array_store (v_st,v__Z.v,f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5))),f_gen_ZeroExtend(v_st, BigInt(16), BigInt(128), f_gen_load(v_st, v_FPRSqrtEstimate10__2), f_gen_int_lit(v_st, BigInt(128))))
}
