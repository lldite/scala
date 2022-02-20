package lldite

import org.scalatest.wordspec._
import org.scalatest.matchers.should.Matchers._

class Uzdevumi1ListiSpec extends AnyWordSpec {
  val obj = Uzdevumi1Listi

  "it should filter numbers that are divisible by 3" in {
    List(
      (List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12), List(1, 2, 4, 5, 7, 8, 10, 11)),
    ).foreach { case (from, to) =>
      obj.filterNumbersDivisibleBy3(from) shouldBe to
    }
  }

  "it should compute every third letter" in {
    List(
      (('a' to 'z').toList, List('c', 'f', 'i', 'l', 'o', 'r', 'u', 'x')),
    ).foreach { case (from, to) =>
      obj.everyThirdLetter(from) shouldBe to
    }
  }

  "it should compute numberPatterns" in {
    List(
      (0, "zero, divisible by 3, divisible by 5"),
      (-1, "negative"),
      (1, ""),
      (-3, "negative, divisible by 3"),
      (5, "divisible by 5"),
      (30, "divisible by 3, divisible by 5"),
      (-25, "negative, divisible by 5"),
    ).foreach { case (from, to) =>
      (from, obj.numberPatterns(from)) shouldBe (from, to)
    }
  }

  "it should getElementAtMaxIndex" in {
    List(
      (List(0), 0),
      (List(1, 0, 1), 0),
      (List(2, 2, 0), 0),
      (List(-2, -1, 0), -2),
      (List(4, 3, 0, 2, 1), 1),
      (List(3, 5, 1, -3, 2, 3), 3),
    ).foreach { case (from, to) =>
      obj.getElementAtMaxIndex(from) shouldBe to
    }
  }

  "it should compute diagonalsEqual" in {
    List(
      (((1, 0), (0, 1)), (true, true)),
      (((2, 9), (9, 4)), (false, true)),
    ).foreach { case (from, to) =>
      obj.diagonalsEqual(from) shouldBe to
    }
  }

  "it should compute sumOrProduct" in {
    List(
      ((1, 3, true), 4),
      ((5, 5, false), 25),
      ((6, 7, true), 13),
      ((8, -8, true), 0),
      ((8, -8, false), -64),
    ).foreach { case (from, to) =>
      (obj.sumOrProduct _).tupled(from) shouldBe to
    }
  }

  "it should compute productIfSumEvenOtherwiseSum" in {
    List(
      ((3, 4), 7),
      ((4, 6), 24),
      ((5, 2), 7),
      ((9, 1), 9),
      ((5, 6), 11),
      ((-3, -3), 9),
    ).foreach { case (from, to) =>
      (from, (obj.productIfSumEvenOtherwiseSum _).tupled(from)) shouldBe ((from, to))
    }
  }

  "it should compute sumPositiveReturnIfBiggerThanTwenty" in {
    List(
      (List(1, -5, -6, 9, 5, -2), false),
      (List(-3, 3, -3, 3, -3, 3), false),
      (List(-4, 2, 3, 7, -10, 10, 5), true),
      (List(100, -200), true),
    ).foreach { case example @ (from, to) =>
      (from, obj.sumPositiveReturnIfBiggerThanTwenty(from)) shouldBe example
    }

  }

  "it should izravētElementus" in {
    obj.izravētElementus(List('a', 'b', 'c', 'd', 'e')) shouldBe "ace"
    obj.izravētElementus(List('h', 'o', 'e', 'x', 'h')) shouldBe "heh"
    obj.izravētElementus(List(':', 'o', '-', 'x', ')', '-')) shouldBe ":-)"
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

  "it should getFromThirdToSixth" in {
    obj.getFromThirdToSixth(List(9, 8, 7, 6, 5, 4, 3, 2, 1)) shouldBe List(7, 6, 5, 4)
    obj.getFromThirdToSixth(List(3, 4, 3, 4, 3, 4, 3)) shouldBe List(3, 4, 3, 4)
  }

  "it should reverse lists" in {
    // Kāds ir apgriezts saraksts List(1,2,3,4,5)?
    // Programma: List()
    // Skolotāja atbildes lapiņā: List(5,4,3,2,1)
    obj.reverse(List(1, 2, 3, 4, 5)) shouldBe List(5, 4, 3, 2, 1)
    obj.reverse(List(4, 8, 3, 6)) shouldBe List(6, 3, 8, 4)
    obj.reverse(List('x', 'p', 'z', 'f', 'n', 'y')) shouldBe List('y', 'n', 'f', 'z', 'p', 'x')
  }
}
