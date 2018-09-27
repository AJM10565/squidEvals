package wf

import scala.collection.mutable.{ Map => MutableMap }

class wordHolder(val parser: argsparser) {
  var howmany: Int = parser.getHowmany
  var minsize: Int = parser.minsize
  var holdingCell: MutableMap[String, Int] = MutableMap[String, Int]()

  def increment(longword: String): Unit = {
    if (!holdingCell.contains(longword)) {
      holdingCell.put(longword, 1)
    } else {
      holdingCell.put(longword, holdingCell(longword) + 1)
    }
  }

  def decrement(longword: String): Unit = {
    holdingCell.put(longword, holdingCell(longword) - 1)
  }
  // take from http://www.bigdataanalyst.in/wp-content/uploads/2015/07/Scala-Cookbook.pdf 11.23
  // under You can also sort by value in ascending or descending order using sortWith:
  //
  def createoutput: Iterator[(String, Int)] = {
    var cloud = holdingCell.toSeq.sortWith(_._2 > _._2).take(howmany).filterNot(_._2 < minsize).toIterator
    cloud
  }
}
