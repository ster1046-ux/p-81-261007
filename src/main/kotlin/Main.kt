package com.back

fun main() {

    val name: String? = "hello"

    val rst = name?.let {
        println(it)
        it.length
    }

    val p1 = Person().let{
        it.age = 20
        it.name = "Alice"
        it.init()
        it.greet()
    }


    val p2 = Person().apply {
        // 객체를 받아서
        this.name = "John"
        age = 20
        init()

        // 객체 반환
    }

    p2.greet()

    val message: String = "Hello"
    message.also {
        println("Before : $it")
        }
        .uppercase()
        .also {
            println("After : $it")
        }

    val numbers = listOf(1,2,3,4,5,6)

    val rst2 = numbers.filter { it % 2 == 0 }
        .also { println("Before : $it") }
        .map {it * 2}
        .also { println("After : $it") }
}
