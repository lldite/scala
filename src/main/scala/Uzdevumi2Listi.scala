package lldite

object Uzdevumi2Listi {
  // List(List(1, 2), List(3), List(), List(4, 5, 6)) -> List(1, 2, 3, 4, 5, 6)
  def uzdevums1(list: List[List[Int]]): List[Int] = List()

  // List(1, 2, 3) -> List(List(1), List(2, 2), List(3, 3, 3))
  def uzdevums2(list: List[Int]): List[List[Int]] = List()

  // List(1, 2, 3) -> List(1, 2, 2, 3, 3, 3)
  def uzdevums3(list: List[Int]): List[Int] = List()

  // List(1, 2, 3) -> List(1, 2, 3, 2, 3, 4, 3, 4, 5)
  // List(5, 6, 7) -> List(5, 6, 7, 6, 7, 8, 7, 8, 9)
  def uzdevums4(list: List[Int]): List[Int] = List()
}
