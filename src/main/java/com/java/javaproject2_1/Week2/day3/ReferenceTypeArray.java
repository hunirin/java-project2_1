package com.java.javaproject2_1.Week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2]; // 배열 초기화
        students[0] = new Student(); // Student 클래스 초기화
        students[0].name = "이광훈"; //Student 클래스 초기화 후 가능
        students[0].phoneNumber = "010-4311-0774";
        students[0].age = 29;
        students[0].name = "호빵맨";
        students[0].phoneNumber = "010-1234-4411";
        students[0].age = 14;

    }
}
