package com.tech.classes

class Point(val x: Int, val y: Int) {
    // Overloading the plus operator (+)
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main() {
    val point1 = Point(3, 4)
    val point2 = Point(-1, 2)

    // Adding two Point objects using the overloaded plus operator
    val sum = point1 + point2
    println("Sum of points: ${sum.x} ${sum.y}") // Output: Sum of points: (2, 6)
}