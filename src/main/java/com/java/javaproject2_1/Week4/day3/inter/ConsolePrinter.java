package com.java.javaproject2_1.Week4.day3.inter;

public class ConsolePrinter implements Printer2{

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
