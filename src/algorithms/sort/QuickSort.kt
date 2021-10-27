package algorithms.sort

class QuickSort : Sort<Int> {
    override fun sort(list: List<Int>): List<Int> {
        if (list.size <= 1) return list

        val pillar = list.first()

        val right = list.filter { it > pillar }
        val left = list.filter { it < pillar }
        val mid = list.filter { it == pillar }

        return sort(left) + sort(mid) + sort(right)
    }
}