package translating

import Parsers.SpecificationsNeueParser._

import java.io.Writer
import scala.math.pow
import java.io.StringWriter
import specification._
import util.Logger
import ir._
import boogie.Scope

import scala.collection.mutable.Stack
import scala.collection.mutable.ArrayBuffer
import scala.jdk.CollectionConverters._
import scala.collection.mutable.Buffer
import scala.collection.mutable.HashMap

import analysis.evaluateExpression

// take symbol table entries as input
// parse all global defs and check sizes
// use these new nameToGlobals going forward when parsing the rest of the spec

//case class SpecificationInfo(variables: Set[Variable])

class TypeError(msg: String) extends Exception(msg)

var counter = 0

sealed trait SExpr:
  def prettyPrint(w: Writer, indentLevel: Int): String
  def satisfies(o: SExpr): Boolean
  def getType: SType
  def toSList: SSExpr.SList
  def toSStruct(t: SType.SStruct): SSExpr.SStruct
  def toExpr: Option[Expr]
  def toInt: Option[BigInt]
  def toBitVec(bt: BitVecType): Option[BitVecLiteral]
  def coerceTo(t : SType): Option[SExpr]

enum SType:
  case Top
  case Bot
  case SSymbol
  case Val(t: IRType)
  case NumberVal
  case MapVal  // this exists to represent Val(MapType) for any posisble values constructing maptype 
  case SList(typs: List[SType])
  case SStruct(fields: List[(String, SType)]) // note that any struct satisfies SStruct(List.empty)
  case SFunc(args: List[(String, SType)], ret: SType)

  def satisfies(o: SType): Boolean = {
    // this satisfies o
    // o :>  this
    ((o, this) match {
      case (_, Bot)                        => false
      case (Bot, _)                        => false
      case (_, Top)                        => true
      case (Top, _)                        => true
      case (NumberVal, Val(b: BitVecType)) => true
      case (NumberVal, Val(IntType))       => true
      case (MapVal, Val(b: MapType))       => true
      // Any list is compatible with any other list, we dont consider number or type of list elements, for that purpose we have struct.
      case (SList(a), SList(b)) => true
      //case (SList(a), SStruct(b)) => b.size >= a.size && a.indices.forall(i => a(i) == b(i)._2)   // coercible not compatible
      //case (SStruct(a), SList(b)) => b.size >= a.size && a.indices.forall(i => a(i)._2 == b(i))
      // Structs b <: a if all fields in b are in a, and have compatible types
      case (SStruct(a), SStruct(b)) =>
        b.size >= a.size && a.indices.forall(i => a(i)._1 == b(i)._1 && (b(i)._2.satisfies(a(i)._2)))
      // The type of a function argument list is intentionally the same as the type of struct.
      case (SFunc(ap, ar), SFunc(bp, br)) => SStruct(bp).satisfies(SStruct(ap)) && br.satisfies(ar)
      case (a, b)                         => a == b
    })
  }

enum SSExpr(typ: SType) extends SExpr:
  case SSymbol(e: String) extends SSExpr(SType.SSymbol)
  case SVariable(name: String, typ: SType, free: Boolean = false) extends SSExpr(typ)
  case Val(e: Expr) extends SSExpr(SType.Val(e.getType))
  case SList(e: List[SExpr]) extends SSExpr(SType.SList(e.map(_.getType)))

  // assuming sstruct 
  //  1. has no duplicate fields
  //  2. For the declared type typ = Some(t), e satisfies t
  case SStruct(e: List[(String, SExpr)], typ: Option[SType.SStruct]) extends SSExpr(typ.getOrElse(SType.SStruct(e.map((k, v) => (k, v.getType)))))

  case SFunc(name: String, args: List[(String, SType)], ret: SType, body: Option[SExpr]) extends SSExpr(SType.Top)
  case SApply(fun: SFunc, args: SList) extends SSExpr(fun.ret) 
  case SIndirApply(fun: SExpr, args: SExpr) // evaluates down to an SApply.
      extends SSExpr(fun match
        case f: SFunc => f.ret
        case _        => SType.Top
      )
  case SFieldAccess(struct: SExpr, field: String)
      extends SSExpr(struct match
        case s: SStruct => s.e.find(_._1 == field).get._2.getType
        case _          => SType.Top
      )



  override def prettyPrint(w: Writer = StringWriter(), indentLevel: Int = 0): String = {

    this match {
      case Val(n: Variable) => w.write(s"${n.name}")
      case Val(e) => w.write(e.toString)
      case SVariable(name, SType.Val(t), _) => w.write(s"$name")
      case SVariable(name, t, _) => w.write(s"$name")
      case SSymbol(e) => w.write(e)
      case SList(e) => {
        w.write("(")
        e.head.prettyPrint(w, indentLevel)
        e.tail.foreach(v => {
          w.write(", ")
          v.prettyPrint(w, indentLevel)
        })
        w.write(")")
      }
      case SStruct(e, t) => {
        w.write("{")
        w.write("\n")
        w.write("  " * (indentLevel + 1))
        w.write(s"${e.head._1} : ${e.head._2.getType} = ")
        e.head._2.prettyPrint(w, indentLevel + 1)
        e.tail.foreach((n, v) => {
          w.write(";\n")
          w.write("  " * (indentLevel + 1))
          w.write(s"${n} : ${v.getType} = ")
          v.prettyPrint(w, indentLevel + 1)
        })
        w.write("\n" + "  " * (indentLevel))
        w.write("}")
      }
      case e: SFunc => w.write(s"${e.name} ${e.args} -> ${e.body.map(_.toString).getOrElse(e.ret.toString)}")
      case e: SApply => {
        w.write(s"${e.fun.name} ")
        e.args.prettyPrint(w, indentLevel)
      }
      case e: SIndirApply => {
        e.fun.prettyPrint(w, indentLevel)
        w.write("[")
        e.args.prettyPrint(w, indentLevel)
        w.write("]")
      }
      case e: SFieldAccess => {
        e.struct.prettyPrint(w, indentLevel)
        w.write("." + e.field)
      }
    }

    w.toString
  }

  override def getType: SType = typ

  /** this :< o
    */
  override def satisfies(o: SExpr): Boolean = {
    o.getType.satisfies(typ)
  }

  override def coerceTo(t : SType): Option[SExpr] = {
    throw NotImplementedError("TODO")
  }


  /**
   * Coerce to a bitvector of a given size, if the unsigned value fits in it. 
   */
  def toBitVec(bt: BitVecType): Option[BitVecLiteral] = {

    def fitsIn(n: BigInt, bits: Int = bt.size) = {
      val maxUnsigned = math.pow(2, bits).intValue - 1
      n <= maxUnsigned
    }

    this match {
      case Val(BitVecLiteral(value, s))  if fitsIn(value) => Some(BitVecLiteral(value, bt.size))
      case Val(IntLiteral(value))     if fitsIn(value) => Some(BitVecLiteral(value, bt.size))
      case SList(e :: Nil)                  => e.toBitVec(bt)
      case _                                => None
    }
  }


  /**
   * Coerce the value to an arbitrary size integer if possible.
   */
  override def toInt: Option[BigInt] = {
    this match {
      case Val(BitVecLiteral(value, _))     => Some(value)
      case Val(IntLiteral(value))           => Some(value)
      case SList(e :: Nil)                  => e.toInt
      case _                                => None
    }
  }

  /**
   * Convert to raw expression if possible. Unitary lists are squashed into 
   * expressions. 
   */
  override def toExpr: Option[Expr] = {
    this match {
      case Val(e)                           => Some(e)
      case SList(e :: Nil)                  => e.toExpr
      case SVariable(name, SType.Val(t), _) => Some(LocalVar(name, t))
      case SSymbol(e)                       => None
      case SList(e)                         => None
      case SStruct(_, _)                    => None
      case _: SVariable                     => None
      case _: SFunc                         => None
      case _: SApply                        => None
      case _: SIndirApply                   => None
      case _: SFieldAccess                  => None
    }
  }

  /**
   * Coerce this to a struct satisfying a given type. 
   *
   * If we contain more fields than the struct then arbitarry fields names are used.  
   */
  override def toSStruct(t: SType.SStruct): SStruct = {
    var fieldCounter = 0

    val fieldnames = t.fields.map(_._1).toArray

    val sform : SStruct = this match {
      case s: Val => SStruct(List((fieldnames(0), s)), Some(t))
      case s: SList   => SStruct(s.e.indices.map(i =>  {
        val fieldname = (if (i < fieldnames.size) then fieldnames(i) else s"field${fieldCounter+=1}")
        (fieldname, s.e(i))
        }).toList, Some(t))
      case s: SStruct  =>  s
      case o  => SStruct(List((fieldnames(0), o)), Some(t))
    }

    if (!sform.getType.satisfies(t)) {
      throw TypeError(s"Cannot coerce $this to sstruct ($t)")
    }

    sform
  }


  /**
   * Coerce the value to an SList, possibly boxing it in a new list. 
   */
  override def toSList: SList = {
    this match {
      case SList(s :: Nil)   => s.toSList // not sound
      case s: SList   => s
      case s: SStruct => SList(s.e.map(_._2))
      case o          => SList(List(o))
    }
  }


class Evaluator {
  import SSExpr._

  val bindings = Stack[Map[String, SExpr]]()


  val memoryRegionType = SType.SStruct(List(
      ("region", SType.SSymbol), 
      ("address", SType.NumberVal),
      ("size", SType.NumberVal)
    ))


  def bindGlobals(globs: Set[SpecGlobal]) = {
    import BuiltinFun._
    // case class SpecGlobal(name: String, override val size: Int, arraySize: Option[Int], address: BigInt)

    //val mem = SVariable("mem", SType.Val(MapType(BitVecType(64), BitVecType(8))))
    //val gammaMem = SVariable("Gamma_mem", SType.Val(MapType(BitVecType(64), BoolType)))

    val mem = Memory("mem", 64, 8)
    val gammaMem = Register("Gamma_mem", MapType(BitVecType(64), BoolType))

    // builtin functions

    bindings.push(Map(("binop" -> binopfun), ("concat" -> concatfun), ("println" -> printlnfun), 
      ("ignore", ignorefun), ("select", accessCellFunc), ("range", rangeFun), 
      ("strcat", symconcatfun)
      ))

    bindings.push(Map(("mem" -> Val(mem)), ("Gamma_mem" -> Val(gammaMem))))

   // def gammaLoadFun(size: Int) = SFunc(s"gamma_load${size}_le", List(("gamma_mem", SType.Val(MapType(BitVecType(64), BoolType))), ("address", SType.Val(BitVecType(64))))
   //   , SType.Val(BoolType), Some(
   //       SIndirApply(binopfun, SList(List(
   //         SList(List(SApply(concatfun, SList(List(SSymbol("&&"),
   //         SIndirApply(accessCellFunc,
   //           SList(List(SApply(concatfun, SList(List(SVariable("gamma_mem", SType.Val(MapType(BitVecType(64), BoolType)),
   //               SApply(rangeFun, SList(List(Val(IntLiteral(0)), Val(IntLiteral((size / mem.valueSize))))))
   //               ))))))))))))))
   //   ))
   //   TODO: 
    //   know size statically but not address --> need range(0, size).map(i => address + i)


    val globMap = globs.map(g => s"${g.name}" -> SStruct(List(
      ("mem", SApply(accessRangeFunc, SList(List(Val(mem), Val(BitVecLiteral(g.address, 64)), Val(IntLiteral(g.size)))))),
      ("gamma",
          SIndirApply(binopfun, SList(List(
            SList(List(SApply(concatfun, SList(List(SSymbol("&&"),
            SIndirApply(accessCellFunc,
              SList(List(SApply(concatfun, SList(List(Val(gammaMem),
                  SApply(rangeFun, SList(List(Val(IntLiteral(g.address)), Val(IntLiteral(g.address + (g.size / mem.valueSize))))))
                  ))))))))))))))
        ),
      ("name", SSymbol(g.name)), 
      ("region", SSymbol("mem")), 
      ("address", Val(IntLiteral(g.address))),
      ("size", Val(IntLiteral(g.size)))
    ), None)).toMap

    //val globLoads = globs.map(g => s"${g.name}" -> SApply(BuiltinFun.accessRangeFunc, SList(List(SVariable("mem", SType.MapVal), Val(BitVecLiteral(g.address, 64)), Val(IntLiteral(g.size)))))).toMap

    bindings.push(globMap)
  }

  def lookupBinding(n: String): Option[SExpr] = {
    val it = bindings.iterator
    var term = false
    var res: Option[SExpr] = None
    while (!term && it.hasNext) {
      val next = it.next
      if (next.contains(n)) {
        term = true
        res = next.get(n)
      }
    }
    if (n.startsWith("Gamma_")) then Some(SVariable(n, SType.Val(BoolType))) else res
  }

  //  Assuming we have already typechecked.
  //  Assuming a.fun.body == None
  def evalBuiltInFunction(a: SApply): SExpr = {
    def evalPredicateFunc(a: SApply, sort: Quantifier): SExpr = {
      val ffun = a.args.toSList match {
        case SList((h : SFunc) :: Nil) => h
        case _        => ??? // impossible by typecheck
      }

      val varargs: List[Variable] = ffun.args.map((n, t) =>
        (t match {
          case SType.Val(tt) => LocalVar(n, tt)
          case _             => throw Exception("Illegal predicate lambda argument type")
        })
      )

      // partially evaluate body to get an expression
      val ebody = eval(SApply(ffun, SList(ffun.args.map((n, t) => SVariable(n, t, true)))))

      ebody.toExpr match {
        case Some(e) =>
          Val(sort match {
            case Quantifier.forall => ForAll(varargs, e)
            case Quantifier.exists => Exists(varargs, e)
            case Quantifier.lambda => throw NotImplementedError() // not really represented in the IL either yet
          })
        case None => throw Exception(s"Predicates cannot have compound body (${ffun.body})")
      }
    }

    //println(s"\nAPPLY: ${a}\n")
    a.fun match {
      // TODO ; this should be implemented as a single builtin which dispatches to the correct type of access
      //    NOT in the eval() function.
      case BuiltinFun.accessCellFunc =>  {
        // Computes an expression that accesses a single cell of a map type. 
        // Maps are not actually modelled so this is always just compiling to an IR map access expr.
        val args = eval(a.args).toSList
        val rgn = args.e(0).toExpr

        rgn match {
          case Some(e) if e.getType.isInstanceOf[MapType] => {
            def coerceIndex(ind: SExpr) = e.getType match {
              // if we can, we coerce the index to match the map index type.
              case MapType(BitVecType(s), _) => ind.toBitVec(BitVecType(s)).getOrElse(throw Exception(s"POO ${args.e(1)} $s"))
              case MapType(IntType, _) => IntLiteral(ind.toInt.get)
              case ex => args.e(1).toExpr.getOrElse(throw Exception(s"POO $ex ${args.e(1)}"))
            }
            if (args.e.tail.size == 1) then Val(MapAccessExpr(e, coerceIndex(args.e(1))))
            else SList(args.e.tail.map(ind => Val(MapAccessExpr(e, coerceIndex(ind)))))
          }
          case e => throw TypeError(s"Can only access variables with map type. ${args.e(0)} : $e") // shouldnt be reachable due to typecheck
        }
      }
      case BuiltinFun.printlnfun => {
        // Prints the args and returns the identity function so it evaluates to the next expression.
        println(a.args.prettyPrint())
        SFunc(s"identity", List(("next", SType.Top)), SType.Top, Some(SVariable("next", SType.Top)))
      }
      case BuiltinFun.mapFun => {
        val args = eval(a.args).toSList
        val func = args.e(0)
        val elems = args.e(1).toSList
        eval(SList(elems.e.map(SIndirApply(func, _)).toList))
      }
      case BuiltinFun.rangeFun => {
        // range of ints, inclusive
        val args = eval(a.args).toSList
        val begin = args.e(0).toInt.get // typechecked
        val last = args.e(1).toInt.get // typechecked
        SList(Range.Inclusive(begin.toInt, last.toInt, 1).map(IntLiteral(_)).map(Val(_)).toList)
      }
      case BuiltinFun.accessRangeFunc => {
        // Access a subrange range of Memory or a Map
        // Returns a list of the accessed values
        val args = eval(a.args).toSList
        val rgn = args.e(0).toExpr
        val addr = args.e(1).toInt.get // typechecked
        val size = args.e(2).toInt.get // typechecked

        rgn match {
          case Some(m: Memory) => Val(MemoryLoad(m, BitVecLiteral(addr, 64), Endian.LittleEndian, size.toInt))
          case Some(MapType(BitVecType(sza), BitVecType(szb))) => SList(Range.Exclusive(addr.toInt, size.toInt, 1).map(BitVecLiteral(_, sza)).map(Val(_))
              .map(v => SApply(BuiltinFun.accessCellFunc, SList(List(Val(rgn.get), v)))).toList)
          case Some(MapType(IntType, _)) => SList(Range.Exclusive(addr.toInt, size.toInt, 1).map(IntLiteral(_)).map(Val(_))
              .map(v => SApply(BuiltinFun.accessCellFunc, SList(List(Val(rgn.get), v)))).toList)
          case e => throw TypeError(s"Can only access variables with map type. ${args.e(0)} : $e") // shouldnt be reachable due to typecheck
        }
      }
      //case BuiltinFun.bitvecSliceFunc =>  Val(FalseLiteral)
      case BuiltinFun.binopfun => {
        val args = eval(a.args).toSList
        //println(s"ARGS: $args")
        val op = args.e(0).asInstanceOf[SSymbol].e
        val operands = args.e.tail
        val arg1 = operands.head.toExpr.get

        for (arg2 <- operands.tail) {
          if (arg1.getType != arg2.toExpr.get.getType) {
            throw TypeError(s"Binary operator type mismatch ${arg1.getType} != ${arg2.getType}")
          }
        }


        val oper = (arg1.getType) match {
          case b: BitVecType => visitBVOp(op)
          case BoolType      => visitBoolOp(op)
          case IntType       => visitIntOp(op)
          case m: MapType    => throw TypeError("Cannot binop a map type.")
        }


        Val(operands.tail.foldLeft(arg1)((l,r) => BinaryExpr(oper, l, r.toExpr.get)))
      }
      case BuiltinFun.unopfun => {
        val args = eval(a.args).toSList
        val op = args.e(0).asInstanceOf[SSymbol].e
        val arg = args.e(1).toExpr.get

        val oper = (arg.getType, op) match {
          case (b : BitVecType, "!")             => BVNOT
          case (b : BitVecType, "not")             => BVNOT
          case (BoolType, "!")             => BoolNOT
          case (BoolType, "not")             => BoolNOT 
          case (IntType, "neg")       => IntNEG
          case (b: BitVecType, "neg") => BVNEG
          case (IntType, "-")       => IntNEG
          case (b: BitVecType, "-") => BVNEG
          case (_, _)                 => throw Exception("Bad use of builtin func unop")
        }

        Val(UnaryExpr(oper, arg))
      }
      case BuiltinFun.forallfun     => evalPredicateFunc(a, Quantifier.forall)
      case BuiltinFun.existsfun     => evalPredicateFunc(a, Quantifier.exists)
      case BuiltinFun.oldfun        => Val(OldExpr(eval(a.args.e(0)).toExpr.get))
      case BuiltinFun.ifthenelsefun => throw NotImplementedError("If then else function not implemented")
      case BuiltinFun.concatfun     => {
        // Concatenates a list of some lists into a single list
        // (a,b,(c,d,e),(f),g) -> (a,b,c,d,e,f,g)
        val args = eval(a.args).toSList
        val nargs = args.e.flatMap(a => a match {
          case SList(e) => e
          case o => List(o)
        })

        SList(nargs)
      } 
      case BuiltinFun.symconcatfun => {
        // concatenates symbols
        val args = eval(a.args).toSList
        val nargs : String = args.e.foldLeft("")((a: String ,b) => b match {
          case SSymbol(e) => a ++ e
          case o => throw TypeError(s"Cannot concat wht non-symbol $o") 
        })

        SSymbol(nargs)
      }
      case _                        => SApply(a.fun, eval(a.args).toSList)
    }
  }

  /**
   * Evaluate an SSExpr as far as possible. 
   *
   * TODO: iterate?
   *  Ideally we can only reference previously declared variables, don't have first-class functions, and 
   *  evaluate the deepest structures first, so everything should be resolvable in one forward pass. 
   *
   * Type-checking is done while evaluating however
   * a lot of types are just given Top during parseing, and we don't have much of an inference pass to 
   * refine them and check things resolve to correct conrete types. 
   */
  def eval(o: SExpr): SExpr = {
    //println(s"\nEVAL: ${o}\n")
    var old = o
    var evaled = o match {
      case Val(e) => {
        val replacer = VariableReplacer(
          // TODO: this is not correct wrt shadowing
          bindings.flatMap(_.flatMap((k: String, v: SExpr) => v.toExpr.map(k -> _))).toMap
        )
        Val(replacer.visitExpr(e))
      }
      case SVariable(n, v, false) => // resolve bound variables
        lookupBinding(n) match {
          case Some(e) => eval(e)
          case None    => throw Exception(s"Referenceing unbound variable $n\n$bindings") // SVariable(n, v)
        }
      case s: SVariable => s
      case SList(e)     => SList(e.map(eval))
      case SStruct(e, _) => {
        // Each successively defined field in the struct gets bound, so can be referred to
        // in later terms.
        //
        // This is similar to a regular variable definition in an expression/statement
        // let x = blah in
        // let y = x + 1 in
        //  ...
        //
        //  These are available only for subexpressions of the struct.
        val evaled = HashMap[String, SExpr]()
        for ((name, value) <- e) {
          val res = eval(value)
          evaled(name) = res
          bindings.push(Map(name -> res))
        }
        for ((name, value) <- e) {
          bindings.pop()
        }
        SStruct(e.map(i => (i._1, evaled(i._1))), None)
      }
      case f: SFunc => f
      case SApply(fun, args) => {

        //println(s"APPLY: ${SApply(fun, args)}")
        val argumetypes: SType.SStruct = SType.SStruct(fun.args)

        val argStruct = args.toSStruct(argumetypes) // typecheck

        fun.body match {
          case None => evalBuiltInFunction(SApply(fun, args))
          case Some(body) => {
            // evaluate arguments, bind them to parameter variables, evaluate body, replace the call with the body
            bindings.push(argStruct.e.toMap)
            val nb = eval(body)
            bindings.pop()
            nb
          }
        }
      }
      case SIndirApply(f, args) => {
        eval(f) match {
          case s: SFunc => eval(SApply(s, eval(args).toSList))
          case s if s.getType.satisfies(memoryRegionType) => eval(SApply(BuiltinFun.accessRangeFunc, eval(args).toSList)) 
          case s if s.getType.satisfies(SType.MapVal) => s.getType match {
            case SType.Val(MapType(param: BitVecType, value: BitVecType)) => eval(SApply(BuiltinFun.accessRangeFunc, SList(List(s) ++ eval(args).toSList.e ++ List(Val(IntLiteral(value.size))))))
            case SType.Val(MapType(param, value)) => eval(SApply(BuiltinFun.accessCellFunc, SList(List(s) ++ eval(args).toSList.e)))
            case _ => throw NotImplementedError("We can't really model non-bitvector map accesses in the IR so the accessRange function assumes we can convert an access to a MemoryLoad.")
          }
          case o        => throw TypeError(s"Expression does not evaluate to a function, cannot apply non-function: $o")
        }
      }
      case SFieldAccess(s, field) => {
        eval(s) match {
          case SStruct(e, _) => e.find(_._1 == field).get._2
          case _          => throw TypeError("Cannot access field of non-struct.")
        }
      }
      case SSymbol(e) => SSymbol(e)
    }

    //while (evaled != old) {
    //  old = evaled
    //  evaled = eval(old)
    //}

    evaled
  }

}

/** Create a list of typed names/bindings, from an slist which evaluates to a list of variables.
  *
  * Do not evaluate the list because they are to be variables.
  */
def evalParameterList(params: SList): List[SVariable] = {
  params.e.map(x =>
    x match
      case Val(v: Variable) => SVariable(v.name, SType.Val(v.getType))
      case v: SVariable     => v
      case _                => throw Exception("Bad predicate function call in bounds list")
  )
}

/** Construct a function from a parameter list and body expression. Do not pre-evaluate anything, that can be done in
  * SFunction
  */
def makeLambda(params: Iterable[SVariable], body: SExpr): SFunc = {
  SFunc(s"lambda${counter += 1}", params.map(p => (p.name, p.getType)).toList, body.getType, Some(body))
}

object BuiltinFun:
  import SSExpr._

  val printlnfun: SFunc = SFunc("println", List.empty, SType.Top, None)

  // concrete Memory access function
  val accessRangeFunc: SFunc = SFunc("arrayslice", List(("region", SType.MapVal), ("address", SType.NumberVal), ("size", SType.NumberVal)), SType.NumberVal, None)

  val ignorefun: SFunc = SFunc(s"ignore", List(("ignored", SType.Top), ("kept", SType.Top)), SType.Top, Some(SVariable("kept", SType.Top)))

  val rangeFun: SFunc = SFunc("range", List(("begin", SType.NumberVal), ("end", SType.NumberVal)), SType.NumberVal, None)

  val mapFun : SFunc = SFunc("fmap", List(("func" , SType.SFunc(List.empty, SType.Top)), ("list", SType.SList(List.empty))), SType.SList(List.empty), None)

  // access a map cell
  val accessCellFunc: SFunc = SFunc("select", List(("index", SType.Top)), SType.Top, None)

  val bitvecSliceFunc: SFunc =
    SFunc("slice", List(("begin", SType.NumberVal), ("end", SType.NumberVal)), SType.NumberVal, None)
  val binopfun: SFunc =
    SFunc("binop", List(("op", SType.SSymbol), ("left", SType.Top), ("right", SType.Top)), SType.Top, None)
  val unopfun: SFunc = SFunc("unop", List(("op", SType.SSymbol), ("arg", SType.Top)), SType.Top, None)

  val forallfun: SFunc = SFunc(
    "forall",
    // A function representing the predicate with the function args represent the variables quantified over
    List(("predicate", SType.SFunc(List.empty, SType.Val(BoolType)))),
    SType.Val(BoolType),
    None
  ) // Body is a lambda (bounds) -> body
  val existsfun: SFunc = SFunc(
    "exists",
    List(("predicate", SType.SFunc(List.empty, SType.Val(BoolType)))),
    SType.Val(BoolType),
    None
  ) // Body is a lambda (bounds) -> body

  val oldfun: SFunc = SFunc("old", List(("arg", SType.Top)), SType.Top, None)

  val ifthenelsefun: SFunc =
    SFunc("ite", List(("if", SType.Top), ("then", SType.Top), ("else", SType.Top)), SType.Top, None)

  val concatfun: SFunc = SFunc("concat", List.empty, SType.Top, None) // (possibly empty) list of lists => blah
  val symconcatfun: SFunc = SFunc("strcat", List.empty, SType.Top, None) // (possibly empty) list of lists => blah
  val listof: SFunc = SFunc("list_of", List(("value", SType.Top)), SType.Top, None) // coerce value to a list


import SSExpr._
import BuiltinFun._

class BindingsStack {
  val variableBindings: ArrayBuffer[Map[String, Expr]] = ArrayBuffer.empty

  var globalsDisallowed = 0

  def enterPureLocalScope(): Unit = {
    globalsDisallowed += 1
  }

  def leavePureLocalScope(): Unit = {
    require(globalsDisallowed > 0)
    globalsDisallowed -= 1
  }

  def canReferenceGlobals: Boolean = globalsDisallowed == 0

  def push(x: Map[String, Expr]) = variableBindings.append(x)
  def pop() = variableBindings.remove(variableBindings.length - 1)

  def resolve(name: String): Option[Expr] = {
    def findres(s: String, pos: Int = 0) = {
      var res: Option[Expr] = None
      var ind = variableBindings.length - 1
      while (ind >= 0 && res == None) {
        res = variableBindings(ind).get(s) match {
          case Some(s) if !canReferenceGlobals && s.variables.exists(p => p.scope == Scope.Global) =>
            throw Exception(s"Cannot reference global $name in pure local context.")
          case x => x
        }

        ind -= 1
      }
      res
    }

    findres(name)
  }

}

//case class MacroDef(name: String, params: List[(String, SType)], body: Expr) {
//
//  def toFunction() = {
//
//  }
//
//  def apply(args: List[SElem]) = {
//    assert(SList(args).satisfies(params.map(_._2)))
//
//
//  }
//
//}
//
//object builtinFuns:
//  // these are prelude scope function definitions
//  def load(l: SList) = {
//    assert(l.implements(List(MapType(BitVecType(64), BitVecType(8)), BitVecType(64), BitVecType(64))))
//
//  }
//  def store(l: SList) = {
//    assert(l.implements(List(MapType(BitVecType(64), BitVecType(8)), BitVecType(64), BitVecType(64), SType.Expr)))
//  }

case class NewSpecificationLoader(symbols: Set[Variable], globals: Set[SpecGlobal], program: Program) {

  val mem = Memory("mem", 64, 8)
  //private val idToSymbol = symbols.map(g => (g.name, g)).toMap ++ globals.map(g => g.name -> MemoryLoad(mem, LocalVar("$" + g.name  + "_addr", BitVecType(64)), Endian.LittleEndian, g.size))
  private val idToSymbol =
    symbols.map(g => (g.name, g)).toMap ++ globals.map(g => g.name -> LocalVar("$" + g.name + "_addr", BitVecType(64)))

  private val idToSymbolNew = symbols.map(g => (g.name, Val(g))).toMap
    ++ globals.map(g =>
      g.name -> SSExpr.SStruct(
        List(
          ("region", Val(mem)),
          ("base", Val(LocalVar("$" + g.name + "_addr", BitVecType(64)))),
          ("size", Val(BitVecLiteral(g.size, 64)))
        ), None
      )
    )

  val nameToGlobals: Map[String, Variable] = symbols.map(s => s.name -> s).toMap
  val nameToSpecGlobal: Map[String, SpecGlobal] = globals.map(s => s.name -> s).toMap
  val variableBindings = BindingsStack()

  def visitSpecification(ctx: SpecTopLevelContext): Specification = {
    val spec = visitSpecTopLevel(ctx)
    spec
  }

  def visitSpecTopLevel(ctx: SpecTopLevelContext) = {
    // construct an SStruct

    variableBindings.push(Map("mem" -> mem))
    variableBindings.push(idToSymbol)

    val spec = visitStructExpr(ctx.sstruct)

    println(s" BEFORE EVAL \n $spec")
    println(s"${spec.prettyPrint(StringWriter(), 0)}")
    println("--------------------------------------" * 2)

    val evaluator = Evaluator()
    evaluator.bindGlobals(globals)
    val evaled = evaluator.eval(spec)
    println("======================================" * 2)

    println(s" AFTER EVAL \n $evaled")
    println(s"${evaled.prettyPrint(StringWriter(), 0)}")
    println("--------------------------------------" * 2)

    val mapped = evaled match {
      case SStruct(e, _) => e.toMap
      case _          => throw Exception("Unreachable.")
    }

    def getProcedureSpec(name: String, mapped: Map[String, SExpr]): SubroutineSpec = {
      // all this should be validated via type-checking first.
      val relies = mapped.get("rely").map(_.toExpr.get).getOrElse(FalseLiteral)
      val guarantees = mapped.get("guarantees").map(_.toExpr.get).getOrElse(FalseLiteral)
      val requires = mapped.get("require").map(_.toExpr.getOrElse(FalseLiteral)).getOrElse(FalseLiteral)
      val ensures = mapped.get("ensure").map(_.toExpr.get).getOrElse(FalseLiteral)
      val mods = mapped
        .get("modifies")
        .toList
        .collect(_ match {
          case SList(e) =>
            e.map(_ match {
              case Val(v: Variable) => v.name
              case _                => throw TypeError("non-variable modifies clause")
            })
          case _ => throw TypeError("Mods must be a slist")
        })
        .flatten

      SubroutineSpecinfo(name, relies, guarantees, mods, requires, ensures).toProcSpec
    }

    val lpreds = mapped.get("L")

    val procedures = mapped
      .get("procedures")
      .map(procdefs =>
        procdefs match {
          case SStruct(e, _) =>
            e.map((procname, procspec) =>
              procspec match {
                case SStruct(s, _) => getProcedureSpec(procname, s.toMap)
                case _          => throw TypeError("Procedures should be map.")
              }
            )
          case _ => throw TypeError("Procedures should be map.")
        }
      )

    val relies = mapped.get("rely").flatMap(_.toExpr).map(_.toBoogie).toList
    val guarantees = mapped.get("guarantee").flatMap(_.toExpr).map(_.toBoogie).toList

    //val relies = ctx.relies.asScala.map(visitRelies)
    //val guarantees = ctx.guarantees.asScala.map(visitGuarantees)
    //val procedures = ctx.procedure.asScala.map(visitProcedure)
    //val lpreds = ctx.lPreds.asScala.flatMap(visitLPreds)

    variableBindings.pop()
    variableBindings.pop()
    // Specification(globals, lpreds.map((k,v) => nameToSpecGlobal(k) -> v.toBoogie).toMap, relies.map(_.toBoogie).toList, guarantees.map(_.toBoogie).toList, procedures.map(_.toProcSpec).toList, Set.empty)
    Specification(Set.empty, Map.empty, relies, guarantees, procedures.toList.flatten, Set.empty)
  }

  //def visitLPreds(ctx: LPredsContext) : Map[String, Expr] = {
  //  variableBindings.enterPureLocalScope()
  //  val r = ctx.lPred.asScala.map((lp: LPredContext) => (lp.ident.getText -> visitExpr(lp.expr))).toMap
  //  variableBindings.leavePureLocalScope()
  //  r
  //}

  def andAll(el: Iterable[Expr]) = {
    el.toList match {
      case Nil      => FalseLiteral
      case x :: Nil => x
      case x :: xs  => xs.foldLeft(x)((a: Expr, b: Expr) => BinaryExpr(BoolAND, a, b))
    }
  }

  /** Convert a comma separated list that represents a conjunction of expressions, to a single expression. def
    * visitConjunctExprList(ctx:Conjunct_expr_listContext) : Expr = { andAll(ctx.expr.asScala.map(visitExpr(_,
    * Map.empty)).toList) }
    */

  case class SubroutineSpecinfo(
      name: String,
      relies: Expr,
      guarantees: Expr,
      mods: List[String],
      requires: Expr,
      ensures: Expr
  ) {
    def toProcSpec = SubroutineSpec(
      name,
      List(relies.toBoogie),
      List.empty,
      List(ensures.toBoogie),
      List.empty,
      mods.toList,
      List(relies.toBoogie),
      List(guarantees.toBoogie)
    )
  }


  def visitSTypeName(ctx: SexpTypeNameContext): SType = {
    ctx match {
      case b: BoogieTypeDeclContext => SType.Val(visitTypeName(b.boogieTypeName))
      case b: StructTypeDeclContext => SType.SStruct(b.ident.asScala.indices.map(i => (b.ident.get(i).getText, visitSTypeName(b.sexpTypeName.get(i)))).toList )
      case b: ListTypeDeclContext => SType.SList(b.sexpTypeName.asScala.map(visitSTypeName).toList)
      case b: TopTypeDeclContext => SType.Top
      case b: BotTypeDeclContext => SType.Bot
      case b: NumberValTypeDeclContext => SType.NumberVal
      case b: MapValTypeDeclContext => SType.MapVal
    }
  }

  def visitTypeName(ctx: BoogieTypeNameContext): IRType = {
    ctx match {
      case bv: BvBTypeContext    => BitVecType(Integer.parseInt(bv.getText.stripPrefix("bv")))
      case i: IntBTypeContext    => IntType
      case b: BoolBTypeContext   => BoolType
      case mapT: MapBTypeContext => MapType(visitTypeName(mapT.keyT), visitTypeName(mapT.valT))
    }
  }

  /** We do one pass over the ast to load the IR expression language. For SExpressions, we create a temporary variable
    * and bind the sexpr to that variable, returning the variable.
    *
    * In the second evaluation pass these sexpressions are resolved into IR expressions, and are substituted back for
    * the temporary variable.
    */
  var tempCount = 0
  val temporaries = HashMap[Variable, SExpr]()

  def visitSExpr(ctx: ExprContext) = {
    visitExpr(ctx)
  }

  /** Visit an expression and return an S expression; wrapping ir expressions in Val.
    */
  def visitExpr(ctx: ExprContext): SExpr = {
    ctx match {
      case c: EquivExprContext       => visitEquivExpr(c)
      case c: LogicalExprContext     => visitLogicalExpr(c)
      case c: RelExprContext         => visitRelExpr(c)
      case c: ArithExprContext       => visitArithExpr(c)
      case c: MathExprContext        => visitMathExpr(c)
      case c: UnexpContext           => visitUnaryExpr(c.unaryExpr, nameToGlobals, Map.empty)
//      case c: SliceExprContext       => Val(FalseLiteral)
//      case c: AccessRangeExprContext => Val(FalseLiteral)
      case c: FieldAccessExprContext => visitFieldAccess(c)
      case c: SexprApplyContext      => visitApplyExpr(c)
      case c: SexprIndirApplyContext => visitIndirAplyExpr(c)
      case c: StructExprContext      => visitStructExpr(c.sstruct)
      case c: ListExprContext        => visitListExpr(c.slist)
      case c: ConcatExprContext      => visistConcatExpr(c)

    }
  }

  def visistConcatExpr(ctx: ConcatExprContext) = {
    SApply(concatfun, SList(List(visitExpr(ctx.arg1), visitExpr(ctx.arg2))))
  }

  def visitEquivExpr(ctx: EquivExprContext) = {
    SApply(binopfun, SList(List(SSymbol(BoolEQUIV.toString)) ++ ctx.expr.asScala.map(visitExpr).toList))
  }

  def visitLogicalExpr(ctx: LogicalExprContext) = {
    SApply(binopfun, SList(List(SSymbol(ctx.op.getText)) ++ ctx.expr.asScala.map(visitExpr).toList))
    //ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitLogOp(ctx.op), l, visitExpr(r)))
  }

  def visitArithExpr(ctx: ArithExprContext) = {
    SApply(binopfun, SList(List(SSymbol(ctx.op.getText)) ++ ctx.expr.asScala.map(visitExpr).toList))
    //ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitAddSubOp(ctx.op), l, visitExpr(r)))
  }

  def visitMathExpr(ctx: MathExprContext) = {
    SApply(binopfun, SList(List(SSymbol(ctx.op.getText)) ++ ctx.expr.asScala.map(visitExpr).toList))
    //ctx.expr.asScala.tail.foldLeft(visitExpr(ctx.expr.asScala.head))((l,r) => BinaryExpr(visitMulDivModOp(ctx.op), l, visitExpr(r)))
  }

//  def visitSliceExpr(ctx: SliceExprContext) = {}

  def visitFieldAccess(ctx: FieldAccessExprContext): SFieldAccess = {
    SFieldAccess(visitSExpr(ctx.arg1), ctx.field.getText)
  }

  def visitStructExpr(ctx: SstructContext): SStruct = {

    /*
     * Struct records can be two types of expression: 
     *  1. Variable declaration 
     *    Is translated to x : typ = x, so the value is a variable referencing itself. 
     *  2. Variable definition
     *    Is the record is given a value and either an explicit or inferred type. 
     *    Translated to x : type = <expr>
     *
     *  This allows expressions to look like statements. 
     */

    val inferredType : SType.SStruct = SType.SStruct(ctx.sexpdef.asScala.map(d => (d.ident.getText,
      Option(d.sexpTypeName) match {
        case Some(e) => visitSTypeName(e)         // take explicitly given type.
        case None =>  visitSExpr(d.expr).getType  // infer from value
      }
      )).toList)

    println(s"$inferredType")

    val structValue : SStruct = SStruct(ctx.sexpdef.asScala.map(d => (d.ident.getText,
      Option(d.expr) match {
        case Some(e) => visitSExpr(e)                           // we have a concrete value
        case None => SVariable(s"freevar_${d.ident.getText}", visitSTypeName(d.sexpTypeName), true)  // unknown value constrained later / declaration only, represented as free variable
      }
      )).toList, None)


    if (!structValue.getType.satisfies(inferredType)) {
      throw TypeError(s"Struct (${structValue.prettyPrint}) does not satisfy its declared type $inferredType")
    }

    SStruct(structValue.e, Some(inferredType))
  }

  def visitListExpr(ctx: SlistContext): SList = {
    SList(ctx.expr.asScala.map(visitSExpr).toList)
  }

  def visitApplyExpr(ctx: SexprApplyContext): SExpr = {
    SIndirApply(visitSExpr(ctx.expr), visitListExpr(ctx.slist))
  }

  def visitIndirAplyExpr(ctx: SexprIndirApplyContext): SExpr = {
    SIndirApply(visitSExpr(ctx.fun), visitExpr(ctx.arg))
  }

  def visitRelExpr(ctx: RelExprContext) = {
    SApply(binopfun, SList(List(SSymbol(ctx.op.getText)) ++ ctx.expr.asScala.map(visitExpr).toList))
  }

  def visitUnaryExpr(
      ctx: UnaryExprContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): SExpr = ctx match {
    case n: NegExprContext =>
      SApply(
        unopfun,
        SList(List(SSymbol("neg"), visitUnaryExpr(n.unaryExpr, nameToGlobals, params)))
      ) // UnaryExpr(BVNEG, visitUnaryExpr(n.unaryExpr, nameToGlobals, params))
    case a: AtomUnaryExprContext => visitAtomExpr(a.atomExpr, nameToGlobals, params)
    case n: NotExprContext =>
      SApply(
        unopfun,
        SList(List(SSymbol("not"), visitUnaryExpr(n.unaryExpr, nameToGlobals, params)))
      ) // UnaryExpr(BoolNOT, visitUnaryExpr(n.unaryExpr, nameToGlobals, params))
  }

  def visitIfThenElseExpr(c: IfThenElseExprContext) = {
    SApply(ifthenelsefun, SList(List(visitExpr(c.guard), visitExpr(c.thenExpr), visitExpr(c.elseExpr))))
  }

  def visitFunExpr(c: FunExprContext) = {
    val args = c.args.expr.asScala.map(visitExpr).toList
    assert(args.length == 2)

    SApply(binopfun, SList(List(SSymbol(c.name.getText)) ++ args))
  }

  def visitAtomExpr(
      ctx: AtomExprContext,
      nameToGlobals: Map[String, Variable],
      params: Map[String, Parameter] = Map()
  ): SExpr = ctx match {
    case b: BoolLitExprContext => Val(visitBoolLit(b.boolLit))
    case b: BvExprContext      => Val(visitBv(b.bv))
    case i: NatExprContext     => Val(visitNat(i.nat))
    case i: IdExprContext      => visitId(i.ident)
    //case a: ArrayAccessExprContext => visitArrayAccess(a.arrayAccess)
    //case a : LoadSliceExprContext => visitLoadSlice(a.loadSlice)
    case o: OldExprContext          => SApply(oldfun, SList(List(visitExpr(o.expr))))
    case p: ParenExprContext        => visitExpr(p.expr)
    case ite: IfThenElseExprContext => visitIfThenElseExpr(ite)
    case c: FunExprContext          => visitFunExpr(c)
    case c: PredicateExprContext    => visitPredicateExpr(c.predicate)
    case c: SymbolExprContext       => SSymbol(c.getText.stripPrefix("\"").stripSuffix("\""))
  }

  def visitBv(ctx: BvContext): BitVecLiteral = {
    BitVecLiteral(BigInt(ctx.value.getText), Integer.parseInt(ctx.BVSIZE.getText.stripPrefix("bv")))
  }

  def visitNat(ctx: NatContext): IntLiteral = IntLiteral(BigInt(ctx.getText))

  def visitBoolLit(ctx: BoolLitContext): BoolLit = ctx.getText match {
    case "true"  => TrueLiteral
    case "false" => FalseLiteral
  }

  def visitPredicateExpr(ctx: PredicateContext) = {
    val bound: List[SVariable] =
      ctx.bound.typed_variable.asScala.toList.map(b => SVariable(b.name.getText, SType.Val(visitTypeName(b.btype))))
    val body = makeLambda(bound, visitExpr(ctx.body))

    val fun = ctx.q.getText() match
      case "forall" => forallfun
      case "exists" => existsfun
      case _        => ???

    SApply(fun, SList(List(body)))
  }

  def visitId(ctx: IdentContext): SExpr = {

    /** TODO
      *
      *   - Resolve every type of ident using scoping roles
      *     - global variables (from relf)
      *     - registers
      *     - function parameters
      *     - local variables
      */
    val id = ctx.getText
    if (id.startsWith("Gamma_") || id.startsWith("R")) then (Val(Register(id, BoolType)))
    else SVariable(ctx.getText, SType.Top)
  }

}

def visitBoolOp(s: String): BoolBinOp = s match {
  case "==>"  => BoolIMPLIES
  case "<==>" => BoolEQUIV
  case "||"   => BoolOR
  case "&&"   => BoolAND
  case "=="   => BoolEQ
  case "!="   => BoolNEQ
}

def visitBVOp(s: String) : BVBinOp = {
  s match {
    case "++"   => BVCONCAT
    case "=="   => BVEQ
    case "!="   => BVNEQ
    case ">"    => BVSGT
    case ">="   => BVSGE
    case "<"    => BVSLT
    case "<="   => BVSLE
    case "+"    => BVADD
    case "-"    => BVSUB
    case "*"    => BVMUL
    case "div"  => BVSDIV
    case "mod"  => BVSMOD
    case "and"  => BVAND
    case "or"   => BVOR
    case "add"  => BVADD
    case "mul"  => BVMUL
    case "udiv" => BVUDIV
    case "urem" => BVUREM
    case "shl"  => BVSHL
    case "lshr" => BVLSHR
    case "ult"  => BVULT
    case "nand" => BVNAND
    case "nor"  => BVNOR
    case "xor"  => BVXOR
    case "xnor" => BVXNOR
    case "comp" => BVCOMP
    case "sub"  => BVSUB
    case "sdiv" => BVSDIV
    case "srem" => BVSREM
    case "smod" => BVSMOD
    case "ashr" => BVASHR
    case "ule"  => BVULE
    case "ugt"  => BVUGT
    case "uge"  => BVUGE
    case "slt"  => BVSLT
    case "sle"  => BVSLE
    case "sgt"  => BVSGT
    case "sge"  => BVSGE
  }
}

def visitIntOp(s: String): IntBinOp = s match {
  case "+"   => IntADD 
  case "*"   => IntMUL 
  case "-"   => IntSUB 
  case "div" => IntDIV 
  case "mod" => IntMOD 
  case "==" => IntEQ
  case "!=" => IntNEQ
  case ">"  => IntGT
  case ">=" => IntGE
  case "<"  => IntLT
  case "<=" => IntLE
}
