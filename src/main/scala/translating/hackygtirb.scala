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

var namecounter = 0

def lgtirb(mods: Seq[Module], cfg: CFG, mainAddress: Int): Program = {
  val functionNames = MapDecoder.decode_uuid(mods.map(_.auxData("functionNames").data))
  val functionEntries = MapDecoder.decode_set(mods.map(_.auxData("functionEntries").data))
  val functionBlocks = MapDecoder.decode_set(mods.map(_.auxData("functionBlocks").data))

  val blocks = mods.flatMap(_.sections).flatMap(_.byteIntervals).map(bi => (bi.blocks.toList, bi.contents))

  case class BlockPos(uuid:ByteString, offset: Long, size: Long, content: ByteString)
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


  val names = mods.flatMap(_.symbols).map(s => s.getReferentUuid -> s.name).toMap
  val symbol_names = mods.flatMap(_.symbols).map(s => s.uuid -> s.name).toMap

  def liftBlock(label: String, ops: Iterable[Int]) = {
    var liftState = LiftState(label)
    val dec = A64_decoder()
      ops.foreach(op =>
        try {
        dec.decode(liftState, BitVecLiteral(BigInt(op), 32))
        } catch {
          case e: Exception => {
            Logger.warn(s"Disassembly error on ${op.toHexString} (using NOP) : $e\n${e.getStackTrace.map(_.toString).mkString("\n  ")} ")
            liftState.push_stmt(NOP(Some(s"Potentially mis-lifted from ${op.toHexString}")))
          }
          case e: NotImplementedError => {
            Logger.warn(s"Disassembly not implemented ${op.toHexString} (using NOP) : $e\n  ${e.getStackTrace.map(_.toString).mkString("\n  ")}")
            liftState.push_stmt(NOP(Some(s"Potentially mis-lifted from ${op.toHexString}")))
          }
        }
      )
    liftState
  }


  val semblocks = opcodes.map((uid, opcodes) => (uid -> {
    val label = names.getOrElse(uid, s"block ${namecounter += 1}" )
    liftBlock(label, opcodes)
  })).toMap
  val proxies = mods.flatMap(_.proxies).map(_.uuid).map(u => (u -> {
    val label = names.getOrElse(u, s"block ${namecounter += 1}")
    LiftState(label)
  })).toMap
  val allblocks = semblocks ++ proxies

  val procedure_names = functionNames.map((functionUUID, symbolUUID) => (functionEntries(functionUUID).head, symbol_names(symbolUUID)))
  val procedures = proxies.map((u,f) => u -> f.entry).toMap ++ procedure_names.map((fuid, _) => fuid -> allblocks(fuid).entry).toMap

  val verts_not_blocks = cfg.vertices.toSet.diff(allblocks.keySet)
  assert(verts_not_blocks.isEmpty)

  val calls = cfg.edges.collect(e => e.label match {
    case Some(EdgeLabel(false, true, Type_Branch, _)) if (procedures.keySet.contains(e.sourceUuid)) => e.sourceUuid -> e
  }).toMap

  val noreturn_calls = cfg.edges.collect(e => e.label match {
    case Some(EdgeLabel(false, true, Type_Call, _)) => e.sourceUuid -> e
  }).toMap

  val fallthroughs = cfg.edges.collect(e => e.label match {
    case Some(EdgeLabel(false, true, Type_Fallthrough, _))  => e.sourceUuid -> e
  }).toMap

  val returns = cfg.edges.collect(e => e.label match {
    case Some(EdgeLabel(false, true, Type_Return, _)) => e
  })

  val gotos = cfg.edges.collect(e => e.label match {
    case Some(EdgeLabel(false, true, Type_Branch, _)) if (!(procedures.keySet.contains(e.sourceUuid))) => e
  })

  calls.foreach((from, c) => {
    val call = dsl.call(procedures(c.targetUuid), fallthroughs.get(from).map(c => allblocks(c.targetUuid).entry))
    allblocks(from).add_call(call)
  })

  noreturn_calls.foreach((from, c) => {
    val call = dsl.call(procedures(c.targetUuid), None)
    allblocks(from).add_call(call)
  })

  returns.foreach((c) => {
    allblocks(c.sourceUuid).add_call(dsl.ret)
  })


  gotos.map(e => (e.sourceUuid, allblocks(e.targetUuid).entry))
    .groupBy((b,_) => b)
    .foreach((e, os) => allblocks(e).add_call(dsl.goto(os.map(_._2).toList)))


  var real_procedures = procedure_names.map((fuid, fname) => fname -> allblocks(fuid)).toMap
  val label_to_sem = allblocks.map((uid, b) => b.entry -> b).toMap

  var done = false
  while (!done) {
    // merge block semantics under transitive closure of jumps. 
    done = true
    real_procedures.foreach((fname, sem) => {
      sem.escaping_jumps.foreach(jtgt => {
        sem.merge_state(label_to_sem(jtgt))
        done = false
      })
    })
  }

  val p = dsl.prog(real_procedures.map((fname, blocks) => dsl.proc(fname, blocks.toIR())).toList)
  val s = serialiseIL(p) 
  Logger.info(s)

  p
}
