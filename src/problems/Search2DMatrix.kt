package problems

/**
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
interface Search2DMatrix {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean

    class Base : Search2DMatrix {
        override fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
            var result = false
            for (innerArray in matrix) {
                if (innerArray.last() >= target) {
                    for (num in innerArray) {
                        if (num == target) {
                            result = true
                        }
                    }
                }
            }
            return result
        }
    }
}