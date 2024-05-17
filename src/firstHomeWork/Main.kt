package firstHomeWork

const val NUM: Int = 20

fun main() {
    val someEmptyInside: String
    val  word: String = "Door"

    someEmptyInside = "$NUM $word"

    println(someEmptyInside)
    if(NUM < 0) println("Вы сохранили отрицательное число")
    else if (NUM > 0) println("Вы сохранили положительное число")
    else println("Вы сохранили нуль")
}