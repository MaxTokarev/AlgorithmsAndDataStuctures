package problems

/**
 * Problem - https://leetcode.com/problems/roman-to-integer/
 */
class ConvertRomanToInt {
    private val romansWithInts = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    fun romanToInt(s: String): Int {
        var acc = 0
        var i = 0
        while (i in s.toCharArray().indices) {
            val current = romansWithInts[s[i]] ?: break
            val next = if (i != s.length - 1) romansWithInts[s[i + 1]] else null

            if (next != null && current < next) {
                acc += next - current
                i += 2
            } else {
                acc += current
                i++
            }
        }
        return acc
    }
}