package nir

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

enum UnaryOpName:
  case IntNeg
  case BoolNot
  case BVNOT
  case BVNEG
  case OLD

enum UnaryOp(val s: UnaryOpName, val t: NType.Function):
  case intneg extends UnaryOp(UnaryOpName.IntNeg, NType.Function(List(NType.Int), NType.Int))
  case bvneg(sz: Int) extends UnaryOp(UnaryOpName.BVNEG, NType.Function(List(NType.Bitvector(sz)), NType.Bitvector(sz)))
  case bvnot(sz: Int) extends UnaryOp(UnaryOpName.BVNOT, NType.Function(List(NType.Bitvector(sz)), NType.Bitvector(sz)))
  case boolnot extends UnaryOp(UnaryOpName.BoolNot, NType.Function(List(NType.Bool), NType.Bool))
  case old(argt: NType) extends UnaryOp(UnaryOpName.OLD, NType.Function(List(argt), argt))

  def name(n: UnaryOpName) = {
    n match {
      case UnaryOpName.IntNeg => "-"
      case UnaryOpName.BoolNot => "!"
      case UnaryOpName.BVNEG => "neg"
      case UnaryOpName.BVNOT => "not"
      case UnaryOpName.OLD => "old"
    }
  }

enum BinaryOp(val s: BinOpName, val t: NType.Function):
  case bitvec(name: BinOpName, sz: Int) extends BinaryOp(name, NType.Function(List(NType.Bitvector(sz), NType.Bitvector(sz)), NType.Bitvector(sz)))
  case bvconcat(name: BinOpName, sz1: Int, sz2: Int) extends BinaryOp(name, NType.Function(List(NType.Bitvector(sz1), NType.Bitvector(sz2)), NType.Bitvector(sz1 + sz2)))
  case bvcomp(name: BinOpName, sz: Int) extends BinaryOp(name, NType.Function(List(NType.Bitvector(sz), NType.Bitvector(sz)), NType.Bitvector(sz)))
  case bvcompare(name: BinOpName, sz: Int) extends BinaryOp(name, NType.Function(List(NType.Bitvector(sz), NType.Bitvector(sz)), NType.Bool))
  case intbinop(name: BinOpName) extends BinaryOp(name, NType.Function(List(NType.Int), NType.Int))
  case intcompare(name: BinOpName) extends BinaryOp(name, NType.Function(List(NType.Int), NType.Bool))
  case bool(name: BinOpName) extends BinaryOp(name, NType.Function(List(NType.Bool, NType.Bool), NType.Bool))

enum BinOpName:
  // consider making bvops a separate type to deal with their dependently typed result value
  case BoolEQ
  case BoolNEQ
  case BoolAND
  case BoolOR
  case BoolIMPLIES
  case BoolEQUIV
  case BVAND
  case BVOR
  case BVADD
  case BVMUL
  case BVUDIV
  case BVUREM
  case BVSHL
  case BVLSHR
  case BVULT
  case BVNAND
  case BVNOR
  case BVXOR
  case BVXNOR
  case BVCOMP
  case BVSUB
  case BVSDIV
  case BVSREM
  case BVSMOD
  case BVASHR
  case BVULE
  case BVUGT
  case BVUGE
  case BVSLT
  case BVSLE
  case BVSGT
  case BVSGE
  case BVEQ
  case BVNEQ

  case BVCONCAT

  case IntADD
  case IntMUL
  case IntSUB
  case IntDIV
  case IntMOD
  case IntEQ
  case IntNEQ
  case IntLT
  case IntLE
  case IntGT
  case IntGE

  def name(n: BinOpName) = {
    n match {
      case BinOpName.BVCONCAT => "++"
      case BinOpName.BoolEQ => "=="
      case BinOpName.BoolNEQ => "!="
      case BinOpName.BoolAND => "&&"
      case BinOpName.BoolOR => "||"
      case BinOpName.BoolIMPLIES => "==>"
      case BinOpName.BoolEQUIV => "<==>"

      case BinOpName.IntADD => "+"
      case BinOpName.IntMUL => "*"
      case BinOpName.IntSUB => "-"
      case BinOpName.IntDIV => "div"
      case BinOpName.IntMOD => "mod"

      case BinOpName.IntEQ => "=="
      case BinOpName.IntNEQ => "!="
      case BinOpName.IntLT => "<"
      case BinOpName.IntLE => "<="
      case BinOpName.IntGT => ">"
      case BinOpName.IntGE => ">="
      case BinOpName.BVAND => "and"
      case BinOpName.BVOR => "or"
      case BinOpName.BVADD => "add"
      case BinOpName.BVMUL => "mul"
      case BinOpName.BVUDIV => "udiv"
      case BinOpName.BVUREM => "urem"
      case BinOpName.BVSHL => "shl"
      case BinOpName.BVLSHR => "lshr"
      case BinOpName.BVULT => "ult"
      case BinOpName.BVNAND => "nand"
      case BinOpName.BVNOR => "nor"
      case BinOpName.BVXOR => "xor"
      case BinOpName.BVXNOR => "xnor"
      case BinOpName.BVCOMP => "comp"
      case BinOpName.BVSUB => "sub"
      case BinOpName.BVSDIV => "sdiv"
      case BinOpName.BVSREM => "srem"
      case BinOpName.BVSMOD => "smod"
      case BinOpName.BVASHR => "ashr"
      case BinOpName.BVULE => "ule"
      case BinOpName.BVUGT => "ugt"
      case BinOpName.BVUGE => "uge"
      case BinOpName.BVSLT => "slt"
      case BinOpName.BVSLE => "sle"
      case BinOpName.BVSGT => "sgt"
      case BinOpName.BVSGE => "sge"
      case BinOpName.BVEQ => "=="
      case BinOpName.BVNEQ => "!="
    }
  }


case object BinOpDef:
  def fromBoolOp(s: String) = {
    s match {
       case "=="      =>  BinOpName.BoolEQ
       case "!="      =>  BinOpName.BoolNEQ
       case "&&"      =>  BinOpName.BoolAND
       case "||"      =>  BinOpName.BoolOR
       case "==>"     =>  BinOpName.BoolIMPLIES
       case "<==>"    =>  BinOpName.BoolEQUIV
    }
  }

  def fromIntOp(s: String) = {
    s match  {
     case "+"     =>  BinOpName.IntADD
     case "*"     =>  BinOpName.IntMUL
     case "-"     =>  BinOpName.IntSUB
     case "div"    =>  BinOpName.IntDIV
     case "mod"    =>  BinOpName.IntMOD
     case "=="    =>  BinOpName.IntEQ
     case "!="   =>  BinOpName.IntNEQ
     case "<"    =>  BinOpName.IntLT
     case "<="    =>  BinOpName.IntLE
     case ">"    =>  BinOpName.IntGT
     case ">="    =>  BinOpName.IntGE
    }
  }

  def fromBVOp(s: String) = {
    s match {
       case "and"   => BinOpName.BVAND
       case "or"   =>  BinOpName.BVOR 
       case "add"  =>  BinOpName.BVADD
       case "mul"  =>  BinOpName.BVMUL
       case  "udiv" =>  BinOpName.BVUDIV
       case  "urem" =>  BinOpName.BVUREM
       case "shl"  =>  BinOpName.BVSHL
       case  "lshr" =>  BinOpName.BVLSHR
       case "ult"  =>  BinOpName.BVULT
       case  "nand" =>  BinOpName.BVNAND
       case "nor"  =>  BinOpName.BVNOR
       case "xor"  =>  BinOpName.BVXOR
       case  "xnor" =>  BinOpName.BVXNOR
       case  "comp" =>  BinOpName.BVCOMP
       case "sub"  =>  BinOpName.BVSUB
       case  "sdiv" =>  BinOpName.BVSDIV
       case  "srem" =>  BinOpName.BVSREM
       case  "smod" =>  BinOpName.BVSMOD
       case  "ashr" =>  BinOpName.BVASHR
       case "ule"=>  BinOpName.BVULE
       case "ugt"=>  BinOpName.BVUGT
       case "uge"=>  BinOpName.BVUGE
       case "slt"=>  BinOpName.BVSLT
       case "sle"=>  BinOpName.BVSLE
       case "sgt"=>  BinOpName.BVSGT
       case "sge"=>  BinOpName.BVSGE
       case "==" =>  BinOpName.BVEQ 
       case "!=" =>  BinOpName.BVNEQ
    }
  }


  def BoolorIntOp(n: BinOpName) = {
    n match {
      case BinOpName.BoolEQ | BinOpName.BoolNEQ | BinOpName.BoolAND | BinOpName.BoolOR 
      | BinOpName.BoolIMPLIES | BinOpName.BoolEQUIV  => BinaryOp.bool(n)

      case BinOpName.IntADD
        | BinOpName.IntMUL
        | BinOpName.IntSUB
        | BinOpName.IntDIV
        | BinOpName.IntMOD => BinaryOp.intbinop(n)

      case BinOpName.IntEQ | BinOpName.IntNEQ | BinOpName.IntLT | BinOpName.IntLE
        | BinOpName.IntGT | BinOpName.IntGE => BinaryOp.intcompare(n)
      case _ => ???
    }
  }

  def BVCONCAT(sz1: Int, sz2: Int) = {
      BinaryOp.bvconcat(BinOpName.BVCONCAT, sz1, sz2)
  }

  def BVOP(n: BinOpName, sz: Int) = {
    n match {
      case BinOpName.BVAND
      | BinOpName.BVOR | BinOpName.BVADD | BinOpName.BVMUL | BinOpName.BVUDIV | BinOpName.BVUREM
      | BinOpName.BVSHL | BinOpName.BVLSHR | BinOpName.BVULT | BinOpName.BVNAND | BinOpName.BVNOR
      | BinOpName.BVXOR | BinOpName.BVXNOR | BinOpName.BVCOMP | BinOpName.BVSUB | BinOpName.BVSDIV
      | BinOpName.BVSREM | BinOpName.BVSMOD | BinOpName.BVASHR 
      => BinaryOp.bitvec(n, sz)
      case BinOpName.BVULE | BinOpName.BVUGT | BinOpName.BVUGE | BinOpName.BVSLT | BinOpName.BVSLE
      | BinOpName.BVSGT | BinOpName.BVSGE | BinOpName.BVEQ | BinOpName.BVNEQ 
      => BinaryOp.bvcompare(n,  sz)
      case _ => ???
    }
  }


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
  }

  def find_vars(e: RExpr) = {
    val f = VarFinder()
    val v = CILVisitor(f)
    v.visit_expr(e)
    f.vars
  }

  find_vars(e).toList
}

def toGamma(e: RExpr): RExpr = {
  e match {
    case RExpr.Variable(name, scope, shared,_) => RExpr.Variable("Gamma_" + name, scope, shared, NType.Bool)
    case e => {vars(e) match {
      case Nil => RExpr.Literal(LitExpr.TrueLiteral)
      case h::Nil => h
      case h::tl => tl.foldLeft(h: RExpr)((acc, n) => RExpr.BinaryExpr(BinOpDef.BoolorIntOp(BinOpName.BoolAND), acc, n))
    }
  }
  }
}

