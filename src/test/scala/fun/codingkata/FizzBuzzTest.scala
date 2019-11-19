package fun.codingkata

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FizzBuzzTest extends FlatSpec {
  "Fizz Buzz" should "return fizz when divisible by 3" in {
    assert("fizz" == FizzBuzz.getResult(3))
    assert("fizz" == FizzBuzz.getResult(6))
  }

  it should "return buzz when divisible by 5" in {
    assert("buzz" == FizzBuzz.getResult(5))
    assert("buzz" == FizzBuzz.getResult(10))
  }

  it should "return a number when not divisible by 3, 5, or 15" in {
    assert(2 == FizzBuzz.getResult(2))
  }
}
