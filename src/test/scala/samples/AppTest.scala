package samples

import org.junit._
import Assert._
import fun.codingkata.App

@Test
class AppTest {

    @Test
    def testOK(): Unit = assertTrue(true)

    @Test
    def fooFoldsTwoStrings(): Unit = {
        assert("HelloWorld" == App.foo(Array("Hello", "World")))
    }


//    @Test
//    def testKO() = assertTrue(false)

}


