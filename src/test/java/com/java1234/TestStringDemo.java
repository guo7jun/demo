package com.java1234;

import org.junit.Test;

public class TestStringDemo {

    @Test
    public void removeConsecutiveChar1(){
        int count = 1;
        String string = "aabcccbbad";
        System.out.println("Input:" + string);
        System.out.println("Output:");
        StringDemo1.removeConsecutiveChar(string, count);
    }

    @Test
    public void removeConsecutiveChar2(){
        int count = 1;
        String string = "abcccbad";
        System.out.println("Input:" + string);
        System.out.println("Output:");
        StringDemo2.removeConsecutiveChar(string, count);
    }
}
