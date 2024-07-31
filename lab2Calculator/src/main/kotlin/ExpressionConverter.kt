package org.example

class ExpressionConverter {
    fun infixToPostfix( expression: String): MutableList<Char> {
        val stack = mutableListOf<Char>();
        val postfix = mutableListOf<Char>();
        val numbersOrSpace = listOf<Char>('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'e',' ')


        for (char in expression) {
            when (char) {
                in numbersOrSpace -> postfix.add(char)
                '(' -> stack.add(char)
                'r' -> stack.add(char)
                '^' -> stack.add(char)
                ')' -> {
                    while (stack.isNotEmpty() && stack.last() != '(') {
                        postfix.add(stack.removeLast())
                    }
                    stack.removeLast()
                }

                else -> {
                    while (stack.isNotEmpty() && getPrecedence(char) <= getPrecedence(stack.last())) {
                        postfix.add(stack.removeLast())

                    }
                    stack.add(char)
                }
            }

        }

        while (stack.isNotEmpty()){
            postfix.add(stack.removeLast())

        }

        return postfix;
    }

    private fun getPrecedence(char: Char): Int{
        return when (char) {
            '+' -> 1;
            '-' -> 1;
            '*' -> 2;
            '/' -> 2;
            '^' -> 3;
            'r' -> 3;
            else -> 0;
        }
    }
}

fun main(){
    val expressionConverter = ExpressionConverter()
    val postfixTest = expressionConverter.infixToPostfix("3 - 4 * 9")
    println(postfixTest)
}


