package com.java.javaproject2_1.babylion._230503;

public class Game {
    public static void main(String[] args) {
        Character character = new Character();
        character.levelup2();
        character.levelup2();
        character.levelup2();

//        new를 써서 클래스를 사용하고 나면 메모리에서 제거가 됨
//        힙 영역에서 제거가 됨
//        누가 제거해줌?? JVM에 탑재된 가바지 컬렉터가 가비지 컬렉션을 해줌
//        개발자는 오로지 개발에만 집중할 수 있음
    }
}
