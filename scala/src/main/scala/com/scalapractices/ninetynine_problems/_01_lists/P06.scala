package com.scalapractices.ninetynine_problems._01_lists

/**
  * Find out whether a list is a palindrome
  */
object P06 {

  def isPalindrome[T](list: List[T]): Boolean = list equals list.reverse

  def isPalindrome_reverseRecursive[T](list: List[T]): Boolean = list match {
    case _ :: Nil=> true
    case x :: xs if (x equals xs.last) => isPalindrome_reverseRecursive(xs.init)
    case _ => false
  }

}
