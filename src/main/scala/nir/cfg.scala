
package nir

import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable


type BlockLabel = String

enum CFEdge:
  case Top
  case Inter(fromBlock: BlockLabel, toProc: BlockLabel)
  case Intra(fromBlock: BlockLabel, toBlock: BlockLabel)
  case Fallthrough(fromBlock: BlockLabel, toBlock: BlockLabel)


enum Control(edges: List[CFEdge]):
  case GotoSingle(from: BlockLabel, target: BlockLabel) extends Control(List(CFEdge.Intra(from, target)))
  case GotoMany(from: BlockLabel,  targets: immutable.List[BlockLabel]) extends Control(targets.map(CFEdge.Intra(from, _))) 
  case DirectTailCall(from: BlockLabel, target: BlockLabel) extends Control(List(CFEdge.Intra(from, target)))
  case IndirectTailCall(from: BlockLabel, target: RExpr.Variable) extends Control(List(CFEdge.Top))
  case DirectCall(from: BlockLabel, target: BlockLabel, fallthrough: BlockLabel) extends Control(List(CFEdge.Inter(from, target), CFEdge.Fallthrough(from, fallthrough)))
  case IndirectCall(from: BlockLabel, target: RExpr.Variable, fallthrough: BlockLabel) extends Control(List(CFEdge.Top, CFEdge.Fallthrough(from, fallthrough)))
  case Return extends Control(List(CFEdge.Top))
  case Halt extends Control(List.empty)

enum Block:
  case CodeBlock(val label: BlockLabel, val statements: List[NStatement], val outgoing: Control, val incoming: List[CFEdge])
  case AfterCall(val label: BlockLabel, val outgoing: Control, val incoming: List[CFEdge])
  case ProcedureEntry(val label: BlockLabel, val outgoing: Control, val incoming: List[CFEdge])
  case ProcedureReturn(val label: BlockLabel, val outgoing: Control, val incoming: List[CFEdge])

//class Procedure (name: BlockLabel, in: ArrayBuffer[RExpr.Variable], out: ArrayBuffer[RExpr.Variable])
//{
//  val entryBlock = Block.ProcedureEntry(name, Control.Halt)
//  val internalBlocks = ArrayBuffer[Block]()
//  val returnBlock = Block.ProcedureEntry(name + "_return", Control.Return)
//}

