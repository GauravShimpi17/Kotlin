package com.tech.function

class Person(val name :String = "no name"){
    infix fun sayHelloTO(other : Person){
        println("$name says hello to ${other.name}")
    }
}

fun main() {
    val person = Person("Gaurav")
    val person1 = Person("Hemil")

    person sayHelloTO person1
}