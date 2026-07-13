package com.test.kotlinpractice.study.chap14

import org.junit.jupiter.api.Test

class PersonDtoTest {
    @Test
    fun test() {
        val personDto1 = PersonDto("John", 30)
        val personDto2 = PersonDto("John", 30)
        val personDto3 = personDto1
        println(personDto1 == personDto2)
        println(personDto1 === personDto2)
        println(personDto1 === personDto3)
        println(personDto1)
    }
}

data class PersonDto(
    val name: String,
    val age: Int
)