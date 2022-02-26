package lldite

object Uzdevumi3Foldi {
  // List() -> 0
  // List(1,2,3) -> 6
  // n.foldLeft(0)((a, b) => a + b)  ==  (((0 + 1) + 2) + 3)
  // List(3,5,6,8) -> 22
  // n.foldLeft(0)((a, b) => a + b)  ==  ((((0 + 3) + 5) + 6) + 8)
  def sumNumbers(ns: List[Int]): Int =
    ns.foldLeft(0)((a, b) => a + b)

  // List() -> 1
  // List(1, 2, 3) -> 24
  // List(4, 9, 6) -> 350
  def multiplyWithPlusOne(ns: List[Int]): Int =
    ns.foldLeft(1)((a, b) => a * (b + 1))

  // 123, List() -> 0
  // 749, List(107) -> 7
  // 210, List(5, 7, 2) -> 3
  // 420, List(3, 5, 7) -> 4
  // 1000, List(5, 2, 5, 2) -> 10
  def divideBy(dividee: Int, divisors: List[Int]): Int =
    divisors.foldLeft(dividee)((a, b) => a / b)

  // List() -> ""
  // List("one", "two", three") -> " one two three"
  // List("1", "234", "5") -> " 1 234 5"
  // HINT: mkString nevar lietot
  def sumStrings(strings: List[String]): String =
    strings.foldLeft("")((a, b) => a ++ (" " ++ b))

  // List() -> 0
  // List(1, 2) -> 2
  // List(5, 4, 1, 9) -> 4
  // List(6) -> 1
  // List(1, 5, 2, 0, -1) -> 5
  def count(a: List[Int]): Int =
    a.foldLeft(0)((a, b) => a + 1)
}
