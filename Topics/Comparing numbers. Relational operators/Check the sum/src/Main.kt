fun main() {
    val numbers1 = mutableListOf<Int>()
    for (i in 1..3) numbers1.add(readln().toInt())

    var result = false

    for (index in numbers1.indices) {
        val numbers2 = numbers1.toMutableList()
        numbers2.removeAt(index)

        if (numbers2.contains(20 - numbers1[index])) {

            result = true
            break
        }
    }

    println(result)

}