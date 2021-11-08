package problems

interface RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int

    class Own : RemoveElement {
        override fun removeElement(nums: IntArray, `val`: Int): Int {
            var temp = 0
            for (i in nums.indices) {
                if (nums[i] != `val`) {
                    nums[temp] = nums[i]
                    temp++
                }
            }
            return temp
        }
    }
}