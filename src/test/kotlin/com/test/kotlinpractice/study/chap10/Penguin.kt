package com.test.kotlinpractice.study.chap10

class Penguin(
    species: String,
    windCount: Int
) : Animal(species, 2), Swimable, Flyable {

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다! 꿱꿱")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount
}