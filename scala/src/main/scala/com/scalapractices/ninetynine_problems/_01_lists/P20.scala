package com.scalapractices.ninetynine_problems._01_lists

/**
  * (*) Remove the K'th element from a list
  */
object P20 {

  /*
  Using built in take drop
   */
  def removeAt[T](list: List[T], k: Int): (List[T], T) = {
    val removedEle = list.take(k).last
    (list.take(k-1) ++ list.drop(k), removedEle)
  }

  def removeAt0[T](list: List[T], k: Int): (List[T], T) = {
    def go(list: List[T], k: Int): List[T] = list match {
      case x :: xs if(k !=0) => x :: go(xs, k -1)
      case x :: xs => xs
      case Nil => Nil
    }
    (go(list, k), list(k))
  }

  /*
  Using splitAt
   */
  def removeAt_splitAt[T](list: List[T], k: Int): (List[T], T) = {
    val (start, end) = list.splitAt(k)
    (start.init ::: end, start.last)
  }
}
