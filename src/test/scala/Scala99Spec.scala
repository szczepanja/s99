import org.scalatest._
import flatspec._
import matchers._

class Scala99Spec extends AnyFlatSpec with should.Matchers {

  import Scala99._

  "findLast" should "find last element in list" in {
    findLast(List("ania", 'l', 3, 5.00, 0.3)) shouldBe 0.3
  }

  "findLastButOne" should "find last element in list" in {
    findLastButOne(List("ania", 'l', 3, 5.00, 0.3)) shouldBe 5.00
  }

  "kthElement" should "find kth element in list" in {
    kthElement(2, List("ania", 'l', 3, 5.00, 0.3)) shouldBe 3
  }
}
