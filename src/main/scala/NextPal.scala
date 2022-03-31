object NextPal {

  def nextPal(n: Int): Int = {

    def isPalindrome(ns: Int): Boolean = {
      ns.toString.reverse.toInt == ns
    }

    if (isPalindrome(n + 1)) n + 1
    else nextPal(n + 1)
  }
}
