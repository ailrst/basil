package ir.transforms
import ir._
import ir.cilvisitor._
import scala.collection.mutable
import boogie.Scope
import specification._
import util.Logger

/** IR transforms which consume static analysis results and transform over the IR in-place.
  *
  * This includes lifting, the addition of ghost state, and VC generation
  */


class ProcModifies() extends cilvisitor.CILVisitor {
  val modifies = mutable.Set[Variable]()

  override def vstmt(e: Statement) = {
    e match {
      case Assign(lhs, rhs, _) => {
        lhs match {
          case g: Variable if g.scope == Scope.Global => {
            modifies.add(g)
          }
          case _ => ()
        }
      }
      case m: MemoryAssign => {
        modifies.add(m.mem)
      }
      case _ => ()
    }

    DoChildren()
  }

}

object ProcModifies:
  def get(p: Procedure): Set[Variable] = {
    val v = ProcModifies()
    visit_proc(v, p)
    val r = v.modifies
    r.toSet
  }

  class ModifiesFixedPoint() {
    val worklist = mutable.ArrayBuffer[Procedure]()
    val lattice = mutable.HashMap[Procedure, Set[Variable]]()

    def analyse(p: Program) : Map[Procedure, Set[Variable]] = {
      worklist.addAll(p.procedures)

      while (worklist.nonEmpty) {
        val proc = worklist.remove(0)
        val calling = proc.calls.toSet.flatMap(p => lattice.get(p).getOrElse(Set()))
        val newv = get(proc) ++ calling ++ proc.modifies

        if (lattice.get(proc).map(_ != newv).getOrElse(true)) {
          lattice(proc) = newv
          worklist.addAll(proc.callers())
        }
      }

      lattice.toMap
    }
  }

  def inferModifies(p: Program): Map[Procedure, Set[Variable]] = {
    val analysis = ModifiesFixedPoint()
    analysis.analyse(p)
  }



class UsedMemory() extends cilvisitor.CILVisitor {
  val memory = mutable.Set[Memory]()

  override def vexpr(e: Expr) = {
    e match {
      case m: MemoryLoad => memory.addOne(m.mem)
      case _             => ()
    }
    DoChildren()
  }

  override def vstmt(s: Statement) = {
    s match {
      case m: MemoryAssign => memory.addOne(m.mem)
      case _               => ()
    }
    DoChildren()
  }
}

object UsedMemory:
  def get(p: Program) = {
    val v = UsedMemory()
    visit_prog(v, p)
    v.memory
  }

class FindVars extends CILVisitor {
  val vars = mutable.HashSet[Variable]()

  override def vvar(v: Variable) = {
    vars.add(v)
    SkipChildren()
  }

  def globals = vars.collect {
    case g if g.scope == Scope.Global =>
      g
  }

  def locals = vars.collect {
    case l: Variable if l.scope == Scope.Local => l
  }
}

class FindLoads extends CILVisitor {
  val vars = mutable.ArrayBuffer[MemoryLoad]()

  override def vexpr(e: Expr): VisitAction[Expr] = {
    e match {
      case m: MemoryLoad =>
        vars += m
        SkipChildren()
      case _ => DoChildren()
    }
  }
}

object FindVars:
  def globals(p: Program) = {
    val v = FindVars()
    visit_prog(v, p)
    v.globals
  }

def exprVars(e: Expr): List[Variable] = {
  val v = FindVars()
  visit_expr(v, e)
  v.vars.toList
}

def exprLoads(e: Expr): List[MemoryLoad] = {
  val l = FindLoads()
  visit_expr(l, e)
  l.vars.toList
}

def sharedAccesses(e: Expr): (List[RefVariable], List[MemoryLoad]) = {
  val v = FindVars()
  visit_expr(v, e)
  val l = FindLoads()
  visit_expr(l, e)
  (
    v.vars.collect {
      case v: RefVariable if v.shared == AccessType.Shared => v
    }.toList,
    l.vars.filter(_.mem.shared == AccessType.Shared).toList
  )
}



/* ---------------------------------------------------------------------------------------------------- */

/*
 * Encode relations to expressions
 * */
object OldCounter:
  var i = BigInt(0)

  def next() = {
    i += 1
    s"old_$i"
  }

  def nextInt() = {
    i += 1
    i
  }

enum OldAction:
  case Replace
  case Collect

class OldsToVars(val bindVars: OldAction) extends CILVisitor {
  /** Replace: Collect all old() subexpressions in expression and map them to variable names, and replace them with
    * variables Collect: Simply collect all old() sub-expressions
    *
    * This is used for flattening relations into assertions.
    */
  val olds = mutable.Map[LocalVar, Expr]()
  val oldVars = mutable.Map[Expr, LocalVar]()

  override def vexpr(e: Expr): VisitAction[Expr] = e match {
    case OldExpr(x) => {
      val variable = oldVars.get(e).getOrElse(LocalVar(OldCounter.next(), x.getType))
      if (getOlds(x).size > 0) then throw Exception("Nested old() expressions are not allowed: " + e.toString())
      olds(variable) = x
      oldVars(x) = variable
      bindVars match {
        case OldAction.Replace => ChangeTo(variable)
        case OldAction.Collect => SkipChildren()
      }
    }
    case _ => DoChildren()
  }
}

def oldsToVars(e: Expr): (Expr, Expr, mutable.Map[LocalVar, Expr]) = {
  val v = OldsToVars(OldAction.Replace)
  val ne = visit_expr(v, e)
  (e, ne, v.olds)
}

def getOlds(e: Expr): List[Expr] = {
  val v = OldsToVars(OldAction.Collect)
  val ne = visit_expr(v, e)
  v.olds.toList.map(_._2)
}

