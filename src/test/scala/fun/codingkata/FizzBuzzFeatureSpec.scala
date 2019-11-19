package fun.codingkata

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FeatureSpec, GivenWhenThen}

@RunWith(classOf[JUnitRunner])
class FizzBuzzFeatureSpec extends FeatureSpec with GivenWhenThen {
  feature ("Fizz Buzz") {
    scenario("Provide count to 3") {
      Given("I have a fizz buzz app")

      When("I ask for a count to 3")
      val fizzBuzzCount: String = FizzBuzz.countTo(3)

      Then("I receive a string of the count")
      assert("1 2 fizz" == fizzBuzzCount)
    }

    scenario("Provide count to 5") {

    }

    scenario("Provide count to 15") {

    }
  }
}
