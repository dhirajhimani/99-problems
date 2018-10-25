package com.scalapractices._01_lists

import scala.annotation.tailrec

/**
  * <b>(**) Pack consecutive duplicates of list elements into sublists</b>
  * <p>If a list contains repeated elements they should be placed in separate sublists.</p>
  *
  * <pre>
  * pack(Arrays.asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
  * [["a","a","a","a"],["b"],["c","c"],["a","a"],["d"],["e","e","e","e"]]
  * </pre>
  */
object P09 {

  /*
  Using dropWhile and takeWhile
   */
  def pack[T](list: List[T]): List[List[T]] = ???
  /*
  tailrec implementation of the above code
   */
  def pack_tailrecursive[T](list: List[T]): List[List[T]] = ???

  /*
  Using in-built function span
   */
  def pack_span[T](list: List[T]): List[List[T]] = ???

  /*
  Using in-built function span tail rec
   */
  def pack_span_tailrec[T](list: List[T]): List[List[T]] = ???

}
