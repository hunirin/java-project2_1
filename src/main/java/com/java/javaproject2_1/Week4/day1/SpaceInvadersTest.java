package com.java.javaproject2_1.Week4.day1;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();
        si.moveLeft();
        System.out.println(si.location);
        si.moveLeft();
        System.out.println(si.location);
    }
}
