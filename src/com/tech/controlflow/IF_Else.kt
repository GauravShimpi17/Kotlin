package com.tech.controlflow

fun maxOf(a:Int, b:Int) {
    var max = a
//single if statement
    if (a < b) max = b
    println("max = $max")
//if_else
    max = if (a > b) {
        a
    } else {
        b
    }
    println("2nd value of max is $max")
//as expression
    max = if (a > b) a else b
    println("3rd value of max is $max")

//else_if In an expression

    val maxLimit = 5
    val maxOrLimit =  if (maxLimit > a) maxLimit else if(a>b) a else b
    println("maxOrLimit value is $maxOrLimit")
}

fun main() {
    maxOf(4,3)
    println("""

    """.trimIndent())
    maxOf(4,6)
}

