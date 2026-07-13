package com.test.kotlinpractice.study.chap19

import kotlin.test.Test

class ConponentN {
    @Test
    fun test1() {
        val person = Person1("John", 30)
        val (name, age) = person
        println("name: $name, age: $age")
    }

    @Test
    fun test2() {
        val person = Person1("John", 30)
        val name = person.name
        val age = person.age
        println("name: $name, age: $age")
    }

    @Test
    fun test3() {
        val person = Person2("John", 30)
        val (name, age) = person
        println("name: $name, age: $age")
    }
}

data class Person1(
    val name: String,
    val age: Int
)

class Person2(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}