package ir

import boogie._
import scala.collection.mutable

enum NType:
  case Bool
  case Int
  case Bitvector(size: Int)
  case Map(f: NType, t: NType)
  case Function(arg: List[NType], ret: NType)

enum ScopeDef:
  case Local
  case Global

enum UnaryOp(val n: String, val t: NType.Function):
  case intneg extends UnaryOp("-", NType.Function(List(NType.Int), NType.Int))
  case bvneg(sz: Int) extends UnaryOp("neg", NType.Function(List(NType.Bitvector(sz)), NType.Bitvector(sz)))
  case bvnot(sz: Int) extends UnaryOp("not", NType.Function(List(NType.Bitvector(sz)), NType.Bitvector(sz)))
  case bveq(sz: Int) extends UnaryOp("=", NType.Function(List(NType.Bitvector(sz), NType.Bitvector(sz)), NType.Bool))
  case boolnot extends UnaryOp("!", NType.Function(List(NType.Bool), NType.Bool))
  case old(argt: NType) extends UnaryOp("old", NType.Function(List(argt), argt))

enum BinaryOp(val n: String, val t: NType.Function):
  case bvbinop(sz: Int, name: String) extends BinaryOp(name, NType.Function(List(NType.Bitvector(sz), NType.Bitvector(sz)), NType.Bitvector(sz)))
  case bvconcat(sz1: Int, sz2: Int) extends BinaryOp("++", NType.Function(List(NType.Bitvector(sz1), NType.Bitvector(sz2)), NType.Bitvector(sz1 + sz2)))
  case bvcomp(sz: Int) extends BinaryOp("comp", NType.Function(List(NType.Bitvector(sz), NType.Bitvector(sz)), NType.Bitvector(sz)))
  case bvcompare(sz: Int, name: String) extends BinaryOp(name, NType.Function(List(NType.Bitvector(sz), NType.Bitvector(sz)), NType.Bool))
  case intbinop(name: String) extends BinaryOp(name, NType.Function(List(NType.Int), NType.Int))
  case intcompare(name: String) extends BinaryOp(name, NType.Function(List(NType.Int), NType.Bool))
  case boolbinop(name: String) extends BinaryOp(name, NType.Function(List(NType.Bool, NType.Bool), NType.Bool))

enum RExpr(val t: NType):
  case Literal(l: LitExpr) extends RExpr(l.t)
  case ExtractBits(end: Int, start: Int, arg: RExpr) extends RExpr(NType.Bitvector(end - start))
  case RepeatBits(repeats: Int, arg: RExpr) extends RExpr(NType.Bitvector(repeats * getsize(arg)))
  case ZeroExtendBits(bits: Int, arg: RExpr) extends RExpr(NType.Bitvector(bits + getsize(arg)))
  case SignExtendBits(bits: Int, arg: RExpr) extends RExpr(NType.Bitvector(bits + getsize(arg)))
  case BinaryExpr(op: BinaryOp, arg: RExpr, arg2: RExpr) extends RExpr(op.t.ret)
  case UnaryExpr(op: UnaryOp, arg: RExpr) extends RExpr(op.t.ret)
  case Variable(name: String, scope: ScopeDef, shared: Boolean, typ: NType) extends RExpr(typ)

enum LitExpr(val t: NType):
  case TrueLiteral extends LitExpr(NType.Bool)
  case FalseLiteral extends LitExpr(NType.Bool)
  case BitVecLiteral(value: BigInt, s: Int) extends LitExpr(NType.Bitvector(s))
  case IntLiteral(value: BigInt) extends LitExpr(NType.Int)

/* separating lexprs from exprs makes it simpler to type-safely restrict sub-expressions. */
enum LExpr(val t: NType):
  case Variable(name: String, scope: ScopeDef, shared: Boolean, typ: NType) extends LExpr(typ)

enum NStatement:
  case Assign(v: LExpr, value: RExpr)
  case Load(dest: LExpr, source: RExpr, ind: RExpr, size: Int, value: RExpr)
  case Store(v: LExpr, ind: RExpr, value: RExpr)
  case Assert(value: RExpr)
  case Assume(value: RExpr)
  case Return(value: RExpr)

def getsize(b: RExpr) = b.t match 
  case NType.Bitvector(t) => t
  case _ => throw Exception("No") 

def vars (e: RExpr) = {

  class VarFinder extends CILVisitorImpl {
    var vars = mutable.Set[RExpr.Variable]()

    override def vvar(v: RExpr.Variable) : VisitAction[RExpr.Variable] = {
      vars.add(v)
      VisitAction.DoChildren()
    }

    def find_vars(e: RExpr) = {
      val f = VarFinder()
      val v = CILVisitor(f) 
      v.visit_expr(e)
      f.vars
    }

  }

}

def toGamma(e: RExpr): RExpr = {
  e match {
    case RExpr.Variable(name, scope, shared,_) => RExpr.Variable("Gamma_" + name, scope, shared, NType.Bool)
    case e => VarFinder()
  }
}

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
      case RExpr.ExtractBits(end: Int, start: Int, arg: RExpr) => RExpr.ExtractBits(end: Int, start: Int, visit_expr(arg))
      case RExpr.RepeatBits(repeats: Int, arg: RExpr) => RExpr.RepeatBits(repeats: Int, visit_expr(arg))
      case RExpr.ZeroExtendBits(bits: Int, arg: RExpr) => RExpr.ZeroExtendBits(bits, visit_expr(arg))
      case RExpr.SignExtendBits(bits: Int, arg: RExpr) => RExpr.SignExtendBits(bits, visit_expr(arg))
      case RExpr.BinaryExpr(op: BinaryOp, arg: RExpr, arg2: RExpr) => RExpr.BinaryExpr(op, visit_expr(arg), visit_expr(arg2))
      case RExpr.UnaryExpr(op: UnaryOp, arg: RExpr) => RExpr.UnaryExpr(op, visit_expr(arg))
      case RExpr.Variable(name: String, scope: ScopeDef, shared: Boolean, typ: NType) => visit_var(n.asInstanceOf[RExpr.Variable])
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
      case Return(value) => Return(visit_expr(value))
    }
    doVisit(v, v.vstmt(s), s, continue)
  }

  def visit_stmts(ss: List[NStatement]): List[NStatement] = {
    def continue (v: CILVisitorImpl, ss: List[NStatement]) = ss.map(visit_stmt)
    doVisit(v, v.vstmts(ss), ss, continue)
  }
}

sealed trait Expr {
  def toBoogie: BExpr
  def toGamma: BExpr = {
    val gammaVars: Set[BExpr] = gammas.map(_.toGamma)
    if (gammaVars.isEmpty) {
      TrueBLiteral
    } else if (gammaVars.size == 1) {
      gammaVars.head
    } else {
      gammaVars.tail.foldLeft(gammaVars.head) { (join: BExpr, next: BExpr) =>
        BinaryBExpr(BoolAND, next, join)
      }
    }
  }
  def loads: Set[MemoryLoad] = Set()
  def getType: IRType
  def gammas: Set[Expr] = Set()
  def variables: Set[Variable] = Set()
  def acceptVisit(visitor: Visitor): Expr = throw new Exception("visitor " + visitor + " unimplemented for: " + this)
}

sealed trait Literal extends Expr {
  override def acceptVisit(visitor: Visitor): Literal = visitor.visitLiteral(this)
}

sealed trait BoolLit extends Literal

case object TrueLiteral extends BoolLit {
  override def toBoogie: BoolBLiteral = TrueBLiteral
  override def getType: IRType = BoolType
  override def toString: String = "true"
}

case object FalseLiteral extends BoolLit {
  override def toBoogie: BoolBLiteral = FalseBLiteral
  override def getType: IRType = BoolType
  override def toString: String = "false"
}

case class BitVecLiteral(value: BigInt, size: Int) extends Literal {
  override def toBoogie: BitVecBLiteral = BitVecBLiteral(value, size)
  override def getType: IRType = BitVecType(size)
  override def toString: String = s"${value}bv$size"
}

case class IntLiteral(value: BigInt) extends Literal {
  override def toBoogie: IntBLiteral = IntBLiteral(value)
  override def getType: IRType = IntType
  override def toString: String = value.toString
}

/**
  * @param end : high bit exclusive
  * @param start : low bit inclusive
  * @param body
  */
case class Extract(end: Int, start: Int, body: Expr) extends Expr {
  override def toBoogie: BExpr = BVExtract(end, start, body.toBoogie)
  override def gammas: Set[Expr] = body.gammas
  override def variables: Set[Variable] = body.variables
  override def getType: BitVecType = BitVecType(end - start)
  override def toString: String = s"$body[$end:$start]"
  override def acceptVisit(visitor: Visitor): Expr = visitor.visitExtract(this)
  override def loads: Set[MemoryLoad] = body.loads
}

case class Repeat(repeats: Int, body: Expr) extends Expr {
  override def toBoogie: BExpr = BVRepeat(repeats, body.toBoogie)
  override def gammas: Set[Expr] = body.gammas
  override def variables: Set[Variable] = body.variables
  override def getType: BitVecType = BitVecType(bodySize * repeats)
  private def bodySize: Int = body.getType match {
    case bv: BitVecType => bv.size
    case _ => throw new Exception("type mismatch, non bv expression: " + body + " in body of repeat: " + this)
  }
  override def toString: String = s"Repeat($repeats, $body)"
  override def acceptVisit(visitor: Visitor): Expr = visitor.visitRepeat(this)
  override def loads: Set[MemoryLoad] = body.loads
}

case class ZeroExtend(extension: Int, body: Expr) extends Expr {
  override def toBoogie: BExpr = BVZeroExtend(extension, body.toBoogie)
  override def gammas: Set[Expr] = body.gammas
  override def variables: Set[Variable] = body.variables
  override def getType: BitVecType = BitVecType(bodySize + extension)
  private def bodySize: Int = body.getType match {
    case bv: BitVecType => bv.size
    case _ => throw new Exception("type mismatch, non bv expression: " + body + " in body of zero extend: " + this)
  }
  override def toString: String = s"ZeroExtend($extension, $body)"
  override def acceptVisit(visitor: Visitor): Expr = visitor.visitZeroExtend(this)
  override def loads: Set[MemoryLoad] = body.loads
}

case class SignExtend(extension: Int, body: Expr) extends Expr {
  override def toBoogie: BExpr = BVSignExtend(extension, body.toBoogie)
  override def gammas: Set[Expr] = body.gammas
  override def variables: Set[Variable] = body.variables
  override def getType: BitVecType = BitVecType(bodySize + extension)
  private def bodySize: Int = body.getType match {
    case bv: BitVecType => bv.size
    case _ => throw new Exception("type mismatch, non bv expression: " + body + " in body of sign extend: " + this)
  }
  override def toString: String = s"SignExtend($extension, $body)"
  override def acceptVisit(visitor: Visitor): Expr = visitor.visitSignExtend(this)
  override def loads: Set[MemoryLoad] = body.loads
}

case class UnaryExpr(op: UnOp, arg: Expr) extends Expr {
  override def toBoogie: BExpr = UnaryBExpr(op, arg.toBoogie)
  override def gammas: Set[Expr] = arg.gammas
  override def variables: Set[Variable] = arg.variables
  override def loads: Set[MemoryLoad] = arg.loads
  override def getType: IRType = (op, arg.getType) match {
    case (_: BoolUnOp, BoolType)     => BoolType
    case (_: BVUnOp, bv: BitVecType) => bv
    case (_: IntUnOp, IntType)       => IntType
    case _ => throw new Exception("type mismatch, operator " + op + " type doesn't match arg: " + arg)
  }

  private def inSize = arg.getType match {
    case bv: BitVecType => bv.size
    case _              => throw new Exception("type mismatch")
  }

  override def toString: String = op match {
    case uOp: BoolUnOp => s"($uOp$arg)"
    case uOp: BVUnOp   => s"bv$uOp$inSize($arg)"
    case uOp: IntUnOp  => s"($uOp$arg)"
  }

  override def acceptVisit(visitor: Visitor): Expr = visitor.visitUnaryExpr(this)
}

trait UnOp

sealed trait BoolUnOp(op: String) extends UnOp {
  override def toString: String = op
}

case object BoolNOT extends BoolUnOp("!")

sealed trait IntUnOp(op: String) extends UnOp {
  override def toString: String = op
  def toBV: BVUnOp = BVNEG
}

case object IntNEG extends IntUnOp("-")


sealed trait BVUnOp(op: String) extends UnOp {
  override def toString: String = op
}

case object BVNOT extends BVUnOp("not")
case object BVNEG extends BVUnOp("neg")



case class BinaryExpr(op: BinOp, arg1: Expr, arg2: Expr) extends Expr {
  override def toBoogie: BExpr = BinaryBExpr(op, arg1.toBoogie, arg2.toBoogie)
  override def gammas: Set[Expr] = arg1.gammas ++ arg2.gammas
  override def variables: Set[Variable] = arg1.variables ++ arg2.variables
  override def loads: Set[MemoryLoad] = arg1.loads ++ arg2.loads
  override def getType: IRType = (op, arg1.getType, arg2.getType) match {
    case (_: BoolBinOp, BoolType, BoolType) => BoolType
    case (binOp: BVBinOp, bv1: BitVecType, bv2: BitVecType) =>
      binOp match {
        case BVCONCAT =>
          BitVecType(bv1.size + bv2.size)
        case BVAND | BVOR | BVADD | BVMUL | BVUDIV | BVUREM | BVSHL | BVLSHR | BVNAND | BVNOR | BVXOR | BVXNOR | BVSUB |
            BVSREM | BVSDIV | BVSMOD | BVASHR =>
          if (bv1.size == bv2.size) {
            bv1
          } else {
            throw new Exception("bitvector size mismatch")
          }
        case BVCOMP =>
          if (bv1.size == bv2.size) {
            BitVecType(1)
          } else {
            throw new Exception("bitvector size mismatch")
          }
        case BVULT | BVULE | BVUGT | BVUGE | BVSLT | BVSLE | BVSGT | BVSGE =>
          if (bv1.size == bv2.size) {
            BoolType
          } else {
            throw new Exception("bitvector size mismatch")
          }
        case BVEQ | BVNEQ =>
          BoolType
      }
    case (intOp: IntBinOp, IntType, IntType) =>
      intOp match {
        case IntADD | IntSUB | IntMUL | IntDIV | IntMOD     => IntType
        case IntEQ | IntNEQ | IntLT | IntLE | IntGT | IntGE => BoolType
      }
    case _ =>
      throw new Exception("type mismatch, operator " + op + " type doesn't match args: (" + arg1 + ", " + arg2 + ")")
  }

  private def inSize = arg1.getType match {
    case bv: BitVecType => bv.size
    case _              => throw new Exception("type mismatch")
  }

  override def toString: String = op match {
    case bOp: BoolBinOp => s"($arg1 $bOp $arg2)"
    case bOp: BVBinOp =>
      bOp match {
        case BVEQ | BVNEQ | BVCONCAT =>
          s"($arg1 $bOp $arg2)"
        case _ =>
          s"bv$bOp$inSize($arg1, $arg2)"
      }
    case bOp: IntBinOp => s"($arg1 $bOp $arg2)"
  }

  override def acceptVisit(visitor: Visitor): Expr = visitor.visitBinaryExpr(this)

}

trait BinOp

sealed trait BoolBinOp(op: String) extends BinOp {
  override def toString: String = op
}

case object BoolEQ extends BoolBinOp("==")
case object BoolNEQ extends BoolBinOp("!=")
case object BoolAND extends BoolBinOp("&&")
case object BoolOR extends BoolBinOp("||")
case object BoolIMPLIES extends BoolBinOp("==>")
case object BoolEQUIV extends BoolBinOp("<==>")

sealed trait BVBinOp(op: String) extends BinOp {
  override def toString: String = op
}

case object BVAND extends BVBinOp("and")
case object BVOR extends BVBinOp("or")
case object BVADD extends BVBinOp("add")
case object BVMUL extends BVBinOp("mul")
case object BVUDIV extends BVBinOp("udiv")
case object BVUREM extends BVBinOp("urem")
case object BVSHL extends BVBinOp("shl")
case object BVLSHR extends BVBinOp("lshr")
case object BVULT extends BVBinOp("ult")
case object BVNAND extends BVBinOp("nand")
case object BVNOR extends BVBinOp("nor")
case object BVXOR extends BVBinOp("xor")
case object BVXNOR extends BVBinOp("xnor")
case object BVCOMP extends BVBinOp("comp")
case object BVSUB extends BVBinOp("sub")
case object BVSDIV extends BVBinOp("sdiv")
case object BVSREM extends BVBinOp("srem")
case object BVSMOD extends BVBinOp("smod")
case object BVASHR extends BVBinOp("ashr")
case object BVULE extends BVBinOp("ule")
case object BVUGT extends BVBinOp("ugt")
case object BVUGE extends BVBinOp("uge")
case object BVSLT extends BVBinOp("slt")
case object BVSLE extends BVBinOp("sle")
case object BVSGT extends BVBinOp("sgt")
case object BVSGE extends BVBinOp("sge")
case object BVEQ extends BVBinOp("==")
case object BVNEQ extends BVBinOp("!=")
case object BVCONCAT extends BVBinOp("++")

sealed trait IntBinOp(op: String) extends BinOp {
  override def toString: String = op
  def toBV: BVBinOp = this match {
    case IntADD => BVADD
    case IntMUL => BVMUL
    case IntSUB => BVSUB
    case IntDIV => BVSDIV
    case IntMOD => BVSMOD
    case IntEQ  => BVEQ
    case IntNEQ => BVNEQ
    case IntLT  => BVSLT
    case IntLE  => BVSLE
    case IntGT  => BVSGT
    case IntGE  => BVSGE
  }
}

case object IntADD extends IntBinOp("+")
case object IntMUL extends IntBinOp("*")
case object IntSUB extends IntBinOp("-")
case object IntDIV extends IntBinOp("div")
case object IntMOD extends IntBinOp("mod")
case object IntEQ extends IntBinOp("==")
case object IntNEQ extends IntBinOp("!=")
case object IntLT extends IntBinOp("<")
case object IntLE extends IntBinOp("<=")
case object IntGT extends IntBinOp(">")
case object IntGE extends IntBinOp(">=")

enum Endian {
  case LittleEndian
  case BigEndian
}

case class MemoryStore(mem: Memory, index: Expr, value: Expr, endian: Endian, size: Int) extends Expr {
  override def toBoogie: BMemoryStore = BMemoryStore(mem.toBoogie, index.toBoogie, value.toBoogie, endian, size)
  override def toGamma: GammaStore =
    GammaStore(mem.toGamma, index.toBoogie, value.toGamma, size, size / mem.valueSize)

  override def gammas: Set[Expr] = Set()
  override def loads: Set[MemoryLoad] = index.loads ++ value.loads
  override def variables: Set[Variable] = index.variables ++ value.variables

  override def getType: IRType = BitVecType(size)
  override def toString: String = s"MemoryStore($mem, $index, $value, $endian, $size)"
  override def acceptVisit(visitor: Visitor): Expr = visitor.visitMemoryStore(this)
}

case class MemoryLoad(mem: Memory, index: Expr, endian: Endian, size: Int) extends Expr {
  override def toBoogie: BMemoryLoad = BMemoryLoad(mem.toBoogie, index.toBoogie, endian, size)
  override def toGamma: BExpr = if (mem.name == "stack") {
    GammaLoad(mem.toGamma, index.toBoogie, size, size / mem.valueSize)
  } else {
    BinaryBExpr(
      BoolOR,
      GammaLoad(mem.toGamma, index.toBoogie, size, size / mem.valueSize),
      L(mem.toBoogie, index.toBoogie)
    )
  }
  override def variables: Set[Variable] = index.variables
  override def gammas: Set[Expr] = Set(this)
  override def loads: Set[MemoryLoad] = Set(this)
  override def getType: IRType = BitVecType(size)
  override def toString: String = s"MemoryLoad($mem, $index, $endian, $size)"
  override def acceptVisit(visitor: Visitor): Expr = visitor.visitMemoryLoad(this)
}

sealed trait Global

case class Memory(name: String, addressSize: Int, valueSize: Int) extends Expr with Global {
  override def toBoogie: BMapVar =
    BMapVar(name, MapBType(BitVecBType(addressSize), BitVecBType(valueSize)), Scope.Global)
  override def toGamma: BMapVar = BMapVar(s"Gamma_$name", MapBType(BitVecBType(addressSize), BoolBType), Scope.Global)
  override val getType: IRType = MapType(BitVecType(addressSize), BitVecType(valueSize))
  override def toString: String = s"Memory($name, $addressSize, $valueSize)"
  override def acceptVisit(visitor: Visitor): Expr = visitor.visitMemory(this)
}

sealed trait Variable extends Expr {
  val name: String
  val irType: IRType
  val ssa_id: mutable.Set[Int] = mutable.Set[Int]()
  var sharedVariable: Boolean = false

  override def getType: IRType = irType
  override def variables: Set[Variable] = Set(this)
  override def gammas: Set[Expr] = Set(this)
  override def toBoogie: BVar
  // placeholder definition not actually used
  override def toGamma: BVar = BVariable(s"$name", irType.toBoogie, Scope.Global)

  def size: Int = irType match {
    case b: BitVecType => b.size
    case _             => throw new Exception("tried to get size of non-bitvector")
  }

  override def toString: String = s"Variable($name, $irType)"

  override def acceptVisit(visitor: Visitor): Variable =
    throw new Exception("visitor " + visitor + " unimplemented for: " + this)
}

case class Register(override val name: String, override val irType: IRType) extends Variable with Global {
  override def toGamma: BVar = BVariable(s"Gamma_$name", BoolBType, Scope.Global)
  override def toBoogie: BVar = BVariable(s"$name", irType.toBoogie, Scope.Global)
  override def toString: String = s"Register(${name}_${ssa_id}_$sharedVariable, $irType)"
  override def acceptVisit(visitor: Visitor): Variable = visitor.visitRegister(this)
  override def size: Int = irType.asInstanceOf[BitVecType].size
}

case class LocalVar(override val name: String, override val irType: IRType) extends Variable {
  override def toGamma: BVar = BVariable(s"Gamma_$name", BoolBType, Scope.Local)
  override def toBoogie: BVar = BVariable(s"$name", irType.toBoogie, Scope.Local)
  override def toString: String = s"LocalVar(${name}_${ssa_id}_$sharedVariable, $irType)"
  override def acceptVisit(visitor: Visitor): Variable = visitor.visitLocalVar(this)
}
