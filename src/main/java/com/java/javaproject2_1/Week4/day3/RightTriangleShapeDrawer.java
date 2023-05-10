package com.java.javaproject2_1.Week4.day3;

public class RightTriangleShapeDrawer extends ShapeDrawer2{

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rts = new RightTriangleShapeDrawer();
        rts.printShape(5);
    }
}
