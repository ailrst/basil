package translating
import com.google.protobuf.ByteString
import com.grammatech.gtirb.proto.CFG.EdgeType.*
import com.grammatech.gtirb.proto.CFG.CFG
import com.grammatech.gtirb.proto.CFG.Edge
import com.grammatech.gtirb.proto.CFG.EdgeLabel
import com.grammatech.gtirb.proto.CodeBlock.CodeBlock
import com.grammatech.gtirb.proto.Module.Module
import com.grammatech.gtirb.proto.Symbol.Symbol
import com.grammatech.gtirb.proto.ByteInterval._
import gtirb.*
import ir.*

import scala.collection.mutable
import scala.collection.mutable.Set
import scala.collection.mutable.Map
import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable
import scala.jdk.CollectionConverters.*
import java.util.Base64
import java.nio.charset.*
import scala.util.boundary
import boundary.break
import java.nio.ByteBuffer
import util.intrusive_list.*
import util.Logger
import aslloader._

def lgtirb(mods: Seq[Module], cfg: CFG, mainAddress: Int): Unit = {
  val functionNames = MapDecoder.decode_uuid(mods.map(_.auxData("functionNames").data))
  val functionEntries = MapDecoder.decode_set(mods.map(_.auxData("functionEntries").data))
  val functionBlocks = MapDecoder.decode_set(mods.map(_.auxData("functionBlocks").data))

  val blocks = mods.flatMap(_.sections).flatMap(_.byteIntervals).map(bi => (bi.blocks.toList, bi.contents))

  case class BlockPos(uuid:ByteString, offset: Long, size: Long, content: ByteString)
  println("p")
  val codeblocks = blocks.flatMap((bl, cont) => bl.collect(
    b => b.value.code match {
      case Some(c) =>  BlockPos(c.uuid, b.offset, c.size, cont.substring(b.offset.toInt, (b.offset + c.size).toInt))
    }
  ))

  def bytesToi32(bytes: Array[Byte], littleEndian: Boolean): Int = {
    val buffer = java.nio.ByteBuffer.wrap(bytes)
    if (littleEndian) {
      buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN).getInt
    } else {
      buffer.getInt
    }
  }

  val opsize = 4
  val opcodes = codeblocks.map(b => (b.uuid, Range.Exclusive(0, b.size.toInt, opsize)
    .map(i => b.content.substring(i, i + opsize))
    .map(b => bytesToi32(b.toByteArray, true))))



  def liftBlock(ops: Iterable[Int]) = {
    var liftState = LiftState()
    val dec = A64_decoder()
      ops.foreach(op =>
        try {
        dec.decode(liftState, BitVecLiteral(BigInt(op), 32))
        } catch {
          case e: Exception => println(s"Error on (${op.toHexString}) $e")
          case e: NotImplementedError => println(s"Not implemented (${op.toHexString}) $e ${e.printStackTrace()}")
        }
      )
    liftState.toIR()
  }


  val semblocks = opcodes.map((uid, opcodes) => (uid, liftBlock(opcodes)))


}
