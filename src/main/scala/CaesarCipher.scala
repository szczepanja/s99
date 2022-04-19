object CaesarCipher {

  def caesarCipher(c: Char, i: Int): Char = c match {
    case c if c.isLetter => {
      val offset = if (c.isUpper) 'A' else 'a'
      (((c - offset + i) % 26) + offset).toChar
    }
    case _ => c
  }

}
