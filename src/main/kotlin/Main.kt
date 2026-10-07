package com.back

import jdk.internal.vm.vector.VectorSupport.test

object Singleton {

}
class test {

}

fun main() {

    val s1 = Singleton
    val s2 = Singleton

    println(s1)
    println(s2)
    println(s1 === s2)

    val t1 = test()
    val t2 = test()
    println(t1)
    println(t2)
    println(t1 === t2)

}

