package com.back

class Person {

    var name: String = ""
    var age: Int = 0

    fun greet() {
        println("Hello, my name is $name, and I am $age years old")
    }

    fun init() {
        println("초기화 작업")
    }
}
