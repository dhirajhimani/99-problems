package com.scalapractices.ninetynine_problems._04_binary_trees

import scala.collection.mutable.ListBuffer

sealed trait Tree[+T]

case class Node[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
  override def toString =
    "T(" + value.toString + " " + left.toString + " " + right.toString + ")"
}

case object End extends Tree[Nothing] {
  override def toString = "."
}

object Node {
  def apply[T](value: T): Node[T] = Node(value, End, End)
}

object Tree {

  def prettyPrint[T](root: Node[T]) = {
    val ml = maxLevel(root)

    printTree(List(root), 1, ml)
  }

  private def printTree[T](nodes: List[Tree[T]],
                           level: Int,
                           maxLevel: Int): Unit = {
    if (nodes.isEmpty || isAllElementsAreEnd(nodes)) return

    val floor = maxLevel - level
    val edgeLines = Math.pow(2, Math.max(floor - 1, 0)).toInt
    val firstSpaces = Math.pow(2, floor).toInt - 1
    val betweenSpaces = Math.pow(2, floor + 1).toInt - 1

    printWhitespaces(firstSpaces)

    val newNodes: ListBuffer[Tree[T]] = new ListBuffer()
    nodes.foreach(n =>
      n match {
        case End => {
          newNodes.append(End, End)
          print(" ")
          printWhitespaces(betweenSpaces)
        }
        case node: Node[T] => {
          print(node.value)
          newNodes.append(node.left, node.right)
          printWhitespaces(betweenSpaces)
        }
    })
    println("")

    for (i <- 1 to edgeLines) {
      for (j <- 0 until nodes.size) {
        printWhitespaces(firstSpaces - i)
        nodes(j) match {
          case End => printWhitespaces(edgeLines + edgeLines + i + 1)
          case node: Node[T] => {
            node.left match {
              case End => printWhitespaces(1)
              case _   => print("/")
            }

            printWhitespaces(i + i - 1)

            node.right match {
              case End => printWhitespaces(1)
              case _   => print("\\")
            }

            printWhitespaces(edgeLines + edgeLines - i)

          }
        }
      }
      println("")
    }
    printTree(newNodes.toList, level + 1, maxLevel)
  }

  private def printWhitespaces(count: Int) = {
    for (_ <- 0 until count) {
      print(" ")
    }
  }

  private def maxLevel[T](tree: Tree[T]): Int = {
    tree match {
      case End => 0
      case node: Node[T] =>
        Math.max(Tree.maxLevel[T](node.left), Tree.maxLevel(node.right)) + 1
    }
  }

  private def isAllElementsAreEnd[T](list: List[Tree[T]]): Boolean = {
    !list.exists(_.isInstanceOf[Node[T]])
  }

}
