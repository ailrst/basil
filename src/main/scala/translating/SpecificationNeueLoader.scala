package translating

import Parsers.SpecificationsNeueParser._

import boogie._
import specification._
import ir._

import scala.collection.mutable.ArrayBuffer
import scala.jdk.CollectionConverters._

// take symbol table entries as input
// parse all global defs and check sizes
// use these new nameToGlobals going forward when parsing the rest of the spec

case class NewSpecificationLoader(symbols: Set[SpecGlobal], program: Program) {


  def visitSpecification(ctx: SpecificationContext): Specification = {


    Specification(Set.empty, Map.empty, List.empty, List.empty, List.empty, Set.empty)

  }



}
