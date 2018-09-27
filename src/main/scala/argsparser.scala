package wf
class argsparser(var args: Array[String]) {

  var howmany: Int = 10 // how many words are in the word cloud

  var minlength: Int = 6 // how many characters long must a word be to be add to the buffer

  var lastnwords: Int = 1000 // how many words back do we include

  var waitcount: Int = 1 // how many words to wait before updating cloud

  var minsize: Int = 0 // There is no minimum size for the cloud by default

  val values = new Array[Int](args.length)
  var i = 0

  while ({ i < args.length }) {
    values(i) = args(i).toInt
    i = i + 1
  }
  if (values.length == 0) {}
  else {
    if (values.length == 1) howmany = values(0)
    else if (values.length == 2) {
      howmany = values(0)
      minlength = values(1)
    } else if (values.length == 3) {
      howmany = values(0)
      minlength = values(1)
      lastnwords = values(2)
    } else if (values.length == 4) {
      howmany = values(0)
      minlength = values(1)
      lastnwords = values(2)
      waitcount = values(3)
    } else if (values.length == 5) {
      howmany = values(0)
      minlength = values(1)
      lastnwords = values(2)
      waitcount = values(3)
      minsize = values(4)
      println("The minsize is: " + minsize)
    } else { // TODO Apply fail fast principle
      howmany = 10
      minlength = 6
      lastnwords = 1000
    }
  }

  def getHowmany: Int = howmany

  def getMinlength: Int = minlength

  def getLastnwords: Int = lastnwords

  def getWaitcount: Int = waitcount

  def getminsize: Int = minsize
}
