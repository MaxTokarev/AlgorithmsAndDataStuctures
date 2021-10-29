package problems

import org.junit.Test
import kotlin.test.assertTrue

internal class ConvertRomanToIntTest {

    private val converter = ConvertRomanToInt()

    @Test
    fun `test simple roman number`() {
        val roman = "III"
        val expected = 3
        val actual = converter.romanToInt(roman)
        assertTrue { expected == actual }
    }

    @Test
    fun `test common roman number`() {
        val roman = "MCMXCIV"
        val expected = 1994
        val actual = converter.romanToInt(roman)
        assertTrue { expected == actual }
    }
}