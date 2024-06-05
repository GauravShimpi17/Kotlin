package com.tech.dataClass.inlineClass

@JvmInline
value class InlineClass(val str: String)

typealias iClass = InlineClass

@JvmInline
value class Person(val fullName: String) {
    init {
        require(fullName.isNotEmpty()) {
            "Name can not be empty"
        }
    }

    constructor( firstName : String, lastname: String) : this("$firstName $lastname") {
        require(firstName.isNotBlank()&&lastname.isNotBlank()){
            "First name and last name is required"
        }
    }

    val length : Int
        get() = fullName.length

    fun greet(){
        println("Full name of person is $fullName")
    }
}


fun main() {
    val i = iClass("Gaurav")
    println(i)
    val p1 = Person("Gaurav")
    println(p1.fullName)
}