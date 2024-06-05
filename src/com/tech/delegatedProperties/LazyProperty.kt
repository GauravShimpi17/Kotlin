package com.tech.delegatedProperties

class LazyProperty {
    val prop : String by lazy {
        println("Hello")
        "Demo for lazy property"
    }
}

fun main() {
    val demo = LazyProperty();
    println(demo.prop)
    println(demo.prop)
    println(demo.prop)
}