package euler

/**
 * The sum of the squares of the first ten natural numbers is, 1² + 2² + ... + 10² = 385. The square of the sum of the
 * first ten natural numbers is, (1 + 2 + ... + 10)² = 55² = 3025. Hence the difference between the sum of the squares
 * of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the
 * sum.
 *
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=6">Problem 6</a>
 */
object Problem6 extends Problem[Int] {
  def solve = {
    def sumSquare(i: Int) = (0 /: (for(i <- 1 to i) yield i * i)) { (r, i) => r + i }
    def squareSum(i: Int) = {
      val sum = (0 /: (1 to i)) { (r, i) => r + i }
      sum * sum
    }
    squareSum(100) - sumSquare(100)
  }
}