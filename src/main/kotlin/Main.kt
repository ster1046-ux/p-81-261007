package com.back

class Person(
    val name: String
) {

    fun greet() {
        println("Hello, my name is $name")
    }
}

fun main() {
    val p1 = Person("Alice")
    p1.greet()
}