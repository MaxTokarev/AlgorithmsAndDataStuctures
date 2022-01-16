package problems

/**
 * problem - https://leetcode.com/problems/burst-balloons/
 */
interface BurstBalloons {
    fun burst(ballons: IntArray): Int

    class Solution : BurstBalloons {

        private val cache = mutableMapOf<List<Int>, Int>()

        override fun burst(ballons: IntArray): Int {
            return maxCoins(ballons.toList())
        }

        private fun maxCoins(list: List<Int>, prevValue: Int = 0): Int {
           return when {
               list.size == 1 -> list[0] + prevValue
               cache[list] != null -> cache.getOrDefault(list,0)
               else -> mutableListOf<Int>().apply {
                   for (i in list.indices) {
                       val mutableList = list.toMutableList().apply {
                           removeAt(i)
                       }
                       cache[list] = prevValue + list.getCoinsIn(i)
                       add(maxCoins(mutableList, prevValue + list.getCoinsIn(i)))
                   }
               }.maxOf { it }
           }
        }

        private inline fun <T, R : Comparable<R>> Iterable<T>.maxOf(selector: (T) -> R): R {
            val iterator = iterator()
            if (!iterator.hasNext()) throw NoSuchElementException()
            var maxValue = selector(iterator.next())
            while (iterator.hasNext()) {
                val v = selector(iterator.next())
                if (maxValue < v) {
                    maxValue = v
                }
            }
            return maxValue
        }

        private fun List<Int>.getCoinsIn(center: Int): Int {
            val startValue = getValueByIndexOrDefault(center - 1)
            val endValue = getValueByIndexOrDefault(center + 1)
            return startValue * get(center) * endValue
        }

        private fun List<Int>.getValueByIndexOrDefault(index: Int, defaultValue: Int = 1): Int =
            if (index in indices) get(index) else defaultValue
    }
}