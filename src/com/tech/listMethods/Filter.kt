package com.tech.listMethods

import org.w3c.dom.TypeInfo

class Filter {

    fun tryFiltre() {
        val nums = listOf(1,2,3,4,5,6,7,8,9)
        val odd = nums.filter (::isOdd)
        println("odd = $odd")

        val even = nums.filter(::isEven)
        println("even = $even")
    }

    private fun isEven(a : Int) : Boolean{
        return a % 2 == 0
    }

    private fun isOdd(a: Int): Boolean {
        return a % 2 != 0
    }
}

fun main() {
    val demo = Filter()
    println(demo.tryFiltre())
}