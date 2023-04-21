package com.java.javaproject2_1.Week1.day5;

import com.java.javaproject2_1.PrintHello;

public class ConstantEx {
    public final int MAX_LEVEL = 3;
    public static final int MIN_LEVEL = 1;

    public static void main(String[] args) {
        final int iVal; // int 앞에 final을 붙임
        iVal = 1; // 최초의 한 번만 값을 지정 가능
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello();
        
    }
}
