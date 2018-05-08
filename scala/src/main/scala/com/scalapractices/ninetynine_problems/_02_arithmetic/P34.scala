package com.scalapractices.ninetynine_problems._02_arithmetic

import scala.annotation.tailrec

/**
  * (*) A list of prime numbers.
  */
object P34 {

  def primeNumbers(range: Range): List[Int] = {
    (for (
      i <- range if (P31.isPrime(i))
    ) yield i).toList
  }

  def primeNumbers_sieve(range: Range): List[Int] =  {
    val start = 2
    val numbers = start to range.last

    @tailrec
    def go (numbers: List[Int], result: List[Int]): List[Int] = numbers match {
      case n :: remaining => go(remaining.filter(_ % n != 0), n :: result)
      case _ => result
    }
    val pm = go(numbers.toList, List[Int]())
    pm.filter(_ >= range.head).reverse
  }

}
