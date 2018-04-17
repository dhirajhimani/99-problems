package com.scalapractices.ninetynine_problems._01_lists

object P02 {

  def secondLast[T](list: List[T]): T = list match {
    case x :: (_ :: Nil) => x
    case _ :: xs => secondLast1(xs)
    case _ => exception
  }

  def secondLast1[T](list: List[T]): T = if (list.isEmpty || list.init.isEmpty) exception else list.init.last

  def exception = throw new NoSuchElementException("Can't find secondLast element from a list with less than 2 elements")
}
