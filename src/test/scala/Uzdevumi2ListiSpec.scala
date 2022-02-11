package lldite

import org.scalatest.wordspec._
import org.scalatest.matchers.should.Matchers._

class Uzdevumi2ListiSpec extends AnyWordSpec {
  val obj = Uzdevumi2Listi

  "uzdevums1" in {
    obj.uzdevums1(List(List(1, 2), List(3), List(), List(4, 5, 6))) shouldBe List(1, 2, 3, 4, 5, 6)
  }

  "uzdevums2" in {
    obj.uzdevums2(List(1, 2, 3)) shouldBe List(List(1), List(2, 2), List(3, 3, 3))
  }

  "uzdevums3" in {
    obj.uzdevums3(List(1, 2, 3)) shouldBe List(1, 2, 2, 3, 3, 3)
  }

  "uzdevums4" in {
    obj.uzdevums4(List(1, 2, 3)) shouldBe List(1, 2, 3, 2, 3, 4, 3, 4, 5)
    obj.uzdevums4(List(5, 6, 7)) shouldBe List(5, 6, 7, 6, 7, 8, 7, 8, 9)
  }
}
