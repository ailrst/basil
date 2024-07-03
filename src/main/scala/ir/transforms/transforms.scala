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

/** Locally resolve return statements from indirect call R30 */

/** Add call rely */

/** Add guarantee check */

/** Add analysis state/case splits */

/** flatten two-state predicates */

/** Add procedure call R/G check */

/** Add var decls */

