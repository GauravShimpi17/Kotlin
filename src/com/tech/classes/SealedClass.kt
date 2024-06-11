package com.tech.classes


sealed class Result{
    data class Success(val data :String) : Result()
    data class Error( val message : String) : Result()
    object Loading : Result()
}

fun processResult(result: Result){
    when(result){
        is Result.Success -> {
            println(" Result data : ${result.data}")
        }
        is Result.Error -> {
            println("Error : ${result.message}")
        }
        is Result.Loading -> {
            println("Is loading")
        }
    }
}

fun main() {
    val successResult = Result.Success("Data received successfully")
    val errorResult = Result.Error("Failed to fetch data")
    val loadingResult = Result.Loading

    processResult(successResult)
    processResult(errorResult)
    processResult(loadingResult)
}