package com.scalapractices.ninetynine_problems._04_binary_trees

object DummyExample extends App {

  val tree = Node('a',
                  Node('b', Node('d'), Node('e')),
                  Node('c', End, Node('f', Node('g'), End)))

  val tree1 = Node('a',
                   Node('b', Node('d'), Node('e')),
                   Node('c', End, Node('f', Node('g'), End)))

  println(tree)

  Tree.prettyPrint(tree)

}
