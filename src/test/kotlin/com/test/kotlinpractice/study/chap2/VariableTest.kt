package com.test.kotlinpractice.study.chap2

import com.test.kotlinpractice.study.Person
import kotlin.test.Test

class VariableTest {
    @Test
    fun test() {
        val str: String? = null
        println(str?.length ?: 0)

//        println(startsWith(null)) // 항상 실패

        val person = Person("공부하는")
        startWithA4(person.name)
    }
}

fun startWithA4(str: String): Boolean {
    return str.startsWith("A")
}

fun startWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("str is null")
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}