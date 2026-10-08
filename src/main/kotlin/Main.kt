package com.back

class Example {
    lateinit var value : String
}

fun main() {
    val ex = Example()
    ex.value = "1234" // 작성안하면 오류 뜸 UninitializedPropertyAccessException
    println(ex.value)

}
