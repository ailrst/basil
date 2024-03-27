/* AUTO-GENERATED ASLp LIFTER FILE */
package aslloader
import util.Logger
import ir._

def f_aarch64_system_barriers_dsb (v_st: LiftState,v_enc: BitVecLiteral) : Unit = {
  if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2))) then {
    /*proc return */ ()
  } else {
    if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2))) then {
      /*proc return */ ()
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2))) then {
        /*proc return */ ()
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(10),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
          /*proc return */ ()
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
  if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(8),BigInt(2)), BitVecLiteral(BigInt("00", 2), 2))) then {
    /*proc return */ ()
  } else {
    if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(8),BigInt(2)), BitVecLiteral(BigInt("01", 2), 2))) then {
      /*proc return */ ()
    } else {
      if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(8),BigInt(2)), BitVecLiteral(BigInt("10", 2), 2))) then {
        /*proc return */ ()
      } else {
        if (f_eq_bits(v_st, BigInt(2), bvextract(v_st,v_enc,BigInt(8),BigInt(2)), BitVecLiteral(BigInt("11", 2), 2))) then {
          /*proc return */ ()
        } else {
          throw Exception("not supported")
        }
      }
    }
  }
}
