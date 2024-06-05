package com.tech.delegatedProperties

import kotlin.properties.Delegates

class PrintLarger{
    var num : Int by Delegates.vetoable(10){
        property, oldValue, newValue ->
        oldValue < newValue
    }
}

fun main() {
    val demo = PrintLarger();
    demo.num = 5
    println(demo.num)
    demo.num = 7
    println(demo.num)
    demo.num = 15
    println(demo.num)
    demo.num = 20
    println(demo.num)
}