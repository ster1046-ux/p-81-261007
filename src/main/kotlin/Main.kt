package com.back

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val number = 11
    var message = "Hello, Java!"

    println("Number: ${number}")
    println("Message: ${message}")

    val str = if(number % 2 == 0) "Even" else "Odd"
    println(str)
}