package com.test.kotlinpractice.study.chap17

import org.junit.jupiter.api.assertNull
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

class FunctionalProgramming {
    val fruits = listOf(
        Fruit("", 1_000L),
        Fruit("사과", 1_000L),
        Fruit("사과", 1_200L),
        Fruit("사과", 1_200L),
        Fruit("사과", 1_500L),
        Fruit("바나나", 3_000L),
        Fruit("바나나", 3_500L),
        Fruit("바나나", 2_500L),
        Fruit("수박", 10_000L)
    )

    @Test
    fun test1() {
        filterFruits(fruits) { it.name == "사과" }
        assertFalse { fruits.all { it.name == "사과" } } // 모두 사과?
        assertTrue { fruits.none { it.name == "스크류바" } } // 스크류바 하나도 없제?
        assertTrue { fruits.any { it.name == "사과" } } // 사과 하나라도 있어?
        assertEquals(fruits.count(), 9)
        assertEquals(fruits.distinctBy { it.name }.count(), 4)
        assertEquals(fruits.first(), Fruit("", 1_000L))
        println()
    }
}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}