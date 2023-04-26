package com.java.javaproject2_1.Week2.day3;

import com.java.javaproject2_1.PrintHello;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        // Student 타입
        Student student = new Student(); // new를 써서 Student 객체를 인스턴스로

        Student[] students = new Student[30];

        Object obj = new Student();
        Object obj2 = new PrintHello();

        // primitive type은 class가 아님

    }
}
