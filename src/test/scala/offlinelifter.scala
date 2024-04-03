
package ir

import scala.collection.mutable
import scala.collection.immutable.*
import org.scalatest.funsuite.AnyFunSuite
import util.intrusive_list.*
import ir.dsl.*
import aslloader._
import util.Logger
import ir._

class OfflineLifterTest extends AnyFunSuite {


  val insns = io.Source.fromFile("src/test/lifter/instructions.txt").getLines.toSet
  val dec = A64_decoder()
  for (insn <- insns) {
    test(s"decode $insn") {
      val liftState = LiftState()
      dec.decode(liftState, BitVecLiteral(BigInt(insn.stripPrefix("0x"), 16), 32))
      //println(liftState.blocks)
    }
  }

  test("liftasm") {
    var liftState = LiftState()
    val dec = A64_decoder()

    val r = dec.decode(liftState, BitVecLiteral(0x91000661, 32)) 
    println(s"decoded ")
    liftState.blocks.foreach((k,v) => v.foreach(println))


    liftState = LiftState()
    dec.decode(liftState, BitVecLiteral(0xf0fe0e00, 32))
    println(s"decoded ")




    println(prog(proc("beans", Lifter.liftOpcode(0x91000661))))

  }




}
