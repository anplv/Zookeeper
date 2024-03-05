fun main() {
    val lst = listOf(readln().toInt(), readln().toInt(), readln().toInt())
    println(lst == lst.sorted().reversed() || lst == lst.sorted())
}
