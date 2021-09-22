package algorithms.search

interface Search<T> {
    fun search(items: List<T>, item: T): SearchResult
}

interface SearchResult {
    val position: Int

    data class Success(override val position: Int) : SearchResult
    data class NotFound(override val position: Int = -1) : SearchResult
    data class UnSortedList(override val position: Int = -1) : SearchResult
    data class Empty(override val position: Int = -1) : SearchResult
}