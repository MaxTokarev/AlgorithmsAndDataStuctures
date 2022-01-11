package problems

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class SearchInsertPositionTest {
    private val searcher = SearchInsertPosition.Own()

    @Test
    fun `test target exist`() {
        test(target = 5, expected = 2)
    }

    @Test
    fun `test target not exist start`() {
        test(target = 0, expected = 0)
    }

    @Test
    fun `test target not exist end`() {
        test(target = 7, expected = 4)
    }

    @Test
    fun `test target not exist mid`() {
        test(target = 2, expected = 1)
    }

    @Test
    fun `test target last`() {
        test(target = 9, expected = 3, nums = intArrayOf(1, 3, 6, 9))
    }

    @Test
    fun `test target first`() {
        test(target = 1, expected = 0, nums = intArrayOf(1, 3, 6, 9))
    }

    @Test
    fun `test nums 2 items`() {
        test(target = 2, expected = 1, nums = intArrayOf(1, 3))
    }

    private fun test(target: Int, expected: Int, nums: IntArray = intArrayOf(1, 3, 5, 6)) {
        val actualPosition = searcher.search(nums, target)
        print("$actualPosition, $target, $expected, $nums")
        assertTrue { actualPosition == expected }
    }
}