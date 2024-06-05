package com.tech.delegatedProperties

import kotlin.properties.Delegates

class User {
    var name : String by Delegates.observable("No value"){
        property, oldValue, newValue ->
        println("$oldValue -> $newValue")
        println(newValue)
    }
}

fun main() {
    val user = User()
    user.name = "Hemil"
    user.name = "Gaurav"
}