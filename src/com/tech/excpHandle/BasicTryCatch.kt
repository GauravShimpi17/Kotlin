package com.tech.excpHandle

class TryCatch{


    fun Demo(){
        val arr = arrayOf(1,2,3)

        try {
            println("First Line")
            println(arr[7])
            println("try block last line") // line after error will not execute
        }catch (e : Exception){
            println(e.message)
        }finally {
            println("This block will always print")
        }
    }
}

fun main() {
    val demo = TryCatch()
    demo.Demo()
}