package wf
  class cloudAcceptor(var printtostandardout: Boolean) {
  private var wordCloud = null

  def accept(wordcloud: Iterator[(string: String,integer:Int)]: Unit = {

  wordCloud = wordcloud
  if (printtostandardout) println(wordCloud)
  }
 }
