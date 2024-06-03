package com.tech.function

fun MutableList<Int>.swap(n1: Int, n2: Int) {
    val temp = this[n1]
    this[n1] = this[n2]
    this[n2] = temp
}

fun main() {
    val list = mutableListOf(1, 2, 3)
    println("Original list: $list")

    // Swapping elements at index 1 and index 3
    list.swap(1, 2)
    println("List after swapping: $list")
}
