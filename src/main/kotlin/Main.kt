package com.back

open class Animal{
    open fun makeSound() {
        println("Some generic animal sound")
    }
}
class Dog : Animal(){
    override fun makeSound() {
        println("bark bark!")
    }
}
fun main() {
    val d = Dog()

    d.makeSound()
}

