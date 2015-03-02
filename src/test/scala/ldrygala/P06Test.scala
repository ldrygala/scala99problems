package ldrygala

import ldrygala.P06.isPalindrome
import org.scalatest.{Matchers, WordSpec}

/**
 * Created by ldrygala on 2015-02-18.
 */
class P06Test extends WordSpec with Matchers {
  "Empty list" should {
    "be palindrome" in {
      isPalindrome(Seq.empty) shouldBe true
    }
  }

  "Seq(1,2,1)" should {
    "be palindrome" in {
      isPalindrome(Seq(1,2,1)) shouldBe true
    }
  }

  "Seq(1,2,3)" should {
    "not be palindrome" in {
      isPalindrome(Seq(1,2,3)) shouldBe false
    }
  }

  "Seq(1,1)" should {
    "be palindrome" in {
      isPalindrome(Seq(1,1)) shouldBe true
    }
  }
}
