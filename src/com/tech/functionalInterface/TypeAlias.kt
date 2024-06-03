package com.tech.functionalInterface

typealias IntPredicate1 = (i: Int) -> Boolean

val isEven1: IntPredicate1 = { it % 2 == 0 }

fun main() {
    println("Is 7 even? - ${isEven1(7)}")
}