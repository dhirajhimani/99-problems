package com.scalapractices.ninetynine_problems._01_lists

import scala.annotation.tailrec

/**
  * <b> (**) Run-length encoding of a list (direct solution).</b>
  *
  * {{{
  *   encode_direct([a,a,a,a,b,c,c,a,a,d,e,e,e,e]).
  * }}}
  */
object P13 {

  /**
    * Using dropWhile method and tail recursion
    */
  def encode_direct[T](list: List[T]): List[Any] = list match {
    case x :: xs => {
      val ls = list.takeWhile(_ == x)
      if (ls.size > 1) {
        (ls.size, ls.head) :: encode_direct(xs.dropWhile(_ == x))
      } else {
        ls.head :: encode_direct(xs.dropWhile(_ == x))
      }
    }
    case Nil => Nil
  }

  def encode_direct_span[T](list: List[T]): List[Any] = list match {
    case x :: xs => {
      val t = list.span(_ == x)
      (t._1.size, t._1.head) :: encode_direct_span(t._2)
    }
    case Nil => Nil
  }


}
