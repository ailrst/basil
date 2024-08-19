package ir

import boogie._
import scala.collection.mutable
import ir.cilvisitor._
import util.Logger
import scala.util.matching.Regex




case class Relation(val body: Expr, relationName: Option[String] = None) {
  // A relation is not an expression since we have two states present
  // body: an Expr containing old()

  val name = relationName.getOrElse("Relation" + transforms.OldCounter.next())
  val assumptionProc = Procedure.stub(name)
  val assumptionSpec = specification.ProcSpec(ensures=List(this), modifies=transforms.sharedAccesses(body)._2.map(_.mem))

  /**
   * Get a list of assignments to local variables storing the terms that appear as old() in body,
   * and an assertion in terms of the old vars. 
   */
  def toAssertion(): (List[Statement], Assert) = {
    val (origExpr: Expr, replaced: Expr, vars: mutable.Map[LocalVar, Expr]) = transforms.oldsToVars(body)
    val assigns : List[Statement] = vars.toList.map((v: LocalVar, e: Expr) => Assign(v, e))
    (assigns, Assert(replaced)) 
  }


  /* 
   * Resolve to assertion by binding old to a specific state by caching it in a temporary variable.
   * Modifies the block(s) containing oldBinding and newBinding
   * Assertion is inserted after newBinding, and old(x) in the relation are bound
   * to the state before bindOld
   * Hence to relate the statements before and after a single statement you can make bindOld = bindNew
   * 
   * @returns the updated expressions
   */
  def toAssertion(bindOld: Statement, bindNew: Statement): Expr = {
    val (assigns, replaced) = toAssertion()
    bindOld.parent.statements.insertAllBefore(Some(bindOld), assigns)
    bindNew.parent.statements.insertAfter(bindNew, replaced)
    replaced.body
  }


  /* 
   * Resolve to a state transition/assumption by creating a procedure call to dummy procedure with the given specification
   * Returns the stub procedure ensuring the condition, and its function specification
   *
   * Argument bindNew becomes the first statement after the call to the relation function.
   *
   * **Mutates IR**
   */
  def toAssumption(bindNew: Statement): (Procedure, specification.ProcSpec) = {
    val jump = bindNew.parent.jump

    val target = bindNew.parent

    val afterStatements = bindNew.parent.statements.splitOn(bindNew) 

    val n = Regex(s"_${name}_[0-9]+$$")
    val suffix = s"_${name}_"
    val endBlock = Block(n.replaceAllIn(bindNew.parent.label, "") + suffix  + transforms.OldCounter.nextInt(), None, afterStatements, jump)

    val callBlock = Block(n.replaceAllIn(bindNew.parent.label, "") +  suffix + transforms.OldCounter.nextInt(), None, List(DirectCall(assumptionProc)), (GoTo(Seq(endBlock))))

    target.parent.addBlocks(callBlock)
    target.parent.addBlocks(endBlock)

    bindNew.parent.replaceJump(GoTo(callBlock))

    (assumptionProc, assumptionSpec)
  }

}
