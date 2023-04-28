package com.java.javaproject2_1.Week2.day5;

public class SwitchCaseAnotherClinic {
    public static void main(String[] args) {
        String day = "월";
        String time = "휴진";
        switch (day) {
            case "월", "화","수", "목", "금": time = "09:00 - 17:30"; break;
            case "토": time = "09:00 - 13:00"; break;
            case "일": time = "휴진"; break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
