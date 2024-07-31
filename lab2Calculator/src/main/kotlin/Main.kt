package org.example

fun main() {
    val validator = ExpressionValidator()
    val converter = ExpressionConverter()
    val calculator = PostfixCalculator()

    println("Bienvenido a la Mejor Calculadora del Mundo")
    var cycle = true

    while (cycle){
        print("Ingrese su cadena numeros a evaluar: ")
        val input = readLine()!!

        val areCharactersValid = validator.validateCharacters(input)
        val areParenthesesValid = validator.validateParenthesis(input)

        if(!areParenthesesValid){
            println("Expresión contiene paréntesis no balanceados")
            continue
        }
        if(!areCharactersValid){
            println("Expresión contiene caracteres no validos")
            continue
        }

        val postFixString = converter.infixToPostfix(input)

        val result = calculator.calculate(postFixString)
        println("El resultado de la expresión es: $result")

        print("Quiere evaluar otra expresión? (si/no): ")
        val response = readLine()!!
        cycle = response.lowercase() == "si"
    }
}