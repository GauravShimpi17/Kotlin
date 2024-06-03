package com.tech.controlflow

fun main() {
    doWhileDemo()
}

fun doWhileDemo() {
    var number = 4

    do {
        println("Hello + $number")
        number++
    } while (number <= 10)
}