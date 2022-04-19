object CaesarCipher {

  def caesarCipher(c: Char, i: Int) = {
    if (c.isLetter) {
      val offset = if (c.isUpper) 'A'
      else 'a'
      ((((c - offset) + i) % 26) + offset).toChar
    }
    else
      c
  }

  caesarCipher('a', 1)

}
