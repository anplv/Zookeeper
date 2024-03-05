import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()

    val lst = x.downTo(1).toMutableList()

    print(lst.joinToString(" "))
}