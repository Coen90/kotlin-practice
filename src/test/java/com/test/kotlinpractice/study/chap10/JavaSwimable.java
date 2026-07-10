package com.test.kotlinpractice.study.chap10;

public interface JavaSwimable {

    default void act() {
        System.out.println("어푸 어푸");
    }
}
