package com.back

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6)

    val rst = numbers.filter { it % 2 == 0 }

    rst.forEach { println(it) }
}