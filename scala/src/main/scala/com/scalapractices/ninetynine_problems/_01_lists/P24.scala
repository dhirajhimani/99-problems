package com.scalapractices.ninetynine_problems._01_lists

import scala.util.Random

/**
  * (*) Lotto: Draw N different random numbers from the set 1..M
  */
object P24 {

  def randomSelect(n: Int, range: (Int, Int)): List[Int] = {
    n match {
      case 0 => Nil
      case _ => (Random.nextInt(range._2) + range._1) :: randomSelect(n-1, range)
    }
  }

}
