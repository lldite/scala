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
  def multiplyWithPlusOne(ns: List[Int]): Int = {
    val zip: (Int, Int) => Int = (a, b) => a * (b + 1)
    ns.foldLeft[Int](1)(zip)
  }
  // ns.foldLeft(1)((a, b) => a * (b + 1))

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

  // List() = 0
  // List(3, 6, 5) = 6
  // List(5, 3, 7, 1, 9) = 9
  // List(7, 6, 5) = 7
  // HINT: list.max izmantot nedrīkst
  def max(a: List[Int]): Int = a.foldLeft(-70000)((b, c) => if (b > c) b else c)

  // List() = -100
  // List(1) = 1
  // List(-5) = -100
  // List(-5, -7) = -100
  // List(1, 0) = 1
  // List(1, 1) = 1
  // List(1, 2) = 1
  // List(1, -7) = -7
  // List(1, -7, -9) = -7
  // List(1, -7, -5) = -7
  // List(1, -7, 4) = 4
  // List(1, -7, 4, 5) = 4
  // List(1, -7, 4, -4) = -4
  // List(1, -7, 4, -5) = -5
  // List(1, -7, 4, -6) = -6
  def flipflop(ns: List[Int]): Int =
    ns.foldLeft(-100)((a, b) => if (a < 0 && b > 0 || a > 0 && b < 0) b else a)
  // ns.foldLeft(-100)((a,b) => if (a > 0 != b > 0) b else a)

  // List() -> List()
  // List(1, 2) -> List(2, 1)
  // List(1, 2, 3) -> List(3, 2, 1)
  // List(1, 2, 3, 4) -> List(4, 3, 2, 1)
  // List(1, 2, 3, 4, 5) -> List(5, 4, 3, 2, 1)
  // List(4, 8, 3, 6) -> List(6, 3, 8, 4)
  def reverse(list: List[Int]): List[Int] = {
    val zipper: (List[Int], Int) => List[Int] = (l, i) => List(i) ++ l
    list.foldLeft(List[Int]())(zipper)
  }

  // List() -> (List(), List())
  // List(1) -> (List(1), List())
  // List(-3, 1) -> (List(1), List(-3))
  // List(-3, 1, -6) -> (List(1), List(-3, -6))
  // List(-3, 1, -6, 0) -> (List(1, 0), List(-3, -6))
  // List(-3, 1, -6, 0, -1) -> (List(1, 0), List(-3, -6, -1))
  // List(-3, 1, -6, 0, -1, 5) -> (List(1, 0, 5), List(-3, -6, -1))
  // TODO: draw computation tree for third example
  def partition(ns: List[Int]): (List[Int], List[Int]) =
    ns.foldLeft[(List[Int], List[Int])]((List(), List()))((a, b) =>
      if (b >= 0) (a._1 ++ List(b), a._2) else (a._1, a._2 ++ List(b))
    )
  // ns.foldLeft[(List[Int], List[Int])]((List(),List()))((a,b) => ???)
}
