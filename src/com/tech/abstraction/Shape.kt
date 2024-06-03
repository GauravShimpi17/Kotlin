package com.tech.abstraction

fun main() {
    val shapes = arrayOf(Circle(2.5), Square(3.0), Triangle(2.5, 3.0))
    calculateArea(shapes)

}

fun calculateArea(shapes: Array<Shape>) {
    for (shape in shapes) {
        println(shape.display())
        println(shape.area())
    }
}

abstract class Shape {
    abstract fun area(): Double
    open fun display(): String = "Shape is being displayed ->"
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double = Math.PI * radius * radius


    /*override fun display(): String {
        return "Shape is circle ->"
    }*/
}

class Square(private val side: Double) : Shape() {
    override fun area(): Double = side * side

    /*   override fun display(): String {
           return "shape is square ->"
       }*/
}

class Triangle(private val base: Double, private val height: Double) : Shape() {
    override fun area(): Double = 0.5 * base * height

    /* override fun display(): String {
         return "Shape is triangle ->"
     }
 */
}
