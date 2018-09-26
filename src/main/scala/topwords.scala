package wf
import sun.misc.Signal

class topwords {
  // fulfill functional requirement of handling pipe with graceful exit

  Signal.handle(new Signal("PIPE"), _ => scala.sys.exit())
  def main(args: Array[String]): Unit = {
    val status = true
    val parser = new argsparser(args)
    val acceptor = new cloudAcceptor(status)
    val filter = new wordHolder(parser)
    val buffer = new circularQueue(parser, filter, acceptor)
    // Main Loop need to refactor
    val lines = scala.io.Source.stdin.getLines
    val words = lines.flatMap(_.split("(?U)[^\\p{Alpha}0-9']+"))

    while ({words.hasNext}) buffer.add(words.next)
  }
}


