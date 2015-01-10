package ldrygala

import org.scalatest.{Matchers, WordSpec}

class P05Test extends WordSpec with Matchers {
  "P05.reverse" when {
    "list is empty" should {
      "return empty list" in {
        P05.reverse(Nil) shouldBe Nil
      }
    }
    "List(1,2,3)" should {
      "return List(3,2,1)" in {
        P05.reverse(List(1, 2, 3)) shouldBe List(3, 2, 1)
      }
    }
  }
}
