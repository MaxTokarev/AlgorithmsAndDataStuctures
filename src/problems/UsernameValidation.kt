package problems

/**
 * Problem - takes username and validate according to the following rules:
 * 1. The username is between 4 and 25 characters.
 * 2. It must start with a letter.
 * 3. It can only contain letters, numbers, and the underscore character.*
 * 4. It cannot end with an underscore character.
 *
 * Examples:
 *  Input: "aa_"
 *  Output: false
 *
 *  Input: "u__hello_world123"
 *   Output: true
 */
interface UsernameValidation {
    fun isValid(name: String): Boolean

    class Own : UsernameValidation {
        override fun isValid(name: String): Boolean {
            return name.length in 5..24
                    && name.contains("^[A-za-z0-9_-]".toRegex())
                    && name.first().isLetter()
                    && !name.endsWith("_")
        }
    }
}