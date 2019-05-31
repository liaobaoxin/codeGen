package com.zqb.web;

import org.junit.Test;

import java.io.IOException;

public class MyTest {

    @Test
    public void testCmd() throws IOException {
        Runtime.getRuntime().exec("cmd /c start D:\\QR.jpg");
    }
}
