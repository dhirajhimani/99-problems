package com.scalapractices._01_lists

import scala.annotation.tailrec

/**
  * <b>(**) Eliminate consecutive duplicates of list elements</b>
  * <p>If a list contains repeated elements they should be replaced with a single copy of the element.
  * The order of the elements should not be changed.</p>
  * <p>
  * <pre>
  * compress(List(a,a,a,a,b,c,c,a,a,d,e,e,e,e))
  * [a,b,c,a,d,e]
  * </pre>
  */
object P08 {

  def compress[T >: Null <: Any](list: List[T]): List[T] = ???

  def compress_dropWhile[T](list: List[T]): List[T] = ???

  def compress_dropWhile_tailrec[T](list: List[T]): List[T] = ???

}
