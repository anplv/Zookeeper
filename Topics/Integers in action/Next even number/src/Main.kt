fun main() {
    // put your code here
    val number = readln().toInt()
    for (myNumber in number + 1..number + 2) {
        if (myNumber % 2 == 0) println(myNumber)
    }
}