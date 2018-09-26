package wf


class circularQueue(val parser: argsparser, var holder: wordHolder, var acceptor: cloudAcceptor) {
  var buffermax = parser.getLastnwords
  var myStringArray = new Array[String](buffermax)
  var position = 0
  var minlength = parser.getMinlength
  var waitcount = parser.getWaitcount
  var count = 0
  var bufferinit = 0


  def add(new_word: String): Unit = {
    if (myStringArray(position) != null) {
    val old_word = myStringArray(position)
    if (old_word.length >= minlength) holder.decrement(old_word)
    }
    myStringArray(position) = new_word
    if (new_word.length >= minlength) holder.increment(new_word)
    position += 1
    if (position >= buffermax) position = 0
    count += 1
    bufferinit += 1
    if (bufferinit >= buffermax) if (count >= waitcount) {
    count = 0
    acceptor.accept(holder.createoutput)
    }
  }
}

