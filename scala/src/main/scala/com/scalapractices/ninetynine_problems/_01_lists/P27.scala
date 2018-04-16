package com.scalapractices.ninetynine_problems._01_lists

import scala.annotation.tailrec

/**
  * (**) Group the elements of a set into disjoint subsets
  */
object P27 {

  /**
    * In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons?
    * Write a predicate that generates all the possibilities via backtracking.
    *
    */
  def group3[T](list: List[T]): List[(List[T], List[T], List[T])] = ???

  def group3_1[T](list: List[T]): List[(List[T], List[T], List[T])] = ???


  /**
    * Generalize the above predicate in a way that we can specify a list of group sizes and the predicate will return a list of groups.
    */
  def group[T](list: List[T], groupSizes: List[Int]): List[List[T]] = ???

  def group_1[T](list: List[T], groupSizes: List[Int]): List[List[T]] = ???
}
