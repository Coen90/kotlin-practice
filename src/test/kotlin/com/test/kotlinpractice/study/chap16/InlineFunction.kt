package com.test.kotlinpractice.study.chap16

import org.junit.jupiter.api.Test

class InlineFunction {
    @Test
    fun test1() {
        1.add3(2)
//        자바코드로 변환시 아래와 같이 변환된다.
//
//        @Test
//        public final void test1() {
//            byte $this$add3$iv = 1;
//            int other$iv = 2;
//            int $i$f$add3 = 0;
//            int var10000 = $this$add3$iv + other$iv; <--- 함수 콜스택이 쌓여 생기는 오버헤드를 제거하기 위해 함수를 직접 넣어줌
//        }
    }
}

inline fun Int.add3(other: Int): Int {
    return this + other
}