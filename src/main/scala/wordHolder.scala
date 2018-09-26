package wf

import wf.argsparser
import java.util._
import java.util.Collections
import java.util
import java.util.stream._

class wordHolder(val parser: argsparser) {
  howmany = parser.getHowmany
  private val holdingCell = new util.TreeMap[String, Integer]
  private var howmany = 0

  def increment(longword: String): Unit = {
  if (!holdingCell.containsKey(longword)) holdingCell.put(longword, 1)
  else holdingCell.put(longword, holdingCell.get(longword) + 1)
  }

  def decrement(longword: String): Unit = {
  holdingCell.put(longword, holdingCell.get(longword) - 1)
  }

  def createoutput: util.Map[_, _] = {
  val sortedMap = holdingCell.entrySet.stream.sorted(util.Map.Entry.comparingByValue(Comparator.reverseOrder)).limit(howmany).collect(Collectors.toMap(util.Map.Entry.getKey, util.Map.Entry.getValue, (e1: Integer, e2: Integer) => e1, util.LinkedHashMap.`new`))
  sortedMap
  }
}
