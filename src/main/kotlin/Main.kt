package com.back

fun main() {

    val name: String? = "hello"

    val rst = name?.let {
        println(it)
        it.length
    }

    println(rst)


    val p = Person().apply {
        // 객체를 받아서
        this.name = "John"
        age = 20
        init()

        // 객체 반환
    }

    p.greet()

}
