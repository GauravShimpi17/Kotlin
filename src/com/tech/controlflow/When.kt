package com.tech.controlflow

fun main() {
    animal("Horse")
    month(12)
    month(3)
    animal("bull")

}

fun animal(animal:String){
    val result = when(animal){
        "Horse"-> "Animal is horse"
        "Cat" -> "Animal is cat"
        "Dog" -> "Animal is Dog"
        else -> "There is no com.tech.controlflow.animal"
    }
    println(result)
}

fun month(month: Int){
    val month = when(month)
    {
        1 -> "January"
        2 -> "Febuary"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid number for a month"
    }
    println(month)
}