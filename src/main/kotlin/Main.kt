package com.back

class MathUtils {
    companion object {
        val PI = 3.14
        fun square(x: Int): Int {
            return x * x
        }
    }
}

fun main() {
    MathUtils.PI
    MathUtils.square(2)

}
