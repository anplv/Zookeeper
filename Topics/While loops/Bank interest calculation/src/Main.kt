fun findYears(depo: Double): Int{
    var deposit = depo
    val interestRate = 1.071
    val max = 700000
    var years = 0

    do {
        deposit *= interestRate
        years += 1
    } while (deposit < max)

    return years
}