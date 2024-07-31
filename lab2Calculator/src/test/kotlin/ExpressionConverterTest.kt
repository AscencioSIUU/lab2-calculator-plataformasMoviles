import org.example.ExpressionConverter
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ExpressionConverterTest {

    @Test
    fun infixToPostfix() {
        val expressionConverter = ExpressionConverter()

        val postfixTest = expressionConverter.infixToPostfix("3 - 4 * 9")
        val expected = mutableListOf<Char>('3', ' ', ' ', '4', ' ', ' ', '9', '*', '-')
        assertEquals(expected, postfixTest)

        val postfixTest2 = expressionConverter.infixToPostfix("(11 + 45) * 9 ^ 2 + (r 10)")
        val expected2 = mutableListOf<Char>('1', '1', ' ', ' ', '4', '5', '+', ' ', ' ', '9', ' ', ' ', '2', ' ', '^', '*', ' ', ' ', '1', '0', 'r', '+')
        assertEquals(expected2, postfixTest2)

        val postfixTest3 = expressionConverter.infixToPostfix("e ^ 2 + r 10 - 29 * 45 / (8 +99)")
        val expected3 = mutableListOf<Char>('e', ' ', ' ', '2', ' ', '^', ' ', ' ', '1', '0', ' ', 'r', '+', ' ', '2', '9', ' ', ' ', '4', '5', ' ', '*', ' ', '8', ' ', '9', '9', '+', '/', '-')
        assertEquals(expected3, postfixTest3)
    }
}