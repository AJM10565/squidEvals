package wf
import sun.misc.Signal

object topWords {
  // fulfill functional requirement of handling pipe with graceful exit

  Signal.handle(new Signal("PIPE"), _ => scala.sys.exit())

  def main(args: Array[String]): Unit = {
    val status = true
    val parser = new argsparser(args)
    val that_which_lowers = new desensitizer
    val that_which_ignores = new ignorer
    val acceptor = new cloudAcceptor(status)
    val filter = new wordHolder(parser)
    val buffer = new circularQueue(parser, filter, acceptor)
    val lines = scala.io.Source.stdin.getLines
    val words = lines.flatMap(_.split("(?U)[^\\p{Alpha}0-9']+"))
    while ({ words.hasNext }) {
      val value = that_which_ignores.ignore(that_which_lowers.desensitize(words.next)) match {
        case Some(v: String) => buffer.add(v)
        case None => Unit
      }

    }

  }
}

