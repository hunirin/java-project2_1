package com.java.javaproject2_1.babylion._230426;

import java.util.Scanner;

public class UserEx {
    public static void main(String[] args) {
        // 실습 : User의 이름과 나이, 성별을 입력받아서 지정주고 출력하기
        // 이사람이 성인인지 아닌지 판별하는 메소드를 만들고 출력
        Scanner sc = new Scanner(System.in);
        User user = new User();

        String name = sc.next();
        String sex = sc.next();
        int age = sc.nextInt();


        user.name = name;
        user.sex = sex;
        user.age = age;

        user.printName();
        user.printSex();
        user.printAge();

        user.isAdult(); // 성인 판별기
    }
}
