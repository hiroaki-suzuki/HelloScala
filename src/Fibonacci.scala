object Fibonacci extends App {
  def fib(n: Int): Int = {
    if (n == 0) return 0
    if (n == 1) return 1
    fib(n - 1) + fib(n - 2)
  }

  for (n <- 0 to 20) {
    println(fib(n))
  }
}
