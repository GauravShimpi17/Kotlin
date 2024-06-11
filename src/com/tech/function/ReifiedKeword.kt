package com.tech.function

import kotlin.time.Duration

sealed class Video{
    data class Programming(val title : String, val duration: String):Video()
    data class Cooking(val title : String, val duration: String):Video()
    data class Travel(val title : String, val duration: String):Video()
}

inline fun <reified T> filter(videos:List<Video>):List<T>{
   return videos.filterIsInstance<T>()
}

fun main() {
    val videos = listOf(
        Video.Programming("Kotlin Programming" , "10.20"),
        Video.Cooking("Cooking" , "10.20"),
        Video.Travel("Travelling" , "10.20"),
        Video.Programming("Java programming" , "10.20")
    )

    val filter = filter<Video.Programming>(videos).toString()
    println(filter )
}