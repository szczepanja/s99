import org.scalatest._
import flatspec._
import matchers._

class NextPalSpec extends AnyFlatSpec with should.Matchers {

  import NextPal._

  "isPalindrome" should "return true" in {
    nextPal(808) shouldBe 818
    nextPal(999) shouldBe 1001
  }
}
