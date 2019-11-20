package fun.codingkata

import org.scalatest.{FeatureSpec, GivenWhenThen}

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
      Given("I have a fizz buzz app")

      When("I ask for a count to 5")
      val fizzBuzzCount: String = FizzBuzz.countTo(5)

      Then("I receive a string of the count")
      assert("1 2 fizz 4 buzz" == fizzBuzzCount)
    }

    scenario("Provide count to 15") {
      Given("I have a fizz buzz app")

      When("I ask for a count to 15")
      val fizzBuzzCount: String = FizzBuzz.countTo(15)

      Then("I receive a string of the count")
      assert("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz" == fizzBuzzCount)
    }
  }
}
