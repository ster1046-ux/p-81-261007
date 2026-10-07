package com.back

fun sayHello(name: String = "Guest") {
    println("Hello, $name")
}

fun sayHello2(name: String = "Guest", age: Int) {
    println("Hello, $name")
}

fun main() {
    sayHello() // 기본값 사용
    sayHello("Alice")

    sayHello2(age = 10) // 기본값 사용
    sayHello2("John", 10)
}

