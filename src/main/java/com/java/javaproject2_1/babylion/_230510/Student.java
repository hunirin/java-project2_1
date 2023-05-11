package com.java.javaproject2_1.babylion._230510;

public class Student {
    int age;
    private boolean 쇼츠() {
        return true;
    }
    private boolean 게임() {
        return true;
    }
//    1. 접근제한자 - public 어디서든 접근 가능함 (private, default, protected)
//    2. 리턴 값 - void 메소드의 반환하는 타입(자료형) > 원시타입, 참조타입
//    3. 메소드 명 - study 메소드의 이름 > 기능을 유추할 수 있게끔 네이밍

    public void study(int i) {
        쇼츠();
        게임();
        if (쇼츠() && 게임()) {
            System.out.println(i + "시간 공부함!");
        }

    }
}
