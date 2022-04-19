import CaesarCipher._
import org.scalatest._
import flatspec._
import matchers._

class CaesarCipherSpec extends AnyFlatSpec with should.Matchers {

  "caesarCipher" should "given a lowercase letter and a number between 0 and 26, return that letter Caesar shifted by that number" in {
    caesarCipher('a', 0) shouldBe 'a'
    caesarCipher('a', 1) shouldBe 'b'
    caesarCipher('a', 5) shouldBe 'f'
  }

}
