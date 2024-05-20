/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_system_register_cpsr (v_st: LiftState,v_enc: BV,v_pc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) then {
    throw Exception("not supported")
  } else {
    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000100000", 2)))) then {
      throw Exception("not supported")
    } else {
      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000001000000", 2)))) then {
        throw Exception("not supported")
      } else {
        val v_min_EL__2 = Mutable[BV](mkBits(v_st, BigInt(2), BigInt(0)))
        if (((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001100000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001010000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))))) then {
          v_min_EL__2.v = mkBits(v_st, 2, BigInt("01", 2))
        } else {
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000110000000000000000", 2)))) then {
            v_min_EL__2.v = mkBits(v_st, 2, BigInt("00", 2))
          } else {
            if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000001000000000000000000", 2)))) then {
              v_min_EL__2.v = mkBits(v_st, 2, BigInt("10", 2))
            } else {
              if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000001010000000000000000", 2)))) then {
                v_min_EL__2.v = mkBits(v_st, 2, BigInt("10", 2))
              } else {
                if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000001100000000000000000", 2)))) then {
                  v_min_EL__2.v = mkBits(v_st, 2, BigInt("11", 2))
                } else {
                  v_min_EL__2.v = mkBits(v_st, 2, BigInt("01", 2))
                }
              }
            }
          }
        }
        val v_If13__1 = Mutable[Boolean](true)
        if (f_slt_bits(v_st, BigInt(3), mkBits(v_st, 3, BigInt("000", 2)), f_ZeroExtend(v_st, BigInt(2), BigInt(3), v_min_EL__2.v, BigInt(3)))) then {
          v_If13__1.v = true
        } else {
          val v_If14__1 = Mutable[Boolean](true)
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000001110000000000000000", 2)))) then {
            v_If14__1.v = false
          } else {
            v_If14__1.v = false
          }
          v_If13__1.v = v_If14__1.v
        }
        if (v_If13__1.v) then {
          throw Exception("not supported")
        } else {
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000001100000", 2)))) then {
            /*proc return */ ()
          } else {
            if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000010000000", 2)))) then {
              /*proc return */ ()
            } else {
              if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000010100000", 2)))) then {
                /*proc return */ ()
              } else {
                if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000110000000001000000", 2)))) then {
                  /*proc return */ ()
                } else {
                  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000110000000010000000", 2)))) then {
                    throw Exception("not supported")
                  } else {
                    if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000110000000011000000", 2)))) then {
                      /*proc return */ ()
                    } else {
                      if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000110000000011100000", 2)))) then {
                        /*proc return */ ()
                      } else {
                        if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000110000000000100000", 2)))) then {
                          /*proc return */ ()
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
          if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011000000", 2))), mkBits(v_st, 32, BigInt("00000000000000110000000011000000", 2)))) then {
            if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000110000000011000000", 2)))) then {
              f_gen_store (v_st,v_PSTATE_D.v,f_gen_or_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_D.v), f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)))))
              f_gen_store (v_st,v_PSTATE_A.v,f_gen_or_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_A.v), f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(10),BigInt(1)))))
              f_gen_store (v_st,v_PSTATE_I.v,f_gen_or_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_I.v), f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(9),BigInt(1)))))
              f_gen_store (v_st,v_PSTATE_F.v,f_gen_or_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_F.v), f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(8),BigInt(1)))))
            } else {
              f_gen_store (v_st,v_PSTATE_D.v,f_gen_and_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_D.v), f_gen_bit_lit(v_st, BigInt(1), f_not_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1))))))
              f_gen_store (v_st,v_PSTATE_A.v,f_gen_and_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_A.v), f_gen_bit_lit(v_st, BigInt(1), f_not_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(10),BigInt(1))))))
              f_gen_store (v_st,v_PSTATE_I.v,f_gen_and_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_I.v), f_gen_bit_lit(v_st, BigInt(1), f_not_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(9),BigInt(1))))))
              f_gen_store (v_st,v_PSTATE_F.v,f_gen_and_bits(v_st, BigInt(1), f_gen_load(v_st, v_PSTATE_F.v), f_gen_bit_lit(v_st, BigInt(1), f_not_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(8),BigInt(1))))))
            }
          } else {
            if (((((((((((((f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000100000000011000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000011000000", 2)))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000010000000010100000", 2))), mkBits(v_st, 32, BigInt("00000000000000010000000000100000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000100000000001100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000001000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000010000000001000000", 2))), mkBits(v_st, 32, BigInt("00000000000000010000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000110000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000000100000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001000000000000000000", 2))), mkBits(v_st, 32, BigInt("00000000000001000000000000000000", 2)))))) || (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000000000000000011000000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000000000000", 2)))))) then {
              f_gen_store (v_st,v_PSTATE_SSBS.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(8),BigInt(1))))
            } else {
              if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000010100000", 2)))) then {
                throw Exception("not supported")
              } else {
                if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000010000000", 2)))) then {
                  f_gen_store (v_st,v_PSTATE_PAN.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(8),BigInt(1))))
                } else {
                  if (f_eq_bits(v_st, BigInt(32), f_and_bits(v_st, BigInt(32), v_enc, mkBits(v_st, 32, BigInt("00000000000001110000000011100000", 2))), mkBits(v_st, 32, BigInt("00000000000000000000000001100000", 2)))) then {
                    f_gen_store (v_st,v_PSTATE_UAO.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(8),BigInt(1))))
                  } else {
                    f_gen_store (v_st,v_PSTATE_DIT.v,f_gen_bit_lit(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(8),BigInt(1))))
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
