package problems

/**
 * Problem - https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
interface RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int

    class Own : RemoveDuplicatesFromSortedArray {
        override fun removeDuplicates(nums: IntArray): Int {
            var temp = 0
            for (i in nums.indices){
                if(nums[i]!= nums[temp]) {
                    temp ++
                    nums[temp] = nums[i]
                }
            }
            return ++temp
        }
    }
}