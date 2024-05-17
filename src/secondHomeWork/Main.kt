package secondHomeWork

fun main() {
    println(getBack(23, 12))
    println(getBack(71, 52))
    println(getBack(33, 42))
    println(getBack(12, 10))
    println(getBack(46, 25))
}

fun getBack(age: Int, temp: Int): String {
    if (age in 20..45 && temp >= -20 && temp <= 30) return "Можно идти гулять"
    else if (age < 20 && temp >= 0 && temp <= 28) return "Можно идти гулять"
    else if (age >= 45 && temp >= -10 && temp <= 25) return "Можно идти гулять"
    else return "Оставайся дома"
}