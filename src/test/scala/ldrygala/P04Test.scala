package ldrygala

import org.scalatest.{Matchers, WordSpec}

class P04Test extends WordSpec with Matchers {
  "P04.lenght" when {
    "list is empty" should {
      "return 0" in {
        P04.length(Nil) shouldBe 0
      }
    }
    "list has 3 elements" should {
      "return 3" in {
        P04.length(List(1, 2, 3)) shouldBe 3
      }
    }
  }
}
