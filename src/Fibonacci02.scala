import scala.annotation.tailrec

object Fibonacci02 extends App {
  @tailrec
  def loop(n: Int, prev: Int, cur: Int): Int = {
    if (n == 0) prev
    else loop(n - 1, cur, prev + cur)
  }

  (0 to 20).map(loop(_, 0, 1)).foreach(println)
}
