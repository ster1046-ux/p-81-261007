package com.back

fun main() {

    val names = listOf("Alice", "Bob", "Charlie")

    names.forEach (action = {name -> println(name)}) // 매개변수가 람다로 끝나면 생략가능
    names.forEach {name -> println(name)} // 매개변수 표현
    names.forEach {println(it)} // 매개변수 it으로 대체

}