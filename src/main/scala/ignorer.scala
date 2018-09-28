package wf
import scala.collection.immutable.HashSet
import scala.io.Source
class ignorer {

  val bufferedSource: Source = Source.fromFile("src/ignore_list")
  val words: Iterator[String] = bufferedSource.getLines.flatMap(_.split("(?U)[^\\p{Alpha}0-9']+"))
  val wordslist: Seq[String] = words.toSeq
  val ignorehash: HashSet[String] = scala.collection.immutable.HashSet() ++ wordslist

  bufferedSource.close

  def ignore(word: String): Option[String] = {
    if (!ignorehash.contains(word)) {
      Some(word)
    } else {
      None
    }

  }

}

