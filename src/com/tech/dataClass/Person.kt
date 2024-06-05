package com.tech.dataClass

data class Person(val name:String, val age :Int)

val person = Person("Gaurav" , 22)


// destructuring of data classes
fun main() {
    val(name,age) = person
    println(name)
    println(age)
}