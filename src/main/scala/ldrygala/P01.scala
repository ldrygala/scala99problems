package ldrygala

import java.util.NoSuchElementException

/**
 * Find the last element of a list.
 * Example:
 * {{{
 *   scala> last(List(1, 1, 2, 3, 5, 8))
 *   res0: Int = 8
 * }}}
 *
 */
object P01 {
  def last[A](input: List[A]): A = input match {
    case first::Nil => first
    case _::rest => last(rest)
    case Nil => throw new NoSuchElementException
  }
}
