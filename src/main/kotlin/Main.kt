package com.back

fun main() {

    // list, mutableList
    val names = mutableListOf("Allice", "Bob", "Charlie")

    names.add("David")

    for (name in names) {
        println("Hello $name")
    }

}