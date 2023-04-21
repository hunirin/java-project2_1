package com.java.javaproject2_1.Week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User panghun = new User();
        panghun.name = "이광훈";
        panghun.phoneNumber = "010-4311-0774";
        panghun.age = 29;

        User hoho = new User();
        hoho.name = "호빵맨";
        hoho.phoneNumber = "010-1111-2222";
        hoho.age = 2;

        System.out.printf("%s님은 성인입니까? %s\n", panghun.name, panghun.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", hoho.name, hoho.isAdult());
    }

}
