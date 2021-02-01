object FizzBuzz02 extends App {
  def fizzBuzz(i: Int): String =
    i match {
      case i if i % 15 == 0 => "FizzBuzz"
      case i if i % 3 == 0  => "Fizz"
      case i if i % 5 == 0  => "Buzz"
      case _                => i.toString
    }

  (1 to 100).map(fizzBuzz).foreach(println)
}
