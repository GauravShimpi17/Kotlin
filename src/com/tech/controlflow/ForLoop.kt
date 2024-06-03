package com.tech.controlflow

fun main() {
    rangeDemo()
    untilDemo()
    downTODemo()
    stepDemo()
}

fun rangeDemo() {
    println("Range Demo")
    for (i in 1..10) {
        print("$i ")
    }
    println()
}

fun untilDemo() {
    println("Until demo")
    for (i in 1 until 10) {
        print("$i ")
    }
    println()
}

fun downTODemo() {
    println("DownTo demo")
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()
    for (i in 1..10){
        print("$i ")
        print("$i ")
    }
    println()
}

fun stepDemo() {
    println("Step demo")
    for (i in 0..10 step 2) {
        print("$i ")
    }
    println("\nAscending step")
    for (i in 10 downTo 0 step 2) {
        print("$i ")
    }
    println()
}
/*

fun foo3() {
    for (i in listOf(1, 2, 3, 4, 5)) {

    }
}
*/
