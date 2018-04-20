package com.scalapractices.ninetynine_problems._01_lists

import scala.annotation.tailrec

/**
  * <b> (**) Decode a run-length encoded list.</b>
  * {{{
  *   decode(List((4, "a"), "b", (2, "c"), (2, "a"), "d", (4, "e")))
  * }}}
  */
object P12 {

  def decode[T](encoded: List[Any]): List[T] = {
    encoded match {
      case (i:Int ,ch:T):: xs => List.fill(i)(ch) ++ decode(xs)
      case (ch:T) :: xs => ch :: decode(xs)
      case Nil => Nil
    }
  }

}
