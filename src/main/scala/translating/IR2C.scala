package translating


import ir.*
import boogie.*
import specification.*
import util.{BoogieGeneratorConfig, BoogieMemoryAccessMode, ProcRelyVersion, Logger}

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable


object CTranslator extends Translator[String, String, String, String, String, String, String, String, String, String] {

  val globalDecls = mutable.Map[String, String]()

  def safeLabel(s: String) = s.replace("$", "").replace("~", "")

  def translateType(e: IRType): String = e match {
    case BoolType => "bool"
    case IntType       => "long long int"
    case BitVecType(64) =>  "unsigned long int"
    case BitVecType(32) =>  "unsigned int"
    case BitVecType(8) =>  "char"
    case BitVecType(1) =>  "bool"
    case MapType(p: BitVecType, q) => s"${translateType(q)}[]"
    case RefType(t, s) => translateType(t)
  }

  def varDecl(v: Variable) : String = v.scope match {
    case Scope.Const => s"const ${translateType(v.getType)} ${v.name}"
    case _ => s"${translateType(v.getType)} ${v.name}"
  } 


  def translateVar(e: Variable): String = e match {
    case Register(n, s)       => {
      globalDecls(n) = varDecl(e)
      n
    }
    case LocalVar(name, typ)  => {
      name
    } 
    case GlobalVar(name, typ) => {
      globalDecls(name) = varDecl(e)
      name
    }
    case GlobalConst(name, typ) => {
      globalDecls(name) = varDecl(e)
      name
    } 
    case m: Memory            => translateMem(m)
  }


  def translateMem(e: Memory): String = {
    globalDecls(e.name) = varDecl(e)
    e.name
  }


  def translateQuant(q: QuantifierExpr) = {
    "assert(false) /* Not implemented */ "
  }

  def translateBinOp(e: BinaryExpr) : String = e.op match {
    case _ => ""
  }

  def translateExpr(e: Expr): String = e match {
    case v: Variable => translateVar(v)
    case r: Register => translateVar(r)
    case TrueLiteral => "true"
    case FalseLiteral => "false"
    case IntLiteral(value) => s"$value"
    case BitVecLiteral(s, c) => s"$c"
    case ZeroExtend(ext, body) => translateExpr(body)
    case SignExtend(ext, body) => translateExpr(body)
    case UnaryExpr(op, arg) => op.toString + translateExpr(arg)
    case e: BinaryExpr => translateBinOp(e)
    case MemoryLoad(mem, index, endian, size) => {
      if (size <= 8) {
        s"${translateMem(mem)}[${index}]"
      } else {
        val xs = (0 until (size / 8)).map(i => s"(${translateMem(mem)}[$i] << ${8 * i})")
        xs.tail.foldLeft(xs.head)((a,b) => s"($a | $b)")
      }
    }
    case FApply(name, params, returnType, uninterpreted) => ???
    case q: QuantifierExpr =>  ???
    case Repeat(repeats, body) => {
        val sz = body.getType match {
          case BitVecType(sz) => sz
          case _ => ???
        }
        val xs = (0 until (repeats)).map(i => s"(${translateExpr(body)} << ${sz * i})").toList
        xs match {
          case h::Nil => h
          case h::tl => tl.foldLeft(h)((a,b) => s"($a | $b)")
        }
    }
    case OldExpr(e) => "/* old */"
    case Extract(e, start, body) => {
      val mask = (0 to (e - start)).map(x => "1").mkString("")
      s"((${translateExpr(body)} >> ${start}) & 0b${mask})" 
    }
  }

  def translateStatement(s: Statement): String = s match {
    case m: NOP => "/* nop */"
    case m: MemoryAssign =>
      val lhs = translateMem(m.mem)
      val rhs = translateExpr(m.value)
      s"for (int i = 0; i < ${m.size}; i++) {\n" + s"    ${lhs}[${m.index} + i] = ((char *)(&${rhs}))[i]" + "\n}"
    case l: Assign =>
      val lhs = translateVar(l.lhs)
      val rhs = translateExpr(l.rhs)
      s"$lhs = $rhs"
    case a: Assert =>
      val body = translateExpr(a.body)
      s"assert($body)"
    case a: Assume => s"/* $a */"
  }


  def translateJump(j: Jump): String = {
    j match {
      case d: DirectCall   => d.target.name + "()"
      case g: GoTo         => {
        if (g.targets.size == 1) {
          "goto " + safeLabel(g.targets.head.label)
        } else {
          g.targets.foreach(t => assert(t.statements.headOption.map(_.isInstanceOf[Assume]).getOrElse(false)))
          val conds = g.targets.map(t => (safeLabel(t.label), t.statements.head)).collect {
            case (l, a: Assume) => (l, a)
          }
          conds.map((l, t) => s"if (${translateExpr(t.body)}) { goto ${safeLabel(l)} ; }").mkString("\n")
        }
      }
      case f: IndirectCall => s"assert(false)"
      case r: Return       => "return" 
    }
  }


  override def translateProc(b: Procedure, attrs: String = ""): String = translateProc(b)
  override def translateBlock(b: Block, attrs: String = ""): String = translateBlock(b)
  def translateBlock(b: Block): String = {
    s"${safeLabel(b.label)}:\n" + b.statements.map(translateStatement).map(t => s"    $t;").mkString("\n") + translateJump(b.jump)
  }


  def translateProc(e: Procedure, pa: ProcSpec): String = {
    val body: String = (e.entryBlock.view ++ e.blocks.filterNot(x => e.entryBlock.contains(x))).map(x => translateBlock(x)).map(c => "    " + c.replace("\n", "\n    ")).mkString("\n")

    // val modifies = e.modifies.map(translateVar).toSet
    //
    s"void ${e.name}() {\n" + body + "\n}" 
  }

  def translateProg(p: Program) : String = {
    val procs = p.procedures.map(p => translateProc(p, ProcSpec())).mkString("\n\n")
    val decls = globalDecls.map((k,v) => v + ";").mkString("\n")
    val includes = "#include<stdbool.h>\n#include<stdint.h>\n"
    includes + decls + "\n\n" + procs
  }


}
