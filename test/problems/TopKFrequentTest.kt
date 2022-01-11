package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TopKFrequentTest {
    private val topKFrequent = TopKFrequent.OwnRealization()

    @Test
    fun `test simple`() {
        val actual = topKFrequent.topKFrequent(intArrayOf(1,2,2,2,3,3,3), 2)
        val expected = intArrayOf(2,3)
        assertTrue { actual.contentEquals(expected) }
    }
}