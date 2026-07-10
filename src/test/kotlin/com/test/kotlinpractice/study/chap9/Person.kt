package com.test.kotlinpractice.study.chap9

import kotlin.test.Test

class PersonTest {
    @Test
    fun test1() {
        val person = Person("John", 20)
        println(person.name)
        person.age = 10
        println(person.age)
    }

    @Test
    fun test2() {
        val person = JavaPerson("John", 20)
        println(person.name)
        person.age = 10
        println(person.age)
    }

    @Test
    fun test3() {
        val person = Person("John")
        println(person)
    }

    @Test
    fun test4() {
        val person = Person()
        println(person.name)
    }
}

class Person( // 주생성자
//    val name: String, // 일반적인 경우
    name: String, // 기본 필드의 응답값을 바꾸는 경우
    var age: Int
) {
//    val name = name
//        get() = field.uppercase() // backing field

    var name = name
        set(value) { // set을 지양하기 때문에 쓸일이 없겠다~
            field = value.uppercase()
        }

    init { // 초기화시점에 한번 호출
        if (age <= 0) {
            throw IllegalArgumentException("Age must be positive")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫번째 부생성자")
    }

    constructor(): this("홍길동") {// 부생성자
        println("두번째 부생성자")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean // custom getter
//        get() {
//            return this.age >= 20
//        }
        get() = this.age >= 20
}