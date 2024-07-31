package org.example

class PostfixCalculator {
    fun calculate(postfixExpression: MutableList<Char>): Int{
        val operators = listOf('+', '-', '*', '/', '^', 'r')
        var operand1 = ""
        var operand2 = ""
        var isOperand1 = true
        for (char in postfixExpression){
            if(char == ' ' && operand2 == ""){
                isOperand1 = false
            }
            else if(char !in operators && isOperand1) {
                operand1 = operand1 + char
            }
            else if(char !in operators && !isOperand1) {
                operand2 = operand2 + char
            }else{
                get
            }

        }
    }

    private fun getResult(operand1: String, operand2: String, operator: String): Int{
        return when (operator){
            "+" -> plus(operand1.toInt(), operand2.toInt())
            "-" -> minus(operand1.toInt(), operand2.toInt())
            "*" -> multiply(operand1.toInt(), operand2.toInt())
            "/" -> div(operand1.toInt(), operand2.toInt())
            "^" -> power(operand1.toDouble(), operand2.toDouble())
            "r" -> square(operand1.toDouble())

        }
    }
}