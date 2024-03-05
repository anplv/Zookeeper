fun main() {
    val year = readln().toInt()

    val result =
        (if (year % 4 == 0 && year % 100 != 0) "Leap" else if (year % 400 == 0) "Leap" else "Regular").also {

            println(it)
        }
}