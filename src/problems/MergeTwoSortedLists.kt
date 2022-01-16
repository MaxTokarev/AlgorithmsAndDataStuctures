package problems

import problems.common.ListNode

/**
 * Problem - https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
interface MergeTwoSortedListsSolution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode?

    class Own : MergeTwoSortedListsSolution {
        override fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
            return when {
                l1 == null && l2 == null -> null
                l1 == null && l2 != null -> l2
                l1 != null && l2 == null -> l1
                l1!!.`val` < l2!!.`val` -> ListNode(l1.`val`).apply {
                    next = mergeTwoLists(l1.next, l2)
                }
                else -> ListNode(l2.`val`).apply {
                    next = mergeTwoLists(l1, l2.next)
                }
            }
        }
    }

    companion object {
        /** For tests */
        fun generateNodes(vararg values: Int): ListNode? {
            fun IntArray.remove(index: Int): IntArray {
                return if (index < 0 || index >= size) this
                else indices.filter { it != index }
                    .map { get(it) }
                    .toIntArray()
            }
            return when {
                values.isEmpty() -> null
                else -> {
                    ListNode(values.first()).apply {
                        next = generateNodes(*values.remove(0))
                    }
                }
            }
        }
    }
}