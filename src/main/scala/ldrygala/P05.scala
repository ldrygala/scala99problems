package ldrygala

/**
 * Created by ldrygala on 2015-01-10.
 */
object P05 {
  def reverse[A](listToReverse: List[A]): List[A] = listToReverse.foldLeft(List.empty[A]) {
    case (acc, elem) => elem :: acc
  }
}
