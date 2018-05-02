package com.scalapractices.ninetynine_problems._01_lists

import scala.annotation.tailrec

/**
  * <b>(**) Extract a slice from a list</b>
  */
object P18 {

  def slice[T](list: List[T], start: Int, end: Int): List[T] = {
    list.slice(start, end)
  }

  def sliceUsingDropAndTake[T](list: List[T], start: Int, end: Int): List[T] = {
    list.drop(start).take(end - start)
  }

  def sliceR[T](list: List[T], start: Int, end: Int): List[T] = {
    def go(list: List[T], start: Int, end: Int): List[T] = list match {
      case x :: xs if (start > 0) => go(xs, start - 1, end)
      case x :: xs if (end > 0) => x :: go(xs, start, end - 1)
      case _ => Nil
    }
    go(list, start, end - start)
  }

}
