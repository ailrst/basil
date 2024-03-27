package translating
import com.google.protobuf.ByteString
import com.grammatech.gtirb.proto.CFG.EdgeType.*
import com.grammatech.gtirb.proto.CFG.CFG
import com.grammatech.gtirb.proto.CFG.Edge
import com.grammatech.gtirb.proto.CFG.EdgeLabel
import com.grammatech.gtirb.proto.Module.Module
import com.grammatech.gtirb.proto.Symbol.Symbol
import Parsers.SemanticsParser.*
import gtirb.*
import ir.*

import scala.collection.mutable
import scala.collection.mutable.Set
import scala.collection.mutable.Map
import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable
import scala.jdk.CollectionConverters.*
import java.util.Base64
import java.nio.charset.*
import scala.util.boundary
import boundary.break
import java.nio.ByteBuffer
import util.intrusive_list.*
import util.Logger

class hackygtirb {
  class GTIRBToIR(mods: Seq[Module], parserMap: immutable.Map[String, Array[Array[StmtContext]]], cfg: CFG, mainAddress: Int) {
    private val functionNames = MapDecoder.decode_uuid(mods.map(_.auxData("functionNames").data))
    private val functionEntries = MapDecoder.decode_set(mods.map(_.auxData("functionEntries").data))
    private val functionBlocks = MapDecoder.decode_set(mods.map(_.auxData("functionBlocks").data))
  }

}
