package com.tech.function

fun main() {
    println("This program checks how to write custom extensions".formattedString())
}

//Writing custom method in String object
fun String.formattedString():String{
    return "----------------------------------" +
            "\n $this \n" +
            "----------------------------------"
}