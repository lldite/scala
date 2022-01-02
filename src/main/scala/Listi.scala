object Listi {
  def main(): Unit = {
    println("Listi")

    val l = List(1,2)++List(3,4)
    println(l.map(x => (x*41).toString.reverse))

    println((1,2,3,4,5).toString.reverse == ")5,4,3,2,1(")

    println((1 to 20).toList.filter(x => x % 2 == 0).map(x => (x, x+1)))

    println((1 to 20).toList.filter(x => x % 2 == 0).map(x => List(x, x+1)).flatten)
  }
}
