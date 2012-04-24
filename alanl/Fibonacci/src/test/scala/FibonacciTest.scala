import org.scalatest.FunSuite
import org.scalatest.Tag

import scala.collection.mutable.Map

class FibonacciTest extends FunSuite {
 
  test("Test Fibonacci", Tag("fib")) {

    val num = 100

    println("Fibonacci of 0 to " + num + " interativly..")
    println(Fibonacci.iterative(num))
    println("Fibonacci of 0 to " + 20 + " using tree recursion")
    println(Fibonacci.treeRecursive(20))
    println("Fibonacci of 0 to " + num + " using tail recursion")
    println(Fibonacci.tailRecursive(num))
    println("Fibonacci of 0 to " + num + " using a lazy stream")
    Fibonacci.lazyStream(num).foreach(println)
  }
 
}
