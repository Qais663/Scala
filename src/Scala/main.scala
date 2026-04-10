sealed trait Tree
case class Node(value:Int, left:Tree,right:Tree) extends Tree
case object Empty extends Tree

object main extends App {
  println("Hellow")
}