package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OperatorsTest {

    @Test
    fun testAddition() {
        val result = plus(1, 2)
        val result2 = plus(5, 3)
        val result3 = plus(10, 20)
        assertEquals(3, result)
        assertEquals(8, result2)
        assertEquals(30, result3)

    }

    @Test
    fun testSubtraction() {
        val result = minus(10, 2)
        assertEquals(8, result)
        val result2 = minus(15, 5)
        val result3 = minus(20, 4)
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
        val result = div(100, 2)
        assertEquals(50, result)
        val result2 = div(50, 5)
        val result3 = div(81, 9)
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
        val result = square(16.0)
        assertEquals(4.0, result)
        val result2 = square(25.0)
        val result3 = square(36.0)
        assertEquals(5.0, result2)
        assertEquals(6.0, result3)
    }



}
