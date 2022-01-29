package lldite

import org.scalatest.wordspec._
import org.scalatest.matchers.should.Matchers._

class Uzdevumi1ListiSpec extends AnyWordSpec {
  val obj = Uzdevumi1Listi

  "it should filter numbers that are divisible by 3" in {
    List(
      (List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12), List(1, 2, 4, 5, 7, 8, 10, 11)),
    ).foreach { case (from, to) =>
      obj.filterNumbersDiv3(from) shouldBe to
    }
  }

  "it should computer numberPatterns" in {
    List(
      (0, "zero, divisible by 3, divisible by 5"),
      (-1, "negative"),
      (-3, "negative, divisible by 3"),
      (5, "divisible by 5"),
      (30, "divisible by 3, divisible by 5"),
    ).foreach { case (from, to) =>
      obj.numberPatterns(from) shouldBe to
    }
  }

  "it should getElementAtMaxIndex" in {
    List(
      (List(0), 0),
      (List(1, 0, 1), 0),
      (List(2, 2, 0), 0),
      (List(-2, -1, 0), -2),
      (List(3, 5, 1, -3, 2, 3), 3),
    ).foreach { case (from, to) =>
      obj.getElementAtMaxIndex(from) shouldBe to
    }
  }

  "it should fillPattern" in {
    List(
      (List(0, 0, 0), "..."),
      (List(1, 1), "::"),
      (List(9, 8, 7, 6, 5), "#%|:."),
      (List(0, 1, 2, 3, 4, 5, 6, 7, 8), ".:|%#.:|%"),
      (List(0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4), "...:::|||%%%###"),
    ).foreach { case (from, to) =>
      obj.fillPattern(from) shouldBe to
    }
  }
}
