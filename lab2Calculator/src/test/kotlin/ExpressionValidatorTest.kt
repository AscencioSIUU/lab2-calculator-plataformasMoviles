import org.example.ExpressionValidator
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ExpressionValidatorTest {

    @Test
    fun validateCharacters() {
        val validator = ExpressionValidator()
        assertTrue(validator.validateCharacters("( 1 + 3) + 1 + e^-10 - r10"))
        assertFalse(validator.validateCharacters("1 + 2 + 3 + a"))
        assertFalse(validator.validateCharacters("(1 & 3"))
        assertFalse(validator.validateCharacters("(1 - 4) * 5 + ?"))
    }

    @Test
    fun validateParenthesis() {
        val validator = ExpressionValidator()
        assertTrue(validator.validateParenthesis("( 1 + 3) +1"))
        assertFalse(validator.validateParenthesis("1 + 3) +1"))
        assertFalse(validator.validateParenthesis("(1 + 3 +1"))
        assertFalse(validator.validateParenthesis("(((1 + 3 +1))"))
    }
}