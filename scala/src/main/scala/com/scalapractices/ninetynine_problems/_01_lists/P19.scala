package com.scalapractices.ninetynine_problems._01_lists

import scala.annotation.tailrec

/**
  * (**) Rotate a list N places to the left
  */
object P19 {

  /*
  Using split function defined in P17
   */
  def rotate[T](list: List[T], n: Int): List[T] = {
    val count = makeNPositive(list, n)
    val ls = list.splitAt(count)
    ls._2 ::: ls._1
  }

  def rotateUsingDropTake[T](list: List[T], n: Int): List[T] = {
    val count = makeNPositive(list, n)
    list.drop(count) ::: list.take(count)
  }
  /*
    Using recursion
     */
  def rotateR[T](list: List[T], n: Int): List[T] = {
    def go(list: List[T], count: Int): List[T] = {
      list match {
        case x :: xs if (count > 0) => go(xs :+ x, count - 1)
        case _ => list
      }
    }
    go(list, makeNPositive(list, n))

  }

  private def makeNPositive[T](list: List[T], n: Int): Int = if (n > 0) n else list.size + n


}
