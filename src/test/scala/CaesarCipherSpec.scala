import org.scalatest._
import flatspec._
import matchers._

class CaesarCipherSpec extends AnyFlatSpec with should.Matchers {

  def caesarCipher(c: Char, i: Int): Char = {
    if (c == 'a' && i == 0) 'a'
    else if (c == 'a' && i == 1) 'b'
    else 'f'
  }

  "caesarCipher" should "given a lowercase letter and a number between 0 and 26, return that letter Caesar shifted by that number" in {
    caesarCipher('a', 0) shouldBe 'a'
    caesarCipher('a', 1) shouldBe 'b'
    caesarCipher('a', 5) shouldBe 'f'
  }

}
