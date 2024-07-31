package org.example

import kotlin.math.*

fun plus(num1: Int, num2: Int) = num1.plus(num2)

fun minus(num1 : Int, num2: Int) = num1.minus(num2)

fun div(num1: Int, num2: Int) = num1.div(num2)

fun multiply(num1: Int, num2: Int) = num1 * num2

fun power(num1: Double, num2: Double) = num1.pow(num2).toInt()

fun square(num1: Double) = sqrt(num1).toInt()

// FALTA EXPONENCIAL, No se como hacerlo xd


object Operators {
    fun evaluate(expression: String): Int {
        val tokens = expression.split(" ").map { it.trim() }

        var result = 0
        var i = 0
        while (i < tokens.size) {
            when (tokens[i]) {
                "+" -> result = Plus(result, tokens[i + 1].toInt())
                "-" -> result = Minus(result, tokens[i + 1].toInt())
                "*" -> result = multiply(result, tokens[i + 1].toInt())
                "/" -> result = Div(result, tokens[i + 1].toInt())
                "^" -> result = power(result.toDouble(), tokens[i + 1].toDouble())
                "sqrt" -> result = square(tokens[i + 1].toInt())
                "exp" -> result = exp(tokens[i + 1].toDouble()).toInt()
                else -> result = tokens[i].toInt()
            }
            i += 2
        }
        return result
    }

    fun exp(value: Double): Int {
        return exp(value).toInt()
    }