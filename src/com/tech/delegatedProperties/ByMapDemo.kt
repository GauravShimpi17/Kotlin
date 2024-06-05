package com.tech.delegatedProperties

class UserData(private val map: Map<String, Any?>){

    val name :String by map
    val age : Int by map
}

fun main() {
    val user =  UserData(mapOf(
        "name" to "Gaurav",
        "age" to 22
    ))

    println("${user.name} -> ${user.age}")
}