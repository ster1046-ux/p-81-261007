package com.back

fun main() {
    val ages = mutableMapOf("Peter" to 24, "Clark" to 30, "Bruce" to 40)

    ages["Peter"] = 30

    for((key, value) in ages) {
        println(key)
        println(value)
    }
}