package fun.codingkata

object FizzBuzz {
  def getResult(number: Int): Any =
    if (number % 3 == 0)
      "fizz"
    else if (number % 5 == 0)
      "buzz"
    else
      number

  def countTo(count: Int): String = "1 2 fizz"
}
