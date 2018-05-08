package com.scalapractices.ninetynine_problems._02_arithmetic

/**
  * (**) Determine the greatest common divisor of two positive integer numbers.
  */
object P37 {

  def gcd(first: Int, second: Int): Int = {
    if (first == 0) second
    else gcd(second % first, first)
  }
}
