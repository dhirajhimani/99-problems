package com.scalapractices.ninetynine_problems._01_lists

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

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

  def compress[T >: Null <: Any](list: List[T]): List[T] = {
    def compress_rec(input: List[T], result: List[T], lastElem: T): List[T] = {
      input match {
        case x :: xs if (x != lastElem) => compress_rec(xs, result :+ x, x)
        case x ::xs => compress_rec(xs, result, x)
        case Nil => result
      }
    }
    compress_rec(list, List(), null)
  }

  def compress_Buffer[T >: Null <: Any](list: List[T]): List[T] = {
    val listBuf = ListBuffer[T]()
    listBuf += list(0)
    list.foreach(x => {
      if(!(x equals listBuf.last)) {
        listBuf += x
      }
    })
    listBuf.toList
  }

  def compress_foldRight[T](list: List[T]): List[T] = {
    list.foldRight(List[T]())((x, acc) => if (acc.isEmpty || acc.head != x) x :: acc else acc)
  }

  def compress_dropWhile[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case x :: xs => x :: compress_dropWhile(list.dropWhile(y => y == x))
  }

  def compress_dropWhile_tailrec[T](list: List[T]): List[T] = {
    @tailrec
    def compressR(input: List[T], result: List[T]): List[T] = input match {
      case Nil => result
      case x :: xs => compressR(xs.dropWhile(e => e == x), result :+ x)
    }
    compressR(list, List())
  }

}
