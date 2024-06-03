package com.tech.classes

class Automobile(carName:String, tyres:Int, seats:Int, fuelType:String) {
//    for primary const
    init {
    println("Car name = $carName \n" +
            "No of Tyres = $tyres \n" +
            "No. of Seats = $seats \n" +
            "Fuel type = $fuelType \n")
    }
}class Automobile1(carName:String, tyres:Int, seats:Int, fuelType:String) {
//    for primary const some values are same
//    so not to write value every time we can use secondary constructor

    constructor(nameParam:String,fuelparam:String) :
            this(nameParam, 4,4,fuelparam)

    init {
    println("Automobile 1 \n" +
            "Car name = $carName \n" +
            "No of Tyres = $tyres \n" +
            "No. of Seats = $seats \n" +
            "Fuel type = $fuelType \n")
    }
}

//class Person(val pets: MutableList<Pet> = mutableListOf())

//class Pet {
//    constructor(owner: Person) {
//        owner.pets.add(this) // adds this pet to the list of its owner's pets
//    }
//}

fun main() {
    Automobile("Car1", 4,4,"Petrol")
    Automobile("Car2", 4,4,"Petrol")
    Automobile1("Car3", 4,5,"Petrol") // allow if you want to change value
    Automobile1("Car4", "Petrol") // can neglect common values if you don't want to change
}
