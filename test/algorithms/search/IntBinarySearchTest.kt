package algorithms.search

import org.junit.jupiter.api.Test
import kotlin.math.exp
import kotlin.test.assertTrue

internal class IntBinarySearchTest {

    private val searcher: Search<Int> = IntBinarySearch()

    private val mockSortedItems = listOf(0, 1, 2, 3, 4, 5, 6, 7, 321, 333, 444, 1231, 1232, 1616)
    private val mockUnSortedItems = listOf(321, 432, 54, 6, 1, 542, 3, 324, 15, 1236, 444, 1231, 1616)

    @Test
    fun `search success`() {
        val pickedItem = 333

        val actual = searcher.search(mockSortedItems, pickedItem)
        val expected = SearchResult.Success(mockSortedItems.indexOf(pickedItem))

        assertTrue { actual == expected }
    }

    @Test
    fun `search not success`() {
        val pickedItem = 123

        val actual = searcher.search(mockSortedItems, pickedItem)
        val expected = SearchResult.NotFound()

        assertTrue { actual == expected }
    }

    @Test
    fun `search in unsorted list`() {
        val pickedItem = 321

        val actual = searcher.search(mockUnSortedItems, pickedItem)
        val expected = SearchResult.UnSortedList()

        assertTrue { actual == expected }
    }

    @Test
    fun `search empty`() {
        val pickedItem = 123

        val actual = searcher.search(emptyList(), pickedItem)
        val expected = SearchResult.Empty()

        assertTrue { actual == expected }
    }
}