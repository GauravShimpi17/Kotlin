package com.tech.function

fun Any?.checkNull() : String{
    return if (this == null){
        "Its null"
    }else "Not Null"

}

fun main() {
    val nullableString: String? = "hello"
    val nullString: String? = null

    println(nullableString.checkNull())
    println(nullString.checkNull())
}

//fun String?.capitalizeLetter() : String?{
//    return this?.let {  }
//}