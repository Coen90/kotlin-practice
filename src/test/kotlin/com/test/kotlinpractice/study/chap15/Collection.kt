package com.test.kotlinpractice.study.chap15

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Collection {
    @Test
    fun test1() {

        val numbers = listOf(100, 200)
        val emptyList = emptyList<Int>()

    }

    @Test
    fun test2() {
        val numbers = listOf(100, 200) // 기본 불변

        println(numbers[0])

        for (i in numbers) {
            println(i)
        }

        for ((i, v) in numbers.withIndex()) {
            println("$i $v")
        }
    }

    @Test
    @DisplayName("가변List")
    fun test3() {
        val numbers1 = mutableListOf<Int>() // ArrayList
        val numbers2 = mutableListOf(100, 200)

        numbers1.add(300)
        println(numbers1)
    }

    @Test
    fun test4() {
        val oldMap = mutableMapOf<Int, String>()
        oldMap[1] = "MONDAY" // oldMap.put(1, "MONDAY") 와 같다
        oldMap[2] = "TUESDAY"
        mapOf(1 to "MONDAY", 2 to "TUESDAY")

        for (key in oldMap.keys) {
            println(key)
            println(oldMap[key])
        }

        for (entry in oldMap.entries) {
            println(entry.key)
            println(entry.value)
        }
    }
}