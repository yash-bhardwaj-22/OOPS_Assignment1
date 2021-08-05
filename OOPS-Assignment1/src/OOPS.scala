import scala.collection.mutable.ListBuffer
trait Queue{
  def dequeue( list: ListBuffer[Int]){

    list.remove(0)
  }
  def enqueue(list: ListBuffer[Int]){
    var num=100
    list.addOne(num)
  }
}
class DoubleQueue( l:ListBuffer[Int]) extends Queue{

  for( i <-0 to l.length-1){
    l.update(i,2*l(i))

  }


}
class SquareQueue(l:ListBuffer[Int]) extends Queue{
  for( i <-0 to l.length-1) { // Iterating the list
    l.update(i, l(i) * l(i))
  }

}

object OOPS{
  def main(args:Array[String]){

    val list = ListBuffer(1, 8, 5, 6, 9, 58, 23, 15, 4)
    println(list)
    var s= new DoubleQueue(list)

    s.dequeue(list)
    println(list)
    s.enqueue(list)
    println(list)

    var w=new SquareQueue(list)
    println(list)

  }
}