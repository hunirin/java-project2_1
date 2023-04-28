package com.java.javaproject2_1.babylion._230426;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        // 개발에서 . 은 ~의 라고 보면 됨
        user.name = "아기사자";
        user.age = 10;

        user.printAge();
        user.printName();

    }
}
