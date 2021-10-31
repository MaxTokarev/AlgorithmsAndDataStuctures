package problems

import org.junit.Test
import kotlin.test.assertTrue

internal class ValidParenthesesTest {

    private val validator = ValidParentheses.Own()

    @Test
    fun `test valid simple parentheses`() {
        val actual = validator.isValid("()")
        val expected = true
        assertTrue { actual == expected }
    }

    @Test
    fun `test valid complex sequence of parentheses`() {
        val actual = validator.isValid("()[]{}[()()]")
        val expected = true
        assertTrue { actual == expected }
    }

    @Test
    fun `test not valid complex sequence of parentheses`() {
        val actual = validator.isValid("][()[]{}[()()]]]{")
        val expected = false
        assertTrue { actual == expected }
    }

    @Test
    fun `test valid complex of parentheses`() {
        val actual = validator.isValid("({([[[()]]])})")
        val expected = true
        assertTrue { actual == expected }
    }

    @Test
    fun `test not valid complex of parentheses`() {
        val actual = validator.isValid("({([[[(])]]])})")
        val expected = false
        assertTrue { actual == expected }
    }
}