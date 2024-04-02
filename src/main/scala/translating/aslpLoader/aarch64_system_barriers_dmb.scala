/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_system_barriers_dmb (v_st: LiftState,v_enc: BV) : Unit = {
  if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2)))) then {
    /*proc return */ ()
  } else {
    if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2)))) then {
      /*proc return */ ()
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2)))) then {
        /*proc return */ ()
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))) then {
          /*proc return */ ()
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
  if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(8),BigInt(2)), mkBits(v_st, 2, BigInt("00", 2)))) then {
    /*proc return */ ()
  } else {
    if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(8),BigInt(2)), mkBits(v_st, 2, BigInt("01", 2)))) then {
      /*proc return */ ()
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(8),BigInt(2)), mkBits(v_st, 2, BigInt("10", 2)))) then {
        /*proc return */ ()
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(8),BigInt(2)), mkBits(v_st, 2, BigInt("11", 2)))) then {
          /*proc return */ ()
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
}
