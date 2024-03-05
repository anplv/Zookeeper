// Importing required library
import kotlin.math.sqrt

fun main(args: Array<String>) {
    // Reading the integer from user
    val input = readLine()!!.toInt()

    // Perform the arithmetic operations on 'input' here
    val square = input*input
    val squareRoot = Math.sqrt(input.toDouble())
    // Prepare the output in required format and print it
    val result = "Square: $square, Square root: $squareRoot"
    println(result)
}