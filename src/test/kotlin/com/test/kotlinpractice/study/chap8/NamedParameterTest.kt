package com.test.kotlinpractice.study.chap8

import kotlin.test.Test

class MethodOverloadTest {
    @Test
    fun test1() {
        repeat("Hello", 4, false)
        println()
        println("===")
        repeat("Hello", 3, true)
        println("===")
        repeat("Hello")
        println("===")
        repeat("Hello", useNewLine = false)
        println()
    }

    @Test
    fun test2() {
        printNameAndGender("John", "Male") // 파라미터가 무슨 의미인지 확인하기 어렵
        printNameAndGender(name = "John", gender = "Male") // 빌더와 같이 어떤 파라미터의 값인지 확인하기 좋다
        printNameAndGender(gender = "Male", name = "John") // 빌더와 같이 어떤 파라미터의 값인지 확인하기 좋다
    }
}

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            System.out.println(str)
        } else {
            System.out.print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println("Name: $name, Gender: $gender")
}