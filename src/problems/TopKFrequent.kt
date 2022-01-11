package problems

interface TopKFrequent {
    fun topKFrequent(nums: IntArray, k: Int): IntArray

    class OwnRealization : TopKFrequent {
        override fun topKFrequent(nums: IntArray, k: Int): IntArray = nums.asIterable()
            .groupingBy { it }
            .eachCount()
            .toList()
            .sortedByDescending { (_, value) -> value }
            .take(k)
            .toMap()
            .map { it.key }
            .toIntArray()
    }
}