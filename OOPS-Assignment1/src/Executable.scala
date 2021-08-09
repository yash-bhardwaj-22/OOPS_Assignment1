package oops_1
import scala.collection.mutable.ListBuffer
object Executable extends App{

  val list = ListBuffer(5, 3, 1, 4, 6, 10)
  println("Originally the Queue is: ")
  for( i <- list.indices) print(list(i)+" ")

  var doubledList = new DoubleQueue(list)  //Doubled the elements in the queue.
  println("\nAfter doubling the elements in the Queue: ")
  for( i <- list.indices) print(list(i)+" ")

  var squareQueue = new SquareQueue(list)   //Squaring the elements in queue.
  println("\nAfter squaring the elements in the Queue: ")
  for( i <- list.indices) print(list(i)+" ")

  squareQueue.dequeue(list)
  println("\nAfter dequeue a element in Queue: ")
  for( i <- list.indices) print(list(i)+" ")
  squareQueue.enqueue(list)
  println("\nAfter a element is enqueued: ")
  for( i <- list.indices) print(list(i)+" ")
}
