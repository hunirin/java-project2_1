package com.java.javaproject2_1.Week2.day2;

public class StringEqual {
    public static void main(String[] args) {
        String str1 = "GOLD";
        String str2 = "G";

        // hashcode를 이용해 주소 찾기
        System.out.println("GOLD-->" + str1.hashCode());
        System.out.println("G-->" + str2.hashCode());

        // st1번의 G와 str2번이 같은지?
        // -> 주소가 달라서 false 나옴
        boolean isSame = str1.substring(0, 1) == str2;
        System.out.println(isSame);

        // .equals를 이용했을때 -> true
        boolean isSame2 = str1.substring(0, 1) == str2;
        isSame2 = str1.substring(0, 1).equals(str2);
        System.out.println(isSame2);


    }
}
