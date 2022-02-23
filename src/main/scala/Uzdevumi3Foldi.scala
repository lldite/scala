package lldite

object Uzdevumi3Foldi {
  // List() -> 0
  // List(1,2,3) -> 6
  // n.foldLeft(0)((a, b) => a + b)  ==  (((0 + 1) + 2) + 3)
  // List(3,5,6,8) -> 22
  // n.foldLeft(0)((a, b) => a + b)  ==  ((((0 + 3) + 5) + 6) + 8)
  def sumNumbers(n: List[Int]): Int = 0

  // List() -> 1
  // List(1, 2, 3) -> 24
  // List(4, 9, 6) -> 350
  def multiplyWithPlusOne(n: List[Int]): Int = 0

  // 123, List() -> 0
  // 749, List(107) -> 7
  // 210, List(5, 7, 2) -> 3
  // 420, List(3, 5, 7) -> 4
  // 1000, List(5, 2, 5, 2) -> 10
  def divideBy(dividee: Int, divisors: List[Int]): Int = 0

  // List() -> ""
  // List("one", "two", three") -> " one two three"
  // List("1", "234", "5") -> " 1 234 5"
  def sumStrings(strings: List[String]): String = ""

  def count(a: List[Int]): Int = 0
}
