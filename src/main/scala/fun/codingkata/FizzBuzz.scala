package fun.codingkata

object FizzBuzz {
  def getResult(number: Int): Any =
    if (number % 3 == 0 && number % 5 == 0)
      "fizzbuzz"
    else if (number % 3 == 0)
      "fizz"
    else if (number % 5 == 0)
      "buzz"
    else
      number

  def countTo(count: Int): String = {
    var message: String = ""

    for (itr <- 1 to count) {
      message += getResult(itr)
      if (itr < count)
        message += " "
    }
    message
  }
}
