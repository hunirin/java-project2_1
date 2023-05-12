package com.java.javaproject2_1.Week4.day1;

public class User {
    String name;
    String phoneNumber; // string 한이유 "01012345678" -> 0이 짤림
    String password;
    int age;

    public User() {

    }

    boolean isAdult() {
        return age >= 18;
    }

    public String getPassword() {
        // -> 접근 제어 로직
        return password;
    }

    public void setPassword(String password) {
        // -> 본인 확인 로직
        this.password = password;
    }

    // alt+insert: constructor(생성자) 생성


    public User(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    // Getter 생성
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    // Setter 생성

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
