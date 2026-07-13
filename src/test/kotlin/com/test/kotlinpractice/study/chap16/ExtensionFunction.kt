package com.test.kotlinpractice.study.chap16

import com.test.kotlinpractice.study.chap9.JavaPerson
import kotlin.test.Test

class ExtensionFunction {
    @Test
    fun test1() {
        val str = "ABC"
        println(str.lastChar())
    }
}

fun String.lastChar(): Char { // fun 확장하려는클래스.함수이름(파라미터): 리턴타입 {}
    return this[this.length - 1]
}

fun JavaPerson.isAdult(): Boolean {
    return this.age >= 20
}