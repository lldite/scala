package lldite

import org.scalatest.wordspec._
import org.scalatest.matchers.should.Matchers._

class Uzdevumi3FoldiSpec extends AnyWordSpec {
  val obj = Uzdevumi3Foldi

  "it should sum numbers" in {
    obj.sumNumbers(List(0)) shouldBe 0
    obj.sumNumbers(List(1, 2, 3)) shouldBe 6
    obj.sumNumbers(List(3, 5, 6, 8)) shouldBe 22
  }

  "multiplyWithPlusOne" in {
    obj.multiplyWithPlusOne(List()) shouldBe 1
    obj.multiplyWithPlusOne(List(1, 2, 3)) shouldBe 24
    obj.multiplyWithPlusOne(List(4, 9, 6)) shouldBe 350
  }

  "divideBy" in {
    obj.divideBy(123, List()) shouldBe 123
    obj.divideBy(749, List(107)) shouldBe 7
    obj.divideBy(210, List(5, 7, 2)) shouldBe 3
    obj.divideBy(420, List(3, 5, 7)) shouldBe 4
    obj.divideBy(1000, List(5, 2, 5, 2)) shouldBe 10
  }

  "sumStrings" in {
    obj.sumStrings(List()) shouldBe ""
    obj.sumStrings(List("one", "two", "three")) shouldBe " one two three"
    obj.sumStrings(List("1", "234", "5")) shouldBe " 1 234 5"
  }

  "count elements" in {
    obj.count(List()) shouldBe 0
    obj.count(List(1, 2, 3)) shouldBe 3
    obj.count(List(6, 5, 4, 8, 7, 6)) shouldBe 6
  }

  "reverse" in {
    obj.reverse(List(1, 2, 3, 4, 5)) shouldBe List(5, 4, 3, 2, 1)
    obj.reverse(List(4, 8, 3, 6)) shouldBe List(6, 3, 8, 4)
    obj.reverse(List('x', 'p', 'z', 'f', 'n', 'y')) shouldBe List('y', 'n', 'f', 'z', 'p', 'x')
  }
}
