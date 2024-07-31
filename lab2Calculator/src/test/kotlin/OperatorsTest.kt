package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OperatorsTest {

    @Test
    fun testAddition() {
        val result = Plus(1, 2)
        assertEquals(3, result)
        val result2 = Plus(5, 3)
        val result3 = Plus(10, 20)
        assertEquals(8, result2)
        assertEquals(30, result3)
    }

    @Test
    fun testSubtraction() {
        val result = Minus(10, 2)
        assertEquals(8, result)
        val result2 = Minus(15, 5)
        val result3 = Minus(20, 4)
        assertEquals(10, result2)
        assertEquals(16, result3)
    }

    @Test
    fun testMultiplication() {
        val result = multiply(2, 3)
        assertEquals(6, result)
        val result2 = multiply(4, 5)
        val result3 = multiply(6, 7)
        assertEquals(20, result2)
        assertEquals(42, result3)

    }

    @Test
    fun testExactDivision() {
        val result = Div(100, 2)
        assertEquals(50, result)
        val result2 = Div(50, 5)
        val result3 = Div(81, 9)
        assertEquals(10, result2)
        assertEquals(9, result3)

    }

    @Test
    fun testPower() {
        val result = power(2.0, 3.0)
        assertEquals(8, result)
        val result2 = power(3.0, 2.0)
        val result3 = power(4.0, 0.5)
        assertEquals(9, result2)
        assertEquals(2, result3)

    }

    @Test
    fun testRoot() {
        val result = square(16)
        assertEquals(4, result)
        val result2 = square(25)
        val result3 = square(36)
        assertEquals(5, result2)
        assertEquals(6, result3)
    }

    @Test
    fun testExponential() {
        val result = Operators.exp(1.0)
        assertEquals(Math.E.toInt(), result)
        val result2 = Operators.exp(2.0)
        val result3 = Operators.exp(0.0)
        assertEquals(Math.exp(2.0).toInt(), result2)
        assertEquals(1, result3)
    }

}
