package com.scalapractices.ninetynine_problems._01_lists

import scala.util.Random

/**
  * (**) Extract a given number of randomly selected elements from a list
  */
object P23 {

  /*
  Easy solution by generating a random sequence of numbers.
  This solution may not be ideal as this can produce duplicates
   */
  def randomSelect[T](list: List[T], n: Int): List[T] = {
    val ls = List.fill(n)(Random.nextInt(list.size))
    ls.map(list(_))
  }

  def randomSelectR[T](list: List[T], n: Int): List[T] = n match {
    case 0 => Nil
    case _ => list(Random.nextInt(list.size)) :: randomSelect(list, n-1)
  }

}
