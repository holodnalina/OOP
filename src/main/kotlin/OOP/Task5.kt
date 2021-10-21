package main.kotlin.OOP

fun main() {
    val a = 12
    val b = 22
    val c = a..b
    val d = b..a
    if (a < b) {
        println(c)

    }
    else {
        println(d)
    }
}