package org.example


class PostfixCalculator {
    fun calculate(postfixExpression: MutableList<String>): Int{
        val stack = mutableListOf<String>()
        val operators = listOf<String>("+", "-", "*", "/", "^", "r")
        var current = ""
        var operand1 = ""
        var operand2 = ""
        while(postfixExpression.isNotEmpty()){
            current = postfixExpression.removeFirst()
            if (current == "e"){
                current = " 2.71828"
            }
            if(current !in operators){
                stack.add(current)
            }else if( current == "r"){
                operand1 = stack.removeLast()
                stack.add(getResult(operand1, operand2, current).toString())
            }else{
                operand1 = stack.removeLast()
                operand2 = stack.removeLast()
                stack.add(getResult(operand1, operand2, current).toString())
            }
        }

        return stack.removeLast().toInt()
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

fun main(){
    val calculator = PostfixCalculator()
    val list3 = mutableListOf<String>("e", "0", "^", "100", "r", "+", "29", "45", "*", "4", "1", "+", "/", "-")
    println(calculator.calculate(list3))
}