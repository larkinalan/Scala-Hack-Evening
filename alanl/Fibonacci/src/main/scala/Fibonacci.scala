object Fibonacci extends App {

  def iterative(num: Int): BigInt = {
    var a: BigInt = 0
    var b: BigInt = 1
    var c: BigInt = 0

    for (_ <- 1 to num) {
      c = a + b
      a = b
      b = c
      println(c)
    }

    return a
  }

  def treeRecursive(num: Int): Int= {
    num match {
      case 0 => 0
      case 1 => 1
      case _ => treeRecursive(num-1) + treeRecursive(num-2)
    }
  }

  def tailRecursive(num: Int): Int = tailRecursive(num, 1, 0)

  private def tailRecursive(num: Int, nxt: Int, res: Int): Int = {
    num match {
      case 0 => res
      case _ => tailRecursive(num-1, nxt+res, nxt)
    }
  }

  def lazyStream(num: Int): Stream[Int] = {
    val stream: Stream[Int] = lazyStream(0, num)
    stream.take(num)
  }

  def lazyStream(a: Int, b: Int): Stream[Int] = {
    a #:: lazyStream(b, a + b)
  }

}
