package fun.codingkata

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FizzBuzzTest extends FlatSpec {
  "Fizz Buzz" should "return fizz when 3" in {
    assert("fizz" == FizzBuzz.getResult(3))
  }

}
