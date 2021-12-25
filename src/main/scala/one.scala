object Main {
  def main(args: Array[String]): Unit = {
    val h = 4

    //println(stavs(h, 1))
    //println(stavs(h, 2))
    //println(stavs(h, 3))
    //println(stavs(h, 4))

    //(1 to (h-1)).foreach{s=>println(stavs(h,s))}
    //(h to 1 by (-1)).foreach{s=>println(stavs(h,s))}

    List.fill(4)(()).foreach { a =>
      ((1 to (h - 1)).toList ++ (h to 1 by (-1)).toList)
        .foreach { s => println(stavs(h, s)) }
    }
  }

  //scala> val g: Int => Int = { i => i + 1 }

  def stavs(h: Int, s: Int): String = {
    val m = List.fill(h - s)('_') // List('_', '_', '_')
    val v = List.fill(s * 2 - 1)('*')
    (m ++ v ++ m).mkString
  }
}
