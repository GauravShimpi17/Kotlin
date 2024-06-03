package com.tech.casting

fun main() {
    val circle = Circle(5.0)
    val drag = Player("Gaurav")

    val arr = arrayOf(circle, drag)

    for (obj in arr){
        println("Here")
        if (obj is Circle){
            println(obj.area())
        }else{
            println((obj as Player).drag())
        }
    }
}

interface Draggable {
    fun drag(): String
}

abstract class Shape : Draggable {
    abstract fun area(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
    override fun drag(): String {
        return " Drag to draw circle"
    }
}

class Player(private val name: String) : Draggable {
    override fun drag(): String {
        return "$name can drag the circle"
    }

    /*fun sayMyName(){
        println("name is $name")
    }*/

}