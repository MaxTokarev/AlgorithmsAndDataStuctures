package problems

import java.util.*

/**
 * Problem - https://leetcode.com/problems/valid-parentheses/
 */
interface ValidParentheses {
    fun isValid(s: String): Boolean

    class Own : ValidParentheses {
        private val parentheses = hashMapOf(')' to '(', ']' to '[', '}' to '{')

        override fun isValid(s: String): Boolean {
            val parenthesesStack = Stack<Char>()

            for (char in s) {
                val closeParentheses = parentheses[char]
                if (closeParentheses != null && closeParentheses == parenthesesStack.lastOrNull()) {
                    parenthesesStack.pop()
                } else {
                    parenthesesStack.add(char)
                }
            }
            return parenthesesStack.isEmpty()
        }
    }
}