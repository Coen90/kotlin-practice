package com.test.kotlinpractice.study.chap5

import org.junit.jupiter.api.Test

class ConditionTest {
    @Test
    fun test1() {

    }
}

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}는 범위는 0 부터 100 입니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else {
        "C"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        //in 90..99 -> "A" --> 이렇게도 가능
        9 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "F"
    }
}

fun judgeNumber(number: Int) {
    if (number in -1..1) {
        println(" 어디서 많이 본 숫자")
    } else {
        println("-1, 0, 1이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    when (number) {
        in -1..1 -> println(" 어디서 많이 본 숫자")
        else -> println("-1, 0, 1이 아닙니다")
    }
}

fun judgeNumber3(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 0입니다")
        else -> println("주어진 숫자는 0입니다")
    }
}
