package oops_1

import scala.collection.mutable.ListBuffer

class SquareQueue(list:ListBuffer[Int]) extends Queue {
  for( i <- list.indices) {   // Iterating the list
    list.update(i, list(i) * list(i))
  }
}
