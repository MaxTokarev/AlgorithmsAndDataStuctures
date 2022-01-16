package problems.yandex

import problems.common.ListNode
import java.util.concurrent.atomic.AtomicInteger


/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
interface LinkedListCycle {
    fun hasCycle(head: ListNode?): Boolean

    class Own : LinkedListCycle {
        override fun hasCycle(head: ListNode?): Boolean {
            var slow = head
            var fast = head

            while (fast?.next != null) {
                slow = slow?.next
                fast = fast.next?.next
                if (slow == fast) break
            }
            if (fast?.next == null) return false
            slow = head
            while (slow != fast) {
                slow = slow?.next
                fast = fast?.next
            }
            return true
        }
    }
}