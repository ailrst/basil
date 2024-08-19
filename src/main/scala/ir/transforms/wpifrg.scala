package ir.transforms
import ir._
import ir.cilvisitor._
import util.Logger
import specification._
import collection.mutable


def gamma_mem(m: Memory) = {
  SharedMemory("Gamma_" + m.name, m.addressSize, 1)
}

def gamma_v(v: Variable): Variable = v match {
  case m: Memory    => gamma_mem(m)
  case g: LocalVar  => LocalVar("Gamma_" + g.name, BoolType)
  case g: GlobalVar => GlobalVar("Gamma_" + g.name, BoolType)
  case g: Register  => GlobalVar("Gamma_" + g.name, BoolType)
  case g: GlobalConst => GlobalVar("Gamma_" + g.name, BoolType)
}

def gamma_store(m: MemoryAssign, L: Map[Memory, Expr => FApply]) : MemoryAssign = {
  val gm = m.mem match {
    case m: SharedMemory => SharedMemory("Gamma_" + m.name, m.addressSize, 1)
    case m: StackMemory => StackMemory("Gamma_" + m.name, m.addressSize, 1)
  }
  MemoryAssign(
    gm,
    m.index,
    Repeat(m.size / m.mem.valueSize, UnaryExpr(BoolToBV1, gamma_e(m.value, L))),
    m.endian,
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
      case m: MemoryAssign => ChangeTo(List(m, gamma_store(m, L)))
      case _                                                    => SkipChildren()
    }
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
            ChangeTo(OldExpr(l)) // we could remove this also just save variables at the region level? (not for memory since no Load(Old(mem)))
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
        case Nil      => None
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



def replaceRelyGuarantee(prog: Program, spec: ProgSpec) = {

  prog.procedures += spec.rely.assumptionProc
  spec.procedures(spec.rely.assumptionProc.name) = spec.rely.assumptionSpec

  class RelyGuarantee() extends CILVisitor {
    val statements: mutable.ArrayBuffer[Statement] = mutable.ArrayBuffer()
    var adds = false

    override def vexpr(s: Expr) = s match {
      case m: MemoryLoad if (m.mem.shared == AccessType.Shared) => {
        adds = true
        SkipChildren()
      }
      case _ => DoChildren()
    }

    override def vstmt(s: Statement): VisitAction[List[Statement]] = {
      adds = false
      s match {
      //case Assign(r, e, _) if r.sharedVariable && !r.name.startsWith("Gamma") => {
      //  statements.append(s)
      //  SkipChildren()
      //}
      case MemoryAssign(m, ind, value, endian, size, label)
          if !m.name.startsWith("Gamma") && m.shared == AccessType.Shared => {
        statements.append(s)
        SkipChildren()
      }
      case _ => ChangeDoChildrenPost(List(s), (x) => {
        if (adds) {
          statements.append(s)
        }
        adds = false
        x
      })
    }
    }
  }

  //if (spec.rely != Relation(TrueLiteral) && spec.guarantee != Relation(FalseLiteral)) {
    val stmts = {
      val vs = RelyGuarantee()
      cilvisitor.visit_prog(vs, prog)
      vs.statements
    }

    for (s <- stmts) {
      val (proc: Procedure, fspec: ProcSpec) = spec.rely.toAssumption(s)
      spec.guarantee.toAssertion(
        s,
        s.succ().getOrElse(s)
      ) // skip over gamma assignment
    }
  // }
}

