import CaesarCipher._
import org.scalatest._
import flatspec._
import matchers._

class CaesarCipherSpec extends AnyFlatSpec with should.Matchers {

  behavior of "caesarCipher"

  "caesarCipher" should "given a lowercase letter and a number between 0 and 26, return that letter Caesar shifted by that number" in {
    caesarCipher('a', 0) shouldBe 'a'
    caesarCipher('a', 1) shouldBe 'b'
    caesarCipher('a', 5) shouldBe 'f'

  }

  behavior of "caesar"

  "caesar" should "given a string of lowercase letters and a number, return a string with each letter Caesar shifted by the given amount." in {
    caesar("a", 1) shouldBe "b"
    caesar("abcz", 1) shouldBe "bcda"
    caesar("irk", 13) shouldBe "vex"
    caesar("fusion", 6) shouldBe "layout"
    caesar("dailyprogrammer", 6) shouldBe "jgorevxumxgsskx"
    caesar("jgorevxumxgsskx", 20) shouldBe "dailyprogrammer"

  }

}
