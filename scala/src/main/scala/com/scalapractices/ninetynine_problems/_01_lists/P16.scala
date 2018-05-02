package com.scalapractices.ninetynine_problems._01_lists

/**
  * (**) Drop every N'th element from a list
  * {{{
  *     dropEveryNth(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"), 3)
  * }}}
  */
object P16 {

  /*
  n is one based.
   */
  def dropEveryNth[T](list: List[T], n: Int): List[T] = list match {
    case _ :: _ if (n == 0) => list
    case x :: xs => list.take(n-1) ::: dropEveryNth(list.drop(n), n)
    case Nil => Nil
  }

  def dropEveryNth_2[T](list: List[T], n: Int): List[T] = {
    if (n == 0) list
    else {
      list.zipWithIndex.filter(t => ((t._2 + 1) % n != 0)).map(_._1)
    }
  }


  def dropEveryNth_recursive[T](list: List[T], n: Int): List[T] = {

    def go[T](list: List[T], count: Int): List[T] = list match {
      case _ :: _ if (count == 0) => list
      case x :: xs if (count > 1) => x +: go(xs, count - 1)
      case _ :: xs => go(xs, n)
      case Nil => Nil
    }
    go(list, n)
  }


}
