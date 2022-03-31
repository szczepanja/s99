import org.scalatest._
import flatspec._
import matchers._

class Scala99Spec extends AnyFlatSpec with should.Matchers {

  import Scala99._

  "findLast" should "find last element in list" in {
    findLast(Seq("ania", 'l', 3, 5.00, 0.3)) shouldBe 0.3
  }

  "findLastButOne" should "find last element in list" in {
    findLastButOne(Seq("ania", 'l', 3, 5.00, 0.3)) shouldBe 5.00
  }

  "kthElement" should "find kth element in list" in {
    kthElement(2, Seq("ania", 'l', 3, 5.00, 0.3)) shouldBe 3
  }

  "listLength" should "return number of elements in list" in {
    listLength(Seq("ania", 'l', 3, 5.00, 0.3)) shouldBe 5
  }

  "lengthRecursive" should "return number of elements in list" in {
    lengthRecursive(Seq("ania", 'l', 3, "xyz", true, false, 0.3)) shouldBe 7
  }

  "reverse" should "reverse list" in {
    reverse(Seq(1, 1, 2, 3, 5, 8)) shouldBe (Seq(8, 5, 3, 2, 1, 1))
  }

  "isPalindrome" should "return true" in {
    isPalindrome(Seq(1, 2, 3, 2, 1)) shouldBe true
  }

  "isPalindrome" should "return false" in {
    isPalindrome(Seq(1, 2, 3, 2, 4)) shouldBe false
  }

  "flatten" should "return flatten Seqs" in {
    flatten(Seq(Seq(1, 1), 2, Seq(3, Seq(5, 8)))) shouldBe Seq(1, 1, 2, 3, 5, 8)
  }

  "compress" should "distinct duplicates" in {
    compress(Seq('a', 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'd', 'e', 'e')) shouldBe Seq('a', 'b', 'c', 'd', 'e')
  }
}
