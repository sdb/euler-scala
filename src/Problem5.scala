package euler

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=5">Problem 5</a>
 */
object Problem5 extends Problem[Int] {
  def solve = {
    def divisible(n: Int, d: Int = 20): Boolean = { if (d == 1) true else if (n % d > 0) false else divisible(n, d - 1) }
    def find(n: Int): Int = { if (divisible(n)) n else find(n + 1) }
    find(20)
  }
}