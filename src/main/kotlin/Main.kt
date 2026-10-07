package com.back

fun String.greet() {
    println("Hello $this")
}

 // Int List 클래스에 square 확장 함수 추가
fun List<Int>.square(): List<Int> {
    val rst = this.map { it * it }
    return rst
}

fun main() {

    val name: String = "Alice"

    val numbers = listOf(1,2,3,4,5)

    println(numbers.square())

    println(name.length)
    println(name.uppercase())

    name.greet() // Hello~, Alice

}