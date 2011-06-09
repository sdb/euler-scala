package object euler {

  trait Problem[T] {
    def solve(): T

    def main(args: Array[String]) {
      val begin = System.currentTimeMillis
      val result = solve()
      val end = System.currentTimeMillis

      println("Solution calculcated in %d milliseconds: %s" format (end - begin, result))
    }
  }
}