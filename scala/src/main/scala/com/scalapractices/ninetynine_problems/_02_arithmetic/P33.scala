package com.scalapractices.ninetynine_problems._02_arithmetic

import com.shekhargulati.ninetynine_problems._01_lists.P10

import scala.collection.mutable

/**
  * (**) Determine the prime factors of a given positive integer (2)
  */
object P33 {

  def primeFactorsMult(number: Int): List[(Int, Int)] = {
    val primeFactors = P32.primeFactors(number)
    var map = mutable.HashMap[Int, Int]()
    primeFactors.foreach(pf =>
    {
      map += pf -> (map.getOrElse(pf, 0) + 1)
    })
    map.toList
  }
}
