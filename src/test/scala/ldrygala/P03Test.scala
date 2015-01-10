package ldrygala

import ldrygala.P03.nth
import org.scalatest.{Matchers, WordSpec}

class P03Test extends WordSpec with Matchers {
  "P03.nth" when {
    "index argument is greater then list length" should {
      "throw NoSuchElementException" in {
        intercept[NoSuchElementException] {
          nth(4, List(1, 2, 3))
        }
      }
    }
    "index argument is equal list length" should {
      "throw NoSuchElementException" in {
        intercept[NoSuchElementException] {
          nth(4, List(1, 2, 3, 4))
        }
      }
    }
    "index argument is lower then zero" should {
      "throw NoSuchElementException" in {
        intercept[NoSuchElementException] {
          nth(-1, List(1, 2, 3, 4))
        }
      }
    }
    "index argument is lower then list length" should {
      "return nth element form list of integers" in {
        nth(2, List(1, 2, 3)) shouldBe 3
      }
      "return nth element form list of strings" in {
        nth(2, List("1", "2", "3")) shouldBe "4"
      }
    }
  }
}
