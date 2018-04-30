package com.scalapractices.ninetynine_problems._01_lists

/**
  * <b>(**) Duplicate the elements of a list a given number of times.</b>
  *
  * {{{
  *   duplicateTimes(List("a", "b", "c"), 3)
  * }}}
  */
object P15 {

  /*
  Using flatMap and List.fill
   */
  def duplicateTimes[T](list: List[T], times: Int): List[T] = {
    list.flatMap(x => List.fill(times)(x))
  }


  /*
  Using recursion
   */
  def duplicateTimes_recursion[T](list: List[T], times: Int): List[T] = list match {
    case x :: xs => List.fill(times)(x) ++ duplicateTimes_recursion(xs ,times)
    case Nil => Nil
  }

  /*
  Using recursion, without List.fill
   */
  def duplicateTimes_recursion2[T](list: List[T], times: Int): List[T] = {

    def go(list: List[T], count: Int): List[T] = list match {
      case x :: xs => {
        if (count > 1) {
          x :: go(list, count - 1)
        } else {
          x :: go(xs, times)
        }
      }
      case Nil => Nil
    }
    go(list, times)
  }

}
