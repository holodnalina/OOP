package main.kotlin.OOP

fun main() {

    val phone1 = Phone( "0932432141", "S",9)
    val phone2 = Phone( "0675554466", "R",2)
    val phone3 = Phone( "0688899988", "L",4)
    phone1.name = "Aлина"
    println(phone1.number)
    println(phone1.model)
    println(phone1.weight)
    phone1.receiveCall("Максим", "0688895959")
    phone1.getNumber()
}



class Phone {

    var name: String = "Undefined"
    val number: String
    val model: String
    val weight: Int

    fun receiveCall (name: String?) {
        println("Звонит $name")
    }

    fun receiveCall (name:String, number:String) {
        println("Звонит $name $number")
    }

    fun getNumber (){
        println("$number")
    }


    constructor() {
        this.number = ""
        this.model = ""
        this.weight = 0
    }

    constructor(number: String, model: String) {
        this.number = number
        this.model = model
        this.weight = 0
    }

    constructor(number: String, model: String, weight: Int) {
        this.number = number
        this.model = model
        this.weight = weight
    }


}