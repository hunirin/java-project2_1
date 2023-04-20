package com.java.javaproject2_1.Week1.day4;

import com.java.javaproject2_1.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal; // 변수 선언
        iVal = 0; // 최초의 값을 주는 것 → 초기화

        PrintHello printHello; // 변수 선언
        printHello = new PrintHello(); // new를 이용해 인스턴스화 및 초기화

        System.out.println(iVal);
        printHello.print();
    }
}
