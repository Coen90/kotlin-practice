package com.test.kotlinpractice.study.chap8

import kotlin.test.Test

class FunctionTest {

}

fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

fun max2(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun max3(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

fun max4(a: Int, b: Int) = // = 사용시 타입추론 가능
    if (a > b) {
        a
    } else {
        b
    }

fun max5(a: Int, b: Int) = if (a > b) a else b // 괄호 제거 후 한줄 선언 가능