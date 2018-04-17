package com.scalapractices.ninetynine_problems._01_lists

import scala.annotation.tailrec

/**
  * Reverse a list
  */
object P05 {

  def reverse[T](list: List[T]): List[T] = list.reverse

  def reverse2[T](list: List[T]): List[T] = list.foldLeft(List[T]())((x,y) => y :: x)

  def reverseRecursive[T](list: List[T]): List[T] = {
    @tailrec
    def go(list: List[T], acc: List[T]): List[T] = list match {
      case Nil => acc
      case x :: xs => go(xs, x :: acc)
    }
    go(list, List())
  }

}
