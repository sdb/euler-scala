package euler

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
 * multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=1">Problem 1</a>
 */
object Problem1 extends Problem[Int] {
  def solve = (0 /: (for(i <- 1 to 999 if (i%3 == 0 || i%5 == 0)) yield i)) { (sum, i) => i + sum }
}