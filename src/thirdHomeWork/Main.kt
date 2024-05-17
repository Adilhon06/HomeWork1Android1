package thirdHomeWork

fun main() {
    val arrayDouble = doubleArrayOf(23.3, 18.2, -2.3, 9.4, 8.3, -6.3, 6.7, 9.2, 7.7, -4.2, -5.6, 4.5, -6.9, 8.7, -2.5)
    var count = 0
    var sum = 0.0

    var negative = false

    for (number in arrayDouble) {
        if (!negative && number < 0) {
            negative = true
        }
        if (negative && number > 0) {
            sum += number
            count++
        }
    }
    println(sum / count)
}