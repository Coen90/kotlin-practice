package com.test.kotlinpractice.study.chap17

import com.test.kotlinpractice.study.chap17.Fruit
import kotlin.test.Test

class Lambda {
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

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    private fun filterFruits(
        fruits: List<Fruit>,
        filter: (Fruit) -> Boolean
    ): List<Fruit> {
        val results = mutableListOf<Fruit>()
        for (fruit in fruits) {
            if (filter(fruit)) {
                results.add(fruit)
            }
        }
        return results
    }

    @Test
    fun test1() {
        println(isApple(fruits[0]))
        println(isApple.invoke(fruits[0]))
        println(isApple2(fruits[0]))
        println(isApple2.invoke(fruits[0]))

        println(filterFruits(fruits, isApple))
        println(filterFruits(fruits, isApple2))

        // 함수를 직접 넣을 수 있다
        println(filterFruits(fruits, fun(fruit: Fruit): Boolean {
            return fruit.name == "사과"
        }))
        println(filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" }))

        println(filterFruits(fruits, { fruit: Fruit ->
            if (fruit.name.isEmpty()) {
                return@filterFruits fruit.name == "" // 람다 결과를 return 하는 경우 `return@호출함수명 결과` 와 같이 선언한다.
            }
            fruit.name == "사과" // 람다는 return이 없는 경우 마지막 줄의 결과가 람다의 반환값이다.
        }))

        // 함수의 마지막 파라미터가 람다식이면 함수 바깥으로 {} 람다를 뺄 수 있다.
        filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }

        // 함수 내부에 람다 파라미터 타입이 추론 가능한 경우, 타입 선언 제거 가능
        filterFruits(fruits) { fruit -> fruit.name == "사과" }

        // 람다 파라미터가 하나인 경우 it로 줄일 수 있다. 단, 함수 호출부 코드만 봐서는 사람이 타입을 인지하기 어려우므로 위 방법을 사용하는것을 추천한다고 함
        filterFruits(fruits) { it.name == "사과" }
    }
}

data class Fruit(
    val name: String,
    val price: Long
)