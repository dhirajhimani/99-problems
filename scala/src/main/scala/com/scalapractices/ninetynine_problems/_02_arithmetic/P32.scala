package com.scalapractices.ninetynine_problems._02_arithmetic

import scala.collection.mutable

/**
  * (**) Determine the prime factors of a given positive integer.
  */
object P32 {

  def primeFactors(number: Int): List[Int] = ???

  def gcd(a: Int, b: Int):Int = {
    if(a == 0) b
    else gcd(b % a, a)
  }
}
