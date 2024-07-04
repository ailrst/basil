package ir.transforms
import ir._
import ir.cilvisitor._
import scala.collection.mutable

/**
 * IR transforms which consume static analysis results and transform over the IR in-place.
 *
 * This includes lifting, the addition of ghost state, and VC generation
 *
 */


/**
 *
 * Adding Gamma variables 
 *
 */

class FindVars extends CILVisitor {
  val vars = mutable.ArrayBuffer[Variable]()

  override def vvar(v: Variable) = {
    vars.append(v)
    SkipChildren()
  }

  def globals = vars.collect { case g: Global =>
    g
  }
}

def globals(e: Expr): List[Variable] = {
  val v = FindVars()
  visit_expr(v, e)
  v.globals.toList
}

def gamma_v(l: Variable) = LocalVar("Gamma_" + l.name, BoolType)

def gamma_e(e: Expr): Expr = {
  globals(e) match {
    case Nil       => TrueLiteral
    case hd :: Nil => hd
    case hd :: tl  => tl.foldLeft(hd: Expr)((l, r) => BinaryExpr(BoolAND, l, gamma_v(r)))
  }
}

class AddGammas extends CILVisitor {

  override def vstmt(s: Statement) = {
    s match {
      case a: Assign => ChangeTo(List(a, Assign(gamma_v(a.lhs), gamma_e(a.rhs))))
      case _         => SkipChildren()
    }

  }
}

/* ---------------------------------------------------------------------------------------------------- */


class ReplaceReturns extends CILVisitor {

  override def vjump(j: Jump): VisitAction[Jump] = {
    j match {
      case IndirectCall(Register("R30", _), _, _) => ChangeTo(Return())
      case _ => DoChildren()
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
  /**
   * Replace: Collect all old() subexpressions in expression and map them to variable names, and replace them with variables
   * Collect: Simply collect all old() sub-expressions
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

/** Add guarantee check */

/** Add analysis state/case splits */

/** flatten two-state predicates */

/** Add procedure call R/G check */

/** Add var decls */

