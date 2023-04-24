package com.java.javaproject2_1.Week2.day1;

public class FloatNumParse {
    public static void main(String[] args) {
        String val1 = "1.5";
        String val2 = "2.5";

        System.out.println(val1 + val2); // 1.52.5 나옴 문자열로 취급

        /* Integer로 처리하면 에러가 나옴
        int result = Integer.parseInt(val1) + Integer.parseInt(val2);
        System.out.println("result = " + result);
         */

        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println("result = " + result);
    }
}
