package com.test.kotlinpractice.study.chap8;

public class JavaMethodOverloadTest {
    public void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i < num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    public void repeat(String str) {
        repeat(str, 3, true);
    }
}
