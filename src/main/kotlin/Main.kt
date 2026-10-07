package com.back


fun main() {
    val day = 3

    val rst = when (day) {
        1 -> "monday"
        2 -> "tuesday"
        3 -> "wednesday"
        else -> "thursday or friday or saturday or sonday"
    }
    println(rst)
}