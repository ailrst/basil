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

def new_name ()= {
  namecounter += 1
  namecounter.toHexString
}

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
    val label = names.getOrElse(uid, s"block${new_name()}" )
    liftBlock(label, opcodes)
  })).toMap
  val proxies = mods.flatMap(_.proxies).map(_.uuid).map(u => (u -> {
    val label : String = names.getOrElse(u, s"block${new_name()}")
    LiftState(label)
  })).toMap
  val allblocks = semblocks ++ proxies

  val procedure_names = functionNames.map((functionUUID, symbolUUID) => (functionEntries(functionUUID).head, symbol_names(symbolUUID)))
  val procedures = proxies.map((u,f) => u -> f.entry).toMap ++ procedure_names.map((fuid, _) => fuid -> allblocks(fuid).entry).toMap

  val verts_not_blocks = cfg.vertices.toSet.diff(allblocks.keySet)
  assert(verts_not_blocks.isEmpty)


  val conds = cfg.vertices.map(v => {
    cfg.edges.filter (e =>  e.sourceUuid == v && e.label.map(_.conditional).contains(true))
  }).filter(_.size > 0).map(c => {
    val ft = c.filter { e =>
      e.label match {
        case Some(EdgeLabel(_, _, Type_Fallthrough, _)) =>  true
        case _ => false
      }
    }

    val gt = c.filter { e =>
      e.label match {
        case Some(EdgeLabel(_, _, Type_Branch, _)) =>  true
        case _ => false
      }
    }

    assert(ft.size == 1)
    assert(gt.size == 1)
    assert(gt.toSet ++ ft.toSet == (c.toSet))

    (gt.head, ft.head)
  })


  val calls = cfg.edges.collect(e => e.label match {
    case Some(EdgeLabel(false, _, Type_Branch, _)) if (procedures.keySet.contains(e.sourceUuid)) => e.sourceUuid -> e
  }).toMap

  val indir_calls = cfg.edges.collect(e => e.label match {
    case Some(EdgeLabel(false, _, Type_Branch, _)) if (procedures.keySet.contains(e.sourceUuid)) => e.sourceUuid -> e
  }).toMap
   ++  cfg.edges.collect(e => e.label match {
    case Some(EdgeLabel(false, _, Type_Call, _)) => e.sourceUuid -> e
  }).toMap

  val noreturn_calls = cfg.edges.collect(e => e.label match {
    case Some(EdgeLabel(false, _, Type_Call, _)) => e.sourceUuid -> e
  }).toMap

  val fallthroughs = cfg.edges.collect(e => e.label match {
    case Some(EdgeLabel(false, _, Type_Fallthrough, _))  => e.sourceUuid -> e
  }).toMap

  val returns = cfg.edges.collect(e => e.label match {
    case Some(EdgeLabel(false, _, Type_Return, _)) => e
  })

  val gotos = cfg.edges.collect(e => e.label match {
    case Some(EdgeLabel(false, _, Type_Branch, _)) if (!(procedures.keySet.contains(e.sourceUuid))) => e
  })



  calls.foreach((from, c) => {
    val ft = fallthroughs.get(c.sourceUuid)
    val call = dsl.call(procedures(c.targetUuid), ft.map(c => allblocks(c.targetUuid).entry))
    Logger.debug(s"call $call $from ${fallthroughs.get(from)}")
    allblocks(from).add_call(call)
  })

  fallthroughs.foreach((f, edge) => {
    val edg = cfg.edges.filter(e => e.sourceUuid == f && e != f)
    Logger.debug(s"Fallthrough $f : $edg")
  })


  Logger.debug(s"Fallthroughs ${fallthroughs.map((f,t) => allblocks(t.targetUuid).entry)}")

  Logger.debug(s"edges: ${(cfg.edges.map(e => (e.label, allblocks(e.sourceUuid).entry, allblocks(e.targetUuid).entry))).mkString("\n")}")

  noreturn_calls.foreach((from, c) => {
    val ft = fallthroughs.get(c.sourceUuid).map(c => allblocks(c.targetUuid).entry)
    val call = dsl.call(procedures(c.targetUuid), ft)
    Logger.debug(s"call $call")
    allblocks(from).add_call(call)
  })

  returns.foreach((c) => {
    allblocks(c.sourceUuid).add_call(dsl.ret)
  })

  gotos.map(e => (e.sourceUuid, allblocks(e.targetUuid).entry))
    .groupBy((b,_) => b)
    .foreach((e, os) => allblocks(e).add_call(dsl.goto(os.map(_._2).toList)))

  conds.map((e, ft) => (e.sourceUuid , List(allblocks(e.targetUuid).entry, allblocks(ft.targetUuid).entry)))
  .foreach((s, b) => allblocks(s).add_call(dsl.goto(b.toList)))



  val proxy_names = proxies.map((uid, ls) => names.get(uid).getOrElse(symbol_names.get(uid).getOrElse(ls.entry)) -> ls)
  var real_procedures = procedure_names.map((fuid, fname) => fname -> allblocks(fuid)).toMap ++ proxy_names
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



  class CleanupVis extends Visitor {
    override def visitBlock(node: ir.Block): ir.Block = {
      for (s: Statement <- node.statements) {
        s match {
          case LocalAssign(l: Variable, r, _) if (l.name) == "BTypeNext"  || (l.name) == "__BranchTaken" => node.statements.remove(s)
          case _ => ()
        }
      }
      visitJump(node.jump)
      node
    }
  }


  class VRenamer() extends Visitor {


    def fix(s:String) = s.stripPrefix("?:").stripSuffix("()").replace("(", "").replace(")", "")

    override def visitLocalVar(node: LocalVar): LocalVar = {
      node.copy(name = s"#${fix(node.name)}")
    }

    override def visitMemory(node: Memory): Memory = {
      node.copy(name = s"#${fix(node.name)}")
    }

    override def visitParameter(node: Parameter): Parameter = {
      node.name = s"${fix(node.name)}"
      node
    }

    override def visitProcedure(node: Procedure): Procedure = {
      node.name = s"${fix(node.name)}"
      node
    }

    override def visitBlock(node: ir.Block): ir.Block = {
      node.label= s"${fix(node.label)}"
      node
    }
  }

  var p = dsl.prog(real_procedures.map((fname, blocks) => dsl.proc(fname, blocks.toIR())).toList)
  p = VRenamer().visitProgram(p)
  p = CleanupVis().visitProgram(p)


  val s = serialiseIL(p) 

  p
}
