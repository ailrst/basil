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

/** Adding Gamma variables */

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
      case _ => SkipChildren()
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
    l.vars.filter(_.mem.isInstanceOf[SharedMemory]).toList
  )
}

def gamma_mem(m: Memory) = {
  SharedMemory("Gamma_" + m.name, m.addressSize, 1)
}

/* l should be shared for this to make sense */
def gamma_v(l: Variable): Variable = l match {
  case m: Memory    => gamma_mem(m)
  case g: LocalVar  => LocalVar("Gamma_" + g.name, BoolType)
  case g: GlobalVar => GlobalVar("Gamma_" + g.name, BoolType)
  case g: Register  => GlobalVar("Gamma_" + g.name, BoolType)
}

def gamma_store(m: MemoryAssign, L: Map[Memory, Expr => FApply]) = {
  val gm = SharedMemory("Gamma_" + m.mem.name, m.mem.addressSize, 1)
  MemoryAssign(
    gm,
    m.index,
    Repeat(m.size / m.mem.valueSize, UnaryExpr(BoolToBV1, gamma_e(m.value, L))),
    Endian.LittleEndian,
    m.size / m.mem.valueSize
  )
}

def load_to_gamma(m: MemoryLoad) = {
  val gm = gamma_v(m.mem).asInstanceOf[SharedMemory]
  BinaryExpr(BVEQ, BitVecLiteral(0, m.size), UnaryExpr(BVNOT, MemoryLoad(gm, m.index, Endian.LittleEndian, m.size)))
}

def gamma_load(m: MemoryLoad, L: Map[Memory, Expr => FApply]) = {
  // L : region -> (fun region, address -> gamma)
  val gammaLoad = load_to_gamma(m)

  L.get(m.mem) match {
    case Some(e) => BinaryExpr(BoolOR, gammaLoad, e(m.index))
    case None    => gammaLoad
  }
}

def gamma_e(e: Expr, L: Map[Memory, Expr => FApply]): Expr = {
  val vargs = exprVars(e).map(gamma_v)
  val loadgs = exprLoads(e).map(l => gamma_load(l, L))
  val gs = (vargs ++ loadgs) match {
    case Nil       => TrueLiteral
    case hd :: Nil => hd
    case hd :: tl  => tl.foldLeft(hd: Expr)((l, r) => BinaryExpr(BoolAND, l, r))
  }
  gs
}

class AddGammas(L: Map[Memory, Expr => FApply]) extends CILVisitor {

  override def vstmt(s: Statement) = {
    s match {
      case a: Assign => ChangeTo(List(a, Assign(gamma_v(a.lhs), gamma_e(a.rhs, L))))
      case m: MemoryAssign if m.mem.shared == AccessType.Shared => ChangeTo(List(m, gamma_store(m, L)))
      case _                                                    => SkipChildren()
    }

  }
}

/* ---------------------------------------------------------------------------------------------------- */

class ReplaceReturns extends CILVisitor {

  override def vjump(j: Jump): VisitAction[Jump] = {
    j match {
      case IndirectCall(Register("R30", _), _, _) => ChangeTo(Return())
      case _                                      => DoChildren()
    }
  }
}

/** Locally resolve return statements from indirect call R30 */

/** Add call rely */

/*
 * Encode relations to expressions
 * */

object OldCounter:
  var i = BigInt(0)

  def next() = {
    i += 1
    s"old_$i"
  }

enum OldAction:
  case Replace
  case Collect

class OldsToVars(val bindVars: OldAction) extends CILVisitor {

  /** Replace: Collect all old() subexpressions in expression and map them to variable names, and replace them with
    * variables Collect: Simply collect all old() sub-expressions
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

def replaceRelyGuarantee(prog: Program, spec: ProgSpec) = {

  prog.procedures += spec.rely.assumptionProc
  spec.procedures(spec.rely.assumptionProc.name) = spec.rely.assumptionSpec

  class RelyGuarantee() extends CILVisitor {
    val statements: mutable.ArrayBuffer[Statement] = mutable.ArrayBuffer()
    override def vstmt(s: Statement): VisitAction[List[Statement]] = s match {
      //case Assign(r, e, _) if r.sharedVariable && !r.name.startsWith("Gamma") => {
      //  statements.append(s)
      //  SkipChildren()
      //}
      case MemoryAssign(m, ind, value, endian, size, label)
          if !m.name.startsWith("Gamma") && m.shared == AccessType.Shared => {
        statements.append(s)
        SkipChildren()
      }
      case _ => SkipChildren()
    }
  }

  val stmts = {
    val vs = RelyGuarantee()
    cilvisitor.visit_prog(vs, prog)
    vs.statements
  }

  for (s <- stmts) {
    val (proc: Procedure, fspec: ProcSpec) = spec.rely.toAssumption(s)
    spec.guarantee.toAssertion(
      s,
      s.succ().getOrElse(throw Exception("Nothing defined: " + s.parent.toString))
    ) // skip over gamma assignment
  }

}

/* secure update */

class SecureUpdate(
    // rely-guarantee should run first, so that this puts vcs between rely and guarantee checks
    spec: specification.ProgSpec
) extends CILVisitor {

  // controls: Map[Variable, Set[Variable]]

  /*
   * Assuming L_...() functions take dependent variables, a the test variable, and the test offset or address.
   */

  override def vstmt(s: Statement): VisitAction[List[Statement]] = {
    def toOld(v: Variable) = v match {
      case v: LocalVar    => v.copy(name = v.name + "_old")
      case v: GlobalVar   => v.copy(name = v.name + "_old")
      case v: Register    => v.copy(name = v.name + "_old")
      case v: GlobalConst => v.copy(name = v.name + "_old")
      case m: Memory      => LocalVar(m.name + "_old", m.getType)
    }

    def secureUpdateCheck(statement: Statement, variable: Memory, assignment: Expr, address: Expr) = {
      // currently variable is always a Memory, it probably has to be a shared ref variable
      val ind = BitVecLiteral(0, 64)

      // observable memory dependencies of L
      // val controls = spec.lPreds(variable).toList.flatMap((v, e) => sharedAccesses(e)._2)
      // domain of L (everything else maps to high)
      // val controlled = spec.lPreds(variable).toList.map((v, e) => v.toIRLoad())

      def L(variable: Variable, addr: Expr) = FApply("L$" + variable.name, Seq(variable, addr), BoolType)

      // just repalce the updated /variable with old(variable)
      class LoadToOld extends CILVisitor {
        override def vexpr(e: Expr) = e match {
          case l: MemoryLoad if l.mem == variable =>
            ChangeTo(OldExpr(l)) // we could remove this also just save variables at the region level? (not for memory)
          //case v: RefVariable if v.shared == AccessType.Shared => ChangeTo(OldExpr(v))
          case v: RefVariable if v == variable => ChangeTo(OldExpr(v))
          case _                               => DoChildren()
        }
      }

      val loadToOld = LoadToOld()
      val lRelations = spec.lPreds.toList
        .map((y, defins) => (y, defins.toSet.map(_._2).flatMap(sharedAccesses(_)._2.map(_.mem))))
        .flatMap((y, _) => {
          val Ly = spec.lCalls(y)
          spec
            .lPreds(y)
            .map((sg, e) => {
              val address = BitVecLiteral(sg.address, 64)
              (
                BinaryExpr(
                  BoolIMPLIES,
                  Ly(address),
                  (BinaryExpr(BoolOR, visit_expr(loadToOld, Ly(address)), gamma_load(sg.toIRLoad(), spec.lCalls)))
                )
              )
            })
        })

      val lRelation = lRelations.toList match {
        case Nil      => Some(Relation(FalseLiteral))
        case h :: Nil => Some(Relation(h))
        case h :: tl  => Some(Relation(lRelations.reduce((l, r) => (BinaryExpr(BoolAND, l, r)))))
      }

      val po1 = Assert(BinaryExpr(BoolIMPLIES, L(variable, address), gamma_e(assignment, spec.lCalls)))
      val (saveUOlds, po2) = lRelation
        .map(lRelation =>
          val (saveUOlds, po2) = lRelation.toAssertion()
          (saveUOlds, List(po2))
        )
        .getOrElse(List.empty, List.empty)
      saveUOlds ++ List(statement, po1) ++ po2
    }

    s match {
      //case Assign(r, e, _) if r.sharedVariable && !r.name.startsWith("Gamma") => {
      //  ChangeTo(secureUpdateCheck(s, r, e, None))
      //}
      case MemoryAssign(m, ind, value, endian, size, label)
          if !m.name.startsWith("Gamma") && m.shared == AccessType.Shared =>
        ChangeTo(secureUpdateCheck(s, m, value, ind))
      case _ => SkipChildren()
    }
  }
}

