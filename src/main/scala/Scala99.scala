object Scala99 extends App {

  def findLast[T](ls: List[T]): T = ls.last

  def findLastButOne[T](ls: List[T]): T = ls.init.last

  def kthElement(n: Int, ls: List[Any]): Any = if (n >= 0) ls(n)

}
