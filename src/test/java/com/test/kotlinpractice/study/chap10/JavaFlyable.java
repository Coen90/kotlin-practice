package com.test.kotlinpractice.study.chap10;

public interface JavaFlyable {

    default void act() {
        System.out.println("파닥 파닥 ");
    }
}
