package main.kotlin.OOP

fun main() {
    val array1 = Matrix(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 2, 2)
    val array2 = Matrix(arrayOf(intArrayOf(10, 10), intArrayOf(10, 10)), 2, 2)
    array1.print()
    array2.print()

}
class Matrix(val matrix: Array<IntArray>, val rows: Int, val columns: Int) {
    fun print() {
        for (row in matrix) {
            for (column in row) {
                print("$column  ")
            }
            println()
        }
    }
}