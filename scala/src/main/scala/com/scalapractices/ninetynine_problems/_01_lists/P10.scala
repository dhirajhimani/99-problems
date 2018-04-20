package com.scalapractices.ninetynine_problems._01_lists

/**
  * <b> (*) Run-length encoding of a list.</b>
  * {{{
  *   encode(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
  * }}}
  */
object P10 {

  def encode[T](list: List[T]): List[(Int, T)] = {
    val lls :List[List[T]] = P09.pack(list)
    lls.map(ls => (ls.size, ls.head))
  }
}
