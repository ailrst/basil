package nir

enum VisitAction[T]:
  case SkipChildren()
  case DoChildren()
  case ChangeTo(e: T)
  case ChangeDoChildrenPost(e: T, f: T => T)

trait CILVisitorImpl:
  def vstmts(e: List[NStatement]): VisitAction[List[NStatement]] = VisitAction.DoChildren()
  def vstmt(e: NStatement): VisitAction[NStatement] = VisitAction.DoChildren()

  def vvar(e: RExpr.Variable): VisitAction[RExpr.Variable] = VisitAction.DoChildren()
  def vexpr(e: RExpr): VisitAction[RExpr] = VisitAction.DoChildren()

  def vlexpr(e: LExpr): VisitAction[LExpr] = VisitAction.DoChildren()
  def vlvar(e: LExpr.Variable): VisitAction[LExpr.Variable] = VisitAction.DoChildren()

class CILVisitor(val v: CILVisitorImpl) {
  import NStatement._
  import RExpr._
  // TODO: fix evaluation order

  def doVisit[T](v: CILVisitorImpl, a: VisitAction[T], n: T, continue: (CILVisitorImpl, T) => T) : T = {
    a match {
      case VisitAction.SkipChildren() => n
      case VisitAction.DoChildren() => continue(v, n)
      case VisitAction.ChangeTo(z) => z
      case VisitAction.ChangeDoChildrenPost(x, f) => f(continue(v, x))
    }
  }

  def visit_var(n: RExpr.Variable) : RExpr.Variable = {
    doVisit(v, v.vvar(n), n, (_, _) => n)
  }

  def visit_lvar(n: LExpr.Variable) : LExpr.Variable = {
    doVisit(v, v.vlvar(n), n, (_, _) => n)
  }

  def visit_lexpr(n: LExpr) : LExpr = {
    def continue(v: CILVisitorImpl, n: LExpr) : LExpr  = n match {
      case LExpr.Variable(name: String, scope: ScopeDef, shared: Boolean, typ: NType) => visit_lvar(n.asInstanceOf[LExpr.Variable])
    }
    doVisit(v, v.vlexpr(n), n, continue)
  }

  def visit_expr(n: RExpr) : RExpr = {
    def continue(v: CILVisitorImpl, n: RExpr) : RExpr  = n match {
      case RExpr.Literal(l) => n
      case RExpr.ExtractBits(end, start, arg) => RExpr.ExtractBits(end: Int, start: Int, visit_expr(arg))
      case RExpr.RepeatBits(repeats, arg) => RExpr.RepeatBits(repeats: Int, visit_expr(arg))
      case RExpr.ZeroExtendBits(bits, arg) => RExpr.ZeroExtendBits(bits, visit_expr(arg))
      case RExpr.SignExtendBits(bits, arg) => RExpr.SignExtendBits(bits, visit_expr(arg))
      case RExpr.BinaryExpr(op, arg, arg2) => RExpr.BinaryExpr(op, visit_expr(arg), visit_expr(arg2))
      case RExpr.UnaryExpr(op, arg) => RExpr.UnaryExpr(op, visit_expr(arg))
      case RExpr.Variable(name, scope, shared, typ) => visit_var(n.asInstanceOf[RExpr.Variable])
    }
    doVisit(v, v.vexpr(n), n, continue)
  }

  def visit_stmt(s: NStatement): NStatement = {
    def continue(v: CILVisitorImpl, n: NStatement) = n match {
      case Load(dest, source, ind, size, value) => NStatement.Load(visit_lexpr(dest), visit_expr(source), visit_expr(ind), size, visit_expr(value))
      case Store(v, ind, value) => Store(visit_lexpr(v), visit_expr(ind), visit_expr(value))
      case Assign(v, value: RExpr) =>
        val nvalue = visit_expr(value)
        Assign(visit_lexpr(v), nvalue)
      case Assert(value) => Assert(visit_expr(value))
      case Assume(value) => Assume(visit_expr(value))
    }
    doVisit(v, v.vstmt(s), s, continue)
  }

  def visit_stmts(ss: List[NStatement]): List[NStatement] = {
    def continue (v: CILVisitorImpl, ss: List[NStatement]) = ss.map(visit_stmt)
    doVisit(v, v.vstmts(ss), ss, continue)
  }
}

