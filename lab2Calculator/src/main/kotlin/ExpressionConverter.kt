package org.example

fun infixToPostfix( expression: String = "hi"){
    val stack = mutableListOf<Char>();
    val postfix = mutableListOf<Char>();
    val numbersOrSpace = listOf<Char>('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ')

    println(numbersOrSpace.toString())

    for (char in expression){
        when(char){
            in numbersOrSpace.toString() -> postfix.add(char)
            '(' -> stack.add(char)
            'e' -> stack.add(char)
            'r' -> stack.add(char)
            ')' -> {
                while (stack.isNotEmpty() && stack.last() != '('){
                    postfix.add(stack.removeLast())
                }
            }
            else -> {
                while (stack.isNotEmpty() && stack.last() != 'e' && stack.last() != 'r'){
                    postfix.add(stack.removeLast())

                }
               stack.add(char)
            }
    }

}

fun main() {
    infixToPostfix("1234 ")
}

