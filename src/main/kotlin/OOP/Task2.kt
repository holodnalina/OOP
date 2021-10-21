package main.kotlin.OOP

fun main() {
    val person1 = Person("Alina", 29)
    val person2 = Person()
    person2.talk()
    person2.move()
    person1.talk()
    person1.move()
}
class Person  {
    val fullName: String
    val age: Int

    fun talk() {
        println("$fullName говорит")
    }
    fun move () {
        println("$fullName двигается")
    }
    constructor(){
        this.fullName = ""
        this.age = 0
    }

    constructor(fullName: String, age: Int){
        this.fullName = fullName
        this.age = age
    }

}