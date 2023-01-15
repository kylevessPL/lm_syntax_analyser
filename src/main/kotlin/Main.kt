/**
 * @author Kacper Piasta, 249105
 *
 * difficulty level: 3
 */

import java.util.Scanner

val REGEX = "^\\d+([-+*/^]\\d+)+(;\\d+([-+*/^]\\d+)+)*$".toRegex()

fun String.isValidArithmeticExpression() = REGEX.matches(this)

fun main() = Scanner(System.`in`).use {
    while (true) {
        print("Enter a string to check if it is a valid arithmetic expression: ")
        val input = it.nextLine()
        println("Valid: ${input.isValidArithmeticExpression()}")
    }
}
