package ldrygala

/**
 * Find out whether a list is a palindrome.
 * Example:
 * {{{
 * scala> isPalindrome(List(1, 2, 3, 2, 1))
 * res0: Boolean = true
 * }}}
 */
object P07 {
  def flatten(l: List[Any]): List[Any] = {
    def flattenRec(recList: List[Any], result: List[Any]): List[Any] = {
      if (recList.isEmpty) {
        result.reverse
      } else {
        recList.head match {
          case list: List[Any] => flattenRec(recList.tail, flattenRec(list, result).reverse)
          case elem: Any => flattenRec(recList.tail, elem :: result)
        }
      }
    }
    flattenRec(l, List.empty[Any])
  }

}
