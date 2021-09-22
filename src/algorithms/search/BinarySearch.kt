package algorithms.search

class IntBinarySearch : Search<Int> {
    /**
     * Search int in sorted list
     * @param items list of sorted int
     * @param item age in list
     */
    override fun search(items: List<Int>, item: Int): SearchResult {
        when {
            items.isEmpty() -> return SearchResult.Empty()
            !items.asSequence().zipWithNext { a, b -> a <= b }.all { it } -> return SearchResult.UnSortedList()
        }

        var lowest = 0
        var highest = items.size - 1

        while (lowest <= highest) {
            val mid = lowest + highest
            val guess = items[mid]
            when {
                item == guess -> return SearchResult.Success(mid)
                guess > item -> highest = mid - 1
                else -> lowest = mid + 1
            }
        }
        return SearchResult.NotFound()
    }
}