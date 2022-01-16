package problems

import org.junit.Test
import kotlin.test.assertTrue

internal class BurstBalloonsTest {
    val solution = BurstBalloons.Solution()

    @Test
    fun `test simple one`() {
        val expected = 167
        val actual = solution.burst(intArrayOf(3, 1, 5, 8))
        println(actual)
        assertTrue { expected == actual }
    }

    @Test
    fun `test with 2 balloons`() {
        val expected = 10
        val actual = solution.burst(intArrayOf(1, 5))
        println(actual)
        assertTrue { expected == actual }
    }

    @Test
    fun `test with 1 balloons`() {
        val expected = 1
        val actual = solution.burst(intArrayOf(1))
        assertTrue { expected == actual }
    }

    @Test
    fun `test with big numbers`() {
        val expected = 116718
        val actual = solution.burst(intArrayOf(9, 76, 64, 21))
        println(actual)
        assertTrue { expected == actual }
    }
    @Test
    fun `test not time limit`() {
        val actual = solution.burst(intArrayOf(7,9,8,0,7,1,3,5,5,2,3,3,3,3,3,3,3,))
        println(actual)
        assertTrue {  true }
    }
}