package com.tech.classes

fun main() {
    val p1 = Person("Gaurav", 22)
    val p2 = Person("Hemil", 12)
    println(p1.canVote())
    println(p2.canVote())
    if (p2.canVote()) {
        "${p2.name} can vote"
    }else {
        "${p2.name} can not vote"
    }
}

class Person(val name: String, val age: Int) {
    fun canVote(): Boolean {
        return age >= 18
    }
}