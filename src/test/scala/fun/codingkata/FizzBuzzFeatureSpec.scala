package fun.codingkata

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FeatureSpec, GivenWhenThen}

@RunWith(classOf[JUnitRunner])
class FizzBuzzFeatureSpec extends FeatureSpec with GivenWhenThen {
  feature ("Fizz Buzz") {
    scenario ("Print out count to a specified number") {
      Given ("I have a fizz buzz app")

      When ("I ask for a count to 15")
      val fizzBuzzCount: String = FizzBuzz.countTo(15)

      Then ("I receive a string of the count")
      assert("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz" == fizzBuzzCount)
    }
  }
}
