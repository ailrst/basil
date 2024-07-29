package ir.transforms
import ir._
import ir.cilvisitor._
import scala.collection.mutable
import boogie.Scope

/** IR transforms which consume static analysis results and transform over the IR in-place.
  *
  * This includes lifting, the addition of ghost state, and VC generation
  */

/** Adding Gamma variables
  */

class ProcModifies() extends cilvisitor.CILVisitor {
  val modifies = mutable.Set[RefVariable | GlobalVar]()

  override def vstmt(e: Statement) = {
    e match {
      case Assign(lhs, rhs, _) => {
        lhs match {
          case g: GlobalVar => modifies.add(g)
          case _            => ()
        }
      }
      case m: MemoryAssign => {
        modifies.add(m.mem)
      }
      case _ => ()
    }

    SkipChildren()
  }

}

object ProcModifies:
  def get(p: Procedure) = {
    val v = ProcModifies()
    visit_proc(v, p)
    p.modifies
  }

class UsedMemory() extends cilvisitor.CILVisitor {
  val memory = mutable.ArrayBuffer[Memory]()

  override def vexpr(e: Expr) = {
    e match {
      case m: MemoryLoad => memory.addOne(m.mem)
      case _             => ()
    }
    SkipChildren()
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
  val vars = mutable.ArrayBuffer[Variable]()

  override def vvar(v: Variable) = {
    vars.append(v)
    SkipChildren()
  }

  def globals = vars.collect {
    case g: Variable if g.scope == Scope.Global =>
      g
  }

  def locals: mutable.ArrayBuffer[Variable] = vars.collect {
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

def sharedAccesses(e: Expr): (List[Variable], List[MemoryLoad]) = {
  val v = FindVars()
  visit_expr(v, e)
  val l = FindLoads()
  visit_expr(l, e)
  (v.globals.toList, l.vars.filter(_.mem.isInstanceOf[SharedMemory]).toList)
}

def gamma_mem(m: Memory) = {
  SharedMemory("Gamma_" + m.name, m.addressSize, 1)
}

/* l should be shared for this to make sense */
def gamma_v(l: Variable): Variable = l match {
  case m: Memory   => gamma_mem(m)
  case g: Variable => GlobalVar("Gamma_" + l.name, BoolType)
}

def gamma_store(m: MemoryAssign) = {
  val gm = SharedMemory("Gamma_" + m.mem.name, m.mem.addressSize, 1)
  MemoryAssign(gm, m.index, gamma_e(m.value), Endian.LittleEndian, m.size / m.mem.valueSize)
}

def gamma_load(m: MemoryLoad) = {
  val gm = gamma_v(m.mem).asInstanceOf[SharedMemory]
  // (any bit set to 0)
  BinaryExpr(BVEQ, BitVecLiteral(0, m.size), UnaryExpr(BVNOT, MemoryLoad(gm, m.index, Endian.LittleEndian, m.size)))
}

def gamma_e(e: Expr): Expr = {
  val (vars, loads) = sharedAccesses(e)
  val vargs = vars.map(gamma_v)
  val loadgs = loads.map(gamma_load)
  val gs = (vargs ++ loadgs) match {
    case Nil       => TrueLiteral
    case hd :: Nil => hd
    case hd :: tl  => tl.foldLeft(hd: Expr)((l, r) => BinaryExpr(BoolAND, l, r))
  }
  gs
}

class AddGammas extends CILVisitor {

  override def vstmt(s: Statement) = {
    s match {
      //case a: Assign if a.lhs.sharedVariable => ChangeTo(List(a, Assign(gamma_v(a.lhs), gamma_e(a.rhs))))
      case m: MemoryAssign if m.mem.shared == AccessType.Shared => ChangeTo(List(m, gamma_store(m)))
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

  override def vexpr(e: Expr): VisitAction[Expr] = e match {
    case OldExpr(x) => {
      val variable = LocalVar(OldCounter.next(), x.getType)
      if (getOlds(x).size > 0) then throw Exception("Nested old() expressions are not allowed: " + e.toString())
      olds(variable) = x
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

def replaceRelyGuarantee(prog: Program, rely: Relation, guarantee: Relation) = {

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
    val (proc, spec) = rely.toAssumption(s, Some("rely"))
    guarantee.toAssertion(
      s,
      s.succ().getOrElse(throw Exception("Nothing defined: " + s.parent.toString))
    ) // skip over gamma assignment
  }
}

/* secure update */

class SecureUpdate(
    // rely-guarantee should run first, so that this puts vcs between rely and guarantee checks
    controlledBy: Map[Variable, Set[Variable]],
    Ls: Map[Variable, UninterpretedFunction],
    controls: Map[Variable, Set[Variable]]
) extends CILVisitor {

  /*
   * Assuming L_...() functions take dependent variables, a the test variable, and the test offset or address.
   */

  override def vstmt(s: Statement): VisitAction[List[Statement]] = {
    def toOld(v: Variable) = v match {
      case v: LocalVar  => v.copy(name = v.name + "_old")
      case v: GlobalVar => v.copy(name = v.name + "_old")
      case v: Register  => v.copy(name = v.name + "_old")
      case m: Memory    => LocalVar(m.name + "_old", m.getType)
    }

    def secureUpdateCheck(statement: Statement, variable: Variable, assignment: Expr, offset: Option[Expr] = None) = {
      val ind = BitVecLiteral(0, 64)
      var L = Ls.get(variable).map(L => L.copy(params = L.params ++ Seq(offset.getOrElse(BitVecLiteral(0, 64))))).get
      val saveUOld = controlledBy.get(variable).get.map(y => Assign(toOld(y), y))
      val po1 = Assert(BinaryExpr(BoolIMPLIES, L, gamma_e(assignment)))
      val oldMapping = saveUOld.map(y => y.rhs -> y.lhs).toMap

      val po2p = controls
        .get(variable)
        .get
        .map(y => {
          var oldLy = Ls.get(y).map(Ly => Ly.copy(params = Ly.params.map(x => oldMapping.get(x).getOrElse(x)))).get
          var Ly = Ls.get(y).get
          BinaryExpr(BoolIMPLIES, Ly, BinaryExpr(BoolOR, oldLy, gamma_v(y)))
        })
        .foldLeft(TrueLiteral: Expr)((x, y) => BinaryExpr(BoolAND, x, y))
      val po2 = Assert(po2p)

      List(po1) ++ saveUOld ++ List(statement, po2)
    }

    s match {
      //case Assign(r, e, _) if r.sharedVariable && !r.name.startsWith("Gamma") => {
      //  ChangeTo(secureUpdateCheck(s, r, e, None))
      //}
      case MemoryAssign(m, ind, value, endian, size, label)
          if !m.name.startsWith("Gamma") && m.shared == AccessType.Shared =>
        ChangeTo(secureUpdateCheck(s, m, value, Some(ind)))
      case _ => SkipChildren()
    }
  }
}

/** Add guarantee check */

/** Add analysis state/case splits */

/** Add var decls */

/* to boogie */
