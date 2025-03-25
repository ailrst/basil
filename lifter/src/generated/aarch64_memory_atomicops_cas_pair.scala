/* AUTO-GENERATED ASLp LIFTER FILE */
package lifter

def f_aarch64_memory_atomicops_cas_pair[RTSym, RTLabel, BV <: RTSym] (v_st: LiftState[RTSym, RTLabel, BV],v_enc: BV,v_pc: BV) : Unit = {
  if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000010000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000010000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000001", 2)))) then {
      throw Exception("not supported")
    } else {
      if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("01000000000000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2)))) then {
        val v_If7__1 = Mutable[BV](v_st.mkBits(BigInt(8), BigInt(0)))
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
          v_If7__1.v = v_st.mkBits(8, BigInt("00001001", 2))
        } else {
          v_If7__1.v = v_st.mkBits(8, BigInt("00000101", 2))
        }
        val v_If8__1 = Mutable[BV](v_st.mkBits(BigInt(8), BigInt(0)))
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2)))) then {
          v_If8__1.v = v_st.mkBits(8, BigInt("00001001", 2))
        } else {
          v_If8__1.v = v_st.mkBits(8, BigInt("00000101", 2))
        }
        val v_X_read9__2 : RTSym = v_st.f_decl_bv("X.read9__2", BigInt(32)) 
        v_st.f_gen_store (v_X_read9__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))), BigInt(0), BigInt(32)))
        val v_X_read14__2 : RTSym = v_st.f_decl_bv("X.read14__2", BigInt(32)) 
        assert ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))))))
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111100000000000000000", 2)))))) then {
          v_st.f_gen_store (v_X_read14__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, ((v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))) + (BigInt(1)))), BigInt(0), BigInt(32)))
        } else {
          v_st.f_gen_store (v_X_read14__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
        }
        val v_X_read19__2 : RTSym = v_st.f_decl_bv("X.read19__2", BigInt(32)) 
        v_st.f_gen_store (v_X_read19__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))), BigInt(0), BigInt(32)))
        val v_X_read24__2 : RTSym = v_st.f_decl_bv("X.read24__2", BigInt(32)) 
        assert ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))))))
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011110", 2)))))) then {
          v_st.f_gen_store (v_X_read24__2,v_st.f_gen_slice(v_st.f_gen_array_load(v_st.v__R.v, ((v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))) + (BigInt(1)))), BigInt(0), BigInt(32)))
        } else {
          v_st.f_gen_store (v_X_read24__2,v_st.f_gen_bit_lit(BigInt(32), v_st.mkBits(32, BigInt("00000000000000000000000000000000", 2))))
        }
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))) then {
          v_st.f_AtomicStart ()
          val v_Exp167__3 : RTSym = v_st.f_decl_bv("Exp167__3", BigInt(64)) 
          v_st.f_gen_store (v_Exp167__3,v_st.f_gen_Mem_read(BigInt(8), v_st.f_gen_load(v_st.v_SP_EL0.v), v_st.f_gen_int_lit(BigInt(8)), v_st.f_gen_int_lit(v_st.f_cvt_bits_uint(BigInt(8), v_If7__1.v))))
          val v_temp0 : RTLabel = v_st.f_gen_branch(v_st.f_gen_eq_bits(BigInt(64), v_st.f_gen_load(v_Exp167__3), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_X_read14__2), v_st.f_gen_load(v_X_read9__2)))) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp0))
          v_st.f_gen_Mem_set (BigInt(8),v_st.f_gen_load(v_st.v_SP_EL0.v),v_st.f_gen_int_lit(BigInt(8)),v_st.f_gen_int_lit(v_st.f_cvt_bits_uint(BigInt(8), v_If8__1.v)),v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_X_read24__2), v_st.f_gen_load(v_X_read19__2)))
          v_st.f_switch_context (v_st.f_merge_branch(v_temp0))
          v_st.f_AtomicEnd ()
          v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp167__3), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))))
          assert ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))))))
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111100000000000000000", 2)))))) then {
            v_st.f_gen_array_store (v_st.v__R.v,((v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))) + (BigInt(1))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp167__3), BigInt(32), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))))
          }
        } else {
          val v_X_read373__2 : RTSym = v_st.f_decl_bv("X.read373__2", BigInt(64)) 
          v_st.f_gen_store (v_X_read373__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
          v_st.f_AtomicStart ()
          val v_Exp379__3 : RTSym = v_st.f_decl_bv("Exp379__3", BigInt(64)) 
          v_st.f_gen_store (v_Exp379__3,v_st.f_gen_Mem_read(BigInt(8), v_st.f_gen_load(v_X_read373__2), v_st.f_gen_int_lit(BigInt(8)), v_st.f_gen_int_lit(v_st.f_cvt_bits_uint(BigInt(8), v_If7__1.v))))
          val v_temp1 : RTLabel = v_st.f_gen_branch(v_st.f_gen_eq_bits(BigInt(64), v_st.f_gen_load(v_Exp379__3), v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_X_read14__2), v_st.f_gen_load(v_X_read9__2)))) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp1))
          v_st.f_gen_Mem_set (BigInt(8),v_st.f_gen_load(v_X_read373__2),v_st.f_gen_int_lit(BigInt(8)),v_st.f_gen_int_lit(v_st.f_cvt_bits_uint(BigInt(8), v_If8__1.v)),v_st.f_gen_append_bits(BigInt(32), BigInt(32), v_st.f_gen_load(v_X_read24__2), v_st.f_gen_load(v_X_read19__2)))
          v_st.f_switch_context (v_st.f_merge_branch(v_temp1))
          v_st.f_AtomicEnd ()
          v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp379__3), BigInt(0), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))))
          assert ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))))))
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111100000000000000000", 2)))))) then {
            v_st.f_gen_array_store (v_st.v__R.v,((v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))) + (BigInt(1))),v_st.f_gen_ZeroExtend(BigInt(32), BigInt(64), v_st.f_gen_slice(v_st.f_gen_load(v_Exp379__3), BigInt(32), BigInt(32)), v_st.f_gen_int_lit(BigInt(64))))
          }
        }
      } else {
        val v_If586__1 = Mutable[BV](v_st.mkBits(BigInt(8), BigInt(0)))
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2))), v_st.mkBits(32, BigInt("00000000010000000000000000000000", 2)))) then {
          v_If586__1.v = v_st.mkBits(8, BigInt("00001001", 2))
        } else {
          v_If586__1.v = v_st.mkBits(8, BigInt("00000101", 2))
        }
        val v_If587__1 = Mutable[BV](v_st.mkBits(BigInt(8), BigInt(0)))
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000000001000000000000000", 2)))) then {
          v_If587__1.v = v_st.mkBits(8, BigInt("00001001", 2))
        } else {
          v_If587__1.v = v_st.mkBits(8, BigInt("00000101", 2))
        }
        val v_X_read588__2 : RTSym = v_st.f_decl_bv("X.read588__2", BigInt(64)) 
        v_st.f_gen_store (v_X_read588__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))))
        val v_X_read593__2 : RTSym = v_st.f_decl_bv("X.read593__2", BigInt(64)) 
        assert ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))))))
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111100000000000000000", 2)))))) then {
          v_st.f_gen_store (v_X_read593__2,v_st.f_gen_array_load(v_st.v__R.v, ((v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))) + (BigInt(1)))))
        } else {
          v_st.f_gen_store (v_X_read593__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
        }
        val v_X_read598__2 : RTSym = v_st.f_decl_bv("X.read598__2", BigInt(64)) 
        v_st.f_gen_store (v_X_read598__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))))
        val v_X_read603__2 : RTSym = v_st.f_decl_bv("X.read603__2", BigInt(64)) 
        assert ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))))))
        if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000000000011111", 2))), v_st.mkBits(32, BigInt("00000000000000000000000000011110", 2)))))) then {
          v_st.f_gen_store (v_X_read603__2,v_st.f_gen_array_load(v_st.v__R.v, ((v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(0),BigInt(5)))) + (BigInt(1)))))
        } else {
          v_st.f_gen_store (v_X_read603__2,v_st.f_gen_bit_lit(BigInt(64), v_st.mkBits(64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
        }
        if (v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2))), v_st.mkBits(32, BigInt("00000000000000000000001111100000", 2)))) then {
          v_st.f_AtomicStart ()
          val v_Exp746__3 : RTSym = v_st.f_decl_bv("Exp746__3", BigInt(128)) 
          v_st.f_gen_store (v_Exp746__3,v_st.f_gen_Mem_read(BigInt(16), v_st.f_gen_load(v_st.v_SP_EL0.v), v_st.f_gen_int_lit(BigInt(16)), v_st.f_gen_int_lit(v_st.f_cvt_bits_uint(BigInt(8), v_If586__1.v))))
          val v_temp2 : RTLabel = v_st.f_gen_branch(v_st.f_gen_eq_bits(BigInt(128), v_st.f_gen_load(v_Exp746__3), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_load(v_X_read593__2), v_st.f_gen_load(v_X_read588__2)))) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp2))
          v_st.f_gen_Mem_set (BigInt(16),v_st.f_gen_load(v_st.v_SP_EL0.v),v_st.f_gen_int_lit(BigInt(16)),v_st.f_gen_int_lit(v_st.f_cvt_bits_uint(BigInt(8), v_If587__1.v)),v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_load(v_X_read603__2), v_st.f_gen_load(v_X_read598__2)))
          v_st.f_switch_context (v_st.f_merge_branch(v_temp2))
          v_st.f_AtomicEnd ()
          v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5))),v_st.f_gen_slice(v_st.f_gen_load(v_Exp746__3), BigInt(0), BigInt(64)))
          assert ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))))))
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111100000000000000000", 2)))))) then {
            v_st.f_gen_array_store (v_st.v__R.v,((v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))) + (BigInt(1))),v_st.f_gen_slice(v_st.f_gen_load(v_Exp746__3), BigInt(64), BigInt(64)))
          }
        } else {
          val v_X_read952__2 : RTSym = v_st.f_decl_bv("X.read952__2", BigInt(64)) 
          v_st.f_gen_store (v_X_read952__2,v_st.f_gen_array_load(v_st.v__R.v, v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(5),BigInt(5)))))
          v_st.f_AtomicStart ()
          val v_Exp958__3 : RTSym = v_st.f_decl_bv("Exp958__3", BigInt(128)) 
          v_st.f_gen_store (v_Exp958__3,v_st.f_gen_Mem_read(BigInt(16), v_st.f_gen_load(v_X_read952__2), v_st.f_gen_int_lit(BigInt(16)), v_st.f_gen_int_lit(v_st.f_cvt_bits_uint(BigInt(8), v_If586__1.v))))
          val v_temp3 : RTLabel = v_st.f_gen_branch(v_st.f_gen_eq_bits(BigInt(128), v_st.f_gen_load(v_Exp958__3), v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_load(v_X_read593__2), v_st.f_gen_load(v_X_read588__2)))) 
          v_st.f_switch_context (v_st.f_true_branch(v_temp3))
          v_st.f_gen_Mem_set (BigInt(16),v_st.f_gen_load(v_X_read952__2),v_st.f_gen_int_lit(BigInt(16)),v_st.f_gen_int_lit(v_st.f_cvt_bits_uint(BigInt(8), v_If587__1.v)),v_st.f_gen_append_bits(BigInt(64), BigInt(64), v_st.f_gen_load(v_X_read603__2), v_st.f_gen_load(v_X_read598__2)))
          v_st.f_switch_context (v_st.f_merge_branch(v_temp3))
          v_st.f_AtomicEnd ()
          v_st.f_gen_array_store (v_st.v__R.v,v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5))),v_st.f_gen_slice(v_st.f_gen_load(v_Exp958__3), BigInt(0), BigInt(64)))
          assert ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))))))
          if ( (!(v_st.f_eq_bits(BigInt(32), v_st.f_and_bits(BigInt(32), v_enc, v_st.mkBits(32, BigInt("00000000000111110000000000000000", 2))), v_st.mkBits(32, BigInt("00000000000111100000000000000000", 2)))))) then {
            v_st.f_gen_array_store (v_st.v__R.v,((v_st.f_cvt_bits_uint(BigInt(5), v_st.bvextract(v_enc,BigInt(16),BigInt(5)))) + (BigInt(1))),v_st.f_gen_slice(v_st.f_gen_load(v_Exp958__3), BigInt(64), BigInt(64)))
          }
        }
      }
    }
  }
}
