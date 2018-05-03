package com.scalapractices.ninetynine_problems._01_lists

import scala.annotation.tailrec

/**
  * (*) Create a list containing all integers within a given range
  */
object P22 {

  def range(start: Int, end: Int): List[Int] = (start to end).toList

  def rangeR(start: Int, end: Int): List[Int] = {
    def go (list: List[Int], start: Int, end: Int, by: Int): List[Int] = {
      (start, end) match {
        case (s,e) if e > 0 => go((list.head + by) :: list, s , e - by, by)
        case _ => list
      }
    }
    go(List(start), start, end - start, 1).reverse
  }

}
