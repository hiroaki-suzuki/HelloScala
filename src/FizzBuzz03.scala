object FizzBuzz03 extends App {
  def fizzBuzz(i: Int): String =
    (i % 3, i % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _      => i.toString
    }

  (1 to 100).map(fizzBuzz).foreach(println)
}
