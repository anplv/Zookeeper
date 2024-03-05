fun main() {
    var number = 1
    val limit = readln().toInt()
    val lst = mutableListOf<Int>()
    while (number <= limit) {
        repeat(number) {
            lst.add(number)
        }
        number++
    }

    println(lst.slice(0 until limit).joinToString(" "))
}