package com.java.javaproject2_1.Week1.day5;

public class SpaceInvaderMemberVariable {
    int location; // 멤버변수

    public void moveLeft() {
        location = location - 1;

    }
    public void moveRight() {
        location = location + 1;

    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariable simv = new SpaceInvaderMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

        System.out.printf("최종 위치: %d\n", simv.location);

        simv.moveLeft();
        System.out.printf("최종 위치: %d\n", simv.location);
    }
}
