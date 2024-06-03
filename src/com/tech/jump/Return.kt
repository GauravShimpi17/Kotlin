package com.tech.jump

fun main() {
    foo()
    foo1()
    foo2()
    foo3()
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return

    }
    println("Check if executed ")
}
// Statement not executed because return statement exits from foo function
fun foo1() {
    run abc@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@abc
        }
    }
    println("exited from run function foo1 ")
}

// Its is more convenient to use implicit labels eg. @forEach

fun foo2() {
    run {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach // implicit labels

        }
    }
    println("exited from run function foo2 ")
}

/*We can use anonymous function also, so that it will get to its nearest function
and not exit outer function
 */

fun foo3(){
    listOf(1,2,3,4,5).forEach(fun(value:Int){
        if (value == 3 )return
        print(value)
    })
    println(" Exit from foo3 inner anonymous function")
}