package ir

import boogie._

sealed trait IRType(val name: String) {
  override def toString: String = name
  def toBoogie: BType
}

/*
 * Value types.
 *
 * Mutable value semantics is allowed via assignment to value-type variables, but effects
 * cannot be observed by other threads. 
 */

case object BoolType extends IRType("bool") {
  override def toBoogie: BType = BoolBType
}

case object IntType extends IRType("int") {
  override def toBoogie: BType = IntBType
}

case class BitVecType(size: Int) extends IRType("bv" + size) {
  override def toBoogie: BType = BitVecBType(size)
}

case class MapType(param: IRType, result: IRType) extends IRType(s"[$param]$result") {
  override def toBoogie: BType = MapBType(param.toBoogie, result.toBoogie)
}


enum AccessType {
  case Shared
  case Unshared
}

/**
 * A mutable reference type: must be accessed through loads and stores,
 * but effects cannot be observed by other threads.
 */
case class RefType(val value: IRType, val shared: AccessType) extends IRType(s"ref<${value.name}>") {
  override def toBoogie: BType = value.toBoogie
  println(name)
}

def coerceToTypeSafe(e: Expr, t: IRType) = {
  (e.getType, t) match {
    case (_: BitVecType, o: BitVecType) => coerceToBVsafe(e, o)
    case _ => throw Exception(s"No safe conversion ${e.getType} to $t (implemented)")
  }

}

def coerceToBVsafe(e: Expr, t: BitVecType) = {
  e.getType match {
    case BitVecType(sz) if (t.size == sz) => e
    case BitVecType(sz) if (t.size < sz) => Extract(t.size, 0, e)
    case _ => throw Exception(s"No safe conversion ${e.getType} to $t")
  }
}

def coerceToBool(e: Expr): Expr = {
  e.getType match {
    case BitVecType(s) => BinaryExpr(BVNEQ, e, BitVecLiteral(0, s))
    case IntType => BinaryExpr(IntNEQ, e, IntLiteral(0))
    case BoolType => e
    case MapType(_, _) => ???
    case r: RefType => ???
  }
}
