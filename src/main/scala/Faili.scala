object Faili {
  def main(args: Array[String]): Unit = {
    // Nolasam failu, kas vēl neeksistē, un izprintējam saturu
    println("Faila sākotnējais saturs:")
    println(FailiLib.read("potat.txt"))

    // Secinam, ka tur nekā nav, un paši ierakstam tur kaut ko
    FailiLib.write("potat.txt", "Krišjānis ir the best")

    // Nolasam failu vēlreiz un izprintējam saturu
    println("Faila pēcākais saturs:")
    println(FailiLib.read("potat.txt"))

    // Dzēšam failu
    FailiLib.remove("potat.txt")
  }
}
