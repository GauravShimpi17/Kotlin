package com.tech.controlflow

fun main() {
    table(5)
    table(2)
}

fun table(number: Int) {
    var index = 1;
    println("\nTable of $number ")
    while (index <= 10) {
        print(" " + (number * index))
        index++
    }
}

