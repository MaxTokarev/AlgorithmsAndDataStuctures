package problems

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class UsernameValidationTest {
    private val validator = UsernameValidation.Own()

    @Test
    fun `test not valid with 3 letters`() {
        val username = "all"
        val expected = false
        val actual = validator.isValid(username)
        assertTrue { expected == actual }
    }

    @Test
    fun `test not valid with first underscore`() {
        val username = "_allah"
        val expected = false
        val actual = validator.isValid(username)
        assertTrue { expected == actual }
    }

    @Test
    fun `test not valid with first digit`() {
        val username = "1_allah"
        val expected = false
        val actual = validator.isValid(username)
        assertTrue { expected == actual }
    }

    @Test
    fun `test not valid with last underscore`() {
        val username = "allah_"
        val expected = false
        val actual = validator.isValid(username)
        assertTrue { expected == actual }
    }

    @Test
    fun `test not valid with more 24 length`() {
        val username = "allah_allah_allah_allah_allah"
        val expected = false
        val actual = validator.isValid(username)
        assertTrue { expected == actual }
    }

    @Test
    fun `test valid`() {
        val username = "allah"
        val expected = true
        val actual = validator.isValid(username)
        assertTrue { expected == actual }
    }
}