package com.tech.inheritance
open class Employee{

    open var name: String = ""
        set(value) {
            if (!value.isEmpty()) {
                field = value
            } else {
                throw RuntimeException("Name can not be empty")
            }
        }
    open fun getBonus(salary: Int): String {
        return "$name's salary is $salary"
    }
    open fun getPerformanceResult(perfomance:String):String{
        return perfomance
    }
}