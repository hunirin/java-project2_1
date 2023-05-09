package com.java.javaproject2_1.Week4.day2;

public class Parallelogram {
    private String spaceChar = "0";

    public Parallelogram(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeALine(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h));
    }

    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(" ");
        int h = 4;
        for (int i = 0; i < h; i++) {
            System.out.print(parallelogram.makeALine(h, i));
        }
    }
}
