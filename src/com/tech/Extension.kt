package com.tech


fun String.formtString(): String {
    return "-----------------\n $this \n -------------------"
}


fun main() {

    val abc = "abc".formtString()
    println(abc)

}