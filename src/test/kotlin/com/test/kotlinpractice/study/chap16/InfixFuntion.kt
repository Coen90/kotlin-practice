package com.test.kotlinpractice.study.chap16

import kotlin.test.Test

class InfixFuntion {
    @Test
    fun test1() {
        println(1.add(2))
        println(1.add2(2))
        println(1 add2 2)
    }
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}