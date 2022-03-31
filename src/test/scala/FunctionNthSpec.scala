import org.scalatest._
import flatspec._
import matchers._

class FunctionNthSpec extends AnyFlatSpec with should.Matchers {

  import FunctionNth._

  "isPalindrome" should "return true" in {
    functionNth("hello", 2) shouldBe 'l'
    functionNth("hel", 1) shouldBe 'e'
  }
}
