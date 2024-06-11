package com.tech.function

tailrec fun factorial(n : Int , accumulator : Int = 1) : Int{
    if (n==0) return accumulator

    return factorial(n-1, accumulator * n)
}

fun main() {
    val result = factorial(5)
    println(result)
}