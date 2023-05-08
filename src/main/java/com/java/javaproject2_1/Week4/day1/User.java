package com.java.javaproject2_1.Week4.day1;

public class User {
    String name;
    String phoneNumber; // string 한이유 "01012345678" -> 0이 짤림
    int age;

    boolean isAdult() {
        return age >= 18;
    }
}
