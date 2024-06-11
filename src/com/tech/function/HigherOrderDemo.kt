package com.tech.function

fun sum(a : Double, b : Double) : Double{
    return a + b
}

fun calculator(a : Double, b : Double, gn : (Double,Double)-> Double){
    val result = gn(a,b)
    println(result)
}

fun main() {
    val fn = ::sum
    println(fn(1.0,2.0))

    calculator(3.0,4.0, ::sum)
}