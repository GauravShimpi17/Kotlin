package com.tech.dataClass

import java.awt.Component

// trying destructuring of custom method

class Points(val x: Int , val y : Int) {
    operator fun component1() = x
    operator fun component2() = y
}

val points = Points(3,5)
fun main() {
    val (x,y) = points
    println(x)
    println(y)
}