package org.example

class PostfixCalculator {
    fun calculate(postfixExpression: MutableList<String>): Int{
        val operators = listOf<String>("+", "-", "*", "/", "^", "r", " ")
        var operand1 = ""
        var operand2 = ""
        while(postfixExpression.isNotEmpty()){
            operand1 = postfixExpression.removeLast();
            if(postfixExpression.last() == "r"){
                postfixExpression.removeLast();
                postfixExpression.add(getResult(operand1, operand2, "r").toString())
                continue
            }
            operand2 = postfixExpression.removeLast();
            postfixExpression.add(getResult(operand1, operand2, postfixExpression.removeLast()).toString())
        }

        return postfixExpression.removeLast().toInt()
    }

     fun getResult(operand1: String, operand2: String, operator: String): Int{
        return when (operator){
            "+" -> plus(operand1.toInt(), operand2.toInt())
            "-" -> minus(operand1.toInt(), operand2.toInt())
            "*" -> multiply(operand1.toInt(), operand2.toInt())
            "/" -> div(operand1.toInt(), operand2.toInt())
            "^" -> power(operand1.toDouble(), operand2.toDouble())
            "r" -> square(operand1.toDouble())
            else -> 0

        }
    }
}