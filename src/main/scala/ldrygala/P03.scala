package ldrygala

/**
 * Find the Kth element of a list.
 * By convention, the first element in the list is element 0.
 * Example:
 * {{{
 *   scala> nth(2, List(1, 1, 2, 3, 5, 8))
 *   res0: Int = 2
 * }}}
 */
object P03 {
  def nth[A](index: Int, list: List[A]): A = (index, list) match {
    case (0, l) => l.head
    case (i, l) if l.length <= i || i < 0 => throw new NoSuchElementException
    case (i, l) => nth(i - 1, l.tail)
  }
}
