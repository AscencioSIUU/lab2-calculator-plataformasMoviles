import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OperatorsTest {

    @Test
    fun testAddition() {
        val result = Operators.evaluate("(1 + 2) + (3 + 4)")
        assertEquals(10.0, result)
    }

    @Test
    fun testSubtraction() {
        val result = Operators.evaluate("(10 - 2) - (3 - 1)")
        assertEquals(6.0, result)
    }

    @Test
    fun testMultiplication() {
        val result = Operators.evaluate("(2 * 3) * (4 * 5)")
        assertEquals(120.0, result)
    }

    @Test
    fun testExactDivision() {
        val result = Operators.evaluate("(100 / 2) / (25 / 5)")
        assertEquals(10.0, result)
    }

    @Test
    fun testPower() {
        val result = Operators.evaluate("(2 ^ 3) ^ 2")
        assertEquals(64.0, result)
    }

    @Test
    fun testRoot() {
        val result = Operators.evaluate("sqrt(16)")
        assertEquals(4.0, result)
    }

    @Test
    fun testExponential() {
        val result = Operators.evaluate("exp(1)")
        assertEquals(Math.E, result, 0.0001)
    }

    @Test
    fun testComplexExpression() {
        val result = Operators.evaluate("(454 + (34 / 2) ^ 3) + 5")
        assertEquals(15821.0, result)
    }

    @Test
    fun testSyntaxError() {
        try {
            Operators.evaluate("(1 + 2))")
        } catch (e: Exception) {
            assertEquals("Syntax Error", e.message)
        }
    }
}
