package com.test.kotlinpractice.study.chap3

import com.test.kotlinpractice.study.Person
import kotlin.test.Test

class Type {
    @Test
    fun testType() {
        val number1: Int? = 4
        val number2: Long = number1?.toLong() ?: 0L
    }

    @Test
    fun test2Type() {
        printAgeIfPerson3(null)
        printAgeIfPerson3(Person("공부하는"))
    }

    @Test
    fun test3Type() {
        val person = Person("공부하는")
        println("이름: ${person.name}")
    }

    @Test
    fun test4Type() {
        val trimIndent = """
            ABC
            DEF
        """.trimIndent()
        println(trimIndent)
    }

    @Test
    fun test5Type() {
        val trimMargin = """
            |ABC
            |DEF
        """.trimMargin()
        println(trimMargin)
    }

    @Test
    fun test6Type() {
        val str = "ABC"
        println(str[0])
        println(str[2])
    }
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
//        val person = obj as Person
//        println(person.name)
        println(obj.name) // smart cast
    }
}

fun printAgeIfPerson2(obj: Any) {
    if (obj !is Person) {
        println(obj)
    }
}

fun printAgeIfPerson3(obj: Any?) {
    val person = obj as? Person
    println(person?.name)
}

