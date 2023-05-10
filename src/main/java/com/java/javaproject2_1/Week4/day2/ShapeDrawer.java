package com.java.javaproject2_1.Week4.day2;

public abstract class ShapeDrawer {

    public void printShape(int height) {

        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public abstract String makeALine (int h, int i);
}
