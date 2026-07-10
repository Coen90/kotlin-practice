package com.test.kotlinpractice.study.chap12

import kotlin.test.Test

class PersonTest {
    @Test
    fun test1() {
        Person.newBaby("호랑이")
    }

    @Test
    fun test2() {
        Singleton.a = 10
    }

    @Test
    fun test3() {
        moveSomething(object : JavaMoveable {
            override fun move() {
                println("무브 무브")
            }

            override fun fly() {
                println("날다 날다")
            }
        })
    }
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    companion object { // static 대신
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }

//    companion object Factory : Log {
//        private const val MIN_AGE = 1
//        fun newBaby(name: String): Person {
//            return Person(name, MIN_AGE)
//        }
//
//        override fun log() {
//            println("나는 Person 클래스의 동행객체 Factory에요")
//        }
//    }
}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(moveable: JavaMoveable) {
    moveable.move()
    moveable.fly()
}