package problems

/**
 * problem - https://leetcode.com/problems/search-insert-position/
 */
interface SearchInsertPosition {
    fun search(nums: IntArray, target: Int): Int

    class Own : SearchInsertPosition {
        /**
         * Just binary search
         * @see [algorithms.search.IntBinarySearch]
         */
        override fun search(nums: IntArray, target: Int): Int {
            fun min(lowest: Int, highest: Int) = (lowest + highest) / 2
            var lowest = 0
            var highest = nums.size - 1

            while (lowest <= highest) {
                val mid = min(lowest, highest)
                val guess = nums[mid]
                when {
                    guess == target -> return mid
                    guess > target -> highest = mid - 1
                    guess < target -> lowest = mid + 1
                }
            }

            return lowest
        }
    }
}