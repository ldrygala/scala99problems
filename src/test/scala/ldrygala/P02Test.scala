package ldrygala

import ldrygala.P02.penultimate
import org.scalatest.{Matchers, WordSpec}

class P02Test extends WordSpec with Matchers {
  "P02.penultimate" when {
    "input is empty" should {
      "throw NoSuchElementException" in {
        intercept[NoSuchElementException] {
          penultimate(Nil)
        }
      }
    }
    "input has only one element" should {
      "throw NoSuchElementException" in {
        intercept[NoSuchElementException] {
          penultimate(List(1))
        }
      }
    }
    "input has only two elements" should {
      "return first element for list of integers" in {
        penultimate(List(1, 2)) shouldBe 1
      }
    }
    "input has more then two element" should {
      "return last but one element for list of integers" in {
        penultimate(List(1, 2, 3, 4)) shouldBe 3
      }
    }
    "input has more then two element" should {
      "return last but one element for list of strings" in {
        penultimate(List("1", "2", "3", "4")) shouldBe "3"
      }
    }
  }
}
