package euler

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143?
 *
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=3">Problem 3</a>
 */
object Problem3 extends Problem[Long] {
  def solve = {
    def sf(n: Long, f: Long): Long = if (n % f == 0) f else sf(n, f + 1)
    def lf(n: Long): Long = { val s = sf(n, 2); if (s == n) s else s.max(lf(n / s)) }
    lf(600851475143L)
  }
}