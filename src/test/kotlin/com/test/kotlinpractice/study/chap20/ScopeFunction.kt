package com.test.kotlinpractice.study.chap20

import com.test.kotlinpractice.study.chap19.Person1

class ScopeFunction {

}

fun printPerson(person: Person1?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun printPerson2(person: Person1?) {
    person?.let { // scope function
        println(it.name)
        println(it.age)
    }
}