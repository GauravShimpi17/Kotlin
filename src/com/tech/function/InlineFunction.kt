package com.tech.function

fun main() {
    calculateTime { loop(700000000) }
}

// Writing inline function
inline fun calculateTime(fn: () -> Unit) {
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time to run program is ${end - start} ms")
}

fun loop(n: Long) {
    for (i in 1..n) {}
}