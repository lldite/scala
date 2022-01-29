package lldite

object Listi {
  def main(): Unit = {
    println("Listi")

    val l = List(1, 2) ++ List(3, 4)
    println(l.map(x => (x * 41).toString.reverse))

    println((1, 2, 3, 4, 5).toString.reverse == ")5,4,3,2,1(")

    println((1 to 20).toList.filter(x => x % 2 == 0).map(x => (x, x + 1)))

    println((1 to 20).toList.filter(x => x % 2 == 0).map(x => List(x, x + 1)).flatten)

    println(List.fill(10)("vīrietis").mkString(" ♥ sieviete ♥ "))
    // vīrietis ♥ sieviete ♥ vīrietis ♥ sieviete ♥ vīrietis ♥ sieviete ♥ vīrietis ♥ sieviete ♥ vīrietis ♥ sieviete ♥ vīrietis ♥ sieviete ♥ vīrietis ♥ sieviete ♥ vīrietis ♥ sieviete ♥ vīrietis ♥ sieviete ♥ vīrietis

    // -----------------------------------

    val augstums = 9 // trijstuurim
    val kolonna = 7
    val staavs = ((1 to augstums) ++ (augstums - 1 to 1 by -1)).toList

    println(
      List.fill(4)(staavs).flatten.map { i =>
        // (List.fill(augstums - i)("-") var pārrakstīt uz "-" * (augstums - i) u.t.t.
        (List.fill(augstums - i)("-") ++ List.fill(2 * i - 1)("*") ++ List.fill(augstums - i)("-")).mkString * kolonna
      }.mkString("\n")
    )
  }
}
