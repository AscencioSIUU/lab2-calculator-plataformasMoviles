import org.example.PostfixCalculator
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PostfixCalculatorTest {

    @Test
    fun calculate() {

        val calculator = PostfixCalculator()

        val list = mutableListOf<String>("3", "4", "9", "*", "-")
        assertEquals(-33, calculator.calculate(list))

        val list2 = mutableListOf<String>("11", "45", "+", "9", "2", "^", "*", "100", "r", "+")
        assertEquals(4546, calculator.calculate(list2))

        val list3 = mutableListOf<String>("e", "0", "^", "100", "r", "+", "29", "45", "*", "4", "1", "+", "/", "-")
        assertEquals(-250, calculator.calculate(list3))

    }
}