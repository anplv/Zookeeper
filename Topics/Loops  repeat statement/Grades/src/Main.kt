fun main() {
    val marks = hashMapOf(2 to 0, 3 to 0, 4 to 0, 5 to 0)

    repeat(readln().toInt()) {
        val mark = readln().toInt()
        marks.replace(mark, marks[mark]!!.plus(1))
    }

    print(marks.values.joinToString(" "))
}