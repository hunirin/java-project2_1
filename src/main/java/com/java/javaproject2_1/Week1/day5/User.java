package com.java.javaproject2_1.Week1.day5;

public class User {
    // 이름, 전화번호, 나이
    String name;
    String phoneNumber;
    int age;

    // 성인인지 확인하는 메소드
    boolean isAdult() {
        return age >= 18;
    }
}
