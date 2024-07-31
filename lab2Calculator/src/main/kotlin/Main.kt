package org.example

import java.beans.Expression

fun main() {
    private val validator = ExpressionValidator()
    private val converter = ExpressionConverter()
    println("Bienvenido a la Mejor Calculadora del Mundo")
    var cycle = true

    while (cycle){
        print("Ingrese su cadena numeros a evaluar: ")
        val input = readLine()!!

        val areCharactersValid = validator.validateCharacters(input)
        val areParenthesesValid = validator.validateParenthesis(input)

        if(!areParenthesesValid){
            println("Expresion contiene paréntesis no balanceados")
        }

        val postFixString = converter.infixToPostfix(areParenthesesValid)





    }
}