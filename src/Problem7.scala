package euler

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p>
 * What is the 10001st prime number?
 *
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=7">Problem 7</a>
 */
object Problem7 extends Problem[Long] {
  def solve = {
    val primes = new collection.mutable.ListBuffer[Long]
    primes += 2

    def isPrime(i: Long): Boolean = {
      def sqrt(i: Long) = math.round(math.floor(math.sqrt(i)))
      for (p <- primes) {
        if (p <= sqrt(i)) {
          if (i % p == 0) return false
        } else return true
      }
      return true
    }

    var i = 3
    do {
      if (isPrime(i))
        primes += i
      i = i + 2
    } while (primes.size < 10001)
    i - 2
  }
}