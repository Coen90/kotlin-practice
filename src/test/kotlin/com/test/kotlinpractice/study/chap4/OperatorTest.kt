package com.test.kotlinpractice.study.chap4

import com.test.kotlinpractice.study.JavaMoney
import org.junit.jupiter.api.Test
import org.springframework.javapoet.JavaFile
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class OperatorTest {
    @Test
    fun test1() {
        val money1 = JavaMoney(2000L)
        val money2 = JavaMoney(1000L)
        if (money1 > money2) {
            println("money1 is greater than money2")
        }
    }

    @Test
    fun test2() {
        val money1 = JavaMoney(2_000L)
        val money2 = money1
        val money3 = JavaMoney(2_000L)

        assertTrue { money1 === money2 }
        assertFalse { money1 === money3 }
        assertTrue { money1 == money3 }
    }

    @Test
    fun test3() {
        if (fun1() || fun2()) {
            println("text")
        }
        if (fun2() && fun1()) {
            println("text")
        }
    }

    @Test
    fun test4() {
        val money1 = Money(1000L)
        val money2 = Money(2000L)
        val money3 = money1 + money2
        println(money3.amount)
    }
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}