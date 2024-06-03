package com.tech.functionalInterface

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

val isEven = IntPredicate { it % 2 == 0 }

fun main() {

    println("Is 7 even - ${isEven.accept(2)}")
    println("Is 4 even - ${isEven.accept(4)}")
    println("Is 5 even - ${isEven.accept(5)}")
}
