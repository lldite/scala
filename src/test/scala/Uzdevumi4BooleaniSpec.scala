package lldite

import org.scalatest.wordspec._
import org.scalatest.matchers.should.Matchers._

class Uzdevumi4BooleaniSpec extends AnyWordSpec {
  val obj = Uzdevumi4Booleani

  "biggerThan5OrOdd" in {
    obj.biggerThan5OrOdd(70) shouldBe true
    obj.biggerThan5OrOdd(6) shouldBe true
    obj.biggerThan5OrOdd(5) shouldBe true
    obj.biggerThan5OrOdd(4) shouldBe false
    obj.biggerThan5OrOdd(1) shouldBe true
    obj.biggerThan5OrOdd(-10) shouldBe false
    obj.biggerThan5OrOdd(-17) shouldBe true
  }

  "hasNumberOrSpace" in {
    obj.hasNumberOrSpace("tada") shouldBe false
    obj.hasNumberOrSpace("01234") shouldBe true
    obj.hasNumberOrSpace("two words") shouldBe true
    obj.hasNumberOrSpace("oneword") shouldBe false
    obj.hasNumberOrSpace("tada 0") shouldBe true
  }
}
