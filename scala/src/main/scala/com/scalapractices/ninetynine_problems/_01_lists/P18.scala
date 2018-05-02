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

  def sliceR[T](list: List[T], start: Int, end: Int): List[T] = list match {
      case x :: xs if (start > 0) => sliceR(xs, start - 1, end - 1)
      case x :: xs if (end > 0) => x :: sliceR(xs, start, end - 1)
      case _ => Nil
    }
}
