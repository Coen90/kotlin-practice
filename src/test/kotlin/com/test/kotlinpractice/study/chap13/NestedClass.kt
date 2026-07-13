package com.test.kotlinpractice.study.chap13

import com.test.kotlinpractice.study.chap11.add

class NestedClass {
}

class House(
    private val address: String,
    private val lovingRoom: LivingRoom
) {
//    inner class LivingRoom(
//        private val area: Double
//    ) {
//        val address: String
//            get() = this@House.address
//    }

    class LivingRoom(private val area: Double) // 중첩 클래스 기본은 static으로 생성
}