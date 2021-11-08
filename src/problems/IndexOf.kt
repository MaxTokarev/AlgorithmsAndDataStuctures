package problems

interface IndexOf {
    // strStr - synonym of indexOf in java
    fun strStr(haystack: String, needle: String): Int

    class Own : IndexOf {
        override fun strStr(haystack: String, needle: String): Int {
            if (needle.isEmpty()) return 0
            if (needle.length > haystack.length) return -1

            for (i in 0..haystack.length) {
                if (i + needle.length <= haystack.length) {
                    if (haystack.substring(i, i + needle.length) == needle) {
                        return i
                    }
                }
            }

            return -1
        }
    }
}