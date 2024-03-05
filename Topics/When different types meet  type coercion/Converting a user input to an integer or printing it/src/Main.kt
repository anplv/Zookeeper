import java.util.Scanner

fun processInput(input: String) {
    // Here you would use Kotlin's built-in functions to: 
    // 1. Check if the input is a numeric string and convert it to an integer
    // 2. Check if the input is a floating-point number and convert it to an integer via truncation
    // 3. If the input is a non-numeric string or an integer, just print it as it is.
    val inputInt = input.toIntOrNull()
    val inputFloat = input.toFloatOrNull()?.toInt() ?: inputInt
    val result = inputFloat ?: input
    println(result)

}

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    val input = reader.nextLine()

    processInput(input)
}