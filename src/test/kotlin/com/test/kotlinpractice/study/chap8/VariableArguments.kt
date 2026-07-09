package com.test.kotlinpractice.study.chap8

import kotlin.test.Test

class VariableArguments {
    @Test
    fun test1() {
        printAll("A", "B", "C")

        val array = arrayOf("A", "B", "C")
        printAll(*array)
    }
}

fun printAll(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}