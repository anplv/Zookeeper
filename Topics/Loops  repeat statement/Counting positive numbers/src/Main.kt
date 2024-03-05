fun main() {
    var result = 0

    repeat(readln().toInt()) { if (readln().toInt() > 0) result += 1 }

    println(result)

}