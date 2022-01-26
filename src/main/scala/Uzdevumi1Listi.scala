// package lldite

object Uzdevumi1Listi {
  // (List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12), List(1, 2, 4, 5, 7, 8, 10, 11))
  def filterNumbersDiv3(l: List[Int]): List[Int] = ???

  // (0, "zero, divisible by 3, divisible by 5"),
  // (-1, "negative"),
  // (-3, "negative, divisible by 3"),
  // (5, "divisible by 5"),
  // (30, "divisible by 3, divisible by 5"),
  def numberPatterns(i: Int): String = ???

  // (List(0), 0),
  // (List(1, 0, 1), 0),
  // (List(2, 2, 0), 0),
  // (List(-2, -1, 0), -2),
  def getElementAtMaxIndex(list: List[Int]): Int = ???

  // (List(0, 0, 0), "..."),
  // (List(1, 1), "::"),
  // (List(9, 8, 7, 6, 5), "#%|:."),
  // (List(0, 1, 2, 3, 4, 5, 6, 7, 8), "#%|:."),
  // (List(0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4), "...:::|||%%%###"),
  def fillPattern(list: List[Int]): String = ???
}
