package com.test.kotlinpractice.study;

import org.jetbrains.annotations.NotNull;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @NotNull
    public String getName() {
        return name;
    }
}
