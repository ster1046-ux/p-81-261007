package com.back

open class Person(
    private var _name: String,
) {
    var name: String
        set(value) {
            _name = value
        }
        get() {
            throw Exception("접근 불가")
        }
}

fun main() {
    val p1 = Person("Dmitry")
    p1.name = "Bob"

    println(p1.name)
}
