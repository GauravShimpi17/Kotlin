package com.tech.classes

fun main() {
    val p1 = Person1("Hemil", 21)
    println(p1.name)
//    p1.name = "Gaurav"
    println(p1.name)
    println(p1.age)
    p1.age = 23
//    p1.age = -12
    println(p1.age)
}

class Person1(nameParam: String, ageParam: Int) {

    val name: String = nameParam
        get() {
            return field.uppercase()
        }
    var age = ageParam
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Age can not be negative")
            }
        }
}