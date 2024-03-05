fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    val result = setOf(num1, num2, num3).size
    println(result == 3)
}