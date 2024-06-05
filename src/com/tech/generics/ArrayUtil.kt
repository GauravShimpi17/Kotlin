package com.tech.generics

class ArrayUtil<T>(private val array: Array<T>) {
    fun fidElement(element : T, foundElement :(index: Int, element : T?) -> Unit){
        for (i in array.indices){
            if (array[i] == element){
                foundElement(i, array[i])
                return
            }
        }
        foundElement(-1, null)
        return
    }
}

fun main() {
    val arrayUtil = ArrayUtil<Int>(arrayOf(1,2,3,4,5,6))
    arrayUtil.fidElement(4){index, element ->
        println("index -> $index")
        println("element -> $element")
    }
}