package com.tech.inheritance

fun main() {
    val manager = Manager("Gaurav")
    println(manager.getBonus(15000))
    println(manager.getPerformanceResult("Performance is good"))
}

class Manager(nameParam:String) : Employee() {

    override var name: String = nameParam

    override fun getBonus(salary: Int): String {
        return "$name has bonus ${salary * 0.15} this year"
    }

    override fun getPerformanceResult(perfomance: String): String {
        return perfomance
    }
}