package problems

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class RemoveDuplicatesFromSortedArrayTest {
    private val remover = RemoveDuplicatesFromSortedArray.Own()

    @Test
    fun `test remove 1 element`() {
        val data = intArrayOf(1, 1, 2)
        val actual = remover.removeDuplicates(data)
        val expected = 2
        val expectedData = intArrayOf(1, 2)
        for (i in expectedData.indices) {
            assertTrue { data[i] == expectedData[i] }
        }
        assertTrue { actual == expected }
    }

    @Test
    fun `test remove none elements`() {
        val data = intArrayOf(1, 2)
        val actual = remover.removeDuplicates(data)
        val expected = 2
        assertTrue { actual == expected }
    }

    @Test
    fun `test remove some elements`() {
        val data = intArrayOf(0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4)
        val actual = remover.removeDuplicates(data)
        val expected = 5
        assertTrue { actual == expected }
    }
}