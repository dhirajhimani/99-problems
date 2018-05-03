package com.scalapractices.ninetynine_problems._01_lists

import scala.annotation.tailrec
import scala.collection.mutable

/**
  * (*) Insert an element at a given position into a list
  */
object P21 {

  def insertAt[T](list: List[T], pos: Int, t: T): List[T] = {
    list.take(pos-1) ++ (t :: list.drop((pos-1)))
  }

  def insertAt_inbuilt[T](list: List[T], pos: Int, t: T): List[T] = {
    if(pos < 1) {
      throw new NoSuchElementException("pos less than 1")
    }
    val lsBuffer: mutable.Buffer[T] = list.toBuffer
    lsBuffer.insert(pos - 1, t)
    lsBuffer.toList
  }

  def insertAt_recursion[T](list: List[T], pos: Int, t: T): List[T] = list match {
    case x :: xs if (pos > 1) => x :: insertAt_recursion(xs , pos-1, t)
    case _ if(pos == 1) => t :: list
  }

}
