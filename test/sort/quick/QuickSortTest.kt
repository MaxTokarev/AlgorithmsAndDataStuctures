package sort.quick

import algorithms.sort.QuickSort
import algorithms.sort.Sort
import org.junit.Test
import kotlin.test.assertTrue

class QuickSortTest {

    private val unSortedList = listOf(231, 321, 321312, 3241424, 54643, 3454, 1)
    private val sorter: Sort<Int> = QuickSort()

    @Test
    fun sort() {
        val expected = unSortedList.sorted()
        val actual = sorter.sort(unSortedList)

        assertTrue { expected == actual }
    }
}