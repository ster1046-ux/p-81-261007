package com.back

fun main() {

   val names = listOf("Alice", "Bob", "Charlie")

    names
        .map{ "hello ${it}"}
        .forEach{println(it)}
}
