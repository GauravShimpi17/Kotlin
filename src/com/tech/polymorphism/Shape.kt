package com.tech.polymorphism

fun main() {
    val circle :Shape = Circle(12.0)
    val square :Shape = Square(12.0)
    println(circle.area())
    println(square.area())

    val shapes = arrayOf(Circle(13.0),Square(14.0))
//    println(shapes)
    println("-----------")
    calculateArea(shapes)
}

fun calculateArea(shapes : Array<Shape>){
    for (shape in shapes){
        println(shape.area())
    }
}

open class Shape{
    open fun area():Double{
        return 0.0
    }
}

class Circle(val radius : Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius*radius
    }
}

class Square(val side: Double):Shape(){
    override fun area(): Double {
        return side * side
    }
}