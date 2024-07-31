package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OperatorsTest {

    @Test
    fun testAddition() {
        val result = Plus(1, 2)
        assertEquals(3, result)
    }

    @Test
    fun testSubtraction() {
        val result = Minus(10, 2)
        assertEquals(8, result)
    }

    @Test
    fun testMultiplication() {
        val result = multiply(2, 3)
        assertEquals(6, result)
    }

    @Test
    fun testExactDivision() {
        val result = Div(100, 2)
        assertEquals(50, result)
    }

    @Test
    fun testPower() {
        val result = power(2.0, 3.0)
        assertEquals(8, result)
    }

    @Test
    fun testRoot() {
        val result = square(16)
        assertEquals(4, result)
    }

    @Test
    fun testExponential() {
        val result = Operators.exp(1.0)
        assertEquals(Math.E.toInt(), result)
    }

}
