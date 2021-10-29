package problems

import org.junit.Test
import kotlin.test.assertTrue

internal class LongestCommonPrefixTest {

    @Test
    fun `have common prefix`() {
        val strings = arrayOf("flower", "flow", "flight")
        val expected = "fl"
        val actual = LongestCommonPrefix().execute(strings)
        assertTrue { expected == actual }
    }

    @Test
    fun `no common prefix`(){
        val string = arrayOf("dog","racecar","car")
        val expected = ""
        val actual = LongestCommonPrefix().execute(string)
        assertTrue { expected == actual }
    }
}