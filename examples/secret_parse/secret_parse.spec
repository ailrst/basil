Globals: 
buf: char[11]
stext: char[11]
c: int

L: c -> true, buf -> c , stext -> false
Rely: c == old(c), old(Gamma_buf) ==> Gamma_buf
Guarantee: c ==> Gamma_buf

DIRECT functions: gamma_load64, gamma_load8, memory_load8_le, bvult64, bvule64, bvsub64, gamma_load32, bvuge64, bvugt64


Subroutine: main
Requires: Gamma_stext == false
Requires DIRECT: "gamma_load32(Gamma_mem, memory_load64_le(mem, $stext_addr))"
Requires DIRECT: "R31 == 100bv64"

  
Subroutine: mfree
Requires: DIRECT :: "(forall i:bv64:: (bvuge64(i, R0) && bvult64(i,  12)) ==> Gamma_mem[i])" : bool

Subroutine: memset
  Modifies: mem
  Requires DIRECT: "Gamma_R1"
  Ensures DIRECT: "(forall i: bv64 :: (Gamma_mem[i] == if (bvule64(R0, i) && bvult64(i,bvadd64(R0, R2))) then Gamma_R1 else (Gamma_mem[i])))"
  Ensures DIRECT: "(forall i: bv64 :: (mem[i] == if (bvule64(R0, i) && bvult64(i,bvadd64(R0, R2))) then R1[8:0] else old(memory_load8_le(mem, i))))"

  
Subroutine: strlen
  Ensures DIRECT: "Gamma_R0 == true"
  Ensures DIRECT: "(forall i: bv64 :: (bvule64(old(R0), i)) && (bvult64(i, bvadd64(old(R0), R0))) ==> mem[i] != 0bv8)"
  Ensures DIRECT: "(memory_load8_le(mem, bvadd64(old(R0), R0)) == 0bv8)"
  Ensures DIRECT: "(bvult64(old(R0), bvadd64(bvadd64(old(R0), R0), 1bv64)))"
