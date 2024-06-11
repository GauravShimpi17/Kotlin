package com.tech.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launch {
        printFollower()
//        delay(2000)
    }
}

private suspend fun printFollower(){
    runBlocking {
        launch {
            var fb = async { fbFollower() }
            var ig = async { InstaFollower() }
            println("Fb - ${fb.await()} and insta - ${ig.await()}")
        }
    }

}

private suspend fun fbFollower() : Int{
    delay(1000)
    return 56
}
private suspend fun InstaFollower() : Int{
    delay(1000)
    return 113
}
