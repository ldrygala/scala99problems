package ldrygala

/**
 * Find out whether a list is a palindrome.
 * Example:
 * {{{
 * scala> isPalindrome(List(1, 2, 3, 2, 1))
 * res0: Boolean = true
 * }}}
 */
object P06 {
  def isPalindrome[A](seq: Seq[A]): Boolean = {
    if (seq.size < 2) true else seq.head == seq.last && isPalindrome(seq.tail.dropRight(1))
  }

//  def isPalindrome[A](seq: Seq[A]): Boolean = seq.reverse == seq
}