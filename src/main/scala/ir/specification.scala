package ir

import boogie._
import scala.collection.mutable
import ir.cilvisitor._


/**
 * This contains IR expressions and langauge constructs that are used in specifications.
 */


case class Macro(val bindings: List[LocalVar], val body: Expr) {


}



case class Relation(val body: Expr) {
  // A relation is not an expression since we have two states present
  // body: an Expr containing old()

  /* 
   * Resolve to assertion by binding old to a specific state by caching it in a temporary variable.
   * Modifies the block(s) containing oldBinding and newBinding
   * Assertion is inserted after newBinding, and old(x) in the relation are bound
   * to the state before bindOld
   * Hence to relate the statements before and after a single statement you can make bindOld = bindNew
   * 
   * **Mutates IR**
   *
   * @returns the updated expressions
   */
  def toAssertion(bindOld: Statement, bindNew: Statement): Expr = {
    val (origExpr: Expr, replaced: Expr, vars: mutable.Map[LocalVar, Expr]) = transforms.oldsToVars(body)
    val assigns : List[Statement] = vars.toList.map((v: LocalVar, e: Expr) => Assign(v, e))
    bindOld.parent.statements.insertAllBefore(Some(bindOld), assigns)
    bindNew.parent.statements.insertAfter(bindNew, Assert(replaced))
    replaced
  }

  /* 
   * Resolve to a state transition/assumption by creating a procedure call to dummy procedure with the given specification
   * Returns the stub procedure ensuring the condition, and its function specification
   *
   * Argument bindNew becomes the first statement after the call to the relation function.
   *
   * **Mutates IR**
   */
  def toAssumption(bindNew: Statement, relationName: Option[String] = None): (Procedure, FunctionSpec) = {
    val name = relationName.getOrElse("Relation" + transforms.OldCounter.next())
    val spec = FunctionSpec(name, List(), List(), List(), List(this))
    val proc = Procedure.stub(name)

    val jump = bindNew.parent.jump
    val ft = bindNew.parent.fallthrough

    val nextBlock = Block(bindNew.parent.label + name, None, bindNew.parent.statements.splitOn(bindNew))
    bindNew.parent.parent.addBlocks(nextBlock)
    nextBlock.replaceJump(jump)
    nextBlock.fallthrough = ft

    bindNew.parent.replaceJump(DirectCall(proc))
    bindNew.parent.fallthrough = Some(GoTo(List(nextBlock)))
    bindNew.parent.statements.remove(bindNew)
    nextBlock.statements.prepend(bindNew)

    (proc, spec)
  }

}
