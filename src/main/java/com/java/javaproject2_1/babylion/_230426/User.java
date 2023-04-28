package com.java.javaproject2_1.babylion._230426;

public class User {
    String name;
    int age;
    String sex;
    public void printAge() {
        System.out.println(age);
    }

    public void printName() {
        System.out.println(name);
    }
    public void printSex() {
        System.out.println(sex);
    }
    public void isAdult() {
        // 18세 이상이면 성인이다.
        if(age >= 18) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
