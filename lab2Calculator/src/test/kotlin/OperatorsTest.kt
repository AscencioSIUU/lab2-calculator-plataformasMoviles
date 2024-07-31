package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OperatorsTest {

    @Test
    fun testAddition() {
        val result = plus(1, 2)
        assertEquals(3, result)
    }

    @Test
    fun testSubtraction() {
        val result = minus(10, 2)
        assertEquals(8, result)
    }

    @Test
    fun testMultiplication() {
        val result = multiply(2, 3)
        assertEquals(6, result)
    }

    @Test
    fun testExactDivision() {
        val result = div(100, 2)
        assertEquals(50, result)
    }

    @Test
    fun testPower() {
        val result = power(2.0, 3.0)
        assertEquals(8, result)
    }

    @Test
    fun testRoot() {
        val result = square(16.0)
        assertEquals(4.0, result)
    }



}
