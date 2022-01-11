package problems

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class MergeTwoSortedListsSolutionTest {
    private val merger = MergeTwoSortedListsSolution.Own()

    @Test
    fun `test two equal nodes`() {
        val node1 = generateNodesSorted(1, 2, 3)
        val node2 = generateNodesSorted(1, 2, 3)
        val expected = merger.mergeTwoLists(node1, node2)
        val actual = generateNodesSorted(1, 1, 2, 2, 3, 3)
        assertTrue { expected == actual }
    }

    @Test
    fun `test empty nodes`() {
        val emptyNode = generateNodesSorted()
        val expected = merger.mergeTwoLists(emptyNode, emptyNode)
        assertTrue { expected == emptyNode }
    }

    @Test
    fun `test one empty node`() {
        val node1 = generateNodesSorted(1,14)
        val node2 = generateNodesSorted()
        val actual = merger.mergeTwoLists(node1, node2)
        assertTrue { actual == node1 }
    }

    private fun generateNodesSorted(vararg values: Int) =
        MergeTwoSortedListsSolution.generateNodes(*values.sorted().toIntArray())
}