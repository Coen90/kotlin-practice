package com.test.kotlinpractice.study.chap7

import com.test.kotlinpractice.study.JavaFilePrinter
import kotlin.test.Test

class ExceptionTest {
    @Test
    fun test1() {
        JavaFilePrinter().readFile()
    }
}

fun parseIntOrThrow(str: String): Int {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
    }
}

fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}
