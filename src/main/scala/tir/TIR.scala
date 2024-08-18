package tir


/*
 * New high level immutable IR for analysis. 
 *
 */


enum TIRType {
  case BitVector(val size: Int)
  case Integer
  case Boolean
}

enum LExpr {
  case Variable(name: String)
  case MemorySlice(memory: Variable, address: TIRType, value: TIRType)
} 

enum Expr {
  case Bool(e: BoolExpr) 
  case BV(size: Int, e: BoolExpr) 
  case I(e: IntExpr) 
}

enum BoolExpr {
  case Variable(name: String)
  case FApply(name: String, args: List[Expr])
  case Eq(arg1: Expr, arg2: Expr)
  case And(arg1: BoolExpr, arg2: BoolExpr)
  case Or(arg1: BoolExpr, arg2: BoolExpr)
  case Not(arg: BoolExpr)
  case Forall(bindings: List[(String, TIRType)], body: BoolExpr)
  case Exists(bindings: List[(String, TIRType)], body: BoolExpr)
  case UnsignedLessThan[T](arg1: BVExpr[T], arg2: BVExpr[T])
  case SignedLessThan[T](arg1: BVExpr[T], arg2: BVExpr[T])
  case IntLessThan(arg1: IntExpr, arg2: IntExpr)
}


enum BitwiseOp {
  case AND
  case OR
  case XOR
}


enum BVArithOp {
  case ADD
  case SUB
  case SDIV
  case SREM
  case SMOD /* ? */
  case MUL
  case UDIV /*  ? */
  case UREM /* ? */
  case ASHR
  case LSHR
  case SHL
}



enum BVExpr[T <: Int] {
  type sz = T

  case Variable(name: String, sz: Int) extends BVExpr
  case FApply(name: String, args: List[Expr], sz: Int) extends BVExpr
  case BitwiseBinExpr(op: BitwiseOp, arg1: BVExpr[T], arg2: BVExpr[T]) extends BVExpr
  case ArithBinop(op: BVArithOp, arg1: BVExpr[T], arg2: BVExpr[T]) extends BVExpr
  case Not(arg: BVExpr[T]) extends BVExpr
  case SignExtend[P, Q](arg: BVExpr[P]) extends BVExpr[Q]
  case ZeroExtend[P, Q](bits: Int, arg: BVExpr[P]) extends BVExpr[Q]
}



enum IntArithOp {
  case ADD
  case SUB
  case MUL
  case DIV
  case MOD
}

enum IntExpr {
  case Variable(name: String)
  case FApply(name: String, args: List[Expr])
  case BinaryExpr(op: IntArithOp, arg1: IntExpr, arg2: IntExpr)
  case Neg(arg: IntExpr)
}


