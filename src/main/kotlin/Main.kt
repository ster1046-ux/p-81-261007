package com.back

fun main() {

    val name1: String = "John"
    val name2: String? = null

    println(name1.length)
    if(name2 != null) {
        println(name2.length)

    }

    print(name2?.length ?: "empty name")
}