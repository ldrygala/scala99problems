package ldrygala

import org.scalatest.{Matchers, WordSpec}

/**
 * Created by ldrygala on 2015-02-18.
 */
class P07Test extends WordSpec with Matchers {

  "Empty list" should {
    "return empty list after flatten" in {
      P07.flatten(List.empty) shouldBe(List.empty)
    }
  }

  "List(1,2)" should {
    "return List(1,2) after flatten" in {
      P07.flatten(List(1,2)) shouldBe(List(1,2))
    }
  }

  "List(1,List(2,3),List(4,List(5)))" should {
    "return List(1,2,3,4,5) after flatten" in {
      P07.flatten(List(1,List(2,3),List(4,List(5)))) shouldBe(List(1,2,3,4,5))
    }
  }
}
