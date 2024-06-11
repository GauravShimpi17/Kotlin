package com.tech.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()

    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 1
        while (i <= 5) {
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I'm sleeping ${i++} ...")
                nextPrintTime+=500L
            }
        }
    }
    delay(1300L)
    println("Job : Tired")
    job.cancelAndJoin()
    println("JOb cancelled")

}