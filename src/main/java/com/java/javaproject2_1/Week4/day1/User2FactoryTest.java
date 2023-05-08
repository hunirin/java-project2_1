package com.java.javaproject2_1.Week4.day1;

public class User2FactoryTest {
    public static void main(String[] args) {
        User2Factory user2Factory = new User2Factory();
        User2 user2 = user2Factory.getAdultUser();
        System.out.println(user2.age);
    }
}
