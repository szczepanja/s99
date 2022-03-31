object Scala99 extends App {

  def findLast[T](ls: Seq[T]): T = ls.last

  def findLastButOne[T](ls: Seq[T]): T = ls.init.last

  def kthElement(n: Int, ls: Seq[Any]): Any = if (n >= 0) ls(n)

  def listLength(value: Seq[Any]) = value.size

  def lengthRecursive(ls: Seq[Any]): Int = ls match {
    case Nil => 0
    case _ :: tail => 1 + lengthRecursive(tail)
  }

  def reverse[T](ls: Seq[T]): Seq[T] = ls.foldLeft(List[T]()) { (result, head) => head :: result }

  def isPalindrome(ls: Seq[Int]): Boolean = ls.reverse == ls

  def flatten(ls: Seq[Any]): Seq[Any] = ls flatMap {
    case el: Seq[_] => flatten(el)
    case e => Seq(e)
  }

  def compress(value: Seq[Char]): Seq[Char] = value.distinct
}
