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

  def fixname(s:String) = s.stripPrefix("?:").stripSuffix("()").replace("(", "").replace(")", "")

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


  val gedges = cfg.edges.groupBy(e => e.sourceUuid).toMap

  def get_pc(binfo: LiftState) : (String, BranchInfo) = {
    val pcs = binfo.pcAssigns.toList
    assert(pcs.size == 1)
    pcs.head
  }

  for ((b, es) <- gedges) {
      val edge = es.find(!_.label.get.`type`.isTypeFallthrough).getOrElse(es.head)
      val ft = es.find(_ != edge)
      val ft_sb = ft.map(f => allblocks(f.sourceUuid))
      val ft_tb = ft.map(f => allblocks(f.targetUuid))
      val sb = allblocks(edge.sourceUuid)
      val tb = allblocks(edge.targetUuid)
      val sb_pos = sb.current_pos
      edge.label match  {
        // unconditional
        case Some(EdgeLabel(_, _, Type_Return, _)) => sb.add_call(dsl.ret); assert(ft.isEmpty)
        case Some(EdgeLabel(false, true, Type_Branch, _)) if (procedures.keySet.contains(edge.targetUuid)) => sb.add_call(dsl.call(procedures(edge.targetUuid), ft_tb.map(_.entry))); ft_tb.foreach(sb.merge_state)
        case Some(EdgeLabel(false, false, Type_Branch, _)) if (procedures.keySet.contains(edge.targetUuid)) => sb.add_call(dsl.indirectCall(procedures(edge.targetUuid), ft_tb.map(_.entry))); ft_tb.foreach(sb.merge_state)
        case Some(EdgeLabel(false, true, Type_Branch, _))  => sb.add_goto(tb.entry); sb.merge_state(tb)
        case Some(EdgeLabel(false, true, Type_Call, _))  => sb.add_call(dsl.call(procedures(edge.targetUuid), ft_tb.map(_.entry))); ft_tb.foreach(sb.merge_state)
        case Some(EdgeLabel(false, true, Type_Fallthrough, _))  => sb.add_goto(tb.entry); sb.merge_state(tb)
        case Some(EdgeLabel(true, true, Type_Fallthrough, _)) => {
          assert(ft.isEmpty)
          val (pcblockid, pc) = get_pc(sb)
          sb.switch_ctx(pcblockid)
          sb.add_goto(tb.entry)
          sb.merge_state(tb)
          sb.switch_ctx(sb_pos)
        };
        case Some(EdgeLabel(true, true, Type_Branch, _)) => {
          val (pcblockid, pc) = get_pc(sb)
          val (true_branch, false_branch, join) = sb.branches(pc.branch.get)
          assert(sb.current_pos == join) // branch at the end of the instruction
          assert(true_branch == pcblockid)

          sb.blocks.remove(join)
          sb.controlFlow(true_branch) = dsl.goto(allblocks(edge.targetUuid).entry)
          ft_tb.foreach(f => sb.controlFlow(false_branch) = dsl.goto(f.entry))
        }
        case Some(EdgeLabel(true, true, Type_Call, _)) => {
          //sb.add_call(dsl.call(procedures(edge.targetUuid), ft_tb.map(_.entry)))
          //ft_tb.foreach(sb.merge_state(_))
          val (pcblockid, pc) = get_pc(sb)
          val (true_branch, false_branch, join) = sb.branches(pc.branch.get)
          assert(sb.current_pos == join) // branch at the end of the instruction
          assert(true_branch == pcblockid)

          sb.blocks.remove(join)
          sb.controlFlow(true_branch) = dsl.call(procedures(edge.targetUuid), None)
          ft_tb.foreach(f => sb.controlFlow(false_branch) = dsl.goto(f.entry))

        };
        case x => throw Exception(s"$x")
      }
  }

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

  var p = dsl.prog(real_procedures.map((fname, blocks) => dsl.proc(fname, blocks.toIR())).toList)
  p = CleanupVis().visitProgram(p)
  p.mainProcedure = p.procedures.find(_.name == "main").getOrElse(p.procedures.head)


  val s = serialiseIL(p) 

  p
}
