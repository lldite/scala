package lldite

object Uzdevumi2Listi {
  val datums = 13 // this is in scope

  // List(List(1, 2), List(3), List(), List(4, 5, 6)) -> List(1, 2, 3, 4, 5, 6)
  def uzdevums1(list: List[List[Int]]): List[Int] = list.flatten
  // List(List(1, 2), List(3), List(), List(4, 5, 6)).flatten
  // List(1, 2, 3, 4, 5, 6)

  // List(1, 2, 3) -> List(List(1), List(2, 2), List(3, 3, 3))
  def uzdevums2(list: List[Int]): List[List[Int]] = list.map(x => List.fill(x)(x))
  // List(1, 2, 3).map(x => List.fill(x)(x))
  // List(List(1), List(2, 2), List(3, 3, 3))

  // List(1, 2, 3) -> List(1, 2, 2, 3, 3, 3)
  def uzdevums3(list: List[Int]): List[Int] = list.map(x => List.fill(x)(x)).flatten
  // List(1,2,3).map( x=> List.fill(x)(x)).flatten
  // List(1, 2, 2, 3, 3, 3)

  // List(1, 2, 3) -> List(1, 2, 3, 2, 3, 4, 3, 4, 5)
  // List(5, 6, 7) -> List(5, 6, 7, 6, 7, 8, 7, 8, 9)
  // List(8) -> List(8, 9, 10)
  // List(3, 5) -> List(3, 4, 5, 5, 6, 7)
  // List(200, 100) -> List(200, 201, 202, 100, 101, 102)
  def uzdevums4(list: List[Int]): List[Int] =
    list.map(x => List(x, x + 1, x + 2)).flatten

  // UZDEVUMS: refaktorēt list.map(...).flatten uz list.flatMap(...)
}
