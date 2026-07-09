package com.test.kotlinpractice.study.chap7;

import com.test.kotlinpractice.study.JavaFilePrinter;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class JavaExceptionTest {
    @Test
    void test() throws IOException {
        new JavaFilePrinter().readFile();
    }
}
