package euler

import org.scalatest.junit.JUnitSuite
import org.junit.Assert._
import org.junit.Test

class ProjectEulerTest extends JUnitSuite {

  @Test def problem1() {
    assertEquals(233168, Problem1.solve)
  }

  @Test def problem2() {
    assertEquals(4613732, Problem2.solve)
  }

  @Test def problem3() {
    assertEquals(6857, Problem3.solve)
  }

  @Test def problem5() {
    assertEquals(232792560, Problem5.solve)
  }

  @Test def problem6() {
    assertEquals(25164150, Problem6.solve)
  }

  @Test def problem7() {
    assertEquals(104743, Problem7.solve)
  }

}