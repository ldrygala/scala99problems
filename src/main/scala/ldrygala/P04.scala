package ldrygala

/**
 * Find the number of elements of a list.
 * Example:
 * {{{
 * scala> length(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 6
 * }}}
 */
object P04 {
  def length[A](list: List[A]): Int = list.foldLeft(0) { case (len, _) => len + 1}
}
