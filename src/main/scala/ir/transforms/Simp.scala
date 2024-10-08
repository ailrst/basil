package ir.transforms

import util.Logger
import ir.cilvisitor.*
import ir.*
import scala.collection.mutable
import analysis._

trait AbstractDomain[L] {
  def join(a: L, b: L): L
  def widen(a: L, b: L): L = join(a, b)
  def narrow(a: L, b: L): L = a
  def transfer(a: L, b: Statement): L

  def top: L
  def bot: L
}

def getRedundantAssignments(v: Procedure): Set[Assign] = {

  /** Get all assign statements which define a variable never used, assuming ssa form.
    */

  enum VS:
    case Bot
    case Assigned(definition: Set[Assign])
    case Read

  def joinVS(a: VS, b: VS) = {
    (a, b) match {
      case (VS.Bot, o)                        => o
      case (o, VS.Bot)                        => o
      case (VS.Read, _)                       => VS.Read
      case (_, VS.Read)                       => VS.Read
      case (VS.Assigned(d1), VS.Assigned(d2)) => VS.Assigned(d1 ++ d2)
    }
  }

  val assignedNotRead = mutable.Map[Variable, VS]().withDefaultValue(VS.Bot)

  for (c <- v) {
    c match {
      case a: Assign => {
        assignedNotRead(a.lhs) = joinVS(assignedNotRead(a.lhs), VS.Assigned(Set(a)))
        a.rhs.variables.foreach(v => {
          assignedNotRead(v) = VS.Read
        })
      }
      case m: MemoryAssign => {
        m.index.variables.foreach(v => {
          assignedNotRead(v) = VS.Read
        })
        m.value.variables.foreach(v => {
          assignedNotRead(v) = VS.Read
        })
      }
      case m: IndirectCall => {
        assignedNotRead(m.target) = VS.Read
      }
      case m: Assert => {
        m.body.variables.foreach(v => {
          assignedNotRead(v) = VS.Read
        })
      }
      case m: Assume => {
        m.body.variables.foreach(v => {
          assignedNotRead(v) = VS.Read
        })
      }
      case c: DirectCall => {
        c.actualParams
          .flatMap(_._2.variables)
          .foreach(v => {
            assignedNotRead(v) = VS.Read
          })

      }
      case p: Return => {
        p.outParams
          .flatMap(_._2.variables)
          .foreach(v => {
            assignedNotRead(v) = VS.Read
          })
      }
      case p: GoTo        => ()
      case p: NOP         => ()
      case p: Unreachable => ()
      case p: Procedure   => ()
      case b: Block       => ()
    }
  }

  assignedNotRead
    .collect { case (v, VS.Assigned(d)) =>
      d
    }
    .toSet
    .flatten
}

class CleanupAssignments extends CILVisitor {
  var redundant = Set[Assign]()

  override def vproc(p: Procedure) = {
    redundant = getRedundantAssignments(p).filter(_.rhs.loads.isEmpty)
    DoChildren()
  }

  override def vstmt(s: Statement) = s match {
    case a: Assign if redundant.contains(a) => ChangeTo(List())
    case _                                  => SkipChildren()
  }

}

def doCopyPropTransform(
    p: Program,
    reachingDefs: Map[CFGPosition, (Map[Variable, Set[Assign]], Map[Variable, Set[Assign]])]
) = {

  var runs = 0
  var rerun = true
  while (runs < 8) {
    val rds2 = ReachingDefinitionsAnalysisSolver(p)
    val reachingDefs = rds2.analyze()
    val d = ConstCopyProp()
    applyRPO(p)

    // Logger.info(s"Simp run $runs")
    runs += 1
    val solver = worklistSolver(d)
    val result = solver.solveProg(p, Set(), Set())

    for ((p, xf) <- result) {
      val vis = Simplify(xf)
      visit_proc(vis, p)
      rerun = vis.madeAnyChange
    }
  }

  // cleanup
  visit_prog(CleanupAssignments(), p)
  val toremove = p.collect {
    case b: Block if b.statements.size == 0 && b.prevBlocks.size == 1 && b.nextBlocks.size == 1 => b
  }
  for (b <- toremove) {
    val p = b.prevBlocks.head
    val n = b.nextBlocks.head
    p.replaceJump((GoTo(n)))
    b.parent.removeBlocks(b)
  }

}

def reversePostOrder(startBlock: Block): Unit = {
  var count = 0
  val seen = mutable.HashSet[Block]()
  val vcs = mutable.HashMap[Block, Int]()

  def walk(b: Block): Unit = {
    seen += b
    for (s <- b.nextBlocks) {
      if (!seen.contains(s)) {
        walk(s)
      }
    }
    b.rpoOrder = count
    count += 1
  }

  walk(startBlock)
}

def applyRPO(p: Program) = {
  for (proc <- p.procedures) {
    proc.entryBlock.map(eb => reversePostOrder(eb))
  }
}

class worklistSolver[L, A <: AbstractDomain[L]](domain: A) {

  def solveProg(
      p: Program,
      widenpoints: Set[Block], // set of loop heads
      narrowpoints: Set[Block] // set of conditions
  ): Map[Procedure, L] = {
    val initDom = p.procedures.map(p =>
      (p, p.blocks.filter(x => (x.nextBlocks.size > 1 || x.prevBlocks.size > 1) && x.rpoOrder != -1))
    )

    initDom.map(d => (d._1, solve(d._2, Set(), Set()))).toMap
  }

  def solve(
      initial: IterableOnce[Block],
      widenpoints: Set[Block], // set of loop heads
      narrowpoints: Set[Block] // set of conditions
  ): L = {
    val saved: mutable.HashMap[Block, L] = mutable.HashMap()
    val worklist = mutable.PriorityQueue[Block]()(Ordering.by(b => b.rpoOrder))
    worklist.addAll(initial)

    var x = domain.bot
    while (worklist.nonEmpty) {
      val b = worklist.dequeue

      while (worklist.nonEmpty && (worklist.head.rpoOrder >= b.rpoOrder)) do {
        // drop rest of blocks with same priority
        val m = worklist.dequeue()
        assert(
          m == b,
          s"Different nodes with same priority ${m.rpoOrder} ${b.rpoOrder}, violates PriorityQueueWorklist assumption: $b and $m"
        )
      }

      def bs(b: Block): List[Block] = {
        if (b.nextBlocks.size == 1) {
          val n = b.nextBlocks.head
          b :: bs(n)
        } else {
          List(b)
        }
      }

      x = b.prevBlocks.flatMap(ib => saved.get(ib).toList).foldLeft(x)(domain.join)
      val todo = bs(b)
      val lastBlock = todo.last

      def xf_block(x: L, b: Block) = b.statements.foldLeft(x)(domain.transfer)
      var nx = todo.foldLeft(x)(xf_block)
      saved(lastBlock) = nx
      if (nx != x) then {
        worklist.addAll(lastBlock.nextBlocks)
      }
      x = nx
    }
    x
  }
}

case class CopyProp(expr: Expr, deps: Set[Variable])

case class CCP(
    constants: Map[Variable, Literal],
    // variable -> expr * dependencies
    val exprs: Map[Variable, CopyProp]
)

class ConstCopyProp() extends AbstractDomain[CCP] {

  private final val callClobbers = (0 to 30).map("R" + _).map(c => Register(c, 64))

  def top: CCP = CCP(Map(), Map())
  def bot: CCP = CCP(Map(), Map())

  override def join(l: CCP, r: CCP): CCP = {
    CCP(
      (l.constants ++ r.constants)
        .removedAll(l.constants.keySet.intersect(r.constants.keySet).filterNot(k => l.constants(k) == r.constants(k))),
      (l.exprs ++ r.exprs).removedAll(l.exprs.keySet.intersect(r.exprs.keySet).filterNot(k => l.exprs(k) == r.exprs(k)))
    )
  }

  override def transfer(c: CCP, s: Statement): CCP = {
    s match {
      case m: MemoryAssign => {
        c.copy(exprs = c.exprs.filterNot((k, v) => v.expr.loads.nonEmpty))
      }
      case Assign(l, r, lb) => {
        var p = c
        val evaled = exprSimp(
          eval.partialEvalExpr(
            exprSimp(r),
            v => p.constants.get(v)
          )
        )
        val rhsDeps = evaled.variables

        p = evaled match {
          case lit: Literal => p.copy(constants = p.constants.updated(l, lit))
          case e: Expr =>
            p.copy(constants = p.constants.removed(l), exprs = p.exprs.updated(l, CopyProp(e, e.variables)))
        }

        if (r.loads.nonEmpty) {
          // don't re-order loads
          p = p.copy(exprs = p.exprs.filter((k, v) => v.expr.loads.isEmpty))
        }
        // remove candidates whose value changes due to this update
        // without an SSA form in the output, we can't propagate assignments such that R0_1 := f(R0_0)
        //  or; only replace such that all uses are copyproped, the dead definition is removed
        p = p.copy(exprs = p.exprs.filterNot((k, v) => v.deps.exists(c => c.name == l.name)))

        p
      }
      case x: DirectCall => {
        val lhs = x.outParams.map(_._2)
        lhs.foldLeft(c)((c, l) =>
          c.copy(constants = c.constants.removed(l), exprs = c.exprs.filterNot((k, v) => v.deps.contains(l)))
        )
      }
      case x: IndirectCall => {
        val toClob = callClobbers
        toClob.foldLeft(c)((c, l) =>
          c.copy(constants = c.constants.removed(l), exprs = c.exprs.filterNot((k, v) => v.deps.contains(l)))
        )
      }
      case _ => c
    }
  }
}

def exprSimp(e: Expr): Expr = {

  val assocOps: Set[BinOp] =
    Set(BVADD, BVMUL, BVOR, BVAND, BVEQ, BoolAND, BoolEQ, BoolOR, BoolEQUIV, BoolEQ, IntADD, IntMUL, IntEQ)

  def simpOne(e: Expr): Expr = {
    e match {
      // normalise
      case BinaryExpr(op, x: Literal, y: Expr) if !y.isInstanceOf[Literal] && assocOps.contains(op) =>
        BinaryExpr(op, y, x)
      case BinaryExpr(BVADD, x: Expr, y: BitVecLiteral) if ir.eval.BitVectorEval.isNegative(y) =>
        BinaryExpr(BVSUB, x, ir.eval.BitVectorEval.smt_bvneg(y))

      // identities
      case Extract(ed, 0, body) if (body.getType == BitVecType(ed))                        => exprSimp(body)
      case ZeroExtend(0, body)                                                             => exprSimp(body)
      case SignExtend(0, body)                                                             => exprSimp(body)
      case BinaryExpr(BVADD, body, BitVecLiteral(0, _))                                    => exprSimp(body)
      case BinaryExpr(BVMUL, body, BitVecLiteral(1, _))                                    => exprSimp(body)
      case Repeat(1, body)                                                                 => exprSimp(body)
      case Extract(ed, 0, ZeroExtend(extension, body)) if (body.getType == BitVecType(ed)) => exprSimp(body)
      case Extract(ed, 0, SignExtend(extension, body)) if (body.getType == BitVecType(ed)) => exprSimp(body)
      case BinaryExpr(BVXOR, l, r) if l == r =>
        e.getType match {
          case BitVecType(sz) => BitVecLiteral(0, sz)
        }
      // double negation
      case UnaryExpr(BVNOT, UnaryExpr(BVNOT, body))     => exprSimp(body)
      case UnaryExpr(BVNEG, UnaryExpr(BVNEG, body))     => exprSimp(body)
      case UnaryExpr(BoolNOT, UnaryExpr(BoolNOT, body)) => exprSimp(body)

      // compose slices
      case Extract(ed1, be1, Extract(ed2, be2, body)) => Extract(ed1 - be2, be1 + be2, exprSimp(body))

      // (comp (comp x y) 1) = (comp x y)
      case BinaryExpr(BVCOMP, body @ BinaryExpr(BVCOMP, _, _), BitVecLiteral(1, 1)) => exprSimp(body)
      case BinaryExpr(BVCOMP, body @ BinaryExpr(BVCOMP, _, _), BitVecLiteral(0, 1)) => UnaryExpr(BVNOT, exprSimp(body))
      case BinaryExpr(
            BVEQ,
            BinaryExpr(BVCOMP, body @ BinaryExpr(BVCOMP, _, _), BitVecLiteral(0, 1)),
            BitVecLiteral(1, 1)
          ) =>
        BinaryExpr(BVEQ, exprSimp(body), BitVecLiteral(0, 1))

      // constant folding
      // const + (expr + const) -> expr + (const + const)
      case BinaryExpr(BVADD, BinaryExpr(BVSUB, body, l: BitVecLiteral), r: BitVecLiteral) =>
        BinaryExpr(BVADD, BinaryExpr(BVSUB, r, l), exprSimp(body))
      case BinaryExpr(BVSUB, BinaryExpr(BVADD, body, l: BitVecLiteral), r: BitVecLiteral) =>
        BinaryExpr(BVADD, BinaryExpr(BVSUB, r, l), exprSimp(body))
      case BinaryExpr(BVADD, BinaryExpr(BVADD, body, l: BitVecLiteral), r: BitVecLiteral) =>
        BinaryExpr(BVADD, BinaryExpr(BVADD, l, r), exprSimp(body))
      case BinaryExpr(BVMUL, BinaryExpr(BVMUL, body, l: BitVecLiteral), r: BitVecLiteral) =>
        BinaryExpr(BVMUL, BinaryExpr(BVMUL, l, r), exprSimp(body))
      case BinaryExpr(BVOR, BinaryExpr(BVOR, body, l: BitVecLiteral), r: BitVecLiteral) =>
        BinaryExpr(BVOR, BinaryExpr(BVOR, l, r), exprSimp(body))
      case BinaryExpr(BVAND, BinaryExpr(BVAND, body, l: BitVecLiteral), r: BitVecLiteral) =>
        BinaryExpr(BVAND, BinaryExpr(BVAND, l, r), exprSimp(body))
      case r => r
    }
  }

  var pe = e
  var ne = simpOne(pe)
  while (ne != pe) {
    pe = ne
    ne = simpOne(pe)
  }
  ne
}


class Simplify(
    val res: CCP
) extends CILVisitor {

  var madeAnyChange = false

  def simp(pe: Expr)(ne: Expr) = {
    val simped = eval.partialEvalExpr(exprSimp(ne), x => None)
    if (pe != simped) {
      madeAnyChange = true
    }

    simped
  }

  override def vexpr(e: Expr) = {
    e match {
      case v: Variable if res.constants.contains(v) => {
        madeAnyChange = true
        ChangeDoChildrenPost(
          res.constants(v),
          simp(e)
        )
      }
      case v: Variable if res.exprs.contains(v) => {
        val repl = res.exprs(v)
        madeAnyChange = true
        ChangeDoChildrenPost(
          repl.expr,
          simp(e)
        )
      }
      case e => ChangeDoChildrenPost(e, simp(e))
    }
  }

}
