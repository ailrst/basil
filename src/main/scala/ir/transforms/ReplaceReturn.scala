package ir.transforms

import ir.cilvisitor._
import ir._

class ReplaceReturns extends CILVisitor {

  override def vjump(j: Jump): VisitAction[Jump] = {
    j match {
      case IndirectCall(Register("R30", _), _)    => ChangeTo(Return())
      case _                                      => DoChildren()
    }
  }
}

