package problems

import org.junit.Test
import java.util.*
import kotlin.test.assertTrue

internal class RemoveElementTest {

    val remover = RemoveElement.Own()

    @Test
    fun `test simple`() {
        val nums = intArrayOf(3, 2, 2, 3)
        val valueToRemove = 2
        val expectedNums = intArrayOf(3,3)

        val actualLength = remover.removeElement(nums, valueToRemove)

        assertTrue { actualLength == expectedNums.size }
        Arrays.sort(nums, 0, actualLength)
        for (i in 0 until actualLength) {
            assertTrue { nums[i] == expectedNums[i] }
        }
    }
}