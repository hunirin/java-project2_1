package com.java.javaproject2_1.babylion._230426;

public class Study {
    public static void main(String[] args) {
        // 기본타입 > stack 영역에 쌓인다.
        // 참조타입 heap 영역에 적재된다.

        // final int number =3 ; final을 붙여 상수화시킴 (불변)
        int number = 3;
        number = 6;
        System.out.println(number);
    }
}
