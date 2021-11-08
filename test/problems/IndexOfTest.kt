package problems

import org.junit.Test
import kotlin.test.assertTrue

internal class IndexOfTest {
    private val indexer = IndexOf.Own()

    @Test
    fun `test simple`() {
        val (haystack, needle) = "hello" to "ll"
        test(haystack, needle)
    }

    @Test
    fun `test simple a`() {
        val (haystack, needle) = "hello" to "lo"
        test(haystack, needle)
    }

    @Test
    fun `test empty needle`(){
        val (haystack, needle) = "hello" to ""
        test(haystack, needle)
    }

    @Test
    fun `test haystack and needle empty`() {
        val (haystack, needle) = "" to ""
        test(haystack, needle)
    }

    @Test
    fun `test haystack empty`() {
        val (haystack, needle) = "" to ""
        test(haystack, needle)
    }

    @Test
    fun `test not found needle`() {
        val (haystack, needle) = "aaaaaasdf" to "aabb"
        test(haystack, needle)
    }

    @Test
    fun `test not found long`() {
        val (haystack, needle) = "mississippi" to "a"
        test(haystack, needle)
    }

    private fun test(haystack: String, needle: String){
        val expected = haystack.indexOf(needle)
        val actual = indexer.strStr(haystack, needle)

        assertTrue { expected == actual }
    }
}