package problems

/**
 * Problem - https://leetcode.com/problems/longest-common-prefix/
 * Own solution
 */
class LongestCommonPrefix {
    fun execute(strings: Array<String>): String {
        if (strings.size == 1) {
            return strings.first()
        }
        var prefix = ""

        var currentChar: Char? = null
        var currentCharIndex = 0
        var index = 0
        var isCurrentCharCommon = false

        while (true) {
            if (currentCharIndex == strings[index].length) return prefix
            val char = strings[index][currentCharIndex]
            when (currentChar) {
                null -> currentChar = char
                char -> isCurrentCharCommon = true
                else -> return prefix
            }
            if (++index == strings.size) {
                if (isCurrentCharCommon) {
                    prefix += currentChar
                }
                index = 0
                isCurrentCharCommon = false
                currentCharIndex++
                currentChar = null
            }
        }
    }
}

fun main() {
    println(LongestCommonPrefix().execute(arrayOf("flower", "float", "flo")))
}