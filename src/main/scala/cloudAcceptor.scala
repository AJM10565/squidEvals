package wf
class cloudAcceptor(var printtostandardout: Boolean) {

  def accept(wordcloud: Iterator[(String, Int)]): Unit = {
    var wordCloud = wordcloud
    if (printtostandardout) println(wordCloud)
  }
}
