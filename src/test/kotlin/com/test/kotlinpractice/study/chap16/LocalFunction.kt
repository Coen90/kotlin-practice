package com.test.kotlinpractice.study.chap16

class LocalFunction {
}

fun createPersion(firstName: String, lastName: String): Person {
    fun isEmpty(name: String, fieldName: String) { // depth도 깊어지고 별로임..
        if (name.isEmpty()) {
            throw IllegalArgumentException("$fieldName must not be empty")
        }
    }
    isEmpty(firstName, "firstName")
    isEmpty(lastName, "lastName")

    return Person(firstName, lastName)
}

class Person(
    private val firstName: String,
    private val lastName: String
)