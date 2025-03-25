/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_memory_ordered_rcpc[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))) then {
      val v_Exp8__2 : RTSym = v_st.f_decl_bv("Exp8__2", BigInt(8)) 
      v_st.f_gen_store (v_Exp8__2,v_st.f_gen_Mem_read(BigInt(1), v_st.f_gen_load(v_st.v_SP_EL0.v), v_st.f_gen_int_lit(BigInt(1)), v_st.f_gen_int_lit(BigInt(6))))
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_ZeroExtend(BigInt(8), BigInt(32), v_st.f_gen_load(v_Exp8__2), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_int_lit(BigInt(64))))
      }
    } else {
      val v_X_read11__2 : RTSym = v_st.f_decl_bv("X.read11__2", BigInt(64)) 
      val v_X_read11__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
      if (((((((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111111000011111", 2))), v_st.mkBits(32, BigInt("00111000101000001100000000011111", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110100011111", 2))), v_st.mkBits(32, BigInt("00111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110010011111", 2))), v_st.mkBits(32, BigInt("00111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110001011111", 2))), v_st.mkBits(32, BigInt("00111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110000111111", 2))), v_st.mkBits(32, BigInt("00111000101000001100000000011111", 2)))))) then {
        v_X_read11__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
      } else {
        v_st.f_gen_store (v_X_read11__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
      }
      val v_Exp16__2 : RTSym = v_st.f_decl_bv("Exp16__2", BigInt(8)) 
      v_st.f_gen_store (v_Exp16__2,v_st.f_gen_Mem_read(BigInt(1), (if (((((((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111111000011111", 2))), v_st.mkBits(32, BigInt("00111000101000001100000000011111", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110100011111", 2))), v_st.mkBits(32, BigInt("00111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110010011111", 2))), v_st.mkBits(32, BigInt("00111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110001011111", 2))), v_st.mkBits(32, BigInt("00111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110000111111", 2))), v_st.mkBits(32, BigInt("00111000101000001100000000011111", 2)))))) then (v_X_read11__2_copyprop.v) else (v_st.f_gen_load(v_X_read11__2))), v_st.f_gen_int_lit(BigInt(1)), v_st.f_gen_int_lit(BigInt(6))))
      if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
        v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_ZeroExtend(BigInt(8), BigInt(32), v_st.f_gen_load(v_Exp16__2), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_int_lit(BigInt(64))))
      }
    }
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2)))) then {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))) then {
        val v_Exp23__2 : RTSym = v_st.f_decl_bv("Exp23__2", BigInt(16)) 
        v_st.f_gen_store (v_Exp23__2,v_st.f_gen_Mem_read(BigInt(2), v_st.f_gen_load(v_st.v_SP_EL0.v), v_st.f_gen_int_lit(BigInt(2)), v_st.f_gen_int_lit(BigInt(6))))
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
          v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_ZeroExtend(BigInt(16), BigInt(32), v_st.f_gen_load(v_Exp23__2), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_int_lit(BigInt(64))))
        }
      } else {
        val v_X_read26__2 : RTSym = v_st.f_decl_bv("X.read26__2", BigInt(64)) 
        val v_X_read26__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
        if (((((((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111111000011111", 2))), v_st.mkBits(32, BigInt("01111000101000001100000000011111", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110100011111", 2))), v_st.mkBits(32, BigInt("01111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110010011111", 2))), v_st.mkBits(32, BigInt("01111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110001011111", 2))), v_st.mkBits(32, BigInt("01111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110000111111", 2))), v_st.mkBits(32, BigInt("01111000101000001100000000011111", 2)))))) then {
          v_X_read26__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
        } else {
          v_st.f_gen_store (v_X_read26__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
        }
        val v_Exp31__2 : RTSym = v_st.f_decl_bv("Exp31__2", BigInt(16)) 
        v_st.f_gen_store (v_Exp31__2,v_st.f_gen_Mem_read(BigInt(2), (if (((((((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111111000011111", 2))), v_st.mkBits(32, BigInt("01111000101000001100000000011111", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110100011111", 2))), v_st.mkBits(32, BigInt("01111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110010011111", 2))), v_st.mkBits(32, BigInt("01111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110001011111", 2))), v_st.mkBits(32, BigInt("01111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110000111111", 2))), v_st.mkBits(32, BigInt("01111000101000001100000000011111", 2)))))) then (v_X_read26__2_copyprop.v) else (v_st.f_gen_load(v_X_read26__2))), v_st.f_gen_int_lit(BigInt(2)), v_st.f_gen_int_lit(BigInt(6))))
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
          v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_ZeroExtend(BigInt(16), BigInt(32), v_st.f_gen_load(v_Exp31__2), v_st.f_gen_int_lit(BigInt(32))), v_st.f_gen_int_lit(BigInt(64))))
        }
      }
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("10000000000000000000000000000000", 2)))) then {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))) then {
          val v_Exp38__2 : RTSym = v_st.f_decl_bv("Exp38__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp38__2,v_st.f_gen_Mem_read(BigInt(4), v_st.f_gen_load(v_st.v_SP_EL0.v), v_st.f_gen_int_lit(BigInt(4)), v_st.f_gen_int_lit(BigInt(6))))
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
            v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_load(v_Exp38__2), v_st.f_gen_int_lit(BigInt(64))))
          }
        } else {
          val v_X_read41__2 : RTSym = v_st.f_decl_bv("X.read41__2", BigInt(64)) 
          val v_X_read41__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
          if (((((((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111111000011111", 2))), v_st.mkBits(32, BigInt("10111000101000001100000000011111", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110100011111", 2))), v_st.mkBits(32, BigInt("10111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110010011111", 2))), v_st.mkBits(32, BigInt("10111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110001011111", 2))), v_st.mkBits(32, BigInt("10111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110000111111", 2))), v_st.mkBits(32, BigInt("10111000101000001100000000011111", 2)))))) then {
            v_X_read41__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
          } else {
            v_st.f_gen_store (v_X_read41__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
          }
          val v_Exp46__2 : RTSym = v_st.f_decl_bv("Exp46__2", BigInt(32)) 
          v_st.f_gen_store (v_Exp46__2,v_st.f_gen_Mem_read(BigInt(4), (if (((((((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111111000011111", 2))), v_st.mkBits(32, BigInt("10111000101000001100000000011111", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110100011111", 2))), v_st.mkBits(32, BigInt("10111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110010011111", 2))), v_st.mkBits(32, BigInt("10111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110001011111", 2))), v_st.mkBits(32, BigInt("10111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110000111111", 2))), v_st.mkBits(32, BigInt("10111000101000001100000000011111", 2)))))) then (v_X_read41__2_copyprop.v) else (v_st.f_gen_load(v_X_read41__2))), v_st.f_gen_int_lit(BigInt(4)), v_st.f_gen_int_lit(BigInt(6))))
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
            v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_load(v_Exp46__2), v_st.f_gen_int_lit(BigInt(64))))
          }
        }
      } else {
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))) then {
          val v_Exp53__2 : RTSym = v_st.f_decl_bv("Exp53__2", BigInt(64)) 
          v_st.f_gen_store (v_Exp53__2,v_st.f_gen_Mem_read(BigInt(8), v_st.f_gen_load(v_st.v_SP_EL0.v), v_st.f_gen_int_lit(BigInt(8)), v_st.f_gen_int_lit(BigInt(6))))
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
            v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_load(v_Exp53__2))
          }
        } else {
          val v_X_read56__2 : RTSym = v_st.f_decl_bv("X.read56__2", BigInt(64)) 
          val v_X_read56__2_copyprop = Mutable[RTSym](v_st.rTExprDefault)
          if (((((((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111111000011111", 2))), v_st.mkBits(32, BigInt("11111000101000001100000000011111", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110100011111", 2))), v_st.mkBits(32, BigInt("11111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110010011111", 2))), v_st.mkBits(32, BigInt("11111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110001011111", 2))), v_st.mkBits(32, BigInt("11111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110000111111", 2))), v_st.mkBits(32, BigInt("11111000101000001100000000011111", 2)))))) then {
            v_X_read56__2_copyprop.v = v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5))))
          } else {
            v_st.f_gen_store (v_X_read56__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
          }
          val v_Exp61__2 : RTSym = v_st.f_decl_bv("Exp61__2", BigInt(64)) 
          v_st.f_gen_store (v_Exp61__2,v_st.f_gen_Mem_read(BigInt(8), (if (((((((((v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111111000011111", 2))), v_st.mkBits(32, BigInt("11111000101000001100000000011111", 2)))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110100011111", 2))), v_st.mkBits(32, BigInt("11111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110010011111", 2))), v_st.mkBits(32, BigInt("11111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110001011111", 2))), v_st.mkBits(32, BigInt("11111000101000001100000000011111", 2)))))) || (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("11111111111000001111110000111111", 2))), v_st.mkBits(32, BigInt("11111000101000001100000000011111", 2)))))) then (v_X_read56__2_copyprop.v) else (v_st.f_gen_load(v_X_read56__2))), v_st.f_gen_int_lit(BigInt(8)), v_st.f_gen_int_lit(BigInt(6))))
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2)))))) then {
            v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5))),v_st.f_gen_load(v_Exp61__2))
          }
        }
      }
    }
  }
}
