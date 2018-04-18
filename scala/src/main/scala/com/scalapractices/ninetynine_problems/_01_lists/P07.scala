package com.scalapractices.ninetynine_problems._01_lists

/**
  * <b>(**) Flatten a nested list structure</b>
  * <p>
  * Transform a list, possibly holding lists as elements into a 'flat' list by replacing each list with its elements (recursively).
  * </p>
  */
object P07 {

  def flatten(list: List[Any]): List[Any] = list match {
    case x :: y => {
      if (x.isInstanceOf[List[Any]]) {
        flatten(x.asInstanceOf[List[Any]]) ::: flatten(y)
      } else {
        x :: flatten(y)
      }
    }
    case Nil => List()
  }

  def flatten_flatMap(list: List[Any]): List[Any] = list flatten {
    case ls: List[_] => flatten_flatMap(ls)
    case x => List(x)
  }
}
