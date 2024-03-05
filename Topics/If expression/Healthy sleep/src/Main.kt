fun main() {    
    val lst = MutableList(3) { readln().toInt() }

    when {
        lst[2] <= lst[1] && lst[2] >= lst[0] -> println("Normal")
        lst[2] > lst[1] -> println("Excess")
        else -> println("Deficiency")
    }
}