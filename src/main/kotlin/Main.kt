package com.back

open class Animal {
    open fun eat() {
        println("Animal is eating")
    }
}


interface Pet {
    fun play() {
        println("Animal is playing")
    }
}

class Dog : Animal(), Pet {
    override fun play() {
    }

    override fun eat() {

    }
}

fun main() {

}
