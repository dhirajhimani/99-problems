package com.scalapractices.ninetynine_problems._01_lists

/**
  * (*) Split a list into two parts; the length of the first part is given.
  * {{{
  *     split(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"), 3)
  * }}}
  */
object P17 {

  def split[T](list: List[T], n: Int): (List[T], List[T]) = {
    def go(list: List[T], count: Int, result: List[T]): (List[T], List[T]) = list match {
      case x :: xs if (count > 0)=>  go(xs, count - 1, x :: result)
      case x :: xs => (result.reverse, list)
    }

    if (n ==0) (Nil, list) else go(list, n, Nil)
  }

  def splitUsingSplitAt[T](list: List[T], n: Int): (List[T], List[T]) = {
    list.splitAt(n)
  }

  def split_take_drop[T](list: List[T], n: Int): (List[T], List[T]) = {
    (list.take(n), list.drop(n))
  }

}
