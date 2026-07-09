package com.test.kotlinpractice.study.chap8;

public class JavaVariableArguments {
    public void printAll(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
