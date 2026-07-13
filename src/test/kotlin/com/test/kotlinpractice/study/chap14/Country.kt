package com.test.kotlinpractice.study.chap14

import org.junit.jupiter.api.Test

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}


enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US");
}