package lldite

object Uzdevumi1Listi {
  // (List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12), List(1, 2, 4, 5, 7, 8, 10, 11))
  def filterNumbersDivisibleBy3(l: List[Int]): List[Int] =
    l.filter(x => x % 3 != 0)

  // (('a' to 'z').toList, List('c', 'f', 'i', 'l', 'o', 'r', 'u', 'x')),
  def everyThirdLetter(l: List[Char]): List[Char] =
    l.zipWithIndex.filter(x => x._2 % 3 == 2).map(x => x._1)

  // (0, "zero, divisible by 3, divisible by 5"),
  // (1, ""),
  // (-1, "negative"),
  // (-3, "negative, divisible by 3"),
  // (5, "divisible by 5"),
  // (30, "divisible by 3, divisible by 5"),
  def numberPatterns(x: Int): String = {
    val z: List[String] = if (x == 0) List("zero") else List()
    val n: List[String] = if (x < 0) List("negative") else List()
    val d3: List[String] = if (x % 3 == 0) List("divisible by 3") else List()
    val d5: List[String] = if (x % 5 == 0) List("divisible by 5") else List()
    (z ++ n ++ d3 ++ d5).mkString(", ")
  }

  // (List(0), 0),
  // (List(1, 0, 1), 0),
  // (List(2, 2, 0), 0),
  // (List(4, 3, 0, 2, 1), 1),
  // (List(-2, -1, 0), -2),
  def getElementAtMaxIndex(x: List[Int]): Int = x.apply(x.max)

  // (((1, 0), (0, 1)), (true, true)),
  // (((2, 9), (9, 4)), (false, true)),
  def diagonalsEqual(square: ((Int, Int), (Int, Int))): (Boolean, Boolean) =
    (square._1._1 == square._2._2, square._1._2 == square._2._1)

  // 1, 3, true -> 4
  // 5, 5, false -> 25
  // 6, 7, true -> 13
  // 8, -8, true -> 0
  // 8, -8, false -> -64
  def sumOrProduct(pirmais: Int, otrais: Int, sum: Boolean): Int =
    if (sum == true) pirmais + otrais else pirmais * otrais
    // if (sum) pirmais + otrais else pirmais * otrais

  // (List(0, 0, 0), "..."),
  // (List(1, 1), "::"),
  // (List(9, 8, 7, 6, 5), "#%|:."),
  // (List(0, 1, 2, 3, 4, 5, 6, 7, 8), "#%|:."),
  // (List(0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4), "...:::|||%%%###"),
  def fillPattern(list: List[Int]): String = ???
}
