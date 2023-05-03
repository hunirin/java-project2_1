package com.java.javaproject2_1.babylion._230503;

public class Character {
//    멤버 변수?  클래스 안에서 선언된 변수
//    1. 클래스 변수(static 변수) - 스태틱 영역(메소드 영역)
//    2. 인스턴스 변수(전역 변수) - 힙 영역에 올라감
//    초기화 해주지 않아도 됨
//    -> 자료형에 따라서 0이나 null로 알아서 초기화 해줌
    int level;
    static final int maxLevel = 100;

    public void levelup() {
        int level = 1;
        level = level + 1;
        System.out.println("레벨업!" + level);
    }

    public void levelup2() {
        level = level + 1;
        System.out.println("레벨업: " + level);
    }
}
