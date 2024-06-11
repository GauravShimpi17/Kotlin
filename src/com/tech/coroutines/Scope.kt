package com.tech.coroutines

import kotlinx.coroutines.*

fun main() {


    runBlocking {
        delay(1000)
        val scope = CoroutineScope(Dispatchers.IO)

        scope.launch {
            println("Scope is running on -1 ${Thread.currentThread().name}")
            delay(1000) // Simulating some work
            println("Coroutine finished its work -1 ")
        }

        GlobalScope.launch(Dispatchers.Default) {
            println("Global scope" )
        }
    }
//    scope.cancel()


}