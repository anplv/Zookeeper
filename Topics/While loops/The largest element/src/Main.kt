fun main() {
    val lst = mutableListOf<Int>()

    do {
        val number = readln().toInt()
        lst.add(number)
    } while (number != 0)

    println(lst.maxOrNull())
}