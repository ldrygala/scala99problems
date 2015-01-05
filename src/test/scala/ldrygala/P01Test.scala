package ldrygala

import ldrygala.P01.last
import org.scalatest.{WordSpec, Matchers, FunSuite}

class P01Test extends WordSpec with Matchers {
  "P01.last" when {
    "input is empty" should {
      "throw exception" in {
        intercept[NoSuchElementException] {
          last(Nil)
        }
      }
    }
    "input has only one element" should {
      "return this element for list of integers" in {
        last(List(1)) shouldBe 1
      }
      "return this element for list of strings" in {
        last(List("A")) shouldBe "A"
      }
      "return this element for list of chars" in {
        last(List('a')) shouldBe 'a'
      }
    }
    "input has more then two elements" should {
      "return last element for list of integers" in {
        last(List(1,2,3,4)) shouldBe 4
      }
      "return last element for list of strings" in {
        last(List("a","b","c")) shouldBe "c"
      }
      "return last element for list of chars" in {
        last(List('a','b','c')) shouldBe 'c'
      }
    }
  }
}
