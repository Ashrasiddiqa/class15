fun main(args: Array<String>){
    // var l1 = lamp()
    //  l1.turnOn()
    //  l1.display()
    //var p = Person("Ashra",20 )
//
    //  println("My name is ${p.firstName}")
    //  println("I am ${p.age} years old")
    //
// var p = Person()
//

    //
// println("Her name ${p.firstName}")
    //
// println("she is only ${p.age} ")
    var p = Person("Lero")
    println("His name is ${p.firstName1}")
    println("his ages is only ${p.age1}")
}
//class lamp {
// private var isOn = false
// fun turnOn(){
//     isOn = true
// }
// fun turnOff(){
//     isOn = false
// }
// fun display(){
//     println(isOn)
// }

//}
//class Person(
//    var firstName:String,
//    var age:Int

//  class Person(var firstName:String="unknown", var age:Float=2.5f)

class Person{
    var firstName1:String = ""
    var age1:Int = 2

    constructor(firstName:String,age:Int){
        this.firstName1 = firstName
        this.age1 = age
    }
    constructor()
    constructor(firstName: String){
        this.firstName1 = firstName
    }
}