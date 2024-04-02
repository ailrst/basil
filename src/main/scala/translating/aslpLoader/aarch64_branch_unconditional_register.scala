/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_branch_unconditional_register (v_st: LiftState,v_enc: BV) : Unit = {
  val v_branch_type__1 = Mutable[BV](mkBits(v_st, BigInt(4), BigInt(0)))
  if ((( (!(f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))))) && (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("00000", 2)))))) then {
    throw Exception("not supported")
  } else {
    val v_If5__1 = Mutable[Boolean](true)
    if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
      v_If5__1.v = false
    } else {
      v_If5__1.v = false
    }
    if (v_If5__1.v) then {
      throw Exception("not supported")
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2)))) then {
        v_branch_type__1.v = mkBits(v_st, 4, BigInt("0110", 2))
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2)))) then {
          v_branch_type__1.v = mkBits(v_st, 4, BigInt("0001", 2))
        } else {
          if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(21),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2)))) then {
            v_branch_type__1.v = mkBits(v_st, 4, BigInt("0100", 2))
          } else {
            throw Exception("not supported")
          }
        }
      }
      if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
        if (((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(24),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) && (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))))) then {
          throw Exception("not supported")
        } else {
          if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
            if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
              throw Exception("not supported")
            } else {
              val v_Exp11__2 : RTSym = f_decl_bv(v_st, "Exp11__2", BigInt(64)) 
              f_gen_store (v_st,v_Exp11__2,f_gen_array_load(v_st, v__R.v, BigInt(30)))
              if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
                if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(10),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                    f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
                    if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
                    } else {
                      if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                      } else {
                        if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                          f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                        } else {
                          throw Exception("not supported")
                        }
                      }
                    }
                    f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
                    f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_Exp11__2))
                  } else {
                    if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
                    } else {
                      if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                      } else {
                        if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                          f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                        } else {
                          throw Exception("not supported")
                        }
                      }
                    }
                    f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
                    f_gen_store (v_st,v__PC.v,f_gen_array_load(v_st, v__R.v, BigInt(30)))
                  }
                } else {
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                    f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
                    if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
                    } else {
                      if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                      } else {
                        if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                          f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                        } else {
                          throw Exception("not supported")
                        }
                      }
                    }
                    f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
                    f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_Exp11__2))
                  } else {
                    if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
                    } else {
                      if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                      } else {
                        if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                          f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                        } else {
                          throw Exception("not supported")
                        }
                      }
                    }
                    f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
                    f_gen_store (v_st,v__PC.v,f_gen_array_load(v_st, v__R.v, BigInt(30)))
                  }
                }
              } else {
                if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                  f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                    f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
                  } else {
                    if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                    } else {
                      if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                      } else {
                        throw Exception("not supported")
                      }
                    }
                  }
                  f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
                  f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_Exp11__2))
                } else {
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                    f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
                  } else {
                    if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                    } else {
                      if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                      } else {
                        throw Exception("not supported")
                      }
                    }
                  }
                  f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
                  f_gen_store (v_st,v__PC.v,f_gen_array_load(v_st, v__R.v, BigInt(30)))
                }
              }
            }
          } else {
            val v_X_read58__2 : RTSym = f_decl_bv(v_st, "X.read58__2", BigInt(64)) 
            assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
            if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
              f_gen_store (v_st,v_X_read58__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
            } else {
              f_gen_store (v_st,v_X_read58__2,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
            }
            if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
              if (((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(24),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) && (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))))) then {
                /*proc return */ ()
              } else {
                assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
              }
              if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(10),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
                if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                  f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                    f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
                  } else {
                    if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                    } else {
                      if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                      } else {
                        throw Exception("not supported")
                      }
                    }
                  }
                  f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
                  f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read58__2))
                } else {
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                    f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
                  } else {
                    if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                    } else {
                      if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                      } else {
                        throw Exception("not supported")
                      }
                    }
                  }
                  f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
                  f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read58__2))
                }
              } else {
                if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                  f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                    f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
                  } else {
                    if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                    } else {
                      if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                      } else {
                        throw Exception("not supported")
                      }
                    }
                  }
                  f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
                  f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read58__2))
                } else {
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                    f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
                  } else {
                    if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                    } else {
                      if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                        f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                      } else {
                        throw Exception("not supported")
                      }
                    }
                  }
                  f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
                  f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read58__2))
                }
              }
            } else {
              if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
                if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                  f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
                } else {
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                    f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                  } else {
                    if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                    } else {
                      throw Exception("not supported")
                    }
                  }
                }
                f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
                f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read58__2))
              } else {
                if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                  f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
                } else {
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                    f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                  } else {
                    if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                      f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                    } else {
                      throw Exception("not supported")
                    }
                  }
                }
                f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
                f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read58__2))
              }
            }
          }
        }
      } else {
        val v_X_read115__2 : RTSym = f_decl_bv(v_st, "X.read115__2", BigInt(64)) 
        assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
        if (f_ne_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))) then {
          f_gen_store (v_st,v_X_read115__2,f_gen_array_load(v_st, v__R.v, f_cvt_bits_uint(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(5),BigInt(5)))))
        } else {
          f_gen_store (v_st,v_X_read115__2,f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000000", 2))))
        }
        if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(11),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) then {
          if (((f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(24),BigInt(1)), mkBits(v_st, 1, BigInt("1", 2)))) && (f_eq_bits(v_st, BigInt(5), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), mkBits(v_st, 5, BigInt("11111", 2)))))) then {
            /*proc return */ ()
          } else {
            assert (((f_sle_bits(v_st, BigInt(6), mkBits(v_st, 6, BigInt("000000", 2)), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)))) && (f_sle_bits(v_st, BigInt(6), f_ZeroExtend(v_st, BigInt(5), BigInt(6), bvextract(v_st,v_enc,BigInt(0),BigInt(5)), BigInt(6)), mkBits(v_st, 6, BigInt("011111", 2))))))
          }
          if (f_eq_bits(v_st, BigInt(1), bvextract(v_st,v_enc,BigInt(10),BigInt(1)), mkBits(v_st, 1, BigInt("0", 2)))) then {
            if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
              f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
              if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
              } else {
                if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                  f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                } else {
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                    f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                  } else {
                    throw Exception("not supported")
                  }
                }
              }
              f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
              f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read115__2))
            } else {
              if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
              } else {
                if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                  f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                } else {
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                    f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                  } else {
                    throw Exception("not supported")
                  }
                }
              }
              f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
              f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read115__2))
            }
          } else {
            if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
              f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
              if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
              } else {
                if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                  f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                } else {
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                    f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                  } else {
                    throw Exception("not supported")
                  }
                }
              }
              f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
              f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read115__2))
            } else {
              if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
                f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
              } else {
                if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                  f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
                } else {
                  if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                    f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                  } else {
                    throw Exception("not supported")
                  }
                }
              }
              f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
              f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read115__2))
            }
          }
        } else {
          if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
            f_gen_array_store (v_st,v__R.v,BigInt(30),f_gen_add_bits(v_st, BigInt(64), f_gen_load(v_st, v__PC.v), f_gen_bit_lit(v_st, BigInt(64), mkBits(v_st, 64, BigInt("0000000000000000000000000000000000000000000000000000000000000100", 2)))))
            if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
              f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
            } else {
              if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
              } else {
                if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                  f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                } else {
                  throw Exception("not supported")
                }
              }
            }
            f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
            f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read115__2))
          } else {
            if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0110", 2)))) then {
              f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("01", 2))))
            } else {
              if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0001", 2)))) then {
                f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("10", 2))))
              } else {
                if (f_eq_bits(v_st, BigInt(4), v_branch_type__1.v, mkBits(v_st, 4, BigInt("0100", 2)))) then {
                  f_gen_store (v_st,v_BTypeNext.v,f_gen_bit_lit(v_st, BigInt(2), mkBits(v_st, 2, BigInt("00", 2))))
                } else {
                  throw Exception("not supported")
                }
              }
            }
            f_gen_store (v_st,v___BranchTaken.v,f_gen_bool_lit(v_st, true))
            f_gen_store (v_st,v__PC.v,f_gen_load(v_st, v_X_read115__2))
          }
        }
      }
    }
  }
}
