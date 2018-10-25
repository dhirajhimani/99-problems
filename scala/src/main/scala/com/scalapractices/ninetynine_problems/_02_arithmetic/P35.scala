package com.scalapractices.ninetynine_problems._02_arithmetic

/**
  * (**) Goldbach's conjecture
  *
  * Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers.
  * Example: 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct
  * in the general case. It has been numerically confirmed up to very large numbers .
  * Write a predicate to find the two prime numbers that sum up to a given even integer.
  */
object P35 {

  def goldbach(number: Int): List[Int] = ???

  private def numbers(number: Int, primeNumbers: List[Int]): List[Int] = ???


  //  {
  //    val result = for (p <- primeNumbers if primeNumbers contains (number - p)) yield List(p, number - p)
  //    result.head
  //  }

  private def isOdd(n: Int): Boolean = ???
}
