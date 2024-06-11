package com.tech.function

fun main() {
    var add : (a : Int, b : Int) -> Int = ::sum1
    println(add(4,5))

    val lambda1 = {x:Int, y:Int -> x*y}
    println(lambda1(3,4))

    //single parameter lambda
    val lambda2 = {x :Int -> x*x}
    println(lambda2(2))
//  with return type
    val lambda3 : (Int) -> Int = {x -> x*x}
    println(lambda3(3))


    //single parameter lambda can be also returned as
    val lambda4 : (Int) -> Int = {it + it}
    println(lambda4(3))
}

fun sum1(a: Int , b : Int) : Int{
    return a+b
}